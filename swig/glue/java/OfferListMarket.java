/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.jni.core;

public class OfferListMarket extends Storable {
  private long swigCPtr;

  protected OfferListMarket(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.OfferListMarket_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OfferListMarket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_OfferListMarket(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
// ------------------------
	/*@SWIG:swig\otapi\OTAPI.i,86,OT_CONTAINER_TYPE_MEMBERS@*/
	private List elementList = new ArrayList();
/*@SWIG@*/
	/*@SWIG:swig\otapi\OTAPI.i,163,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefBidData(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	BidData refActualElement = GetBidData(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof BidData))
			continue;

		BidData tempRef = (BidData)(theObject);
		
		if ((BidData.getCPtr(tempRef) == BidData.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefBidData(BidData element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof BidData))
			continue;
		
		BidData tempRef = (BidData)(theObject);
		
		if ((BidData.getCPtr(tempRef) == BidData.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	BidData tempLocalRef = element;
	elementList.add(tempLocalRef);
	return BidData.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
	/*@SWIG:swig\otapi\OTAPI.i,163,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefAskData(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	AskData refActualElement = GetAskData(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof AskData))
			continue;

		AskData tempRef = (AskData)(theObject);
		
		if ((AskData.getCPtr(tempRef) == AskData.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefAskData(AskData element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof AskData))
			continue;
		
		AskData tempRef = (AskData)(theObject);
		
		if ((AskData.getCPtr(tempRef) == AskData.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	AskData tempLocalRef = element;
	elementList.add(tempLocalRef);
	return AskData.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
  public long GetBidDataCount() {
    return otapiJNI.OfferListMarket_GetBidDataCount(swigCPtr, this);
  }

  public BidData GetBidData(long nIndex) {
    long cPtr = otapiJNI.OfferListMarket_GetBidData(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new BidData(cPtr, false);
  }

  public boolean RemoveBidData(long nIndexBidData) {
    return otapiJNI.OfferListMarket_RemoveBidData(swigCPtr, this, removeRefBidData(nIndexBidData));
  }

  public boolean AddBidData(BidData disownObject) {
    return otapiJNI.OfferListMarket_AddBidData(swigCPtr, this, BidData.getCPtr(disownObject), disownObject);
  }

  public long GetAskDataCount() {
    return otapiJNI.OfferListMarket_GetAskDataCount(swigCPtr, this);
  }

  public AskData GetAskData(long nIndex) {
    long cPtr = otapiJNI.OfferListMarket_GetAskData(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new AskData(cPtr, false);
  }

  public boolean RemoveAskData(long nIndexAskData) {
    return otapiJNI.OfferListMarket_RemoveAskData(swigCPtr, this, removeRefAskData(nIndexAskData));
  }

  public boolean AddAskData(AskData disownObject) {
    return otapiJNI.OfferListMarket_AddAskData(swigCPtr, this, AskData.getCPtr(disownObject), disownObject);
  }

  public static OfferListMarket ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.OfferListMarket_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new OfferListMarket(cPtr, false);
  }

}
