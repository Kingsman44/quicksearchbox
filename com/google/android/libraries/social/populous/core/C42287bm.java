package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;

/* renamed from: com.google.android.libraries.social.populous.core.bm */
/* compiled from: PG */
final class C42287bm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DynamiteExtendedData.OrganizationInfo.CustomerInfo((DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId) parcel.readParcelable(DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DynamiteExtendedData.OrganizationInfo.CustomerInfo[0];
    }
}
