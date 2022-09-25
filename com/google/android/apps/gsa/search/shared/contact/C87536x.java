package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.x */
/* compiled from: PG */
final class C87536x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PersonShortcut((PersonShortcutKey) PersonShortcutKey.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonShortcut[i];
    }
}
