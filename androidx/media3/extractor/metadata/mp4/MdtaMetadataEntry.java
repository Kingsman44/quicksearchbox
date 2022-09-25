package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3611a();

    /* renamed from: a */
    public final String f11502a;

    /* renamed from: b */
    public final byte[] f11503b;

    /* renamed from: c */
    public final int f11504c;

    /* renamed from: d */
    public final int f11505d;

    public MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11502a = readString;
        this.f11503b = (byte[]) C2612ak.m6927J(parcel.createByteArray());
        this.f11504c = parcel.readInt();
        this.f11505d = parcel.readInt();
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f11502a = str;
        this.f11503b = bArr;
        this.f11504c = i;
        this.f11505d = i2;
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6067b(C2592as asVar) {
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
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            return this.f11502a.equals(mdtaMetadataEntry.f11502a) && Arrays.equals(this.f11503b, mdtaMetadataEntry.f11503b) && this.f11504c == mdtaMetadataEntry.f11504c && this.f11505d == mdtaMetadataEntry.f11505d;
        }
    }

    public final int hashCode() {
        return ((((((this.f11502a.hashCode() + 527) * 31) + Arrays.hashCode(this.f11503b)) * 31) + this.f11504c) * 31) + this.f11505d;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.f11502a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11502a);
        parcel.writeByteArray(this.f11503b);
        parcel.writeInt(this.f11504c);
        parcel.writeInt(this.f11505d);
    }
}
