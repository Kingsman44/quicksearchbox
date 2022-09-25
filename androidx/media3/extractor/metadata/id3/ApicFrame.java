package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3597a();

    /* renamed from: a */
    public final String f11458a;

    /* renamed from: b */
    public final String f11459b;

    /* renamed from: c */
    public final int f11460c;

    /* renamed from: d */
    public final byte[] f11461d;

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11458a = readString;
        this.f11459b = parcel.readString();
        this.f11460c = parcel.readInt();
        this.f11461d = (byte[]) C2612ak.m6927J(parcel.createByteArray());
    }

    /* renamed from: b */
    public final void mo6067b(C2592as asVar) {
        asVar.mo6098a(this.f11461d, this.f11460c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            return this.f11460c == apicFrame.f11460c && C2612ak.m6951aa(this.f11458a, apicFrame.f11458a) && C2612ak.m6951aa(this.f11459b, apicFrame.f11459b) && Arrays.equals(this.f11461d, apicFrame.f11461d);
        }
    }

    public final int hashCode() {
        int i = (this.f11460c + 527) * 31;
        String str = this.f11458a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11459b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f11461d);
    }

    public final String toString() {
        String str = this.f11481f;
        String str2 = this.f11458a;
        String str3 = this.f11459b;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11458a);
        parcel.writeString(this.f11459b);
        parcel.writeInt(this.f11460c);
        parcel.writeByteArray(this.f11461d);
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f11458a = str;
        this.f11459b = str2;
        this.f11460c = i;
        this.f11461d = bArr;
    }
}
