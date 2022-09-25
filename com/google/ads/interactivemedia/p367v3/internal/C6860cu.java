package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cu */
/* compiled from: PG */
final class C6860cu implements Handler.Callback, C7319tu, C6884dr, C6824bl, C6891dy {

    /* renamed from: A */
    private boolean f21721A;

    /* renamed from: B */
    private int f21722B = 0;

    /* renamed from: C */
    private boolean f21723C = false;

    /* renamed from: D */
    private boolean f21724D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f21725E;

    /* renamed from: F */
    private boolean f21726F;

    /* renamed from: G */
    private int f21727G;

    /* renamed from: H */
    private C6859ct f21728H;

    /* renamed from: I */
    private long f21729I;

    /* renamed from: J */
    private int f21730J;

    /* renamed from: K */
    private boolean f21731K;

    /* renamed from: L */
    private C6826bn f21732L;

    /* renamed from: M */
    private boolean f21733M;

    /* renamed from: N */
    private final C6823bk f21734N;

    /* renamed from: O */
    private final C6822bj f21735O;

    /* renamed from: a */
    private final C6897ed[] f21736a;

    /* renamed from: b */
    private final C6898ee[] f21737b;

    /* renamed from: c */
    private final abf f21738c;

    /* renamed from: d */
    private final abg f21739d;

    /* renamed from: e */
    private final abq f21740e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final adp f21741f;

    /* renamed from: g */
    private final HandlerThread f21742g;

    /* renamed from: h */
    private final Looper f21743h;

    /* renamed from: i */
    private final C6911er f21744i;

    /* renamed from: j */
    private final C6910eq f21745j;

    /* renamed from: k */
    private final long f21746k;

    /* renamed from: l */
    private final boolean f21747l;

    /* renamed from: m */
    private final C6825bm f21748m;

    /* renamed from: n */
    private final ArrayList f21749n;

    /* renamed from: o */
    private final adk f21750o;

    /* renamed from: p */
    private final C6857cr f21751p;

    /* renamed from: q */
    private final C6878dl f21752q;

    /* renamed from: r */
    private final C6885ds f21753r;

    /* renamed from: s */
    private final long f21754s;

    /* renamed from: t */
    private C6900eg f21755t;

    /* renamed from: u */
    private C6887du f21756u;

    /* renamed from: v */
    private C6856cq f21757v;

    /* renamed from: w */
    private boolean f21758w;

    /* renamed from: x */
    private boolean f21759x;

    /* renamed from: y */
    private boolean f21760y;

    /* renamed from: z */
    private boolean f21761z;

    public C6860cu(C6897ed[] edVarArr, abf abf, abg abg, C6823bk bkVar, abq abq, C6957gj gjVar, C6900eg egVar, C6822bj bjVar, long j, boolean z, Looper looper, adk adk, C6857cr crVar) {
        this.f21751p = crVar;
        this.f21736a = edVarArr;
        this.f21738c = abf;
        this.f21739d = abg;
        this.f21734N = bkVar;
        this.f21740e = abq;
        int i = 0;
        this.f21755t = egVar;
        this.f21735O = bjVar;
        this.f21754s = j;
        this.f21759x = false;
        this.f21750o = adk;
        this.f21733M = true;
        this.f21746k = bkVar.mo15535d();
        this.f21747l = false;
        this.f21756u = C6887du.m20086a(abg);
        this.f21757v = new C6856cq(this.f21756u);
        int length = edVarArr.length;
        this.f21737b = new C6898ee[2];
        while (true) {
            int length2 = edVarArr.length;
            if (i < 2) {
                edVarArr[i].mo15514c(i);
                this.f21737b[i] = edVarArr[i].mo15513b();
                i++;
            } else {
                this.f21748m = new C6825bm(this, adk);
                this.f21749n = new ArrayList();
                this.f21744i = new C6911er();
                this.f21745j = new C6910eq();
                abf.mo14380h(abq);
                this.f21731K = true;
                Handler handler = new Handler(looper);
                this.f21752q = new C6878dl(gjVar, handler);
                this.f21753r = new C6885ds(this, gjVar, handler);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.f21742g = handlerThread;
                handlerThread.start();
                Looper looper2 = handlerThread.getLooper();
                this.f21743h = looper2;
                this.f21741f = adk.mo14488c(looper2, this);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:184:0x034b, code lost:
        if (m19870N() != false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x039f, code lost:
        if (r7.f21734N.mo15536e(m19881Y(), r7.f21748m.mo14522i().f21945b, r7.f21761z, r28) != false) goto L_0x034d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0472  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19857A() {
        /*
            r39 = this;
            r7 = r39
            com.google.ads.interactivemedia.v3.internal.adk r0 = r7.f21750o
            long r8 = r0.mo14487b()
            com.google.ads.interactivemedia.v3.internal.du r0 = r7.f21756u
            com.google.ads.interactivemedia.v3.internal.es r0 = r0.f21926a
            boolean r0 = r0.mo15851u()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 2
            r14 = 1
            r15 = 0
            if (r0 != 0) goto L_0x0265
            com.google.ads.interactivemedia.v3.internal.ds r0 = r7.f21753r
            boolean r0 = r0.mo15719a()
            if (r0 != 0) goto L_0x0024
            goto L_0x0265
        L_0x0024:
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            long r1 = r7.f21729I
            r0.mo15696d(r1)
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            boolean r0 = r0.mo15697e()
            if (r0 == 0) goto L_0x0078
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            long r1 = r7.f21729I
            com.google.ads.interactivemedia.v3.internal.du r3 = r7.f21756u
            com.google.ads.interactivemedia.v3.internal.dj r0 = r0.mo15698f(r1, r3)
            if (r0 == 0) goto L_0x0078
            com.google.ads.interactivemedia.v3.internal.dl r1 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.ee[] r2 = r7.f21737b
            com.google.ads.interactivemedia.v3.internal.abf r3 = r7.f21738c
            com.google.ads.interactivemedia.v3.internal.bk r4 = r7.f21734N
            com.google.ads.interactivemedia.v3.internal.acc r19 = r4.mo15537f()
            com.google.ads.interactivemedia.v3.internal.ds r4 = r7.f21753r
            com.google.ads.interactivemedia.v3.internal.abg r5 = r7.f21739d
            r16 = r1
            r17 = r2
            r18 = r3
            r20 = r4
            r21 = r0
            r22 = r5
            com.google.ads.interactivemedia.v3.internal.di r1 = r16.mo15710r(r17, r18, r19, r20, r21, r22)
            com.google.ads.interactivemedia.v3.internal.tv r2 = r1.f21862a
            long r3 = r0.f21878b
            r2.mo16497a(r7, r3)
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r0 = r0.mo15700h()
            if (r0 != r1) goto L_0x0075
            long r0 = r1.mo15673d()
            r7.m19863G(r0)
        L_0x0075:
            r7.m19880X(r15)
        L_0x0078:
            boolean r0 = r7.f21721A
            if (r0 == 0) goto L_0x0086
            boolean r0 = r39.m19875S()
            r7.f21721A = r0
            r39.m19876T()
            goto L_0x0089
        L_0x0086:
            r39.m19874R()
        L_0x0089:
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r0 = r0.mo15701i()
            if (r0 != 0) goto L_0x0093
            goto L_0x0175
        L_0x0093:
            com.google.ads.interactivemedia.v3.internal.di r1 = r0.mo15684o()
            if (r1 == 0) goto L_0x014b
            boolean r1 = r7.f21760y
            if (r1 == 0) goto L_0x009f
            goto L_0x014b
        L_0x009f:
            com.google.ads.interactivemedia.v3.internal.dl r1 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15701i()
            boolean r2 = r1.f21865d
            if (r2 == 0) goto L_0x0175
            r2 = 0
        L_0x00aa:
            com.google.ads.interactivemedia.v3.internal.ed[] r3 = r7.f21736a
            int r4 = r3.length
            if (r2 >= r13) goto L_0x00c6
            r3 = r3[r2]
            com.google.ads.interactivemedia.v3.internal.vb[] r4 = r1.f21864c
            r4 = r4[r2]
            com.google.ads.interactivemedia.v3.internal.vb r5 = r3.mo15512aZ()
            if (r5 != r4) goto L_0x0175
            if (r4 == 0) goto L_0x00c3
            boolean r3 = r3.mo15518j()
            if (r3 == 0) goto L_0x0175
        L_0x00c3:
            int r2 = r2 + 1
            goto L_0x00aa
        L_0x00c6:
            com.google.ads.interactivemedia.v3.internal.di r1 = r0.mo15684o()
            boolean r1 = r1.f21865d
            if (r1 != 0) goto L_0x00dc
            long r1 = r7.f21729I
            com.google.ads.interactivemedia.v3.internal.di r3 = r0.mo15684o()
            long r3 = r3.mo15673d()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0175
        L_0x00dc:
            com.google.ads.interactivemedia.v3.internal.abg r0 = r0.mo15686q()
            com.google.ads.interactivemedia.v3.internal.dl r1 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15702j()
            com.google.ads.interactivemedia.v3.internal.abg r2 = r1.mo15686q()
            boolean r3 = r1.f21865d
            if (r3 == 0) goto L_0x010c
            com.google.ads.interactivemedia.v3.internal.tv r1 = r1.f21862a
            long r3 = r1.mo16503g()
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x010c
            com.google.ads.interactivemedia.v3.internal.ed[] r0 = r7.f21736a
            int r1 = r0.length
            r1 = 0
        L_0x00fc:
            if (r1 >= r13) goto L_0x0175
            r2 = r0[r1]
            com.google.ads.interactivemedia.v3.internal.vb r3 = r2.mo15512aZ()
            if (r3 == 0) goto L_0x0109
            r2.mo15520l()
        L_0x0109:
            int r1 = r1 + 1
            goto L_0x00fc
        L_0x010c:
            r1 = 0
        L_0x010d:
            com.google.ads.interactivemedia.v3.internal.ed[] r3 = r7.f21736a
            int r3 = r3.length
            if (r1 >= r13) goto L_0x0175
            boolean r3 = r0.mo14382a(r1)
            boolean r4 = r2.mo14382a(r1)
            if (r3 == 0) goto L_0x0148
            com.google.ads.interactivemedia.v3.internal.ed[] r3 = r7.f21736a
            r3 = r3[r1]
            boolean r3 = r3.mo15521m()
            if (r3 != 0) goto L_0x0148
            com.google.ads.interactivemedia.v3.internal.ee[] r3 = r7.f21737b
            r3 = r3[r1]
            int r3 = r3.mo15509a()
            com.google.ads.interactivemedia.v3.internal.ef[] r5 = r0.f20185b
            r5 = r5[r1]
            com.google.ads.interactivemedia.v3.internal.ef[] r6 = r2.f20185b
            r6 = r6[r1]
            if (r4 == 0) goto L_0x0141
            boolean r4 = r6.equals(r5)
            if (r4 == 0) goto L_0x0141
            r4 = 6
            if (r3 != r4) goto L_0x0148
        L_0x0141:
            com.google.ads.interactivemedia.v3.internal.ed[] r3 = r7.f21736a
            r3 = r3[r1]
            r3.mo15520l()
        L_0x0148:
            int r1 = r1 + 1
            goto L_0x010d
        L_0x014b:
            com.google.ads.interactivemedia.v3.internal.dj r1 = r0.f21867f
            boolean r1 = r1.f21884h
            if (r1 != 0) goto L_0x0155
            boolean r1 = r7.f21760y
            if (r1 == 0) goto L_0x0175
        L_0x0155:
            r1 = 0
        L_0x0156:
            com.google.ads.interactivemedia.v3.internal.ed[] r2 = r7.f21736a
            int r3 = r2.length
            if (r1 >= r13) goto L_0x0175
            r2 = r2[r1]
            com.google.ads.interactivemedia.v3.internal.vb[] r3 = r0.f21864c
            r3 = r3[r1]
            if (r3 == 0) goto L_0x0172
            com.google.ads.interactivemedia.v3.internal.vb r4 = r2.mo15512aZ()
            if (r4 != r3) goto L_0x0172
            boolean r3 = r2.mo15518j()
            if (r3 == 0) goto L_0x0172
            r2.mo15520l()
        L_0x0172:
            int r1 = r1 + 1
            goto L_0x0156
        L_0x0175:
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r0 = r0.mo15701i()
            if (r0 == 0) goto L_0x01e9
            com.google.ads.interactivemedia.v3.internal.dl r1 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15700h()
            if (r1 == r0) goto L_0x01e9
            boolean r0 = r0.f21868g
            if (r0 == 0) goto L_0x018a
            goto L_0x01e9
        L_0x018a:
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r0 = r0.mo15701i()
            com.google.ads.interactivemedia.v3.internal.abg r1 = r0.mo15686q()
            r2 = 0
            r3 = 0
        L_0x0196:
            com.google.ads.interactivemedia.v3.internal.ed[] r4 = r7.f21736a
            int r5 = r4.length
            if (r2 >= r13) goto L_0x01e4
            r4 = r4[r2]
            boolean r5 = m19890ah(r4)
            if (r5 == 0) goto L_0x01e1
            com.google.ads.interactivemedia.v3.internal.vb r5 = r4.mo15512aZ()
            com.google.ads.interactivemedia.v3.internal.vb[] r6 = r0.f21864c
            r6 = r6[r2]
            boolean r16 = r1.mo14382a(r2)
            if (r16 == 0) goto L_0x01b4
            if (r5 != r6) goto L_0x01b4
            goto L_0x01e1
        L_0x01b4:
            boolean r5 = r4.mo15521m()
            if (r5 != 0) goto L_0x01d6
            com.google.ads.interactivemedia.v3.internal.abb r5 = r1.f20186c
            com.google.ads.interactivemedia.v3.internal.aba r5 = r5.mo14373a(r2)
            com.google.ads.interactivemedia.v3.internal.cy[] r17 = m19889ag(r5)
            com.google.ads.interactivemedia.v3.internal.vb[] r5 = r0.f21864c
            r18 = r5[r2]
            long r19 = r0.mo15673d()
            long r21 = r0.mo15672c()
            r16 = r4
            r16.mo15511aY(r17, r18, r19, r21)
            goto L_0x01e1
        L_0x01d6:
            boolean r5 = r4.mo15783N()
            if (r5 == 0) goto L_0x01e0
            r7.m19869M(r4)
            goto L_0x01e1
        L_0x01e0:
            r3 = 1
        L_0x01e1:
            int r2 = r2 + 1
            goto L_0x0196
        L_0x01e4:
            if (r3 != 0) goto L_0x01e9
            r39.m19878V()
        L_0x01e9:
            r0 = 0
        L_0x01ea:
            boolean r1 = r39.m19885ac()
            if (r1 == 0) goto L_0x0265
            boolean r1 = r7.f21760y
            if (r1 != 0) goto L_0x0265
            com.google.ads.interactivemedia.v3.internal.dl r1 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15700h()
            if (r1 == 0) goto L_0x0265
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15684o()
            if (r1 == 0) goto L_0x0265
            long r2 = r7.f21729I
            long r4 = r1.mo15673d()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0265
            boolean r1 = r1.f21868g
            if (r1 == 0) goto L_0x0265
            if (r0 == 0) goto L_0x0215
            r39.m19898u()
        L_0x0215:
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r6 = r0.mo15700h()
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r4 = r0.mo15703k()
            com.google.ads.interactivemedia.v3.internal.dj r0 = r4.f21867f
            com.google.ads.interactivemedia.v3.internal.tw r1 = r0.f21877a
            long r2 = r0.f21878b
            long r10 = r0.f21879c
            r0 = r39
            r12 = r4
            r4 = r10
            com.google.ads.interactivemedia.v3.internal.du r0 = r0.m19877U(r1, r2, r4)
            r7.f21756u = r0
            com.google.ads.interactivemedia.v3.internal.dj r0 = r6.f21867f
            boolean r0 = r0.f21882f
            if (r14 == r0) goto L_0x023b
            r0 = 3
            goto L_0x023c
        L_0x023b:
            r0 = 0
        L_0x023c:
            com.google.ads.interactivemedia.v3.internal.cq r1 = r7.f21757v
            r1.mo15585c(r0)
            com.google.ads.interactivemedia.v3.internal.du r0 = r7.f21756u
            com.google.ads.interactivemedia.v3.internal.es r3 = r0.f21926a
            com.google.ads.interactivemedia.v3.internal.dj r0 = r12.f21867f
            com.google.ads.interactivemedia.v3.internal.tw r2 = r0.f21877a
            com.google.ads.interactivemedia.v3.internal.dj r0 = r6.f21867f
            com.google.ads.interactivemedia.v3.internal.tw r4 = r0.f21877a
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r39
            r1 = r3
            r0.m19872P(r1, r2, r3, r4, r5)
            r39.m19873Q()
            r39.m19903z()
            r0 = 1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01ea
        L_0x0265:
            com.google.ads.interactivemedia.v3.internal.du r0 = r7.f21756u
            int r0 = r0.f21929d
            if (r0 == r14) goto L_0x04c7
            r1 = 4
            if (r0 != r1) goto L_0x0270
            goto L_0x04c7
        L_0x0270:
            com.google.ads.interactivemedia.v3.internal.dl r0 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r0 = r0.mo15700h()
            r2 = 10
            if (r0 != 0) goto L_0x027e
            r7.m19860D(r8, r2)
            return
        L_0x027e:
            java.lang.String r4 = "doSomeWork"
            com.google.ads.interactivemedia.p367v3.internal.atv.m19619k(r4)
            r39.m19903z()
            boolean r4 = r0.f21865d
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x02f9
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 * r5
            com.google.ads.interactivemedia.v3.internal.tv r4 = r0.f21862a
            com.google.ads.interactivemedia.v3.internal.du r12 = r7.f21756u
            long r5 = r12.f21943r
            long r2 = r7.f21746k
            long r5 = r5 - r2
            r4.mo16501e(r5, r15)
            r2 = 0
            r3 = 1
            r4 = 1
        L_0x02a1:
            com.google.ads.interactivemedia.v3.internal.ed[] r5 = r7.f21736a
            int r6 = r5.length
            if (r2 >= r13) goto L_0x0300
            r5 = r5[r2]
            boolean r6 = m19890ah(r5)
            if (r6 != 0) goto L_0x02af
            goto L_0x02f4
        L_0x02af:
            long r13 = r7.f21729I
            r5.mo15782L(r13, r10)
            if (r4 == 0) goto L_0x02be
            boolean r4 = r5.mo15783N()
            if (r4 == 0) goto L_0x02be
            r4 = 1
            goto L_0x02bf
        L_0x02be:
            r4 = 0
        L_0x02bf:
            com.google.ads.interactivemedia.v3.internal.vb[] r13 = r0.f21864c
            r13 = r13[r2]
            com.google.ads.interactivemedia.v3.internal.vb r14 = r5.mo15512aZ()
            if (r13 != r14) goto L_0x02d2
            boolean r23 = r5.mo15518j()
            if (r23 == 0) goto L_0x02d2
            r23 = 1
            goto L_0x02d4
        L_0x02d2:
            r23 = 0
        L_0x02d4:
            if (r13 != r14) goto L_0x02e7
            if (r23 != 0) goto L_0x02e7
            boolean r13 = r5.mo14621M()
            if (r13 != 0) goto L_0x02e7
            boolean r13 = r5.mo15783N()
            if (r13 == 0) goto L_0x02e5
            goto L_0x02e7
        L_0x02e5:
            r13 = 0
            goto L_0x02e8
        L_0x02e7:
            r13 = 1
        L_0x02e8:
            if (r3 == 0) goto L_0x02ee
            if (r13 == 0) goto L_0x02ee
            r3 = 1
            goto L_0x02ef
        L_0x02ee:
            r3 = 0
        L_0x02ef:
            if (r13 != 0) goto L_0x02f4
            r5.mo15522n()
        L_0x02f4:
            int r2 = r2 + 1
            r13 = 2
            r14 = 1
            goto L_0x02a1
        L_0x02f9:
            com.google.ads.interactivemedia.v3.internal.tv r2 = r0.f21862a
            r2.mo16498b()
            r3 = 1
            r4 = 1
        L_0x0300:
            com.google.ads.interactivemedia.v3.internal.dj r2 = r0.f21867f
            long r10 = r2.f21881e
            if (r4 == 0) goto L_0x0337
            boolean r2 = r0.f21865d
            if (r2 == 0) goto L_0x0337
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031b
            com.google.ads.interactivemedia.v3.internal.du r2 = r7.f21756u
            long r13 = r2.f21943r
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x033c
        L_0x031b:
            boolean r2 = r7.f21760y
            if (r2 == 0) goto L_0x0329
            r7.f21760y = r15
            com.google.ads.interactivemedia.v3.internal.du r2 = r7.f21756u
            int r2 = r2.f21937l
            r10 = 5
            r7.m19899v(r15, r2, r15, r10)
        L_0x0329:
            com.google.ads.interactivemedia.v3.internal.dj r2 = r0.f21867f
            boolean r2 = r2.f21884h
            if (r2 == 0) goto L_0x033c
            r7.m19897t(r1)
            r39.m19902y()
            goto L_0x03d4
        L_0x0337:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x033c:
            com.google.ads.interactivemedia.v3.internal.du r2 = r7.f21756u
            int r10 = r2.f21929d
            r6 = 2
            if (r10 != r6) goto L_0x03b2
            int r10 = r7.f21727G
            if (r10 != 0) goto L_0x034f
            boolean r2 = r39.m19870N()
            if (r2 == 0) goto L_0x03b2
        L_0x034d:
            r2 = 3
            goto L_0x03a2
        L_0x034f:
            if (r3 != 0) goto L_0x0352
            goto L_0x03b2
        L_0x0352:
            boolean r10 = r2.f21931f
            if (r10 == 0) goto L_0x034d
            com.google.ads.interactivemedia.v3.internal.es r2 = r2.f21926a
            com.google.ads.interactivemedia.v3.internal.dl r10 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r10 = r10.mo15700h()
            com.google.ads.interactivemedia.v3.internal.dj r10 = r10.f21867f
            com.google.ads.interactivemedia.v3.internal.tw r10 = r10.f21877a
            boolean r2 = r7.m19859C(r2, r10)
            if (r2 == 0) goto L_0x0371
            com.google.ads.interactivemedia.v3.internal.bj r2 = r7.f21735O
            long r10 = r2.mo15531d()
            r28 = r10
            goto L_0x0373
        L_0x0371:
            r28 = r4
        L_0x0373:
            com.google.ads.interactivemedia.v3.internal.dl r2 = r7.f21752q
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15699g()
            boolean r4 = r2.mo15674e()
            if (r4 == 0) goto L_0x0385
            com.google.ads.interactivemedia.v3.internal.dj r2 = r2.f21867f
            boolean r2 = r2.f21884h
            if (r2 != 0) goto L_0x034d
        L_0x0385:
            com.google.ads.interactivemedia.v3.internal.bk r2 = r7.f21734N
            long r24 = r39.m19881Y()
            com.google.ads.interactivemedia.v3.internal.bm r4 = r7.f21748m
            com.google.ads.interactivemedia.v3.internal.dv r4 = r4.mo14522i()
            float r4 = r4.f21945b
            boolean r5 = r7.f21761z
            r23 = r2
            r26 = r4
            r27 = r5
            boolean r2 = r23.mo15536e(r24, r26, r27, r28)
            if (r2 == 0) goto L_0x03b2
            goto L_0x034d
        L_0x03a2:
            r7.m19897t(r2)
            r3 = 0
            r7.f21732L = r3
            boolean r3 = r39.m19885ac()
            if (r3 == 0) goto L_0x03d4
            r39.m19901x()
            goto L_0x03d4
        L_0x03b2:
            r2 = 3
            com.google.ads.interactivemedia.v3.internal.du r4 = r7.f21756u
            int r4 = r4.f21929d
            if (r4 != r2) goto L_0x03d4
            int r2 = r7.f21727G
            if (r2 != 0) goto L_0x03c4
            boolean r2 = r39.m19870N()
            if (r2 != 0) goto L_0x03d4
            goto L_0x03c6
        L_0x03c4:
            if (r3 != 0) goto L_0x03d4
        L_0x03c6:
            boolean r2 = r39.m19885ac()
            r7.f21761z = r2
            r2 = 2
            r7.m19897t(r2)
            r39.m19902y()
            goto L_0x03d5
        L_0x03d4:
            r2 = 2
        L_0x03d5:
            com.google.ads.interactivemedia.v3.internal.du r3 = r7.f21756u
            int r3 = r3.f21929d
            if (r3 != r2) goto L_0x0424
            r3 = 0
        L_0x03dc:
            com.google.ads.interactivemedia.v3.internal.ed[] r4 = r7.f21736a
            int r5 = r4.length
            if (r3 >= r2) goto L_0x0402
            r2 = r4[r3]
            boolean r2 = m19890ah(r2)
            if (r2 == 0) goto L_0x03fe
            com.google.ads.interactivemedia.v3.internal.ed[] r2 = r7.f21736a
            r2 = r2[r3]
            com.google.ads.interactivemedia.v3.internal.vb r2 = r2.mo15512aZ()
            com.google.ads.interactivemedia.v3.internal.vb[] r4 = r0.f21864c
            r4 = r4[r3]
            if (r2 != r4) goto L_0x03fe
            com.google.ads.interactivemedia.v3.internal.ed[] r2 = r7.f21736a
            r2 = r2[r3]
            r2.mo15522n()
        L_0x03fe:
            int r3 = r3 + 1
            r2 = 2
            goto L_0x03dc
        L_0x0402:
            boolean r0 = r7.f21733M
            if (r0 == 0) goto L_0x0424
            com.google.ads.interactivemedia.v3.internal.du r0 = r7.f21756u
            boolean r2 = r0.f21931f
            if (r2 != 0) goto L_0x0424
            long r2 = r0.f21942q
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0424
            boolean r0 = r39.m19875S()
            if (r0 != 0) goto L_0x041c
            goto L_0x0424
        L_0x041c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x0424:
            boolean r0 = r7.f21726F
            com.google.ads.interactivemedia.v3.internal.du r2 = r7.f21756u
            boolean r3 = r2.f21939n
            if (r0 == r3) goto L_0x0432
            com.google.ads.interactivemedia.v3.internal.du r0 = r2.mo15738i(r0)
            r7.f21756u = r0
        L_0x0432:
            boolean r0 = r39.m19885ac()
            if (r0 == 0) goto L_0x043f
            com.google.ads.interactivemedia.v3.internal.du r0 = r7.f21756u
            int r0 = r0.f21929d
            r2 = 3
            if (r0 == r2) goto L_0x0446
        L_0x043f:
            com.google.ads.interactivemedia.v3.internal.du r0 = r7.f21756u
            int r0 = r0.f21929d
            r2 = 2
            if (r0 != r2) goto L_0x045a
        L_0x0446:
            boolean r0 = r7.f21726F
            if (r0 == 0) goto L_0x0451
            boolean r0 = r7.f21725E
            if (r0 == 0) goto L_0x0451
            r0 = 1
            r12 = 0
            goto L_0x0458
        L_0x0451:
            r0 = 10
            r7.m19860D(r8, r0)
            r0 = 1
            r12 = 1
        L_0x0458:
            r0 = r0 ^ r12
            goto L_0x046c
        L_0x045a:
            int r2 = r7.f21727G
            if (r2 == 0) goto L_0x0466
            if (r0 == r1) goto L_0x0466
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.m19860D(r8, r0)
            goto L_0x046b
        L_0x0466:
            com.google.ads.interactivemedia.v3.internal.adp r0 = r7.f21741f
            r0.mo14502e()
        L_0x046b:
            r0 = 0
        L_0x046c:
            com.google.ads.interactivemedia.v3.internal.du r1 = r7.f21756u
            boolean r2 = r1.f21940o
            if (r2 == r0) goto L_0x04c1
            com.google.ads.interactivemedia.v3.internal.du r2 = new com.google.ads.interactivemedia.v3.internal.du
            r16 = r2
            com.google.ads.interactivemedia.v3.internal.es r3 = r1.f21926a
            r17 = r3
            com.google.ads.interactivemedia.v3.internal.tw r3 = r1.f21927b
            r18 = r3
            long r3 = r1.f21928c
            r19 = r3
            int r3 = r1.f21929d
            r21 = r3
            com.google.ads.interactivemedia.v3.internal.bn r3 = r1.f21930e
            r22 = r3
            boolean r3 = r1.f21931f
            r23 = r3
            com.google.ads.interactivemedia.v3.internal.vj r3 = r1.f21932g
            r24 = r3
            com.google.ads.interactivemedia.v3.internal.abg r3 = r1.f21933h
            r25 = r3
            java.util.List r3 = r1.f21934i
            r26 = r3
            com.google.ads.interactivemedia.v3.internal.tw r3 = r1.f21935j
            r27 = r3
            boolean r3 = r1.f21936k
            r28 = r3
            int r3 = r1.f21937l
            r29 = r3
            com.google.ads.interactivemedia.v3.internal.dv r3 = r1.f21938m
            r30 = r3
            long r3 = r1.f21941p
            r31 = r3
            long r3 = r1.f21942q
            r33 = r3
            long r3 = r1.f21943r
            r35 = r3
            boolean r1 = r1.f21939n
            r37 = r1
            r38 = r0
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r38)
            r7.f21756u = r2
        L_0x04c1:
            r7.f21725E = r15
            com.google.ads.interactivemedia.p367v3.internal.atv.m19620l()
            return
        L_0x04c7:
            com.google.ads.interactivemedia.v3.internal.adp r0 = r7.f21741f
            r0.mo14502e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6860cu.m19857A():void");
    }

    /* renamed from: B */
    private final long m19858B(C6912es esVar, Object obj, long j) {
        esVar.mo15852v(esVar.mo15479g(obj, this.f21745j).f22038c, this.f21744i);
        C6911er erVar = this.f21744i;
        if (erVar.f22048f == -9223372036854775807L || !erVar.f22052j || !erVar.f22051i) {
            return -9223372036854775807L;
        }
        return C6821bi.m19755b(aeu.m18518ai(erVar.f22049g) - this.f21744i.f22048f) - (j + this.f21745j.mo15832b());
    }

    /* renamed from: C */
    private final boolean m19859C(C6912es esVar, C7321tw twVar) {
        if (!twVar.mo16542b() && !esVar.mo15851u()) {
            esVar.mo15852v(esVar.mo15479g(twVar.f23859a, this.f21745j).f22038c, this.f21744i);
            C6911er erVar = this.f21744i;
            if (!erVar.f22052j || !erVar.f22051i) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private final void m19860D(long j, long j2) {
        this.f21741f.mo14502e();
        this.f21741f.mo14504g(j + j2);
    }

    /* renamed from: E */
    private final long m19861E(C7321tw twVar, long j, boolean z) {
        return m19862F(twVar, j, this.f21752q.mo15700h() != this.f21752q.mo15701i(), z);
    }

    /* renamed from: F */
    private final long m19862F(C7321tw twVar, long j, boolean z, boolean z2) {
        m19902y();
        this.f21761z = false;
        if (z2 || this.f21756u.f21929d == 3) {
            m19897t(2);
        }
        C6875di h = this.f21752q.mo15700h();
        C6875di diVar = h;
        while (diVar != null && !twVar.equals(diVar.f21867f.f21877a)) {
            diVar = diVar.mo15684o();
        }
        if (z || h != diVar || (diVar != null && diVar.mo15670a(j) < 0)) {
            C6897ed[] edVarArr = this.f21736a;
            int length = edVarArr.length;
            for (int i = 0; i < 2; i++) {
                m19869M(edVarArr[i]);
            }
            if (diVar != null) {
                while (this.f21752q.mo15700h() != diVar) {
                    this.f21752q.mo15703k();
                }
                this.f21752q.mo15704l(diVar);
                diVar.mo15688s();
                m19878V();
            }
        }
        if (diVar != null) {
            this.f21752q.mo15704l(diVar);
            if (!diVar.f21865d) {
                diVar.f21867f = diVar.f21867f.mo15689a(j);
            } else {
                long j2 = diVar.f21867f.f21881e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0, j2 - 1);
                }
                if (diVar.f21866e) {
                    long i2 = diVar.f21862a.mo16505i(j);
                    diVar.f21862a.mo16501e(i2 - this.f21746k, false);
                    j = i2;
                }
            }
            m19863G(j);
            m19874R();
        } else {
            this.f21752q.mo15705m();
            m19863G(j);
        }
        m19880X(false);
        this.f21741f.mo14503f(2);
        return j;
    }

    /* renamed from: G */
    private final void m19863G(long j) {
        C6875di h = this.f21752q.mo15700h();
        if (h != null) {
            j = h.mo15670a(j);
        }
        this.f21729I = j;
        this.f21748m.mo15543c(j);
        C6897ed[] edVarArr = this.f21736a;
        int length = edVarArr.length;
        for (int i = 0; i < 2; i++) {
            C6897ed edVar = edVarArr[i];
            if (m19890ah(edVar)) {
                edVar.mo15523o(this.f21729I);
            }
        }
        for (C6875di h2 = this.f21752q.mo15700h(); h2 != null; h2 = h2.mo15684o()) {
            for (aba aba : h2.mo15686q().f20186c.mo14374b()) {
            }
        }
    }

    /* renamed from: H */
    private final void m19864H(boolean z, boolean z2) {
        m19865I(z || !this.f21724D, false, true, false);
        this.f21757v.mo15583a(z2 ? 1 : 0);
        this.f21734N.mo15533b();
        m19897t(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ee  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19865I(boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r1 = r27
            com.google.ads.interactivemedia.v3.internal.adp r0 = r1.f21741f
            r0.mo14502e()
            r2 = 0
            r1.f21761z = r2
            com.google.ads.interactivemedia.v3.internal.bm r0 = r1.f21748m
            r0.mo15542b()
            r3 = 0
            r1.f21729I = r3
            com.google.ads.interactivemedia.v3.internal.ed[] r3 = r1.f21736a
            int r0 = r3.length
            r4 = 0
        L_0x0017:
            java.lang.String r5 = "ExoPlayerImplInternal"
            r6 = 2
            if (r4 >= r6) goto L_0x002d
            r0 = r3[r4]
            r1.m19869M(r0)     // Catch:{ bn -> 0x0024, RuntimeException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            java.lang.String r6 = "Disable failed."
            com.google.ads.interactivemedia.p367v3.internal.adu.m18341b(r5, r6, r0)
        L_0x002a:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x002d:
            if (r28 == 0) goto L_0x0045
            com.google.ads.interactivemedia.v3.internal.ed[] r3 = r1.f21736a
            int r0 = r3.length
            r4 = 0
        L_0x0033:
            if (r4 >= r6) goto L_0x0045
            r0 = r3[r4]
            r0.mo15526r()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            com.google.ads.interactivemedia.p367v3.internal.adu.m18341b(r5, r0, r7)
        L_0x0042:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0045:
            r1.f21727G = r2
            com.google.ads.interactivemedia.v3.internal.du r0 = r1.f21756u
            com.google.ads.interactivemedia.v3.internal.tw r3 = r0.f21927b
            long r4 = r0.f21943r
            com.google.ads.interactivemedia.v3.internal.du r0 = r1.f21756u
            com.google.ads.interactivemedia.v3.internal.eq r6 = r1.f21745j
            com.google.ads.interactivemedia.v3.internal.er r7 = r1.f21744i
            boolean r0 = m19886ad(r0, r6, r7)
            if (r0 == 0) goto L_0x005e
            com.google.ads.interactivemedia.v3.internal.du r0 = r1.f21756u
            long r6 = r0.f21928c
            goto L_0x0062
        L_0x005e:
            com.google.ads.interactivemedia.v3.internal.du r0 = r1.f21756u
            long r6 = r0.f21943r
        L_0x0062:
            r0 = 0
            if (r29 == 0) goto L_0x0093
            r1.f21728H = r0
            com.google.ads.interactivemedia.v3.internal.du r3 = r1.f21756u
            com.google.ads.interactivemedia.v3.internal.es r3 = r3.f21926a
            android.util.Pair r3 = r1.m19866J(r3)
            java.lang.Object r4 = r3.first
            com.google.ads.interactivemedia.v3.internal.tw r4 = (com.google.ads.interactivemedia.p367v3.internal.C7321tw) r4
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            com.google.ads.interactivemedia.v3.internal.du r3 = r1.f21756u
            com.google.ads.interactivemedia.v3.internal.tw r3 = r3.f21927b
            boolean r3 = r4.equals(r3)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x008f
            r3 = 1
            r15 = r4
            r23 = r5
            goto L_0x0098
        L_0x008f:
            r15 = r4
            r23 = r5
            goto L_0x0097
        L_0x0093:
            r15 = r3
            r23 = r4
            r7 = r6
        L_0x0097:
            r3 = 0
        L_0x0098:
            com.google.ads.interactivemedia.v3.internal.dl r4 = r1.f21752q
            r4.mo15705m()
            r1.f21721A = r2
            com.google.ads.interactivemedia.v3.internal.du r2 = new com.google.ads.interactivemedia.v3.internal.du
            com.google.ads.interactivemedia.v3.internal.du r4 = r1.f21756u
            com.google.ads.interactivemedia.v3.internal.es r5 = r4.f21926a
            int r9 = r4.f21929d
            if (r31 == 0) goto L_0x00ab
            r10 = r0
            goto L_0x00ae
        L_0x00ab:
            com.google.ads.interactivemedia.v3.internal.bn r6 = r4.f21930e
            r10 = r6
        L_0x00ae:
            if (r3 == 0) goto L_0x00b3
            com.google.ads.interactivemedia.v3.internal.vj r4 = com.google.ads.interactivemedia.p367v3.internal.C7362vj.f24051a
            goto L_0x00b5
        L_0x00b3:
            com.google.ads.interactivemedia.v3.internal.vj r4 = r4.f21932g
        L_0x00b5:
            r12 = r4
            if (r3 == 0) goto L_0x00bb
            com.google.ads.interactivemedia.v3.internal.abg r4 = r1.f21739d
            goto L_0x00bf
        L_0x00bb:
            com.google.ads.interactivemedia.v3.internal.du r4 = r1.f21756u
            com.google.ads.interactivemedia.v3.internal.abg r4 = r4.f21933h
        L_0x00bf:
            r13 = r4
            if (r3 == 0) goto L_0x00c7
            com.google.ads.interactivemedia.v3.internal.arn r3 = com.google.ads.interactivemedia.p367v3.internal.arn.m19402i()
            goto L_0x00cb
        L_0x00c7:
            com.google.ads.interactivemedia.v3.internal.du r3 = r1.f21756u
            java.util.List r3 = r3.f21934i
        L_0x00cb:
            r14 = r3
            com.google.ads.interactivemedia.v3.internal.du r3 = r1.f21756u
            r11 = 0
            boolean r4 = r3.f21936k
            r16 = r4
            int r4 = r3.f21937l
            r17 = r4
            com.google.ads.interactivemedia.v3.internal.dv r3 = r3.f21938m
            r18 = r3
            r21 = 0
            boolean r3 = r1.f21726F
            r25 = r3
            r26 = 0
            r4 = r2
            r6 = r15
            r19 = r23
            r4.<init>(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r26)
            r1.f21756u = r2
            if (r30 == 0) goto L_0x00f3
            com.google.ads.interactivemedia.v3.internal.ds r2 = r1.f21753r
            r2.mo15723e()
        L_0x00f3:
            r1.f21732L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6860cu.m19865I(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: J */
    private final Pair m19866J(C6912es esVar) {
        long j = 0;
        if (esVar.mo15851u()) {
            return Pair.create(C6887du.m20087b(), 0L);
        }
        C6912es esVar2 = esVar;
        Pair x = esVar2.mo15854x(this.f21744i, this.f21745j, esVar.mo15477e(this.f21723C), -9223372036854775807L);
        C7321tw p = this.f21752q.mo15708p(esVar, x.first, 0);
        long longValue = ((Long) x.second).longValue();
        if (p.mo16542b()) {
            esVar.mo15479g(p.f23859a, this.f21745j);
            if (p.f23861c == this.f21745j.mo15834d(p.f23860b)) {
                this.f21745j.mo15843k();
            }
        } else {
            j = longValue;
        }
        return Pair.create(p, Long.valueOf(j));
    }

    /* renamed from: K */
    private final void m19867K(C6894ea eaVar) {
        if (eaVar.mo15768e().getLooper() == this.f21743h) {
            m19891ai(eaVar);
            int i = this.f21756u.f21929d;
            if (i == 3 || i == 2) {
                this.f21741f.mo14503f(2);
                return;
            }
            return;
        }
        this.f21741f.mo14499b(15, eaVar).sendToTarget();
    }

    /* renamed from: L */
    private final void m19868L(C6912es esVar, C6912es esVar2) {
        if (!esVar.mo15851u() || !esVar2.mo15851u()) {
            int size = this.f21749n.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (!m19887ae((C6855cp) this.f21749n.get(size), esVar, esVar2, this.f21722B, this.f21723C, this.f21744i, this.f21745j)) {
                        ((C6855cp) this.f21749n.get(size)).f21701a.mo15773j(false);
                        this.f21749n.remove(size);
                    }
                } else {
                    Collections.sort(this.f21749n);
                    return;
                }
            }
        }
    }

    /* renamed from: M */
    private final void m19869M(C6897ed edVar) {
        if (m19890ah(edVar)) {
            this.f21748m.mo15545e(edVar);
            m19892aj(edVar);
            edVar.mo15525q();
            this.f21727G--;
        }
    }

    /* renamed from: N */
    private final boolean m19870N() {
        C6875di h = this.f21752q.mo15700h();
        long j = h.f21867f.f21881e;
        if (h.f21865d) {
            return j == -9223372036854775807L || this.f21756u.f21943r < j || !m19885ac();
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: com.google.ads.interactivemedia.v3.internal.vb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: long} */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0246 A[Catch:{ all -> 0x024a, all -> 0x02c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0313  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19871O(com.google.ads.interactivemedia.p367v3.internal.C6912es r32) {
        /*
            r31 = this;
            r8 = r31
            r9 = r32
            com.google.ads.interactivemedia.v3.internal.du r0 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.ct r10 = r8.f21728H
            com.google.ads.interactivemedia.v3.internal.dl r11 = r8.f21752q
            int r4 = r8.f21722B
            boolean r12 = r8.f21723C
            com.google.ads.interactivemedia.v3.internal.er r13 = r8.f21744i
            com.google.ads.interactivemedia.v3.internal.eq r14 = r8.f21745j
            boolean r1 = r32.mo15851u()
            r15 = 4
            r16 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003b
            com.google.ads.interactivemedia.v3.internal.cs r0 = new com.google.ads.interactivemedia.v3.internal.cs
            com.google.ads.interactivemedia.v3.internal.tw r21 = com.google.ads.interactivemedia.p367v3.internal.C6887du.m20087b()
            r22 = 0
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
            r27 = 1
            r28 = 0
            r20 = r0
            r20.<init>(r21, r22, r24, r26, r27, r28)
        L_0x0038:
            r7 = r0
            goto L_0x01b4
        L_0x003b:
            com.google.ads.interactivemedia.v3.internal.tw r5 = r0.f21927b
            java.lang.Object r3 = r5.f23859a
            boolean r1 = m19886ad(r0, r14, r13)
            if (r1 == 0) goto L_0x0048
            long r6 = r0.f21928c
            goto L_0x004a
        L_0x0048:
            long r6 = r0.f21943r
        L_0x004a:
            r22 = r6
            r7 = -1
            if (r10 == 0) goto L_0x00a1
            r6 = 1
            r1 = r32
            r2 = r10
            r29 = r3
            r3 = r6
            r6 = r5
            r5 = r12
            r30 = r6
            r6 = r13
            r7 = r14
            android.util.Pair r1 = m19888af(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x006c
            int r1 = r9.mo15477e(r12)
            r3 = r29
            r2 = 0
            r6 = 0
            r7 = 1
            goto L_0x0095
        L_0x006c:
            long r2 = r10.f21720c
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 != 0) goto L_0x007e
            java.lang.Object r1 = r1.first
            com.google.ads.interactivemedia.v3.internal.eq r1 = r9.mo15479g(r1, r14)
            int r7 = r1.f22038c
            r3 = r29
            r1 = 0
            goto L_0x008a
        L_0x007e:
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r22 = r1.longValue()
            r1 = 1
            r7 = -1
        L_0x008a:
            int r2 = r0.f21929d
            if (r2 != r15) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            r6 = r2
            r2 = r1
            r1 = r7
            r7 = 0
        L_0x0095:
            r4 = r1
            r29 = r2
            r27 = r6
            r28 = r7
            r7 = r30
            r15 = -1
            goto L_0x0134
        L_0x00a1:
            r29 = r3
            r30 = r5
            com.google.ads.interactivemedia.v3.internal.es r2 = r0.f21926a
            boolean r2 = r2.mo15851u()
            if (r2 == 0) goto L_0x00bf
            int r1 = r9.mo15477e(r12)
            r4 = r1
            r3 = r29
            r7 = r30
            r15 = -1
        L_0x00b7:
            r27 = 0
            r28 = 0
        L_0x00bb:
            r29 = 0
            goto L_0x0134
        L_0x00bf:
            r10 = r29
            int r2 = r9.mo15481i(r10)
            r7 = -1
            if (r2 != r7) goto L_0x00ee
            com.google.ads.interactivemedia.v3.internal.es r6 = r0.f21926a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r12
            r5 = r10
            r15 = -1
            r7 = r32
            java.lang.Object r1 = m19893l(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00de
            int r1 = r9.mo15477e(r12)
            r7 = 1
            goto L_0x00e5
        L_0x00de:
            com.google.ads.interactivemedia.v3.internal.eq r1 = r9.mo15479g(r1, r14)
            int r1 = r1.f22038c
            r7 = 0
        L_0x00e5:
            r4 = r1
            r28 = r7
            r3 = r10
            r7 = r30
            r27 = 0
            goto L_0x00bb
        L_0x00ee:
            r15 = -1
            if (r1 == 0) goto L_0x012f
            int r1 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x0100
            com.google.ads.interactivemedia.v3.internal.eq r1 = r9.mo15479g(r10, r14)
            int r1 = r1.f22038c
            r4 = r1
            r3 = r10
            r7 = r30
            goto L_0x00b7
        L_0x0100:
            com.google.ads.interactivemedia.v3.internal.es r1 = r0.f21926a
            r7 = r30
            java.lang.Object r2 = r7.f23859a
            r1.mo15479g(r2, r14)
            long r1 = r14.mo15832b()
            com.google.ads.interactivemedia.v3.internal.eq r3 = r9.mo15479g(r10, r14)
            int r4 = r3.f22038c
            long r5 = r22 + r1
            r1 = r32
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo15854x(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r22 = r1.longValue()
            r4 = -1
            r27 = 0
            r28 = 0
            r29 = 1
            goto L_0x0134
        L_0x012f:
            r7 = r30
            r3 = r10
            r4 = -1
            goto L_0x00b7
        L_0x0134:
            if (r4 == r15) goto L_0x0152
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r32
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo15854x(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r22 = r1.longValue()
            r25 = r18
            r1 = r22
            goto L_0x0156
        L_0x0152:
            r1 = r22
            r25 = r1
        L_0x0156:
            com.google.ads.interactivemedia.v3.internal.tw r5 = r11.mo15708p(r9, r3, r1)
            int r4 = r5.f23863e
            if (r4 == r15) goto L_0x0169
            int r4 = r7.f23863e
            if (r4 == r15) goto L_0x0167
            int r6 = r5.f23860b
            if (r6 < r4) goto L_0x0167
            goto L_0x0169
        L_0x0167:
            r4 = 0
            goto L_0x016a
        L_0x0169:
            r4 = 1
        L_0x016a:
            java.lang.Object r6 = r7.f23859a
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0181
            boolean r3 = r7.mo16542b()
            if (r3 != 0) goto L_0x0181
            boolean r3 = r5.mo16542b()
            if (r3 != 0) goto L_0x0181
            if (r4 == 0) goto L_0x0181
            r5 = r7
        L_0x0181:
            boolean r3 = r5.mo16542b()
            if (r3 == 0) goto L_0x01a7
            boolean r1 = r5.equals(r7)
            if (r1 == 0) goto L_0x0192
            long r0 = r0.f21943r
            r23 = r0
            goto L_0x01a9
        L_0x0192:
            java.lang.Object r0 = r5.f23859a
            r9.mo15479g(r0, r14)
            int r0 = r5.f23861c
            int r1 = r5.f23860b
            int r1 = r14.mo15834d(r1)
            if (r0 != r1) goto L_0x01a4
            r14.mo15843k()
        L_0x01a4:
            r23 = r16
            goto L_0x01a9
        L_0x01a7:
            r23 = r1
        L_0x01a9:
            com.google.ads.interactivemedia.v3.internal.cs r0 = new com.google.ads.interactivemedia.v3.internal.cs
            r21 = r0
            r22 = r5
            r21.<init>(r22, r23, r25, r27, r28, r29)
            goto L_0x0038
        L_0x01b4:
            com.google.ads.interactivemedia.v3.internal.tw r10 = r7.f21712a
            long r11 = r7.f21714c
            boolean r0 = r7.f21715d
            long r13 = r7.f21713b
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.tw r1 = r1.f21927b
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x01d1
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u
            long r1 = r1.f21943r
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01cf
            goto L_0x01d1
        L_0x01cf:
            r15 = 0
            goto L_0x01d2
        L_0x01d1:
            r15 = 1
        L_0x01d2:
            boolean r1 = r7.f21716e     // Catch:{ all -> 0x02ca }
            if (r1 == 0) goto L_0x01e6
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ all -> 0x02ca }
            int r1 = r1.f21929d     // Catch:{ all -> 0x02ca }
            r6 = 1
            if (r1 == r6) goto L_0x01e1
            r1 = 4
            r8.m19897t(r1)     // Catch:{ all -> 0x02ca }
        L_0x01e1:
            r3 = 0
            r8.m19865I(r3, r3, r3, r6)     // Catch:{ all -> 0x02ca }
            goto L_0x01e8
        L_0x01e6:
            r3 = 0
            r6 = 1
        L_0x01e8:
            if (r15 != 0) goto L_0x024d
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ all -> 0x02ca }
            long r3 = r8.f21729I     // Catch:{ all -> 0x02ca }
            com.google.ads.interactivemedia.v3.internal.di r0 = r1.mo15701i()     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x01f9
        L_0x01f4:
            r20 = r11
            r5 = r16
            goto L_0x023c
        L_0x01f9:
            long r16 = r0.mo15672c()     // Catch:{ all -> 0x02ca }
            boolean r2 = r0.f21865d     // Catch:{ all -> 0x02ca }
            if (r2 != 0) goto L_0x0202
            goto L_0x01f4
        L_0x0202:
            r20 = r11
            r5 = r16
            r2 = 0
        L_0x0207:
            com.google.ads.interactivemedia.v3.internal.ed[] r11 = r8.f21736a     // Catch:{ all -> 0x024a }
            int r12 = r11.length     // Catch:{ all -> 0x024a }
            r12 = 2
            if (r2 >= r12) goto L_0x023c
            r11 = r11[r2]     // Catch:{ all -> 0x024a }
            boolean r11 = m19890ah(r11)     // Catch:{ all -> 0x024a }
            if (r11 == 0) goto L_0x0239
            com.google.ads.interactivemedia.v3.internal.ed[] r11 = r8.f21736a     // Catch:{ all -> 0x024a }
            r11 = r11[r2]     // Catch:{ all -> 0x024a }
            com.google.ads.interactivemedia.v3.internal.vb r11 = r11.mo15512aZ()     // Catch:{ all -> 0x024a }
            com.google.ads.interactivemedia.v3.internal.vb[] r12 = r0.f21864c     // Catch:{ all -> 0x024a }
            r12 = r12[r2]     // Catch:{ all -> 0x024a }
            if (r11 == r12) goto L_0x0224
            goto L_0x0239
        L_0x0224:
            com.google.ads.interactivemedia.v3.internal.ed[] r11 = r8.f21736a     // Catch:{ all -> 0x024a }
            r11 = r11[r2]     // Catch:{ all -> 0x024a }
            long r11 = r11.mo15519k()     // Catch:{ all -> 0x024a }
            r22 = -9223372036854775808
            int r17 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r17 != 0) goto L_0x0235
            r5 = r22
            goto L_0x023c
        L_0x0235:
            long r5 = java.lang.Math.max(r11, r5)     // Catch:{ all -> 0x024a }
        L_0x0239:
            int r2 = r2 + 1
            goto L_0x0207
        L_0x023c:
            r2 = r32
            r11 = 0
            r12 = 1
            boolean r0 = r1.mo15706n(r2, r3, r5)     // Catch:{ all -> 0x02c8 }
            if (r0 != 0) goto L_0x027d
            r8.m19900w(r11)     // Catch:{ all -> 0x02c8 }
            goto L_0x027d
        L_0x024a:
            r0 = move-exception
            goto L_0x02cd
        L_0x024d:
            r20 = r11
            r11 = 0
            r12 = 1
            boolean r1 = r32.mo15851u()     // Catch:{ all -> 0x02c8 }
            if (r1 != 0) goto L_0x027d
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ all -> 0x02c8 }
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15700h()     // Catch:{ all -> 0x02c8 }
        L_0x025d:
            if (r1 == 0) goto L_0x0278
            com.google.ads.interactivemedia.v3.internal.dj r2 = r1.f21867f     // Catch:{ all -> 0x02c8 }
            com.google.ads.interactivemedia.v3.internal.tw r2 = r2.f21877a     // Catch:{ all -> 0x02c8 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x02c8 }
            if (r2 == 0) goto L_0x0273
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ all -> 0x02c8 }
            com.google.ads.interactivemedia.v3.internal.dj r3 = r1.f21867f     // Catch:{ all -> 0x02c8 }
            com.google.ads.interactivemedia.v3.internal.dj r2 = r2.mo15707o(r9, r3)     // Catch:{ all -> 0x02c8 }
            r1.f21867f = r2     // Catch:{ all -> 0x02c8 }
        L_0x0273:
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15684o()     // Catch:{ all -> 0x02c8 }
            goto L_0x025d
        L_0x0278:
            long r0 = r8.m19861E(r10, r13, r0)     // Catch:{ all -> 0x02c8 }
            r13 = r0
        L_0x027d:
            com.google.ads.interactivemedia.v3.internal.du r0 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.es r4 = r0.f21926a
            com.google.ads.interactivemedia.v3.internal.tw r5 = r0.f21927b
            boolean r0 = r7.f21717f
            if (r12 == r0) goto L_0x028a
            r6 = r18
            goto L_0x028b
        L_0x028a:
            r6 = r13
        L_0x028b:
            r1 = r31
            r2 = r32
            r3 = r10
            r1.m19872P(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x029d
            com.google.ads.interactivemedia.v3.internal.du r0 = r8.f21756u
            long r0 = r0.f21928c
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02a9
        L_0x029d:
            r1 = r31
            r2 = r10
            r3 = r13
            r5 = r20
            com.google.ads.interactivemedia.v3.internal.du r0 = r1.m19877U(r2, r3, r5)
            r8.f21756u = r0
        L_0x02a9:
            r31.m19873Q()
            com.google.ads.interactivemedia.v3.internal.du r0 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.es r0 = r0.f21926a
            r8.m19868L(r9, r0)
            com.google.ads.interactivemedia.v3.internal.du r0 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.du r0 = r0.mo15733d(r9)
            r8.f21756u = r0
            boolean r0 = r32.mo15851u()
            if (r0 != 0) goto L_0x02c4
            r1 = 0
            r8.f21728H = r1
        L_0x02c4:
            r8.m19880X(r11)
            return
        L_0x02c8:
            r0 = move-exception
            goto L_0x02cf
        L_0x02ca:
            r0 = move-exception
            r20 = r11
        L_0x02cd:
            r11 = 0
            r12 = 1
        L_0x02cf:
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.es r4 = r1.f21926a
            com.google.ads.interactivemedia.v3.internal.tw r5 = r1.f21927b
            boolean r1 = r7.f21717f
            if (r12 == r1) goto L_0x02dc
            r6 = r18
            goto L_0x02dd
        L_0x02dc:
            r6 = r13
        L_0x02dd:
            r1 = r31
            r2 = r32
            r3 = r10
            r1.m19872P(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x02ef
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u
            long r1 = r1.f21928c
            int r3 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x02fb
        L_0x02ef:
            r1 = r31
            r2 = r10
            r3 = r13
            r5 = r20
            com.google.ads.interactivemedia.v3.internal.du r1 = r1.m19877U(r2, r3, r5)
            r8.f21756u = r1
        L_0x02fb:
            r31.m19873Q()
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.es r1 = r1.f21926a
            r8.m19868L(r9, r1)
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.du r1 = r1.mo15733d(r9)
            r8.f21756u = r1
            boolean r1 = r32.mo15851u()
            if (r1 != 0) goto L_0x0316
            r1 = 0
            r8.f21728H = r1
        L_0x0316:
            r8.m19880X(r11)
            goto L_0x031b
        L_0x031a:
            throw r0
        L_0x031b:
            goto L_0x031a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6860cu.m19871O(com.google.ads.interactivemedia.v3.internal.es):void");
    }

    /* renamed from: P */
    private final void m19872P(C6912es esVar, C7321tw twVar, C6912es esVar2, C7321tw twVar2, long j) {
        if (!esVar.mo15851u() && m19859C(esVar, twVar)) {
            esVar.mo15852v(esVar.mo15479g(twVar.f23859a, this.f21745j).f22038c, this.f21744i);
            this.f21735O.mo15528a(this.f21744i.f22045c.f21859c);
            if (j != -9223372036854775807L) {
                this.f21735O.mo15529b(m19858B(esVar, twVar.f23859a, j));
                return;
            }
            if (!aeu.m18533c(!esVar2.mo15851u() ? esVar2.mo15852v(esVar2.mo15479g(twVar2.f23859a, this.f21745j).f22038c, this.f21744i).f22044b : null, this.f21744i.f22044b)) {
                this.f21735O.mo15529b(-9223372036854775807L);
            }
        }
    }

    /* renamed from: Q */
    private final void m19873Q() {
        C6875di h = this.f21752q.mo15700h();
        boolean z = false;
        if (h != null && h.f21867f.f21883g && this.f21759x) {
            z = true;
        }
        this.f21760y = z;
    }

    /* renamed from: R */
    private final void m19874R() {
        boolean z;
        if (!m19875S()) {
            z = false;
        } else {
            C6875di g = this.f21752q.mo15699g();
            long Z = m19882Z(g.mo15676g());
            if (g == this.f21752q.mo15700h()) {
                g.mo15671b(this.f21729I);
            } else {
                g.mo15671b(this.f21729I);
                long j = g.f21867f.f21878b;
            }
            z = this.f21734N.mo15539h(Z, this.f21748m.mo14522i().f21945b);
        }
        this.f21721A = z;
        if (z) {
            this.f21752q.mo15699g().mo15679j(this.f21729I);
        }
        m19876T();
    }

    /* renamed from: S */
    private final boolean m19875S() {
        C6875di g = this.f21752q.mo15699g();
        if (g == null || g.mo15676g() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    private final void m19876T() {
        C6875di g = this.f21752q.mo15699g();
        boolean z = this.f21721A || (g != null && g.f21862a.mo16509o());
        C6887du duVar = this.f21756u;
        if (z != duVar.f21931f) {
            C6887du duVar2 = r4;
            C6887du duVar3 = new C6887du(duVar.f21926a, duVar.f21927b, duVar.f21928c, duVar.f21929d, duVar.f21930e, z, duVar.f21932g, duVar.f21933h, duVar.f21934i, duVar.f21935j, duVar.f21936k, duVar.f21937l, duVar.f21938m, duVar.f21941p, duVar.f21942q, duVar.f21943r, duVar.f21939n, duVar.f21940o);
            this.f21756u = duVar2;
        }
    }

    /* renamed from: U */
    private final C6887du m19877U(C7321tw twVar, long j, long j2) {
        arn arn;
        abg abg;
        C7362vj vjVar;
        C7362vj vjVar2;
        abg abg2;
        C7321tw twVar2 = twVar;
        boolean z = true;
        if (!this.f21731K && j == this.f21756u.f21943r && twVar.equals(this.f21756u.f21927b)) {
            z = false;
        }
        this.f21731K = z;
        m19873Q();
        C6887du duVar = this.f21756u;
        C7362vj vjVar3 = duVar.f21932g;
        abg abg3 = duVar.f21933h;
        List list = duVar.f21934i;
        if (this.f21753r.mo15719a()) {
            C6875di h = this.f21752q.mo15700h();
            if (h == null) {
                vjVar2 = C7362vj.f24051a;
            } else {
                vjVar2 = h.mo15685p();
            }
            if (h == null) {
                abg2 = this.f21739d;
            } else {
                abg2 = h.mo15686q();
            }
            abb abb = abg2.f20186c;
            ark ark = new ark();
            for (int i = 0; i < abb.f20171a; i++) {
                aba a = abb.mo14373a(i);
                if (a != null) {
                    C7243qz qzVar = a.mo14333m(0).f21810j;
                    if (qzVar == null) {
                        qzVar = new C7243qz(new C7242qy[0]);
                    }
                    ark.mo15288d(qzVar);
                }
            }
            abg = abg2;
            arn = ark.mo15287c();
            vjVar = vjVar2;
        } else if (!twVar.equals(this.f21756u.f21927b)) {
            C7362vj vjVar4 = C7362vj.f24051a;
            vjVar = vjVar4;
            abg = this.f21739d;
            arn = arn.m19402i();
        } else {
            arn = list;
            vjVar = vjVar3;
            abg = abg3;
        }
        return this.f21756u.mo15732c(twVar, j, j2, m19881Y(), vjVar, abg, arn);
    }

    /* renamed from: V */
    private final void m19878V() {
        int length = this.f21736a.length;
        m19879W(new boolean[2]);
    }

    /* renamed from: W */
    private final void m19879W(boolean[] zArr) {
        C6875di i = this.f21752q.mo15701i();
        abg q = i.mo15686q();
        int i2 = 0;
        while (true) {
            int length = this.f21736a.length;
            if (i2 >= 2) {
                break;
            }
            if (!q.mo14382a(i2)) {
                this.f21736a[i2].mo15526r();
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length2 = this.f21736a.length;
            if (i3 < 2) {
                if (q.mo14382a(i3)) {
                    boolean z = zArr[i3];
                    C6897ed edVar = this.f21736a[i3];
                    if (!m19890ah(edVar)) {
                        C6875di i4 = this.f21752q.mo15701i();
                        boolean z2 = i4 == this.f21752q.mo15700h();
                        abg q2 = i4.mo15686q();
                        C6899ef efVar = q2.f20185b[i3];
                        C6864cy[] ag = m19889ag(q2.f20186c.mo14373a(i3));
                        boolean z3 = m19885ac() && this.f21756u.f21929d == 3;
                        boolean z4 = !z && z3;
                        this.f21727G++;
                        edVar.mo15517f(efVar, ag, i4.f21864c[i3], this.f21729I, z4, z2, i4.mo15673d(), i4.mo15672c());
                        edVar.mo14646t(103, new C6852cm(this));
                        this.f21748m.mo15544d(edVar);
                        if (z3) {
                            edVar.mo15510aX();
                        }
                    }
                }
                i3++;
            } else {
                i.f21868g = true;
                return;
            }
        }
    }

    /* renamed from: X */
    private final void m19880X(boolean z) {
        long j;
        C6875di g = this.f21752q.mo15699g();
        C7321tw twVar = g == null ? this.f21756u.f21927b : g.f21867f.f21877a;
        boolean z2 = !this.f21756u.f21935j.equals(twVar);
        if (z2) {
            this.f21756u = this.f21756u.mo15736g(twVar);
        }
        C6887du duVar = this.f21756u;
        if (g == null) {
            j = duVar.f21943r;
        } else {
            j = g.mo15675f();
        }
        duVar.f21941p = j;
        this.f21756u.f21942q = m19881Y();
        if ((z2 || z) && g != null && g.f21865d) {
            m19883aa(g.mo15685p(), g.mo15686q());
        }
    }

    /* renamed from: Y */
    private final long m19881Y() {
        return m19882Z(this.f21756u.f21941p);
    }

    /* renamed from: Z */
    private final long m19882Z(long j) {
        C6875di g = this.f21752q.mo15699g();
        if (g == null) {
            return 0;
        }
        return Math.max(0, j - g.mo15671b(this.f21729I));
    }

    /* renamed from: aa */
    private final void m19883aa(C7362vj vjVar, abg abg) {
        this.f21734N.mo15538g(this.f21736a, abg.f20186c);
    }

    /* renamed from: ab */
    private final void m19884ab(C6888dv dvVar, boolean z) {
        this.f21741f.mo14500c(16, z ? 1 : 0, 0, dvVar).sendToTarget();
    }

    /* renamed from: ac */
    private final boolean m19885ac() {
        C6887du duVar = this.f21756u;
        return duVar.f21936k && duVar.f21937l == 0;
    }

    /* renamed from: ad */
    private static boolean m19886ad(C6887du duVar, C6910eq eqVar, C6911er erVar) {
        C7321tw twVar = duVar.f21927b;
        C6912es esVar = duVar.f21926a;
        return twVar.mo16542b() || esVar.mo15851u() || esVar.mo15852v(esVar.mo15479g(twVar.f23859a, eqVar).f22038c, erVar).f22053k;
    }

    /* renamed from: ae */
    private static boolean m19887ae(C6855cp cpVar, C6912es esVar, C6912es esVar2, int i, boolean z, C6911er erVar, C6910eq eqVar) {
        C6855cp cpVar2 = cpVar;
        C6912es esVar3 = esVar;
        C6912es esVar4 = esVar2;
        C6910eq eqVar2 = eqVar;
        Object obj = cpVar2.f21704d;
        if (obj == null) {
            cpVar2.f21701a.mo15769f();
            cpVar2.f21701a.mo15769f();
            Pair af = m19888af(esVar, new C6859ct(cpVar2.f21701a.mo15764a(), cpVar2.f21701a.mo15770g(), C6821bi.m19755b(-9223372036854775807L)), false, i, z, erVar, eqVar);
            if (af == null) {
                return false;
            }
            cpVar.mo15581a(esVar.mo15481i(af.first), ((Long) af.second).longValue(), af.first);
            cpVar2.f21701a.mo15769f();
            return true;
        }
        int i2 = esVar.mo15481i(obj);
        if (i2 == -1) {
            return false;
        }
        cpVar2.f21701a.mo15769f();
        cpVar2.f21702b = i2;
        esVar2.mo15479g(cpVar2.f21704d, eqVar2);
        if (esVar2.mo15852v(eqVar2.f22038c, erVar).f22053k) {
            Pair x = esVar.mo15854x(erVar, eqVar, esVar.mo15479g(cpVar2.f21704d, eqVar2).f22038c, cpVar2.f21703c + eqVar.mo15832b());
            cpVar.mo15581a(esVar.mo15481i(x.first), ((Long) x.second).longValue(), x.first);
        }
        return true;
    }

    /* renamed from: af */
    private static Pair m19888af(C6912es esVar, C6859ct ctVar, boolean z, int i, boolean z2, C6911er erVar, C6910eq eqVar) {
        Object l;
        C6912es esVar2 = esVar;
        C6859ct ctVar2 = ctVar;
        C6910eq eqVar2 = eqVar;
        C6912es esVar3 = ctVar2.f21718a;
        if (esVar.mo15851u()) {
            return null;
        }
        C6912es esVar4 = true == esVar3.mo15851u() ? esVar2 : esVar3;
        try {
            Pair x = esVar4.mo15854x(erVar, eqVar, ctVar2.f21719b, ctVar2.f21720c);
            if (esVar.equals(esVar4)) {
                return x;
            }
            if (esVar.mo15481i(x.first) != -1) {
                esVar4.mo15479g(x.first, eqVar2);
                if (!esVar4.mo15852v(eqVar2.f22038c, erVar).f22053k) {
                    return x;
                }
                return esVar.mo15854x(erVar, eqVar, esVar.mo15479g(x.first, eqVar2).f22038c, ctVar2.f21720c);
            }
            C6911er erVar2 = erVar;
            if (z && (l = m19893l(erVar, eqVar, i, z2, x.first, esVar4, esVar)) != null) {
                return esVar.mo15854x(erVar, eqVar, esVar.mo15479g(l, eqVar2).f22038c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: ag */
    private static C6864cy[] m19889ag(aba aba) {
        int l = aba != null ? aba.mo14332l() : 0;
        C6864cy[] cyVarArr = new C6864cy[l];
        for (int i = 0; i < l; i++) {
            cyVarArr[i] = aba.mo14333m(i);
        }
        return cyVarArr;
    }

    /* renamed from: ah */
    private static boolean m19890ah(C6897ed edVar) {
        return edVar.mo15516e() != 0;
    }

    /* renamed from: ai */
    private static final void m19891ai(C6894ea eaVar) {
        eaVar.mo15772i();
        try {
            eaVar.mo15765b().mo14646t(eaVar.mo15766c(), eaVar.mo15767d());
        } finally {
            eaVar.mo15773j(true);
        }
    }

    /* renamed from: aj */
    private static final void m19892aj(C6897ed edVar) {
        if (edVar.mo15516e() == 2) {
            edVar.mo15524p();
        }
    }

    /* renamed from: l */
    static Object m19893l(C6911er erVar, C6910eq eqVar, int i, boolean z, Object obj, C6912es esVar, C6912es esVar2) {
        int i2 = esVar.mo15481i(obj);
        int t = esVar.mo15781t();
        int i3 = 0;
        int i4 = i2;
        int i5 = -1;
        while (true) {
            if (i3 >= t || i5 != -1) {
                break;
            }
            i4 = esVar.mo15853w(i4, eqVar, erVar, i, z);
            if (i4 == -1) {
                i5 = -1;
                break;
            }
            i5 = esVar2.mo15481i(esVar.mo15482j(i4));
            i3++;
        }
        if (i5 == -1) {
            return null;
        }
        return esVar2.mo15482j(i5);
    }

    /* renamed from: s */
    private final synchronized void m19896s(aqe aqe, long j) {
        long a = this.f21750o.mo14486a() + j;
        boolean z = false;
        while (!((Boolean) aqe.mo15169a()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = a - this.f21750o.mo14486a();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: t */
    private final void m19897t(int i) {
        C6887du duVar = this.f21756u;
        if (duVar.f21929d != i) {
            this.f21756u = duVar.mo15734e(i);
        }
    }

    /* renamed from: u */
    private final void m19898u() {
        this.f21757v.mo15584b(this.f21756u);
        if (this.f21757v.f21711g) {
            this.f21751p.mo15548a(this.f21757v);
            this.f21757v = new C6856cq(this.f21756u);
        }
    }

    /* renamed from: v */
    private final void m19899v(boolean z, int i, boolean z2, int i2) {
        this.f21757v.mo15583a(z2 ? 1 : 0);
        this.f21757v.mo15586d(i2);
        this.f21756u = this.f21756u.mo15737h(z, i);
        this.f21761z = false;
        if (!m19885ac()) {
            m19902y();
            m19903z();
            return;
        }
        int i3 = this.f21756u.f21929d;
        if (i3 == 3) {
            m19901x();
            this.f21741f.mo14503f(2);
        } else if (i3 == 2) {
            this.f21741f.mo14503f(2);
        }
    }

    /* renamed from: w */
    private final void m19900w(boolean z) {
        C7321tw twVar = this.f21752q.mo15700h().f21867f.f21877a;
        long F = m19862F(twVar, this.f21756u.f21943r, true, false);
        if (F != this.f21756u.f21943r) {
            this.f21756u = m19877U(twVar, F, this.f21756u.f21928c);
            if (z) {
                this.f21757v.mo15585c(4);
            }
        }
    }

    /* renamed from: x */
    private final void m19901x() {
        this.f21761z = false;
        this.f21748m.mo15541a();
        C6897ed[] edVarArr = this.f21736a;
        int length = edVarArr.length;
        for (int i = 0; i < 2; i++) {
            C6897ed edVar = edVarArr[i];
            if (m19890ah(edVar)) {
                edVar.mo15510aX();
            }
        }
    }

    /* renamed from: y */
    private final void m19902y() {
        this.f21748m.mo15542b();
        C6897ed[] edVarArr = this.f21736a;
        int length = edVarArr.length;
        for (int i = 0; i < 2; i++) {
            C6897ed edVar = edVarArr[i];
            if (m19890ah(edVar)) {
                m19892aj(edVar);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00bc A[EDGE_INSN: B:82:0x00bc->B:36:0x00bc ?: BREAK  , SYNTHETIC] */
    /* renamed from: z */
    private final void m19903z() {
        /*
            r12 = this;
            com.google.ads.interactivemedia.v3.internal.dl r0 = r12.f21752q
            com.google.ads.interactivemedia.v3.internal.di r0 = r0.mo15700h()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f21865d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            com.google.ads.interactivemedia.v3.internal.tv r1 = r0.f21862a
            long r4 = r1.mo16503g()
            r8 = r4
            goto L_0x001b
        L_0x001a:
            r8 = r2
        L_0x001b:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x003f
            r12.m19863G(r8)
            com.google.ads.interactivemedia.v3.internal.du r0 = r12.f21756u
            long r0 = r0.f21943r
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x013b
            com.google.ads.interactivemedia.v3.internal.du r0 = r12.f21756u
            com.google.ads.interactivemedia.v3.internal.tw r7 = r0.f21927b
            long r10 = r0.f21928c
            r6 = r12
            com.google.ads.interactivemedia.v3.internal.du r0 = r6.m19877U(r7, r8, r10)
            r12.f21756u = r0
            com.google.ads.interactivemedia.v3.internal.cq r0 = r12.f21757v
            r1 = 4
            r0.mo15585c(r1)
            goto L_0x013b
        L_0x003f:
            com.google.ads.interactivemedia.v3.internal.bm r1 = r12.f21748m
            com.google.ads.interactivemedia.v3.internal.dl r2 = r12.f21752q
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15701i()
            r3 = 0
            if (r0 == r2) goto L_0x004c
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            long r1 = r1.mo15546f(r2)
            r12.f21729I = r1
            long r0 = r0.mo15671b(r1)
            com.google.ads.interactivemedia.v3.internal.du r2 = r12.f21756u
            long r4 = r2.f21943r
            java.util.ArrayList r2 = r12.f21749n
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0137
            com.google.ads.interactivemedia.v3.internal.du r2 = r12.f21756u
            com.google.ads.interactivemedia.v3.internal.tw r2 = r2.f21927b
            boolean r2 = r2.mo16542b()
            if (r2 == 0) goto L_0x006f
            goto L_0x0137
        L_0x006f:
            boolean r2 = r12.f21731K
            if (r2 == 0) goto L_0x0078
            r6 = -1
            long r4 = r4 + r6
            r12.f21731K = r3
        L_0x0078:
            com.google.ads.interactivemedia.v3.internal.du r2 = r12.f21756u
            com.google.ads.interactivemedia.v3.internal.es r3 = r2.f21926a
            com.google.ads.interactivemedia.v3.internal.tw r2 = r2.f21927b
            java.lang.Object r2 = r2.f23859a
            int r2 = r3.mo15481i(r2)
            int r3 = r12.f21730J
            java.util.ArrayList r6 = r12.f21749n
            int r6 = r6.size()
            int r3 = java.lang.Math.min(r3, r6)
            r6 = 0
            if (r3 <= 0) goto L_0x009e
            java.util.ArrayList r7 = r12.f21749n
            int r8 = r3 + -1
            java.lang.Object r7 = r7.get(r8)
            com.google.ads.interactivemedia.v3.internal.cp r7 = (com.google.ads.interactivemedia.p367v3.internal.C6855cp) r7
            goto L_0x009f
        L_0x009e:
            r7 = r6
        L_0x009f:
            if (r7 == 0) goto L_0x00bc
            int r8 = r7.f21702b
            if (r8 > r2) goto L_0x00ad
            if (r8 != r2) goto L_0x00bc
            long r7 = r7.f21703c
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00bc
        L_0x00ad:
            int r3 = r3 + -1
            if (r3 <= 0) goto L_0x009e
            java.util.ArrayList r7 = r12.f21749n
            int r8 = r3 + -1
            java.lang.Object r7 = r7.get(r8)
            com.google.ads.interactivemedia.v3.internal.cp r7 = (com.google.ads.interactivemedia.p367v3.internal.C6855cp) r7
            goto L_0x009f
        L_0x00bc:
            java.util.ArrayList r7 = r12.f21749n
            int r7 = r7.size()
            if (r3 >= r7) goto L_0x00cd
            java.util.ArrayList r7 = r12.f21749n
            java.lang.Object r7 = r7.get(r3)
            com.google.ads.interactivemedia.v3.internal.cp r7 = (com.google.ads.interactivemedia.p367v3.internal.C6855cp) r7
            goto L_0x00ce
        L_0x00cd:
            r7 = r6
        L_0x00ce:
            if (r7 == 0) goto L_0x00f3
            java.lang.Object r8 = r7.f21704d
            if (r8 == 0) goto L_0x00f3
            int r8 = r7.f21702b
            if (r8 < r2) goto L_0x00e0
            if (r8 != r2) goto L_0x00f3
            long r8 = r7.f21703c
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x00f3
        L_0x00e0:
            int r3 = r3 + 1
            java.util.ArrayList r7 = r12.f21749n
            int r7 = r7.size()
            if (r3 >= r7) goto L_0x00cd
            java.util.ArrayList r7 = r12.f21749n
            java.lang.Object r7 = r7.get(r3)
            com.google.ads.interactivemedia.v3.internal.cp r7 = (com.google.ads.interactivemedia.p367v3.internal.C6855cp) r7
            goto L_0x00ce
        L_0x00f3:
            if (r7 == 0) goto L_0x0135
            java.lang.Object r8 = r7.f21704d
            if (r8 == 0) goto L_0x0135
            int r8 = r7.f21702b
            if (r8 != r2) goto L_0x0135
            long r8 = r7.f21703c
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0135
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0135
            com.google.ads.interactivemedia.v3.internal.ea r8 = r7.f21701a     // Catch:{ all -> 0x0129 }
            r12.m19867K(r8)     // Catch:{ all -> 0x0129 }
            com.google.ads.interactivemedia.v3.internal.ea r7 = r7.f21701a
            r7.mo15771h()
            java.util.ArrayList r7 = r12.f21749n
            r7.remove(r3)
            java.util.ArrayList r7 = r12.f21749n
            int r7 = r7.size()
            if (r3 >= r7) goto L_0x0127
            java.util.ArrayList r7 = r12.f21749n
            java.lang.Object r7 = r7.get(r3)
            com.google.ads.interactivemedia.v3.internal.cp r7 = (com.google.ads.interactivemedia.p367v3.internal.C6855cp) r7
            goto L_0x00f3
        L_0x0127:
            r7 = r6
            goto L_0x00f3
        L_0x0129:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.ea r1 = r7.f21701a
            r1.mo15771h()
            java.util.ArrayList r1 = r12.f21749n
            r1.remove(r3)
            throw r0
        L_0x0135:
            r12.f21730J = r3
        L_0x0137:
            com.google.ads.interactivemedia.v3.internal.du r2 = r12.f21756u
            r2.f21943r = r0
        L_0x013b:
            com.google.ads.interactivemedia.v3.internal.dl r0 = r12.f21752q
            com.google.ads.interactivemedia.v3.internal.di r0 = r0.mo15699g()
            com.google.ads.interactivemedia.v3.internal.du r1 = r12.f21756u
            long r2 = r0.mo15675f()
            r1.f21941p = r2
            com.google.ads.interactivemedia.v3.internal.du r0 = r12.f21756u
            long r1 = r12.m19881Y()
            r0.f21942q = r1
            com.google.ads.interactivemedia.v3.internal.du r0 = r12.f21756u
            boolean r1 = r0.f21936k
            if (r1 == 0) goto L_0x019b
            com.google.ads.interactivemedia.v3.internal.es r1 = r0.f21926a
            com.google.ads.interactivemedia.v3.internal.tw r0 = r0.f21927b
            boolean r0 = r12.m19859C(r1, r0)
            if (r0 == 0) goto L_0x019b
            com.google.ads.interactivemedia.v3.internal.du r0 = r12.f21756u
            com.google.ads.interactivemedia.v3.internal.dv r1 = r0.f21938m
            float r1 = r1.f21945b
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x019b
            com.google.ads.interactivemedia.v3.internal.bj r1 = r12.f21735O
            com.google.ads.interactivemedia.v3.internal.es r2 = r0.f21926a
            com.google.ads.interactivemedia.v3.internal.tw r3 = r0.f21927b
            java.lang.Object r3 = r3.f23859a
            long r4 = r0.f21943r
            long r2 = r12.m19858B(r2, r3, r4)
            float r0 = r1.mo15530c(r2)
            com.google.ads.interactivemedia.v3.internal.bm r1 = r12.f21748m
            com.google.ads.interactivemedia.v3.internal.dv r1 = r1.mo14522i()
            float r1 = r1.f21945b
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x019b
            com.google.ads.interactivemedia.v3.internal.bm r1 = r12.f21748m
            com.google.ads.interactivemedia.v3.internal.du r2 = r12.f21756u
            com.google.ads.interactivemedia.v3.internal.dv r2 = r2.f21938m
            com.google.ads.interactivemedia.v3.internal.dv r3 = new com.google.ads.interactivemedia.v3.internal.dv
            float r2 = r2.f21946c
            r3.<init>(r0, r2)
            r1.mo14521h(r3)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6860cu.m19903z():void");
    }

    /* renamed from: a */
    public final void mo15540a(C6888dv dvVar) {
        m19884ab(dvVar, false);
    }

    /* renamed from: b */
    public final void mo15587b() {
        this.f21733M = false;
    }

    /* renamed from: c */
    public final void mo15588c() {
        this.f21741f.mo14498a(0).sendToTarget();
    }

    /* renamed from: d */
    public final void mo15589d(boolean z, int i) {
        this.f21741f.mo14501d(z ? 1 : 0, i).sendToTarget();
    }

    /* renamed from: e */
    public final void mo15590e(C6912es esVar, int i, long j) {
        this.f21741f.mo14499b(3, new C6859ct(esVar, i, j)).sendToTarget();
    }

    /* renamed from: f */
    public final void mo15591f() {
        this.f21741f.mo14498a(6).sendToTarget();
    }

    /* renamed from: g */
    public final synchronized void mo15592g(C6894ea eaVar) {
        if (!this.f21758w) {
            if (this.f21742g.isAlive()) {
                this.f21741f.mo14499b(14, eaVar).sendToTarget();
                return;
            }
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        eaVar.mo15773j(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return true;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo15593h() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f21758w     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0022
            android.os.HandlerThread r0 = r3.f21742g     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0022
        L_0x000e:
            com.google.ads.interactivemedia.v3.internal.adp r0 = r3.f21741f     // Catch:{ all -> 0x0025 }
            r1 = 7
            r0.mo14503f(r1)     // Catch:{ all -> 0x0025 }
            com.google.ads.interactivemedia.v3.internal.ck r0 = new com.google.ads.interactivemedia.v3.internal.ck     // Catch:{ all -> 0x0025 }
            r0.<init>(r3)     // Catch:{ all -> 0x0025 }
            long r1 = r3.f21754s     // Catch:{ all -> 0x0025 }
            r3.m19896s(r0, r1)     // Catch:{ all -> 0x0025 }
            boolean r0 = r3.f21758w     // Catch:{ all -> 0x0025 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6860cu.mo15593h():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05bd, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05c0, code lost:
        if ((r1 instanceof java.lang.OutOfMemoryError) != false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05c2, code lost:
        r1 = com.google.ads.interactivemedia.p367v3.internal.C6826bn.m19783d((java.lang.OutOfMemoryError) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05c9, code lost:
        r1 = com.google.ads.interactivemedia.p367v3.internal.C6826bn.m19782c((java.lang.RuntimeException) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05cf, code lost:
        com.google.ads.interactivemedia.p367v3.internal.adu.m18341b("ExoPlayerImplInternal", "Playback error", r1);
        m19864H(true, false);
        r8.f21756u = r8.f21756u.mo15735f(r1);
        m19898u();
     */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0555 A[Catch:{ all -> 0x03f1, all -> 0x0233, Exception -> 0x0026, OutOfMemoryError | RuntimeException -> 0x05ba, bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError | RuntimeException -> 0x05ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x056e A[Catch:{ all -> 0x03f1, all -> 0x0233, Exception -> 0x0026, OutOfMemoryError | RuntimeException -> 0x05ba, bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError | RuntimeException -> 0x05ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05ba A[ExcHandler: OutOfMemoryError | RuntimeException (r0v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r38) {
        /*
            r37 = this;
            r8 = r37
            r1 = r38
            r9 = 0
            r10 = 1
            int r2 = r1.what     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r7 = 4
            r11 = 2
            switch(r2) {
                case 0: goto L_0x0587;
                case 1: goto L_0x0579;
                case 2: goto L_0x0575;
                case 3: goto L_0x0419;
                case 4: goto L_0x0404;
                case 5: goto L_0x03fc;
                case 6: goto L_0x03f5;
                case 7: goto L_0x03d7;
                case 8: goto L_0x037f;
                case 9: goto L_0x0367;
                case 10: goto L_0x0270;
                case 11: goto L_0x0256;
                case 12: goto L_0x0237;
                case 13: goto L_0x01fe;
                case 14: goto L_0x01f2;
                case 15: goto L_0x01c5;
                case 16: goto L_0x012b;
                case 17: goto L_0x00f1;
                case 18: goto L_0x00cc;
                case 19: goto L_0x00b0;
                case 20: goto L_0x0098;
                case 21: goto L_0x0084;
                case 22: goto L_0x0079;
                case 23: goto L_0x0053;
                case 24: goto L_0x002c;
                case 25: goto L_0x000f;
                default: goto L_0x000d;
            }     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x000d:
            r1 = 0
            return r1
        L_0x000f:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.bn r1 = (com.google.ads.interactivemedia.p367v3.internal.C6826bn) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r2 = r1.f21640i     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f21632a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r2 != r10) goto L_0x001d
            r2 = 1
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19462o(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19900w(r10)     // Catch:{ Exception -> 0x0026, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0026:
            r0 = move-exception
            r2 = r0
            com.google.ads.interactivemedia.p367v3.internal.auf.m19649a(r1, r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            throw r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x002c:
            int r1 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 != r10) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            boolean r2 = r8.f21726F     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == r2) goto L_0x05b6
            r8.f21726F = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r2 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = r2.f21929d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 != 0) goto L_0x004b
            if (r3 == r7) goto L_0x004b
            if (r3 != r10) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            com.google.ads.interactivemedia.v3.internal.adp r1 = r8.f21741f     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo14503f(r11)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x004b:
            com.google.ads.interactivemedia.v3.internal.du r1 = r2.mo15738i(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21756u = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0053:
            int r1 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r8.f21759x = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r37.m19873Q()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r8.f21760y     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x05b6
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15701i()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15700h()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == r2) goto L_0x05b6
            r8.m19900w(r10)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19880X(r9)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0079:
            com.google.ads.interactivemedia.v3.internal.ds r1 = r8.f21753r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r1 = r1.mo15724f()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19871O(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0084:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ve r1 = (com.google.ads.interactivemedia.p367v3.internal.C7357ve) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cq r2 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2.mo15583a(r10)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ds r2 = r8.f21753r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r1 = r2.mo15728l(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19871O(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0098:
            int r2 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = r1.arg2     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ve r1 = (com.google.ads.interactivemedia.p367v3.internal.C7357ve) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cq r4 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r4.mo15583a(r10)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ds r4 = r8.f21753r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r1 = r4.mo15727k(r2, r3, r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19871O(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x00b0:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.co r1 = (com.google.ads.interactivemedia.p367v3.internal.C6854co) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cq r2 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2.mo15583a(r10)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ds r2 = r8.f21753r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = r1.f21697a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = r1.f21698b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = r1.f21699c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ve r1 = r1.f21700d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r1 = r2.mo15731o()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19871O(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x00cc:
            java.lang.Object r2 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cn r2 = (com.google.ads.interactivemedia.p367v3.internal.C6853cn) r2     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r1 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cq r3 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3.mo15583a(r10)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ds r3 = r8.f21753r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r4 = -1
            if (r1 != r4) goto L_0x00e0
            int r1 = r3.mo15720b()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x00e0:
            java.util.List r4 = r2.f21693a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ve r2 = r2.f21696d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r1 = r3.mo15726j(r1, r4, r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19871O(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x00f1:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cn r1 = (com.google.ads.interactivemedia.p367v3.internal.C6853cn) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cq r2 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2.mo15583a(r10)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int unused = r1.f21694b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ct r2 = new com.google.ads.interactivemedia.v3.internal.ct     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.eb r3 = new com.google.ads.interactivemedia.v3.internal.eb     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.util.List r4 = r1.f21693a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ve r5 = r1.f21696d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3.<init>(r4, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int unused = r1.f21694b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r4 = r1.f21695c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2.<init>(r3, r9, r4)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21728H = r2     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ds r2 = r8.f21753r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.util.List r3 = r1.f21693a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ve r1 = r1.f21696d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r1 = r2.mo15725i(r3, r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19871O(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x012b:
            java.lang.Object r2 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dv r2 = (com.google.ads.interactivemedia.p367v3.internal.C6888dv) r2     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r1 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x0135
            r1 = 1
            goto L_0x0136
        L_0x0135:
            r1 = 0
        L_0x0136:
            com.google.ads.interactivemedia.v3.internal.cq r3 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3.mo15583a(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r3 = new com.google.ads.interactivemedia.v3.internal.du     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r13 = r1.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tw r14 = r1.f21927b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r4 = r1.f21928c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r6 = r1.f21929d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.bn r7 = r1.f21930e     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r15 = r1.f21931f     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.vj r12 = r1.f21932g     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.abg r10 = r1.f21933h     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.util.List r9 = r1.f21934i     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tw r11 = r1.f21935j     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r35 = r2
            boolean r2 = r1.f21936k     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r24 = r2
            int r2 = r1.f21937l     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r22 = r9
            r21 = r10
            long r9 = r1.f21941p     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r27 = r9
            long r9 = r1.f21942q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r29 = r9
            long r9 = r1.f21943r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r31 = r9
            boolean r9 = r1.f21939n     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r1.f21940o     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r10 = r12
            r12 = r3
            r19 = r15
            r15 = r4
            r17 = r6
            r18 = r7
            r20 = r10
            r23 = r11
            r25 = r2
            r26 = r35
            r33 = r9
            r34 = r1
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r34)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21756u = r3     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = r35
            float r1 = r2.f21945b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r3 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r3 = r3.mo15700h()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x0193:
            if (r3 == 0) goto L_0x01b2
            com.google.ads.interactivemedia.v3.internal.abg r4 = r3.mo15686q()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.abb r4 = r4.f20186c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.aba[] r4 = r4.mo14374b()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r5 = r4.length     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r6 = 0
        L_0x01a1:
            if (r6 >= r5) goto L_0x01ad
            r7 = r4[r6]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r7 == 0) goto L_0x01aa
            r7.mo14326h(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x01aa:
            int r6 = r6 + 1
            goto L_0x01a1
        L_0x01ad:
            com.google.ads.interactivemedia.v3.internal.di r3 = r3.mo15684o()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x0193
        L_0x01b2:
            com.google.ads.interactivemedia.v3.internal.ed[] r1 = r8.f21736a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = r1.length     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3 = 0
        L_0x01b6:
            r4 = 2
            if (r3 >= r4) goto L_0x05b6
            r4 = r1[r3]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r4 == 0) goto L_0x01c2
            float r5 = r2.f21945b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r4.mo14619I(r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x01c2:
            int r3 = r3 + 1
            goto L_0x01b6
        L_0x01c5:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ea r1 = (com.google.ads.interactivemedia.p367v3.internal.C6894ea) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            android.os.Handler r2 = r1.mo15768e()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            android.os.Looper r3 = r2.getLooper()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Thread r3 = r3.getThread()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r3 = r3.isAlive()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r3 != 0) goto L_0x01e8
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "Trying to send message on a dead thread."
            android.util.Log.w(r2, r3)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 0
            r1.mo15773j(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x01e8:
            com.google.ads.interactivemedia.v3.internal.cl r3 = new com.google.ads.interactivemedia.v3.internal.cl     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3.<init>(r8, r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2.post(r3)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x01f2:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ea r1 = (com.google.ads.interactivemedia.p367v3.internal.C6894ea) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15769f()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19867K(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x01fe:
            int r2 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r2 == 0) goto L_0x0204
            r2 = 1
            goto L_0x0205
        L_0x0204:
            r2 = 0
        L_0x0205:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r3 = r8.f21724D     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r3 == r2) goto L_0x0226
            r8.f21724D = r2     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r2 != 0) goto L_0x0226
            com.google.ads.interactivemedia.v3.internal.ed[] r2 = r8.f21736a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = r2.length     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3 = 0
        L_0x0215:
            r4 = 2
            if (r3 >= r4) goto L_0x0226
            r4 = r2[r3]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r5 = m19890ah(r4)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r5 != 0) goto L_0x0223
            r4.mo15526r()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x0223:
            int r3 = r3 + 1
            goto L_0x0215
        L_0x0226:
            if (r1 == 0) goto L_0x05b6
            monitor-enter(r37)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 1
            r1.set(r2)     // Catch:{ all -> 0x0233 }
            r37.notifyAll()     // Catch:{ all -> 0x0233 }
            monitor-exit(r37)     // Catch:{ all -> 0x0233 }
            goto L_0x05b6
        L_0x0233:
            r0 = move-exception
            r1 = r0
            monitor-exit(r37)     // Catch:{ all -> 0x0233 }
            throw r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x0237:
            int r1 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x023d
            r1 = 1
            goto L_0x023e
        L_0x023d:
            r1 = 0
        L_0x023e:
            r8.f21723C = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r3 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r3 = r3.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r2.mo15694b(r3, r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 != 0) goto L_0x0250
            r1 = 1
            r8.m19900w(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x0250:
            r1 = 0
            r8.m19880X(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0256:
            int r1 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21722B = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r3 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r3 = r3.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r2.mo15693a(r3, r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 != 0) goto L_0x026a
            r1 = 1
            r8.m19900w(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x026a:
            r1 = 0
            r8.m19880X(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0270:
            com.google.ads.interactivemedia.v3.internal.bm r1 = r8.f21748m     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dv r1 = r1.mo14522i()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            float r1 = r1.f21945b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15700h()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r3 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r3 = r3.mo15701i()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r4 = 1
        L_0x0285:
            if (r2 == 0) goto L_0x05b6
            boolean r5 = r2.f21865d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r5 == 0) goto L_0x05b6
            com.google.ads.interactivemedia.v3.internal.du r5 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r5 = r5.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.abg r10 = r2.mo15680k(r1, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.abg r5 = r2.mo15686q()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r5 == 0) goto L_0x02bf
            com.google.ads.interactivemedia.v3.internal.abb r6 = r5.f20186c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r6 = r6.f20171a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.abb r9 = r10.f20186c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r9 = r9.f20171a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r6 == r9) goto L_0x02a4
            goto L_0x02bf
        L_0x02a4:
            r6 = 0
        L_0x02a5:
            com.google.ads.interactivemedia.v3.internal.abb r9 = r10.f20186c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r9 = r9.f20171a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r6 >= r9) goto L_0x02b4
            boolean r9 = r10.mo14383b(r5, r6)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r9 == 0) goto L_0x02bf
            int r6 = r6 + 1
            goto L_0x02a5
        L_0x02b4:
            if (r2 != r3) goto L_0x02b8
            r5 = 0
            goto L_0x02b9
        L_0x02b8:
            r5 = 1
        L_0x02b9:
            r4 = r4 & r5
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15684o()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x0285
        L_0x02bf:
            if (r4 == 0) goto L_0x0335
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r15 = r1.mo15700h()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r13 = r1.mo15704l(r15)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ed[] r1 = r8.f21736a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r1 = r1.length     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1 = 2
            boolean[] r5 = new boolean[r1]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r11 = r1.f21943r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r9 = r15
            r14 = r5
            long r9 = r9.mo15681l(r10, r11, r13, r14)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tw r2 = r1.f21927b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r11 = r1.f21928c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1 = r37
            r3 = r9
            r13 = r5
            r5 = r11
            com.google.ads.interactivemedia.v3.internal.du r1 = r1.m19877U(r2, r3, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21756u = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r2 = r1.f21929d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r2 == r7) goto L_0x0300
            long r1 = r1.f21943r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0300
            com.google.ads.interactivemedia.v3.internal.cq r1 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15585c(r7)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19863G(r9)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x0300:
            com.google.ads.interactivemedia.v3.internal.ed[] r1 = r8.f21736a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r1 = r1.length     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1 = 2
            boolean[] r2 = new boolean[r1]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3 = 0
        L_0x0307:
            com.google.ads.interactivemedia.v3.internal.ed[] r4 = r8.f21736a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r5 = r4.length     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r3 >= r1) goto L_0x0331
            r1 = r4[r3]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r4 = m19890ah(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2[r3] = r4     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.vb[] r5 = r15.f21864c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r5 = r5[r3]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r4 == 0) goto L_0x032d
            com.google.ads.interactivemedia.v3.internal.vb r4 = r1.mo15512aZ()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r5 == r4) goto L_0x0324
            r8.m19869M(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x032d
        L_0x0324:
            boolean r4 = r13[r3]     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r4 == 0) goto L_0x032d
            long r4 = r8.f21729I     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15523o(r4)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x032d:
            int r3 = r3 + 1
            r1 = 2
            goto L_0x0307
        L_0x0331:
            r8.m19879W(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x034f
        L_0x0335:
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15704l(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r2.f21865d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x034f
            com.google.ads.interactivemedia.v3.internal.dj r1 = r2.f21867f     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r3 = r1.f21878b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r5 = r8.f21729I     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r5 = r2.mo15671b(r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2.mo15687r(r10, r3)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x034f:
            r1 = 1
            r8.m19880X(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r1 = r1.f21929d     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == r7) goto L_0x05b6
            r37.m19874R()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r37.m19903z()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.adp r1 = r8.f21741f     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 2
            r1.mo14503f(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0367:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tv r1 = (com.google.ads.interactivemedia.p367v3.internal.C7320tv) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r2.mo15695c(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x05b6
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r2 = r8.f21729I     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15696d(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r37.m19874R()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x037f:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tv r1 = (com.google.ads.interactivemedia.p367v3.internal.C7320tv) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r2.mo15695c(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x05b6
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15699g()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.bm r2 = r8.f21748m     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dv r2 = r2.mo14522i()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            float r2 = r2.f21945b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r3 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r3 = r3.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15677h(r2, r3)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.vj r2 = r1.mo15685p()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.abg r3 = r1.mo15686q()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19883aa(r2, r3)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15700h()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r1 != r2) goto L_0x03d2
            com.google.ads.interactivemedia.v3.internal.dj r2 = r1.f21867f     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r2 = r2.f21878b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19863G(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r37.m19878V()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r2 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tw r3 = r2.f21927b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dj r1 = r1.f21867f     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r4 = r1.f21878b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r6 = r2.f21928c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1 = r37
            r2 = r3
            r3 = r4
            r5 = r6
            com.google.ads.interactivemedia.v3.internal.du r1 = r1.m19877U(r2, r3, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21756u = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x03d2:
            r37.m19874R()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x03d7:
            r1 = 0
            r2 = 1
            r8.m19865I(r2, r1, r2, r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.bk r1 = r8.f21734N     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15534c()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.m19897t(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            android.os.HandlerThread r1 = r8.f21742g     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.quit()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            monitor-enter(r37)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21758w = r2     // Catch:{ all -> 0x03f1 }
            r37.notifyAll()     // Catch:{ all -> 0x03f1 }
            monitor-exit(r37)     // Catch:{ all -> 0x03f1 }
            return r2
        L_0x03f1:
            r0 = move-exception
            r1 = r0
            monitor-exit(r37)     // Catch:{ all -> 0x03f1 }
            throw r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x03f5:
            r1 = 0
            r2 = 1
            r8.m19864H(r1, r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x03fc:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.eg r1 = (com.google.ads.interactivemedia.p367v3.internal.C6900eg) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21755t = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0404:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dv r1 = (com.google.ads.interactivemedia.p367v3.internal.C6888dv) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.bm r2 = r8.f21748m     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2.mo14521h(r1)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.bm r1 = r8.f21748m     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.dv r1 = r1.mo14522i()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 1
            r8.m19884ab(r1, r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0419:
            java.lang.Object r1 = r1.obj     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ct r1 = (com.google.ads.interactivemedia.p367v3.internal.C6859ct) r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.cq r2 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3 = 1
            r2.mo15583a(r3)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r2 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r9 = r2.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r11 = 1
            int r12 = r8.f21722B     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r13 = r8.f21723C     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.er r14 = r8.f21744i     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.eq r15 = r8.f21745j     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r10 = r1
            android.util.Pair r2 = m19888af(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x0461
            com.google.ads.interactivemedia.v3.internal.du r9 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r9 = r9.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            android.util.Pair r9 = r8.m19866J(r9)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Object r10 = r9.first     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tw r10 = (com.google.ads.interactivemedia.p367v3.internal.C7321tw) r10     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Object r9 = r9.second     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r11 = r9.longValue()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r9 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r9 = r9.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r9 = r9.mo15851u()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r13 = 1
            r9 = r9 ^ r13
            r13 = r5
            r36 = r10
            r10 = r9
            r9 = r36
            goto L_0x04ae
        L_0x0461:
            java.lang.Object r9 = r2.first     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Object r10 = r2.second     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r11 = r10.longValue()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            long r13 = r1.f21720c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r10 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0473
            r13 = r5
            goto L_0x0474
        L_0x0473:
            r13 = r11
        L_0x0474:
            com.google.ads.interactivemedia.v3.internal.dl r10 = r8.f21752q     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r15 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r15 = r15.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.tw r9 = r10.mo15708p(r15, r9, r11)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r10 = r9.mo16542b()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r10 == 0) goto L_0x04a4
            com.google.ads.interactivemedia.v3.internal.du r5 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r5 = r5.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            java.lang.Object r6 = r9.f23859a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.eq r10 = r8.f21745j     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r5.mo15479g(r6, r10)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.eq r5 = r8.f21745j     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r6 = r9.f23860b     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r5 = r5.mo15834d(r6)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r6 = r9.f23861c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r5 != r6) goto L_0x04a0
            com.google.ads.interactivemedia.v3.internal.eq r5 = r8.f21745j     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r5.mo15843k()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x04a0:
            r10 = 1
            r11 = 0
            goto L_0x04ae
        L_0x04a4:
            long r3 = r1.f21720c     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x04ac
            r3 = 1
            goto L_0x04ad
        L_0x04ac:
            r3 = 0
        L_0x04ad:
            r10 = r3
        L_0x04ae:
            com.google.ads.interactivemedia.v3.internal.du r3 = r8.f21756u     // Catch:{ all -> 0x055e }
            com.google.ads.interactivemedia.v3.internal.es r3 = r3.f21926a     // Catch:{ all -> 0x055e }
            boolean r3 = r3.mo15851u()     // Catch:{ all -> 0x055e }
            if (r3 == 0) goto L_0x04bb
            r8.f21728H = r1     // Catch:{ all -> 0x055e }
            goto L_0x04cb
        L_0x04bb:
            if (r2 != 0) goto L_0x04ce
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ all -> 0x055e }
            int r1 = r1.f21929d     // Catch:{ all -> 0x055e }
            r2 = 1
            if (r1 == r2) goto L_0x04c7
            r8.m19897t(r7)     // Catch:{ all -> 0x055e }
        L_0x04c7:
            r1 = 0
            r8.m19865I(r1, r2, r1, r2)     // Catch:{ all -> 0x055e }
        L_0x04cb:
            r3 = r11
            goto L_0x0549
        L_0x04ce:
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ all -> 0x055e }
            com.google.ads.interactivemedia.v3.internal.tw r1 = r1.f21927b     // Catch:{ all -> 0x055e }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x055e }
            if (r1 == 0) goto L_0x0524
            com.google.ads.interactivemedia.v3.internal.dl r1 = r8.f21752q     // Catch:{ all -> 0x055e }
            com.google.ads.interactivemedia.v3.internal.di r1 = r1.mo15700h()     // Catch:{ all -> 0x055e }
            if (r1 == 0) goto L_0x04f3
            boolean r2 = r1.f21865d     // Catch:{ all -> 0x055e }
            if (r2 == 0) goto L_0x04f3
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x04f3
            com.google.ads.interactivemedia.v3.internal.tv r1 = r1.f21862a     // Catch:{ all -> 0x055e }
            com.google.ads.interactivemedia.v3.internal.eg r2 = r8.f21755t     // Catch:{ all -> 0x055e }
            long r1 = r1.mo16506j(r11, r2)     // Catch:{ all -> 0x055e }
            goto L_0x04f4
        L_0x04f3:
            r1 = r11
        L_0x04f4:
            long r3 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19754a(r1)     // Catch:{ all -> 0x055e }
            com.google.ads.interactivemedia.v3.internal.du r5 = r8.f21756u     // Catch:{ all -> 0x055e }
            long r5 = r5.f21943r     // Catch:{ all -> 0x055e }
            long r5 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19754a(r5)     // Catch:{ all -> 0x055e }
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x0525
            com.google.ads.interactivemedia.v3.internal.du r3 = r8.f21756u     // Catch:{ all -> 0x055e }
            int r4 = r3.f21929d     // Catch:{ all -> 0x055e }
            r5 = 2
            if (r4 == r5) goto L_0x050e
            r5 = 3
            if (r4 != r5) goto L_0x0525
        L_0x050e:
            long r3 = r3.f21943r     // Catch:{ all -> 0x055e }
            r1 = r37
            r2 = r9
            r5 = r13
            com.google.ads.interactivemedia.v3.internal.du r1 = r1.m19877U(r2, r3, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21756u = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r10 == 0) goto L_0x05b6
            com.google.ads.interactivemedia.v3.internal.cq r1 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 2
        L_0x051f:
            r1.mo15585c(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0524:
            r1 = r11
        L_0x0525:
            com.google.ads.interactivemedia.v3.internal.du r3 = r8.f21756u     // Catch:{ all -> 0x055e }
            int r3 = r3.f21929d     // Catch:{ all -> 0x055e }
            if (r3 != r7) goto L_0x052d
            r3 = 1
            goto L_0x052e
        L_0x052d:
            r3 = 0
        L_0x052e:
            long r15 = r8.m19861E(r9, r1, r3)     // Catch:{ all -> 0x055e }
            int r1 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x0538
            r1 = 1
            goto L_0x0539
        L_0x0538:
            r1 = 0
        L_0x0539:
            r10 = r10 | r1
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ all -> 0x0559 }
            com.google.ads.interactivemedia.v3.internal.es r4 = r1.f21926a     // Catch:{ all -> 0x0559 }
            com.google.ads.interactivemedia.v3.internal.tw r5 = r1.f21927b     // Catch:{ all -> 0x0559 }
            r1 = r37
            r2 = r4
            r3 = r9
            r6 = r13
            r1.m19872P(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0559 }
            r3 = r15
        L_0x0549:
            r1 = r37
            r2 = r9
            r5 = r13
            com.google.ads.interactivemedia.v3.internal.du r1 = r1.m19877U(r2, r3, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21756u = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r10 == 0) goto L_0x05b6
            com.google.ads.interactivemedia.v3.internal.cq r1 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 2
            goto L_0x051f
        L_0x0559:
            r0 = move-exception
            r1 = r0
            r7 = r1
            r3 = r15
            goto L_0x0562
        L_0x055e:
            r0 = move-exception
            r1 = r0
            r7 = r1
            r3 = r11
        L_0x0562:
            r1 = r37
            r2 = r9
            r5 = r13
            com.google.ads.interactivemedia.v3.internal.du r1 = r1.m19877U(r2, r3, r5)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r8.f21756u = r1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r10 == 0) goto L_0x0574
            com.google.ads.interactivemedia.v3.internal.cq r1 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 2
            r1.mo15585c(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x0574:
            throw r7     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x0575:
            r37.m19857A()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0579:
            int r2 = r1.arg1     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            if (r2 == 0) goto L_0x057f
            r2 = 1
            goto L_0x0580
        L_0x057f:
            r2 = 0
        L_0x0580:
            int r1 = r1.arg2     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r3 = 1
            r8.m19899v(r2, r1, r3, r3)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x05b6
        L_0x0587:
            com.google.ads.interactivemedia.v3.internal.cq r1 = r8.f21757v     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 1
            r1.mo15583a(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1 = 0
            r8.m19865I(r1, r1, r1, r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.bk r1 = r8.f21734N     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15532a()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.du r1 = r8.f21756u     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.es r1 = r1.f21926a     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            boolean r1 = r1.mo15851u()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 1
            if (r2 == r1) goto L_0x05a2
            r7 = 2
        L_0x05a2:
            r8.m19897t(r7)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.ds r1 = r8.f21753r     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.abq r2 = r8.f21740e     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.adh r2 = r2.mo14399b()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r1.mo15721c(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            com.google.ads.interactivemedia.v3.internal.adp r1 = r8.f21741f     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            r2 = 2
            r1.mo14503f(r2)     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
        L_0x05b6:
            r37.m19898u()     // Catch:{ bn -> 0x0615, IOException -> 0x05e7, RuntimeException -> 0x05bc, OutOfMemoryError -> 0x05ba }
            goto L_0x0613
        L_0x05ba:
            r0 = move-exception
            goto L_0x05bd
        L_0x05bc:
            r0 = move-exception
        L_0x05bd:
            r1 = r0
            boolean r2 = r1 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x05c9
            java.lang.OutOfMemoryError r1 = (java.lang.OutOfMemoryError) r1
            com.google.ads.interactivemedia.v3.internal.bn r1 = com.google.ads.interactivemedia.p367v3.internal.C6826bn.m19783d(r1)
            goto L_0x05cf
        L_0x05c9:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            com.google.ads.interactivemedia.v3.internal.bn r1 = com.google.ads.interactivemedia.p367v3.internal.C6826bn.m19782c(r1)
        L_0x05cf:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.ads.interactivemedia.p367v3.internal.adu.m18341b(r2, r3, r1)
            r2 = 0
            r3 = 1
            r8.m19864H(r3, r2)
            com.google.ads.interactivemedia.v3.internal.du r2 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.du r1 = r2.mo15735f(r1)
            r8.f21756u = r1
            r37.m19898u()
            goto L_0x0613
        L_0x05e7:
            r0 = move-exception
            r1 = r0
            com.google.ads.interactivemedia.v3.internal.bn r1 = com.google.ads.interactivemedia.p367v3.internal.C6826bn.m19780a(r1)
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15700h()
            if (r2 == 0) goto L_0x05fd
            com.google.ads.interactivemedia.v3.internal.dj r2 = r2.f21867f
            com.google.ads.interactivemedia.v3.internal.tw r2 = r2.f21877a
            com.google.ads.interactivemedia.v3.internal.bn r1 = r1.mo15547f(r2)
        L_0x05fd:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.ads.interactivemedia.p367v3.internal.adu.m18341b(r2, r3, r1)
            r2 = 0
            r8.m19864H(r2, r2)
            com.google.ads.interactivemedia.v3.internal.du r2 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.du r1 = r2.mo15735f(r1)
            r8.f21756u = r1
            r37.m19898u()
        L_0x0613:
            r3 = 1
            goto L_0x066f
        L_0x0615:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f21632a
            r3 = 1
            if (r2 != r3) goto L_0x062c
            com.google.ads.interactivemedia.v3.internal.dl r2 = r8.f21752q
            com.google.ads.interactivemedia.v3.internal.di r2 = r2.mo15701i()
            if (r2 == 0) goto L_0x062c
            com.google.ads.interactivemedia.v3.internal.dj r2 = r2.f21867f
            com.google.ads.interactivemedia.v3.internal.tw r2 = r2.f21877a
            com.google.ads.interactivemedia.v3.internal.bn r1 = r1.mo15547f(r2)
        L_0x062c:
            boolean r2 = r1.f21640i
            if (r2 == 0) goto L_0x064e
            com.google.ads.interactivemedia.v3.internal.bn r2 = r8.f21732L
            if (r2 != 0) goto L_0x064e
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Recoverable playback error"
            com.google.ads.interactivemedia.p367v3.internal.adu.m18340a(r2, r3, r1)
            r8.f21732L = r1
            com.google.ads.interactivemedia.v3.internal.adp r2 = r8.f21741f
            r3 = 25
            android.os.Message r1 = r2.mo14499b(r3, r1)
            android.os.Handler r2 = r1.getTarget()
            r2.sendMessageAtFrontOfQueue(r1)
            r3 = 1
            goto L_0x066c
        L_0x064e:
            com.google.ads.interactivemedia.v3.internal.bn r2 = r8.f21732L
            if (r2 == 0) goto L_0x0658
            com.google.ads.interactivemedia.p367v3.internal.auf.m19649a(r1, r2)
            r2 = 0
            r8.f21732L = r2
        L_0x0658:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.ads.interactivemedia.p367v3.internal.adu.m18341b(r2, r3, r1)
            r2 = 0
            r3 = 1
            r8.m19864H(r3, r2)
            com.google.ads.interactivemedia.v3.internal.du r2 = r8.f21756u
            com.google.ads.interactivemedia.v3.internal.du r1 = r2.mo15735f(r1)
            r8.f21756u = r1
        L_0x066c:
            r37.m19898u()
        L_0x066f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6860cu.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: i */
    public final Looper mo15595i() {
        return this.f21743h;
    }

    /* renamed from: j */
    public final void mo15596j() {
        this.f21741f.mo14503f(22);
    }

    /* renamed from: k */
    public final void mo15597k(C7320tv tvVar) {
        this.f21741f.mo14499b(8, tvVar).sendToTarget();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo15598m(C7356vd vdVar) {
        this.f21741f.mo14499b(9, (C7320tv) vdVar).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo15599n(C6894ea eaVar) {
        try {
            m19891ai(eaVar);
        } catch (C6826bn e) {
            adu.m18341b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ Boolean mo15600o() {
        return Boolean.valueOf(this.f21758w);
    }

    /* renamed from: q */
    public final void mo15601q(List list, int i, long j, C7357ve veVar) {
        this.f21741f.mo14499b(17, new C6853cn(list, veVar, 0, j)).sendToTarget();
    }
}
