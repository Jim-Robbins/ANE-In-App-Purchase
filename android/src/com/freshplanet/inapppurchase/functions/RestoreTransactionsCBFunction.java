package com.freshplanet.inapppurchase.functions;

import java.util.Map;

import android.util.Log;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.freshplanet.android.iap.util.Purchase;
import com.freshplanet.inapppurchase.Extension;

public class RestoreTransactionsCBFunction implements FREFunction
{
    public static final String TAG = "RestoreTransactionsCBFunction";

    @Override
    public FREObject call(FREContext context, FREObject[] args)
    {
        Log.d(TAG, "Starting Restore Transactions Callback");

        int i = 0;

        try
        {
            FREArray purchases = FREArray.newArray(Extension.inventory.mPurchaseMap.size());
            for (Map.Entry<String, Purchase> entry : Extension.inventory.mPurchaseMap.entrySet())
            {
                Purchase purchase = entry.getValue();
                purchases.setObjectAt(i, purchase.toFREObject());
                i++;
            }

            return purchases;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

}
