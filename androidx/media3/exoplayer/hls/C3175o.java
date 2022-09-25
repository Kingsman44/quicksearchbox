package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.C2680x;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2610ai;
import androidx.media3.exoplayer.hls.p148a.C3141i;
import androidx.media3.exoplayer.hls.p148a.C3142j;
import androidx.media3.exoplayer.hls.p148a.C3144l;
import androidx.media3.exoplayer.p145h.p147b.C3059o;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3627q;
import androidx.media3.extractor.metadata.id3.C3603g;
import androidx.media3.extractor.metadata.id3.C3605i;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.media3.exoplayer.hls.o */
/* compiled from: PG */
final class C3175o extends C3059o {

    /* renamed from: u */
    private static final AtomicInteger f9421u = new AtomicInteger();

    /* renamed from: A */
    private final C2609ah f9422A;

    /* renamed from: B */
    private final List f9423B;

    /* renamed from: C */
    private final DrmInitData f9424C;

    /* renamed from: D */
    private final C3605i f9425D;

    /* renamed from: E */
    private final C2604ac f9426E;

    /* renamed from: F */
    private final boolean f9427F;

    /* renamed from: G */
    private final boolean f9428G;

    /* renamed from: H */
    private C3176p f9429H;

    /* renamed from: I */
    private int f9430I;

    /* renamed from: J */
    private boolean f9431J;

    /* renamed from: K */
    private volatile boolean f9432K;

    /* renamed from: a */
    public final int f9433a;

    /* renamed from: b */
    public final int f9434b;

    /* renamed from: c */
    public final Uri f9435c;

    /* renamed from: d */
    public final boolean f9436d;

    /* renamed from: e */
    public final int f9437e;

    /* renamed from: f */
    public C3185y f9438f;

    /* renamed from: g */
    public boolean f9439g;

    /* renamed from: h */
    public C58485gu f9440h;

    /* renamed from: i */
    public boolean f9441i;

    /* renamed from: j */
    public boolean f9442j;

    /* renamed from: v */
    private final C2505i f9443v;

    /* renamed from: w */
    private final C2510n f9444w;

    /* renamed from: x */
    private final C3176p f9445x;

    /* renamed from: y */
    private final boolean f9446y;

    /* renamed from: z */
    private final boolean f9447z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3175o(C2505i iVar, C2510n nVar, C2680x xVar, boolean z, C2505i iVar2, C2510n nVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C2609ah ahVar, DrmInitData drmInitData, C3176p pVar, C3605i iVar3, C2604ac acVar, boolean z6) {
        super(iVar, nVar, xVar, i, obj, j, j2, j3);
        C2510n nVar3 = nVar2;
        this.f9427F = z;
        this.f9437e = i2;
        this.f9442j = z3;
        this.f9434b = i3;
        this.f9444w = nVar3;
        this.f9443v = iVar2;
        this.f9431J = nVar3 != null;
        this.f9428G = z2;
        this.f9435c = uri;
        this.f9446y = z5;
        this.f9422A = ahVar;
        this.f9447z = z4;
        this.f9423B = list;
        this.f9424C = drmInitData;
        this.f9445x = pVar;
        this.f9425D = iVar3;
        this.f9426E = acVar;
        this.f9436d = z6;
        this.f9440h = C58485gu.m89845m();
        this.f9433a = f9421u.getAndIncrement();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r5.f9316v != false) goto L_0x002d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9245e(androidx.media3.exoplayer.hls.C3175o r3, android.net.Uri r4, androidx.media3.exoplayer.hls.p148a.C3144l r5, androidx.media3.exoplayer.hls.C3171k r6, long r7) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.net.Uri r1 = r3.f9435c
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0012
            boolean r4 = r3.f9439g
            if (r4 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r0
        L_0x0012:
            androidx.media3.exoplayer.hls.a.j r4 = r6.f9397a
            long r1 = r4.f9263g
            long r7 = r7 + r1
            boolean r1 = r4 instanceof androidx.media3.exoplayer.hls.p148a.C3139g
            r2 = 1
            if (r1 == 0) goto L_0x002f
            androidx.media3.exoplayer.hls.a.g r4 = (androidx.media3.exoplayer.hls.p148a.C3139g) r4
            boolean r4 = r4.f9252a
            if (r4 != 0) goto L_0x002d
            int r4 = r6.f9399c
            if (r4 != 0) goto L_0x002b
            boolean r4 = r5.f9316v
            if (r4 == 0) goto L_0x003b
            goto L_0x002d
        L_0x002b:
            r4 = 0
            goto L_0x0031
        L_0x002d:
            r4 = 1
            goto L_0x0031
        L_0x002f:
            boolean r4 = r5.f9316v
        L_0x0031:
            if (r4 == 0) goto L_0x003b
            long r3 = r3.f8852r
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            return r0
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3175o.m9245e(androidx.media3.exoplayer.hls.o, android.net.Uri, androidx.media3.exoplayer.hls.a.l, androidx.media3.exoplayer.hls.k, long):boolean");
    }

    /* renamed from: f */
    public static C3175o m9246f(C3173m mVar, C2505i iVar, C2680x xVar, long j, C3144l lVar, C3171k kVar, Uri uri, List list, int i, Object obj, boolean z, C3160ac acVar, C3175o oVar, byte[] bArr, byte[] bArr2, boolean z2) {
        byte[] bArr3;
        boolean z3;
        C2505i iVar2;
        C2510n nVar;
        C2604ac acVar2;
        C3605i iVar3;
        C3176p pVar;
        byte[] bArr4;
        C2505i iVar4 = iVar;
        C3144l lVar2 = lVar;
        C3171k kVar2 = kVar;
        C3160ac acVar3 = acVar;
        C3175o oVar2 = oVar;
        byte[] bArr5 = bArr;
        byte[] bArr6 = bArr2;
        C3142j jVar = kVar2.f9397a;
        boolean z4 = false;
        C2510n a = C2509m.m6615a(Uri.parse(C2610ai.m6915a(lVar2.f9314t, jVar.f9259c)), 0, Collections.emptyMap(), jVar.f9267k, jVar.f9268l, (String) null, true != kVar2.f9400d ? 0 : 8);
        boolean z5 = bArr5 != null;
        if (z5) {
            String str = jVar.f9266j;
            str.getClass();
            bArr3 = m9250j(str);
        } else {
            bArr3 = null;
        }
        C2505i h = m9248h(iVar4, bArr5, bArr3);
        C3141i iVar5 = jVar.f9260d;
        if (iVar5 != null) {
            boolean z6 = bArr6 != null;
            if (z6) {
                String str2 = iVar5.f9266j;
                str2.getClass();
                bArr4 = m9250j(str2);
            } else {
                bArr4 = null;
            }
            nVar = new C2510n(Uri.parse(C2610ai.m6915a(lVar2.f9314t, iVar5.f9259c)), iVar5.f9267k, iVar5.f9268l);
            iVar2 = m9248h(iVar4, bArr6, bArr4);
            z3 = z6;
        } else {
            nVar = null;
            iVar2 = null;
            z3 = false;
        }
        long j2 = j + jVar.f9263g;
        long j3 = j2 + jVar.f9261e;
        int i2 = lVar2.f9281g + jVar.f9262f;
        if (oVar2 != null) {
            C2510n nVar2 = oVar2.f9444w;
            boolean z7 = nVar == nVar2 || (nVar != null && nVar2 != null && nVar.f6891a.equals(nVar2.f6891a) && nVar.f6896f == oVar2.f9444w.f6896f);
            if (uri.equals(oVar2.f9435c) && oVar2.f9439g) {
                z4 = true;
            }
            iVar3 = oVar2.f9425D;
            acVar2 = oVar2.f9426E;
            pVar = (!z7 || !z4 || oVar2.f9441i || oVar2.f9434b != i2) ? null : oVar2.f9429H;
        } else {
            Uri uri2 = uri;
            iVar3 = new C3605i((C3603g) null);
            pVar = null;
            acVar2 = new C2604ac(10);
        }
        long j4 = kVar2.f9398b;
        int i3 = kVar2.f9399c;
        boolean z8 = !kVar2.f9400d;
        boolean z9 = jVar.f9269m;
        C2609ah ahVar = (C2609ah) acVar3.f9374a.get(i2);
        if (ahVar == null) {
            ahVar = new C2609ah(9223372036854775806L);
            acVar3.f9374a.put(i2, ahVar);
        }
        return new C3175o(h, a, xVar, z5, iVar2, nVar, z3, uri, list, i, obj, j2, j3, j4, i3, z8, i2, z9, z, ahVar, jVar.f9264h, pVar, iVar3, acVar2, z2);
    }

    /* renamed from: g */
    private final long m9247g(C3327ab abVar) {
        C3627q qVar = (C3627q) abVar;
        qVar.f11568e = 0;
        try {
            this.f9426E.mo6156x(10);
            ((C3627q) abVar).mo7320o(this.f9426E.f7234a, 0, 10, false);
            if (this.f9426E.mo6140h() != 4801587) {
                return -9223372036854775807L;
            }
            C2604ac acVar = this.f9426E;
            acVar.mo6131A(acVar.f7235b + 3);
            int f = this.f9426E.mo6138f();
            int i = f + 10;
            C2604ac acVar2 = this.f9426E;
            byte[] bArr = acVar2.f7234a;
            if (i > bArr.length) {
                acVar2.mo6156x(i);
                System.arraycopy(bArr, 0, this.f9426E.f7234a, 0, 10);
            }
            qVar.mo7320o(this.f9426E.f7234a, 10, f, false);
            Metadata c = this.f9425D.mo7581c(this.f9426E.f7234a, f);
            if (c == null) {
                return -9223372036854775807L;
            }
            for (Metadata.Entry entry : c.f7056a) {
                if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f11490a)) {
                        System.arraycopy(privFrame.f11491b, 0, this.f9426E.f7234a, 0, 8);
                        this.f9426E.mo6131A(0);
                        this.f9426E.mo6158z(8);
                        return this.f9426E.mo6145m() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    /* renamed from: h */
    private static C2505i m9248h(C2505i iVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return iVar;
        }
        bArr2.getClass();
        return new C3132a(iVar, bArr, bArr2);
    }

    /* renamed from: j */
    private static byte[] m9250j(String str) {
        if (C58890d.m90988c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length;
        int i = length > 16 ? length - 16 : 0;
        System.arraycopy(byteArray, i, bArr, (16 - length) + i, length - i);
        return bArr;
    }

    /* renamed from: a */
    public final int mo7172a(int i) {
        C2601a.m6832d(!this.f9436d);
        C58485gu guVar = this.f9440h;
        if (i >= ((C58724pq) guVar).f156474d) {
            return 0;
        }
        return ((Integer) guVar.get(i)).intValue();
    }

    /* renamed from: b */
    public final void mo6996b() {
        this.f9432K = true;
    }

    /* renamed from: c */
    public final void mo6997c() {
        C3176p pVar;
        this.f9438f.getClass();
        if (this.f9429H == null && (pVar = this.f9445x) != null && pVar.mo7161e()) {
            this.f9429H = this.f9445x;
            this.f9431J = false;
        }
        if (this.f9431J) {
            C2505i iVar = this.f9443v;
            iVar.getClass();
            C2510n nVar = this.f9444w;
            nVar.getClass();
            m9249i(iVar, nVar, this.f9428G, false);
            this.f9430I = 0;
            this.f9431J = false;
        }
        if (!this.f9432K) {
            if (!this.f9447z) {
                m9249i(this.f8853s, this.f8846l, this.f9427F, true);
            }
            this.f9439g = !this.f9432K;
        }
    }

    /* renamed from: d */
    public final boolean mo6998d() {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c5, code lost:
        r20 = r5;
        r21 = r6;
        r5 = r17;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ce, code lost:
        r5.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r4 = new androidx.media3.exoplayer.hls.C3162b(r5, r8, r14);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014d A[Catch:{ EOFException -> 0x0257, all -> 0x0253, all -> 0x0274, all -> 0x027e }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0150 A[Catch:{ EOFException -> 0x0257, all -> 0x0253, all -> 0x0274, all -> 0x027e }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9249i(androidx.media3.p132b.C2505i r24, androidx.media3.p132b.C2510n r25, boolean r26, boolean r27) {
        /*
            r23 = this;
            r1 = r23
            r2 = r25
            r3 = 0
            if (r26 == 0) goto L_0x0013
            int r4 = r1.f9430I
            if (r4 == 0) goto L_0x000d
            r4 = 1
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            r12 = r24
            r5 = r4
            r4 = r2
            goto L_0x001d
        L_0x0013:
            int r4 = r1.f9430I
            long r4 = (long) r4
            androidx.media3.b.n r4 = r2.mo5936a(r4)
            r12 = r24
            r5 = 0
        L_0x001d:
            long r10 = r12.mo5880b(r4)     // Catch:{ all -> 0x027e }
            if (r27 == 0) goto L_0x0033
            androidx.media3.common.b.ah r6 = r1.f9422A     // Catch:{ InterruptedException -> 0x002d }
            boolean r7 = r1.f9446y     // Catch:{ InterruptedException -> 0x002d }
            long r8 = r1.f8851q     // Catch:{ InterruptedException -> 0x002d }
            r6.mo6185i(r7, r8)     // Catch:{ InterruptedException -> 0x002d }
            goto L_0x0033
        L_0x002d:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x027e }
            r0.<init>()     // Catch:{ all -> 0x027e }
            throw r0     // Catch:{ all -> 0x027e }
        L_0x0033:
            androidx.media3.extractor.q r13 = new androidx.media3.extractor.q     // Catch:{ all -> 0x027e }
            long r8 = r4.f6896f     // Catch:{ all -> 0x027e }
            r6 = r13
            r7 = r24
            r6.<init>(r7, r8, r10)     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.p r6 = r1.f9429H     // Catch:{ all -> 0x027e }
            if (r6 != 0) goto L_0x020c
            long r6 = r1.m9247g(r13)     // Catch:{ all -> 0x027e }
            r13.f11568e = r3     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.p r8 = r1.f9445x     // Catch:{ all -> 0x027e }
            if (r8 == 0) goto L_0x0056
            androidx.media3.exoplayer.hls.p r4 = r8.mo7157a()     // Catch:{ all -> 0x027e }
            r20 = r5
            r21 = r6
            r2 = 0
            goto L_0x01d4
        L_0x0056:
            android.net.Uri r4 = r4.f6891a     // Catch:{ all -> 0x027e }
            androidx.media3.common.x r8 = r1.f8848n     // Catch:{ all -> 0x027e }
            java.util.List r11 = r1.f9423B     // Catch:{ all -> 0x027e }
            androidx.media3.common.b.ah r14 = r1.f9422A     // Catch:{ all -> 0x027e }
            java.util.Map r15 = r24.mo5883e()     // Catch:{ all -> 0x027e }
            java.lang.String r9 = r8.f7496n     // Catch:{ all -> 0x027e }
            int r9 = androidx.media3.common.C2675s.m7237a(r9)     // Catch:{ all -> 0x027e }
            int r10 = androidx.media3.common.C2675s.m7238b(r15)     // Catch:{ all -> 0x027e }
            int r4 = androidx.media3.common.C2675s.m7239c(r4)     // Catch:{ all -> 0x027e }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x027e }
            r0 = 7
            r15.<init>(r0)     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.C3164d.m9228a(r9, r15)     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.C3164d.m9228a(r10, r15)     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.C3164d.m9228a(r4, r15)     // Catch:{ all -> 0x027e }
            int[] r16 = androidx.media3.exoplayer.hls.C3164d.f9388a     // Catch:{ all -> 0x027e }
        L_0x0081:
            if (r3 >= r0) goto L_0x008c
            r0 = r16[r3]     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.C3164d.m9228a(r0, r15)     // Catch:{ all -> 0x027e }
            int r3 = r3 + 1
            r0 = 7
            goto L_0x0081
        L_0x008c:
            r0 = 0
            r13.f11568e = r0     // Catch:{ all -> 0x027e }
            r3 = 0
            r17 = 0
        L_0x0092:
            int r0 = r15.size()     // Catch:{ all -> 0x027e }
            if (r3 >= r0) goto L_0x01c5
            java.lang.Object r0 = r15.get(r3)     // Catch:{ all -> 0x027e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x027e }
            int r0 = r0.intValue()     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x0188
            r12 = 1
            if (r0 == r12) goto L_0x017a
            r12 = 2
            if (r0 == r12) goto L_0x016c
            r12 = 7
            if (r0 == r12) goto L_0x015c
            r12 = 8
            if (r0 == r12) goto L_0x0120
            r12 = 11
            if (r0 == r12) goto L_0x00d3
            r12 = 13
            if (r0 == r12) goto L_0x00c4
            r20 = r5
            r21 = r6
            r19 = r15
            r2 = 0
            r12 = 0
        L_0x00c1:
            r15 = 0
            goto L_0x0195
        L_0x00c4:
            androidx.media3.exoplayer.hls.ad r12 = new androidx.media3.exoplayer.hls.ad     // Catch:{ all -> 0x027e }
            r19 = r15
            java.lang.String r15 = r8.f7487e     // Catch:{ all -> 0x027e }
            r12.<init>(r15, r14)     // Catch:{ all -> 0x027e }
            r20 = r5
        L_0x00cf:
            r21 = r6
            r2 = 0
            goto L_0x00c1
        L_0x00d3:
            r19 = r15
            if (r11 == 0) goto L_0x00db
            r12 = 48
            r15 = r11
            goto L_0x00f2
        L_0x00db:
            androidx.media3.common.w r12 = new androidx.media3.common.w     // Catch:{ all -> 0x027e }
            r12.<init>()     // Catch:{ all -> 0x027e }
            java.lang.String r15 = "application/cea-608"
            r12.f7459k = r15     // Catch:{ all -> 0x027e }
            androidx.media3.common.x r15 = new androidx.media3.common.x     // Catch:{ all -> 0x027e }
            r15.<init>(r12)     // Catch:{ all -> 0x027e }
            java.util.List r12 = java.util.Collections.singletonList(r15)     // Catch:{ all -> 0x027e }
            r15 = 16
            r15 = r12
            r12 = 16
        L_0x00f2:
            java.lang.String r2 = r8.f7493k     // Catch:{ all -> 0x027e }
            boolean r20 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x027e }
            if (r20 != 0) goto L_0x0111
            r20 = r5
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r5 = androidx.media3.common.C2598ay.m6812k(r2, r5)     // Catch:{ all -> 0x027e }
            if (r5 != 0) goto L_0x0106
            r12 = r12 | 2
        L_0x0106:
            java.lang.String r5 = "video/avc"
            boolean r2 = androidx.media3.common.C2598ay.m6812k(r2, r5)     // Catch:{ all -> 0x027e }
            if (r2 != 0) goto L_0x0113
            r12 = r12 | 4
            goto L_0x0113
        L_0x0111:
            r20 = r5
        L_0x0113:
            androidx.media3.extractor.k.an r2 = new androidx.media3.extractor.k.an     // Catch:{ all -> 0x027e }
            androidx.media3.extractor.k.g r5 = new androidx.media3.extractor.k.g     // Catch:{ all -> 0x027e }
            r5.<init>(r12, r15)     // Catch:{ all -> 0x027e }
            r12 = 2
            r2.<init>(r12, r14, r5)     // Catch:{ all -> 0x027e }
            r12 = r2
            goto L_0x00cf
        L_0x0120:
            r20 = r5
            r19 = r15
            androidx.media3.extractor.h.o r12 = new androidx.media3.extractor.h.o     // Catch:{ all -> 0x027e }
            androidx.media3.common.Metadata r2 = r8.f7494l     // Catch:{ all -> 0x027e }
            if (r2 != 0) goto L_0x012c
        L_0x012a:
            r2 = 0
            goto L_0x014b
        L_0x012c:
            r5 = 0
        L_0x012d:
            androidx.media3.common.Metadata$Entry[] r15 = r2.f7056a     // Catch:{ all -> 0x027e }
            r18 = r2
            int r2 = r15.length     // Catch:{ all -> 0x027e }
            if (r5 >= r2) goto L_0x012a
            r2 = r15[r5]     // Catch:{ all -> 0x027e }
            boolean r15 = r2 instanceof androidx.media3.exoplayer.hls.HlsTrackMetadataEntry     // Catch:{ all -> 0x027e }
            if (r15 == 0) goto L_0x0146
            androidx.media3.exoplayer.hls.HlsTrackMetadataEntry r2 = (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry) r2     // Catch:{ all -> 0x027e }
            java.util.List r2 = r2.f9213c     // Catch:{ all -> 0x027e }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x027e }
            if (r2 != 0) goto L_0x012a
            r2 = 4
            goto L_0x014b
        L_0x0146:
            int r5 = r5 + 1
            r2 = r18
            goto L_0x012d
        L_0x014b:
            if (r11 == 0) goto L_0x0150
            r5 = r11
        L_0x014e:
            r15 = 0
            goto L_0x0155
        L_0x0150:
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ all -> 0x027e }
            goto L_0x014e
        L_0x0155:
            r12.<init>(r2, r14, r5, r15)     // Catch:{ all -> 0x027e }
            r21 = r6
            r2 = 0
            goto L_0x0195
        L_0x015c:
            r20 = r5
            r19 = r15
            r15 = 0
            androidx.media3.extractor.g.d r12 = new androidx.media3.extractor.g.d     // Catch:{ all -> 0x027e }
            r21 = r6
            r2 = 0
            r5 = 0
            r12.<init>(r2, r5)     // Catch:{ all -> 0x027e }
            goto L_0x0195
        L_0x016c:
            r20 = r5
            r21 = r6
            r19 = r15
            r2 = 0
            r15 = 0
            androidx.media3.extractor.k.e r12 = new androidx.media3.extractor.k.e     // Catch:{ all -> 0x027e }
            r12.<init>(r2)     // Catch:{ all -> 0x027e }
            goto L_0x0195
        L_0x017a:
            r20 = r5
            r21 = r6
            r19 = r15
            r2 = 0
            r15 = 0
            androidx.media3.extractor.k.c r12 = new androidx.media3.extractor.k.c     // Catch:{ all -> 0x027e }
            r12.<init>()     // Catch:{ all -> 0x027e }
            goto L_0x0195
        L_0x0188:
            r20 = r5
            r21 = r6
            r19 = r15
            r2 = 0
            r15 = 0
            androidx.media3.extractor.k.a r12 = new androidx.media3.extractor.k.a     // Catch:{ all -> 0x027e }
            r12.<init>()     // Catch:{ all -> 0x027e }
        L_0x0195:
            r12.getClass()
            boolean r5 = androidx.media3.exoplayer.hls.C3164d.m9229b(r12, r13)     // Catch:{ all -> 0x027e }
            if (r5 == 0) goto L_0x01a4
            androidx.media3.exoplayer.hls.b r4 = new androidx.media3.exoplayer.hls.b     // Catch:{ all -> 0x027e }
            r4.<init>(r12, r8, r14)     // Catch:{ all -> 0x027e }
            goto L_0x01d4
        L_0x01a4:
            r5 = r17
            if (r5 != 0) goto L_0x01b5
            if (r0 == r9) goto L_0x01b2
            if (r0 == r10) goto L_0x01b2
            if (r0 == r4) goto L_0x01b2
            r6 = 11
            if (r0 != r6) goto L_0x01b5
        L_0x01b2:
            r17 = r12
            goto L_0x01b7
        L_0x01b5:
            r17 = r5
        L_0x01b7:
            int r3 = r3 + 1
            r12 = r24
            r2 = r25
            r15 = r19
            r5 = r20
            r6 = r21
            goto L_0x0092
        L_0x01c5:
            r20 = r5
            r21 = r6
            r5 = r17
            r2 = 0
            androidx.media3.exoplayer.hls.b r4 = new androidx.media3.exoplayer.hls.b     // Catch:{ all -> 0x027e }
            r5.getClass()
            r4.<init>(r5, r8, r14)     // Catch:{ all -> 0x027e }
        L_0x01d4:
            r1.f9429H = r4     // Catch:{ all -> 0x027e }
            boolean r0 = r4.mo7160d()     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x01f6
            androidx.media3.exoplayer.hls.y r0 = r1.f9438f     // Catch:{ all -> 0x027e }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x01f0
            androidx.media3.common.b.ah r3 = r1.f9422A     // Catch:{ all -> 0x027e }
            r4 = r21
            long r3 = r3.mo6180b(r4)     // Catch:{ all -> 0x027e }
            goto L_0x01f2
        L_0x01f0:
            long r3 = r1.f8851q     // Catch:{ all -> 0x027e }
        L_0x01f2:
            r0.mo7185r(r3)     // Catch:{ all -> 0x027e }
            goto L_0x01fd
        L_0x01f6:
            androidx.media3.exoplayer.hls.y r0 = r1.f9438f     // Catch:{ all -> 0x027e }
            r3 = 0
            r0.mo7185r(r3)     // Catch:{ all -> 0x027e }
        L_0x01fd:
            androidx.media3.exoplayer.hls.y r0 = r1.f9438f     // Catch:{ all -> 0x027e }
            java.util.Set r0 = r0.f9517j     // Catch:{ all -> 0x027e }
            r0.clear()     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.p r0 = r1.f9429H     // Catch:{ all -> 0x027e }
            androidx.media3.exoplayer.hls.y r3 = r1.f9438f     // Catch:{ all -> 0x027e }
            r0.mo7158b(r3)     // Catch:{ all -> 0x027e }
            goto L_0x020f
        L_0x020c:
            r20 = r5
            r2 = 0
        L_0x020f:
            androidx.media3.exoplayer.hls.y r0 = r1.f9438f     // Catch:{ all -> 0x027e }
            androidx.media3.common.DrmInitData r3 = r1.f9424C     // Catch:{ all -> 0x027e }
            androidx.media3.common.DrmInitData r4 = r0.f9486C     // Catch:{ all -> 0x027e }
            boolean r4 = androidx.media3.common.p136b.C2612ak.m6951aa(r4, r3)     // Catch:{ all -> 0x027e }
            if (r4 != 0) goto L_0x0234
            r0.f9486C = r3     // Catch:{ all -> 0x027e }
        L_0x021d:
            androidx.media3.exoplayer.hls.x[] r4 = r0.f9516i     // Catch:{ all -> 0x027e }
            int r5 = r4.length     // Catch:{ all -> 0x027e }
            if (r2 >= r5) goto L_0x0234
            boolean[] r5 = r0.f9531x     // Catch:{ all -> 0x027e }
            boolean r5 = r5[r2]     // Catch:{ all -> 0x027e }
            if (r5 == 0) goto L_0x0230
            r4 = r4[r2]     // Catch:{ all -> 0x027e }
            r4.f9481a = r3     // Catch:{ all -> 0x027e }
            r5 = 1
            r4.f9046h = r5     // Catch:{ all -> 0x027e }
            goto L_0x0231
        L_0x0230:
            r5 = 1
        L_0x0231:
            int r2 = r2 + 1
            goto L_0x021d
        L_0x0234:
            if (r20 != 0) goto L_0x0237
            goto L_0x023c
        L_0x0237:
            int r0 = r1.f9430I     // Catch:{ all -> 0x027e }
            r13.mo7639q(r0)     // Catch:{ all -> 0x027e }
        L_0x023c:
            boolean r0 = r1.f9432K     // Catch:{ EOFException -> 0x0257, all -> 0x0253 }
            if (r0 != 0) goto L_0x0248
            androidx.media3.exoplayer.hls.p r0 = r1.f9429H     // Catch:{ EOFException -> 0x0257, all -> 0x0253 }
            boolean r0 = r0.mo7162f(r13)     // Catch:{ EOFException -> 0x0257, all -> 0x0253 }
            if (r0 != 0) goto L_0x023c
        L_0x0248:
            long r2 = r13.f11566c     // Catch:{ all -> 0x027e }
            r4 = r25
            long r4 = r4.f6896f     // Catch:{ all -> 0x027e }
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch:{ all -> 0x027e }
            r1.f9430I = r0     // Catch:{ all -> 0x027e }
            goto L_0x026f
        L_0x0253:
            r0 = move-exception
            r4 = r25
            goto L_0x0275
        L_0x0257:
            r0 = move-exception
            r4 = r25
            androidx.media3.common.x r2 = r1.f8848n     // Catch:{ all -> 0x0274 }
            int r2 = r2.f7489g     // Catch:{ all -> 0x0274 }
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0273
            androidx.media3.exoplayer.hls.p r0 = r1.f9429H     // Catch:{ all -> 0x0274 }
            r0.mo7159c()     // Catch:{ all -> 0x0274 }
            long r2 = r13.f11566c     // Catch:{ all -> 0x027e }
            long r4 = r4.f6896f     // Catch:{ all -> 0x027e }
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch:{ all -> 0x027e }
            r1.f9430I = r0     // Catch:{ all -> 0x027e }
        L_0x026f:
            androidx.media3.p132b.C2508l.m6614a(r24)
            return
        L_0x0273:
            throw r0     // Catch:{ all -> 0x0274 }
        L_0x0274:
            r0 = move-exception
        L_0x0275:
            long r2 = r13.f11566c     // Catch:{ all -> 0x027e }
            long r4 = r4.f6896f     // Catch:{ all -> 0x027e }
            long r2 = r2 - r4
            int r3 = (int) r2     // Catch:{ all -> 0x027e }
            r1.f9430I = r3     // Catch:{ all -> 0x027e }
            throw r0     // Catch:{ all -> 0x027e }
        L_0x027e:
            r0 = move-exception
            androidx.media3.p132b.C2508l.m6614a(r24)
            goto L_0x0284
        L_0x0283:
            throw r0
        L_0x0284:
            goto L_0x0283
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3175o.m9249i(androidx.media3.b.i, androidx.media3.b.n, boolean, boolean):void");
    }
}
