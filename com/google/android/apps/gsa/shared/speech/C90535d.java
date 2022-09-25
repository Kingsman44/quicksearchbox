package com.google.android.apps.gsa.shared.speech;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.speech.d */
/* compiled from: PG */
final class C90535d implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new HotwordDetectedEventData(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordDetectedEventData[i];
    }
}
