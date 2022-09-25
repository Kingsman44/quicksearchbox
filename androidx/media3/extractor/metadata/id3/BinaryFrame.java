package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3598b();

    /* renamed from: a */
    public final byte[] f11462a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BinaryFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = androidx.media3.common.p136b.C2612ak.m6927J(r3)
            byte[] r3 = (byte[]) r3
            r2.f11462a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            return this.f11481f.equals(binaryFrame.f11481f) && Arrays.equals(this.f11462a, binaryFrame.f11462a);
        }
    }

    public final int hashCode() {
        return ((this.f11481f.hashCode() + 527) * 31) + Arrays.hashCode(this.f11462a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11481f);
        parcel.writeByteArray(this.f11462a);
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f11462a = bArr;
    }
}
