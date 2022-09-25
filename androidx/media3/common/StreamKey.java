package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class StreamKey implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C2647bi();

    /* renamed from: a */
    public final int f7058a;

    /* renamed from: b */
    public final int f7059b;

    /* renamed from: c */
    public final int f7060c;

    public StreamKey() {
        this.f7058a = -1;
        this.f7059b = -1;
        this.f7060c = -1;
    }

    public StreamKey(Parcel parcel) {
        this.f7058a = parcel.readInt();
        this.f7059b = parcel.readInt();
        this.f7060c = parcel.readInt();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        StreamKey streamKey = (StreamKey) obj;
        int i = this.f7058a - streamKey.f7058a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f7059b - streamKey.f7059b;
        return i2 == 0 ? this.f7060c - streamKey.f7060c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            return this.f7058a == streamKey.f7058a && this.f7059b == streamKey.f7059b && this.f7060c == streamKey.f7060c;
        }
    }

    public final int hashCode() {
        return (((this.f7058a * 31) + this.f7059b) * 31) + this.f7060c;
    }

    public final String toString() {
        int i = this.f7058a;
        int i2 = this.f7059b;
        int i3 = this.f7060c;
        return i + "." + i2 + "." + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7058a);
        parcel.writeInt(this.f7059b);
        parcel.writeInt(this.f7060c);
    }
}
