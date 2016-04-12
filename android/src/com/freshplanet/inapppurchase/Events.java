package com.freshplanet.inapppurchase;

public class Events
{
    public static final String RESTORE_INFO_RECEIVED = "restoreInfoReceived";

    public static final String PRODUCT_INFO_RECEIVED = "productInfoReceived";
    public static final String PRODUCT_INFO_ERROR    = "productInfoError";

    public static final String PURCHASE_SUCCEEDED    = "purchaseSucceeded";
    public static final String PURCHASE_ERROR        = "purchaseError";
    public static final String PURCHASE_ENABLED      = "purchaseEnabled";
    public static final String PURCHASE_DISABLED     = "purchaseDisabled";

    public static final String CONSUME_SUCCEEDED     = "consumeSucceeded";

    public static final String SUBSCRIPTION_ENABLED  = "subsEnabled";
    public static final String SUBSCRIPTION_DISABLED = "subsDisabled";

    public static final String IAP_SETUP_SUCCEEDED   = "setupSucceeded";
    public static final String IAP_SETUP_FAILED      = "setupFailed";
}
