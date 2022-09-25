package androidx.media3.exoplayer.p145h;

import android.net.Uri;
import androidx.media3.common.p136b.C2619g;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3368bf;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import java.util.Collections;

/* renamed from: androidx.media3.exoplayer.h.bp */
/* compiled from: PG */
final class C3078bp implements C3252r, C3025ah {

    /* renamed from: a */
    public final long f8938a = C3027aj.f8771a.getAndIncrement();

    /* renamed from: b */
    public final C2493al f8939b;

    /* renamed from: c */
    public long f8940c;

    /* renamed from: d */
    public C2510n f8941d = m8864d(0);

    /* renamed from: e */
    public C3368bf f8942e;

    /* renamed from: f */
    public boolean f8943f;

    /* renamed from: g */
    final /* synthetic */ C3083bu f8944g;

    /* renamed from: h */
    private final Uri f8945h;

    /* renamed from: i */
    private final C3073bk f8946i;

    /* renamed from: j */
    private final C3329ad f8947j;

    /* renamed from: k */
    private final C2619g f8948k;

    /* renamed from: l */
    private final C3350ay f8949l = new C3350ay();

    /* renamed from: m */
    private volatile boolean f8950m;

    /* renamed from: n */
    private boolean f8951n = true;

    public C3078bp(C3083bu buVar, Uri uri, C2505i iVar, C3073bk bkVar, C3329ad adVar, C2619g gVar) {
        this.f8944g = buVar;
        this.f8945h = uri;
        this.f8939b = new C2493al(iVar);
        this.f8946i = bkVar;
        this.f8947j = adVar;
        this.f8948k = gVar;
    }

    /* renamed from: d */
    private final C2510n m8864d(long j) {
        Collections.emptyMap();
        return C2509m.m6615a(this.f8945h, 0, C3083bu.f8960a, j, -1, (String) null, 6);
    }

    /* renamed from: a */
    public final void mo7048a(long j, long j2) {
        this.f8949l.f10122a = j;
        this.f8940c = j2;
        this.f8951n = true;
        this.f8943f = false;
    }

    /* renamed from: b */
    public final void mo6996b() {
        this.f8950m = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        androidx.media3.common.p136b.C2633u.m7050e("IcyHeaders", "Invalid metadata interval: ".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x010f */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x021d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01dd A[EDGE_INSN: B:128:0x01dd->B:108:0x01dd ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011b A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0134 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014d A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0167 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0179 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0193 A[SYNTHETIC, Splitter:B:87:0x0193] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6997c() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.f8950m
            if (r2 != 0) goto L_0x021d
            r2 = -1
            r4 = 1
            r5 = 0
            androidx.media3.extractor.ay r6 = r1.f8949l     // Catch:{ all -> 0x01fe }
            long r13 = r6.f10122a     // Catch:{ all -> 0x01fe }
            androidx.media3.b.n r6 = r1.m8864d(r13)     // Catch:{ all -> 0x01fe }
            r1.f8941d = r6     // Catch:{ all -> 0x01fe }
            androidx.media3.b.al r7 = r1.f8939b     // Catch:{ all -> 0x01fe }
            long r6 = r7.mo5880b(r6)     // Catch:{ all -> 0x01fe }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x002d
            long r6 = r6 + r13
            androidx.media3.exoplayer.h.bu r8 = r1.f8944g     // Catch:{ all -> 0x01fe }
            android.os.Handler r9 = r8.f8978g     // Catch:{ all -> 0x01fe }
            androidx.media3.exoplayer.h.bn r10 = new androidx.media3.exoplayer.h.bn     // Catch:{ all -> 0x01fe }
            r10.<init>(r8)     // Catch:{ all -> 0x01fe }
            r9.post(r10)     // Catch:{ all -> 0x01fe }
        L_0x002d:
            r15 = r6
            androidx.media3.exoplayer.h.bu r6 = r1.f8944g     // Catch:{ all -> 0x01fe }
            androidx.media3.b.al r7 = r1.f8939b     // Catch:{ all -> 0x01fe }
            java.util.Map r7 = r7.mo5883e()     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x01fe }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x007e
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01fe }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x006c }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x0053
            r2 = 1
            goto L_0x0069
        L_0x0053:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x006d }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x006d }
            java.lang.String r2 = "Invalid bitrate: "
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x006d }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x006d }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x006d }
            androidx.media3.common.p136b.C2633u.m7050e(r9, r2)     // Catch:{ NumberFormatException -> 0x006d }
            r2 = 0
            r11 = -1
        L_0x0069:
            r18 = r11
            goto L_0x0081
        L_0x006c:
            r11 = -1
        L_0x006d:
            java.lang.String r2 = "Invalid bitrate header: "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x01fe }
            androidx.media3.common.p136b.C2633u.m7050e(r9, r2)     // Catch:{ all -> 0x01fe }
            r18 = r11
            r2 = 0
            goto L_0x0081
        L_0x007e:
            r2 = 0
            r18 = -1
        L_0x0081:
            java.lang.String r3 = "icy-genre"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01fe }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01fe }
            r8 = 0
            if (r3 == 0) goto L_0x0096
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01fe }
            r19 = r2
            r2 = 1
            goto L_0x0098
        L_0x0096:
            r19 = r8
        L_0x0098:
            java.lang.String r3 = "icy-name"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01fe }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01fe }
            if (r3 == 0) goto L_0x00ac
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01fe }
            r20 = r2
            r2 = 1
            goto L_0x00ae
        L_0x00ac:
            r20 = r8
        L_0x00ae:
            java.lang.String r3 = "icy-url"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01fe }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01fe }
            if (r3 == 0) goto L_0x00c2
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01fe }
            r21 = r2
            r2 = 1
            goto L_0x00c4
        L_0x00c2:
            r21 = r8
        L_0x00c4:
            java.lang.String r3 = "icy-pub"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01fe }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01fe }
            if (r3 == 0) goto L_0x00de
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01fe }
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01fe }
            r22 = r2
            r2 = 1
            goto L_0x00e0
        L_0x00de:
            r22 = 0
        L_0x00e0:
            java.lang.String r3 = "icy-metaint"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01fe }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01fe }
            if (r3 == 0) goto L_0x011b
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01fe }
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x010e }
            if (r7 <= 0) goto L_0x00f8
            r2 = 1
            goto L_0x010b
        L_0x00f8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x010f }
            r11.<init>()     // Catch:{ NumberFormatException -> 0x010f }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x010f }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x010f }
            java.lang.String r11 = r11.toString()     // Catch:{ NumberFormatException -> 0x010f }
            androidx.media3.common.p136b.C2633u.m7050e(r9, r11)     // Catch:{ NumberFormatException -> 0x010f }
            r7 = -1
        L_0x010b:
            r23 = r7
            goto L_0x011d
        L_0x010e:
            r7 = -1
        L_0x010f:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01fe }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x01fe }
            androidx.media3.common.p136b.C2633u.m7050e(r9, r3)     // Catch:{ all -> 0x01fe }
            goto L_0x010b
        L_0x011b:
            r23 = -1
        L_0x011d:
            if (r2 == 0) goto L_0x0126
            androidx.media3.extractor.metadata.icy.IcyHeaders r8 = new androidx.media3.extractor.metadata.icy.IcyHeaders     // Catch:{ all -> 0x01fe }
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01fe }
        L_0x0126:
            r6.f8980i = r8     // Catch:{ all -> 0x01fe }
            androidx.media3.b.al r2 = r1.f8939b     // Catch:{ all -> 0x01fe }
            androidx.media3.exoplayer.h.bu r3 = r1.f8944g     // Catch:{ all -> 0x01fe }
            androidx.media3.extractor.metadata.icy.IcyHeaders r3 = r3.f8980i     // Catch:{ all -> 0x01fe }
            if (r3 == 0) goto L_0x014d
            int r3 = r3.f11451f     // Catch:{ all -> 0x01fe }
            if (r3 == r10) goto L_0x014d
            androidx.media3.exoplayer.h.ai r6 = new androidx.media3.exoplayer.h.ai     // Catch:{ all -> 0x01fe }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x01fe }
            androidx.media3.exoplayer.h.bu r2 = r1.f8944g     // Catch:{ all -> 0x01fe }
            androidx.media3.exoplayer.h.bs r3 = new androidx.media3.exoplayer.h.bs     // Catch:{ all -> 0x01fe }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x01fe }
            androidx.media3.extractor.bf r2 = r2.mo7053p(r3)     // Catch:{ all -> 0x01fe }
            r1.f8942e = r2     // Catch:{ all -> 0x01fe }
            androidx.media3.common.x r3 = androidx.media3.exoplayer.p145h.C3083bu.f8961b     // Catch:{ all -> 0x01fe }
            r2.mo6850b(r3)     // Catch:{ all -> 0x01fe }
            r8 = r6
            goto L_0x014e
        L_0x014d:
            r8 = r2
        L_0x014e:
            androidx.media3.exoplayer.h.bk r7 = r1.f8946i     // Catch:{ all -> 0x01fe }
            android.net.Uri r9 = r1.f8945h     // Catch:{ all -> 0x01fe }
            androidx.media3.b.al r2 = r1.f8939b     // Catch:{ all -> 0x01fe }
            java.util.Map r10 = r2.mo5883e()     // Catch:{ all -> 0x01fe }
            androidx.media3.extractor.ad r2 = r1.f8947j     // Catch:{ all -> 0x01fe }
            r11 = r13
            r5 = r13
            r13 = r15
            r15 = r2
            r7.mo7043b(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x01fe }
            androidx.media3.exoplayer.h.bu r2 = r1.f8944g     // Catch:{ all -> 0x01fe }
            androidx.media3.extractor.metadata.icy.IcyHeaders r2 = r2.f8980i     // Catch:{ all -> 0x01fe }
            if (r2 == 0) goto L_0x0175
            androidx.media3.exoplayer.h.bk r2 = r1.f8946i     // Catch:{ all -> 0x01fe }
            androidx.media3.exoplayer.h.c r2 = (androidx.media3.exoplayer.p145h.C3089c) r2     // Catch:{ all -> 0x01fe }
            androidx.media3.extractor.aa r2 = r2.f9019a     // Catch:{ all -> 0x01fe }
            boolean r7 = r2 instanceof androidx.media3.extractor.p160g.C3407d     // Catch:{ all -> 0x01fe }
            if (r7 == 0) goto L_0x0175
            androidx.media3.extractor.g.d r2 = (androidx.media3.extractor.p160g.C3407d) r2     // Catch:{ all -> 0x01fe }
            r2.f10423a = r4     // Catch:{ all -> 0x01fe }
        L_0x0175:
            boolean r2 = r1.f8951n     // Catch:{ all -> 0x01fe }
            if (r2 == 0) goto L_0x018e
            androidx.media3.exoplayer.h.bk r2 = r1.f8946i     // Catch:{ all -> 0x01fe }
            long r7 = r1.f8940c     // Catch:{ all -> 0x01fe }
            androidx.media3.exoplayer.h.c r2 = (androidx.media3.exoplayer.p145h.C3089c) r2     // Catch:{ all -> 0x01fe }
            androidx.media3.extractor.aa r2 = r2.f9019a     // Catch:{ all -> 0x01fe }
            r2.getClass()
            r2.mo7154d(r5, r7)     // Catch:{ all -> 0x01fe }
            r2 = 0
            r1.f8951n = r2     // Catch:{ all -> 0x018b }
            goto L_0x018f
        L_0x018b:
            r0 = move-exception
            goto L_0x0200
        L_0x018e:
            r2 = 0
        L_0x018f:
            r13 = r5
            r3 = 0
        L_0x0191:
            if (r3 != 0) goto L_0x01dd
            boolean r5 = r1.f8950m     // Catch:{ all -> 0x01da }
            if (r5 != 0) goto L_0x01d8
            androidx.media3.common.b.g r5 = r1.f8948k     // Catch:{ InterruptedException -> 0x01d2 }
            r5.mo6189a()     // Catch:{ InterruptedException -> 0x01d2 }
            androidx.media3.exoplayer.h.bk r5 = r1.f8946i     // Catch:{ all -> 0x01da }
            androidx.media3.extractor.ay r6 = r1.f8949l     // Catch:{ all -> 0x01da }
            r7 = r5
            androidx.media3.exoplayer.h.c r7 = (androidx.media3.exoplayer.p145h.C3089c) r7     // Catch:{ all -> 0x01da }
            androidx.media3.extractor.aa r7 = r7.f9019a     // Catch:{ all -> 0x01da }
            r7.getClass()
            androidx.media3.exoplayer.h.c r5 = (androidx.media3.exoplayer.p145h.C3089c) r5     // Catch:{ all -> 0x01da }
            androidx.media3.extractor.ab r5 = r5.f9020b     // Catch:{ all -> 0x01da }
            r5.getClass()
            int r3 = r7.mo7152a(r5, r6)     // Catch:{ all -> 0x01da }
            androidx.media3.exoplayer.h.bk r5 = r1.f8946i     // Catch:{ all -> 0x01da }
            long r5 = r5.mo7042a()     // Catch:{ all -> 0x01da }
            androidx.media3.exoplayer.h.bu r7 = r1.f8944g     // Catch:{ all -> 0x01da }
            long r7 = r7.f8975d     // Catch:{ all -> 0x01da }
            long r7 = r7 + r13
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0191
            androidx.media3.common.b.g r7 = r1.f8948k     // Catch:{ all -> 0x01da }
            r7.mo6193e()     // Catch:{ all -> 0x01da }
            androidx.media3.exoplayer.h.bu r7 = r1.f8944g     // Catch:{ all -> 0x01da }
            android.os.Handler r8 = r7.f8978g     // Catch:{ all -> 0x01da }
            java.lang.Runnable r7 = r7.f8977f     // Catch:{ all -> 0x01da }
            r8.post(r7)     // Catch:{ all -> 0x01da }
            r13 = r5
            goto L_0x0191
        L_0x01d2:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01da }
            r0.<init>()     // Catch:{ all -> 0x01da }
            throw r0     // Catch:{ all -> 0x01da }
        L_0x01d8:
            r3 = 0
            goto L_0x01dd
        L_0x01da:
            r0 = move-exception
            r5 = r3
            goto L_0x0201
        L_0x01dd:
            if (r3 != r4) goto L_0x01e1
            r5 = 0
            goto L_0x01f6
        L_0x01e1:
            androidx.media3.exoplayer.h.bk r2 = r1.f8946i
            long r4 = r2.mo7042a()
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01f5
            androidx.media3.extractor.ay r4 = r1.f8949l
            long r5 = r2.mo7042a()
            r4.f10122a = r5
        L_0x01f5:
            r5 = r3
        L_0x01f6:
            androidx.media3.b.al r2 = r1.f8939b
            androidx.media3.p132b.C2508l.m6614a(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x021d
        L_0x01fe:
            r0 = move-exception
            r2 = 0
        L_0x0200:
            r5 = 0
        L_0x0201:
            if (r5 == r4) goto L_0x0217
            androidx.media3.exoplayer.h.bk r2 = r1.f8946i
            long r3 = r2.mo7042a()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0217
            androidx.media3.extractor.ay r3 = r1.f8949l
            long r4 = r2.mo7042a()
            r3.f10122a = r4
        L_0x0217:
            androidx.media3.b.al r2 = r1.f8939b
            androidx.media3.p132b.C2508l.m6614a(r2)
            throw r0
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3078bp.mo6997c():void");
    }
}
