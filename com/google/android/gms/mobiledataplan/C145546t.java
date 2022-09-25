package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;

/* renamed from: com.google.android.gms.mobiledataplan.t */
/* compiled from: PG */
final class C145546t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MdpUpsellOfferResponse.Filter(parcel.readString(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpUpsellOfferResponse.Filter[i];
    }
}
