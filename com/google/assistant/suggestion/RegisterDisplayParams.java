package com.google.assistant.suggestion;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class RegisterDisplayParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C53472b();

    /* renamed from: a */
    public int f140335a;

    /* renamed from: b */
    public int f140336b;

    /* renamed from: c */
    public int f140337c;

    /* renamed from: d */
    private boolean f140338d;

    private RegisterDisplayParams() {
    }

    public RegisterDisplayParams(C53473c cVar) {
        this.f140337c = cVar.f140342d;
        this.f140335a = cVar.f140339a;
        this.f140336b = cVar.f140340b;
        this.f140338d = cVar.f140341c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.f140337c;
        int i2 = this.f140335a;
        int i3 = this.f140336b;
        return "RegisterDisplayParams: {\n  displayType: " + C53471a.m86819a(i) + "\n  numSuggestions: " + i2 + "\n  maxDisplayTextLength: " + i3 + "\n}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f140337c;
        String a = C53471a.m86819a(i2);
        if (i2 != 0) {
            parcel.writeString(a);
            parcel.writeInt(this.f140335a);
            parcel.writeInt(this.f140336b);
            parcel.writeByte(this.f140338d ? (byte) 1 : 0);
            return;
        }
        throw null;
    }
}
