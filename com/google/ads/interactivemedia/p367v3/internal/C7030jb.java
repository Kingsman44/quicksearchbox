package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jb */
/* compiled from: PG */
public final class C7030jb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7029ja();

    /* renamed from: a */
    public final UUID f22530a;

    /* renamed from: b */
    public final String f22531b;

    /* renamed from: c */
    public final String f22532c;

    /* renamed from: d */
    public final byte[] f22533d;

    /* renamed from: e */
    private int f22534e;

    public C7030jb(Parcel parcel) {
        this.f22530a = new UUID(parcel.readLong(), parcel.readLong());
        this.f22531b = parcel.readString();
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f22532c = readString;
        this.f22533d = parcel.createByteArray();
    }

    /* renamed from: a */
    public final boolean mo16055a(C7030jb jbVar) {
        if (!mo16056b() || jbVar.mo16056b()) {
            return false;
        }
        return C6821bi.f21605a.equals(this.f22530a) || jbVar.f22530a.equals(this.f22530a);
    }

    /* renamed from: b */
    public final boolean mo16056b() {
        return this.f22533d != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7030jb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C7030jb jbVar = (C7030jb) obj;
        return aeu.m18533c(this.f22531b, jbVar.f22531b) && aeu.m18533c(this.f22532c, jbVar.f22532c) && aeu.m18533c(this.f22530a, jbVar.f22530a) && Arrays.equals(this.f22533d, jbVar.f22533d);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f22534e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f22530a.hashCode() * 31;
        String str = this.f22531b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.f22532c.hashCode()) * 31) + Arrays.hashCode(this.f22533d);
        this.f22534e = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22530a.getMostSignificantBits());
        parcel.writeLong(this.f22530a.getLeastSignificantBits());
        parcel.writeString(this.f22531b);
        parcel.writeString(this.f22532c);
        parcel.writeByteArray(this.f22533d);
    }

    public C7030jb(UUID uuid, String str, String str2, byte[] bArr) {
        ary.m19467t(uuid);
        this.f22530a = uuid;
        this.f22531b = str;
        ary.m19467t(str2);
        this.f22532c = str2;
        this.f22533d = bArr;
    }

    public C7030jb(UUID uuid, String str, byte[] bArr) {
        this(uuid, (String) null, str, bArr);
    }
}
