package com.freshplanet.ane.AirInAppPurchase
{
	public class PurchaseItem
	{
		public var itemType:String;
		public var orderId:String;
		public var packageName:String;
		public var productId:String;
		public var purchaseTime:Number;
		public var purchaseState:int;
		public var developerPayload:String;
		public var token:String;
		public var originalJson:String;
		public var signature:String;
		
		public function PurchaseItem(productId:String, orderId:String, itemTye:String, purchaseTime:Number, purchaseState:int,
									 packageName:String, developerPayload:String, token:String, signature:String, originalJson:String)
		{
			this.productId = productId;
			this.orderId = orderId;
			this.itemType = itemTye;
			this.purchaseTime = purchaseTime;
			this.purchaseState = purchaseState;
			this.packageName = packageName;
			this.developerPayload = developerPayload;
			this.token = token;
			this.signature = signature;
			this.originalJson = originalJson;
		}
	}
}