package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90052dd;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109458d;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123810aa;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131650d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.C36205aa;
import com.google.android.libraries.search.assistant.proactive.C36208ad;
import com.google.android.libraries.search.assistant.proactive.C36221aq;
import com.google.android.libraries.search.assistant.proactive.C36323j;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36281b;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4537i.C59294s;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4985f.p5036r.C65313a;
import com.google.protos.p4985f.p5036r.C65316b;
import com.google.protos.p4985f.p5036r.C65317c;
import dagger.C68214a;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.db */
/* compiled from: PG */
public final class C114464db {

    /* renamed from: a */
    public static final C59071e f317374a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.db");

    /* renamed from: A */
    public final C39141kp f317375A;

    /* renamed from: B */
    public final C131650d f317376B;

    /* renamed from: C */
    public final C68214a f317377C;

    /* renamed from: D */
    public final C46578l f317378D;

    /* renamed from: E */
    public final C36205aa f317379E;

    /* renamed from: F */
    private final C68214a f317380F;

    /* renamed from: b */
    public final Context f317381b;

    /* renamed from: c */
    public final C36221aq f317382c;

    /* renamed from: d */
    public final C22871g f317383d;

    /* renamed from: e */
    public final Executor f317384e;

    /* renamed from: f */
    public final C114388aj f317385f;

    /* renamed from: g */
    public final C36323j f317386g;

    /* renamed from: h */
    public final C36337r f317387h;

    /* renamed from: i */
    public final C114421bm f317388i;

    /* renamed from: j */
    public final C86054o f317389j;

    /* renamed from: k */
    public final C58833ax f317390k;

    /* renamed from: l */
    public final C21370a f317391l;

    /* renamed from: m */
    public final C114396ar f317392m;

    /* renamed from: n */
    public final C86124t f317393n;

    /* renamed from: o */
    public final C68214a f317394o;

    /* renamed from: p */
    public final C68214a f317395p;

    /* renamed from: q */
    public final C68214a f317396q;

    /* renamed from: r */
    public final C68214a f317397r;

    /* renamed from: s */
    public final C68214a f317398s;

    /* renamed from: t */
    public final C114418bj f317399t;

    /* renamed from: u */
    public final C68214a f317400u;

    /* renamed from: v */
    public final C36208ad f317401v;

    /* renamed from: w */
    public final C36314g f317402w;

    /* renamed from: x */
    public final C85299b f317403x;

    /* renamed from: y */
    public final C123810aa f317404y;

    /* renamed from: z */
    public final C86034c f317405z;

    public C114464db(Context context, C22871g gVar, Executor executor, C36221aq aqVar, C114388aj ajVar, C36323j jVar, C36337r rVar, C114421bm bmVar, C86054o oVar, C58833ax axVar, C21370a aVar, C114396ar arVar, C86124t tVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C114418bj bjVar, C68214a aVar7, C68214a aVar8, C36208ad adVar, C36314g gVar2, C85299b bVar, C123810aa aaVar, C86034c cVar, C39141kp kpVar, C131650d dVar, C68214a aVar9, C36205aa aaVar2, C46578l lVar) {
        this.f317381b = context;
        this.f317383d = gVar;
        this.f317384e = executor;
        this.f317382c = aqVar;
        this.f317385f = ajVar;
        this.f317386g = jVar;
        this.f317387h = rVar;
        this.f317388i = bmVar;
        this.f317389j = oVar;
        this.f317390k = axVar;
        this.f317391l = aVar;
        this.f317392m = arVar;
        this.f317393n = tVar;
        this.f317394o = aVar2;
        this.f317395p = aVar3;
        this.f317396q = aVar4;
        this.f317397r = aVar5;
        this.f317399t = bjVar;
        this.f317380F = aVar7;
        this.f317400u = aVar8;
        this.f317401v = adVar;
        this.f317402w = gVar2;
        this.f317403x = bVar;
        this.f317404y = aaVar;
        this.f317405z = cVar;
        this.f317398s = aVar6;
        this.f317375A = kpVar;
        this.f317376B = dVar;
        this.f317377C = aVar9;
        this.f317379E = aaVar2;
        this.f317378D = lVar;
    }

    /* renamed from: a */
    public static int m189728a(String str) {
        return C59294s.m92134d().mo56759a(str, Charset.forName("UTF-8")).mo56771a();
    }

    /* renamed from: g */
    public static C60870cx m189729g(aas aas, C84373s sVar) {
        C60870cx a = sVar.mo77931a().mo77919a(C109458d.m182154b(aas.f134669g.mo59174N()));
        C114448cm cmVar = C114448cm.f317337a;
        return C60922j.m93044g(a, C47810es.m84963c(cmVar), C60826bg.f164896a);
    }

    /* renamed from: l */
    public static boolean m189730l(C65317c cVar) {
        int c = C65316b.m96666c(cVar.f176652a);
        return c != 0 && c == 390;
    }

    /* renamed from: m */
    public static boolean m189731m(C65317c cVar) {
        int c = C65316b.m96666c(cVar.f176652a);
        return c != 0 && c == 394;
    }

    /* renamed from: b */
    public final C60870cx mo101325b(aas aas) {
        if ((aas.f134663a & 4) != 0 && aas.f134666d <= this.f317391l.mo26870b()) {
            return C60856cj.m92900i(C51962fo.EXPIRED);
        }
        C114421bm bmVar = this.f317388i;
        C58976aa aaVar = C58975e.f156826a;
        boolean z = false;
        if (bmVar.f317271d.u() && bmVar.f317271d.w()) {
            z = true;
        }
        C60870cx i = C60856cj.m92900i(Boolean.valueOf(z));
        C114420bl blVar = new C114420bl(bmVar, aas);
        return C60922j.m93044g(i, C47810es.m84963c(blVar), bmVar.f317272e);
    }

    /* renamed from: c */
    public final C60870cx mo101326c(aas aas) {
        Object obj;
        C60870cx cxVar;
        C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r0);
        if (!aas.f169962ag.mo58857o(r0.f169971d)) {
            return C60856cj.m92899h(new C114463da(C51962fo.INVALID_NOTIFICATION_ARGS));
        }
        C62940bt r02 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r02);
        Object l = aas.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        abc abc = (abc) obj;
        if ((abc.f134694a & 2) == 0) {
            return C60856cj.m92899h(new C114463da(C51962fo.INVALID_NOTIFICATION_ARGS));
        }
        C60870cx d = this.f317387h.mo40117d(abc);
        int i = abc.f134700g;
        if (i == 0) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = this.f317387h.mo40118e(i);
        }
        return C47638k.m84753d(d, cxVar).mo51520a(new C114441cf(this, d, cxVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo101327d(aas aas) {
        C58976aa aaVar = C58975e.f156826a;
        return C60922j.m93044g(C60838bs.m92859i(this.f317392m.mo101312b(aas)), new C114425bq(this, aas), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo101328e(C60870cx cxVar, aas aas, ajy ajy) {
        return C60846c.m92878g(C60846c.m92878g(C60838bs.m92859i(cxVar), C114463da.class, new C114445cj(this, aas, ajy), C60826bg.f164896a), Throwable.class, new C114447cl(this, aas, ajy), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo101329f(byte[] bArr) {
        return this.f317383d.mo28201a("convertNotificationArgs", new C114437cb(bArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ee, code lost:
        if (r11.f123938a == 2) goto L_0x00f0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo101330h(com.google.assistant.p3897e.p3921j.aas r20, com.google.android.libraries.search.assistant.proactive.C36334o r21, com.google.common.p4552o.ajy r22) {
        /*
            r19 = this;
            r7 = r19
            r2 = r20
            r4 = r21
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r1 = r2.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r3)
            if (r1 != 0) goto L_0x001e
            java.lang.Object r0 = r0.f169969b
            goto L_0x0022
        L_0x001e:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x0022:
            r6 = r0
            com.google.assistant.e.j.abc r6 = (com.google.assistant.p3897e.p3921j.abc) r6
            java.lang.String r0 = r6.f134704k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0056
            dagger.a r0 = r7.f317380F
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0056
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = r7.f317389j
            android.accounts.Account r0 = r0.mo79668a()
            if (r0 == 0) goto L_0x0056
            dagger.a r1 = r7.f317380F
            java.lang.Object r1 = r1.mo27525b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.search.assistant.proactive.surveys.i r1 = (com.google.android.libraries.search.assistant.proactive.surveys.C36348i) r1
            java.lang.String r3 = r6.f134704k
            r1.mo40130b(r0, r3)
        L_0x0056:
            java.lang.String r0 = r2.f134670h
            int r5 = m189728a(r0)
            int r0 = r2.f134663a
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L_0x007e
            long r8 = r2.f134666d
            com.google.android.libraries.f.a r0 = r7.f317391l
            long r10 = r0.mo26870b()
            long r8 = r8 - r10
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            goto L_0x007e
        L_0x0072:
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.da r0 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.da
            com.google.assistant.e.j.e.fo r1 = com.google.assistant.p3897e.p3921j.p3926e.C51962fo.EXPIRED
            r0.<init>(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r0
        L_0x007e:
            int r0 = r6.f134697d
            int r3 = com.google.assistant.p3897e.p3921j.aaz.m86272a(r0)
            if (r3 != 0) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            if (r3 != r1) goto L_0x0090
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0090:
            int r0 = com.google.assistant.p3897e.p3921j.aaz.m86272a(r0)
            r3 = 3
            if (r0 != 0) goto L_0x0098
            goto L_0x00a1
        L_0x0098:
            if (r0 != r3) goto L_0x00a1
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x00a1:
            com.google.android.libraries.search.assistant.proactive.aa r0 = r7.f317379E
            boolean r0 = r0.f94590h
            r8 = 5
            r9 = 2
            if (r0 == 0) goto L_0x00af
            com.google.android.libraries.search.assistant.proactive.j r0 = r7.f317386g
            r0.mo40103a(r2)
            goto L_0x0113
        L_0x00af:
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aj r0 = r7.f317385f
            com.google.protobuf.bt r10 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r2.mo58887l(r10)
            com.google.protobuf.bf r11 = r2.f169962ag
            com.google.protobuf.bs r12 = r10.f169971d
            java.lang.Object r11 = r11.mo58854l(r12)
            if (r11 != 0) goto L_0x00c7
            java.lang.Object r10 = r10.f169969b
            goto L_0x00cb
        L_0x00c7:
            java.lang.Object r10 = r10.mo58889c(r11)
        L_0x00cb:
            com.google.assistant.e.j.abc r10 = (com.google.assistant.p3897e.p3921j.abc) r10
            int r11 = r10.f134694a
            r11 = r11 & r9
            if (r11 == 0) goto L_0x02ce
            com.google.aq.a.a.u r10 = r10.f134698e
            if (r10 != 0) goto L_0x00d8
            com.google.aq.a.a.u r10 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x00d8:
            com.google.aq.a.a.b r11 = r10.f123984g
            if (r11 != 0) goto L_0x00de
            com.google.aq.a.a.b r11 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00de:
            com.google.protobuf.cq r11 = r11.f123940c
            int r11 = r11.size()
            if (r11 > 0) goto L_0x00f0
            com.google.aq.a.a.b r11 = r10.f123984g
            if (r11 != 0) goto L_0x00ec
            com.google.aq.a.a.b r11 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00ec:
            int r11 = r11.f123938a
            if (r11 != r9) goto L_0x00fc
        L_0x00f0:
            com.google.aq.a.a.b r11 = r10.f123984g
            if (r11 != 0) goto L_0x00f6
            com.google.aq.a.a.b r11 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00f6:
            android.content.Intent r0 = r0.mo101308a(r11)
            if (r0 == 0) goto L_0x02c6
        L_0x00fc:
            int r0 = r10.f123985h
            int r0 = com.google.p3717aq.p3718a.p3719a.C47871e.m85088a(r0)
            if (r0 == 0) goto L_0x0113
            if (r0 != r8) goto L_0x0113
            com.google.aq.a.a.r r0 = r10.f123988k
            if (r0 == 0) goto L_0x010b
            goto L_0x0113
        L_0x010b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Requiring messaging style but missing data."
            r0.<init>(r1)
            throw r0
        L_0x0113:
            com.google.android.libraries.gsa.k.g r10 = r7.f317383d
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bj r0 = r7.f317399t
            java.lang.String r11 = r4.f94887a
            com.google.assistant.e.j.aap r12 = r2.f134676n
            if (r12 != 0) goto L_0x011f
            com.google.assistant.e.j.aap r12 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x011f:
            int r12 = r12.f134658g
            int r12 = com.google.assistant.p3897e.p3921j.aao.m86268a(r12)
            if (r12 != 0) goto L_0x0129
        L_0x0127:
            r12 = 0
            goto L_0x012c
        L_0x0129:
            if (r12 != r9) goto L_0x0127
            r12 = 1
        L_0x012c:
            com.google.common.o.ajw r14 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64606b(r20)
            boolean r15 = r0.mo101319d()
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.common.o.ajz r9 = (com.google.common.p4552o.ajz) r9
            com.google.common.o.ajz r17 = com.google.common.p4552o.ajz.f158928q
            int r13 = r9.f158932a
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r9.f158932a = r13
            r9.f158945n = r15
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.common.o.ajz r9 = (com.google.common.p4552o.ajz) r9
            r13 = r22
            int r15 = r13.f158927f
            r9.f158939h = r15
            int r15 = r9.f158932a
            r15 = r15 | 64
            r9.f158932a = r15
            com.google.android.libraries.search.assistant.proactive.aq r9 = r0.f317256b
            boolean r9 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64610f(r9, r5)
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.common.o.ajz r15 = (com.google.common.p4552o.ajz) r15
            int r3 = r15.f158932a
            r1 = r1 | r3
            r15.f158932a = r1
            r15.f158935d = r9
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.common.o.ajz r1 = (com.google.common.p4552o.ajz) r1
            r11.getClass()
            int r3 = r1.f158932a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r1.f158932a = r3
            r1.f158944m = r11
            com.google.protos.f.r.i r1 = r2.f134681s
            if (r1 != 0) goto L_0x0184
            com.google.protos.f.r.i r1 = com.google.protos.p4985f.p5036r.C65323i.f176655c
        L_0x0184:
            int r1 = r1.f176657a
            if (r1 <= 0) goto L_0x01a0
            com.google.protos.f.r.i r1 = r2.f134681s
            if (r1 != 0) goto L_0x018e
            com.google.protos.f.r.i r1 = com.google.protos.p4985f.p5036r.C65323i.f176655c
        L_0x018e:
            int r1 = r1.f176657a
            r14.copyOnWrite()
            com.google.protobuf.bv r3 = r14.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            int r9 = r3.f158932a
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r3.f158932a = r9
            r3.f158947p = r1
            goto L_0x01c1
        L_0x01a0:
            com.google.protos.f.r.i r1 = r2.f134681s
            if (r1 != 0) goto L_0x01a7
            com.google.protos.f.r.i r3 = com.google.protos.p4985f.p5036r.C65323i.f176655c
            goto L_0x01a8
        L_0x01a7:
            r3 = r1
        L_0x01a8:
            int r3 = r3.f176658b
            if (r3 <= 0) goto L_0x01c1
            if (r1 != 0) goto L_0x01b0
            com.google.protos.f.r.i r1 = com.google.protos.p4985f.p5036r.C65323i.f176655c
        L_0x01b0:
            int r1 = r1.f176658b
            r14.copyOnWrite()
            com.google.protobuf.bv r3 = r14.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            int r9 = r3.f158932a
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r3.f158932a = r9
            r3.f158947p = r1
        L_0x01c1:
            com.google.protobuf.bv r1 = r14.build()
            com.google.common.o.ajz r1 = (com.google.common.p4552o.ajz) r1
            com.google.android.libraries.search.assistant.proactive.aa r3 = r0.f317263i
            boolean r3 = r3.f94583a
            if (r3 == 0) goto L_0x01ed
            if (r12 == 0) goto L_0x01d6
            com.google.apps.tiktok.account.data.c.e r3 = r0.f317259e
            com.google.common.util.concurrent.cx r3 = r3.mo50254a()
            goto L_0x01dc
        L_0x01d6:
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r3 = r0.f317257c
            com.google.common.util.concurrent.cx r3 = r3.mo79697b()
        L_0x01dc:
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bd r8 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bd
            r8.<init>(r0, r2, r1)
            java.util.concurrent.Executor r0 = r0.f317260f
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r8)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r3, r1, r0)
            goto L_0x02a2
        L_0x01ed:
            boolean r0 = r2.f134677o
            com.google.protobuf.bt r3 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r9 = r2.f169962ag
            com.google.protobuf.bs r11 = r3.f169971d
            java.lang.Object r9 = r9.mo58854l(r11)
            if (r9 != 0) goto L_0x0205
            java.lang.Object r3 = r3.f169969b
            goto L_0x0209
        L_0x0205:
            java.lang.Object r3 = r3.mo58889c(r9)
        L_0x0209:
            com.google.assistant.e.j.abc r3 = (com.google.assistant.p3897e.p3921j.abc) r3
            com.google.aq.a.a.u r3 = r3.f134698e
            if (r3 != 0) goto L_0x0211
            com.google.aq.a.a.u r3 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0211:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.android.libraries.logging.j r11 = new com.google.android.libraries.logging.j
            r14 = 46142(0xb43e, float:6.4659E-41)
            r11.<init>(r14)
            r11.mo33795i(r8)
            r14 = 22
            r11.mo33795i(r14)
            if (r0 == 0) goto L_0x022c
            r14 = 3
            r11.mo33794h(r14)
        L_0x022c:
            r14 = 0
            com.google.android.libraries.logging.k[] r15 = new com.google.android.libraries.logging.C28293k[r14]
            com.google.android.libraries.logging.k r11 = com.google.android.libraries.logging.C28293k.m52908e(r11, r15)
            r9.add(r11)
            r14 = 0
        L_0x0237:
            com.google.protobuf.cq r11 = r3.f123986i
            int r11 = r11.size()
            if (r14 >= r11) goto L_0x027f
            com.google.protobuf.cq r11 = r3.f123986i
            java.lang.Object r11 = r11.get(r14)
            com.google.aq.a.a.i r11 = (com.google.p3717aq.p3718a.p3719a.C47875i) r11
            com.google.android.libraries.logging.j r15 = new com.google.android.libraries.logging.j
            int r11 = r11.f123952f
            if (r11 != 0) goto L_0x0250
            r11 = 46143(0xb43f, float:6.466E-41)
        L_0x0250:
            r15.<init>(r11)
            r15.mo33795i(r8)
            com.google.common.o.aqp r11 = r15.f76974b
            r11.copyOnWrite()
            com.google.protobuf.bv r11 = r11.instance
            com.google.common.o.aqs r11 = (com.google.common.p4552o.aqs) r11
            com.google.common.o.aqs r18 = com.google.common.p4552o.aqs.f159780k
            int r8 = r11.f159782a
            r16 = 2
            r8 = r8 | 2
            r11.f159782a = r8
            r11.f159784c = r14
            if (r0 == 0) goto L_0x0271
            r8 = 3
            r15.mo33794h(r8)
        L_0x0271:
            r8 = 0
            com.google.android.libraries.logging.k[] r11 = new com.google.android.libraries.logging.C28293k[r8]
            com.google.android.libraries.logging.k r11 = com.google.android.libraries.logging.C28293k.m52908e(r15, r11)
            r9.add(r11)
            int r14 = r14 + 1
            r8 = 5
            goto L_0x0237
        L_0x027f:
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r8 = 47411(0xb933, float:6.6437E-41)
            r3.<init>(r8)
            if (r0 == 0) goto L_0x028d
            r0 = 3
            r3.mo33794h(r0)
        L_0x028d:
            com.google.android.libraries.logging.k r0 = com.google.android.libraries.logging.C28293k.m52907d(r3, r9)
            com.google.common.o.oe r3 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64611g(r8, r0, r2)
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114418bj.m189711c(r3, r1, r12)
            com.google.android.libraries.search.assistant.proactive.a r3 = new com.google.android.libraries.search.assistant.proactive.a
            r8 = 0
            r3.<init>(r0, r8, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
        L_0x02a2:
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.by r1 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.by
            r1.<init>(r7, r5, r2, r4)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r1)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r3)
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ca r9 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ca
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "Show notification"
            com.google.common.util.concurrent.cx r0 = r10.mo28209i(r8, r0, r9)
            return r0
        L_0x02c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unable to resolve intent for content."
            r0.<init>(r1)
            throw r0
        L_0x02ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to render notification without preview."
            r0.<init>(r1)
            goto L_0x02d7
        L_0x02d6:
            throw r0
        L_0x02d7:
            goto L_0x02d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.mo101330h(com.google.assistant.e.j.aas, com.google.android.libraries.search.assistant.proactive.o, com.google.common.o.ajy):com.google.common.util.concurrent.cx");
    }

    /* renamed from: i */
    public final C60870cx mo101331i(aas aas, ajy ajy) {
        if (!this.f317388i.mo101321a(aas)) {
            return C60856cj.m92899h(new C114463da(C51962fo.NOT_TARGETING_THIS_DEVICE));
        }
        ((C36281b) this.f317397r.mo27525b()).mo40091c(aas);
        C60870cx b = mo101325b(aas);
        C114440ce ceVar = new C114440ce(this, aas, ajy);
        return C60922j.m93045h(b, C47810es.m84966f(ceVar), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final void mo101332j(aas aas) {
        aap aap = aas.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        if ((aap.f134652a & 4) != 0) {
            aap aap2 = aas.f134676n;
            if (aap2 == null) {
                aap2 = aap.f134650h;
            }
            int i = aap2.f134655d;
            C65313a aVar = (C65313a) C65317c.f176650b.createBuilder();
            aVar.copyOnWrite();
            ((C65317c) aVar.instance).f176652a = i;
            C65317c cVar = (C65317c) aVar.build();
            C59071e eVar = f317374a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
            C59052c cVar2 = (C59052c) ((C59052c) b).mo56372aa(29058);
            int c = C65316b.m96666c(cVar.f176652a);
            if (c == 0) {
                c = 1;
            }
            cVar2.mo56389s("#maybeSendToSmartspaceToDismiss() AsyncInteractionType %s", C65316b.m96664a(c));
            if (m189730l(cVar)) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
                ((C59052c) ((C59052c) b2).mo56372aa(29060)).mo56386p("#maybeSendToSmartspaceToDismiss() Flight Landing Notification.");
                mo101333k(aas);
            } else if (m189731m(cVar)) {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
                ((C59052c) ((C59052c) b3).mo56372aa(29059)).mo56386p("#maybeSendToSmartspaceToDismiss() Hotel Notification.");
                mo101333k(aas);
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        String str = aas.f134671i;
        int a = m189728a(aas.f134670h);
        if (C58837ba.m90859h(str)) {
            StatusBarNotification[] j = this.f317382c.mo40038j();
            if (j != null) {
                int length = j.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StatusBarNotification statusBarNotification = j[i2];
                    if (statusBarNotification.getId() == a) {
                        str = statusBarNotification.getNotification().getGroup();
                        break;
                    }
                    i2++;
                }
            }
            str = null;
        }
        this.f317382c.mo40034f(a, str);
    }

    /* renamed from: k */
    public final void mo101333k(aas aas) {
        C60870cx b = this.f317405z.mo79697b();
        C114442cg cgVar = new C114442cg(this, aas);
        C60922j.m93045h(b, C47810es.m84966f(cgVar), C60826bg.f164896a);
    }

    /* renamed from: n */
    public final boolean mo101334n() {
        return this.f317393n.mo79746e(C90052dd.f248933d);
    }
}
