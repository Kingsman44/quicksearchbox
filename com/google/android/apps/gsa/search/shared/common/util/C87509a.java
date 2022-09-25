package com.google.android.apps.gsa.search.shared.common.util;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.common.util.a */
/* compiled from: PG */
final class C87509a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new EventReminder(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EventReminder[i];
    }
}
