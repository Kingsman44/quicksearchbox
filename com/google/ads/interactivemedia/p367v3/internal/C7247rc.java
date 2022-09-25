package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rc */
/* compiled from: PG */
public final class C7247rc implements C7242qy {
    public static final Parcelable.Creator CREATOR = new C7246rb();

    /* renamed from: f */
    private static final C6864cy f23680f;

    /* renamed from: g */
    private static final C6864cy f23681g;

    /* renamed from: a */
    public final String f23682a;

    /* renamed from: b */
    public final String f23683b;

    /* renamed from: c */
    public final long f23684c;

    /* renamed from: d */
    public final long f23685d;

    /* renamed from: e */
    public final byte[] f23686e;

    /* renamed from: h */
    private int f23687h;

    static {
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae("application/id3");
        f23680f = cxVar.mo15625a();
        C6863cx cxVar2 = new C6863cx();
        cxVar2.mo15630ae("application/x-scte35");
        f23681g = cxVar2.mo15625a();
    }

    public C7247rc(Parcel parcel) {
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23682a = readString;
        this.f23683b = parcel.readString();
        this.f23684c = parcel.readLong();
        this.f23685d = parcel.readLong();
        this.f23686e = (byte[]) aeu.m18536f(parcel.createByteArray());
    }

    public C7247rc(String str, String str2, long j, long j2, byte[] bArr) {
        this.f23682a = str;
        this.f23683b = str2;
        this.f23684c = j;
        this.f23685d = j2;
        this.f23686e = bArr;
    }

    /* renamed from: a */
    public final C6864cy mo16359a() {
        String str = this.f23682a;
        int hashCode = str.hashCode();
        if (hashCode != -1468477611) {
            if (hashCode != -795945609) {
                if (hashCode != 1303648457 || !str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    return null;
                }
            } else if (!str.equals("https://aomedia.org/emsg/ID3")) {
                return null;
            }
            return f23680f;
        } else if (str.equals("urn:scte:scte35:2014:bin")) {
            return f23681g;
        } else {
            return null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7247rc rcVar = (C7247rc) obj;
            return this.f23684c == rcVar.f23684c && this.f23685d == rcVar.f23685d && aeu.m18533c(this.f23682a, rcVar.f23682a) && aeu.m18533c(this.f23683b, rcVar.f23683b) && Arrays.equals(this.f23686e, rcVar.f23686e);
        }
    }

    public final int hashCode() {
        int i = this.f23687h;
        if (i != 0) {
            return i;
        }
        String str = this.f23682a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23683b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f23684c;
        long j2 = this.f23685d;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f23686e);
        this.f23687h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f23682a;
        long j = this.f23685d;
        long j2 = this.f23684c;
        String str2 = this.f23683b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23682a);
        parcel.writeString(this.f23683b);
        parcel.writeLong(this.f23684c);
        parcel.writeLong(this.f23685d);
        parcel.writeByteArray(this.f23686e);
    }
}
