package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2604ac;

/* compiled from: PG */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new C3622i();

    /* renamed from: a */
    public final long f11530a;

    /* renamed from: b */
    public final long f11531b;

    public TimeSignalCommand(long j, long j2) {
        this.f11530a = j;
        this.f11531b = j2;
    }

    /* renamed from: d */
    static long m10436d(C2604ac acVar, long j) {
        long g = (long) acVar.mo6139g();
        if ((128 & g) != 0) {
            return 8589934591L & ((((g & 1) << 32) | acVar.mo6146n()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11530a);
        parcel.writeLong(this.f11531b);
    }
}
