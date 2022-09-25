package androidx.media3.extractor;

import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2603ab;

/* renamed from: androidx.media3.extractor.b */
/* compiled from: PG */
public final class C3352b {

    /* renamed from: a */
    public static final /* synthetic */ int f10125a = 0;

    /* renamed from: b */
    private static final int[] f10126b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f10127c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static C3324a m9711a(byte[] bArr) {
        return m9712b(new C2603ab(bArr, bArr.length), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b5, code lost:
        if (r11 != 3) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00af  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.C3324a m9712b(androidx.media3.common.p136b.C2603ab r11, boolean r12) {
        /*
            int r0 = m9713c(r11)
            int r1 = m9714d(r11)
            r2 = 4
            int r3 = r11.mo6119d(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mp4a.40."
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 5
            r6 = 22
            if (r0 == r5) goto L_0x0024
            r5 = 29
            if (r0 != r5) goto L_0x0032
        L_0x0024:
            int r1 = m9714d(r11)
            int r0 = m9713c(r11)
            if (r0 != r6) goto L_0x0032
            int r3 = r11.mo6119d(r2)
        L_0x0032:
            if (r12 == 0) goto L_0x00d2
            r12 = 17
            r5 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L_0x005f
            if (r0 == r8) goto L_0x005f
            if (r0 == r9) goto L_0x005f
            if (r0 == r2) goto L_0x005f
            if (r0 == r5) goto L_0x005f
            r2 = 7
            if (r0 == r2) goto L_0x005f
            if (r0 == r12) goto L_0x005f
            switch(r0) {
                case 19: goto L_0x005f;
                case 20: goto L_0x005f;
                case 21: goto L_0x005f;
                case 22: goto L_0x005f;
                case 23: goto L_0x005f;
                default: goto L_0x004c;
            }
        L_0x004c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported audio object type: "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            androidx.media3.common.az r11 = androidx.media3.common.C2599az.m6822d(r11)
            throw r11
        L_0x005f:
            boolean r2 = r11.mo6128m()
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            androidx.media3.common.p136b.C2633u.m7050e(r2, r10)
        L_0x006c:
            boolean r2 = r11.mo6128m()
            if (r2 == 0) goto L_0x0077
            r2 = 14
            r11.mo6126k(r2)
        L_0x0077:
            boolean r2 = r11.mo6128m()
            if (r3 == 0) goto L_0x00cc
            r10 = 20
            if (r0 == r5) goto L_0x008a
            if (r0 != r10) goto L_0x0088
            r0 = 20
            r5 = 20
            goto L_0x008b
        L_0x0088:
            r5 = r0
            goto L_0x008e
        L_0x008a:
            r5 = r0
        L_0x008b:
            r11.mo6126k(r9)
        L_0x008e:
            if (r2 == 0) goto L_0x00ab
            if (r0 != r6) goto L_0x0098
            r0 = 16
            r11.mo6126k(r0)
            goto L_0x0099
        L_0x0098:
            r6 = r0
        L_0x0099:
            if (r6 == r12) goto L_0x00a5
            r12 = 19
            if (r6 == r12) goto L_0x00a5
            if (r6 == r10) goto L_0x00a5
            r12 = 23
            if (r6 != r12) goto L_0x00a8
        L_0x00a5:
            r11.mo6126k(r9)
        L_0x00a8:
            r11.mo6126k(r7)
        L_0x00ab:
            switch(r5) {
                case 17: goto L_0x00af;
                case 18: goto L_0x00ae;
                case 19: goto L_0x00af;
                case 20: goto L_0x00af;
                case 21: goto L_0x00af;
                case 22: goto L_0x00af;
                case 23: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00d2
        L_0x00af:
            int r11 = r11.mo6119d(r8)
            if (r11 == r8) goto L_0x00b8
            if (r11 == r9) goto L_0x00b9
            goto L_0x00d2
        L_0x00b8:
            r9 = r11
        L_0x00b9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported epConfig: "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            androidx.media3.common.az r11 = androidx.media3.common.C2599az.m6822d(r11)
            throw r11
        L_0x00cc:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        L_0x00d2:
            int[] r11 = f10127c
            r11 = r11[r3]
            r12 = -1
            if (r11 == r12) goto L_0x00df
            androidx.media3.extractor.a r12 = new androidx.media3.extractor.a
            r12.<init>(r1, r11, r4)
            return r12
        L_0x00df:
            r11 = 0
            androidx.media3.common.az r11 = androidx.media3.common.C2599az.m6819a(r11, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.C3352b.m9712b(androidx.media3.common.b.ab, boolean):androidx.media3.extractor.a");
    }

    /* renamed from: c */
    private static int m9713c(C2603ab abVar) {
        int d = abVar.mo6119d(5);
        return d == 31 ? abVar.mo6119d(6) + 32 : d;
    }

    /* renamed from: d */
    private static int m9714d(C2603ab abVar) {
        int d = abVar.mo6119d(4);
        if (d == 15) {
            return abVar.mo6119d(24);
        }
        if (d < 13) {
            return f10126b[d];
        }
        throw C2599az.m6819a((String) null, (Throwable) null);
    }
}
