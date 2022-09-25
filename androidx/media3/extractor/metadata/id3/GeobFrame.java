package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3602f();

    /* renamed from: a */
    public final String f11477a;

    /* renamed from: b */
    public final String f11478b;

    /* renamed from: c */
    public final String f11479c;

    /* renamed from: d */
    public final byte[] f11480d;

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11477a = readString;
        this.f11478b = parcel.readString();
        this.f11479c = parcel.readString();
        this.f11480d = (byte[]) C2612ak.m6927J(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            return C2612ak.m6951aa(this.f11477a, geobFrame.f11477a) && C2612ak.m6951aa(this.f11478b, geobFrame.f11478b) && C2612ak.m6951aa(this.f11479c, geobFrame.f11479c) && Arrays.equals(this.f11480d, geobFrame.f11480d);
        }
    }

    public final int hashCode() {
        String str = this.f11477a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11478b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11479c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f11480d);
    }

    public final String toString() {
        String str = this.f11481f;
        String str2 = this.f11477a;
        String str3 = this.f11478b;
        String str4 = this.f11479c;
        return str + ": mimeType=" + str2 + ", filename=" + str3 + ", description=" + str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11477a);
        parcel.writeString(this.f11478b);
        parcel.writeString(this.f11479c);
        parcel.writeByteArray(this.f11480d);
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f11477a = str;
        this.f11478b = str2;
        this.f11479c = str3;
        this.f11480d = bArr;
    }
}
