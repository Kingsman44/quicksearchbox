package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3607k();

    /* renamed from: a */
    public final int f11485a;

    /* renamed from: b */
    public final int f11486b;

    /* renamed from: c */
    public final int f11487c;

    /* renamed from: d */
    public final int[] f11488d;

    /* renamed from: e */
    public final int[] f11489e;

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f11485a = i;
        this.f11486b = i2;
        this.f11487c = i3;
        this.f11488d = iArr;
        this.f11489e = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            return this.f11485a == mlltFrame.f11485a && this.f11486b == mlltFrame.f11486b && this.f11487c == mlltFrame.f11487c && Arrays.equals(this.f11488d, mlltFrame.f11488d) && Arrays.equals(this.f11489e, mlltFrame.f11489e);
        }
    }

    public final int hashCode() {
        return ((((((((this.f11485a + 527) * 31) + this.f11486b) * 31) + this.f11487c) * 31) + Arrays.hashCode(this.f11488d)) * 31) + Arrays.hashCode(this.f11489e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11485a);
        parcel.writeInt(this.f11486b);
        parcel.writeInt(this.f11487c);
        parcel.writeIntArray(this.f11488d);
        parcel.writeIntArray(this.f11489e);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f11485a = parcel.readInt();
        this.f11486b = parcel.readInt();
        this.f11487c = parcel.readInt();
        this.f11488d = (int[]) C2612ak.m6927J(parcel.createIntArray());
        this.f11489e = (int[]) C2612ak.m6927J(parcel.createIntArray());
    }
}
