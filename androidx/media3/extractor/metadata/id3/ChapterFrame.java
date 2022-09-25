package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3599c();

    /* renamed from: a */
    public final String f11463a;

    /* renamed from: b */
    public final int f11464b;

    /* renamed from: c */
    public final int f11465c;

    /* renamed from: d */
    public final long f11466d;

    /* renamed from: e */
    public final long f11467e;

    /* renamed from: g */
    private final Id3Frame[] f11468g;

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11463a = readString;
        this.f11464b = parcel.readInt();
        this.f11465c = parcel.readInt();
        this.f11466d = parcel.readLong();
        this.f11467e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f11468g = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f11468g[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            return this.f11464b == chapterFrame.f11464b && this.f11465c == chapterFrame.f11465c && this.f11466d == chapterFrame.f11466d && this.f11467e == chapterFrame.f11467e && C2612ak.m6951aa(this.f11463a, chapterFrame.f11463a) && Arrays.equals(this.f11468g, chapterFrame.f11468g);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f11464b + 527) * 31) + this.f11465c) * 31) + ((int) this.f11466d)) * 31) + ((int) this.f11467e)) * 31;
        String str = this.f11463a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11463a);
        parcel.writeInt(this.f11464b);
        parcel.writeInt(this.f11465c);
        parcel.writeLong(this.f11466d);
        parcel.writeLong(this.f11467e);
        parcel.writeInt(this.f11468g.length);
        for (Id3Frame writeParcelable : this.f11468g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f11463a = str;
        this.f11464b = i;
        this.f11465c = i2;
        this.f11466d = j;
        this.f11467e = j2;
        this.f11468g = id3FrameArr;
    }
}
