package androidx.media3.exoplayer.p145h.p147b;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.dash.C2936e;
import androidx.media3.exoplayer.dash.C2951t;
import androidx.media3.exoplayer.dash.C2953v;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3094ce;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.exoplayer.p145h.C3096cg;
import androidx.media3.exoplayer.p145h.C3097ch;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3253s;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2510n;
import androidx.media3.p134c.C2529g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.h.b.j */
/* compiled from: PG */
public final class C3054j implements C3095cf, C3097ch, C3249o, C3253s {

    /* renamed from: a */
    public final int f8861a;

    /* renamed from: b */
    public final int[] f8862b;

    /* renamed from: c */
    public final C2680x[] f8863c;

    /* renamed from: d */
    public final boolean[] f8864d;

    /* renamed from: e */
    public final C3055k f8865e;

    /* renamed from: f */
    public final C3065bc f8866f;

    /* renamed from: g */
    public final C3256v f8867g;

    /* renamed from: h */
    public final ArrayList f8868h;

    /* renamed from: i */
    public final C3094ce f8869i;

    /* renamed from: j */
    public final C3094ce[] f8870j;

    /* renamed from: k */
    public long f8871k;

    /* renamed from: l */
    public long f8872l;

    /* renamed from: m */
    public int f8873m;

    /* renamed from: n */
    public C3045a f8874n;

    /* renamed from: o */
    public boolean f8875o;

    /* renamed from: p */
    private final C3096cg f8876p;

    /* renamed from: q */
    private final C3051g f8877q;

    /* renamed from: r */
    private final List f8878r;

    /* renamed from: s */
    private final C3047c f8879s;

    /* renamed from: t */
    private C3050f f8880t;

    /* renamed from: u */
    private C2680x f8881u;

    /* renamed from: v */
    private C3053i f8882v;

    public C3054j(int i, int[] iArr, C2680x[] xVarArr, C3055k kVar, C3096cg cgVar, C3241g gVar, long j, C2868k kVar2, C2862e eVar, C3065bc bcVar) {
        this.f8861a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f8862b = iArr;
        this.f8863c = xVarArr == null ? new C2680x[0] : xVarArr;
        this.f8865e = kVar;
        this.f8876p = cgVar;
        this.f8866f = bcVar;
        this.f8867g = new C3256v("ChunkSampleStream");
        this.f8877q = new C3051g();
        ArrayList arrayList = new ArrayList();
        this.f8868h = arrayList;
        this.f8878r = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f8870j = new C3094ce[length];
        this.f8864d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C3094ce[] ceVarArr = new C3094ce[i3];
        C3094ce D = C3094ce.m8931D(gVar, kVar2, eVar);
        this.f8869i = D;
        iArr2[0] = i;
        ceVarArr[0] = D;
        while (i2 < length) {
            C3094ce ceVar = new C3094ce(gVar, (C2868k) null);
            this.f8870j[i2] = ceVar;
            int i4 = i2 + 1;
            ceVarArr[i4] = ceVar;
            iArr2[i4] = this.f8862b[i2];
            i2 = i4;
        }
        this.f8879s = new C3047c(iArr2, ceVarArr);
        this.f8871k = j;
        this.f8872l = j;
    }

    /* renamed from: j */
    private final C3045a m8734j(int i) {
        C3045a aVar = (C3045a) this.f8868h.get(i);
        ArrayList arrayList = this.f8868h;
        C2612ak.m6942Y(arrayList, i, arrayList.size());
        this.f8873m = Math.max(this.f8873m, this.f8868h.size());
        int i2 = 0;
        this.f8869i.mo7082r(aVar.mo6979a(0));
        while (true) {
            C3094ce[] ceVarArr = this.f8870j;
            if (i2 >= ceVarArr.length) {
                return aVar;
            }
            int i3 = i2 + 1;
            ceVarArr[i2].mo7082r(aVar.mo6979a(i3));
            i2 = i3;
        }
    }

    /* renamed from: k */
    private final C3045a m8735k() {
        ArrayList arrayList = this.f8868h;
        return (C3045a) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: p */
    private final void m8736p() {
        C3094ce ceVar = this.f8869i;
        int e = mo6991e(ceVar.f9043e + ceVar.f9044f, this.f8873m - 1);
        while (true) {
            int i = this.f8873m;
            if (i <= e) {
                this.f8873m = i + 1;
                C3045a aVar = (C3045a) this.f8868h.get(i);
                C2680x xVar = aVar.f8848n;
                if (!xVar.equals(this.f8881u)) {
                    C3065bc bcVar = this.f8866f;
                    int i2 = this.f8861a;
                    int i3 = aVar.f8849o;
                    Object obj = aVar.f8850p;
                    bcVar.mo7016o(i2, xVar, i3, aVar.f8851q);
                }
                this.f8881u = xVar;
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    private final boolean m8737q(int i) {
        C3094ce ceVar;
        C3045a aVar = (C3045a) this.f8868h.get(i);
        C3094ce ceVar2 = this.f8869i;
        if (ceVar2.f9043e + ceVar2.f9044f > aVar.mo6979a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C3094ce[] ceVarArr = this.f8870j;
            if (i2 >= ceVarArr.length) {
                return false;
            }
            ceVar = ceVarArr[i2];
            i2++;
        } while (ceVar.f9043e + ceVar.f9044f <= aVar.mo6979a(i2));
        return true;
    }

    /* renamed from: a */
    public final int mo6843a(C2874cc ccVar, C2529g gVar, int i) {
        if (mo6994i()) {
            return -3;
        }
        C3045a aVar = this.f8874n;
        if (aVar != null) {
            int a = aVar.mo6979a(0);
            C3094ce ceVar = this.f8869i;
            if (a <= ceVar.f9043e + ceVar.f9044f) {
                return -3;
            }
        }
        m8736p();
        return this.f8869i.mo7074j(ccVar, gVar, i, this.f8875o);
    }

    /* renamed from: b */
    public final int mo6844b(long j) {
        if (mo6994i()) {
            return 0;
        }
        int h = this.f8869i.mo7072h(j, this.f8875o);
        C3045a aVar = this.f8874n;
        if (aVar != null) {
            int a = aVar.mo6979a(0);
            C3094ce ceVar = this.f8869i;
            h = Math.min(h, a - (ceVar.f9043e + ceVar.f9044f));
        }
        this.f8869i.mo7088y(h);
        m8736p();
        return h;
    }

    /* renamed from: c */
    public final long mo6808c() {
        if (this.f8875o) {
            return Long.MIN_VALUE;
        }
        if (mo6994i()) {
            return this.f8871k;
        }
        long j = this.f8872l;
        C3045a k = m8735k();
        if (!k.mo6998d()) {
            if (this.f8868h.size() > 1) {
                ArrayList arrayList = this.f8868h;
                k = (C3045a) arrayList.get(arrayList.size() - 2);
            } else {
                k = null;
            }
        }
        if (k != null) {
            j = Math.max(j, k.f8852r);
        }
        return Math.max(j, this.f8869i.mo7077m());
    }

    /* renamed from: d */
    public final long mo6809d() {
        if (mo6994i()) {
            return this.f8871k;
        }
        if (this.f8875o) {
            return Long.MIN_VALUE;
        }
        return m8735k().f8852r;
    }

    /* renamed from: e */
    public final int mo6991e(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f8868h.size()) {
                return this.f8868h.size() - 1;
            }
        } while (((C3045a) this.f8868h.get(i2)).mo6979a(0) <= i);
        return i2 - 1;
    }

    /* renamed from: eX */
    public final /* bridge */ /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        C3050f fVar = (C3050f) rVar;
        this.f8880t = null;
        this.f8874n = null;
        long j = fVar.f8845k;
        C2510n nVar = fVar.f8846l;
        C2493al alVar = fVar.f8853s;
        C3027aj ajVar = new C3027aj(nVar, (byte[]) null);
        C3065bc bcVar = this.f8866f;
        int i = fVar.f8847m;
        int i2 = this.f8861a;
        C2680x xVar = fVar.f8848n;
        int i3 = fVar.f8849o;
        Object obj = fVar.f8850p;
        bcVar.mo7017p(ajVar, i, i2, xVar, i3, fVar.f8851q, fVar.f8852r);
        if (!z) {
            if (mo6994i()) {
                mo6993h();
            } else if (fVar instanceof C3045a) {
                m8734j(this.f8868h.size() - 1);
                if (this.f8868h.isEmpty()) {
                    this.f8871k = this.f8872l;
                }
            }
            ((C2936e) this.f8876p).mo6821p();
        }
    }

    /* renamed from: f */
    public final boolean mo6847f() {
        return !mo6994i() && this.f8869i.mo7068A(this.f8875o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* renamed from: fb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo6826fb(androidx.media3.exoplayer.p151k.C3252r r18, long r19, long r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.media3.exoplayer.h.b.f r1 = (androidx.media3.exoplayer.p145h.p147b.C3050f) r1
            r2 = 0
            r0.f8880t = r2
            androidx.media3.exoplayer.h.b.k r3 = r0.f8865e
            boolean r4 = r1 instanceof androidx.media3.exoplayer.p145h.p147b.C3058n
            if (r4 == 0) goto L_0x0051
            r4 = r1
            androidx.media3.exoplayer.h.b.n r4 = (androidx.media3.exoplayer.p145h.p147b.C3058n) r4
            r5 = r3
            androidx.media3.exoplayer.dash.v r5 = (androidx.media3.exoplayer.dash.C2953v) r5
            androidx.media3.exoplayer.j.ad r6 = r5.f8470h
            androidx.media3.common.x r4 = r4.f8848n
            int r4 = r6.mo7031i(r4)
            androidx.media3.exoplayer.dash.t[] r5 = r5.f8469g
            r6 = r5[r4]
            androidx.media3.exoplayer.dash.p r7 = r6.f8458c
            if (r7 != 0) goto L_0x0051
            androidx.media3.exoplayer.h.b.e r13 = r6.f8461f
            androidx.media3.extractor.bb r7 = r13.f8837b
            boolean r8 = r7 instanceof androidx.media3.extractor.C3625o
            if (r8 == 0) goto L_0x0030
            androidx.media3.extractor.o r7 = (androidx.media3.extractor.C3625o) r7
            goto L_0x0031
        L_0x0030:
            r7 = r2
        L_0x0031:
            if (r7 == 0) goto L_0x0051
            androidx.media3.exoplayer.dash.r r14 = new androidx.media3.exoplayer.dash.r
            androidx.media3.exoplayer.dash.a.m r11 = r6.f8456a
            long r8 = r11.f8368d
            r14.<init>(r7, r8)
            androidx.media3.exoplayer.dash.t r7 = new androidx.media3.exoplayer.dash.t
            long r9 = r6.f8459d
            androidx.media3.exoplayer.dash.a.b r12 = r6.f8457b
            r19 = r3
            long r2 = r6.f8460e
            r8 = r7
            r6 = r14
            r14 = r2
            r16 = r6
            r8.<init>(r9, r11, r12, r13, r14, r16)
            r5[r4] = r7
            goto L_0x0053
        L_0x0051:
            r19 = r3
        L_0x0053:
            r3 = r19
            androidx.media3.exoplayer.dash.v r3 = (androidx.media3.exoplayer.dash.C2953v) r3
            androidx.media3.exoplayer.dash.y r2 = r3.f8468f
            if (r2 == 0) goto L_0x0075
            long r3 = r2.f8487b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x006c
            long r5 = r1.f8852r
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0070
        L_0x006c:
            long r3 = r1.f8852r
            r2.f8487b = r3
        L_0x0070:
            androidx.media3.exoplayer.dash.z r2 = r2.f8488c
            r3 = 1
            r2.f8495e = r3
        L_0x0075:
            androidx.media3.exoplayer.h.aj r5 = new androidx.media3.exoplayer.h.aj
            long r2 = r1.f8845k
            androidx.media3.b.n r2 = r1.f8846l
            androidx.media3.b.al r3 = r1.f8853s
            r3 = 0
            r5.<init>(r2, r3)
            androidx.media3.exoplayer.h.bc r4 = r0.f8866f
            int r6 = r1.f8847m
            int r7 = r0.f8861a
            androidx.media3.common.x r8 = r1.f8848n
            int r9 = r1.f8849o
            java.lang.Object r2 = r1.f8850p
            long r10 = r1.f8851q
            long r12 = r1.f8852r
            r4.mo7018q(r5, r6, r7, r8, r9, r10, r12)
            androidx.media3.exoplayer.h.cg r1 = r0.f8876p
            androidx.media3.exoplayer.dash.e r1 = (androidx.media3.exoplayer.dash.C2936e) r1
            r1.mo6821p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.p147b.C3054j.mo6826fb(androidx.media3.exoplayer.k.r, long, long):void");
    }

    /* renamed from: fd */
    public final void mo6848fd() {
        this.f8867g.mo7250c(LinearLayoutManager.INVALID_OFFSET);
        this.f8869i.mo7083t();
        if (!this.f8867g.mo7253f()) {
            C2953v vVar = (C2953v) this.f8865e;
            IOException iOException = vVar.f8473k;
            if (iOException == null) {
                vVar.f8463a.mo6828a();
                return;
            }
            throw iOException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0182, code lost:
        if (r2.mo7039q(r2.mo7031i(r1.f8848n), r7.f9769b) == false) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01aa  */
    /* renamed from: fe */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ androidx.media3.exoplayer.p151k.C3250p mo6827fe(androidx.media3.exoplayer.p151k.C3252r r23, java.io.IOException r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            androidx.media3.exoplayer.h.b.f r1 = (androidx.media3.exoplayer.p145h.p147b.C3050f) r1
            androidx.media3.b.al r2 = r1.f8853s
            long r2 = r2.f6845a
            boolean r4 = r1 instanceof androidx.media3.exoplayer.p145h.p147b.C3045a
            java.util.ArrayList r5 = r0.f8868h
            int r5 = r5.size()
            int r5 = r5 + -1
            r8 = 0
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0025
            boolean r2 = r0.m8737q(r5)
            if (r2 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r2 = 0
            goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            androidx.media3.exoplayer.h.aj r11 = new androidx.media3.exoplayer.h.aj
            long r12 = r1.f8845k
            androidx.media3.b.n r3 = r1.f8846l
            androidx.media3.b.al r10 = r1.f8853s
            r15 = 0
            r11.<init>(r3, r15)
            int r3 = r1.f8847m
            androidx.media3.common.x r3 = r1.f8848n
            int r3 = r1.f8849o
            java.lang.Object r3 = r1.f8850p
            long r12 = r1.f8851q
            int r3 = androidx.media3.common.p136b.C2612ak.f7249a
            long r12 = r1.f8852r
            androidx.media3.exoplayer.k.n r3 = new androidx.media3.exoplayer.k.n
            r14 = r24
            r10 = r25
            r3.<init>(r14, r10)
            androidx.media3.exoplayer.h.b.k r10 = r0.f8865e
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x0055
            r2 = r15
            goto L_0x01c4
        L_0x0055:
            androidx.media3.exoplayer.dash.v r10 = (androidx.media3.exoplayer.dash.C2953v) r10
            androidx.media3.exoplayer.dash.y r2 = r10.f8468f
            if (r2 == 0) goto L_0x007e
            long r6 = r2.f8487b
            int r17 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r17 == 0) goto L_0x0069
            long r12 = r1.f8851q
            int r19 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r19 >= 0) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            androidx.media3.exoplayer.dash.z r2 = r2.f8488c
            androidx.media3.exoplayer.dash.a.c r7 = r2.f8494d
            boolean r7 = r7.f8319d
            if (r7 != 0) goto L_0x0073
            goto L_0x007e
        L_0x0073:
            boolean r7 = r2.f8496f
            if (r7 != 0) goto L_0x01a6
            if (r6 == 0) goto L_0x007e
            r2.mo6855a()
            goto L_0x01a6
        L_0x007e:
            androidx.media3.exoplayer.dash.a.c r2 = r10.f8471i
            boolean r2 = r2.f8319d
            if (r2 != 0) goto L_0x00c6
            boolean r2 = r1 instanceof androidx.media3.exoplayer.p145h.p147b.C3059o
            if (r2 == 0) goto L_0x00c6
            java.io.IOException r2 = r3.f9770a
            boolean r6 = r2 instanceof androidx.media3.p132b.C2486ae
            if (r6 == 0) goto L_0x00c6
            androidx.media3.b.ae r2 = (androidx.media3.p132b.C2486ae) r2
            int r2 = r2.f6832d
            r6 = 404(0x194, float:5.66E-43)
            if (r2 != r6) goto L_0x00c6
            androidx.media3.exoplayer.dash.t[] r2 = r10.f8469g
            androidx.media3.exoplayer.j.ad r6 = r10.f8470h
            androidx.media3.common.x r7 = r1.f8848n
            int r6 = r6.mo7031i(r7)
            r2 = r2[r6]
            long r6 = r2.mo6832d()
            r12 = -1
            int r19 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r19 == 0) goto L_0x00c6
            int r19 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r19 == 0) goto L_0x00c6
            long r8 = r2.mo6830b()
            r2 = r1
            androidx.media3.exoplayer.h.b.o r2 = (androidx.media3.exoplayer.p145h.p147b.C3059o) r2
            long r19 = r2.mo6999k()
            long r8 = r8 + r6
            long r8 = r8 + r12
            int r2 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c6
            r2 = 1
            r10.f8474l = r2
            goto L_0x01a6
        L_0x00c6:
            androidx.media3.exoplayer.j.ad r2 = r10.f8470h
            androidx.media3.common.x r6 = r1.f8848n
            int r2 = r2.mo7031i(r6)
            androidx.media3.exoplayer.dash.t[] r6 = r10.f8469g
            r2 = r6[r2]
            androidx.media3.exoplayer.dash.b r6 = r10.f8464b
            androidx.media3.exoplayer.dash.a.m r7 = r2.f8456a
            com.google.common.b.gu r7 = r7.f8367c
            androidx.media3.exoplayer.dash.a.b r6 = r6.mo6805a(r7)
            if (r6 == 0) goto L_0x00e6
            androidx.media3.exoplayer.dash.a.b r7 = r2.f8457b
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x01a6
        L_0x00e6:
            androidx.media3.exoplayer.j.ad r6 = r10.f8470h
            androidx.media3.exoplayer.dash.a.m r7 = r2.f8456a
            com.google.common.b.gu r7 = r7.f8367c
            long r8 = android.os.SystemClock.elapsedRealtime()
            int r12 = r6.mo7032j()
            r13 = 0
            r15 = 0
        L_0x00f6:
            if (r13 >= r12) goto L_0x0103
            boolean r20 = r6.mo7040r(r13, r8)
            if (r20 == 0) goto L_0x0100
            int r15 = r15 + 1
        L_0x0100:
            int r13 = r13 + 1
            goto L_0x00f6
        L_0x0103:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r8 = 0
        L_0x0109:
            int r9 = r7.size()
            if (r8 >= r9) goto L_0x0121
            java.lang.Object r9 = r7.get(r8)
            androidx.media3.exoplayer.dash.a.b r9 = (androidx.media3.exoplayer.dash.p141a.C2911b) r9
            int r9 = r9.f8314c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.add(r9)
            int r8 = r8 + 1
            goto L_0x0109
        L_0x0121:
            int r6 = r6.size()
            androidx.media3.exoplayer.k.l r8 = new androidx.media3.exoplayer.k.l
            androidx.media3.exoplayer.dash.b r9 = r10.f8464b
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.List r7 = r9.mo6806b(r7)
            r9 = 0
        L_0x0133:
            int r14 = r7.size()
            if (r9 >= r14) goto L_0x014b
            java.lang.Object r14 = r7.get(r9)
            androidx.media3.exoplayer.dash.a.b r14 = (androidx.media3.exoplayer.dash.p141a.C2911b) r14
            int r14 = r14.f8314c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            int r9 = r9 + 1
            goto L_0x0133
        L_0x014b:
            int r7 = r13.size()
            int r7 = r6 - r7
            r8.<init>(r6, r7, r12, r15)
            r6 = 2
            boolean r7 = r8.mo7242a(r6)
            if (r7 != 0) goto L_0x0163
            r7 = 1
            boolean r9 = r8.mo7242a(r7)
            if (r9 != 0) goto L_0x0163
            goto L_0x01c3
        L_0x0163:
            androidx.media3.exoplayer.k.m r7 = androidx.media3.exoplayer.p151k.C3245k.m9466a(r8, r3)
            if (r7 == 0) goto L_0x01c3
            int r9 = r7.f9768a
            boolean r8 = r8.mo7242a(r9)
            if (r8 != 0) goto L_0x0172
            goto L_0x01c3
        L_0x0172:
            if (r9 != r6) goto L_0x0185
            androidx.media3.exoplayer.j.ad r2 = r10.f8470h
            androidx.media3.common.x r6 = r1.f8848n
            int r6 = r2.mo7031i(r6)
            long r7 = r7.f9769b
            boolean r2 = r2.mo7039q(r6, r7)
            if (r2 != 0) goto L_0x01a6
            goto L_0x01c3
        L_0x0185:
            androidx.media3.exoplayer.dash.b r6 = r10.f8464b
            androidx.media3.exoplayer.dash.a.b r2 = r2.f8457b
            long r7 = r7.f9769b
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 + r7
            java.lang.String r7 = r2.f8313b
            java.util.Map r8 = r6.f8400a
            androidx.media3.exoplayer.dash.C2933b.m8286c(r7, r9, r8)
            int r2 = r2.f8314c
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r7) goto L_0x01a6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.Map r6 = r6.f8401b
            androidx.media3.exoplayer.dash.C2933b.m8286c(r2, r9, r6)
        L_0x01a6:
            androidx.media3.exoplayer.k.p r2 = androidx.media3.exoplayer.p151k.C3256v.f9786b
            if (r4 == 0) goto L_0x01c4
            androidx.media3.exoplayer.h.b.a r4 = r0.m8734j(r5)
            if (r4 != r1) goto L_0x01b2
            r4 = 1
            goto L_0x01b3
        L_0x01b2:
            r4 = 0
        L_0x01b3:
            androidx.media3.common.p136b.C2601a.m6832d(r4)
            java.util.ArrayList r4 = r0.f8868h
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01c4
            long r4 = r0.f8872l
            r0.f8871k = r4
            goto L_0x01c4
        L_0x01c3:
            r2 = 0
        L_0x01c4:
            if (r2 != 0) goto L_0x01dd
            long r2 = androidx.media3.exoplayer.p151k.C3245k.m9468c(r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x01db
            androidx.media3.exoplayer.k.p r4 = new androidx.media3.exoplayer.k.p
            r5 = 0
            r4.<init>(r5, r2)
            r2 = r4
            goto L_0x01dd
        L_0x01db:
            androidx.media3.exoplayer.k.p r2 = androidx.media3.exoplayer.p151k.C3256v.f9787c
        L_0x01dd:
            boolean r3 = r2.mo7243a()
            r4 = 1
            r3 = r3 ^ r4
            androidx.media3.exoplayer.h.bc r10 = r0.f8866f
            int r12 = r1.f8847m
            int r13 = r0.f8861a
            androidx.media3.common.x r14 = r1.f8848n
            int r15 = r1.f8849o
            java.lang.Object r4 = r1.f8850p
            long r4 = r1.f8851q
            long r6 = r1.f8852r
            r8 = 0
            r16 = r4
            r18 = r6
            r20 = r24
            r21 = r3
            r10.mo7019r(r11, r12, r13, r14, r15, r16, r18, r20, r21)
            if (r3 == 0) goto L_0x020c
            r0.f8880t = r8
            long r3 = r1.f8845k
            androidx.media3.exoplayer.h.cg r1 = r0.f8876p
            androidx.media3.exoplayer.dash.e r1 = (androidx.media3.exoplayer.dash.C2936e) r1
            r1.mo6821p()
        L_0x020c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.p147b.C3054j.mo6827fe(androidx.media3.exoplayer.k.r, java.io.IOException, int):androidx.media3.exoplayer.k.p");
    }

    /* renamed from: g */
    public final void mo6992g(C3053i iVar) {
        this.f8882v = iVar;
        C3094ce ceVar = this.f8869i;
        ceVar.mo7081q();
        ceVar.mo7085v();
        for (C3094ce ceVar2 : this.f8870j) {
            ceVar2.mo7081q();
            ceVar2.mo7085v();
        }
        this.f8867g.mo7251d(this);
    }

    /* renamed from: h */
    public final void mo6993h() {
        this.f8869i.mo7086w(false);
        for (C3094ce w : this.f8870j) {
            w.mo7086w(false);
        }
    }

    /* renamed from: i */
    public final boolean mo6994i() {
        return this.f8871k != -9223372036854775807L;
    }

    /* renamed from: l */
    public final void mo6995l() {
        this.f8869i.mo7084u();
        for (C3094ce u : this.f8870j) {
            u.mo7084u();
        }
        for (C2951t tVar : ((C2953v) this.f8865e).f8469g) {
            C3049e eVar = tVar.f8461f;
            if (eVar != null) {
                eVar.f8836a.mo7153c();
            }
        }
        C3053i iVar = this.f8882v;
        if (iVar != null) {
            iVar.mo6817k(this);
        }
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        int i;
        C3256v vVar = this.f8867g;
        if (!vVar.mo7252e() && !mo6994i()) {
            if (vVar.mo7253f()) {
                C3050f fVar = this.f8880t;
                fVar.getClass();
                boolean z = fVar instanceof C3045a;
                if (!z || !m8737q(this.f8868h.size() - 1)) {
                    C3055k kVar = this.f8865e;
                    List list = this.f8878r;
                    C2953v vVar2 = (C2953v) kVar;
                    if (vVar2.f8473k == null && vVar2.f8470h.mo7041s(j, fVar, list)) {
                        this.f8867g.mo7249b();
                        if (z) {
                            this.f8874n = (C3045a) fVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C3055k kVar2 = this.f8865e;
            List list2 = this.f8878r;
            C2953v vVar3 = (C2953v) kVar2;
            if (vVar3.f8473k != null || vVar3.f8470h.mo7032j() < 2) {
                i = list2.size();
            } else {
                i = vVar3.f8470h.mo7025e(j, list2);
            }
            if (i < this.f8868h.size()) {
                C2601a.m6832d(!this.f8867g.mo7253f());
                int size = this.f8868h.size();
                while (true) {
                    if (i < size) {
                        if (!m8737q(i)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    long j2 = m8735k().f8852r;
                    C3045a j3 = m8734j(i);
                    if (this.f8868h.isEmpty()) {
                        this.f8871k = this.f8872l;
                    }
                    this.f8875o = false;
                    this.f8866f.mo7015n(this.f8861a, j3.f8851q, j2);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: androidx.media3.exoplayer.h.b.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: androidx.media3.exoplayer.h.b.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: androidx.media3.exoplayer.h.b.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: androidx.media3.exoplayer.h.b.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01fe  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6819n(long r54) {
        /*
            r53 = this;
            r0 = r53
            boolean r1 = r0.f8875o
            if (r1 != 0) goto L_0x03d0
            androidx.media3.exoplayer.k.v r1 = r0.f8867g
            boolean r2 = r1.mo7253f()
            if (r2 != 0) goto L_0x03d0
            boolean r1 = r1.mo7252e()
            if (r1 == 0) goto L_0x0016
            goto L_0x03d0
        L_0x0016:
            boolean r11 = r53.mo6994i()
            if (r11 == 0) goto L_0x0023
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.f8871k
            goto L_0x002b
        L_0x0023:
            java.util.List r1 = r0.f8878r
            androidx.media3.exoplayer.h.b.a r2 = r53.m8735k()
            long r2 = r2.f8852r
        L_0x002b:
            r12 = r1
            r13 = r2
            androidx.media3.exoplayer.h.b.k r1 = r0.f8865e
            androidx.media3.exoplayer.h.b.g r15 = r0.f8877q
            r9 = r1
            androidx.media3.exoplayer.dash.v r9 = (androidx.media3.exoplayer.dash.C2953v) r9
            java.io.IOException r1 = r9.f8473k
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r1 == 0) goto L_0x0042
        L_0x003e:
            r18 = r11
            goto L_0x0334
        L_0x0042:
            long r16 = r13 - r54
            androidx.media3.exoplayer.dash.a.c r1 = r9.f8471i
            long r1 = r1.f8316a
            long r1 = androidx.media3.common.p136b.C2612ak.m6998w(r1)
            androidx.media3.exoplayer.dash.a.c r3 = r9.f8471i
            int r4 = r9.f8472j
            androidx.media3.exoplayer.dash.a.h r3 = r3.mo6766c(r4)
            long r3 = r3.f8351b
            long r3 = androidx.media3.common.p136b.C2612ak.m6998w(r3)
            long r1 = r1 + r3
            long r1 = r1 + r13
            androidx.media3.exoplayer.dash.y r3 = r9.f8468f
            if (r3 == 0) goto L_0x00aa
            androidx.media3.exoplayer.dash.z r3 = r3.f8488c
            androidx.media3.exoplayer.dash.a.c r4 = r3.f8494d
            boolean r7 = r4.f8319d
            if (r7 != 0) goto L_0x0069
            goto L_0x00aa
        L_0x0069:
            boolean r7 = r3.f8496f
            if (r7 != 0) goto L_0x003e
            r18 = r11
            long r10 = r4.f8323h
            java.util.TreeMap r4 = r3.f8493c
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            java.util.Map$Entry r4 = r4.ceilingEntry(r7)
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r7 = r4.getValue()
            java.lang.Long r7 = (java.lang.Long) r7
            long r10 = r7.longValue()
            int r7 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ac
            java.lang.Object r1 = r4.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            androidx.media3.exoplayer.dash.j r4 = r3.f8499i
            androidx.media3.exoplayer.dash.DashMediaSource r4 = r4.f8448a
            long r9 = r4.f8288m
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00a3
            int r7 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
        L_0x00a3:
            r4.f8288m = r1
        L_0x00a5:
            r3.mo6855a()
            goto L_0x0334
        L_0x00aa:
            r18 = r11
        L_0x00ac:
            long r1 = r9.f8467e
            long r1 = androidx.media3.common.p136b.C2612ak.m6996u(r1)
            long r10 = androidx.media3.common.p136b.C2612ak.m6998w(r1)
            long r3 = r9.mo6840a(r10)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x00c3
            r19 = 0
            goto L_0x00d1
        L_0x00c3:
            int r1 = r12.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r12.get(r1)
            androidx.media3.exoplayer.h.b.o r1 = (androidx.media3.exoplayer.p145h.p147b.C3059o) r1
            r19 = r1
        L_0x00d1:
            androidx.media3.exoplayer.j.ad r1 = r9.f8470h
            int r7 = r1.mo7032j()
            androidx.media3.exoplayer.h.b.q[] r2 = new androidx.media3.exoplayer.p145h.p147b.C3061q[r7]
            r1 = 0
        L_0x00da:
            if (r1 >= r7) goto L_0x0139
            androidx.media3.exoplayer.dash.t[] r5 = r9.f8469g
            r5 = r5[r1]
            androidx.media3.exoplayer.dash.p r6 = r5.f8458c
            if (r6 != 0) goto L_0x00f3
            androidx.media3.exoplayer.h.b.q r5 = androidx.media3.exoplayer.p145h.p147b.C3061q.f8896b
            r2[r1] = r5
            r28 = r2
            r29 = r3
            r33 = r7
            r31 = r13
            r14 = 1
            r13 = r1
            goto L_0x0128
        L_0x00f3:
            long r20 = r5.mo6829a(r10)
            long r26 = r5.mo6831c(r10)
            r6 = r1
            r1 = r5
            r28 = r2
            r2 = r19
            r29 = r3
            r3 = r13
            r31 = r13
            r13 = r6
            r5 = r20
            r33 = r7
            r14 = 1
            r7 = r26
            long r24 = androidx.media3.exoplayer.dash.C2953v.m8359d(r1, r2, r3, r5, r7)
            int r1 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x011b
            androidx.media3.exoplayer.h.b.q r1 = androidx.media3.exoplayer.p145h.p147b.C3061q.f8896b
            r28[r13] = r1
            goto L_0x0128
        L_0x011b:
            androidx.media3.exoplayer.dash.t r23 = r9.mo6841b(r13)
            androidx.media3.exoplayer.dash.u r1 = new androidx.media3.exoplayer.dash.u
            r22 = r1
            r22.<init>(r23, r24, r26)
            r28[r13] = r1
        L_0x0128:
            int r1 = r13 + 1
            r2 = r28
            r3 = r29
            r13 = r31
            r7 = r33
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            goto L_0x00da
        L_0x0139:
            r28 = r2
            r29 = r3
            r31 = r13
            r14 = 1
            androidx.media3.exoplayer.dash.a.c r1 = r9.f8471i
            boolean r1 = r1.f8319d
            r6 = 0
            if (r1 != 0) goto L_0x014e
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x016f
        L_0x014e:
            androidx.media3.exoplayer.dash.t[] r1 = r9.f8469g
            r2 = 0
            r1 = r1[r2]
            long r3 = r1.mo6831c(r10)
            androidx.media3.exoplayer.dash.t[] r1 = r9.f8469g
            r1 = r1[r2]
            long r1 = r1.mo6833e(r3)
            long r3 = r9.mo6840a(r10)
            long r1 = java.lang.Math.min(r3, r1)
            long r1 = r1 - r54
            long r1 = java.lang.Math.max(r6, r1)
            r20 = r1
        L_0x016f:
            androidx.media3.exoplayer.j.ad r1 = r9.f8470h
            r2 = r54
            r4 = r16
            r16 = r6
            r6 = r20
            r8 = r12
            r13 = r9
            r9 = r28
            r1.mo7024d(r2, r4, r6, r8, r9)
            androidx.media3.exoplayer.j.ad r1 = r13.f8470h
            int r1 = r1.mo7021a()
            androidx.media3.exoplayer.dash.t r9 = r13.mo6841b(r1)
            androidx.media3.exoplayer.h.b.e r1 = r9.f8461f
            if (r1 == 0) goto L_0x01e4
            androidx.media3.exoplayer.dash.a.m r2 = r9.f8456a
            androidx.media3.common.x[] r1 = r1.f8838c
            if (r1 != 0) goto L_0x0197
            androidx.media3.exoplayer.dash.a.j r7 = r2.f8370f
            goto L_0x0198
        L_0x0197:
            r7 = 0
        L_0x0198:
            androidx.media3.exoplayer.dash.p r1 = r9.f8458c
            if (r1 != 0) goto L_0x01a1
            androidx.media3.exoplayer.dash.a.j r1 = r2.mo6790l()
            goto L_0x01a2
        L_0x01a1:
            r1 = 0
        L_0x01a2:
            if (r7 != 0) goto L_0x01a6
            if (r1 == 0) goto L_0x01e4
        L_0x01a6:
            androidx.media3.b.i r2 = r13.f8466d
            androidx.media3.exoplayer.j.ad r3 = r13.f8470h
            androidx.media3.common.x r23 = r3.mo7034l()
            androidx.media3.exoplayer.j.ad r3 = r13.f8470h
            int r24 = r3.mo7022b()
            androidx.media3.exoplayer.j.ad r3 = r13.f8470h
            java.lang.Object r25 = r3.mo7023c()
            androidx.media3.exoplayer.dash.a.m r3 = r9.f8456a
            if (r7 == 0) goto L_0x01c9
            androidx.media3.exoplayer.dash.a.b r4 = r9.f8457b
            java.lang.String r4 = r4.f8312a
            androidx.media3.exoplayer.dash.a.j r1 = r7.mo6775a(r1, r4)
            if (r1 != 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r7 = r1
        L_0x01ca:
            androidx.media3.exoplayer.dash.a.b r1 = r9.f8457b
            java.lang.String r1 = r1.f8312a
            r4 = 0
            androidx.media3.b.n r22 = androidx.media3.exoplayer.dash.C2948q.m8337a(r3, r1, r7, r4)
            androidx.media3.exoplayer.h.b.n r1 = new androidx.media3.exoplayer.h.b.n
            androidx.media3.exoplayer.h.b.e r3 = r9.f8461f
            r20 = r1
            r21 = r2
            r26 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r15.f8854a = r1
            goto L_0x0334
        L_0x01e4:
            long r7 = r9.f8459d
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01f1
            r5 = 1
            goto L_0x01f2
        L_0x01f1:
            r5 = 0
        L_0x01f2:
            long r1 = r9.mo6832d()
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x01fe
            r15.f8855b = r5
            goto L_0x0334
        L_0x01fe:
            long r16 = r9.mo6829a(r10)
            long r10 = r9.mo6831c(r10)
            r1 = r9
            r2 = r19
            r3 = r31
            r14 = r5
            r5 = r16
            r20 = r7
            r7 = r10
            long r1 = androidx.media3.exoplayer.dash.C2953v.m8359d(r1, r2, r3, r5, r7)
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0222
            androidx.media3.exoplayer.h.b r1 = new androidx.media3.exoplayer.h.b
            r1.<init>()
            r13.f8473k = r1
            goto L_0x0334
        L_0x0222:
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0332
            boolean r3 = r13.f8474l
            if (r3 == 0) goto L_0x0230
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x0230
            goto L_0x0332
        L_0x0230:
            if (r14 == 0) goto L_0x023f
            long r3 = r9.mo6835g(r1)
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 < 0) goto L_0x023f
            r3 = 1
            r15.f8855b = r3
            goto L_0x0334
        L_0x023f:
            long r10 = r10 - r1
            r3 = 1
            long r10 = r10 + r3
            long r3 = java.lang.Math.min(r3, r10)
            int r4 = (int) r3
            r5 = -1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0254
            goto L_0x0265
        L_0x0254:
            r3 = 1
            if (r4 <= r3) goto L_0x0265
            long r7 = (long) r4
            long r7 = r7 + r1
            long r7 = r7 + r5
            long r7 = r9.mo6835g(r7)
            int r3 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r3 < 0) goto L_0x0265
            int r4 = r4 + -1
            goto L_0x0254
        L_0x0265:
            boolean r3 = r12.isEmpty()
            r7 = 1
            if (r7 == r3) goto L_0x0272
            r43 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0274
        L_0x0272:
            r43 = r31
        L_0x0274:
            androidx.media3.b.i r3 = r13.f8466d
            int r7 = r13.f8465c
            androidx.media3.exoplayer.j.ad r8 = r13.f8470h
            androidx.media3.common.x r8 = r8.mo7034l()
            androidx.media3.exoplayer.j.ad r10 = r13.f8470h
            int r37 = r10.mo7022b()
            androidx.media3.exoplayer.j.ad r10 = r13.f8470h
            java.lang.Object r38 = r10.mo7023c()
            androidx.media3.exoplayer.dash.a.m r10 = r9.f8456a
            long r39 = r9.mo6835g(r1)
            androidx.media3.exoplayer.dash.a.j r11 = r9.mo6836h(r1)
            androidx.media3.exoplayer.h.b.e r12 = r9.f8461f
            if (r12 != 0) goto L_0x02c4
            long r41 = r9.mo6833e(r1)
            r4 = r29
            boolean r4 = r9.mo6837i(r1, r4)
            r5 = 1
            if (r5 == r4) goto L_0x02a8
            r13 = 8
            goto L_0x02a9
        L_0x02a8:
            r13 = 0
        L_0x02a9:
            androidx.media3.exoplayer.dash.a.b r4 = r9.f8457b
            java.lang.String r4 = r4.f8312a
            androidx.media3.b.n r35 = androidx.media3.exoplayer.dash.C2948q.m8337a(r10, r4, r11, r13)
            androidx.media3.exoplayer.h.b.r r4 = new androidx.media3.exoplayer.h.b.r
            r33 = r4
            r34 = r3
            r36 = r8
            r43 = r1
            r45 = r7
            r46 = r8
            r33.<init>(r34, r35, r36, r37, r38, r39, r41, r43, r45, r46)
            goto L_0x032f
        L_0x02c4:
            r13 = r29
            r7 = 1
            r12 = 1
        L_0x02c8:
            if (r7 >= r4) goto L_0x02e3
            long r5 = (long) r7
            long r5 = r5 + r1
            androidx.media3.exoplayer.dash.a.j r5 = r9.mo6836h(r5)
            androidx.media3.exoplayer.dash.a.b r6 = r9.f8457b
            java.lang.String r6 = r6.f8312a
            androidx.media3.exoplayer.dash.a.j r5 = r11.mo6775a(r5, r6)
            if (r5 != 0) goto L_0x02db
            goto L_0x02e3
        L_0x02db:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r11 = r5
            r5 = -1
            goto L_0x02c8
        L_0x02e3:
            long r4 = (long) r12
            long r4 = r4 + r1
            r6 = -1
            long r4 = r4 + r6
            long r41 = r9.mo6833e(r4)
            long r6 = r9.f8459d
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r20 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r20 == 0) goto L_0x02fe
            int r16 = (r6 > r41 ? 1 : (r6 == r41 ? 0 : -1))
            if (r16 > 0) goto L_0x02fe
            r45 = r6
            goto L_0x0303
        L_0x02fe:
            r45 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0303:
            boolean r4 = r9.mo6837i(r4, r13)
            r5 = 1
            if (r5 == r4) goto L_0x030d
            r4 = 8
            goto L_0x030e
        L_0x030d:
            r4 = 0
        L_0x030e:
            androidx.media3.exoplayer.dash.a.b r5 = r9.f8457b
            java.lang.String r5 = r5.f8312a
            androidx.media3.b.n r35 = androidx.media3.exoplayer.dash.C2948q.m8337a(r10, r5, r11, r4)
            long r4 = r10.f8368d
            androidx.media3.exoplayer.h.b.l r6 = new androidx.media3.exoplayer.h.b.l
            r33 = r6
            long r4 = -r4
            r50 = r4
            androidx.media3.exoplayer.h.b.e r4 = r9.f8461f
            r52 = r4
            r34 = r3
            r36 = r8
            r47 = r1
            r49 = r12
            r33.<init>(r34, r35, r36, r37, r38, r39, r41, r43, r45, r47, r49, r50, r52)
            r4 = r6
        L_0x032f:
            r15.f8854a = r4
            goto L_0x0334
        L_0x0332:
            r15.f8855b = r14
        L_0x0334:
            androidx.media3.exoplayer.h.b.g r1 = r0.f8877q
            boolean r2 = r1.f8855b
            androidx.media3.exoplayer.h.b.f r3 = r1.f8854a
            r4 = 0
            r1.f8854a = r4
            r4 = 0
            r1.f8855b = r4
            if (r2 == 0) goto L_0x034d
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f8871k = r1
            r1 = 1
            r0.f8875o = r1
            return r1
        L_0x034d:
            if (r3 != 0) goto L_0x0350
            return r4
        L_0x0350:
            r0.f8880t = r3
            boolean r1 = r3 instanceof androidx.media3.exoplayer.p145h.p147b.C3045a
            if (r1 == 0) goto L_0x03a0
            r1 = r3
            androidx.media3.exoplayer.h.b.a r1 = (androidx.media3.exoplayer.p145h.p147b.C3045a) r1
            if (r18 == 0) goto L_0x037d
            long r4 = r1.f8851q
            long r6 = r0.f8871k
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0376
            androidx.media3.exoplayer.h.ce r2 = r0.f8869i
            r2.f9045g = r6
            androidx.media3.exoplayer.h.ce[] r2 = r0.f8870j
            int r4 = r2.length
            r5 = 0
        L_0x036b:
            if (r5 >= r4) goto L_0x0376
            r6 = r2[r5]
            long r7 = r0.f8871k
            r6.f9045g = r7
            int r5 = r5 + 1
            goto L_0x036b
        L_0x0376:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f8871k = r4
        L_0x037d:
            androidx.media3.exoplayer.h.b.c r2 = r0.f8879s
            r1.f8822c = r2
            androidx.media3.exoplayer.h.ce[] r4 = r2.f8827a
            int r4 = r4.length
            int[] r4 = new int[r4]
            r10 = 0
        L_0x0387:
            androidx.media3.exoplayer.h.ce[] r5 = r2.f8827a
            int r6 = r5.length
            if (r10 >= r6) goto L_0x0398
            r5 = r5[r10]
            int r6 = r5.f9043e
            int r5 = r5.f9042d
            int r6 = r6 + r5
            r4[r10] = r6
            int r10 = r10 + 1
            goto L_0x0387
        L_0x0398:
            r1.f8823d = r4
            java.util.ArrayList r2 = r0.f8868h
            r2.add(r1)
            goto L_0x03ab
        L_0x03a0:
            boolean r1 = r3 instanceof androidx.media3.exoplayer.p145h.p147b.C3058n
            if (r1 == 0) goto L_0x03ab
            r1 = r3
            androidx.media3.exoplayer.h.b.n r1 = (androidx.media3.exoplayer.p145h.p147b.C3058n) r1
            androidx.media3.exoplayer.h.b.c r2 = r0.f8879s
            r1.f8891a = r2
        L_0x03ab:
            androidx.media3.exoplayer.k.v r1 = r0.f8867g
            int r2 = r3.f8847m
            int r2 = androidx.media3.exoplayer.p151k.C3245k.m9467b(r2)
            r1.mo7254g(r3, r0, r2)
            androidx.media3.exoplayer.h.bc r4 = r0.f8866f
            androidx.media3.exoplayer.h.aj r5 = new androidx.media3.exoplayer.h.aj
            androidx.media3.b.n r1 = r3.f8846l
            r5.<init>(r1)
            int r6 = r3.f8847m
            int r7 = r0.f8861a
            androidx.media3.common.x r8 = r3.f8848n
            int r9 = r3.f8849o
            long r10 = r3.f8851q
            long r12 = r3.f8852r
            r4.mo7020s(r5, r6, r7, r8, r9, r10, r12)
            r1 = 1
            return r1
        L_0x03d0:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.p147b.C3054j.mo6819n(long):boolean");
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f8867g.mo7253f();
    }
}
