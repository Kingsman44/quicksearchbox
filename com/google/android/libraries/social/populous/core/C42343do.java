package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.android.libraries.social.populous.core.TypeLimits;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.social.populous.core.do */
/* compiled from: PG */
final class C42343do implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TypeLimits.TypeLimitSet(C58758qx.m90644b(C42162a.m74078b(parcel, C42309ch.class)), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TypeLimits.TypeLimitSet[i];
    }
}
