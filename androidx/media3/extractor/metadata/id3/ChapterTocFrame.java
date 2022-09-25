package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3600d();

    /* renamed from: a */
    public final String f11469a;

    /* renamed from: b */
    public final boolean f11470b;

    /* renamed from: c */
    public final boolean f11471c;

    /* renamed from: d */
    public final String[] f11472d;

    /* renamed from: e */
    private final Id3Frame[] f11473e;

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11469a = readString;
        boolean z = true;
        this.f11470b = parcel.readByte() != 0;
        this.f11471c = parcel.readByte() == 0 ? false : z;
        this.f11472d = (String[]) C2612ak.m6927J(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f11473e = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f11473e[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            return this.f11470b == chapterTocFrame.f11470b && this.f11471c == chapterTocFrame.f11471c && C2612ak.m6951aa(this.f11469a, chapterTocFrame.f11469a) && Arrays.equals(this.f11472d, chapterTocFrame.f11472d) && Arrays.equals(this.f11473e, chapterTocFrame.f11473e);
        }
    }

    public final int hashCode() {
        int i = ((((this.f11470b ? 1 : 0) + true) * 31) + (this.f11471c ? 1 : 0)) * 31;
        String str = this.f11469a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11469a);
        parcel.writeByte(this.f11470b ? (byte) 1 : 0);
        parcel.writeByte(this.f11471c ? (byte) 1 : 0);
        parcel.writeStringArray(this.f11472d);
        parcel.writeInt(this.f11473e.length);
        for (Id3Frame writeParcelable : this.f11473e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f11469a = str;
        this.f11470b = z;
        this.f11471c = z2;
        this.f11472d = strArr;
        this.f11473e = id3FrameArr;
    }
}
