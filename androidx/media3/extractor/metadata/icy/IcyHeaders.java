package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* compiled from: PG */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3595b();

    /* renamed from: a */
    public final int f11446a;

    /* renamed from: b */
    public final String f11447b;

    /* renamed from: c */
    public final String f11448c;

    /* renamed from: d */
    public final String f11449d;

    /* renamed from: e */
    public final boolean f11450e;

    /* renamed from: f */
    public final int f11451f;

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        C2601a.m6830b(z2);
        this.f11446a = i;
        this.f11447b = str;
        this.f11448c = str2;
        this.f11449d = str3;
        this.f11450e = z;
        this.f11451f = i2;
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public final void mo6067b(C2592as asVar) {
        String str = this.f11448c;
        if (str != null) {
            asVar.f7181t = str;
        }
        String str2 = this.f11447b;
        if (str2 != null) {
            asVar.f7180s = str2;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ byte[] mo6068c() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            return this.f11446a == icyHeaders.f11446a && C2612ak.m6951aa(this.f11447b, icyHeaders.f11447b) && C2612ak.m6951aa(this.f11448c, icyHeaders.f11448c) && C2612ak.m6951aa(this.f11449d, icyHeaders.f11449d) && this.f11450e == icyHeaders.f11450e && this.f11451f == icyHeaders.f11451f;
        }
    }

    public final int hashCode() {
        int i = (this.f11446a + 527) * 31;
        String str = this.f11447b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11448c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11449d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f11450e ? 1 : 0)) * 31) + this.f11451f;
    }

    public final String toString() {
        String str = this.f11448c;
        String str2 = this.f11447b;
        int i = this.f11446a;
        int i2 = this.f11451f;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i + ", metadataInterval=" + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11446a);
        parcel.writeString(this.f11447b);
        parcel.writeString(this.f11448c);
        parcel.writeString(this.f11449d);
        C2612ak.m6943Z(parcel, this.f11450e);
        parcel.writeInt(this.f11451f);
    }

    public IcyHeaders(Parcel parcel) {
        this.f11446a = parcel.readInt();
        this.f11447b = parcel.readString();
        this.f11448c = parcel.readString();
        this.f11449d = parcel.readString();
        this.f11450e = C2612ak.m6960aj(parcel);
        this.f11451f = parcel.readInt();
    }
}
