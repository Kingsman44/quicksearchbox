package com.google.android.apps.gsa.assistant.shared;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.assistant.shared.ay */
/* compiled from: PG */
final class C73837ay implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return MorrisRunningStatus.values()[parcel.readInt()];
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MorrisRunningStatus[i];
    }
}
