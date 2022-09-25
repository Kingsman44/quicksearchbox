package com.google.android.libraries.lens.view.p2113h.p2122e;

import android.content.Context;
import android.graphics.PointF;
import android.util.Size;
import android.view.Surface;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.C24967ab;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.main.C27319bi;
import com.google.android.libraries.lens.view.main.C27321bk;
import com.google.android.libraries.lens.view.p2069am.C25332h;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2082av.C25579c;
import com.google.android.libraries.lens.view.p2087ay.C25626ai;
import com.google.android.libraries.lens.view.p2087ay.C25655p;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26642c;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26651l;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26654o;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26655p;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26656q;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26657r;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26660u;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26661v;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26739ah;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26747ap;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26748aq;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26749ar;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26751c;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26752d;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26763o;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26764p;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26765q;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26766r;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26772x;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26774z;
import com.google.android.libraries.lens.view.p2113h.p2123f.C26821c;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26850af;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26851ag;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26865h;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26866i;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26868k;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26871n;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26879v;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26881x;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26856c;
import com.google.android.libraries.lens.view.p2152n.C27456i;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.sensors.C27722d;
import com.google.android.libraries.lens.view.sensors.orientation.C27730g;
import com.google.android.libraries.lens.view.sensors.orientation.C27731h;
import com.google.android.libraries.lens.view.session.C27781bq;
import com.google.android.libraries.lens.view.vision.C28172n;
import com.google.android.libraries.lens.view.vision.C28174p;
import com.google.android.libraries.lens.view.vision.C28178t;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.android.libraries.lens.view.vision.C28181w;
import com.google.android.libraries.lens.view.vision.C28182x;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.h.e.ai */
/* compiled from: PG */
public final class C26784ai implements C26765q {

    /* renamed from: a */
    public static final C58974d f72971a = C58974d.m91135i("CameraController");

    /* renamed from: b */
    public static final int f72972b = ((int) Duration.ofMillis(-1).toNanos());

    /* renamed from: A */
    public final C26660u f72973A;

    /* renamed from: B */
    public final C28172n f72974B;

    /* renamed from: C */
    public final C28181w f72975C;

    /* renamed from: D */
    public final C26821c f72976D;

    /* renamed from: E */
    public final C26790ao f72977E;

    /* renamed from: F */
    public final C27781bq f72978F;

    /* renamed from: G */
    public final C26774z f72979G;

    /* renamed from: H */
    public final Executor f72980H;

    /* renamed from: I */
    public final Executor f72981I;

    /* renamed from: J */
    public final C26789an f72982J;

    /* renamed from: K */
    public final boolean f72983K;

    /* renamed from: L */
    public final C26766r f72984L;

    /* renamed from: M */
    public Size f72985M;

    /* renamed from: N */
    public boolean f72986N;

    /* renamed from: O */
    public C26733ab f72987O;

    /* renamed from: P */
    public final AtomicBoolean f72988P;

    /* renamed from: Q */
    public final C27722d f72989Q;

    /* renamed from: R */
    public final C21370a f72990R;

    /* renamed from: S */
    public final long f72991S;

    /* renamed from: T */
    public final long f72992T;

    /* renamed from: U */
    public long f72993U;

    /* renamed from: V */
    public long f72994V;

    /* renamed from: W */
    public long f72995W;

    /* renamed from: X */
    public long f72996X;

    /* renamed from: Y */
    public boolean f72997Y;

    /* renamed from: Z */
    public final C26778ac f72998Z;

    /* renamed from: aa */
    public volatile C27321bk f72999aa;

    /* renamed from: ab */
    public final C26777ab f73000ab;

    /* renamed from: ac */
    private final C60888db f73001ac;

    /* renamed from: ad */
    private final Executor f73002ad;

    /* renamed from: ae */
    private final C26879v f73003ae;

    /* renamed from: af */
    private final C26752d f73004af;

    /* renamed from: ag */
    private final C26764p f73005ag;

    /* renamed from: ah */
    private final C27731h f73006ah;

    /* renamed from: ai */
    private final Executor f73007ai;

    /* renamed from: aj */
    private final Executor f73008aj;

    /* renamed from: ak */
    private final C26781af f73009ak;

    /* renamed from: al */
    private final AtomicBoolean f73010al;

    /* renamed from: c */
    public final Executor f73011c;

    /* renamed from: d */
    public final AtomicBoolean f73012d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicInteger f73013e = new AtomicInteger();

    /* renamed from: f */
    public volatile boolean f73014f = true;

    /* renamed from: g */
    public boolean f73015g = false;

    /* renamed from: h */
    public final Object f73016h = new Object();

    /* renamed from: i */
    public C26878u f73017i;

    /* renamed from: j */
    public C26749ar f73018j;

    /* renamed from: k */
    public int f73019k;

    /* renamed from: l */
    public int f73020l;

    /* renamed from: m */
    public float f73021m = 1.0f;

    /* renamed from: n */
    public C26763o f73022n;

    /* renamed from: o */
    public final AtomicReference f73023o = new AtomicReference((Object) null);

    /* renamed from: p */
    public final AtomicInteger f73024p = new AtomicInteger();

    /* renamed from: q */
    public final C26657r f73025q;

    /* renamed from: r */
    public final C26657r f73026r;

    /* renamed from: s */
    public final C26657r f73027s;

    /* renamed from: t */
    public final C26657r f73028t;

    /* renamed from: u */
    public final C26642c f73029u;

    /* renamed from: v */
    public final C26642c f73030v;

    /* renamed from: w */
    public final C26739ah f73031w;

    /* renamed from: x */
    public final C26654o f73032x;

    /* renamed from: y */
    public final C26661v f73033y;

    /* renamed from: z */
    public final C26651l f73034z;

    public C26784ai(C27731h hVar, Executor executor, Executor executor2, Executor executor3, C60888db dbVar, Executor executor4, Executor executor5, C26879v vVar, C26656q qVar, C26657r rVar, C26657r rVar2, C26657r rVar3, C26657r rVar4, C26642c cVar, C26642c cVar2, C26661v vVar2, C26651l lVar, C26764p pVar, C26660u uVar, C28172n nVar, C28181w wVar, C21370a aVar, C26821c cVar3, C26752d dVar, C69464a aVar2, C27781bq bqVar, C26772x xVar, C26774z zVar, C27722d dVar2, C26789an anVar, boolean z, C24967ab abVar, C58833ax axVar) {
        C26656q qVar2 = qVar;
        C26764p pVar2 = pVar;
        C28172n nVar2 = nVar;
        C26781af afVar = new C26781af(this);
        this.f73009ak = afVar;
        this.f73000ab = new C26777ab(this);
        this.f72998Z = new C26778ac(this);
        this.f72988P = new AtomicBoolean();
        this.f73010al = new AtomicBoolean();
        long j = abVar.f68084b.get();
        if (j <= 0) {
            ((C58970a) ((C58970a) C24967ab.f68083a.mo56226d()).mo56372aa(48996)).mo56388r("***** Invalid Start Time: %d", j);
        }
        this.f72991S = j;
        this.f72992T = aVar.mo26873e() - j;
        this.f72974B = nVar2;
        this.f72975C = wVar;
        this.f73011c = C25806i.m47612a(executor5);
        this.f73025q = rVar;
        C26657r rVar5 = rVar2;
        this.f73026r = rVar5;
        C26657r rVar6 = rVar3;
        this.f73027s = rVar6;
        this.f73028t = rVar4;
        C26642c cVar4 = cVar;
        this.f73029u = cVar4;
        C26642c cVar5 = cVar2;
        this.f73030v = cVar5;
        this.f73033y = vVar2;
        this.f73005ag = pVar2;
        this.f73034z = lVar;
        this.f72973A = uVar;
        this.f73007ai = executor;
        this.f73008aj = executor2;
        this.f72981I = executor3;
        this.f73001ac = dbVar;
        this.f73002ad = executor4;
        this.f72990R = aVar;
        this.f72976D = cVar3;
        this.f73003ae = vVar;
        this.f73004af = dVar;
        this.f72977E = new C26790ao(nVar2);
        this.f72978F = bqVar;
        int a = xVar.mo32137a();
        this.f72979G = zVar;
        this.f72980H = executor5;
        this.f72989Q = dVar2;
        this.f73006ah = hVar;
        this.f72982J = anVar;
        this.f72983K = z;
        this.f72984L = (C26766r) axVar.mo56111f();
        pVar2.mo31940e(a);
        nVar2.mo33585f(afVar);
        C60888db dbVar2 = (C60888db) qVar2.f72680a.mo17428b();
        dbVar2.getClass();
        C21370a aVar3 = (C21370a) qVar2.f72681b.mo17428b();
        aVar3.getClass();
        C26655p pVar3 = (C26655p) qVar2.f72682c.mo17428b();
        pVar3.getClass();
        C28182x xVar2 = (C28182x) qVar2.f72683d.mo17428b();
        xVar2.getClass();
        this.f73032x = new C26654o(rVar, rVar5, rVar6, cVar4, cVar5, dbVar2, aVar3, pVar3, xVar2);
        this.f73031w = (C26739ah) aVar2.mo17428b();
    }

    /* renamed from: B */
    private final int m49584B() {
        C26763o oVar = this.f73022n;
        oVar.getClass();
        return oVar.mo32097b();
    }

    /* renamed from: w */
    public static void m49585w(Executor executor, Runnable runnable) {
        executor.execute(C47810es.m84977q(runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo32148A(boolean z) {
        if (this.f73010al.getAndSet(z) != z) {
            mo32155y();
        }
    }

    /* renamed from: a */
    public final float mo32111a() {
        return this.f73021m;
    }

    /* renamed from: b */
    public final PointF mo32112b(PointF pointF) {
        PointF pointF2;
        C26790ao aoVar = this.f72977E;
        if (aoVar.f73046c == 0) {
            return pointF;
        }
        float min = ((float) Math.min(aoVar.f73048e.getWidth(), aoVar.f73048e.getHeight())) * 0.2f;
        C28178t D = C28179u.m52643D();
        D.mo33647k(min);
        D.mo33648l(min);
        D.mo33652p(pointF.x * ((float) aoVar.f73048e.getWidth()));
        D.mo33653q(pointF.y * ((float) aoVar.f73048e.getHeight()));
        D.mo33646j(0.0f);
        D.mo33650n(aoVar.f73047d);
        C28179u n = aoVar.f73045b.mo33598n(D.mo33696r(), aoVar.f73046c);
        if (n == null) {
            pointF2 = null;
        } else {
            pointF2 = new PointF(n.mo33662f() / ((float) aoVar.f73048e.getWidth()), n.mo33663g() / ((float) aoVar.f73048e.getHeight()));
        }
        if (pointF2 != null) {
            return pointF2;
        }
        if (!aoVar.f73049f) {
            return pointF;
        }
        double d = (double) pointF.x;
        double d2 = aoVar.f73050g;
        double width = (double) aoVar.f73048e.getWidth();
        Double.isNaN(width);
        Double.isNaN(d);
        double d3 = (double) pointF.y;
        double d4 = aoVar.f73051h;
        double height = (double) aoVar.f73048e.getHeight();
        Double.isNaN(height);
        Double.isNaN(d3);
        return new PointF((float) (d - (d2 / width)), (float) (d3 - (d4 / height)));
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("CameraController");
        eVar.mo33148e("idle", Boolean.toString(this.f73014f));
        eVar.mo33148e("analyzeFrames", Boolean.toString(this.f73015g));
        boolean z = true;
        eVar.mo33148e("hasCameraConfiguration", Boolean.toString(this.f73022n != null));
        if (this.f73017i == null) {
            z = false;
        }
        eVar.mo33148e("hasImagePump", Boolean.toString(z));
        eVar.mo33146c(this.f73031w);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo32113d(android.graphics.PointF r12) {
        /*
            r11 = this;
            float r0 = r12.x
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            float r0 = r12.x
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x001d
            float r0 = r12.y
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            float r0 = r12.y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            java.lang.String r0 = "The point at %s is out of the normalized range."
            java.lang.String r4 = r12.toString()
            com.google.common.base.C58838bb.m90873h(r1, r0, r4)
            android.util.Size r0 = r11.f72985M
            if (r0 != 0) goto L_0x002d
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            return r12
        L_0x002d:
            int r0 = r0.getWidth()
            float r0 = (float) r0
            android.util.Size r1 = r11.f72985M
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            com.google.android.libraries.lens.view.h.d.o r1 = r11.f73022n
            r1.getClass()
            android.util.Size r4 = r1.mo32098c()
            int r5 = r4.getHeight()
            if (r5 == 0) goto L_0x010a
            int r5 = r4.getWidth()
            if (r5 != 0) goto L_0x0051
            goto L_0x010a
        L_0x0051:
            int r5 = r4.getWidth()
            float r5 = (float) r5
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r5 = r5 / r4
            int r4 = r1.mo32097b()
            r6 = 90
            r7 = 270(0x10e, float:3.78E-43)
            if (r4 == r6) goto L_0x006a
            if (r4 != r7) goto L_0x0073
            r4 = 270(0x10e, float:3.78E-43)
        L_0x006a:
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0071
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x00a0
        L_0x0071:
            float r5 = r2 / r5
        L_0x0073:
            r3 = 1056964608(0x3f000000, float:0.5)
            r8 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x008e
            float r9 = r12.y
            android.graphics.PointF r10 = new android.graphics.PointF
            float r12 = r12.x
            float r9 = r9 + r8
            float r9 = r9 * r5
            float r9 = r9 / r0
            float r9 = r9 + r3
            r10.<init>(r12, r9)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x00a0
        L_0x008e:
            float r9 = r12.x
            android.graphics.PointF r10 = new android.graphics.PointF
            float r9 = r9 + r8
            float r9 = r9 * r0
            float r9 = r9 / r5
            float r9 = r9 + r3
            float r12 = r12.y
            r10.<init>(r9, r12)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r10)
        L_0x00a0:
            boolean r0 = r12.mo56113h()
            if (r0 != 0) goto L_0x00a9
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x010c
        L_0x00a9:
            java.lang.Object r12 = r12.mo56107c()
            android.graphics.PointF r12 = (android.graphics.PointF) r12
            boolean r0 = r1.mo32100e()
            if (r0 == 0) goto L_0x00bb
            float r0 = r12.x
            float r0 = r2 - r0
            r12.x = r0
        L_0x00bb:
            if (r4 != 0) goto L_0x00c2
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x010c
        L_0x00c2:
            if (r4 != r6) goto L_0x00d3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r12.y
            float r12 = r12.x
            float r2 = r2 - r12
            r0.<init>(r1, r2)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x010c
        L_0x00d3:
            r0 = 180(0xb4, float:2.52E-43)
            if (r4 != r0) goto L_0x00e8
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r12.x
            float r1 = r2 - r1
            float r12 = r12.y
            float r2 = r2 - r12
            r0.<init>(r1, r2)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x010c
        L_0x00e8:
            if (r4 != r7) goto L_0x00f9
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r12.y
            float r2 = r2 - r1
            float r12 = r12.x
            r0.<init>(r2, r12)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x010c
        L_0x00f9:
            com.google.common.f.a.d r12 = com.google.android.libraries.lens.view.p2113h.p2122e.C26790ao.f73044a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = "The sensor orientation %d is not covered."
            r1 = 49190(0xc026, float:6.893E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r12).mo56372aa(r1)).mo56387q(r0, r4)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x010c
        L_0x010a:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
        L_0x010c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2122e.C26784ai.mo32113d(android.graphics.PointF):com.google.common.base.ax");
    }

    /* renamed from: e */
    public final void mo32114e(C26749ar arVar, int i, int i2) {
        m49585w(this.f73007ai, new C26805p(this, arVar, i, i2));
    }

    /* renamed from: f */
    public final void mo32115f(float f) {
        mo32121l(this.f73021m * ((float) Math.pow((double) f, 1.5d)));
    }

    /* renamed from: g */
    public final void mo32116g() {
        m49585w(this.f73008aj, new C26813x(this));
    }

    /* renamed from: h */
    public final void mo32117h() {
        m49585w(this.f73007ai, new C26796g(this));
    }

    /* renamed from: i */
    public final void mo32118i(boolean z) {
        m49585w(this.f73007ai, new C26807r(this, z));
    }

    /* renamed from: j */
    public final void mo32119j(PointF pointF) {
        m49585w(this.f73007ai, new C26798i(this, pointF));
    }

    /* renamed from: k */
    public final void mo32120k(boolean z) {
        m49585w(this.f73007ai, new C26795f(this, z));
    }

    /* renamed from: l */
    public final void mo32121l(float f) {
        m49585w(this.f73008aj, new C26800k(this, f));
    }

    /* renamed from: m */
    public final void mo32122m(boolean z) {
        m49585w(this.f73007ai, new C26810u(this, z));
    }

    /* renamed from: n */
    public final void mo32123n() {
        m49585w(this.f73007ai, new C26799j(this));
    }

    /* renamed from: o */
    public final void mo32124o() {
        m49585w(this.f73007ai, new C26794e(this));
    }

    /* renamed from: p */
    public final boolean mo32125p() {
        return this.f73014f;
    }

    /* renamed from: q */
    public final void mo32126q(C27321bk bkVar) {
        m49585w(this.f73007ai, new C26809t(this, bkVar));
    }

    /* renamed from: r */
    public final Size mo32149r(Size size, Size size2) {
        double d;
        if (Math.abs(m49584B() - this.f73006ah.mo33218a().mo33214a()) % 180 == 0) {
            double width = (double) size2.getWidth();
            double width2 = (double) size.getWidth();
            Double.isNaN(width);
            Double.isNaN(width2);
            double d2 = width / width2;
            double height = (double) size2.getHeight();
            double height2 = (double) size.getHeight();
            Double.isNaN(height);
            Double.isNaN(height2);
            d = Math.min(d2, height / height2);
        } else {
            double height3 = (double) size2.getHeight();
            double width3 = (double) size.getWidth();
            Double.isNaN(height3);
            Double.isNaN(width3);
            double d3 = height3 / width3;
            double width4 = (double) size2.getWidth();
            double height4 = (double) size.getHeight();
            Double.isNaN(width4);
            Double.isNaN(height4);
            d = Math.min(d3, width4 / height4);
        }
        int width5 = size.getWidth();
        int height5 = size.getHeight();
        if (d < 1.0d) {
            double width6 = (double) size.getWidth();
            Double.isNaN(width6);
            width5 = (int) (width6 * d);
            double height6 = (double) size.getHeight();
            Double.isNaN(height6);
            height5 = (int) (height6 * d);
        }
        int i = width5 % 32;
        if (i > 16) {
            i -= 32;
        }
        if (i != 0) {
            int i2 = width5 - i;
            double d4 = (double) i2;
            double d5 = (double) height5;
            double d6 = (double) width5;
            Double.isNaN(d5);
            Double.isNaN(d6);
            Double.isNaN(d4);
            height5 = (int) Math.round(d4 * (d5 / d6));
            width5 = i2;
        }
        return new Size(width5, height5);
    }

    /* renamed from: s */
    public final void mo32150s(boolean z) {
        ((C58970a) ((C58970a) f72971a.mo56224b()).mo56372aa(49173)).mo56359L("***** Connecting to preview surface %sx%s %s", Integer.valueOf(this.f73019k), Integer.valueOf(this.f73020l), BuildConfig.FLAVOR);
        if (this.f73022n != null) {
            C26749ar arVar = this.f73018j;
            if (arVar != null) {
                C26748aq[] aqVarArr = arVar.f72877a;
                int length = aqVarArr.length;
                int i = 0;
                while (i < length) {
                    if (aqVarArr[i].f72875c.isValid()) {
                        i++;
                    }
                }
                C26763o oVar = this.f73022n;
                oVar.getClass();
                Size c = oVar.mo32098c();
                Size r = mo32149r(new Size(this.f73019k, this.f73020l), c);
                this.f72985M = r;
                C26752d dVar = this.f73004af;
                int width = r.getWidth();
                int height = r.getHeight();
                int i2 = 200;
                if (width == 0 || height == 0) {
                    height = 320;
                } else {
                    long j = ((long) width) * ((long) height);
                    if (j <= 140000) {
                        i2 = width;
                    } else {
                        float f = (float) width;
                        float f2 = (float) height;
                        float min = (float) Math.min(140000, j);
                        i2 = (int) Math.sqrt((double) ((f / f2) * min));
                        height = (int) Math.sqrt((double) ((f2 / f) * min));
                    }
                }
                Size size = new Size(i2, height);
                float f3 = ((float) width) / ((float) i2);
                if (f3 < 1.0f) {
                    ((C58970a) ((C58970a) C26752d.f72880a.mo56225c()).mo56372aa(49149)).mo56359L("***** calculateDownsampleFactor Unexpected %f (%d / %d) FILE A BUG!", Float.valueOf(f3), Integer.valueOf(width), Integer.valueOf(i2));
                    f3 = 1.0f;
                }
                dVar.f72881b = new C26751c(size, f3);
                C25655p pVar = dVar.f72882c;
                if (pVar != null) {
                    C25664y yVar = pVar.f69775a;
                    Size size2 = yVar.f69794j.f72881b.f72878a;
                    C58485gu f4 = yVar.mo30772f();
                    int size3 = f4.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        C26504ci ciVar = (C26504ci) f4.get(i3);
                        C28179u uVar = ciVar.f72215i;
                        Size size4 = ciVar.f72218l;
                        float width2 = ((float) size2.getWidth()) / ((float) size4.getWidth());
                        float height2 = ((float) size2.getHeight()) / ((float) size4.getHeight());
                        C28178t k = uVar.mo33668k();
                        k.mo33652p(uVar.mo33662f() * width2);
                        k.mo33653q(uVar.mo33663g() * height2);
                        k.mo33647k(uVar.mo33659d() * width2);
                        k.mo33648l(uVar.mo33660e() * height2);
                        C28179u r2 = k.mo33696r();
                        ciVar.f72218l = size2;
                        C25332h hVar = (C25332h) C25333i.f68945c.createBuilder();
                        int width3 = size2.getWidth();
                        hVar.copyOnWrite();
                        ((C25333i) hVar.instance).f68947a = width3;
                        int height3 = size2.getHeight();
                        hVar.copyOnWrite();
                        ((C25333i) hVar.instance).f68948b = height3;
                        ciVar.f72219m = (C25333i) hVar.build();
                        ciVar.mo31762f(r2);
                    }
                }
                Size size5 = this.f73004af.f72881b.f72878a;
                this.f72976D.mo32195j(size5);
                this.f73005ag.mo31945j(size5);
                this.f72977E.f73048e = size5;
                C27321bk bkVar = this.f72999aa;
                if (bkVar != null) {
                    C60888db dbVar = this.f73001ac;
                    Objects.requireNonNull(bkVar);
                    m49585w(dbVar, new C26802m(bkVar));
                }
                C26749ar arVar2 = this.f73018j;
                arVar2.getClass();
                Size size6 = new Size(this.f73019k, this.f73020l);
                C26814y yVar2 = new C26814y(this, c);
                for (C26748aq aqVar : arVar2.f72877a) {
                    aqVar.f72873a = size6;
                    aqVar.f72874b = yVar2;
                    aqVar.mo32080a();
                }
                if (z || this.f73017i == null) {
                    synchronized (this.f73016h) {
                        C26878u uVar2 = this.f73017i;
                        if (uVar2 != null) {
                            uVar2.mo32245b();
                            this.f73017i = null;
                        }
                    }
                    if (this.f72993U == 0) {
                        this.f72993U = this.f72990R.mo26873e() - this.f72991S;
                    }
                    C26751c cVar = this.f73004af.f72881b;
                    C26879v vVar = this.f73003ae;
                    C26783ah ahVar = new C26783ah(this);
                    C26763o oVar2 = this.f73022n;
                    oVar2.getClass();
                    C26747ap f5 = oVar2.mo32102f();
                    C26749ar arVar3 = this.f73018j;
                    arVar3.getClass();
                    Surface[] a = arVar3.mo32081a();
                    Size size7 = this.f72985M;
                    size7.getClass();
                    C27730g a2 = this.f73006ah.mo33218a();
                    int B = m49584B();
                    C26763o oVar3 = this.f73022n;
                    oVar3.getClass();
                    Context context = (Context) vVar.f73265a.mo17428b();
                    Context context2 = context;
                    context.getClass();
                    C25799b bVar = (C25799b) vVar.f73266b.mo17428b();
                    C25799b bVar2 = bVar;
                    bVar.getClass();
                    C26764p pVar2 = (C26764p) vVar.f73267c.mo17428b();
                    C26764p pVar3 = pVar2;
                    pVar2.getClass();
                    Executor executor = (Executor) vVar.f73268d.mo17428b();
                    Executor executor2 = executor;
                    executor.getClass();
                    C27781bq bqVar = (C27781bq) vVar.f73269e.mo17428b();
                    C27781bq bqVar2 = bqVar;
                    bqVar.getClass();
                    C58833ax axVar = (C58833ax) vVar.f73270f.mo17428b();
                    C58833ax axVar2 = axVar;
                    axVar.getClass();
                    C69464a aVar = vVar.f73271g;
                    C27456i iVar = (C27456i) vVar.f73272h.mo17428b();
                    C27456i iVar2 = iVar;
                    iVar.getClass();
                    C26856c cVar2 = (C26856c) vVar.f73273i.mo17428b();
                    C26856c cVar3 = cVar2;
                    cVar2.getClass();
                    C26851ag agVar = (C26851ag) vVar.f73274j.mo17428b();
                    C26851ag agVar2 = agVar;
                    agVar.getClass();
                    C26881x xVar = (C26881x) vVar.f73275k.mo17428b();
                    C26881x xVar2 = xVar;
                    xVar.getClass();
                    C26850af afVar = (C26850af) vVar.f73276l.mo17428b();
                    C26850af afVar2 = afVar;
                    afVar.getClass();
                    Executor executor3 = (Executor) vVar.f73277m.mo17428b();
                    Executor executor4 = executor3;
                    executor3.getClass();
                    C25626ai aiVar = (C25626ai) vVar.f73278n.mo17428b();
                    C25626ai aiVar2 = aiVar;
                    aiVar.getClass();
                    C47770dh dhVar = (C47770dh) vVar.f73279o.mo17428b();
                    C47770dh dhVar2 = dhVar;
                    dhVar.getClass();
                    Boolean bool = (Boolean) vVar.f73280p.mo17428b();
                    bool.getClass();
                    boolean booleanValue = bool.booleanValue();
                    Boolean bool2 = (Boolean) vVar.f73281q.mo17428b();
                    bool2.getClass();
                    boolean booleanValue2 = bool2.booleanValue();
                    Boolean bool3 = (Boolean) vVar.f73282r.mo17428b();
                    bool3.getClass();
                    boolean booleanValue3 = bool3.booleanValue();
                    cVar.getClass();
                    f5.getClass();
                    c.getClass();
                    C26878u uVar3 = new C26878u(context2, bVar2, pVar3, executor2, bqVar2, axVar2, aVar, iVar2, cVar3, agVar2, xVar2, afVar2, executor4, aiVar2, dhVar2, booleanValue, booleanValue2, booleanValue3, ahVar, cVar, f5, a, c, size7, a2, B, oVar3.mo32100e(), this.f73013e);
                    this.f73017i = uVar3;
                    uVar3.mo32249f(this.f73014f);
                    C26878u uVar4 = this.f73017i;
                    uVar4.getClass();
                    boolean h = uVar4.f73226O.mo56113h();
                    this.f72986N = h;
                    this.f72976D.mo32191f(h);
                    this.f73021m = 1.0f;
                    C26878u uVar5 = this.f73017i;
                    uVar5.getClass();
                    C28174p pVar4 = uVar5.f73228Q;
                    m49585w(this.f72980H, new C26791b(this, pVar4));
                    C26878u uVar6 = this.f73017i;
                    uVar6.getClass();
                    C26779ad adVar = new C26779ad(this, uVar6, c, cVar, pVar4);
                    uVar6.f73258t.getWidth();
                    uVar6.f73258t.getHeight();
                    if (uVar6.f73260v.mo56113h()) {
                        ((C25579c) uVar6.f73260v.mo56107c()).mo30668h(new C26865h(uVar6));
                        ((C25579c) uVar6.f73260v.mo56107c()).mo30664d();
                    } else {
                        int length2 = uVar6.f73259u.length;
                        C58838bb.m90885t(length2 == 1, "SyncRendering not enabled and outputSurfaces.length = %s", length2);
                    }
                    for (Surface isValid : uVar6.f73259u) {
                        C58838bb.m90883r(isValid.isValid());
                    }
                    C58838bb.m90883r(!uVar6.f73264z);
                    uVar6.f73223L = false;
                    uVar6.f73264z = true;
                    C60856cj.m92911t(C60856cj.m92903l(C47810es.m84977q(new C26866i(uVar6)), uVar6.f73252n), C47810es.m84974n(new C26868k(uVar6, adVar)), uVar6.f73229R);
                    return;
                }
                return;
            }
            this.f73018j = null;
        }
    }

    /* renamed from: t */
    public final void mo32151t() {
        C26733ab abVar;
        synchronized (this.f73016h) {
            C26878u uVar = this.f73017i;
            if (!(uVar == null || !uVar.f73242d.get() || (abVar = this.f72987O) == null)) {
                C26878u uVar2 = this.f73017i;
                if (uVar2.f73241c.get()) {
                    ((C58970a) ((C58970a) C26878u.f73209a.mo56224b()).mo56372aa(49240)).mo56386p("Imaging pipeline disposed, ignoring new camera frame callback.");
                } else {
                    uVar2.f73263y = new C26871n(uVar2, abVar);
                    uVar2.f73252n.execute(uVar2.f73263y);
                }
                this.f72987O = null;
            }
        }
    }

    /* renamed from: u */
    public final void mo32152u() {
        C27321bk bkVar = this.f72999aa;
        if (bkVar != null) {
            bkVar.f74748a.f74779Y.execute(C47810es.m84977q(new C27319bi(bkVar)));
        }
    }

    /* renamed from: v */
    public final void mo32153v(C26763o oVar) {
        m49585w(this.f72981I, new C26801l(this, oVar));
    }

    /* renamed from: x */
    public final void mo32154x(Consumer consumer) {
        if (this.f72984L != null) {
            m49585w(this.f73002ad, new C26804o(this, consumer));
        }
    }

    /* renamed from: y */
    public final void mo32155y() {
        C26821c cVar = this.f72976D;
        boolean z = false;
        if (!this.f73014f && this.f72988P.get() && this.f73010al.get() && this.f73015g) {
            z = true;
        }
        cVar.mo32192g(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo32156z(boolean z) {
        m49585w(this.f73008aj, new C26792c(this, z));
    }
}
