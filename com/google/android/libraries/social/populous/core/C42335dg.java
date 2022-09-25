package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.social.populous.core.dg */
/* compiled from: PG */
final class C42335dg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SessionContextRuleSet(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SessionContextRuleSet[i];
    }
}
