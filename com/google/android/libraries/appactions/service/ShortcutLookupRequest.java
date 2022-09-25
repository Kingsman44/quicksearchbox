package com.google.android.libraries.appactions.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class ShortcutLookupRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C147862d();

    /* renamed from: a */
    public abstract String mo124518a();

    /* renamed from: b */
    public abstract String mo124519b();

    /* renamed from: c */
    public abstract String mo124520c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("1", mo124518a());
        bundle.putString("2", mo124519b());
        bundle.putString("3", mo124520c());
        parcel.writeBundle(bundle);
    }
}
