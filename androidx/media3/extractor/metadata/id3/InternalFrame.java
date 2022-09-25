package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;

/* compiled from: PG */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3606j();

    /* renamed from: a */
    public final String f11482a;

    /* renamed from: b */
    public final String f11483b;

    /* renamed from: c */
    public final String f11484c;

    public InternalFrame(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11482a = readString;
        this.f11483b = parcel.readString();
        this.f11484c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            return C2612ak.m6951aa(this.f11483b, internalFrame.f11483b) && C2612ak.m6951aa(this.f11482a, internalFrame.f11482a) && C2612ak.m6951aa(this.f11484c, internalFrame.f11484c);
        }
    }

    public final int hashCode() {
        String str = this.f11482a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11483b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11484c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f11481f;
        String str2 = this.f11482a;
        String str3 = this.f11483b;
        return str + ": domain=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11481f);
        parcel.writeString(this.f11482a);
        parcel.writeString(this.f11484c);
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f11482a = str;
        this.f11483b = str2;
        this.f11484c = str3;
    }
}
