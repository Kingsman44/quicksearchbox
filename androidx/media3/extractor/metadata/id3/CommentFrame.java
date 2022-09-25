package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;

/* compiled from: PG */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3601e();

    /* renamed from: a */
    public final String f11474a;

    /* renamed from: b */
    public final String f11475b;

    /* renamed from: c */
    public final String f11476c;

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11474a = readString;
        this.f11475b = parcel.readString();
        this.f11476c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            return C2612ak.m6951aa(this.f11475b, commentFrame.f11475b) && C2612ak.m6951aa(this.f11474a, commentFrame.f11474a) && C2612ak.m6951aa(this.f11476c, commentFrame.f11476c);
        }
    }

    public final int hashCode() {
        String str = this.f11474a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11475b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11476c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f11481f;
        String str2 = this.f11474a;
        String str3 = this.f11475b;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11481f);
        parcel.writeString(this.f11474a);
        parcel.writeString(this.f11476c);
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f11474a = str;
        this.f11475b = str2;
        this.f11476c = str3;
    }
}
