package com.google.android.libraries.gsa.monet.tools.children.shared;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class ChildData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23240i();

    /* renamed from: a */
    public final String f63674a;

    /* renamed from: b */
    public final String f63675b;

    /* renamed from: c */
    private final int f63676c;

    protected ChildData(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        int readInt = parcel.readInt();
        this.f63674a = readString;
        this.f63676c = readInt;
        this.f63675b = C23239h.m43528f(readString, readInt);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChildData)) {
            return false;
        }
        return ((ChildData) obj).f63675b.equals(this.f63675b);
    }

    public int hashCode() {
        return this.f63675b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63674a);
        parcel.writeInt(this.f63676c);
    }

    protected ChildData(String str, C23239h hVar) {
        this.f63674a = str;
        int i = hVar.f63701g;
        hVar.f63701g = i + 1;
        this.f63676c = i;
        this.f63675b = C23239h.m43528f(str, i);
    }
}
