package com.google.android.libraries.web.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public abstract class WebFragmentId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C43270u();

    /* renamed from: a */
    public abstract long mo46294a();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(mo46294a());
    }

    /* renamed from: b */
    public static WebFragmentId m76222b(C44082a aVar, long j) {
        aVar.getClass();
        C58838bb.m90884s(j > 0, "Invalid WebFragmentId");
        return new AutoValue_WebFragmentId(j);
    }
}
