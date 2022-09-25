package com.google.android.libraries.componentview.services.application;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class LogData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C20596bw();

    /* renamed from: a */
    public abstract Long mo25457a();

    /* renamed from: b */
    public abstract String mo25458b();

    /* renamed from: c */
    public abstract String mo25459c();

    /* renamed from: d */
    public abstract String mo25460d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract String mo25461e();

    /* renamed from: f */
    public abstract String mo25463f();

    /* renamed from: g */
    public abstract String mo25464g();

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo25461e());
        parcel.writeString(mo25464g());
        parcel.writeString(mo25459c());
        parcel.writeString(mo25460d());
        parcel.writeString(mo25458b());
        parcel.writeString(mo25463f());
        parcel.writeValue(mo25457a());
    }
}
