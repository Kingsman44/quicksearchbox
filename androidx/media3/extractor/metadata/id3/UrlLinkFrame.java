package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;

/* compiled from: PG */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3610n();

    /* renamed from: a */
    public final String f11494a;

    /* renamed from: b */
    public final String f11495b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UrlLinkFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f11494a = r0
            java.lang.String r3 = r3.readString()
            r2.f11495b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            return this.f11481f.equals(urlLinkFrame.f11481f) && C2612ak.m6951aa(this.f11494a, urlLinkFrame.f11494a) && C2612ak.m6951aa(this.f11495b, urlLinkFrame.f11495b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f11481f.hashCode() + 527) * 31;
        String str = this.f11494a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11495b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f11481f;
        String str2 = this.f11495b;
        return str + ": url=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11481f);
        parcel.writeString(this.f11494a);
        parcel.writeString(this.f11495b);
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f11494a = str2;
        this.f11495b = str3;
    }
}
