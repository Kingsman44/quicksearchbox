package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class VideoInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143375bf();

    /* renamed from: d */
    private static final C143566ae f388751d = new C143566ae("VideoInfo");

    /* renamed from: a */
    public int f388752a;

    /* renamed from: b */
    public int f388753b;

    /* renamed from: c */
    public int f388754c;

    public VideoInfo(int i, int i2, int i3) {
        this.f388752a = i;
        this.f388753b = i2;
        this.f388754c = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.cast.VideoInfo m232585a(org.json.JSONObject r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.lang.String r2 = "hdrType"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ JSONException -> 0x007b }
            int r3 = r2.hashCode()     // Catch:{ JSONException -> 0x007b }
            r4 = 3218(0xc92, float:4.51E-42)
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == r4) goto L_0x0044
            r4 = 103158(0x192f6, float:1.44555E-40)
            if (r3 == r4) goto L_0x003a
            r4 = 113729(0x1bc41, float:1.59368E-40)
            if (r3 == r4) goto L_0x0030
            r4 = 99136405(0x5e8b395, float:2.1883143E-35)
            if (r3 == r4) goto L_0x0026
            goto L_0x004e
        L_0x0026:
            java.lang.String r3 = "hdr10"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 1
            goto L_0x004f
        L_0x0030:
            java.lang.String r3 = "sdr"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 3
            goto L_0x004f
        L_0x003a:
            java.lang.String r3 = "hdr"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 2
            goto L_0x004f
        L_0x0044:
            java.lang.String r3 = "dv"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = 0
            goto L_0x004f
        L_0x004e:
            r3 = -1
        L_0x004f:
            if (r3 == 0) goto L_0x0069
            if (r3 == r7) goto L_0x0068
            if (r3 == r6) goto L_0x0066
            if (r3 == r5) goto L_0x0064
            com.google.android.gms.cast.internal.ae r3 = f388751d     // Catch:{ JSONException -> 0x007b }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x007b }
            r4[r1] = r2     // Catch:{ JSONException -> 0x007b }
            java.lang.String r2 = "Unknown HDR type: %s"
            r3.mo118884b(r2, r4)     // Catch:{ JSONException -> 0x007b }
            r5 = 0
            goto L_0x0069
        L_0x0064:
            r5 = 1
            goto L_0x0069
        L_0x0066:
            r5 = 4
            goto L_0x0069
        L_0x0068:
            r5 = 2
        L_0x0069:
            com.google.android.gms.cast.VideoInfo r2 = new com.google.android.gms.cast.VideoInfo     // Catch:{ JSONException -> 0x007b }
            java.lang.String r3 = "width"
            int r3 = r8.getInt(r3)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r4 = "height"
            int r8 = r8.getInt(r4)     // Catch:{ JSONException -> 0x007b }
            r2.<init>(r3, r8, r5)     // Catch:{ JSONException -> 0x007b }
            return r2
        L_0x007b:
            r8 = move-exception
            com.google.android.gms.cast.internal.ae r2 = f388751d
            java.lang.String r3 = "Error while creating a VideoInfo instance from JSON"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.mo118885c(r8, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.VideoInfo.m232585a(org.json.JSONObject):com.google.android.gms.cast.VideoInfo");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.f388753b == videoInfo.f388753b && this.f388752a == videoInfo.f388752a && this.f388754c == videoInfo.f388754c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f388753b), Integer.valueOf(this.f388752a), Integer.valueOf(this.f388754c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f388752a);
        C143947c.m234089h(parcel, 3, this.f388753b);
        C143947c.m234089h(parcel, 4, this.f388754c);
        C143947c.m234083b(parcel, a);
    }
}
