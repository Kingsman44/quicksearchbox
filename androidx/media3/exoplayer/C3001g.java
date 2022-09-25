package androidx.media3.exoplayer;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.p134c.C2529g;

/* renamed from: androidx.media3.exoplayer.g */
/* compiled from: PG */
public abstract class C3001g implements C2893cv, C2894cw {

    /* renamed from: a */
    public C2895cx f8680a;

    /* renamed from: b */
    public C2731bt f8681b;

    /* renamed from: c */
    public int f8682c;

    /* renamed from: d */
    public C3095cf f8683d;

    /* renamed from: e */
    public boolean f8684e;

    /* renamed from: f */
    private final int f8685f;

    /* renamed from: g */
    private final C2874cc f8686g = new C2874cc();

    /* renamed from: h */
    private int f8687h;

    /* renamed from: i */
    private C2680x[] f8688i;

    /* renamed from: j */
    private long f8689j;

    /* renamed from: k */
    private long f8690k = Long.MIN_VALUE;

    /* renamed from: l */
    private boolean f8691l;

    public C3001g(int i) {
        this.f8685f = i;
    }

    /* renamed from: M */
    private final void m8543M(long j, boolean z) {
        this.f8684e = false;
        this.f8690k = j;
        mo6529s(j, z);
    }

    /* renamed from: A */
    public final void mo6680A() {
        this.f8684e = true;
    }

    /* renamed from: B */
    public /* synthetic */ void mo6681B(float f, float f2) {
    }

    /* renamed from: C */
    public final void mo6682C() {
        boolean z = true;
        if (this.f8682c != 1) {
            z = false;
        }
        C2601a.m6832d(z);
        this.f8682c = 2;
        mo6531u();
    }

    /* renamed from: D */
    public final void mo6683D() {
        C2601a.m6832d(this.f8682c == 2);
        this.f8682c = 1;
        mo6532v();
    }

    /* renamed from: E */
    public final boolean mo6684E() {
        return this.f8690k == Long.MIN_VALUE;
    }

    /* renamed from: F */
    public final boolean mo6685F() {
        return this.f8684e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final C2680x[] mo6931G() {
        C2680x[] xVarArr = this.f8688i;
        xVarArr.getClass();
        return xVarArr;
    }

    /* renamed from: e */
    public int mo6700e() {
        return 0;
    }

    /* renamed from: eU */
    public final int mo6687eU() {
        return this.f8682c;
    }

    /* renamed from: eV */
    public final int mo6688eV() {
        return this.f8685f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: eW */
    public final int mo6933eW(C2874cc ccVar, C2529g gVar, int i) {
        C3095cf cfVar = this.f8683d;
        cfVar.getClass();
        int a = cfVar.mo6843a(ccVar, gVar, i);
        if (a == -4) {
            if (gVar.mo5954fh(4)) {
                this.f8690k = Long.MIN_VALUE;
                if (this.f8684e) {
                    return -4;
                }
                return -3;
            }
            long j = gVar.f6957e + this.f8689j;
            gVar.f6957e = j;
            this.f8690k = Math.max(this.f8690k, j);
            return a;
        } else if (a != -5) {
            return a;
        } else {
            C2680x xVar = ccVar.f8096a;
            xVar.getClass();
            long j2 = xVar.f7500r;
            if (j2 == Long.MAX_VALUE) {
                return -5;
            }
            C2679w wVar = new C2679w(xVar);
            wVar.f7463o = j2 + this.f8689j;
            ccVar.f8096a = new C2680x(wVar);
            return -5;
        }
    }

    /* renamed from: f */
    public final long mo6689f() {
        return this.f8690k;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.exoplayer.C3267o mo6934g(java.lang.Throwable r14, androidx.media3.common.C2680x r15, boolean r16, int r17) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            r2 = 4
            if (r0 == 0) goto L_0x001d
            boolean r3 = r1.f8691l
            if (r3 != 0) goto L_0x001d
            r3 = 1
            r1.f8691l = r3
            r3 = 0
            int r4 = r13.mo6699L(r15)     // Catch:{ o -> 0x001b, all -> 0x0016 }
            r4 = r4 & 7
            r1.f8691l = r3
            goto L_0x001e
        L_0x0016:
            r0 = move-exception
            r2 = r0
            r1.f8691l = r3
            throw r2
        L_0x001b:
            r1.f8691l = r3
        L_0x001d:
            r4 = 4
        L_0x001e:
            java.lang.String r7 = r13.mo6504H()
            int r8 = r1.f8687h
            if (r0 != 0) goto L_0x0028
            r10 = 4
            goto L_0x0029
        L_0x0028:
            r10 = r4
        L_0x0029:
            androidx.media3.exoplayer.o r12 = new androidx.media3.exoplayer.o
            r3 = 1
            r5 = 0
            r2 = r12
            r4 = r14
            r6 = r17
            r9 = r15
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C3001g.mo6934g(java.lang.Throwable, androidx.media3.common.x, boolean, int):androidx.media3.exoplayer.o");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C2874cc mo6935h() {
        C2874cc ccVar = this.f8686g;
        ccVar.f8097b = null;
        ccVar.f8096a = null;
        return ccVar;
    }

    /* renamed from: i */
    public C2876ce mo6525i() {
        return null;
    }

    /* renamed from: j */
    public final C2894cw mo6690j() {
        return this;
    }

    /* renamed from: k */
    public final C3095cf mo6691k() {
        return this.f8683d;
    }

    /* renamed from: l */
    public final void mo6692l() {
        boolean z = true;
        if (this.f8682c != 1) {
            z = false;
        }
        C2601a.m6832d(z);
        C2874cc ccVar = this.f8686g;
        ccVar.f8097b = null;
        ccVar.f8096a = null;
        this.f8682c = 0;
        this.f8683d = null;
        this.f8688i = null;
        this.f8684e = false;
        mo6527q();
    }

    /* renamed from: m */
    public final void mo6693m(C2895cx cxVar, C2680x[] xVarArr, C3095cf cfVar, long j, boolean z, boolean z2, long j2, long j3) {
        boolean z3 = z;
        C2601a.m6832d(this.f8682c == 0);
        this.f8680a = cxVar;
        this.f8682c = 1;
        mo6528r(z, z2);
        mo6696x(xVarArr, cfVar, j2, j3);
        long j4 = j;
        m8543M(j, z);
    }

    /* renamed from: n */
    public void mo6526n(int i, Object obj) {
    }

    /* renamed from: o */
    public final void mo6694o(int i, C2731bt btVar) {
        this.f8687h = i;
        this.f8681b = btVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo6527q() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo6528r(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo6529s(long j, boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo6530t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo6531u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo6532v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo6920w(C2680x[] xVarArr, long j, long j2) {
        throw null;
    }

    /* renamed from: x */
    public final void mo6696x(C2680x[] xVarArr, C3095cf cfVar, long j, long j2) {
        C2601a.m6832d(!this.f8684e);
        this.f8683d = cfVar;
        if (this.f8690k == Long.MIN_VALUE) {
            this.f8690k = j;
        }
        this.f8688i = xVarArr;
        this.f8689j = j2;
        mo6920w(xVarArr, j, j2);
    }

    /* renamed from: y */
    public final void mo6697y() {
        C2601a.m6832d(this.f8682c == 0);
        C2874cc ccVar = this.f8686g;
        ccVar.f8097b = null;
        ccVar.f8096a = null;
        mo6530t();
    }

    /* renamed from: z */
    public final void mo6698z(long j) {
        m8543M(j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo6932d(long j) {
        C3095cf cfVar = this.f8683d;
        cfVar.getClass();
        return cfVar.mo6844b(j - this.f8689j);
    }

    /* renamed from: p */
    public final void mo6695p() {
        C3095cf cfVar = this.f8683d;
        cfVar.getClass();
        cfVar.mo6848fd();
    }
}
