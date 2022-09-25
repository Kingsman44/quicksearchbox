package androidx.media3.exoplayer.p150j;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.j.aa */
/* compiled from: PG */
final class C3194aa extends C3228x {

    /* renamed from: e */
    public final boolean f9583e;

    /* renamed from: f */
    public final C3221q f9584f;

    /* renamed from: g */
    public final boolean f9585g;

    /* renamed from: h */
    public final boolean f9586h;

    /* renamed from: i */
    public final int f9587i;

    /* renamed from: j */
    public final int f9588j;

    /* renamed from: k */
    public final int f9589k;

    /* renamed from: l */
    public final int f9590l;

    /* renamed from: m */
    public final boolean f9591m;

    /* renamed from: n */
    public final boolean f9592n;

    /* renamed from: o */
    public final boolean f9593o;

    /* renamed from: p */
    public final int f9594p;

    /* renamed from: q */
    private final int f9595q;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r3 <= 2.14748365E9f) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r2 >= 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r2 >= 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        if (r2 >= 0.0f) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r8 >= 0) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x00b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3194aa(int r6, androidx.media3.common.C2652bn r7, int r8, androidx.media3.exoplayer.p150j.C3221q r9, int r10, boolean r11) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            r5.f9584f = r9
            boolean r6 = r9.f9676D
            r7 = 1
            if (r7 == r6) goto L_0x000d
            r6 = 16
            goto L_0x000f
        L_0x000d:
            r6 = 24
        L_0x000f:
            boolean r8 = r9.f9675C
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = -1
            r1 = 0
            if (r11 == 0) goto L_0x003b
            androidx.media3.common.x r2 = r5.f9707d
            int r3 = r2.f7501s
            if (r3 == r0) goto L_0x001f
            int r3 = r9.f7375a
        L_0x001f:
            int r3 = r2.f7502t
            if (r3 == r0) goto L_0x0025
            int r3 = r9.f7376b
        L_0x0025:
            float r3 = r2.f7503u
            int r4 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0033
            int r4 = r9.f7377c
            r4 = 1325400064(0x4f000000, float:2.14748365E9)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x003b
        L_0x0033:
            int r2 = r2.f7492j
            if (r2 == r0) goto L_0x0039
            int r2 = r9.f7378d
        L_0x0039:
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            r5.f9583e = r2
            if (r11 == 0) goto L_0x0069
            androidx.media3.common.x r11 = r5.f9707d
            int r2 = r11.f7501s
            if (r2 == r0) goto L_0x004a
            int r3 = r9.f7379e
            if (r2 < 0) goto L_0x0069
        L_0x004a:
            int r2 = r11.f7502t
            if (r2 == r0) goto L_0x0052
            int r3 = r9.f7380f
            if (r2 < 0) goto L_0x0069
        L_0x0052:
            float r2 = r11.f7503u
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x005f
            int r8 = r9.f7381g
            r8 = 0
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0069
        L_0x005f:
            int r8 = r11.f7492j
            if (r8 == r0) goto L_0x0067
            int r11 = r9.f7382h
            if (r8 < 0) goto L_0x0069
        L_0x0067:
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            r5.f9585g = r8
            boolean r8 = androidx.media3.exoplayer.p150j.C3195ab.m9359f(r10, r1)
            r5.f9586h = r8
            androidx.media3.common.x r8 = r5.f9707d
            int r11 = r8.f7492j
            r5.f9587i = r11
            int r8 = r8.mo6356a()
            r5.f9588j = r8
            androidx.media3.common.x r8 = r5.f9707d
            int r8 = r8.f7489g
            int r11 = r9.f7387m
            int r8 = androidx.media3.exoplayer.p150j.C3195ab.m9357b(r8, r1)
            r5.f9590l = r8
            androidx.media3.common.x r8 = r5.f9707d
            int r8 = r8.f7489g
            if (r8 == 0) goto L_0x0096
            r8 = r8 & r7
            if (r8 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r8 = 0
            goto L_0x0097
        L_0x0096:
            r8 = 1
        L_0x0097:
            r5.f9591m = r8
            r8 = 0
        L_0x009a:
            com.google.common.b.gu r11 = r9.f7386l
            r2 = r11
            com.google.common.b.pq r2 = (com.google.common.p4522b.C58724pq) r2
            int r2 = r2.f156474d
            if (r8 >= r2) goto L_0x00b7
            androidx.media3.common.x r2 = r5.f9707d
            java.lang.String r2 = r2.f7496n
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r11 = r11.get(r8)
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            int r8 = r8 + 1
            goto L_0x009a
        L_0x00b7:
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00ba:
            r5.f9589k = r8
            r8 = r10 & 128(0x80, float:1.794E-43)
            r9 = 128(0x80, float:1.794E-43)
            if (r8 != r9) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            r5.f9592n = r8
            r8 = r10 & 64
            r9 = 64
            if (r8 != r9) goto L_0x00cf
            r8 = 1
            goto L_0x00d0
        L_0x00cf:
            r8 = 0
        L_0x00d0:
            r5.f9593o = r8
            androidx.media3.common.x r8 = r5.f9707d
            java.lang.String r9 = r8.f7496n
            r11 = 2
            if (r9 != 0) goto L_0x00db
        L_0x00d9:
            r3 = 0
            goto L_0x011b
        L_0x00db:
            int r2 = r9.hashCode()
            r3 = 3
            switch(r2) {
                case -1662735862: goto L_0x0102;
                case -1662541442: goto L_0x00f8;
                case 1331836730: goto L_0x00ee;
                case 1599127257: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x010c
        L_0x00e4:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010c
            r9 = 2
            goto L_0x010d
        L_0x00ee:
            java.lang.String r2 = "video/avc"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010c
            r9 = 3
            goto L_0x010d
        L_0x00f8:
            java.lang.String r2 = "video/hevc"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010c
            r9 = 1
            goto L_0x010d
        L_0x0102:
            java.lang.String r2 = "video/av01"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010c
            r9 = 0
            goto L_0x010d
        L_0x010c:
            r9 = -1
        L_0x010d:
            if (r9 == 0) goto L_0x011a
            if (r9 == r7) goto L_0x011b
            if (r9 == r11) goto L_0x0118
            if (r9 == r3) goto L_0x0116
            goto L_0x00d9
        L_0x0116:
            r3 = 1
            goto L_0x011b
        L_0x0118:
            r3 = 2
            goto L_0x011b
        L_0x011a:
            r3 = 4
        L_0x011b:
            r5.f9594p = r3
            int r9 = r8.f7489g
            r9 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x0125
        L_0x0123:
            r7 = 0
            goto L_0x0151
        L_0x0125:
            androidx.media3.exoplayer.j.q r9 = r5.f9584f
            boolean r2 = r9.f9684L
            boolean r2 = androidx.media3.exoplayer.p150j.C3195ab.m9359f(r10, r2)
            if (r2 != 0) goto L_0x0130
            goto L_0x0123
        L_0x0130:
            boolean r2 = r5.f9583e
            if (r2 != 0) goto L_0x0139
            boolean r3 = r9.f9674B
            if (r3 != 0) goto L_0x0139
            goto L_0x0123
        L_0x0139:
            boolean r1 = androidx.media3.exoplayer.p150j.C3195ab.m9359f(r10, r1)
            if (r1 == 0) goto L_0x0151
            boolean r1 = r5.f9585g
            if (r1 == 0) goto L_0x0151
            if (r2 == 0) goto L_0x0151
            int r8 = r8.f7492j
            if (r8 == r0) goto L_0x0151
            boolean r8 = r9.f7398x
            boolean r8 = r9.f7397w
            r6 = r6 & r10
            if (r6 == 0) goto L_0x0151
            r7 = 2
        L_0x0151:
            r5.f9595q = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p150j.C3194aa.<init>(int, androidx.media3.common.bn, int, androidx.media3.exoplayer.j.q, int, boolean):void");
    }

    /* renamed from: b */
    public final int mo7202b() {
        return this.f9595q;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo7203c(C3228x xVar) {
        C3194aa aaVar = (C3194aa) xVar;
        if (!C2612ak.m6951aa(this.f9707d.f7496n, aaVar.f9707d.f7496n)) {
            return false;
        }
        boolean z = this.f9584f.f9677E;
        return this.f9592n == aaVar.f9592n && this.f9593o == aaVar.f9593o;
    }
}
