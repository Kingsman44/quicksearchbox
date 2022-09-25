package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;

/* compiled from: PG */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3612b();

    /* renamed from: a */
    public final long f11506a;

    /* renamed from: b */
    public final long f11507b;

    /* renamed from: c */
    public final long f11508c;

    /* renamed from: d */
    public final long f11509d;

    /* renamed from: e */
    public final long f11510e;

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f11506a = j;
        this.f11507b = j2;
        this.f11508c = j3;
        this.f11509d = j4;
        this.f11510e = j5;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f11506a = parcel.readLong();
        this.f11507b = parcel.readLong();
        this.f11508c = parcel.readLong();
        this.f11509d = parcel.readLong();
        this.f11510e = parcel.readLong();
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
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            return this.f11506a == motionPhotoMetadata.f11506a && this.f11507b == motionPhotoMetadata.f11507b && this.f11508c == motionPhotoMetadata.f11508c && this.f11509d == motionPhotoMetadata.f11509d && this.f11510e == motionPhotoMetadata.f11510e;
        }
    }

    public final int hashCode() {
        long j = this.f11506a;
        long j2 = this.f11507b;
        long j3 = this.f11508c;
        long j4 = this.f11509d;
        long j5 = this.f11510e;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f11506a;
        long j2 = this.f11507b;
        long j3 = this.f11508c;
        long j4 = this.f11509d;
        long j5 = this.f11510e;
        return "Motion photo metadata: photoStartPosition=" + j + ", photoSize=" + j2 + ", photoPresentationTimestampUs=" + j3 + ", videoStartPosition=" + j4 + ", videoSize=" + j5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11506a);
        parcel.writeLong(this.f11507b);
        parcel.writeLong(this.f11508c);
        parcel.writeLong(this.f11509d);
        parcel.writeLong(this.f11510e);
    }
}
