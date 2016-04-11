package com.freshplanet.ane.AirInAppPurchase
{
	public class ItemDetails
	{
		public var productId:String;
		public var type:String;
		public var price:String;
		public var title:String;
		public var description:String;
		public var currencyCode:String;
		
		public function ItemDetails(productId:String, type:String, price:String, title:String, description:String, currencyCode:String)
		{
			this.productId = productId;
			this.type = type;
			this.price = price;
			this.title = title;
			this.description = description;
			this.currencyCode = currencyCode;
		}
	}
}