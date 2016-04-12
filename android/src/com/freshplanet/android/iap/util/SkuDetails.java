/*
 * Copyright (c) 2012 Google Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.freshplanet.android.iap.util;

import org.json.JSONException;
import org.json.JSONObject;

import com.adobe.fre.FREASErrorException;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FRENoSuchNameException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

/**
 * Represents an in-app product's listing details.
 */
public class SkuDetails
{
    String mItemType;
    String mProductId;
    String mType;
    String mPrice;
    String mPriceCurrencyCode;
    String mTitle;
    String mDescription;
    String mJson;

    public SkuDetails(String jsonSkuDetails) throws JSONException
    {
        this(IabHelper.ITEM_TYPE_INAPP, jsonSkuDetails);
    }

    public SkuDetails(String itemType, String jsonSkuDetails) throws JSONException
    {
        mItemType = itemType;
        mJson = jsonSkuDetails;
        JSONObject o = new JSONObject(mJson);
        mProductId = o.optString("productId");
        mType = o.optString("type");
        mPrice = o.optString("price");
        mPriceCurrencyCode = o.optString("price_currency_code");
        mTitle = o.optString("title");
        mDescription = o.optString("description");
    }

    public String getSku()
    {
        return mProductId;
    }

    public String getType()
    {
        return mType;
    }

    public String getPrice()
    {
        return mPrice;
    }

    public String getPriceCurrencyCode()
    {
        return mPriceCurrencyCode;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public String getJson()
    {
        return mJson;
    }

    public FREObject toFREObject() throws FREWrongThreadException, IllegalStateException, FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException
    {
        FREObject[] args = {FREObject.newObject(this.mProductId), FREObject.newObject(this.mType), FREObject.newObject(this.mPrice), FREObject.newObject(this.mPriceCurrencyCode), FREObject.newObject(this.mTitle), FREObject.newObject(this.mDescription)};
        return FREObject.newObject("com.freshplanet.ane.AirInAppPurchase.ItemDetails", args);
    }

    @Override
    public String toString()
    {
        return "Product Details:" + mJson;
    }
}
