package com.google.android.gms.mobiledataplan.p10849a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mobiledataplan.a.a */
/* compiled from: PG */
public abstract class C145512a extends C8849b implements C145513b {
    public C145512a() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo121355a((Status) C8850c.m23492a(parcel, Status.CREATOR), (MdpCarrierPlanIdResponse) C8850c.m23492a(parcel, MdpCarrierPlanIdResponse.CREATOR));
                return true;
            case 2:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse) C8850c.m23492a(parcel, MdpDataPlanStatusResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121358d();
                return true;
            case 3:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) C8850c.m23492a(parcel, MdpUpsellOfferResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121361g();
                return true;
            case 4:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) C8850c.m23492a(parcel, MdpPurchaseOfferResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121359e();
                return true;
            case 5:
                Status status4 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo121360f();
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo121356b((Status) C8850c.m23492a(parcel, Status.CREATOR), (GetConsentInformationResponse) C8850c.m23492a(parcel, GetConsentInformationResponse.CREATOR));
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                mo121357c((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
