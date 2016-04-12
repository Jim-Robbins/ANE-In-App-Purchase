package com.freshplanet.inapppurchase.functions;

import java.util.Map;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.freshplanet.android.iap.util.SkuDetails;
import com.freshplanet.inapppurchase.Extension;

public class GetProductsInfoCBFunction implements FREFunction
{
    public static final String TAG = "GetProductsInfoCBFunction";

    @Override
    public FREObject call(FREContext arg0, FREObject[] arg1)
    {
        Extension.log("Starting Load Products Callback");

        int i = 0;

        try
        {
            FREArray products = FREArray.newArray(Extension.inventory.mSkuMap.size());
            for (Map.Entry<String, SkuDetails> entry : Extension.inventory.mSkuMap.entrySet())
            {
                SkuDetails skuDetails = entry.getValue();
                Extension.log(skuDetails.toString());
                products.setObjectAt(i, skuDetails.toFREObject());
                i++;
            }

            return products;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

}
