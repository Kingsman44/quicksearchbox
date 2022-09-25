package com.google.android.hotword.service;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class HotwordSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C146588f();

    /* renamed from: a */
    private final boolean f395929a;

    /* renamed from: b */
    private final boolean f395930b;

    /* renamed from: c */
    private final boolean f395931c;

    /* renamed from: d */
    private final boolean f395932d;

    /* renamed from: e */
    private final boolean f395933e;

    /* renamed from: f */
    private final boolean f395934f;

    protected HotwordSettings(Parcel parcel) {
        boolean z = true;
        this.f395929a = parcel.readByte() > 0;
        this.f395930b = parcel.readByte() > 0;
        this.f395931c = parcel.readByte() > 0;
        this.f395932d = parcel.readByte() > 0;
        this.f395933e = parcel.readByte() > 0;
        this.f395934f = parcel.readByte() <= 0 ? false : z;
    }

    public HotwordSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f395929a = z;
        this.f395930b = z2;
        this.f395931c = z3;
        this.f395932d = z4;
        this.f395933e = z5;
        this.f395934f = z6;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f395929a ? (byte) 1 : 0);
        parcel.writeByte(this.f395930b ? (byte) 1 : 0);
        parcel.writeByte(this.f395931c ? (byte) 1 : 0);
        parcel.writeByte(this.f395932d ? (byte) 1 : 0);
        parcel.writeByte(this.f395933e ? (byte) 1 : 0);
        parcel.writeByte(this.f395934f ? (byte) 1 : 0);
    }
}
