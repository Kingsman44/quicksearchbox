package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;

/* renamed from: com.google.android.libraries.social.populous.core.bn */
/* compiled from: PG */
final class C42288bn implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId[0];
    }
}
