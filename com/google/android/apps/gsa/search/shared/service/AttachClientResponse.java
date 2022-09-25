package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class AttachClientResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C88478d();

    /* renamed from: a */
    public final C88492m f236946a;

    /* renamed from: b */
    public final C87685am f236947b;

    public AttachClientResponse(C88492m mVar, C87685am amVar) {
        this.f236946a = mVar;
        this.f236947b = amVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f236946a.asBinder());
        parcel.writeLong(this.f236947b.f237035a);
        parcel.writeInt(this.f236947b.f237036b ? 1 : 0);
    }
}
