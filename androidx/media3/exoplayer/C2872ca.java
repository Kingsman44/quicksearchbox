package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C2583aj;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2616d;
import androidx.media3.common.p136b.C2626n;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p137a.C2684a;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p139c.C2860c;
import androidx.media3.exoplayer.p145h.C3033ap;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3044b;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.exoplayer.p145h.C3097ch;
import androidx.media3.exoplayer.p145h.C3098ci;
import androidx.media3.exoplayer.p145h.C3107cr;
import androidx.media3.exoplayer.p149i.C3191d;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.exoplayer.p150j.C3203aj;
import androidx.media3.exoplayer.p150j.C3204ak;
import androidx.media3.exoplayer.p150j.C3205al;
import androidx.media3.exoplayer.p151k.C3240f;
import androidx.media3.p132b.C2506j;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.media3.exoplayer.ca */
/* compiled from: PG */
public final class C2872ca implements Handler.Callback, C3033ap, C3203aj, C2886co, C3261l, C2889cr {

    /* renamed from: A */
    private boolean f8054A;

    /* renamed from: B */
    private boolean f8055B;

    /* renamed from: C */
    private boolean f8056C;

    /* renamed from: D */
    private int f8057D;

    /* renamed from: E */
    private boolean f8058E;

    /* renamed from: F */
    private boolean f8059F;

    /* renamed from: G */
    private boolean f8060G;

    /* renamed from: H */
    private int f8061H;

    /* renamed from: I */
    private C2856bz f8062I;

    /* renamed from: J */
    private long f8063J;

    /* renamed from: K */
    private int f8064K;

    /* renamed from: L */
    private boolean f8065L;

    /* renamed from: M */
    private C3267o f8066M;

    /* renamed from: N */
    private long f8067N = -9223372036854775807L;

    /* renamed from: O */
    private final C2771ap f8068O;

    /* renamed from: P */
    private final C3192j f8069P;

    /* renamed from: a */
    public final C2626n f8070a;

    /* renamed from: b */
    public final Looper f8071b;

    /* renamed from: c */
    public boolean f8072c;

    /* renamed from: d */
    public boolean f8073d;

    /* renamed from: e */
    private final C2893cv[] f8074e;

    /* renamed from: f */
    private final Set f8075f;

    /* renamed from: g */
    private final C2894cw[] f8076g;

    /* renamed from: h */
    private final C3204ak f8077h;

    /* renamed from: i */
    private final C3205al f8078i;

    /* renamed from: j */
    private final C2875cd f8079j;

    /* renamed from: k */
    private final C3240f f8080k;

    /* renamed from: l */
    private final HandlerThread f8081l;

    /* renamed from: m */
    private final C2650bl f8082m;

    /* renamed from: n */
    private final C2649bk f8083n;

    /* renamed from: o */
    private final long f8084o;

    /* renamed from: p */
    private final boolean f8085p;

    /* renamed from: q */
    private final C3265m f8086q;

    /* renamed from: r */
    private final ArrayList f8087r;

    /* renamed from: s */
    private final C2616d f8088s;

    /* renamed from: t */
    private final C2880ci f8089t;

    /* renamed from: u */
    private final C2887cp f8090u;

    /* renamed from: v */
    private final long f8091v;

    /* renamed from: w */
    private C2897cz f8092w;

    /* renamed from: x */
    private C2888cq f8093x;

    /* renamed from: y */
    private C2855by f8094y;

    /* renamed from: z */
    private boolean f8095z;

    public C2872ca(C2893cv[] cvVarArr, C3204ak akVar, C3205al alVar, C2875cd cdVar, C3240f fVar, int i, boolean z, C2684a aVar, C2897cz czVar, C3192j jVar, long j, boolean z2, Looper looper, C2616d dVar, C2771ap apVar, C2731bt btVar) {
        C2893cv[] cvVarArr2 = cvVarArr;
        C3204ak akVar2 = akVar;
        C3240f fVar2 = fVar;
        C2684a aVar2 = aVar;
        C2616d dVar2 = dVar;
        C2731bt btVar2 = btVar;
        this.f8068O = apVar;
        this.f8074e = cvVarArr2;
        this.f8077h = akVar2;
        this.f8078i = alVar;
        this.f8079j = cdVar;
        this.f8080k = fVar2;
        this.f8057D = i;
        this.f8058E = z;
        this.f8092w = czVar;
        this.f8069P = jVar;
        this.f8091v = j;
        this.f8095z = z2;
        this.f8088s = dVar2;
        this.f8084o = cdVar.mo6622a();
        this.f8085p = cdVar.mo6626f();
        this.f8093x = C2888cq.m8041h(alVar);
        this.f8094y = new C2855by(this.f8093x);
        this.f8076g = new C2894cw[cvVarArr2.length];
        for (int i2 = 0; i2 < cvVarArr2.length; i2++) {
            cvVarArr2[i2].mo6694o(i2, btVar2);
            this.f8076g[i2] = cvVarArr2[i2].mo6690j();
        }
        this.f8086q = new C3265m(this);
        this.f8087r = new ArrayList();
        this.f8075f = Collections.newSetFromMap(new IdentityHashMap());
        this.f8082m = new C2650bl();
        this.f8083n = new C2649bk();
        akVar2.f9611h = this;
        akVar2.f9612i = fVar2;
        this.f8065L = true;
        Handler handler = new Handler(looper);
        this.f8089t = new C2880ci(aVar2, handler);
        this.f8090u = new C2887cp(this, aVar2, handler, btVar2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f8081l = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f8071b = looper2;
        this.f8070a = dVar2.mo6160b(looper2, this);
    }

    /* renamed from: A */
    private final void m7920A() {
        C2877cf cfVar = this.f8089t.f8128d;
        boolean z = false;
        if (cfVar != null && cfVar.f8103f.f8120h && this.f8095z) {
            z = true;
        }
        this.f8054A = z;
    }

    /* renamed from: B */
    private final void m7921B(long j) {
        long j2;
        C2877cf cfVar = this.f8089t.f8128d;
        if (cfVar == null) {
            j2 = 1000000000000L;
        } else {
            j2 = cfVar.f8108k;
        }
        long j3 = j + j2;
        this.f8063J = j3;
        this.f8086q.f9803a.mo6742d(j3);
        for (C2893cv cvVar : this.f8074e) {
            if (m7937R(cvVar)) {
                cvVar.mo6698z(this.f8063J);
            }
        }
        for (C2877cf cfVar2 = this.f8089t.f8128d; cfVar2 != null; cfVar2 = cfVar2.f8105h) {
            for (C3197ad adVar : cfVar2.f8107j.f9615c) {
            }
        }
    }

    /* renamed from: C */
    private static void m7922C(C2651bm bmVar, C2854bx bxVar, C2650bl blVar, C2649bk bkVar) {
        int i = bmVar.mo6024e(bmVar.mo6303n(bxVar.f8028d, bkVar).f7330c, blVar, 0).f7351p;
        Object obj = bmVar.mo6023d(i, bkVar, true).f7329b;
        long j = bkVar.f7331d;
        bxVar.mo6603a(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: D */
    private final void m7923D(C2651bm bmVar, C2651bm bmVar2) {
        if (!bmVar.mo6304o() || !bmVar2.mo6304o()) {
            int size = this.f8087r.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (!m7940U((C2854bx) this.f8087r.get(size), bmVar, bmVar2, this.f8057D, this.f8058E, this.f8082m, this.f8083n)) {
                        ((C2854bx) this.f8087r.get(size)).f8025a.mo6674a(false);
                        this.f8087r.remove(size);
                    }
                } else {
                    Collections.sort(this.f8087r);
                    return;
                }
            }
        }
    }

    /* renamed from: E */
    private final void m7924E(long j, long j2) {
        this.f8070a.mo6171j(j + j2);
    }

    /* renamed from: F */
    private final void m7925F(boolean z) {
        C3036as asVar = this.f8089t.f8128d.f8103f.f8113a;
        long k = m7953k(asVar, this.f8093x.f8181s, true, false);
        if (k != this.f8093x.f8181s) {
            C2888cq cqVar = this.f8093x;
            this.f8093x = m7956n(asVar, k, cqVar.f8166d, cqVar.f8167e, z, 5);
        }
    }

    /* renamed from: G */
    private final void m7926G(C2891ct ctVar) {
        if (ctVar.f8186e == this.f8071b) {
            m7948f(ctVar);
            int i = this.f8093x.f8168f;
            if (i == 3 || i == 2) {
                this.f8070a.mo6170i(2);
                return;
            }
            return;
        }
        this.f8070a.mo6163b(15, ctVar).mo6161a();
    }

    /* renamed from: H */
    private final void m7927H(boolean z, int i, boolean z2, int i2) {
        this.f8094y.mo6605a(z2 ? 1 : 0);
        C2855by byVar = this.f8094y;
        byVar.f8029a = true;
        byVar.f8034f = true;
        byVar.f8035g = i2;
        this.f8093x = this.f8093x.mo6669c(z, i);
        this.f8055B = false;
        for (C2877cf cfVar = this.f8089t.f8128d; cfVar != null; cfVar = cfVar.f8105h) {
            for (C3197ad adVar : cfVar.f8107j.f9615c) {
            }
        }
        if (!m7941V()) {
            m7931L();
            m7933N();
            return;
        }
        int i3 = this.f8093x.f8168f;
        if (i3 == 3) {
            m7929J();
            this.f8070a.mo6170i(2);
        } else if (i3 == 2) {
            this.f8070a.mo6170i(2);
        }
    }

    /* renamed from: I */
    private final void m7928I(int i) {
        C2888cq cqVar = this.f8093x;
        if (cqVar.f8168f != i) {
            if (i != 2) {
                this.f8067N = -9223372036854775807L;
            }
            this.f8093x = cqVar.mo6672f(i);
        }
    }

    /* renamed from: J */
    private final void m7929J() {
        this.f8055B = false;
        C3265m mVar = this.f8086q;
        mVar.f9808f = true;
        mVar.f9803a.mo6743e();
        for (C2893cv cvVar : this.f8074e) {
            if (m7937R(cvVar)) {
                cvVar.mo6682C();
            }
        }
    }

    /* renamed from: K */
    private final void m7930K(boolean z, boolean z2) {
        m7968z(z || !this.f8059F, false, true, false);
        this.f8094y.mo6605a(z2 ? 1 : 0);
        this.f8079j.mo6625e();
        m7928I(1);
    }

    /* renamed from: L */
    private final void m7931L() {
        this.f8086q.mo7256d();
        for (C2893cv cvVar : this.f8074e) {
            if (m7937R(cvVar)) {
                m7944Y(cvVar);
            }
        }
    }

    /* renamed from: M */
    private final void m7932M() {
        C2877cf cfVar = this.f8089t.f8130f;
        boolean z = this.f8056C || (cfVar != null && cfVar.f8098a.mo6820o());
        C2888cq cqVar = this.f8093x;
        if (z != cqVar.f8170h) {
            C2888cq cqVar2 = r4;
            C2888cq cqVar3 = new C2888cq(cqVar.f8164b, cqVar.f8165c, cqVar.f8166d, cqVar.f8167e, cqVar.f8168f, cqVar.f8169g, z, cqVar.f8171i, cqVar.f8172j, cqVar.f8173k, cqVar.f8174l, cqVar.f8175m, cqVar.f8176n, cqVar.f8177o, cqVar.f8179q, cqVar.f8180r, cqVar.f8181s, cqVar.f8178p);
            this.f8093x = cqVar2;
        }
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x012b A[EDGE_INSN: B:133:0x012b->B:55:0x012b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0110  */
    /* renamed from: N */
    private final void m7933N() {
        /*
            r24 = this;
            r11 = r24
            androidx.media3.exoplayer.ci r0 = r11.f8089t
            androidx.media3.exoplayer.cf r0 = r0.f8128d
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f8101d
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            androidx.media3.exoplayer.h.aq r1 = r0.f8098a
            long r1 = r1.mo6810e()
            r7 = r1
            goto L_0x001b
        L_0x001a:
            r7 = r12
        L_0x001b:
            r14 = 1
            r15 = 0
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x003f
            r11.m7921B(r7)
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            long r0 = r0.f8181s
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01a8
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.exoplayer.h.as r2 = r0.f8165c
            long r5 = r0.f8166d
            r9 = 1
            r10 = 5
            r1 = r24
            r3 = r7
            androidx.media3.exoplayer.cq r0 = r1.m7956n(r2, r3, r5, r7, r9, r10)
            r11.f8093x = r0
            goto L_0x01a8
        L_0x003f:
            androidx.media3.exoplayer.m r1 = r11.f8086q
            androidx.media3.exoplayer.ci r2 = r11.f8089t
            androidx.media3.exoplayer.cf r2 = r2.f8129e
            androidx.media3.exoplayer.cv r3 = r1.f9805c
            if (r3 == 0) goto L_0x00b2
            boolean r3 = r3.mo6505J()
            if (r3 != 0) goto L_0x00b2
            androidx.media3.exoplayer.cv r3 = r1.f9805c
            boolean r3 = r3.mo6506K()
            if (r3 != 0) goto L_0x0062
            if (r0 != r2) goto L_0x00b2
            androidx.media3.exoplayer.cv r2 = r1.f9805c
            boolean r2 = r2.mo6684E()
            if (r2 == 0) goto L_0x0062
            goto L_0x00b2
        L_0x0062:
            androidx.media3.exoplayer.ce r2 = r1.f9806d
            r2.getClass()
            long r3 = r2.mo6521a()
            boolean r5 = r1.f9807e
            if (r5 == 0) goto L_0x008a
            androidx.media3.exoplayer.da r5 = r1.f9803a
            long r5 = r5.mo6521a()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x007f
            androidx.media3.exoplayer.da r2 = r1.f9803a
            r2.mo6744f()
            goto L_0x00bd
        L_0x007f:
            r1.f9807e = r15
            boolean r5 = r1.f9808f
            if (r5 == 0) goto L_0x008a
            androidx.media3.exoplayer.da r5 = r1.f9803a
            r5.mo6743e()
        L_0x008a:
            androidx.media3.exoplayer.da r5 = r1.f9803a
            r5.mo6742d(r3)
            androidx.media3.common.bb r2 = r2.mo6523b()
            androidx.media3.exoplayer.da r3 = r1.f9803a
            androidx.media3.common.bb r3 = r3.f8263a
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00bd
            androidx.media3.exoplayer.da r3 = r1.f9803a
            r3.mo6524c(r2)
            androidx.media3.exoplayer.l r3 = r1.f9804b
            androidx.media3.exoplayer.ca r3 = (androidx.media3.exoplayer.C2872ca) r3
            androidx.media3.common.b.n r3 = r3.f8070a
            r4 = 16
            androidx.media3.common.b.ae r2 = r3.mo6163b(r4, r2)
            r2.mo6161a()
            goto L_0x00bd
        L_0x00b2:
            r1.f9807e = r14
            boolean r2 = r1.f9808f
            if (r2 == 0) goto L_0x00bd
            androidx.media3.exoplayer.da r2 = r1.f9803a
            r2.mo6743e()
        L_0x00bd:
            long r1 = r1.mo6521a()
            r11.f8063J = r1
            long r3 = r0.f8108k
            long r1 = r1 - r3
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            long r3 = r0.f8181s
            java.util.ArrayList r0 = r11.f8087r
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01a4
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.exoplayer.h.as r0 = r0.f8165c
            boolean r0 = r0.mo6102a()
            if (r0 == 0) goto L_0x00de
            goto L_0x01a4
        L_0x00de:
            boolean r0 = r11.f8065L
            if (r0 == 0) goto L_0x00e7
            r5 = -1
            long r3 = r3 + r5
            r11.f8065L = r15
        L_0x00e7:
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.common.bm r5 = r0.f8164b
            androidx.media3.exoplayer.h.as r0 = r0.f8165c
            java.lang.Object r0 = r0.f7204a
            int r0 = r5.mo6020a(r0)
            int r5 = r11.f8064K
            java.util.ArrayList r6 = r11.f8087r
            int r6 = r6.size()
            int r5 = java.lang.Math.min(r5, r6)
            r6 = 0
            if (r5 <= 0) goto L_0x010d
            java.util.ArrayList r7 = r11.f8087r
            int r8 = r5 + -1
            java.lang.Object r7 = r7.get(r8)
            androidx.media3.exoplayer.bx r7 = (androidx.media3.exoplayer.C2854bx) r7
            goto L_0x010e
        L_0x010d:
            r7 = r6
        L_0x010e:
            if (r7 == 0) goto L_0x012b
            int r8 = r7.f8026b
            if (r8 > r0) goto L_0x011c
            if (r8 != r0) goto L_0x012b
            long r7 = r7.f8027c
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x012b
        L_0x011c:
            int r5 = r5 + -1
            if (r5 <= 0) goto L_0x010d
            java.util.ArrayList r7 = r11.f8087r
            int r8 = r5 + -1
            java.lang.Object r7 = r7.get(r8)
            androidx.media3.exoplayer.bx r7 = (androidx.media3.exoplayer.C2854bx) r7
            goto L_0x010e
        L_0x012b:
            java.util.ArrayList r7 = r11.f8087r
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x013c
            java.util.ArrayList r7 = r11.f8087r
            java.lang.Object r7 = r7.get(r5)
            androidx.media3.exoplayer.bx r7 = (androidx.media3.exoplayer.C2854bx) r7
            goto L_0x013d
        L_0x013c:
            r7 = r6
        L_0x013d:
            if (r7 == 0) goto L_0x0162
            java.lang.Object r8 = r7.f8028d
            if (r8 == 0) goto L_0x0162
            int r8 = r7.f8026b
            if (r8 < r0) goto L_0x014f
            if (r8 != r0) goto L_0x0162
            long r8 = r7.f8027c
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x0162
        L_0x014f:
            int r5 = r5 + 1
            java.util.ArrayList r7 = r11.f8087r
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x013c
            java.util.ArrayList r7 = r11.f8087r
            java.lang.Object r7 = r7.get(r5)
            androidx.media3.exoplayer.bx r7 = (androidx.media3.exoplayer.C2854bx) r7
            goto L_0x013d
        L_0x0162:
            if (r7 == 0) goto L_0x01a2
            java.lang.Object r8 = r7.f8028d
            if (r8 == 0) goto L_0x01a2
            int r8 = r7.f8026b
            if (r8 != r0) goto L_0x01a2
            long r8 = r7.f8027c
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a2
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 > 0) goto L_0x01a2
            androidx.media3.exoplayer.ct r8 = r7.f8025a     // Catch:{ all -> 0x0197 }
            r11.m7926G(r8)     // Catch:{ all -> 0x0197 }
            androidx.media3.exoplayer.ct r7 = r7.f8025a
            boolean r7 = r7.f8189h
            java.util.ArrayList r7 = r11.f8087r
            r7.remove(r5)
            java.util.ArrayList r7 = r11.f8087r
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x0195
            java.util.ArrayList r7 = r11.f8087r
            java.lang.Object r7 = r7.get(r5)
            androidx.media3.exoplayer.bx r7 = (androidx.media3.exoplayer.C2854bx) r7
            goto L_0x0162
        L_0x0195:
            r7 = r6
            goto L_0x0162
        L_0x0197:
            r0 = move-exception
            androidx.media3.exoplayer.ct r1 = r7.f8025a
            boolean r1 = r1.f8189h
            java.util.ArrayList r1 = r11.f8087r
            r1.remove(r5)
            throw r0
        L_0x01a2:
            r11.f8064K = r5
        L_0x01a4:
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            r0.f8181s = r1
        L_0x01a8:
            androidx.media3.exoplayer.ci r0 = r11.f8089t
            androidx.media3.exoplayer.cf r0 = r0.f8130f
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            long r2 = r0.mo6632b()
            r1.f8179q = r2
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            long r1 = r24.m7950h()
            r0.f8180r = r1
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            boolean r1 = r0.f8175m
            if (r1 == 0) goto L_0x0301
            int r1 = r0.f8168f
            r2 = 3
            if (r1 != r2) goto L_0x0301
            androidx.media3.common.bm r1 = r0.f8164b
            androidx.media3.exoplayer.h.as r0 = r0.f8165c
            boolean r0 = r11.m7942W(r1, r0)
            if (r0 == 0) goto L_0x0301
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.common.bb r1 = r0.f8177o
            float r1 = r1.f7313b
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0301
            androidx.media3.exoplayer.j r1 = r11.f8069P
            androidx.media3.common.bm r4 = r0.f8164b
            androidx.media3.exoplayer.h.as r5 = r0.f8165c
            java.lang.Object r5 = r5.f7204a
            long r6 = r0.f8181s
            long r4 = r11.m7949g(r4, r5, r6)
            long r6 = r24.m7950h()
            long r8 = r1.f9569h
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            goto L_0x02d9
        L_0x01f7:
            long r6 = r4 - r6
            long r8 = r1.f9579r
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0206
            r1.f9579r = r6
            r6 = 0
            r1.f9580s = r6
            goto L_0x0221
        L_0x0206:
            float r0 = r1.f9568g
            long r8 = androidx.media3.exoplayer.C3192j.m9352b(r8, r6)
            long r8 = java.lang.Math.max(r6, r8)
            r1.f9579r = r8
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r8 = r1.f9580s
            float r0 = r1.f9568g
            long r6 = androidx.media3.exoplayer.C3192j.m9352b(r8, r6)
            r1.f9580s = r6
        L_0x0221:
            long r6 = r1.f9578q
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x023c
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r12 = r1.f9578q
            r16 = r4
            long r3 = r1.f9564c
            long r6 = r6 - r12
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x023e
            float r3 = r1.f9577p
            goto L_0x02d9
        L_0x023c:
            r16 = r4
        L_0x023e:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r1.f9578q = r3
            long r3 = r1.f9579r
            long r5 = r1.f9580s
            r12 = 3
            long r5 = r5 * r12
            long r22 = r3 + r5
            long r3 = r1.f9574m
            r5 = 869711765(0x33d6bf95, float:1.0E-7)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r7 <= 0) goto L_0x028c
            long r3 = r1.f9564c
            long r3 = androidx.media3.common.p136b.C2612ak.m6998w(r8)
            float r7 = r1.f9577p
            float r3 = (float) r3
            float r4 = r1.f9575n
            long[] r8 = new long[r2]
            r8[r15] = r22
            long r9 = r1.f9571j
            r8[r14] = r9
            long r9 = r1.f9574m
            float r7 = r7 + r6
            float r7 = r7 * r3
            long r12 = (long) r7
            float r4 = r4 + r6
            float r4 = r4 * r3
            long r3 = (long) r4
            long r12 = r12 + r3
            long r9 = r9 - r12
            r3 = 2
            r8[r3] = r9
            r3 = r8[r15]
        L_0x027d:
            if (r14 >= r2) goto L_0x0289
            r6 = r8[r14]
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x0286
            r3 = r6
        L_0x0286:
            int r14 = r14 + 1
            goto L_0x027d
        L_0x0289:
            r1.f9574m = r3
            goto L_0x02b6
        L_0x028c:
            float r2 = r1.f9577p
            r3 = 0
            float r2 = r2 + r6
            float r2 = java.lang.Math.max(r3, r2)
            float r3 = r1.f9565d
            float r2 = r2 / r5
            long r2 = (long) r2
            long r18 = r16 - r2
            long r2 = r1.f9574m
            r20 = r2
            long r3 = androidx.media3.common.p136b.C2612ak.m6994s(r18, r20, r22)
            r1.f9574m = r3
            long r6 = r1.f9573l
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x02b6
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b6
            r1.f9574m = r6
            r3 = r6
        L_0x02b6:
            long r3 = r16 - r3
            long r6 = java.lang.Math.abs(r3)
            long r8 = r1.f9566e
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 >= 0) goto L_0x02c9
            r1.f9577p = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02d9
        L_0x02c9:
            float r2 = r1.f9565d
            float r2 = (float) r3
            float r2 = r2 * r5
            float r2 = r2 + r0
            float r0 = r1.f9576o
            float r3 = r1.f9575n
            float r3 = androidx.media3.common.p136b.C2612ak.m6944a(r2, r0, r3)
            r1.f9577p = r3
        L_0x02d9:
            androidx.media3.exoplayer.m r0 = r11.f8086q
            androidx.media3.common.bb r0 = r0.mo6523b()
            float r0 = r0.f7313b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0301
            androidx.media3.exoplayer.m r0 = r11.f8086q
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            androidx.media3.common.bb r1 = r1.f8177o
            androidx.media3.common.bb r1 = r1.mo6212a(r3)
            r0.mo6524c(r1)
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.common.bb r0 = r0.f8177o
            androidx.media3.exoplayer.m r1 = r11.f8086q
            androidx.media3.common.bb r1 = r1.mo6523b()
            float r1 = r1.f7313b
            r11.m7965w(r0, r1, r15, r15)
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2872ca.m7933N():void");
    }

    /* renamed from: O */
    private final void m7934O(C2651bm bmVar, C3036as asVar, C2651bm bmVar2, C3036as asVar2, long j) {
        if (!m7942W(bmVar, asVar)) {
            C2640bb bbVar = asVar.mo6102a() ? C2640bb.f7312a : this.f8093x.f8177o;
            if (!this.f8086q.mo6523b().equals(bbVar)) {
                this.f8086q.mo6524c(bbVar);
                return;
            }
            return;
        }
        bmVar.mo6024e(bmVar.mo6303n(asVar.f7204a, this.f8083n).f7330c, this.f8082m, 0);
        C3192j jVar = this.f8069P;
        C2583aj ajVar = this.f8082m.f7346k;
        int i = C2612ak.f7249a;
        jVar.f9569h = C2612ak.m6998w(ajVar.f7126a);
        jVar.f9572k = C2612ak.m6998w(ajVar.f7127b);
        jVar.f9573l = C2612ak.m6998w(ajVar.f7128c);
        float f = ajVar.f7129d;
        if (f == -3.4028235E38f) {
            float f2 = jVar.f9562a;
            f = 0.97f;
        }
        jVar.f9576o = f;
        float f3 = ajVar.f7130e;
        if (f3 == -3.4028235E38f) {
            float f4 = jVar.f9563b;
            f3 = 1.03f;
        }
        jVar.f9575n = f3;
        if (f == 1.0f && f3 == 1.0f) {
            jVar.f9569h = -9223372036854775807L;
        }
        jVar.mo7199a();
        if (j != -9223372036854775807L) {
            C3192j jVar2 = this.f8069P;
            jVar2.f9570i = m7949g(bmVar, asVar.f7204a, j);
            jVar2.mo7199a();
            return;
        }
        if (!C2612ak.m6951aa(!bmVar2.mo6304o() ? bmVar2.mo6024e(bmVar2.mo6303n(asVar2.f7204a, this.f8083n).f7330c, this.f8082m, 0).f7337b : null, this.f8082m.f7337b)) {
            C3192j jVar3 = this.f8069P;
            jVar3.f9570i = -9223372036854775807L;
            jVar3.mo7199a();
        }
    }

    /* renamed from: P */
    private final synchronized void m7935P(C58881cr crVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((C2849bs) crVar).f8014a.f8072c).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: Q */
    private final boolean m7936Q() {
        C2877cf cfVar = this.f8089t.f8130f;
        return (cfVar == null || cfVar.mo6633c() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: R */
    private static boolean m7937R(C2893cv cvVar) {
        return cvVar.mo6687eU() != 0;
    }

    /* renamed from: S */
    private final boolean m7938S() {
        C2877cf cfVar = this.f8089t.f8128d;
        long j = cfVar.f8103f.f8117e;
        if (cfVar.f8101d) {
            return j == -9223372036854775807L || this.f8093x.f8181s < j || !m7941V();
        }
        return false;
    }

    /* renamed from: T */
    private static boolean m7939T(C2888cq cqVar, C2649bk bkVar) {
        C3036as asVar = cqVar.f8165c;
        C2651bm bmVar = cqVar.f8164b;
        return bmVar.mo6304o() || bmVar.mo6303n(asVar.f7204a, bkVar).f7333f;
    }

    /* renamed from: U */
    private static boolean m7940U(C2854bx bxVar, C2651bm bmVar, C2651bm bmVar2, int i, boolean z, C2650bl blVar, C2649bk bkVar) {
        long j;
        C2854bx bxVar2 = bxVar;
        C2651bm bmVar3 = bmVar;
        C2651bm bmVar4 = bmVar2;
        C2650bl blVar2 = blVar;
        C2649bk bkVar2 = bkVar;
        Object obj = bxVar2.f8028d;
        if (obj == null) {
            long j2 = bxVar2.f8025a.f8188g;
            if (j2 == Long.MIN_VALUE) {
                j = -9223372036854775807L;
            } else {
                j = C2612ak.m6998w(j2);
            }
            C2891ct ctVar = bxVar2.f8025a;
            Pair m = m7955m(bmVar, new C2856bz(ctVar.f8183b, ctVar.f8187f, j), false, i, z, blVar, bkVar);
            if (m == null) {
                return false;
            }
            bxVar.mo6603a(bmVar3.mo6020a(m.first), ((Long) m.second).longValue(), m.first);
            if (bxVar2.f8025a.f8188g == Long.MIN_VALUE) {
                m7922C(bmVar3, bxVar, blVar2, bkVar2);
            }
            return true;
        }
        int a = bmVar3.mo6020a(obj);
        if (a == -1) {
            return false;
        }
        if (bxVar2.f8025a.f8188g == Long.MIN_VALUE) {
            m7922C(bmVar3, bxVar, blVar2, bkVar2);
            return true;
        }
        bxVar2.f8026b = a;
        bmVar4.mo6303n(bxVar2.f8028d, bkVar2);
        if (bkVar2.f7333f && bmVar4.mo6024e(bkVar2.f7330c, blVar2, 0).f7350o == bmVar4.mo6020a(bxVar2.f8028d)) {
            Pair l = bmVar.mo6301l(blVar, bkVar, bmVar3.mo6303n(bxVar2.f8028d, bkVar2).f7330c, bxVar2.f8027c + bkVar2.f7332e);
            bxVar.mo6603a(bmVar3.mo6020a(l.first), ((Long) l.second).longValue(), l.first);
        }
        return true;
    }

    /* renamed from: V */
    private final boolean m7941V() {
        C2888cq cqVar = this.f8093x;
        return cqVar.f8175m && cqVar.f8176n == 0;
    }

    /* renamed from: W */
    private final boolean m7942W(C2651bm bmVar, C3036as asVar) {
        if (!asVar.mo6102a() && !bmVar.mo6304o()) {
            bmVar.mo6024e(bmVar.mo6303n(asVar.f7204a, this.f8083n).f7330c, this.f8082m, 0);
            if (this.f8082m.mo6292a()) {
                C2650bl blVar = this.f8082m;
                if (!blVar.f7344i || blVar.f7341f == -9223372036854775807L) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: X */
    private static C2680x[] m7943X(C3197ad adVar) {
        int j = adVar != null ? adVar.mo7032j() : 0;
        C2680x[] xVarArr = new C2680x[j];
        for (int i = 0; i < j; i++) {
            xVarArr[i] = adVar.mo7033k(i);
        }
        return xVarArr;
    }

    /* renamed from: Y */
    private static final void m7944Y(C2893cv cvVar) {
        if (cvVar.mo6687eU() == 2) {
            cvVar.mo6683D();
        }
    }

    /* renamed from: Z */
    private static final void m7945Z(C2893cv cvVar, long j) {
        cvVar.mo6680A();
        if (cvVar instanceof C3191d) {
            C3191d dVar = (C3191d) cvVar;
            C2601a.m6832d(dVar.f8684e);
            dVar.f9546f = j;
        }
    }

    /* renamed from: a */
    static Object m7946a(C2650bl blVar, C2649bk bkVar, int i, boolean z, Object obj, C2651bm bmVar, C2651bm bmVar2) {
        int a = bmVar.mo6020a(obj);
        int b = bmVar.mo6021b();
        int i2 = 0;
        int i3 = a;
        int i4 = -1;
        while (true) {
            if (i2 >= b || i4 != -1) {
                break;
            }
            i3 = bmVar.mo6298i(i3, bkVar, blVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = bmVar2.mo6020a(bmVar.mo6026f(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return bmVar2.mo6026f(i4);
    }

    /* renamed from: aa */
    private final void m7947aa(C3205al alVar) {
        this.f8079j.mo6629i(this.f8074e, alVar.f9615c);
    }

    /* renamed from: f */
    public static final void m7948f(C2891ct ctVar) {
        ctVar.mo6679f();
        try {
            ctVar.f8182a.mo6526n(ctVar.f8184c, ctVar.f8185d);
        } finally {
            ctVar.mo6674a(true);
        }
    }

    /* renamed from: g */
    private final long m7949g(C2651bm bmVar, Object obj, long j) {
        bmVar.mo6024e(bmVar.mo6303n(obj, this.f8083n).f7330c, this.f8082m, 0);
        C2650bl blVar = this.f8082m;
        if (blVar.f7341f != -9223372036854775807L && blVar.mo6292a()) {
            C2650bl blVar2 = this.f8082m;
            if (blVar2.f7344i) {
                return C2612ak.m6998w(C2612ak.m6996u(blVar2.f7342g) - this.f8082m.f7341f) - (j + this.f8083n.f7332e);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    private final long m7950h() {
        return m7951i(this.f8093x.f8179q);
    }

    /* renamed from: i */
    private final long m7951i(long j) {
        C2877cf cfVar = this.f8089t.f8130f;
        if (cfVar == null) {
            return 0;
        }
        return Math.max(0, j - (this.f8063J - cfVar.f8108k));
    }

    /* renamed from: j */
    private final long m7952j(C3036as asVar, long j, boolean z) {
        C2880ci ciVar = this.f8089t;
        return m7953k(asVar, j, ciVar.f8128d != ciVar.f8129e, z);
    }

    /* renamed from: k */
    private final long m7953k(C3036as asVar, long j, boolean z, boolean z2) {
        C2880ci ciVar;
        m7931L();
        this.f8055B = false;
        if (z2 || this.f8093x.f8168f == 3) {
            m7928I(2);
        }
        C2877cf cfVar = this.f8089t.f8128d;
        C2877cf cfVar2 = cfVar;
        while (cfVar2 != null && !asVar.equals(cfVar2.f8103f.f8113a)) {
            cfVar2 = cfVar2.f8105h;
        }
        if (z || cfVar != cfVar2 || (cfVar2 != null && cfVar2.f8108k + j < 0)) {
            for (C2893cv o : this.f8074e) {
                m7957o(o);
            }
            if (cfVar2 != null) {
                while (true) {
                    ciVar = this.f8089t;
                    if (ciVar.f8128d == cfVar2) {
                        break;
                    }
                    ciVar.mo6647a();
                }
                ciVar.mo6656j(cfVar2);
                cfVar2.f8108k = 1000000000000L;
                m7959q();
            }
        }
        if (cfVar2 != null) {
            this.f8089t.mo6656j(cfVar2);
            if (!cfVar2.f8101d) {
                cfVar2.f8103f = cfVar2.f8103f.mo6643b(j);
            } else if (cfVar2.f8102e) {
                j = cfVar2.f8098a.mo6811f(j);
                cfVar2.f8098a.mo6815i(j - this.f8084o, this.f8085p);
            }
            m7921B(j);
            m7966x();
        } else {
            this.f8089t.mo6652f();
            m7921B(j);
        }
        m7962t(false);
        this.f8070a.mo6170i(2);
        return j;
    }

    /* renamed from: l */
    private final Pair m7954l(C2651bm bmVar) {
        long j = 0;
        if (bmVar.mo6304o()) {
            return Pair.create(C2888cq.f8163a, 0L);
        }
        C2651bm bmVar2 = bmVar;
        Pair l = bmVar2.mo6301l(this.f8082m, this.f8083n, bmVar.mo6296g(this.f8058E), -9223372036854775807L);
        C3036as e = this.f8089t.mo6651e(bmVar, l.first, 0);
        long longValue = ((Long) l.second).longValue();
        if (e.mo6102a()) {
            bmVar.mo6303n(e.f7204a, this.f8083n);
            if (e.f7206c == this.f8083n.mo6283d(e.f7205b)) {
                j = this.f8083n.f7334g.f7416d;
            }
            longValue = j;
        }
        return Pair.create(e, Long.valueOf(longValue));
    }

    /* renamed from: m */
    private static Pair m7955m(C2651bm bmVar, C2856bz bzVar, boolean z, int i, boolean z2, C2650bl blVar, C2649bk bkVar) {
        Object a;
        C2651bm bmVar2 = bmVar;
        C2856bz bzVar2 = bzVar;
        C2649bk bkVar2 = bkVar;
        C2651bm bmVar3 = bzVar2.f8036a;
        if (bmVar.mo6304o()) {
            return null;
        }
        C2651bm bmVar4 = true == bmVar3.mo6304o() ? bmVar2 : bmVar3;
        try {
            Pair l = bmVar4.mo6301l(blVar, bkVar, bzVar2.f8037b, bzVar2.f8038c);
            if (bmVar.equals(bmVar4)) {
                return l;
            }
            if (bmVar.mo6020a(l.first) == -1) {
                C2650bl blVar2 = blVar;
                if (z && (a = m7946a(blVar, bkVar, i, z2, l.first, bmVar4, bmVar)) != null) {
                    return bmVar.mo6301l(blVar, bkVar, bmVar.mo6303n(a, bkVar2).f7330c, -9223372036854775807L);
                }
                return null;
            } else if (!bmVar4.mo6303n(l.first, bkVar2).f7333f || bmVar4.mo6024e(bkVar2.f7330c, blVar, 0).f7350o != bmVar4.mo6020a(l.first)) {
                return l;
            } else {
                return bmVar.mo6301l(blVar, bkVar, bmVar.mo6303n(l.first, bkVar2).f7330c, bzVar2.f8038c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: n */
    private final C2888cq m7956n(C3036as asVar, long j, long j2, long j3, boolean z, int i) {
        C58485gu guVar;
        C3205al alVar;
        C3107cr crVar;
        C3107cr crVar2;
        C3205al alVar2;
        C3205al alVar3;
        C3107cr crVar3;
        C3036as asVar2 = asVar;
        long j4 = j2;
        int i2 = i;
        boolean z2 = false;
        this.f8065L = this.f8065L || j != this.f8093x.f8181s || !asVar2.equals(this.f8093x.f8165c);
        m7920A();
        C2888cq cqVar = this.f8093x;
        C3107cr crVar4 = cqVar.f8171i;
        C3205al alVar4 = cqVar.f8172j;
        List list = cqVar.f8173k;
        if (this.f8090u.f8159i) {
            C2877cf cfVar = this.f8089t.f8128d;
            if (cfVar == null) {
                crVar2 = C3107cr.f9108a;
            } else {
                crVar2 = cfVar.f8106i;
            }
            if (cfVar == null) {
                alVar2 = this.f8078i;
            } else {
                alVar2 = cfVar.f8107j;
            }
            C3197ad[] adVarArr = alVar2.f9615c;
            C58480gp gpVar = new C58480gp(4);
            int length = adVarArr.length;
            int i3 = 0;
            boolean z3 = false;
            while (i3 < length) {
                C3197ad adVar = adVarArr[i3];
                if (adVar != null) {
                    Metadata metadata = adVar.mo7033k(0).f7494l;
                    if (metadata == null) {
                        crVar3 = crVar2;
                        alVar3 = alVar2;
                        gpVar.mo55395g(new Metadata(-9223372036854775807L, new Metadata.Entry[0]));
                    } else {
                        crVar3 = crVar2;
                        alVar3 = alVar2;
                        gpVar.mo55395g(metadata);
                        z3 = true;
                    }
                } else {
                    crVar3 = crVar2;
                    alVar3 = alVar2;
                }
                i3++;
                crVar2 = crVar3;
                alVar2 = alVar3;
            }
            C3107cr crVar5 = crVar2;
            C3205al alVar5 = alVar2;
            C58485gu f = z3 ? gpVar.mo55394f() : C58485gu.m89845m();
            if (cfVar != null) {
                C2878cg cgVar = cfVar.f8103f;
                if (cgVar.f8115c != j4) {
                    cfVar.f8103f = cgVar.mo6642a(j4);
                }
            }
            guVar = f;
            crVar = crVar5;
            alVar = alVar5;
        } else if (!asVar2.equals(cqVar.f8165c)) {
            crVar = C3107cr.f9108a;
            alVar = this.f8078i;
            guVar = C58485gu.m89845m();
        } else {
            crVar = crVar4;
            alVar = alVar4;
            guVar = list;
        }
        if (z) {
            C2855by byVar = this.f8094y;
            if (!byVar.f8032d || byVar.f8033e == 5) {
                byVar.f8029a = true;
                byVar.f8032d = true;
                byVar.f8033e = i2;
            } else {
                if (i2 == 5) {
                    z2 = true;
                }
                C2601a.m6830b(z2);
            }
        }
        return this.f8093x.mo6668b(asVar, j, j2, j3, m7950h(), crVar, alVar, guVar);
    }

    /* renamed from: o */
    private final void m7957o(C2893cv cvVar) {
        if (m7937R(cvVar)) {
            C3265m mVar = this.f8086q;
            if (cvVar == mVar.f9805c) {
                mVar.f9806d = null;
                mVar.f9805c = null;
                mVar.f9807e = true;
            }
            m7944Y(cvVar);
            cvVar.mo6692l();
            this.f8061H--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0408, code lost:
        if (m7938S() != false) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0472, code lost:
        if (r10.f8079j.mo6627g(m7950h(), r10.f8086q.mo6523b().f7313b, r10.f8055B, r32) != false) goto L_0x0474;
     */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x05cc A[ADDED_TO_REGION] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7958p() {
        /*
            r46 = this;
            r10 = r46
            long r11 = android.os.SystemClock.uptimeMillis()
            androidx.media3.common.b.n r0 = r10.f8070a
            r0.mo6169h()
            androidx.media3.exoplayer.cq r0 = r10.f8093x
            androidx.media3.common.bm r0 = r0.f8164b
            boolean r0 = r0.mo6304o()
            r13 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            r8 = 0
            if (r0 != 0) goto L_0x031e
            androidx.media3.exoplayer.cp r0 = r10.f8090u
            boolean r0 = r0.f8159i
            if (r0 != 0) goto L_0x0025
            goto L_0x031e
        L_0x0025:
            androidx.media3.exoplayer.ci r0 = r10.f8089t
            long r1 = r10.f8063J
            r0.mo6654h(r1)
            androidx.media3.exoplayer.ci r0 = r10.f8089t
            androidx.media3.exoplayer.cf r1 = r0.f8130f
            if (r1 == 0) goto L_0x004e
            androidx.media3.exoplayer.cg r2 = r1.f8103f
            boolean r2 = r2.f8121i
            if (r2 != 0) goto L_0x00dd
            boolean r1 = r1.mo6638h()
            if (r1 == 0) goto L_0x00dd
            androidx.media3.exoplayer.cf r1 = r0.f8130f
            androidx.media3.exoplayer.cg r1 = r1.f8103f
            long r1 = r1.f8117e
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x00dd
            int r0 = r0.f8131g
            r1 = 100
            if (r0 >= r1) goto L_0x00dd
        L_0x004e:
            androidx.media3.exoplayer.ci r0 = r10.f8089t
            long r1 = r10.f8063J
            androidx.media3.exoplayer.cq r3 = r10.f8093x
            androidx.media3.exoplayer.cf r4 = r0.f8130f
            if (r4 != 0) goto L_0x006f
            androidx.media3.common.bm r1 = r3.f8164b
            androidx.media3.exoplayer.h.as r2 = r3.f8165c
            long r4 = r3.f8166d
            long r6 = r3.f8181s
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r4
            r21 = r6
            androidx.media3.exoplayer.cg r0 = r16.mo6649c(r17, r18, r19, r21)
            goto L_0x0075
        L_0x006f:
            androidx.media3.common.bm r3 = r3.f8164b
            androidx.media3.exoplayer.cg r0 = r0.mo6648b(r3, r4, r1)
        L_0x0075:
            if (r0 == 0) goto L_0x00dd
            androidx.media3.exoplayer.ci r1 = r10.f8089t
            androidx.media3.exoplayer.cw[] r2 = r10.f8076g
            androidx.media3.exoplayer.j.ak r3 = r10.f8077h
            androidx.media3.exoplayer.cd r4 = r10.f8079j
            androidx.media3.exoplayer.k.g r21 = r4.mo6628h()
            androidx.media3.exoplayer.cp r4 = r10.f8090u
            androidx.media3.exoplayer.j.al r5 = r10.f8078i
            androidx.media3.exoplayer.cf r6 = r1.f8130f
            if (r6 != 0) goto L_0x0093
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r18 = r6
            goto L_0x009f
        L_0x0093:
            long r14 = r6.f8108k
            androidx.media3.exoplayer.cg r6 = r6.f8103f
            long r6 = r6.f8117e
            long r14 = r14 + r6
            long r6 = r0.f8114b
            long r14 = r14 - r6
            r18 = r14
        L_0x009f:
            androidx.media3.exoplayer.cf r6 = new androidx.media3.exoplayer.cf
            r16 = r6
            r17 = r2
            r20 = r3
            r22 = r4
            r23 = r0
            r24 = r5
            r16.<init>(r17, r18, r20, r21, r22, r23, r24)
            androidx.media3.exoplayer.cf r2 = r1.f8130f
            if (r2 == 0) goto L_0x00b8
            r2.mo6636f(r6)
            goto L_0x00bc
        L_0x00b8:
            r1.f8128d = r6
            r1.f8129e = r6
        L_0x00bc:
            r1.f8132h = r13
            r1.f8130f = r6
            int r2 = r1.f8131g
            int r2 = r2 + r9
            r1.f8131g = r2
            r1.mo6653g()
            androidx.media3.exoplayer.h.aq r1 = r6.f8098a
            long r2 = r0.f8114b
            r1.mo6812fc(r10, r2)
            androidx.media3.exoplayer.ci r1 = r10.f8089t
            androidx.media3.exoplayer.cf r1 = r1.f8128d
            if (r1 != r6) goto L_0x00da
            long r0 = r0.f8114b
            r10.m7921B(r0)
        L_0x00da:
            r10.m7962t(r8)
        L_0x00dd:
            boolean r0 = r10.f8056C
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r46.m7936Q()
            r10.f8056C = r0
            r46.m7932M()
            goto L_0x00ee
        L_0x00eb:
            r46.m7966x()
        L_0x00ee:
            androidx.media3.exoplayer.ci r0 = r10.f8089t
            androidx.media3.exoplayer.cf r0 = r0.f8129e
            if (r0 != 0) goto L_0x00f6
            goto L_0x023b
        L_0x00f6:
            androidx.media3.exoplayer.cf r1 = r0.f8105h
            if (r1 == 0) goto L_0x01f5
            boolean r1 = r10.f8054A
            if (r1 == 0) goto L_0x0100
            goto L_0x01f5
        L_0x0100:
            boolean r1 = r0.f8101d
            if (r1 == 0) goto L_0x023b
            r1 = 0
        L_0x0105:
            androidx.media3.exoplayer.cv[] r2 = r10.f8074e
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0141
            r2 = r2[r1]
            androidx.media3.exoplayer.h.cf[] r3 = r0.f8100c
            r3 = r3[r1]
            androidx.media3.exoplayer.h.cf r4 = r2.mo6691k()
            if (r4 != r3) goto L_0x023b
            if (r3 == 0) goto L_0x013e
            boolean r3 = r2.mo6684E()
            if (r3 != 0) goto L_0x013e
            androidx.media3.exoplayer.cf r3 = r0.f8105h
            androidx.media3.exoplayer.cg r4 = r0.f8103f
            boolean r4 = r4.f8118f
            if (r4 == 0) goto L_0x023b
            boolean r4 = r3.f8101d
            if (r4 == 0) goto L_0x023b
            boolean r4 = r2 instanceof androidx.media3.exoplayer.p149i.C3191d
            if (r4 != 0) goto L_0x013e
            boolean r4 = r2 instanceof androidx.media3.exoplayer.p143f.C3000c
            if (r4 != 0) goto L_0x013e
            long r4 = r2.mo6689f()
            long r2 = r3.mo6634d()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x023b
        L_0x013e:
            int r1 = r1 + 1
            goto L_0x0105
        L_0x0141:
            androidx.media3.exoplayer.cf r1 = r0.f8105h
            boolean r2 = r1.f8101d
            if (r2 != 0) goto L_0x0151
            long r2 = r10.f8063J
            long r4 = r1.mo6634d()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x023b
        L_0x0151:
            androidx.media3.exoplayer.j.al r7 = r0.f8107j
            androidx.media3.exoplayer.ci r1 = r10.f8089t
            androidx.media3.exoplayer.cf r2 = r1.f8129e
            if (r2 == 0) goto L_0x015f
            androidx.media3.exoplayer.cf r2 = r2.f8105h
            if (r2 == 0) goto L_0x015f
            r2 = 1
            goto L_0x0160
        L_0x015f:
            r2 = 0
        L_0x0160:
            androidx.media3.common.p136b.C2601a.m6832d(r2)
            androidx.media3.exoplayer.cf r2 = r1.f8129e
            androidx.media3.exoplayer.cf r2 = r2.f8105h
            r1.f8129e = r2
            r1.mo6653g()
            androidx.media3.exoplayer.cf r14 = r1.f8129e
            androidx.media3.exoplayer.j.al r15 = r14.f8107j
            androidx.media3.exoplayer.cq r1 = r10.f8093x
            androidx.media3.common.bm r3 = r1.f8164b
            androidx.media3.exoplayer.cg r1 = r14.f8103f
            androidx.media3.exoplayer.h.as r2 = r1.f8113a
            androidx.media3.exoplayer.cg r0 = r0.f8103f
            androidx.media3.exoplayer.h.as r4 = r0.f8113a
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r46
            r1 = r3
            r0.m7934O(r1, r2, r3, r4, r5)
            boolean r0 = r14.f8101d
            if (r0 == 0) goto L_0x01b2
            androidx.media3.exoplayer.h.aq r0 = r14.f8098a
            long r0 = r0.mo6810e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x01b2
            long r0 = r14.mo6634d()
            androidx.media3.exoplayer.cv[] r2 = r10.f8074e
            int r3 = r2.length
            r4 = 0
        L_0x01a2:
            if (r4 >= r3) goto L_0x023b
            r5 = r2[r4]
            androidx.media3.exoplayer.h.cf r6 = r5.mo6691k()
            if (r6 == 0) goto L_0x01af
            m7945Z(r5, r0)
        L_0x01af:
            int r4 = r4 + 1
            goto L_0x01a2
        L_0x01b2:
            r0 = 0
        L_0x01b3:
            androidx.media3.exoplayer.cv[] r1 = r10.f8074e
            int r1 = r1.length
            if (r0 >= r1) goto L_0x023b
            boolean r1 = r7.mo7207b(r0)
            boolean r2 = r15.mo7207b(r0)
            if (r1 == 0) goto L_0x01f2
            androidx.media3.exoplayer.cv[] r1 = r10.f8074e
            r1 = r1[r0]
            boolean r1 = r1.mo6685F()
            if (r1 != 0) goto L_0x01f2
            androidx.media3.exoplayer.cw[] r1 = r10.f8076g
            r1 = r1[r0]
            int r1 = r1.mo6701eV()
            androidx.media3.exoplayer.cx[] r3 = r7.f9614b
            r3 = r3[r0]
            androidx.media3.exoplayer.cx[] r4 = r15.f9614b
            r4 = r4[r0]
            if (r2 == 0) goto L_0x01e7
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto L_0x01e7
            r2 = -2
            if (r1 != r2) goto L_0x01f2
        L_0x01e7:
            androidx.media3.exoplayer.cv[] r1 = r10.f8074e
            r1 = r1[r0]
            long r2 = r14.mo6634d()
            m7945Z(r1, r2)
        L_0x01f2:
            int r0 = r0 + 1
            goto L_0x01b3
        L_0x01f5:
            androidx.media3.exoplayer.cg r1 = r0.f8103f
            boolean r1 = r1.f8121i
            if (r1 != 0) goto L_0x01ff
            boolean r1 = r10.f8054A
            if (r1 == 0) goto L_0x023b
        L_0x01ff:
            r1 = 0
        L_0x0200:
            androidx.media3.exoplayer.cv[] r2 = r10.f8074e
            int r3 = r2.length
            if (r1 >= r3) goto L_0x023b
            r2 = r2[r1]
            androidx.media3.exoplayer.h.cf[] r3 = r0.f8100c
            r3 = r3[r1]
            if (r3 == 0) goto L_0x0238
            androidx.media3.exoplayer.h.cf r4 = r2.mo6691k()
            if (r4 != r3) goto L_0x0238
            boolean r3 = r2.mo6684E()
            if (r3 == 0) goto L_0x0238
            androidx.media3.exoplayer.cg r3 = r0.f8103f
            long r3 = r3.f8117e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0230
            r5 = -9223372036854775808
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0230
            long r5 = r0.f8108k
            long r3 = r3 + r5
            goto L_0x0235
        L_0x0230:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0235:
            m7945Z(r2, r3)
        L_0x0238:
            int r1 = r1 + 1
            goto L_0x0200
        L_0x023b:
            androidx.media3.exoplayer.ci r0 = r10.f8089t
            androidx.media3.exoplayer.cf r1 = r0.f8129e
            if (r1 == 0) goto L_0x029d
            androidx.media3.exoplayer.cf r0 = r0.f8128d
            if (r0 == r1) goto L_0x029d
            boolean r0 = r1.f8104g
            if (r0 == 0) goto L_0x024a
            goto L_0x029d
        L_0x024a:
            androidx.media3.exoplayer.j.al r0 = r1.f8107j
            r2 = 0
            r3 = 0
        L_0x024e:
            androidx.media3.exoplayer.cv[] r4 = r10.f8074e
            int r5 = r4.length
            if (r2 >= r5) goto L_0x0298
            r14 = r4[r2]
            boolean r4 = m7937R(r14)
            if (r4 == 0) goto L_0x0295
            androidx.media3.exoplayer.h.cf r4 = r14.mo6691k()
            androidx.media3.exoplayer.h.cf[] r5 = r1.f8100c
            r5 = r5[r2]
            boolean r6 = r0.mo7207b(r2)
            if (r6 == 0) goto L_0x026c
            if (r4 != r5) goto L_0x026c
            goto L_0x0295
        L_0x026c:
            boolean r4 = r14.mo6685F()
            if (r4 != 0) goto L_0x028a
            androidx.media3.exoplayer.j.ad[] r4 = r0.f9615c
            r4 = r4[r2]
            androidx.media3.common.x[] r15 = m7943X(r4)
            androidx.media3.exoplayer.h.cf[] r4 = r1.f8100c
            r16 = r4[r2]
            long r17 = r1.mo6634d()
            long r4 = r1.f8108k
            r19 = r4
            r14.mo6696x(r15, r16, r17, r19)
            goto L_0x0295
        L_0x028a:
            boolean r4 = r14.mo6505J()
            if (r4 == 0) goto L_0x0294
            r10.m7957o(r14)
            goto L_0x0295
        L_0x0294:
            r3 = 1
        L_0x0295:
            int r2 = r2 + 1
            goto L_0x024e
        L_0x0298:
            if (r3 != 0) goto L_0x029d
            r46.m7959q()
        L_0x029d:
            r0 = 0
        L_0x029e:
            boolean r1 = r46.m7941V()
            if (r1 == 0) goto L_0x031e
            boolean r1 = r10.f8054A
            if (r1 != 0) goto L_0x031e
            androidx.media3.exoplayer.ci r1 = r10.f8089t
            androidx.media3.exoplayer.cf r1 = r1.f8128d
            if (r1 == 0) goto L_0x031e
            androidx.media3.exoplayer.cf r1 = r1.f8105h
            if (r1 == 0) goto L_0x031e
            long r2 = r10.f8063J
            long r4 = r1.mo6634d()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x031e
            boolean r1 = r1.f8104g
            if (r1 == 0) goto L_0x031e
            if (r0 == 0) goto L_0x02c5
            r46.m7967y()
        L_0x02c5:
            androidx.media3.exoplayer.ci r0 = r10.f8089t
            androidx.media3.exoplayer.cf r0 = r0.mo6647a()
            r0.getClass()
            androidx.media3.exoplayer.cq r1 = r10.f8093x
            androidx.media3.exoplayer.h.as r1 = r1.f8165c
            java.lang.Object r1 = r1.f7204a
            androidx.media3.exoplayer.cg r2 = r0.f8103f
            androidx.media3.exoplayer.h.as r2 = r2.f8113a
            java.lang.Object r2 = r2.f7204a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02f9
            androidx.media3.exoplayer.cq r1 = r10.f8093x
            androidx.media3.exoplayer.h.as r1 = r1.f8165c
            int r2 = r1.f7205b
            r3 = -1
            if (r2 != r3) goto L_0x02f9
            androidx.media3.exoplayer.cg r2 = r0.f8103f
            androidx.media3.exoplayer.h.as r2 = r2.f8113a
            int r4 = r2.f7205b
            if (r4 != r3) goto L_0x02f9
            int r1 = r1.f7208e
            int r2 = r2.f7208e
            if (r1 == r2) goto L_0x02f9
            r1 = 1
            goto L_0x02fa
        L_0x02f9:
            r1 = 0
        L_0x02fa:
            androidx.media3.exoplayer.cg r0 = r0.f8103f
            androidx.media3.exoplayer.h.as r2 = r0.f8113a
            long r6 = r0.f8114b
            long r4 = r0.f8115c
            r14 = r1 ^ 1
            r15 = 0
            r0 = r46
            r1 = r2
            r2 = r6
            r13 = 0
            r8 = r14
            r14 = 1
            r9 = r15
            androidx.media3.exoplayer.cq r0 = r0.m7956n(r1, r2, r4, r6, r8, r9)
            r10.f8093x = r0
            r46.m7920A()
            r46.m7933N()
            r0 = 1
            r8 = 0
            r9 = 1
            r13 = 0
            goto L_0x029e
        L_0x031e:
            r13 = 0
            r14 = 1
            androidx.media3.exoplayer.cq r0 = r10.f8093x
            int r0 = r0.f8168f
            if (r0 == r14) goto L_0x05e3
            r1 = 4
            if (r0 != r1) goto L_0x032b
            goto L_0x05e3
        L_0x032b:
            androidx.media3.exoplayer.ci r0 = r10.f8089t
            androidx.media3.exoplayer.cf r0 = r0.f8128d
            r2 = 10
            if (r0 != 0) goto L_0x0337
            r10.m7924E(r11, r2)
            return
        L_0x0337:
            int r4 = androidx.media3.common.p136b.C2612ak.f7249a
            java.lang.String r4 = "doSomeWork"
            android.os.Trace.beginSection(r4)
            r46.m7933N()
            boolean r4 = r0.f8101d
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x03ba
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 * r5
            androidx.media3.exoplayer.h.aq r4 = r0.f8098a
            androidx.media3.exoplayer.cq r9 = r10.f8093x
            long r14 = r9.f8181s
            long r2 = r10.f8084o
            long r14 = r14 - r2
            boolean r2 = r10.f8085p
            r4.mo6815i(r14, r2)
            r2 = 0
            r3 = 1
            r9 = 1
        L_0x035e:
            androidx.media3.exoplayer.cv[] r4 = r10.f8074e
            int r14 = r4.length
            if (r2 >= r14) goto L_0x03b7
            r4 = r4[r2]
            boolean r14 = m7937R(r4)
            if (r14 != 0) goto L_0x036c
            goto L_0x03b4
        L_0x036c:
            long r14 = r10.f8063J
            r4.mo6686I(r14, r7)
            if (r3 == 0) goto L_0x037b
            boolean r3 = r4.mo6505J()
            if (r3 == 0) goto L_0x037b
            r3 = 1
            goto L_0x037c
        L_0x037b:
            r3 = 0
        L_0x037c:
            androidx.media3.exoplayer.h.cf[] r14 = r0.f8100c
            r14 = r14[r2]
            androidx.media3.exoplayer.h.cf r15 = r4.mo6691k()
            if (r14 == r15) goto L_0x0388
            r14 = 1
            goto L_0x0389
        L_0x0388:
            r14 = 0
        L_0x0389:
            if (r14 != 0) goto L_0x0393
            boolean r15 = r4.mo6684E()
            if (r15 == 0) goto L_0x0393
            r15 = 1
            goto L_0x0394
        L_0x0393:
            r15 = 0
        L_0x0394:
            if (r14 != 0) goto L_0x03a7
            if (r15 != 0) goto L_0x03a7
            boolean r14 = r4.mo6506K()
            if (r14 != 0) goto L_0x03a7
            boolean r14 = r4.mo6505J()
            if (r14 == 0) goto L_0x03a5
            goto L_0x03a7
        L_0x03a5:
            r14 = 0
            goto L_0x03a8
        L_0x03a7:
            r14 = 1
        L_0x03a8:
            if (r9 == 0) goto L_0x03ae
            if (r14 == 0) goto L_0x03ae
            r9 = 1
            goto L_0x03af
        L_0x03ae:
            r9 = 0
        L_0x03af:
            if (r14 != 0) goto L_0x03b4
            r4.mo6695p()
        L_0x03b4:
            int r2 = r2 + 1
            goto L_0x035e
        L_0x03b7:
            r2 = r9
            r9 = r3
            goto L_0x03c1
        L_0x03ba:
            androidx.media3.exoplayer.h.aq r2 = r0.f8098a
            r2.mo6816j()
            r2 = 1
            r9 = 1
        L_0x03c1:
            androidx.media3.exoplayer.cg r3 = r0.f8103f
            long r3 = r3.f8117e
            r7 = 3
            r8 = 2
            if (r9 == 0) goto L_0x03fa
            boolean r9 = r0.f8101d
            if (r9 == 0) goto L_0x03fa
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x03de
            androidx.media3.exoplayer.cq r9 = r10.f8093x
            long r14 = r9.f8181s
            int r9 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x03fa
        L_0x03de:
            boolean r3 = r10.f8054A
            if (r3 == 0) goto L_0x03ec
            r10.f8054A = r13
            androidx.media3.exoplayer.cq r3 = r10.f8093x
            int r3 = r3.f8176n
            r4 = 5
            r10.m7927H(r13, r3, r13, r4)
        L_0x03ec:
            androidx.media3.exoplayer.cg r3 = r0.f8103f
            boolean r3 = r3.f8121i
            if (r3 == 0) goto L_0x03fa
            r10.m7928I(r1)
            r46.m7931L()
            goto L_0x04de
        L_0x03fa:
            androidx.media3.exoplayer.cq r3 = r10.f8093x
            int r4 = r3.f8168f
            if (r4 != r8) goto L_0x0484
            int r4 = r10.f8061H
            if (r4 != 0) goto L_0x040c
            boolean r3 = r46.m7938S()
            if (r3 == 0) goto L_0x0484
            goto L_0x0474
        L_0x040c:
            if (r2 != 0) goto L_0x0410
            goto L_0x0484
        L_0x0410:
            boolean r4 = r3.f8170h
            if (r4 == 0) goto L_0x0474
            androidx.media3.common.bm r3 = r3.f8164b
            androidx.media3.exoplayer.ci r4 = r10.f8089t
            androidx.media3.exoplayer.cf r4 = r4.f8128d
            androidx.media3.exoplayer.cg r4 = r4.f8103f
            androidx.media3.exoplayer.h.as r4 = r4.f8113a
            boolean r3 = r10.m7942W(r3, r4)
            if (r3 == 0) goto L_0x042b
            androidx.media3.exoplayer.j r3 = r10.f8069P
            long r3 = r3.f9574m
            r32 = r3
            goto L_0x0430
        L_0x042b:
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0430:
            androidx.media3.exoplayer.ci r3 = r10.f8089t
            androidx.media3.exoplayer.cf r3 = r3.f8130f
            boolean r4 = r3.mo6638h()
            if (r4 == 0) goto L_0x0442
            androidx.media3.exoplayer.cg r4 = r3.f8103f
            boolean r4 = r4.f8121i
            if (r4 == 0) goto L_0x0442
            r9 = 1
            goto L_0x0443
        L_0x0442:
            r9 = 0
        L_0x0443:
            androidx.media3.exoplayer.cg r4 = r3.f8103f
            androidx.media3.exoplayer.h.as r4 = r4.f8113a
            boolean r4 = r4.mo6102a()
            if (r4 == 0) goto L_0x0453
            boolean r3 = r3.f8101d
            if (r3 != 0) goto L_0x0453
            r3 = 1
            goto L_0x0454
        L_0x0453:
            r3 = 0
        L_0x0454:
            if (r9 != 0) goto L_0x0474
            if (r3 != 0) goto L_0x0474
            androidx.media3.exoplayer.cd r3 = r10.f8079j
            long r28 = r46.m7950h()
            androidx.media3.exoplayer.m r4 = r10.f8086q
            androidx.media3.common.bb r4 = r4.mo6523b()
            float r4 = r4.f7313b
            boolean r9 = r10.f8055B
            r27 = r3
            r30 = r4
            r31 = r9
            boolean r3 = r27.mo6627g(r28, r30, r31, r32)
            if (r3 == 0) goto L_0x0484
        L_0x0474:
            r10.m7928I(r7)
            r2 = 0
            r10.f8066M = r2
            boolean r2 = r46.m7941V()
            if (r2 == 0) goto L_0x04de
            r46.m7929J()
            goto L_0x04de
        L_0x0484:
            androidx.media3.exoplayer.cq r3 = r10.f8093x
            int r3 = r3.f8168f
            if (r3 != r7) goto L_0x04de
            int r3 = r10.f8061H
            if (r3 != 0) goto L_0x0495
            boolean r2 = r46.m7938S()
            if (r2 != 0) goto L_0x04de
            goto L_0x0497
        L_0x0495:
            if (r2 != 0) goto L_0x04de
        L_0x0497:
            boolean r2 = r46.m7941V()
            r10.f8055B = r2
            r10.m7928I(r8)
            boolean r2 = r10.f8055B
            if (r2 == 0) goto L_0x04db
            androidx.media3.exoplayer.ci r2 = r10.f8089t
            androidx.media3.exoplayer.cf r2 = r2.f8128d
        L_0x04a8:
            if (r2 == 0) goto L_0x04ba
            androidx.media3.exoplayer.j.al r3 = r2.f8107j
            androidx.media3.exoplayer.j.ad[] r3 = r3.f9615c
            int r4 = r3.length
            r9 = 0
        L_0x04b0:
            if (r9 >= r4) goto L_0x04b7
            r14 = r3[r9]
            int r9 = r9 + 1
            goto L_0x04b0
        L_0x04b7:
            androidx.media3.exoplayer.cf r2 = r2.f8105h
            goto L_0x04a8
        L_0x04ba:
            androidx.media3.exoplayer.j r2 = r10.f8069P
            long r3 = r2.f9574m
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x04c8
            goto L_0x04db
        L_0x04c8:
            long r5 = r2.f9567f
            long r3 = r3 + r5
            r2.f9574m = r3
            long r5 = r2.f9573l
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x04d9
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x04d9
            r2.f9574m = r5
        L_0x04d9:
            r2.f9578q = r14
        L_0x04db:
            r46.m7931L()
        L_0x04de:
            androidx.media3.exoplayer.cq r2 = r10.f8093x
            int r2 = r2.f8168f
            if (r2 != r8) goto L_0x0547
            r2 = 0
        L_0x04e5:
            androidx.media3.exoplayer.cv[] r3 = r10.f8074e
            int r4 = r3.length
            if (r2 >= r4) goto L_0x050a
            r3 = r3[r2]
            boolean r3 = m7937R(r3)
            if (r3 == 0) goto L_0x0507
            androidx.media3.exoplayer.cv[] r3 = r10.f8074e
            r3 = r3[r2]
            androidx.media3.exoplayer.h.cf r3 = r3.mo6691k()
            androidx.media3.exoplayer.h.cf[] r4 = r0.f8100c
            r4 = r4[r2]
            if (r3 != r4) goto L_0x0507
            androidx.media3.exoplayer.cv[] r3 = r10.f8074e
            r3 = r3[r2]
            r3.mo6695p()
        L_0x0507:
            int r2 = r2 + 1
            goto L_0x04e5
        L_0x050a:
            androidx.media3.exoplayer.cq r0 = r10.f8093x
            boolean r2 = r0.f8170h
            if (r2 != 0) goto L_0x0547
            long r2 = r0.f8180r
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0547
            boolean r0 = r46.m7936Q()
            if (r0 == 0) goto L_0x0547
            long r2 = r10.f8067N
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0531
            long r2 = android.os.SystemClock.elapsedRealtime()
            r10.f8067N = r2
            goto L_0x054e
        L_0x0531:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.f8067N
            long r2 = r2 - r4
            r4 = 4000(0xfa0, double:1.9763E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x053f
            goto L_0x054e
        L_0x053f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x0547:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.f8067N = r2
        L_0x054e:
            boolean r0 = r46.m7941V()
            if (r0 == 0) goto L_0x055c
            androidx.media3.exoplayer.cq r0 = r10.f8093x
            int r0 = r0.f8168f
            if (r0 != r7) goto L_0x055c
            r9 = 1
            goto L_0x055d
        L_0x055c:
            r9 = 0
        L_0x055d:
            boolean r0 = r10.f8060G
            if (r0 == 0) goto L_0x0569
            boolean r0 = r10.f8073d
            if (r0 == 0) goto L_0x0569
            if (r9 == 0) goto L_0x0569
            r0 = 1
            goto L_0x056a
        L_0x0569:
            r0 = 0
        L_0x056a:
            androidx.media3.exoplayer.cq r2 = r10.f8093x
            boolean r3 = r2.f8178p
            if (r3 == r0) goto L_0x05bf
            androidx.media3.exoplayer.cq r3 = new androidx.media3.exoplayer.cq
            r22 = r3
            androidx.media3.common.bm r4 = r2.f8164b
            r23 = r4
            androidx.media3.exoplayer.h.as r4 = r2.f8165c
            r24 = r4
            long r4 = r2.f8166d
            r25 = r4
            long r4 = r2.f8167e
            r27 = r4
            int r4 = r2.f8168f
            r29 = r4
            androidx.media3.exoplayer.o r4 = r2.f8169g
            r30 = r4
            boolean r4 = r2.f8170h
            r31 = r4
            androidx.media3.exoplayer.h.cr r4 = r2.f8171i
            r32 = r4
            androidx.media3.exoplayer.j.al r4 = r2.f8172j
            r33 = r4
            java.util.List r4 = r2.f8173k
            r34 = r4
            androidx.media3.exoplayer.h.as r4 = r2.f8174l
            r35 = r4
            boolean r4 = r2.f8175m
            r36 = r4
            int r4 = r2.f8176n
            r37 = r4
            androidx.media3.common.bb r4 = r2.f8177o
            r38 = r4
            long r4 = r2.f8179q
            r39 = r4
            long r4 = r2.f8180r
            r41 = r4
            long r4 = r2.f8181s
            r43 = r4
            r45 = r0
            r22.<init>(r23, r24, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45)
            r10.f8093x = r3
        L_0x05bf:
            r10.f8073d = r13
            if (r0 != 0) goto L_0x05e0
            androidx.media3.exoplayer.cq r0 = r10.f8093x
            int r0 = r0.f8168f
            if (r0 != r1) goto L_0x05ca
            goto L_0x05e0
        L_0x05ca:
            if (r9 != 0) goto L_0x05db
            if (r0 != r8) goto L_0x05cf
            goto L_0x05db
        L_0x05cf:
            if (r0 != r7) goto L_0x05e0
            int r0 = r10.f8061H
            if (r0 == 0) goto L_0x05e0
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.m7924E(r11, r0)
            goto L_0x05e0
        L_0x05db:
            r0 = 10
            r10.m7924E(r11, r0)
        L_0x05e0:
            android.os.Trace.endSection()
        L_0x05e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2872ca.m7958p():void");
    }

    /* renamed from: q */
    private final void m7959q() {
        m7960r(new boolean[this.f8074e.length]);
    }

    /* renamed from: r */
    private final void m7960r(boolean[] zArr) {
        C2876ce ceVar;
        C2877cf cfVar = this.f8089t.f8129e;
        C3205al alVar = cfVar.f8107j;
        for (int i = 0; i < this.f8074e.length; i++) {
            if (!alVar.mo7207b(i) && this.f8075f.remove(this.f8074e[i])) {
                this.f8074e[i].mo6697y();
            }
        }
        for (int i2 = 0; i2 < this.f8074e.length; i2++) {
            if (alVar.mo7207b(i2)) {
                boolean z = zArr[i2];
                C2893cv cvVar = this.f8074e[i2];
                if (!m7937R(cvVar)) {
                    C2880ci ciVar = this.f8089t;
                    C2877cf cfVar2 = ciVar.f8129e;
                    boolean z2 = cfVar2 == ciVar.f8128d;
                    C3205al alVar2 = cfVar2.f8107j;
                    C2895cx cxVar = alVar2.f9614b[i2];
                    C2680x[] X = m7943X(alVar2.f9615c[i2]);
                    boolean z3 = m7941V() && this.f8093x.f8168f == 3;
                    boolean z4 = !z && z3;
                    this.f8061H++;
                    this.f8075f.add(cvVar);
                    cvVar.mo6693m(cxVar, X, cfVar2.f8100c[i2], this.f8063J, z4, z2, cfVar2.mo6634d(), cfVar2.f8108k);
                    cvVar.mo6526n(11, new C2851bu(this));
                    C3265m mVar = this.f8086q;
                    C2876ce i3 = cvVar.mo6525i();
                    if (!(i3 == null || i3 == (ceVar = mVar.f9806d))) {
                        if (ceVar == null) {
                            mVar.f9806d = i3;
                            mVar.f9805c = cvVar;
                            mVar.f9806d.mo6524c(mVar.f9803a.f8263a);
                        } else {
                            throw C3267o.m9504b(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z3) {
                        cvVar.mo6682C();
                    }
                } else {
                    continue;
                }
            }
        }
        cfVar.f8104g = true;
    }

    /* renamed from: s */
    private final void m7961s(IOException iOException, int i) {
        C3267o oVar = new C3267o(0, iOException, i);
        C2877cf cfVar = this.f8089t.f8128d;
        if (cfVar != null) {
            oVar = oVar.mo7257a(cfVar.f8103f.f8113a);
        }
        C2633u.m7048c("ExoPlayerImplInternal", C2633u.m7046a("Playback error", oVar));
        m7930K(false, false);
        this.f8093x = this.f8093x.mo6670d(oVar);
    }

    /* renamed from: t */
    private final void m7962t(boolean z) {
        long j;
        C2877cf cfVar = this.f8089t.f8130f;
        C3036as asVar = cfVar == null ? this.f8093x.f8165c : cfVar.f8103f.f8113a;
        boolean z2 = !this.f8093x.f8174l.equals(asVar);
        if (z2) {
            this.f8093x = this.f8093x.mo6667a(asVar);
        }
        C2888cq cqVar = this.f8093x;
        if (cfVar == null) {
            j = cqVar.f8181s;
        } else {
            j = cfVar.mo6632b();
        }
        cqVar.f8179q = j;
        this.f8093x.f8180r = m7950h();
        if ((z2 || z) && cfVar != null && cfVar.f8101d) {
            m7947aa(cfVar.f8107j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0303, code lost:
        if (r0.mo6656j(r4) != false) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0306, code lost:
        r11.m7925F(false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0279 A[Catch:{ all -> 0x030e, all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c0 A[Catch:{ all -> 0x030e, all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x030a A[EDGE_INSN: B:254:0x030a->B:179:0x030a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x02f5 A[SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7963u(androidx.media3.common.C2651bm r34, boolean r35) {
        /*
            r33 = this;
            r11 = r33
            r12 = r34
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.exoplayer.bz r8 = r11.f8062I
            androidx.media3.exoplayer.ci r9 = r11.f8089t
            int r4 = r11.f8057D
            boolean r10 = r11.f8058E
            androidx.media3.common.bl r13 = r11.f8082m
            androidx.media3.common.bk r14 = r11.f8083n
            boolean r1 = r34.mo6304o()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 1
            if (r1 == 0) goto L_0x002c
            androidx.media3.exoplayer.h.as r0 = androidx.media3.exoplayer.C2888cq.f8163a
            r8 = r0
            r13 = r16
            r2 = 0
            r6 = -1
            r9 = 0
            r15 = 0
            r25 = 0
            goto L_0x01ec
        L_0x002c:
            androidx.media3.exoplayer.h.as r1 = r0.f8165c
            java.lang.Object r15 = r1.f7204a
            boolean r19 = m7939T(r0, r14)
            androidx.media3.exoplayer.h.as r2 = r0.f8165c
            boolean r2 = r2.mo6102a()
            if (r2 != 0) goto L_0x0042
            if (r19 == 0) goto L_0x003f
            goto L_0x0042
        L_0x003f:
            long r5 = r0.f8181s
            goto L_0x0044
        L_0x0042:
            long r5 = r0.f8166d
        L_0x0044:
            r23 = r5
            if (r8 == 0) goto L_0x0099
            r5 = 1
            r6 = r1
            r1 = r34
            r2 = r8
            r3 = r5
            r7 = -1
            r5 = r10
            r27 = r6
            r6 = r13
            r11 = -1
            r7 = r14
            android.util.Pair r1 = m7955m(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x0066
            int r1 = r12.mo6296g(r10)
            r5 = r1
            r1 = r23
            r3 = 1
            r4 = 0
            r6 = 0
            goto L_0x008e
        L_0x0066:
            long r2 = r8.f8038c
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0078
            java.lang.Object r1 = r1.first
            androidx.media3.common.bk r1 = r12.mo6303n(r1, r14)
            int r5 = r1.f7330c
            r1 = r23
            r3 = 0
            goto L_0x0084
        L_0x0078:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 1
            r5 = -1
        L_0x0084:
            int r4 = r0.f8168f
            r6 = 4
            if (r4 != r6) goto L_0x008b
            r4 = 1
            goto L_0x008c
        L_0x008b:
            r4 = 0
        L_0x008c:
            r6 = r3
            r3 = 0
        L_0x008e:
            r10 = r3
            r8 = r4
            r4 = r5
            r3 = r15
            r7 = r27
            r25 = 0
            r15 = r6
            goto L_0x0142
        L_0x0099:
            r27 = r1
            r11 = -1
            androidx.media3.common.bm r1 = r0.f8164b
            boolean r1 = r1.mo6304o()
            if (r1 == 0) goto L_0x00b5
            int r1 = r12.mo6296g(r10)
        L_0x00a8:
            r4 = r1
            r3 = r15
            r1 = r23
            r7 = r27
            r8 = 0
            r10 = 0
        L_0x00b0:
            r15 = 0
            r25 = 0
            goto L_0x0142
        L_0x00b5:
            int r1 = r12.mo6020a(r15)
            if (r1 != r11) goto L_0x00e0
            androidx.media3.common.bm r6 = r0.f8164b
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r34
            java.lang.Object r1 = m7946a(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00d0
            int r1 = r12.mo6296g(r10)
            r3 = 1
            goto L_0x00d7
        L_0x00d0:
            androidx.media3.common.bk r1 = r12.mo6303n(r1, r14)
            int r1 = r1.f7330c
            r3 = 0
        L_0x00d7:
            r4 = r1
            r10 = r3
            r3 = r15
            r1 = r23
            r7 = r27
            r8 = 0
            goto L_0x00b0
        L_0x00e0:
            int r1 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00eb
            androidx.media3.common.bk r1 = r12.mo6303n(r15, r14)
            int r1 = r1.f7330c
            goto L_0x00a8
        L_0x00eb:
            if (r19 == 0) goto L_0x0137
            androidx.media3.common.bm r1 = r0.f8164b
            r7 = r27
            java.lang.Object r2 = r7.f7204a
            r1.mo6303n(r2, r14)
            androidx.media3.common.bm r1 = r0.f8164b
            int r2 = r14.f7330c
            r5 = 0
            androidx.media3.common.bl r1 = r1.mo6024e(r2, r13, r5)
            int r1 = r1.f7350o
            androidx.media3.common.bm r2 = r0.f8164b
            java.lang.Object r3 = r7.f7204a
            int r2 = r2.mo6020a(r3)
            if (r1 != r2) goto L_0x012d
            long r1 = r14.f7332e
            androidx.media3.common.bk r3 = r12.mo6303n(r15, r14)
            int r4 = r3.f7330c
            long r20 = r23 + r1
            r1 = r34
            r2 = r13
            r3 = r14
            r25 = r5
            r5 = r20
            android.util.Pair r1 = r1.mo6301l(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0131
        L_0x012d:
            r25 = r5
            r1 = r23
        L_0x0131:
            r3 = r15
            r4 = -1
            r8 = 0
            r10 = 0
            r15 = 1
            goto L_0x0142
        L_0x0137:
            r7 = r27
            r25 = 0
            r3 = r15
            r1 = r23
            r4 = -1
            r8 = 0
            r10 = 0
            r15 = 0
        L_0x0142:
            if (r4 == r11) goto L_0x015f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r34
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo6301l(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4 = r1
            r1 = r16
            goto L_0x0160
        L_0x015f:
            r4 = r1
        L_0x0160:
            androidx.media3.exoplayer.h.as r6 = r9.mo6651e(r12, r3, r4)
            int r9 = r6.f7208e
            if (r9 == r11) goto L_0x0171
            int r13 = r7.f7208e
            if (r13 == r11) goto L_0x016f
            if (r9 < r13) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r9 = 0
            goto L_0x0172
        L_0x0171:
            r9 = 1
        L_0x0172:
            java.lang.Object r13 = r7.f7204a
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto L_0x018a
            boolean r13 = r7.mo6102a()
            if (r13 != 0) goto L_0x018a
            boolean r13 = r6.mo6102a()
            if (r13 != 0) goto L_0x018a
            if (r9 == 0) goto L_0x018a
            r9 = 1
            goto L_0x018b
        L_0x018a:
            r9 = 0
        L_0x018b:
            androidx.media3.common.bk r3 = r12.mo6303n(r3, r14)
            if (r19 != 0) goto L_0x01b6
            int r13 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x01b6
            java.lang.Object r13 = r7.f7204a
            java.lang.Object r11 = r6.f7204a
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x01a0
            goto L_0x01b6
        L_0x01a0:
            boolean r11 = r7.mo6102a()
            if (r11 == 0) goto L_0x01ab
            int r11 = r7.f7205b
            r3.mo6288h(r11)
        L_0x01ab:
            boolean r11 = r6.mo6102a()
            if (r11 == 0) goto L_0x01b6
            int r11 = r6.f7205b
            r3.mo6288h(r11)
        L_0x01b6:
            if (r9 != 0) goto L_0x01b9
            goto L_0x01ba
        L_0x01b9:
            r6 = r7
        L_0x01ba:
            boolean r3 = r6.mo6102a()
            if (r3 == 0) goto L_0x01e0
            boolean r3 = r6.equals(r7)
            if (r3 == 0) goto L_0x01c9
            long r3 = r0.f8181s
            goto L_0x01e1
        L_0x01c9:
            java.lang.Object r0 = r6.f7204a
            r12.mo6303n(r0, r14)
            int r0 = r6.f7206c
            int r3 = r6.f7205b
            int r3 = r14.mo6283d(r3)
            if (r0 != r3) goto L_0x01dd
            androidx.media3.common.c r0 = r14.f7334g
            long r3 = r0.f7416d
            goto L_0x01e1
        L_0x01dd:
            r3 = r25
            goto L_0x01e1
        L_0x01e0:
            r3 = r4
        L_0x01e1:
            r11 = r33
            r13 = r1
            r2 = r8
            r8 = r6
            r6 = -1
            r31 = r3
            r3 = r10
            r9 = r31
        L_0x01ec:
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.exoplayer.h.as r0 = r0.f8165c
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0202
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            long r0 = r0.f8181s
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x01ff
            goto L_0x0202
        L_0x01ff:
            r19 = 0
            goto L_0x0204
        L_0x0202:
            r19 = 1
        L_0x0204:
            r20 = 3
            if (r3 == 0) goto L_0x0222
            androidx.media3.exoplayer.cq r0 = r11.f8093x     // Catch:{ all -> 0x021a }
            int r0 = r0.f8168f     // Catch:{ all -> 0x021a }
            r5 = 1
            if (r0 == r5) goto L_0x0214
            r4 = 4
            r11.m7928I(r4)     // Catch:{ all -> 0x021a }
            goto L_0x0215
        L_0x0214:
            r4 = 4
        L_0x0215:
            r3 = 0
            r11.m7968z(r3, r3, r3, r5)     // Catch:{ all -> 0x021a }
            goto L_0x0225
        L_0x021a:
            r0 = move-exception
            r25 = r13
        L_0x021d:
            r6 = 1
            r13 = -1
            r14 = 0
            goto L_0x03c8
        L_0x0222:
            r3 = 0
            r4 = 4
            r5 = 1
        L_0x0225:
            if (r19 != 0) goto L_0x0311
            androidx.media3.exoplayer.ci r0 = r11.f8089t     // Catch:{ all -> 0x021a }
            long r1 = r11.f8063J     // Catch:{ all -> 0x021a }
            androidx.media3.exoplayer.cf r4 = r0.f8129e     // Catch:{ all -> 0x021a }
            r21 = -9223372036854775808
            if (r4 != 0) goto L_0x0236
            r6 = r25
        L_0x0233:
            r25 = r13
            goto L_0x0274
        L_0x0236:
            long r6 = r4.f8108k     // Catch:{ all -> 0x021a }
            boolean r5 = r4.f8101d     // Catch:{ all -> 0x021a }
            if (r5 != 0) goto L_0x023d
            goto L_0x0233
        L_0x023d:
            r5 = 0
        L_0x023e:
            androidx.media3.exoplayer.cv[] r3 = r11.f8074e     // Catch:{ all -> 0x021a }
            r25 = r13
            int r13 = r3.length     // Catch:{ all -> 0x030e }
            if (r5 >= r13) goto L_0x0274
            r3 = r3[r5]     // Catch:{ all -> 0x030e }
            boolean r3 = m7937R(r3)     // Catch:{ all -> 0x030e }
            if (r3 == 0) goto L_0x026f
            androidx.media3.exoplayer.cv[] r3 = r11.f8074e     // Catch:{ all -> 0x030e }
            r3 = r3[r5]     // Catch:{ all -> 0x030e }
            androidx.media3.exoplayer.h.cf r3 = r3.mo6691k()     // Catch:{ all -> 0x030e }
            androidx.media3.exoplayer.h.cf[] r13 = r4.f8100c     // Catch:{ all -> 0x030e }
            r13 = r13[r5]     // Catch:{ all -> 0x030e }
            if (r3 == r13) goto L_0x025c
            goto L_0x026f
        L_0x025c:
            androidx.media3.exoplayer.cv[] r3 = r11.f8074e     // Catch:{ all -> 0x030e }
            r3 = r3[r5]     // Catch:{ all -> 0x030e }
            long r13 = r3.mo6689f()     // Catch:{ all -> 0x030e }
            int r3 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r3 != 0) goto L_0x026b
            r6 = r21
            goto L_0x0274
        L_0x026b:
            long r6 = java.lang.Math.max(r13, r6)     // Catch:{ all -> 0x030e }
        L_0x026f:
            int r5 = r5 + 1
            r13 = r25
            goto L_0x023e
        L_0x0274:
            androidx.media3.exoplayer.cf r3 = r0.f8128d     // Catch:{ all -> 0x030e }
            r4 = 0
        L_0x0277:
            if (r3 == 0) goto L_0x030a
            androidx.media3.exoplayer.cg r5 = r3.f8103f     // Catch:{ all -> 0x030e }
            if (r4 != 0) goto L_0x0286
            androidx.media3.exoplayer.cg r4 = r0.mo6650d(r12, r5)     // Catch:{ all -> 0x030e }
            r27 = r1
            r29 = r15
            goto L_0x02b0
        L_0x0286:
            androidx.media3.exoplayer.cg r13 = r0.mo6648b(r12, r4, r1)     // Catch:{ all -> 0x030e }
            if (r13 != 0) goto L_0x0299
            boolean r0 = r0.mo6656j(r4)     // Catch:{ all -> 0x030e }
            if (r0 != 0) goto L_0x0294
            goto L_0x030a
        L_0x0294:
            r29 = r15
        L_0x0296:
            r3 = 0
            goto L_0x0306
        L_0x0299:
            r27 = r1
            long r1 = r5.f8114b     // Catch:{ all -> 0x030e }
            r29 = r15
            long r14 = r13.f8114b     // Catch:{ all -> 0x03c3 }
            int r30 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r30 != 0) goto L_0x02ff
            androidx.media3.exoplayer.h.as r1 = r5.f8113a     // Catch:{ all -> 0x03c3 }
            androidx.media3.exoplayer.h.as r2 = r13.f8113a     // Catch:{ all -> 0x03c3 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x03c3 }
            if (r1 == 0) goto L_0x02ff
            r4 = r13
        L_0x02b0:
            long r1 = r5.f8115c     // Catch:{ all -> 0x03c3 }
            androidx.media3.exoplayer.cg r1 = r4.mo6642a(r1)     // Catch:{ all -> 0x03c3 }
            r3.f8103f = r1     // Catch:{ all -> 0x03c3 }
            long r1 = r5.f8117e     // Catch:{ all -> 0x03c3 }
            long r13 = r4.f8117e     // Catch:{ all -> 0x03c3 }
            int r5 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x02f5
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x02c5
            goto L_0x02f5
        L_0x02c5:
            r3.mo6637g()     // Catch:{ all -> 0x03c3 }
            long r1 = r4.f8117e     // Catch:{ all -> 0x03c3 }
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x02d4
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x02d7
        L_0x02d4:
            long r4 = r3.f8108k     // Catch:{ all -> 0x03c3 }
            long r1 = r1 + r4
        L_0x02d7:
            androidx.media3.exoplayer.cf r4 = r0.f8129e     // Catch:{ all -> 0x03c3 }
            if (r3 != r4) goto L_0x02eb
            androidx.media3.exoplayer.cg r4 = r3.f8103f     // Catch:{ all -> 0x03c3 }
            boolean r4 = r4.f8118f     // Catch:{ all -> 0x03c3 }
            if (r4 != 0) goto L_0x02eb
            int r4 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r4 == 0) goto L_0x02e9
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x02eb
        L_0x02e9:
            r1 = 1
            goto L_0x02ec
        L_0x02eb:
            r1 = 0
        L_0x02ec:
            boolean r0 = r0.mo6656j(r3)     // Catch:{ all -> 0x03c3 }
            if (r0 != 0) goto L_0x0296
            if (r1 != 0) goto L_0x0296
            goto L_0x0305
        L_0x02f5:
            androidx.media3.exoplayer.cf r1 = r3.f8105h     // Catch:{ all -> 0x03c3 }
            r4 = r3
            r15 = r29
            r3 = r1
            r1 = r27
            goto L_0x0277
        L_0x02ff:
            boolean r0 = r0.mo6656j(r4)     // Catch:{ all -> 0x03c3 }
            if (r0 != 0) goto L_0x0296
        L_0x0305:
            goto L_0x030c
        L_0x0306:
            r11.m7925F(r3)     // Catch:{ all -> 0x03c3 }
            goto L_0x0340
        L_0x030a:
            r29 = r15
        L_0x030c:
            r3 = 0
            goto L_0x0340
        L_0x030e:
            r0 = move-exception
            goto L_0x021d
        L_0x0311:
            r25 = r13
            r29 = r15
            boolean r0 = r34.mo6304o()     // Catch:{ all -> 0x03c3 }
            if (r0 != 0) goto L_0x0340
            androidx.media3.exoplayer.ci r0 = r11.f8089t     // Catch:{ all -> 0x03c3 }
            androidx.media3.exoplayer.cf r0 = r0.f8128d     // Catch:{ all -> 0x03c3 }
        L_0x031f:
            if (r0 == 0) goto L_0x033b
            androidx.media3.exoplayer.cg r1 = r0.f8103f     // Catch:{ all -> 0x03c3 }
            androidx.media3.exoplayer.h.as r1 = r1.f8113a     // Catch:{ all -> 0x03c3 }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x03c3 }
            if (r1 == 0) goto L_0x0338
            androidx.media3.exoplayer.ci r1 = r11.f8089t     // Catch:{ all -> 0x03c3 }
            androidx.media3.exoplayer.cg r4 = r0.f8103f     // Catch:{ all -> 0x03c3 }
            androidx.media3.exoplayer.cg r1 = r1.mo6650d(r12, r4)     // Catch:{ all -> 0x03c3 }
            r0.f8103f = r1     // Catch:{ all -> 0x03c3 }
            r0.mo6637g()     // Catch:{ all -> 0x03c3 }
        L_0x0338:
            androidx.media3.exoplayer.cf r0 = r0.f8105h     // Catch:{ all -> 0x03c3 }
            goto L_0x031f
        L_0x033b:
            long r0 = r11.m7952j(r8, r9, r2)     // Catch:{ all -> 0x03c3 }
            r9 = r0
        L_0x0340:
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.common.bm r4 = r0.f8164b
            androidx.media3.exoplayer.h.as r5 = r0.f8165c
            r15 = r29
            r6 = 1
            if (r6 == r15) goto L_0x034c
            goto L_0x034e
        L_0x034c:
            r16 = r9
        L_0x034e:
            r1 = r33
            r2 = r34
            r13 = 0
            r3 = r8
            r14 = 4
            r15 = 1
            r13 = -1
            r14 = 0
            r6 = r16
            r1.m7934O(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x0367
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            long r0 = r0.f8166d
            int r2 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x03a4
        L_0x0367:
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.exoplayer.h.as r1 = r0.f8165c
            java.lang.Object r1 = r1.f7204a
            androidx.media3.common.bm r0 = r0.f8164b
            if (r19 == 0) goto L_0x0384
            if (r35 == 0) goto L_0x0384
            boolean r2 = r0.mo6304o()
            if (r2 != 0) goto L_0x0384
            androidx.media3.common.bk r2 = r11.f8083n
            androidx.media3.common.bk r0 = r0.mo6303n(r1, r2)
            boolean r0 = r0.f7333f
            if (r0 != 0) goto L_0x0384
            goto L_0x0385
        L_0x0384:
            r15 = 0
        L_0x0385:
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            long r5 = r0.f8167e
            int r0 = r12.mo6020a(r1)
            if (r0 != r13) goto L_0x0392
            r18 = 4
            goto L_0x0394
        L_0x0392:
            r18 = 3
        L_0x0394:
            r1 = r33
            r2 = r8
            r3 = r9
            r7 = r5
            r5 = r25
            r9 = r15
            r10 = r18
            androidx.media3.exoplayer.cq r0 = r1.m7956n(r2, r3, r5, r7, r9, r10)
            r11.f8093x = r0
        L_0x03a4:
            r33.m7920A()
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.common.bm r0 = r0.f8164b
            r11.m7923D(r12, r0)
            androidx.media3.exoplayer.cq r0 = r11.f8093x
            androidx.media3.exoplayer.cq r0 = r0.mo6673g(r12)
            r11.f8093x = r0
            boolean r0 = r34.mo6304o()
            if (r0 != 0) goto L_0x03be
            r11.f8062I = r14
        L_0x03be:
            r1 = 0
            r11.m7962t(r1)
            return
        L_0x03c3:
            r0 = move-exception
            r15 = r29
            goto L_0x021d
        L_0x03c8:
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            androidx.media3.common.bm r4 = r1.f8164b
            androidx.media3.exoplayer.h.as r5 = r1.f8165c
            if (r6 == r15) goto L_0x03d1
            goto L_0x03d3
        L_0x03d1:
            r16 = r9
        L_0x03d3:
            r1 = r33
            r2 = r34
            r3 = r8
            r15 = 1
            r6 = r16
            r1.m7934O(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x03e8
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            long r1 = r1.f8166d
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0425
        L_0x03e8:
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            androidx.media3.exoplayer.h.as r2 = r1.f8165c
            java.lang.Object r2 = r2.f7204a
            androidx.media3.common.bm r1 = r1.f8164b
            if (r19 == 0) goto L_0x0405
            if (r35 == 0) goto L_0x0405
            boolean r3 = r1.mo6304o()
            if (r3 != 0) goto L_0x0405
            androidx.media3.common.bk r3 = r11.f8083n
            androidx.media3.common.bk r1 = r1.mo6303n(r2, r3)
            boolean r1 = r1.f7333f
            if (r1 != 0) goto L_0x0405
            goto L_0x0406
        L_0x0405:
            r15 = 0
        L_0x0406:
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            long r5 = r1.f8167e
            int r1 = r12.mo6020a(r2)
            if (r1 != r13) goto L_0x0413
            r18 = 4
            goto L_0x0415
        L_0x0413:
            r18 = 3
        L_0x0415:
            r1 = r33
            r2 = r8
            r3 = r9
            r7 = r5
            r5 = r25
            r9 = r15
            r10 = r18
            androidx.media3.exoplayer.cq r1 = r1.m7956n(r2, r3, r5, r7, r9, r10)
            r11.f8093x = r1
        L_0x0425:
            r33.m7920A()
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            androidx.media3.common.bm r1 = r1.f8164b
            r11.m7923D(r12, r1)
            androidx.media3.exoplayer.cq r1 = r11.f8093x
            androidx.media3.exoplayer.cq r1 = r1.mo6673g(r12)
            r11.f8093x = r1
            boolean r1 = r34.mo6304o()
            if (r1 != 0) goto L_0x043f
            r11.f8062I = r14
        L_0x043f:
            r1 = 0
            r11.m7962t(r1)
            goto L_0x0445
        L_0x0444:
            throw r0
        L_0x0445:
            goto L_0x0444
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2872ca.m7963u(androidx.media3.common.bm, boolean):void");
    }

    /* renamed from: v */
    private final void m7964v(C2640bb bbVar, boolean z) {
        m7965w(bbVar, bbVar.f7313b, true, z);
    }

    /* renamed from: w */
    private final void m7965w(C2640bb bbVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f8094y.mo6605a(1);
            }
            this.f8093x = this.f8093x.mo6671e(bbVar);
        }
        float f2 = bbVar.f7313b;
        C2877cf cfVar = this.f8089t.f8128d;
        while (true) {
            i = 0;
            if (cfVar == null) {
                break;
            }
            C3197ad[] adVarArr = cfVar.f8107j.f9615c;
            int length = adVarArr.length;
            while (i < length) {
                C3197ad adVar = adVarArr[i];
                if (adVar != null) {
                    adVar.mo7038p(f2);
                }
                i++;
            }
            cfVar = cfVar.f8105h;
        }
        C2893cv[] cvVarArr = this.f8074e;
        int length2 = cvVarArr.length;
        while (i < length2) {
            C2893cv cvVar = cvVarArr[i];
            if (cvVar != null) {
                cvVar.mo6681B(f, bbVar.f7313b);
            }
            i++;
        }
    }

    /* renamed from: x */
    private final void m7966x() {
        boolean z = false;
        if (m7936Q()) {
            C2877cf cfVar = this.f8089t.f8130f;
            long i = m7951i(cfVar.mo6633c());
            if (cfVar == this.f8089t.f8128d) {
                long j = cfVar.f8108k;
            } else {
                long j2 = cfVar.f8108k;
                long j3 = cfVar.f8103f.f8114b;
            }
            boolean j4 = this.f8079j.mo6630j(i, this.f8086q.mo6523b().f7313b);
            if (j4 || i >= 500000 || (this.f8084o <= 0 && !this.f8085p)) {
                z = j4;
            } else {
                this.f8089t.f8128d.f8098a.mo6815i(this.f8093x.f8181s, false);
                z = this.f8079j.mo6630j(i, this.f8086q.mo6523b().f7313b);
            }
        }
        this.f8056C = z;
        if (z) {
            C2877cf cfVar2 = this.f8089t.f8130f;
            long j5 = this.f8063J;
            C2601a.m6832d(cfVar2.mo6639i());
            cfVar2.f8098a.mo6819n(j5 - cfVar2.f8108k);
        }
        m7932M();
    }

    /* renamed from: y */
    private final void m7967y() {
        C2855by byVar = this.f8094y;
        C2888cq cqVar = this.f8093x;
        boolean z = byVar.f8029a | (byVar.f8030b != cqVar);
        byVar.f8029a = z;
        byVar.f8030b = cqVar;
        if (z) {
            this.f8068O.f7674a.mo6588aE(byVar);
            this.f8094y = new C2855by(this.f8093x);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7968z(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r28 = this;
            r1 = r28
            androidx.media3.common.b.n r0 = r1.f8070a
            r0.mo6169h()
            r2 = 0
            r1.f8066M = r2
            r3 = 0
            r1.f8055B = r3
            androidx.media3.exoplayer.m r0 = r1.f8086q
            r0.mo7256d()
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f8063J = r4
            androidx.media3.exoplayer.cv[] r4 = r1.f8074e
            int r5 = r4.length
            r6 = 0
        L_0x001d:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0036
            r0 = r4[r6]
            r1.m7957o(r0)     // Catch:{ o -> 0x0029, RuntimeException -> 0x0027 }
            goto L_0x0033
        L_0x0027:
            r0 = move-exception
            goto L_0x002a
        L_0x0029:
            r0 = move-exception
        L_0x002a:
            java.lang.String r8 = "Disable failed."
            java.lang.String r0 = androidx.media3.common.p136b.C2633u.m7046a(r8, r0)
            androidx.media3.common.p136b.C2633u.m7048c(r7, r0)
        L_0x0033:
            int r6 = r6 + 1
            goto L_0x001d
        L_0x0036:
            if (r29 == 0) goto L_0x005a
            androidx.media3.exoplayer.cv[] r4 = r1.f8074e
            int r5 = r4.length
            r6 = 0
        L_0x003c:
            if (r6 >= r5) goto L_0x005a
            r0 = r4[r6]
            java.util.Set r8 = r1.f8075f
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x0057
            r0.mo6697y()     // Catch:{ RuntimeException -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            java.lang.String r0 = androidx.media3.common.p136b.C2633u.m7046a(r0, r8)
            androidx.media3.common.p136b.C2633u.m7048c(r7, r0)
        L_0x0057:
            int r6 = r6 + 1
            goto L_0x003c
        L_0x005a:
            r1.f8061H = r3
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            androidx.media3.exoplayer.h.as r4 = r0.f8165c
            long r5 = r0.f8181s
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            androidx.media3.exoplayer.h.as r0 = r0.f8165c
            boolean r0 = r0.mo6102a()
            if (r0 != 0) goto L_0x007c
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            androidx.media3.common.bk r7 = r1.f8083n
            boolean r0 = m7939T(r0, r7)
            if (r0 == 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            long r7 = r0.f8181s
            goto L_0x0080
        L_0x007c:
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            long r7 = r0.f8166d
        L_0x0080:
            if (r30 == 0) goto L_0x00ad
            r1.f8062I = r2
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            androidx.media3.common.bm r0 = r0.f8164b
            android.util.Pair r0 = r1.m7954l(r0)
            java.lang.Object r4 = r0.first
            androidx.media3.exoplayer.h.as r4 = (androidx.media3.exoplayer.p145h.C3036as) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            androidx.media3.exoplayer.h.as r0 = r0.f8165c
            boolean r0 = r4.equals(r0)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00ad
            r0 = 1
            r17 = r4
            r25 = r5
            goto L_0x00b2
        L_0x00ad:
            r17 = r4
            r25 = r5
            r0 = 0
        L_0x00b2:
            androidx.media3.exoplayer.ci r4 = r1.f8089t
            r4.mo6652f()
            r1.f8056C = r3
            androidx.media3.exoplayer.cq r15 = new androidx.media3.exoplayer.cq
            androidx.media3.exoplayer.cq r4 = r1.f8093x
            androidx.media3.common.bm r5 = r4.f8164b
            int r11 = r4.f8168f
            if (r32 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            androidx.media3.exoplayer.o r2 = r4.f8169g
        L_0x00c6:
            r12 = r2
            if (r0 == 0) goto L_0x00cc
            androidx.media3.exoplayer.h.cr r2 = androidx.media3.exoplayer.p145h.C3107cr.f9108a
            goto L_0x00ce
        L_0x00cc:
            androidx.media3.exoplayer.h.cr r2 = r4.f8171i
        L_0x00ce:
            r14 = r2
            if (r0 == 0) goto L_0x00d4
            androidx.media3.exoplayer.j.al r2 = r1.f8078i
            goto L_0x00d8
        L_0x00d4:
            androidx.media3.exoplayer.cq r2 = r1.f8093x
            androidx.media3.exoplayer.j.al r2 = r2.f8172j
        L_0x00d8:
            if (r0 == 0) goto L_0x00df
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x00e3
        L_0x00df:
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            java.util.List r0 = r0.f8173k
        L_0x00e3:
            r16 = r0
            androidx.media3.exoplayer.cq r0 = r1.f8093x
            r13 = 0
            boolean r4 = r0.f8175m
            r18 = r4
            int r4 = r0.f8176n
            r19 = r4
            androidx.media3.common.bb r0 = r0.f8177o
            r20 = r0
            r23 = 0
            r27 = 0
            r4 = r15
            r6 = r17
            r9 = r25
            r0 = r15
            r15 = r2
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27)
            r1.f8093x = r0
            if (r31 == 0) goto L_0x0158
            androidx.media3.exoplayer.cp r2 = r1.f8090u
            java.util.HashMap r0 = r2.f8157g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x0114:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r4.next()
            r5 = r0
            androidx.media3.exoplayer.cm r5 = (androidx.media3.exoplayer.C2884cm) r5
            androidx.media3.exoplayer.h.au r0 = r5.f8143a     // Catch:{ RuntimeException -> 0x0129 }
            androidx.media3.exoplayer.h.at r6 = r5.f8144b     // Catch:{ RuntimeException -> 0x0129 }
            r0.mo6953z(r6)     // Catch:{ RuntimeException -> 0x0129 }
            goto L_0x0135
        L_0x0129:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            java.lang.String r0 = androidx.media3.common.p136b.C2633u.m7046a(r6, r0)
            java.lang.String r6 = "MediaSourceList"
            androidx.media3.common.p136b.C2633u.m7048c(r6, r0)
        L_0x0135:
            androidx.media3.exoplayer.h.au r0 = r5.f8143a
            androidx.media3.exoplayer.cl r6 = r5.f8145c
            androidx.media3.exoplayer.h.a r0 = (androidx.media3.exoplayer.p145h.C3005a) r0
            androidx.media3.exoplayer.h.bc r0 = r0.f8710o
            r0.mo7013l(r6)
            androidx.media3.exoplayer.h.au r0 = r5.f8143a
            androidx.media3.exoplayer.cl r5 = r5.f8145c
            androidx.media3.exoplayer.h.a r0 = (androidx.media3.exoplayer.p145h.C3005a) r0
            androidx.media3.exoplayer.c.e r0 = r0.f8711p
            r0.mo6608b(r5)
            goto L_0x0114
        L_0x014c:
            java.util.HashMap r0 = r2.f8157g
            r0.clear()
            java.util.Set r0 = r2.f8158h
            r0.clear()
            r2.f8159i = r3
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2872ca.m7968z(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6617b(C3097ch chVar) {
        this.f8070a.mo6163b(9, (C3034aq) chVar).mo6161a();
    }

    /* renamed from: d */
    public final synchronized void mo6618d(C2891ct ctVar) {
        if (!this.f8072c) {
            if (this.f8081l.isAlive()) {
                this.f8070a.mo6163b(14, ctVar).mo6161a();
                return;
            }
        }
        C2633u.m7050e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ctVar.mo6674a(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo6619e() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f8072c     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0022
            android.os.HandlerThread r0 = r3.f8081l     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0022
        L_0x000e:
            androidx.media3.common.b.n r0 = r3.f8070a     // Catch:{ all -> 0x0025 }
            r1 = 7
            r0.mo6170i(r1)     // Catch:{ all -> 0x0025 }
            androidx.media3.exoplayer.bs r0 = new androidx.media3.exoplayer.bs     // Catch:{ all -> 0x0025 }
            r0.<init>(r3)     // Catch:{ all -> 0x0025 }
            long r1 = r3.f8091v     // Catch:{ all -> 0x0025 }
            r3.m7935P(r0, r1)     // Catch:{ all -> 0x0025 }
            boolean r0 = r3.f8072c     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)
            return r0
        L_0x0022:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2872ca.mo6619e():boolean");
    }

    /* renamed from: eY */
    public final void mo6620eY(C3034aq aqVar) {
        this.f8070a.mo6163b(8, aqVar).mo6161a();
    }

    /* JADX WARNING: type inference failed for: r2v28, types: [androidx.media3.b.an, androidx.media3.exoplayer.k.f] */
    public final boolean handleMessage(Message message) {
        boolean z;
        C2877cf cfVar;
        int i;
        long j;
        boolean z2;
        long j2;
        C3036as asVar;
        long j3;
        boolean z3;
        Throwable th;
        C2888cq n;
        long j4;
        C2888cq cqVar;
        int i2;
        C3205al k;
        int i3;
        Message message2 = message;
        try {
            switch (message2.what) {
                case 0:
                    this.f8094y.mo6605a(1);
                    m7968z(false, false, false, true);
                    this.f8079j.mo6623c();
                    m7928I(true != this.f8093x.f8164b.mo6304o() ? 2 : 4);
                    C2887cp cpVar = this.f8090u;
                    ? r2 = this.f8080k;
                    C2601a.m6832d(!cpVar.f8159i);
                    cpVar.f8160j = r2;
                    for (int i4 = 0; i4 < cpVar.f8151a.size(); i4++) {
                        C2885cn cnVar = (C2885cn) cpVar.f8151a.get(i4);
                        cpVar.mo6663d(cnVar);
                        cpVar.f8158h.add(cnVar);
                    }
                    cpVar.f8159i = true;
                    this.f8070a.mo6170i(2);
                    break;
                case 1:
                    m7927H(message2.arg1 != 0, message2.arg2, true, 1);
                    break;
                case 2:
                    m7958p();
                    break;
                case 3:
                    C2856bz bzVar = (C2856bz) message2.obj;
                    this.f8094y.mo6605a(1);
                    Pair m = m7955m(this.f8093x.f8164b, bzVar, true, this.f8057D, this.f8058E, this.f8082m, this.f8083n);
                    if (m == null) {
                        Pair l = m7954l(this.f8093x.f8164b);
                        j2 = ((Long) l.second).longValue();
                        z2 = !this.f8093x.f8164b.mo6304o();
                        j = -9223372036854775807L;
                        asVar = (C3036as) l.first;
                    } else {
                        Object obj = m.first;
                        j2 = ((Long) m.second).longValue();
                        j = bzVar.f8038c == -9223372036854775807L ? -9223372036854775807L : j2;
                        C3036as e = this.f8089t.mo6651e(this.f8093x.f8164b, obj, j2);
                        if (e.mo6102a()) {
                            this.f8093x.f8164b.mo6303n(e.f7204a, this.f8083n);
                            j2 = this.f8083n.mo6283d(e.f7205b) == e.f7206c ? this.f8083n.f7334g.f7416d : 0;
                            asVar = e;
                            z2 = true;
                        } else {
                            long j5 = j;
                            asVar = e;
                            z2 = bzVar.f8038c == -9223372036854775807L;
                            j = j5;
                        }
                    }
                    try {
                        if (this.f8093x.f8164b.mo6304o()) {
                            this.f8062I = bzVar;
                        } else if (m == null) {
                            if (this.f8093x.f8168f != 1) {
                                m7928I(4);
                            }
                            m7968z(false, true, false, true);
                        } else {
                            if (asVar.equals(this.f8093x.f8165c)) {
                                C2877cf cfVar2 = this.f8089t.f8128d;
                                j4 = (cfVar2 == null || !cfVar2.f8101d || j2 == 0) ? j2 : cfVar2.f8098a.mo6807a(j2, this.f8092w);
                                if (C2612ak.m6918A(j4) == C2612ak.m6918A(this.f8093x.f8181s) && ((i2 = cqVar.f8168f) == 2 || i2 == 3)) {
                                    long j6 = (cqVar = this.f8093x).f8181s;
                                    n = m7956n(asVar, j6, j, j6, z2, 2);
                                    this.f8093x = n;
                                    break;
                                }
                            } else {
                                j4 = j2;
                            }
                            j3 = m7952j(asVar, j4, this.f8093x.f8168f == 4);
                            z3 = z2 | (j2 != j3);
                            try {
                                C2888cq cqVar2 = this.f8093x;
                                C2651bm bmVar = cqVar2.f8164b;
                                m7934O(bmVar, asVar, bmVar, cqVar2.f8165c, j);
                                n = m7956n(asVar, j3, j, j3, z3, 2);
                                this.f8093x = n;
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                this.f8093x = m7956n(asVar, j3, j, j3, z3, 2);
                                throw th3;
                            }
                        }
                        j3 = j2;
                        z3 = z2;
                        n = m7956n(asVar, j3, j, j3, z3, 2);
                        this.f8093x = n;
                    } catch (Throwable th4) {
                        th = th4;
                        j3 = j2;
                        z3 = z2;
                        Throwable th32 = th;
                        this.f8093x = m7956n(asVar, j3, j, j3, z3, 2);
                        throw th32;
                    }
                    break;
                case 4:
                    this.f8086q.mo6524c((C2640bb) message2.obj);
                    m7964v(this.f8086q.mo6523b(), true);
                    break;
                case 5:
                    this.f8092w = (C2897cz) message2.obj;
                    break;
                case 6:
                    m7930K(false, true);
                    break;
                case 7:
                    m7968z(true, false, true, false);
                    this.f8079j.mo6624d();
                    m7928I(1);
                    this.f8081l.quit();
                    synchronized (this) {
                        this.f8072c = true;
                        notifyAll();
                    }
                    return true;
                case 8:
                    if (this.f8089t.mo6655i((C3034aq) message2.obj)) {
                        C2877cf cfVar3 = this.f8089t.f8130f;
                        float f = this.f8086q.mo6523b().f7313b;
                        C2651bm bmVar2 = this.f8093x.f8164b;
                        cfVar3.f8101d = true;
                        cfVar3.f8106i = cfVar3.f8098a.mo6814h();
                        C3205al k2 = cfVar3.mo6641k(f);
                        C2878cg cgVar = cfVar3.f8103f;
                        long j7 = cgVar.f8114b;
                        long j8 = cgVar.f8117e;
                        if (j8 != -9223372036854775807L && j7 >= j8) {
                            j7 = Math.max(0, j8 - 1);
                        }
                        long j9 = cfVar3.mo6640j(k2, j7);
                        long j10 = cfVar3.f8108k;
                        C2878cg cgVar2 = cfVar3.f8103f;
                        cfVar3.f8108k = j10 + (cgVar2.f8114b - j9);
                        cfVar3.f8103f = cgVar2.mo6643b(j9);
                        C3107cr crVar = cfVar3.f8106i;
                        m7947aa(cfVar3.f8107j);
                        if (cfVar3 == this.f8089t.f8128d) {
                            m7921B(cfVar3.f8103f.f8114b);
                            m7959q();
                            C2888cq cqVar3 = this.f8093x;
                            C3036as asVar2 = cqVar3.f8165c;
                            long j11 = cfVar3.f8103f.f8114b;
                            this.f8093x = m7956n(asVar2, j11, cqVar3.f8166d, j11, false, 5);
                        }
                        m7966x();
                        break;
                    }
                    break;
                case 9:
                    if (this.f8089t.mo6655i((C3034aq) message2.obj)) {
                        this.f8089t.mo6654h(this.f8063J);
                        m7966x();
                        break;
                    }
                    break;
                case 10:
                    float f2 = this.f8086q.mo6523b().f7313b;
                    C2880ci ciVar = this.f8089t;
                    C2877cf cfVar4 = ciVar.f8128d;
                    C2877cf cfVar5 = ciVar.f8129e;
                    boolean z4 = true;
                    while (true) {
                        if (cfVar4 == null) {
                            break;
                        } else if (!cfVar4.f8101d) {
                            break;
                        } else {
                            C2651bm bmVar3 = this.f8093x.f8164b;
                            k = cfVar4.mo6641k(f2);
                            C3205al alVar = cfVar4.f8107j;
                            if (alVar != null) {
                                if (alVar.f9615c.length == k.f9615c.length) {
                                    int i5 = 0;
                                    while (i5 < k.f9615c.length) {
                                        if (k.mo7206a(alVar, i5)) {
                                            i5++;
                                        }
                                    }
                                    z4 &= cfVar4 != cfVar5;
                                    cfVar4 = cfVar4.f8105h;
                                }
                            }
                        }
                    }
                    if (z4) {
                        C2880ci ciVar2 = this.f8089t;
                        C2877cf cfVar6 = ciVar2.f8128d;
                        boolean j12 = ciVar2.mo6656j(cfVar6);
                        boolean[] zArr = new boolean[this.f8074e.length];
                        long a = cfVar6.mo6631a(k, this.f8093x.f8181s, j12, zArr);
                        C2888cq cqVar4 = this.f8093x;
                        boolean z5 = (cqVar4.f8168f == 4 || a == cqVar4.f8181s) ? false : true;
                        C2888cq cqVar5 = this.f8093x;
                        long j13 = a;
                        boolean[] zArr2 = zArr;
                        C2877cf cfVar7 = cfVar6;
                        i3 = 2;
                        this.f8093x = m7956n(cqVar5.f8165c, a, cqVar5.f8166d, cqVar5.f8167e, z5, 5);
                        if (z5) {
                            m7921B(j13);
                        }
                        boolean[] zArr3 = new boolean[this.f8074e.length];
                        int i6 = 0;
                        while (true) {
                            C2893cv[] cvVarArr = this.f8074e;
                            if (i6 < cvVarArr.length) {
                                C2893cv cvVar = cvVarArr[i6];
                                boolean R = m7937R(cvVar);
                                zArr3[i6] = R;
                                C3095cf cfVar8 = cfVar7.f8100c[i6];
                                if (R) {
                                    if (cfVar8 != cvVar.mo6691k()) {
                                        m7957o(cvVar);
                                    } else if (zArr2[i6]) {
                                        cvVar.mo6698z(this.f8063J);
                                    }
                                }
                                i6++;
                            } else {
                                m7960r(zArr3);
                            }
                        }
                    } else {
                        i3 = 2;
                        this.f8089t.mo6656j(cfVar4);
                        if (cfVar4.f8101d) {
                            cfVar4.mo6640j(k, Math.max(cfVar4.f8103f.f8114b, this.f8063J - cfVar4.f8108k));
                        }
                    }
                    m7962t(true);
                    if (this.f8093x.f8168f != 4) {
                        m7966x();
                        m7933N();
                        this.f8070a.mo6170i(i3);
                        break;
                    }
                    break;
                case 11:
                    int i7 = message2.arg1;
                    this.f8057D = i7;
                    C2880ci ciVar3 = this.f8089t;
                    C2651bm bmVar4 = this.f8093x.f8164b;
                    ciVar3.f8126b = i7;
                    if (!ciVar3.mo6657k(bmVar4)) {
                        m7925F(true);
                    }
                    m7962t(false);
                    break;
                case 12:
                    boolean z6 = message2.arg1 != 0;
                    this.f8058E = z6;
                    C2880ci ciVar4 = this.f8089t;
                    C2651bm bmVar5 = this.f8093x.f8164b;
                    ciVar4.f8127c = z6;
                    if (!ciVar4.mo6657k(bmVar5)) {
                        m7925F(true);
                    }
                    m7962t(false);
                    break;
                case 13:
                    boolean z7 = message2.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message2.obj;
                    if (this.f8059F != z7) {
                        this.f8059F = z7;
                        if (!z7) {
                            for (C2893cv cvVar2 : this.f8074e) {
                                if (!m7937R(cvVar2) && this.f8075f.remove(cvVar2)) {
                                    cvVar2.mo6697y();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    C2891ct ctVar = (C2891ct) message2.obj;
                    if (ctVar.f8188g != -9223372036854775807L) {
                        if (!this.f8093x.f8164b.mo6304o()) {
                            C2854bx bxVar = new C2854bx(ctVar);
                            C2651bm bmVar6 = this.f8093x.f8164b;
                            if (!m7940U(bxVar, bmVar6, bmVar6, this.f8057D, this.f8058E, this.f8082m, this.f8083n)) {
                                ctVar.mo6674a(false);
                                break;
                            } else {
                                this.f8087r.add(bxVar);
                                Collections.sort(this.f8087r);
                                break;
                            }
                        } else {
                            this.f8087r.add(new C2854bx(ctVar));
                            break;
                        }
                    } else {
                        m7926G(ctVar);
                        break;
                    }
                case 15:
                    C2891ct ctVar2 = (C2891ct) message2.obj;
                    Looper looper = ctVar2.f8186e;
                    if (looper.getThread().isAlive()) {
                        this.f8088s.mo6160b(looper, (Handler.Callback) null).mo6167f(new C2850bt(ctVar2));
                        break;
                    } else {
                        C2633u.m7050e("TAG", "Trying to send message on a dead thread.");
                        ctVar2.mo6674a(false);
                        break;
                    }
                case 16:
                    m7964v((C2640bb) message2.obj, false);
                    break;
                case 17:
                    C2852bv bvVar = (C2852bv) message2.obj;
                    this.f8094y.mo6605a(1);
                    if (bvVar.f8018b != -1) {
                        this.f8062I = new C2856bz(new C2892cu(bvVar.f8017a, bvVar.f8020d), bvVar.f8018b, bvVar.f8019c);
                    }
                    C2887cp cpVar2 = this.f8090u;
                    List list = bvVar.f8017a;
                    C3098ci ciVar5 = bvVar.f8020d;
                    cpVar2.mo6665f(0, cpVar2.f8151a.size());
                    m7963u(cpVar2.mo6666g(cpVar2.f8151a.size(), list, ciVar5), false);
                    break;
                case 18:
                    C2852bv bvVar2 = (C2852bv) message2.obj;
                    int i8 = message2.arg1;
                    this.f8094y.mo6605a(1);
                    C2887cp cpVar3 = this.f8090u;
                    if (i8 == -1) {
                        i8 = cpVar3.mo6660a();
                    }
                    m7963u(cpVar3.mo6666g(i8, bvVar2.f8017a, bvVar2.f8020d), false);
                    break;
                case 19:
                    C2853bw bwVar = (C2853bw) message2.obj;
                    this.f8094y.mo6605a(1);
                    C2887cp cpVar4 = this.f8090u;
                    int i9 = bwVar.f8021a;
                    int i10 = bwVar.f8022b;
                    int i11 = bwVar.f8023c;
                    C3098ci ciVar6 = bwVar.f8024d;
                    C2601a.m6830b(cpVar4.mo6660a() >= 0);
                    cpVar4.f8161k = null;
                    m7963u(cpVar4.mo6661b(), false);
                    break;
                case 20:
                    int i12 = message2.arg1;
                    int i13 = message2.arg2;
                    C3098ci ciVar7 = (C3098ci) message2.obj;
                    this.f8094y.mo6605a(1);
                    C2887cp cpVar5 = this.f8090u;
                    C2601a.m6830b(i12 >= 0 && i12 <= i13 && i13 <= cpVar5.mo6660a());
                    cpVar5.f8161k = ciVar7;
                    cpVar5.mo6665f(i12, i13);
                    m7963u(cpVar5.mo6661b(), false);
                    break;
                case 21:
                    C3098ci ciVar8 = (C3098ci) message2.obj;
                    this.f8094y.mo6605a(1);
                    C2887cp cpVar6 = this.f8090u;
                    int a2 = cpVar6.mo6660a();
                    if (ciVar8.f9065a.length != a2) {
                        ciVar8 = ciVar8.mo7090a().mo7091b(0, a2);
                    }
                    cpVar6.f8161k = ciVar8;
                    m7963u(cpVar6.mo6661b(), false);
                    break;
                case 22:
                    m7963u(this.f8090u.mo6661b(), true);
                    break;
                case 23:
                    this.f8095z = message2.arg1 != 0;
                    m7920A();
                    if (this.f8054A) {
                        C2880ci ciVar9 = this.f8089t;
                        if (ciVar9.f8129e != ciVar9.f8128d) {
                            m7925F(true);
                            m7962t(false);
                            break;
                        }
                    }
                    break;
                case 24:
                    boolean z8 = message2.arg1 == 1;
                    if (z8 != this.f8060G) {
                        this.f8060G = z8;
                        if (!z8 && this.f8093x.f8178p) {
                            this.f8070a.mo6170i(2);
                            break;
                        }
                    }
                    break;
                case 25:
                    m7925F(true);
                    break;
                default:
                    return false;
            }
        } catch (C3267o e2) {
            C3267o oVar = e2;
            if (oVar.f9812c == 1 && (cfVar = this.f8089t.f8129e) != null) {
                oVar = oVar.mo7257a(cfVar.f8103f.f8113a);
            }
            if (!oVar.f9818i || this.f8066M != null) {
                C3267o oVar2 = this.f8066M;
                if (oVar2 != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(oVar2, new Object[]{oVar});
                    } catch (Exception unused) {
                    }
                    oVar = this.f8066M;
                }
                C2633u.m7048c("ExoPlayerImplInternal", C2633u.m7046a("Playback error", oVar));
                z = true;
                m7930K(true, false);
                this.f8093x = this.f8093x.mo6670d(oVar);
            } else {
                C2633u.m7050e("ExoPlayerImplInternal", C2633u.m7046a("Recoverable renderer error", oVar));
                this.f8066M = oVar;
                C2626n nVar = this.f8070a;
                nVar.mo6172k(nVar.mo6163b(25, oVar));
            }
        } catch (C2860c e3) {
            C2860c cVar = e3;
            m7961s(cVar, cVar.f8042a);
        } catch (C2599az e4) {
            C2599az azVar = e4;
            int i14 = azVar.f7217b;
            if (i14 == 1) {
                i = true != azVar.f7216a ? 3003 : 3001;
            } else {
                i = i14 == 4 ? true != azVar.f7216a ? 3004 : 3002 : 1000;
            }
            m7961s(azVar, i);
        } catch (C2506j e5) {
            C2506j jVar = e5;
            m7961s(jVar, jVar.f6884a);
        } catch (C3044b e6) {
            m7961s(e6, 1002);
        } catch (IOException e7) {
            m7961s(e7, SimpleSnackbar.LENGTH_SHORT);
        } catch (RuntimeException e8) {
            RuntimeException runtimeException = e8;
            C3267o b = C3267o.m9504b(runtimeException, ((runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) ? 1004 : 1000);
            C2633u.m7048c("ExoPlayerImplInternal", C2633u.m7046a("Playback error", b));
            m7930K(true, false);
            this.f8093x = this.f8093x.mo6670d(b);
        } catch (Throwable th5) {
            throw th5;
        }
        z = true;
        m7967y();
        return z;
    }
}
