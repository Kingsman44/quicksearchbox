package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;

/* renamed from: com.google.android.libraries.social.populous.core.bk */
/* compiled from: PG */
final class C42285bk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DynamiteExtendedData.OrganizationInfo((DynamiteExtendedData.OrganizationInfo.CustomerInfo) parcel.readParcelable(DynamiteExtendedData.OrganizationInfo.CustomerInfo.class.getClassLoader()), (DynamiteExtendedData.OrganizationInfo.ConsumerInfo) parcel.readParcelable(DynamiteExtendedData.OrganizationInfo.ConsumerInfo.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DynamiteExtendedData.OrganizationInfo[0];
    }
}
