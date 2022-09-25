package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.TypeLimits;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.core.dn */
/* compiled from: PG */
final class C42342dn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TypeLimits(C58485gu.m89842j(parcel.createTypedArrayList(TypeLimits.TypeLimitSet.CREATOR)));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TypeLimits[i];
    }
}
