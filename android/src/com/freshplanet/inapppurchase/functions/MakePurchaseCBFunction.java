package com.freshplanet.inapppurchase.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.freshplanet.inapppurchase.Extension;

public class MakePurchaseCBFunction implements FREFunction
{
    public static final String TAG = "MakePurchaseCBFunction";

    @Override
    public FREObject call(FREContext arg0, FREObject[] arg1)
    {
        Extension.log(TAG + ":Starting Purchase Callback");

        try
        {
            return Extension.purchase.toFREObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

}
