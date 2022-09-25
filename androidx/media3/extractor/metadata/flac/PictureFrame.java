package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.base.C58913w;
import java.util.Arrays;

/* compiled from: PG */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3592a();

    /* renamed from: a */
    public final int f11436a;

    /* renamed from: b */
    public final String f11437b;

    /* renamed from: c */
    public final String f11438c;

    /* renamed from: d */
    public final int f11439d;

    /* renamed from: e */
    public final int f11440e;

    /* renamed from: f */
    public final int f11441f;

    /* renamed from: g */
    public final int f11442g;

    /* renamed from: h */
    public final byte[] f11443h;

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f11436a = i;
        this.f11437b = str;
        this.f11438c = str2;
        this.f11439d = i2;
        this.f11440e = i3;
        this.f11441f = i4;
        this.f11442g = i5;
        this.f11443h = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.f11436a = parcel.readInt();
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11437b = readString;
        this.f11438c = parcel.readString();
        this.f11439d = parcel.readInt();
        this.f11440e = parcel.readInt();
        this.f11441f = parcel.readInt();
        this.f11442g = parcel.readInt();
        this.f11443h = (byte[]) C2612ak.m6927J(parcel.createByteArray());
    }

    /* renamed from: d */
    public static PictureFrame m10391d(C2604ac acVar) {
        int b = acVar.mo6134b();
        String s = acVar.mo6151s(acVar.mo6134b(), C58913w.f156752a);
        String s2 = acVar.mo6151s(acVar.mo6134b(), C58913w.f156754c);
        int b2 = acVar.mo6134b();
        int b3 = acVar.mo6134b();
        int b4 = acVar.mo6134b();
        int b5 = acVar.mo6134b();
        int b6 = acVar.mo6134b();
        byte[] bArr = new byte[b6];
        acVar.mo6155w(bArr, 0, b6);
        return new PictureFrame(b, s, s2, b2, b3, b4, b5, bArr);
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public final void mo6067b(C2592as asVar) {
        asVar.mo6098a(this.f11443h, this.f11436a);
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
            PictureFrame pictureFrame = (PictureFrame) obj;
            return this.f11436a == pictureFrame.f11436a && this.f11437b.equals(pictureFrame.f11437b) && this.f11438c.equals(pictureFrame.f11438c) && this.f11439d == pictureFrame.f11439d && this.f11440e == pictureFrame.f11440e && this.f11441f == pictureFrame.f11441f && this.f11442g == pictureFrame.f11442g && Arrays.equals(this.f11443h, pictureFrame.f11443h);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f11436a + 527) * 31) + this.f11437b.hashCode()) * 31) + this.f11438c.hashCode()) * 31) + this.f11439d) * 31) + this.f11440e) * 31) + this.f11441f) * 31) + this.f11442g) * 31) + Arrays.hashCode(this.f11443h);
    }

    public final String toString() {
        String str = this.f11437b;
        String str2 = this.f11438c;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11436a);
        parcel.writeString(this.f11437b);
        parcel.writeString(this.f11438c);
        parcel.writeInt(this.f11439d);
        parcel.writeInt(this.f11440e);
        parcel.writeInt(this.f11441f);
        parcel.writeInt(this.f11442g);
        parcel.writeByteArray(this.f11443h);
    }
}
