package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.y */
/* compiled from: PG */
final class C87537y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        return new PersonShortcutKey(C87515c.m142148a(readString), parcel.readString(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonShortcutKey[i];
    }
}
