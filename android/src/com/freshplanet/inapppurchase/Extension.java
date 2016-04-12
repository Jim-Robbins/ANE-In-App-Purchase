// ////////////////////////////////////////////////////////////////////////////////////
//
// Copyright 2012 Freshplanet (http://freshplanet.com | opensource@freshplanet.com)
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// ////////////////////////////////////////////////////////////////////////////////////

package com.freshplanet.inapppurchase;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.freshplanet.android.iap.util.Inventory;
import com.freshplanet.android.iap.util.Purchase;

public class Extension implements FREExtension
{
    private static String          TAG = "AirInAppPurchase";

    public static ExtensionContext context;

    public static Inventory        inventory;

    public static Purchase         purchase;

    public FREContext createContext(String extId)
    {
        return context = new ExtensionContext();
    }

    public void dispose()
    {
        context = null;
    }

    public void initialize()
    {
    }

    public static void log(String message)
    {
        Log.d(TAG, message);
    }

    public static void notifyItemDataLoaded()
    {
        context.dispatchStatusEventAsync(Events.PRODUCT_INFO_RECEIVED, "Item");
    }

    public static void notifyItemDataFailed()
    {
        context.dispatchStatusEventAsync(Events.PRODUCT_INFO_ERROR, "Item");
    }

    public static void notifyPurchaseSucceeded()
    {
        context.dispatchStatusEventAsync(Events.PURCHASE_SUCCEEDED, "Purchase");
    }

    public static void notifyPurchaseFailed()
    {
        context.dispatchStatusEventAsync(Events.PURCHASE_ERROR, "Purchase");
    }

    public static void notifyPurchaseItemIsOwned()
    {
        context.dispatchStatusEventAsync(Events.PURCHASE_DISABLED, "Purchase");
    }

    public static void notifyPurchaseItemInvalid()
    {
        context.dispatchStatusEventAsync(Events.PURCHASE_DISABLED, "Purchase");
    }

    public static void notifyRestoreSucceeded()
    {
        context.dispatchStatusEventAsync(Events.RESTORE_INFO_RECEIVED, "Restore");
    }

    public static void notifyConsumeSucceeded()
    {
        context.dispatchStatusEventAsync(Events.CONSUME_SUCCEEDED, "Restore");
    }

    public static void notifySetupSucceeded(String message)
    {
        context.dispatchStatusEventAsync(Events.IAP_SETUP_SUCCEEDED, message);
    }

    public static void notifySetupFailed(String error)
    {
        context.dispatchStatusEventAsync(Events.IAP_SETUP_FAILED, error);
    }
}
