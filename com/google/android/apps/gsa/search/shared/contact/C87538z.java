package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.z */
/* compiled from: PG */
final class C87538z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Relationship(parcel.readString(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Relationship[i];
    }
}
