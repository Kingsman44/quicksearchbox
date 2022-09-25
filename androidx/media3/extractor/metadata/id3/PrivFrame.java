package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3608l();

    /* renamed from: a */
    public final String f11490a;

    /* renamed from: b */
    public final byte[] f11491b;

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11490a = readString;
        this.f11491b = (byte[]) C2612ak.m6927J(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            return C2612ak.m6951aa(this.f11490a, privFrame.f11490a) && Arrays.equals(this.f11491b, privFrame.f11491b);
        }
    }

    public final int hashCode() {
        String str = this.f11490a;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f11491b);
    }

    public final String toString() {
        String str = this.f11481f;
        String str2 = this.f11490a;
        return str + ": owner=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11490a);
        parcel.writeByteArray(this.f11491b);
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f11490a = str;
        this.f11491b = bArr;
    }
}
