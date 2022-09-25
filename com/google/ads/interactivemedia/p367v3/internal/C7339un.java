package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.un */
/* compiled from: PG */
final class C7339un implements acw, C7311tm {

    /* renamed from: a */
    final /* synthetic */ C7344us f23901a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f23902b = C7313to.m21860a();

    /* renamed from: c */
    private final Uri f23903c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final adg f23904d;

    /* renamed from: e */
    private final C7335uj f23905e;

    /* renamed from: f */
    private final C7056ka f23906f;

    /* renamed from: g */
    private final adm f23907g;

    /* renamed from: h */
    private final C7067kl f23908h = new C7067kl();

    /* renamed from: i */
    private volatile boolean f23909i;

    /* renamed from: j */
    private boolean f23910j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f23911k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public acb f23912l = m21976j(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f23913m = -1;

    /* renamed from: n */
    private C7073kr f23914n;

    /* renamed from: o */
    private boolean f23915o;

    public C7339un(C7344us usVar, Uri uri, abx abx, C7335uj ujVar, C7056ka kaVar, adm adm) {
        this.f23901a = usVar;
        this.f23903c = uri;
        this.f23904d = new adg(abx);
        this.f23905e = ujVar;
        this.f23906f = kaVar;
        this.f23907g = adm;
    }

    /* renamed from: i */
    static /* synthetic */ void m21975i(C7339un unVar, long j, long j2) {
        unVar.f23908h.f22624a = j;
        unVar.f23911k = j2;
        unVar.f23910j = true;
        unVar.f23915o = false;
    }

    /* renamed from: j */
    private final acb m21976j(long j) {
        aca aca = new aca();
        aca.mo14431g(this.f23903c);
        aca.mo14430f(j);
        String unused = this.f23901a.f23947j;
        aca.mo14428d((String) null);
        aca.mo14426b(6);
        aca.mo14427c(C7344us.f23924b);
        return aca.mo14425a();
    }

    /* renamed from: b */
    public final void mo14464b() {
        this.f23909i = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:71|72|(1:74)(1:75)|76) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        if (r7.length() != 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0127, code lost:
        r7 = "Invalid metadata interval: ".concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        r7 = new java.lang.String("Invalid metadata interval: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        android.util.Log.w("IcyHeaders", r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x022e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ed A[EDGE_INSN: B:125:0x01ed->B:108:0x01ed ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0139 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0194 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019d A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa A[SYNTHETIC, Splitter:B:93:0x01aa] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14465c() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.f23909i
            if (r2 != 0) goto L_0x022e
            r2 = -1
            r4 = 1
            r5 = 0
            com.google.ads.interactivemedia.v3.internal.kl r6 = r1.f23908h     // Catch:{ all -> 0x020f }
            long r13 = r6.f22624a     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.acb r6 = r1.m21976j(r13)     // Catch:{ all -> 0x020f }
            r1.f23912l = r6     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.adg r7 = r1.f23904d     // Catch:{ all -> 0x020f }
            long r6 = r7.mo14389c(r6)     // Catch:{ all -> 0x020f }
            r1.f23913m = r6     // Catch:{ all -> 0x020f }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0025
            long r6 = r6 + r13
            r1.f23913m = r6     // Catch:{ all -> 0x020f }
        L_0x0025:
            com.google.ads.interactivemedia.v3.internal.us r6 = r1.f23901a     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.adg r7 = r1.f23904d     // Catch:{ all -> 0x020f }
            java.util.Map r7 = r7.mo14403e()     // Catch:{ all -> 0x020f }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x020f }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x020f }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0087
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0069 }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x004a
            r8 = 1
            goto L_0x0066
        L_0x004a:
            java.lang.String r12 = "Invalid bitrate: "
            java.lang.String r15 = java.lang.String.valueOf(r8)     // Catch:{ NumberFormatException -> 0x006a }
            int r16 = r15.length()     // Catch:{ NumberFormatException -> 0x006a }
            if (r16 == 0) goto L_0x005b
            java.lang.String r12 = r12.concat(r15)     // Catch:{ NumberFormatException -> 0x006a }
            goto L_0x0061
        L_0x005b:
            java.lang.String r15 = new java.lang.String     // Catch:{ NumberFormatException -> 0x006a }
            r15.<init>(r12)     // Catch:{ NumberFormatException -> 0x006a }
            r12 = r15
        L_0x0061:
            android.util.Log.w(r9, r12)     // Catch:{ NumberFormatException -> 0x006a }
            r8 = 0
            r11 = -1
        L_0x0066:
            r16 = r11
            goto L_0x008a
        L_0x0069:
            r11 = -1
        L_0x006a:
            java.lang.String r12 = "Invalid bitrate header: "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x020f }
            int r15 = r8.length()     // Catch:{ all -> 0x020f }
            if (r15 == 0) goto L_0x007b
            java.lang.String r8 = r12.concat(r8)     // Catch:{ all -> 0x020f }
            goto L_0x0080
        L_0x007b:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x020f }
            r8.<init>(r12)     // Catch:{ all -> 0x020f }
        L_0x0080:
            android.util.Log.w(r9, r8)     // Catch:{ all -> 0x020f }
            r16 = r11
            r8 = 0
            goto L_0x008a
        L_0x0087:
            r8 = 0
            r16 = -1
        L_0x008a:
            java.lang.String r11 = "icy-genre"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            r12 = 0
            if (r11 == 0) goto L_0x009f
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            r17 = r8
            r8 = 1
            goto L_0x00a1
        L_0x009f:
            r17 = r12
        L_0x00a1:
            java.lang.String r11 = "icy-name"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            if (r11 == 0) goto L_0x00b5
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            r18 = r8
            r8 = 1
            goto L_0x00b7
        L_0x00b5:
            r18 = r12
        L_0x00b7:
            java.lang.String r11 = "icy-url"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            if (r11 == 0) goto L_0x00cb
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            r19 = r8
            r8 = 1
            goto L_0x00cd
        L_0x00cb:
            r19 = r12
        L_0x00cd:
            java.lang.String r11 = "icy-pub"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            if (r11 == 0) goto L_0x00e7
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            java.lang.String r11 = "1"
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x020f }
            r20 = r8
            r8 = 1
            goto L_0x00e9
        L_0x00e7:
            r20 = 0
        L_0x00e9:
            java.lang.String r11 = "icy-metaint"
            java.lang.Object r7 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x020f }
            if (r7 == 0) goto L_0x0135
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x020f }
            int r11 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x011c }
            if (r11 <= 0) goto L_0x0101
            r8 = 1
            goto L_0x0119
        L_0x0101:
            java.lang.String r15 = java.lang.String.valueOf(r7)     // Catch:{ NumberFormatException -> 0x011d }
            int r21 = r15.length()     // Catch:{ NumberFormatException -> 0x011d }
            if (r21 == 0) goto L_0x0110
            java.lang.String r15 = r0.concat(r15)     // Catch:{ NumberFormatException -> 0x011d }
            goto L_0x0115
        L_0x0110:
            java.lang.String r15 = new java.lang.String     // Catch:{ NumberFormatException -> 0x011d }
            r15.<init>(r0)     // Catch:{ NumberFormatException -> 0x011d }
        L_0x0115:
            android.util.Log.w(r9, r15)     // Catch:{ NumberFormatException -> 0x011d }
            r11 = -1
        L_0x0119:
            r21 = r11
            goto L_0x0137
        L_0x011c:
            r11 = -1
        L_0x011d:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x020f }
            int r15 = r7.length()     // Catch:{ all -> 0x020f }
            if (r15 == 0) goto L_0x012c
            java.lang.String r7 = r0.concat(r7)     // Catch:{ all -> 0x020f }
            goto L_0x0131
        L_0x012c:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x020f }
            r7.<init>(r0)     // Catch:{ all -> 0x020f }
        L_0x0131:
            android.util.Log.w(r9, r7)     // Catch:{ all -> 0x020f }
            goto L_0x0119
        L_0x0135:
            r21 = -1
        L_0x0137:
            if (r8 == 0) goto L_0x013f
            com.google.ads.interactivemedia.v3.internal.rk r12 = new com.google.ads.interactivemedia.v3.internal.rk     // Catch:{ all -> 0x020f }
            r15 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x020f }
        L_0x013f:
            r6.f23956s = r12     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.adg r6 = r1.f23904d     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.us r7 = r1.f23901a     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.rk r7 = r7.f23956s     // Catch:{ all -> 0x020f }
            if (r7 == 0) goto L_0x0174
            com.google.ads.interactivemedia.v3.internal.us r7 = r1.f23901a     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.rk r7 = r7.f23956s     // Catch:{ all -> 0x020f }
            int r7 = r7.f23705f     // Catch:{ all -> 0x020f }
            if (r7 == r10) goto L_0x0174
            com.google.ads.interactivemedia.v3.internal.tn r6 = new com.google.ads.interactivemedia.v3.internal.tn     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.adg r7 = r1.f23904d     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.us r8 = r1.f23901a     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.rk r8 = r8.f23956s     // Catch:{ all -> 0x020f }
            int r8 = r8.f23705f     // Catch:{ all -> 0x020f }
            r6.<init>(r7, r8, r1)     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.us r7 = r1.f23901a     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.kr r7 = r7.mo16585u()     // Catch:{ all -> 0x020f }
            r1.f23914n = r7     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.cy r8 = com.google.ads.interactivemedia.p367v3.internal.C7344us.f23925c     // Catch:{ all -> 0x020f }
            r7.mo16102a(r8)     // Catch:{ all -> 0x020f }
        L_0x0174:
            r8 = r6
            com.google.ads.interactivemedia.v3.internal.uj r7 = r1.f23905e     // Catch:{ all -> 0x020f }
            android.net.Uri r9 = r1.f23903c     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.adg r6 = r1.f23904d     // Catch:{ all -> 0x020f }
            java.util.Map r10 = r6.mo14403e()     // Catch:{ all -> 0x020f }
            long r11 = r1.f23913m     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.ka r15 = r1.f23906f     // Catch:{ all -> 0x020f }
            r16 = r11
            r11 = r13
            r2 = r13
            r13 = r16
            r7.mo16486a(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.us r6 = r1.f23901a     // Catch:{ all -> 0x020f }
            com.google.ads.interactivemedia.v3.internal.rk r6 = r6.f23956s     // Catch:{ all -> 0x020f }
            if (r6 == 0) goto L_0x0199
            com.google.ads.interactivemedia.v3.internal.uj r6 = r1.f23905e     // Catch:{ all -> 0x020f }
            r6.mo16488c()     // Catch:{ all -> 0x020f }
        L_0x0199:
            boolean r6 = r1.f23910j     // Catch:{ all -> 0x020f }
            if (r6 == 0) goto L_0x01a6
            com.google.ads.interactivemedia.v3.internal.uj r6 = r1.f23905e     // Catch:{ all -> 0x020f }
            long r7 = r1.f23911k     // Catch:{ all -> 0x020f }
            r6.mo16490e(r2, r7)     // Catch:{ all -> 0x020f }
            r1.f23910j = r5     // Catch:{ all -> 0x020f }
        L_0x01a6:
            r13 = r2
            r2 = 0
        L_0x01a8:
            if (r2 != 0) goto L_0x01ed
            boolean r3 = r1.f23909i     // Catch:{ all -> 0x01ea }
            if (r3 != 0) goto L_0x01e8
            com.google.ads.interactivemedia.v3.internal.adm r3 = r1.f23907g     // Catch:{ InterruptedException -> 0x01e2 }
            r3.mo14490b()     // Catch:{ InterruptedException -> 0x01e2 }
            com.google.ads.interactivemedia.v3.internal.uj r3 = r1.f23905e     // Catch:{ all -> 0x01ea }
            com.google.ads.interactivemedia.v3.internal.kl r6 = r1.f23908h     // Catch:{ all -> 0x01ea }
            int r2 = r3.mo16491f(r6)     // Catch:{ all -> 0x01ea }
            com.google.ads.interactivemedia.v3.internal.uj r3 = r1.f23905e     // Catch:{ all -> 0x01ea }
            long r6 = r3.mo16489d()     // Catch:{ all -> 0x01ea }
            com.google.ads.interactivemedia.v3.internal.us r3 = r1.f23901a     // Catch:{ all -> 0x01ea }
            long r8 = r3.f23948k     // Catch:{ all -> 0x01ea }
            long r8 = r8 + r13
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a8
            com.google.ads.interactivemedia.v3.internal.adm r3 = r1.f23907g     // Catch:{ all -> 0x01ea }
            r3.mo14492d()     // Catch:{ all -> 0x01ea }
            com.google.ads.interactivemedia.v3.internal.us r3 = r1.f23901a     // Catch:{ all -> 0x01ea }
            android.os.Handler r3 = r3.f23954q     // Catch:{ all -> 0x01ea }
            com.google.ads.interactivemedia.v3.internal.us r8 = r1.f23901a     // Catch:{ all -> 0x01ea }
            java.lang.Runnable r8 = r8.f23953p     // Catch:{ all -> 0x01ea }
            r3.post(r8)     // Catch:{ all -> 0x01ea }
            r13 = r6
            goto L_0x01a8
        L_0x01e2:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01ea }
            r0.<init>()     // Catch:{ all -> 0x01ea }
            throw r0     // Catch:{ all -> 0x01ea }
        L_0x01e8:
            r2 = 0
            goto L_0x01ed
        L_0x01ea:
            r0 = move-exception
            r5 = r2
            goto L_0x0210
        L_0x01ed:
            if (r2 != r4) goto L_0x01f0
            goto L_0x0207
        L_0x01f0:
            com.google.ads.interactivemedia.v3.internal.uj r3 = r1.f23905e
            long r3 = r3.mo16489d()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0206
            com.google.ads.interactivemedia.v3.internal.kl r3 = r1.f23908h
            com.google.ads.interactivemedia.v3.internal.uj r4 = r1.f23905e
            long r4 = r4.mo16489d()
            r3.f22624a = r4
        L_0x0206:
            r5 = r2
        L_0x0207:
            com.google.ads.interactivemedia.v3.internal.adg r2 = r1.f23904d
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18547q(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x022e
        L_0x020f:
            r0 = move-exception
        L_0x0210:
            if (r5 == r4) goto L_0x0228
            com.google.ads.interactivemedia.v3.internal.uj r2 = r1.f23905e
            long r2 = r2.mo16489d()
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0228
            com.google.ads.interactivemedia.v3.internal.kl r2 = r1.f23908h
            com.google.ads.interactivemedia.v3.internal.uj r3 = r1.f23905e
            long r3 = r3.mo16489d()
            r2.f22624a = r3
        L_0x0228:
            com.google.ads.interactivemedia.v3.internal.adg r2 = r1.f23904d
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18547q(r2)
            throw r0
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7339un.mo14465c():void");
    }

    /* renamed from: a */
    public final void mo16532a(aee aee) {
        long j;
        if (!this.f23915o) {
            j = this.f23911k;
        } else {
            j = Math.max(this.f23901a.m22003T(), this.f23911k);
        }
        int d = aee.mo14550d();
        C7073kr krVar = this.f23914n;
        ary.m19467t(krVar);
        krVar.mo16105d(aee, d);
        krVar.mo16103b(j, 1, d, 0, (C7072kq) null);
        this.f23915o = true;
    }
}
