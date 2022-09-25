package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;

/* compiled from: PG */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new C3614a();

    /* renamed from: a */
    public final long f11513a;

    /* renamed from: b */
    public final long f11514b;

    /* renamed from: c */
    public final byte[] f11515c;

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f11513a = j2;
        this.f11514b = j;
        this.f11515c = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f11513a = parcel.readLong();
        this.f11514b = parcel.readLong();
        this.f11515c = (byte[]) C2612ak.m6927J(parcel.createByteArray());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11513a);
        parcel.writeLong(this.f11514b);
        parcel.writeByteArray(this.f11515c);
    }
}
