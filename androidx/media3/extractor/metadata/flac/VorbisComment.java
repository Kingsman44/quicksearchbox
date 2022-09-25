package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2612ak;

@Deprecated
/* compiled from: PG */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3593b();

    /* renamed from: a */
    public final String f11444a;

    /* renamed from: b */
    public final String f11445b;

    protected VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11444a = readString;
        this.f11445b = parcel.readString();
    }

    public VorbisComment(String str, String str2) {
        this.f11444a = str;
        this.f11445b = str2;
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6067b(androidx.media3.common.C2592as r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f11444a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L_0x0036;
                case 79833656: goto L_0x002c;
                case 428414940: goto L_0x0022;
                case 1746739798: goto L_0x0018;
                case 1939198791: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0060
            if (r0 == r5) goto L_0x005b
            if (r0 == r4) goto L_0x0056
            if (r0 == r3) goto L_0x0051
            if (r0 == r2) goto L_0x004c
            return
        L_0x004c:
            java.lang.String r0 = r6.f11445b
            r7.f7166e = r0
            return
        L_0x0051:
            java.lang.String r0 = r6.f11445b
            r7.f7165d = r0
            return
        L_0x0056:
            java.lang.String r0 = r6.f11445b
            r7.f7164c = r0
            return
        L_0x005b:
            java.lang.String r0 = r6.f11445b
            r7.f7163b = r0
            return
        L_0x0060:
            java.lang.String r0 = r6.f11445b
            r7.f7162a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.flac.VorbisComment.mo6067b(androidx.media3.common.as):void");
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
            VorbisComment vorbisComment = (VorbisComment) obj;
            return this.f11444a.equals(vorbisComment.f11444a) && this.f11445b.equals(vorbisComment.f11445b);
        }
    }

    public final int hashCode() {
        return ((this.f11444a.hashCode() + 527) * 31) + this.f11445b.hashCode();
    }

    public final String toString() {
        String str = this.f11444a;
        String str2 = this.f11445b;
        return "VC: " + str + "=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11444a);
        parcel.writeString(this.f11445b);
    }
}
