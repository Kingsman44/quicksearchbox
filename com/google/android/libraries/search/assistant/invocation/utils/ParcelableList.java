package com.google.android.libraries.search.assistant.invocation.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class ParcelableList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C34723g();

    /* renamed from: a */
    public final C58485gu f92135a;

    private ParcelableList(C58485gu guVar) {
        this.f92135a = guVar;
    }

    /* renamed from: a */
    public static ParcelableList m63448a(Iterable iterable) {
        return new ParcelableList(C58485gu.m89841i(iterable));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f92135a);
    }
}
