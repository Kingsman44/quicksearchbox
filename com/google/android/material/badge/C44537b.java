package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeState;

/* renamed from: com.google.android.material.badge.b */
/* compiled from: PG */
final class C44537b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BadgeState.State(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BadgeState.State[i];
    }
}
