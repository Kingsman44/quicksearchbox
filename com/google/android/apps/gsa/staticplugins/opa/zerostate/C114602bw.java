package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83725a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88139qp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88141qr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88142qs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88144qu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110560t;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114547f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114759m;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8635i.C114773b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114799aw;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114865dh;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114879k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114880l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114885q;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114903ab;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115045cv;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115046cw;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3994s.p3995a.C53198f;
import com.google.assistant.p3994s.p3995a.C53200fb;
import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53321jo;
import com.google.assistant.p3994s.p3995a.C53323jq;
import com.google.assistant.p3994s.p3995a.C53337kd;
import com.google.assistant.p3994s.p3995a.C53338ke;
import com.google.assistant.p3994s.p3995a.C53340kg;
import com.google.assistant.p3994s.p3995a.C53345kl;
import com.google.assistant.p3994s.p3995a.C53346km;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53397mj;
import com.google.assistant.p3994s.p3995a.C53399ml;
import com.google.assistant.p3994s.p3995a.C53401mn;
import com.google.assistant.p3994s.p3995a.C53413mz;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p3994s.p3995a.C53428nn;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63204j;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.bw */
/* compiled from: PG */
public final class C114602bw implements C87682aj {

    /* renamed from: a */
    public static final C59071e f317838a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.bw");

    /* renamed from: A */
    private final C114903ab f317839A;

    /* renamed from: B */
    private final C114880l f317840B;

    /* renamed from: b */
    public final boolean f317841b;

    /* renamed from: c */
    public final C22871g f317842c;

    /* renamed from: d */
    public final C108013bm f317843d;

    /* renamed from: e */
    public final C86124t f317844e;

    /* renamed from: f */
    public final C22871g f317845f;

    /* renamed from: g */
    public final C107710u f317846g;

    /* renamed from: h */
    public final C107698i f317847h;

    /* renamed from: i */
    public final Object f317848i = new Object();

    /* renamed from: j */
    public final C22871g f317849j;

    /* renamed from: k */
    public final C53306j f317850k;

    /* renamed from: l */
    public final C114865dh f317851l;

    /* renamed from: m */
    public C114759m f317852m;

    /* renamed from: n */
    public C63204j f317853n;

    /* renamed from: o */
    SettableFuture f317854o = new SettableFuture();

    /* renamed from: p */
    public final C58881cr f317855p;

    /* renamed from: q */
    final AtomicBoolean f317856q = new AtomicBoolean(false);

    /* renamed from: r */
    final AtomicBoolean f317857r = new AtomicBoolean(false);

    /* renamed from: s */
    private final C114605bz f317858s;

    /* renamed from: t */
    private final C114547f f317859t;

    /* renamed from: u */
    private final SharedPreferences f317860u;

    /* renamed from: v */
    private final C21370a f317861v;

    /* renamed from: w */
    private final C86054o f317862w;

    /* renamed from: x */
    private final C68214a f317863x;

    /* renamed from: y */
    private final C58881cr f317864y;

    /* renamed from: z */
    private final C68214a f317865z;

    public C114602bw(C114605bz bzVar, C108013bm bmVar, C114547f fVar, C68214a aVar, C86124t tVar, C22871g gVar, C22871g gVar2, C22871g gVar3, SharedPreferences sharedPreferences, C21370a aVar2, C86054o oVar, C107710u uVar, C107698i iVar, C68214a aVar3, C110560t tVar2, C68214a aVar4, C114903ab abVar, C114880l lVar, C114865dh dhVar, boolean z, C53306j jVar) {
        C107710u uVar2 = uVar;
        this.f317858s = bzVar;
        this.f317843d = bmVar;
        this.f317859t = fVar;
        this.f317844e = tVar;
        C68214a aVar5 = aVar;
        this.f317855p = C58886cw.m90973a(new C114590bk(this, aVar));
        this.f317849j = gVar;
        this.f317845f = gVar2;
        this.f317842c = gVar3;
        this.f317860u = sharedPreferences;
        this.f317861v = aVar2;
        this.f317862w = oVar;
        this.f317846g = uVar2;
        this.f317847h = iVar;
        this.f317863x = aVar3;
        this.f317865z = aVar4;
        this.f317839A = abVar;
        this.f317840B = lVar;
        uVar2.mo96220c(this, C88244um.OPA_ZERO_STATE_RESPONSE, C88244um.OPA_ZERO_STATE_ASYNC_UPDATE_RESPONSE);
        this.f317864y = C58886cw.m90973a(new C114591bl(tVar2));
        this.f317851l = dhVar;
        this.f317841b = z;
        this.f317850k = jVar;
        this.f317853n = null;
    }

    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bu] */
    /* JADX WARNING: type inference failed for: r0v38, types: [com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m189961k(com.google.common.p4522b.C58480gp r10, com.google.assistant.p3994s.p3995a.C53428nn r11, java.util.List r12, com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e r13) {
        /*
            r9 = this;
            if (r12 == 0) goto L_0x0020
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bz r11 = r9.f317858s
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89842j(r12)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bi r11 = r11.f317901c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bh r11 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bh
            r12.getClass()
            r11.<init>(r12)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            com.google.common.base.bk r11 = (com.google.common.base.C58847bk) r11
            java.lang.Object r11 = r11.f156646a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r11 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r11
            r10.mo55395g(r11)
            return
        L_0x0020:
            if (r11 == 0) goto L_0x013d
            if (r13 == 0) goto L_0x013d
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bz r12 = r9.f317858s
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r11.f140217a
            r1 = 3
            if (r0 != r1) goto L_0x0032
            java.lang.Object r0 = r11.f140218b
            com.google.assistant.s.a.ln r0 = (com.google.assistant.p3994s.p3995a.C53374ln) r0
            goto L_0x0034
        L_0x0032:
            com.google.assistant.s.a.ln r0 = com.google.assistant.p3994s.p3995a.C53374ln.f140056e
        L_0x0034:
            int r0 = r0.f140058a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x004c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ay r12 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ay
            int r0 = r11.f140217a
            if (r0 != r1) goto L_0x0045
            java.lang.Object r11 = r11.f140218b
            com.google.assistant.s.a.ln r11 = (com.google.assistant.p3994s.p3995a.C53374ln) r11
            goto L_0x0047
        L_0x0045:
            com.google.assistant.s.a.ln r11 = com.google.assistant.p3994s.p3995a.C53374ln.f140056e
        L_0x0047:
            r12.<init>(r11, r13)
            goto L_0x010b
        L_0x004c:
            int r0 = r11.f140217a
            r1 = 1
            if (r0 != r1) goto L_0x0056
            java.lang.Object r0 = r11.f140218b
            com.google.assistant.s.a.lr r0 = (com.google.assistant.p3994s.p3995a.C53378lr) r0
            goto L_0x0058
        L_0x0056:
            com.google.assistant.s.a.lr r0 = com.google.assistant.p3994s.p3995a.C53378lr.f140068c
        L_0x0058:
            int r0 = r0.f140070a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00b1
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bg r12 = r12.f317900b
            int r0 = r11.f140217a
            if (r0 != r1) goto L_0x0068
            java.lang.Object r11 = r11.f140218b
            com.google.assistant.s.a.lr r11 = (com.google.assistant.p3994s.p3995a.C53378lr) r11
            goto L_0x006a
        L_0x0068:
            com.google.assistant.s.a.lr r11 = com.google.assistant.p3994s.p3995a.C53378lr.f140068c
        L_0x006a:
            r1 = r11
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bf r11 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bf
            r1.getClass()
            g.a.a r0 = r12.f319198a
            java.lang.Object r0 = r0.mo17428b()
            android.content.Context r0 = (android.content.Context) r0
            r0.getClass()
            g.a.a r0 = r12.f319199b
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.shared.y.au r0 = (com.google.android.apps.gsa.shared.p7195y.C91189au) r0
            r0.getClass()
            g.a.a r0 = r12.f319200c
            java.lang.Object r0 = r0.mo17428b()
            r3 = r0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.v r3 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114890v) r3
            r3.getClass()
            g.a.a r0 = r12.f319201d
            java.lang.Object r0 = r0.mo17428b()
            r4 = r0
            com.google.android.apps.gsa.assistant.shared.bm r4 = (com.google.android.apps.gsa.assistant.shared.bm) r4
            r4.getClass()
            g.a.a r12 = r12.f319202e
            dagger.a.l r12 = (dagger.p5294a.C68226l) r12
            g.a.a r12 = r12.f184585a
            dagger.a r5 = dagger.p5294a.C68219e.m98518a(r12)
            r5.getClass()
            r0 = r11
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x010a
        L_0x00b1:
            int r0 = r11.f140217a
            r1 = 9
            if (r0 != r1) goto L_0x0117
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bv r12 = r12.f317903e
            java.lang.Object r0 = r11.f140218b
            r6 = r0
            com.google.assistant.s.a.mn r6 = (com.google.assistant.p3994s.p3995a.C53401mn) r6
            java.lang.String r7 = r11.f140219c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bu r11 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bu
            g.a.a r0 = r12.f319259a
            java.lang.Object r0 = r0.mo17428b()
            r2 = r0
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r2
            r2.getClass()
            g.a.a r0 = r12.f319260b
            java.lang.Object r0 = r0.mo17428b()
            r3 = r0
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            r3.getClass()
            g.a.a r0 = r12.f319261c
            java.lang.Object r0 = r0.mo17428b()
            r4 = r0
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            r4.getClass()
            g.a.a r12 = r12.f319262d
            java.lang.Object r12 = r12.mo17428b()
            r5 = r12
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r1 = r11
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.google.common.b.gu r12 = r11.mo101819d()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x010a
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a
            goto L_0x012d
        L_0x010a:
            r12 = r11
        L_0x010b:
            java.lang.Class r11 = r12.getClass()
            r11.getSimpleName()
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x012d
        L_0x0117:
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.opa.zerostate.C114605bz.f317899a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "ZSSectionDataFactory"
            r12.mo56378ag(r13, r0)
            java.lang.String r13 = "No supported ZeroStateSectionData for ZeroStateSection: %s"
            r0 = 29225(0x7229, float:4.0953E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r0)).mo56389s(r13, r11)
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a
        L_0x012d:
            boolean r12 = r11.mo56113h()
            if (r12 == 0) goto L_0x013c
            java.lang.Object r11 = r11.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r11 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r11
            r10.mo55395g(r11)
        L_0x013c:
            return
        L_0x013d:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bz r11 = r9.f317858s
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bj r11 = r11.f317902d
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            com.google.common.base.bk r11 = (com.google.common.base.C58847bk) r11
            java.lang.Object r11 = r11.f156646a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r11 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r11
            r10.mo55395g(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.C114602bw.m189961k(com.google.common.b.gp, com.google.assistant.s.a.nn, java.util.List, com.google.android.apps.gsa.staticplugins.opa.zerostate.a.e):void");
    }

    /* renamed from: a */
    public final long mo101440a() {
        return this.f317861v.mo26870b() - this.f317860u.getLong(String.format("%s%s_%s_%s", new Object[]{"opa_zero_state_last_updated_time_millis_", this.f317862w.mo79659F(), ((bm) this.f317863x.mo27525b()).b(), this.f317850k.name()}), 0);
    }

    /* renamed from: b */
    public final C58485gu mo101441b(C53422nh nhVar, List list) {
        int i;
        C53397mj mjVar;
        C53413mz mzVar = nhVar.f140185b;
        if (mzVar == null) {
            mzVar = C53413mz.f140153b;
        }
        C62971cq<C53428nn> cqVar = mzVar.f140155a;
        C114547f fVar = this.f317859t;
        C53370lj ljVar = nhVar.f140188e;
        if (ljVar == null) {
            ljVar = C53370lj.f140047c;
        }
        C114546e a = fVar.mo101404a(ljVar, list);
        C53306j jVar = C53306j.UNKNOWNN;
        int ordinal = this.f317850k.ordinal();
        if (ordinal == 3) {
            C58480gp e = C58485gu.m89837e();
            for (C53428nn nnVar : cqVar) {
                int i2 = nnVar.f140217a;
                if (i2 == 3) {
                    m189961k(e, nnVar, (List) null, a);
                } else if (i2 == 9) {
                    C53401mn mnVar = (C53401mn) nnVar.f140218b;
                    if ((mnVar.f140128a & 8) != 0 && mnVar.f140132e == 51793) {
                        m189961k(e, nnVar, (List) null, a);
                    }
                } else if (i2 == 1) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C53354ku kuVar = (C53354ku) it.next();
                        if (C114874f.m190418r(kuVar)) {
                            C52282lz lzVar = kuVar.f140002b;
                            if (lzVar == null) {
                                lzVar = C52282lz.f137236h;
                            }
                            if (C114874f.m190413m(lzVar) && !C114874f.m190412l(kuVar)) {
                                m189961k(e, (C53428nn) null, list, (C114546e) null);
                                break;
                            }
                        }
                    }
                    m189961k(e, (C53428nn) null, (List) null, (C114546e) null);
                    m189961k(e, nnVar, (List) null, a);
                }
            }
            C58485gu f = e.mo55394f();
            C58976aa aaVar = C58975e.f156826a;
            int i3 = ((C58724pq) f).f156474d;
            return f;
        } else if (ordinal != 14) {
            C53399ml mlVar = nhVar.f140194k;
            if (mlVar == null) {
                mlVar = C53399ml.f140122b;
            }
            C53368lh lhVar = mlVar.f140124a;
            if (lhVar == null) {
                lhVar = C53368lh.f140044b;
            }
            C114542a aVar = new C114542a();
            aVar.f317636a = new C58759qy(C53365le.FAB);
            C58833ax b = a.mo101402b(lhVar, aVar.mo101396a());
            if (b.mo56113h() && ((C53366lf) b.mo56107c()).f140037b == 12) {
                C114903ab abVar = this.f317839A;
                C53366lf lfVar = (C53366lf) b.mo56107c();
                if (lfVar.f140037b == 12) {
                    mjVar = (C53397mj) lfVar.f140038c;
                } else {
                    mjVar = C53397mj.f140117c;
                }
                abVar.f318789c = mjVar;
            }
            C58480gp e2 = C58485gu.m89837e();
            for (C53428nn k : cqVar) {
                m189961k(e2, k, (List) null, a);
            }
            C58485gu f2 = e2.mo55394f();
            C58976aa aaVar2 = C58975e.f156826a;
            int i4 = ((C58724pq) f2).f156474d;
            return f2;
        } else {
            C58480gp e3 = C58485gu.m89837e();
            for (C53428nn nnVar2 : cqVar) {
                int i5 = nnVar2.f140217a;
                if (i5 == 3) {
                    m189961k(e3, nnVar2, (List) null, a);
                } else if (i5 == 9) {
                    C53401mn mnVar2 = (C53401mn) nnVar2.f140218b;
                    if ((mnVar2.f140128a & 8) != 0 && ((i = mnVar2.f140132e) == 49929 || i == 54997)) {
                        m189961k(e3, nnVar2, (List) null, a);
                    }
                }
            }
            C58801sm G = C58485gu.m89848p(C53200fb.COMMUTE_DATA, C53200fb.FLIGHT_STATUS_DATA, C53200fb.WEATHER_DATA).listIterator(0);
            while (G.hasNext()) {
                List g = a.f317641c.mo55277g((C53200fb) G.next());
                if (!g.isEmpty()) {
                    C114605bz bzVar = this.f317858s;
                    C53250gy gyVar = (C53250gy) g.get(0);
                    C115046cw cwVar = bzVar.f317904f;
                    gyVar.getClass();
                    e3.mo55395g((C114758l) ((C58847bk) C58833ax.m90834k(new C115045cv(gyVar))).f156646a);
                }
            }
            C58485gu f3 = e3.mo55394f();
            C58976aa aaVar3 = C58975e.f156826a;
            int i6 = ((C58724pq) f3).f156474d;
            return f3;
        }
    }

    /* renamed from: d */
    public final C60870cx mo101442d(boolean z) {
        if (!mo101448j()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (this.f317844e.mo79746e(C90014bt.f247647lB) && this.f317850k != C53306j.AMBIENT && this.f317850k != C53306j.DOCK) {
            return this.f317845f.mo28209i(C90877ak.m148471e(((C83725a) this.f317864y.mo6453a()).mo77049a(), this.f317844e.mo79743a(C90014bt.f247805oA), TimeUnit.SECONDS, this.f317842c), "zsResponseDataManager.getLocalAgendaFuture()", C114587bh.f317816a);
        }
        if (z) {
            return this.f317842c.mo28209i(C90877ak.m148471e((C60870cx) this.f317855p.mo6453a(), this.f317844e.mo79743a(C90014bt.f247805oA), TimeUnit.SECONDS, this.f317842c), "zsResponseDataManager.getLocalAgendaFuture()", C114588bi.f317817a);
        }
        return this.f317842c.mo28209i(this.f317843d.mo96367x(), "zsResponseDataManager.getLocalAgendaFuture()", C114589bj.f317818a);
    }

    /* renamed from: e */
    public final C60870cx mo101443e() {
        return this.f317842c.mo28209i(((C89037bh) this.f317865z.mo27525b()).mo27378c(), "getConnectivityInfoFuture", new C114586bg(this));
    }

    /* renamed from: f */
    public final void mo101444f() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f317848i) {
            if (this.f317854o.isDone()) {
                this.f317854o = new SettableFuture();
            }
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C53340kg kgVar;
        C58976aa aaVar = C58975e.f156826a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.OPA_ZERO_STATE_RESPONSE) {
            C62940bt btVar = C88142qs.f238266a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                try {
                    C53422nh nhVar = (C53422nh) C62942bv.parseFrom((C62942bv) C53422nh.f140182m, ((C88144qu) serviceEventData.mo81918e(C88142qs.f238266a)).f238270b, C62921ba.m95368a());
                    nhVar.getClass();
                    C63204j jVar = nhVar.f140195l;
                    if (jVar == null) {
                        jVar = C63204j.f170749e;
                    }
                    this.f317853n = jVar;
                    this.f317856q.set(false);
                    this.f317857r.set(true);
                    new C90873ag(mo101442d(true), this.f317845f, "getLocalAgendaFuture", new C114592bm(this, nhVar)).mo85223a(new C114593bn(this, nhVar));
                } catch (C62974ct e) {
                    C59104x d = f317838a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ZSResponseDataManager");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29201)).mo56386p("#onServiceEvent(): failed to parse ZeroStateClientResponse proto");
                }
            }
        } else {
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            if (a2 == C88244um.OPA_ZERO_STATE_ASYNC_UPDATE_RESPONSE) {
                C114880l lVar = this.f317840B;
                C62940bt btVar2 = C88139qp.f238261a;
                C88246uo uoVar2 = serviceEventData.f236959a;
                C62940bt r1 = C62942bv.checkIsLite(btVar2);
                uoVar2.mo58887l(r1);
                if (!uoVar2.f169962ag.mo58857o(r1.f169971d)) {
                    C59104x d2 = C114880l.f318729a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "ZSAsyncUpdateUtils");
                    ((C59052c) ((C59052c) d2).mo56372aa(29518)).mo56386p("#handleAsyncUpdateResponse(): missing OpaZeroStateAsyncUpdateResponseEventData.");
                    return;
                }
                C53346km kmVar = ((C88141qr) serviceEventData.mo81918e(C88139qp.f238261a)).f238265b;
                if (kmVar == null) {
                    kmVar = C53346km.f139981f;
                }
                if (lVar.f318733e == null) {
                    lVar.f318733e = lVar.f318732d.mo101603a(lVar.f318730b);
                }
                C114799aw awVar = lVar.f318733e;
                awVar.getClass();
                int i = kmVar.f139984b;
                if (i == 3) {
                    C53338ke keVar = (C53338ke) kmVar.f139985c;
                    awVar.f318703a = keVar.f139966a;
                    if (keVar.f139967b.size() > 0) {
                        String str = ((C53337kd) keVar.f139967b.get(0)).f139961a;
                        C114879k kVar = new C114879k(lVar, keVar);
                        awVar.f318705c = str;
                        awVar.f318706d = kVar;
                    } else {
                        awVar.f318705c = null;
                        awVar.f318706d = null;
                    }
                    awVar.mo101664b();
                    awVar.mo101665c();
                } else if (i != 6 || ((C53340kg) kmVar.f139985c).f139971a.isEmpty()) {
                    int i2 = kmVar.f139984b;
                    if (i2 == 5) {
                        C53321jo joVar = (C53321jo) kmVar.f139985c;
                        if ((joVar.f139821a & 1) != 0) {
                            C53323jq jqVar = joVar.f139822b;
                            if (jqVar == null) {
                                jqVar = C53323jq.f139825c;
                            }
                            if (!C114880l.m190424b(jqVar)) {
                                return;
                            }
                        }
                        for (C53323jq b : joVar.f139823c) {
                            if (!C114880l.m190424b(b)) {
                                return;
                            }
                        }
                        for (C53198f b2 : joVar.f139824d) {
                            if (!C114885q.m190445b(b2)) {
                                return;
                            }
                        }
                        if ((joVar.f139821a & 1) != 0) {
                            C53323jq jqVar2 = joVar.f139822b;
                            if (jqVar2 == null) {
                                jqVar2 = C53323jq.f139825c;
                            }
                            lVar.mo101673a(jqVar2);
                        }
                        for (C53323jq a3 : joVar.f139823c) {
                            lVar.mo101673a(a3);
                        }
                        for (C53198f c : joVar.f139824d) {
                            lVar.f318735g.mo101686c(c, (String) null);
                        }
                        lVar.f318734f.mo101557e(C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_CARD_SOFT_RELOAD);
                    } else if (i2 != 4) {
                        int a4 = C53345kl.m86812a(kmVar.f139986d);
                        if (a4 != 0 && a4 == 3) {
                            if ((kmVar.f139983a & 2) != 0) {
                                awVar.f318703a = kmVar.f139987e;
                            } else {
                                awVar.mo101666d();
                            }
                            awVar.f318705c = null;
                            awVar.f318706d = null;
                            awVar.mo101664b();
                            awVar.mo101665c();
                        }
                    } else {
                        lVar.f318731c.mo101659d(C87566i.m142325x((String) kmVar.f139985c), (C114750d) null);
                    }
                } else {
                    C114773b bVar = lVar.f318736h;
                    C87571n nVar = lVar.f318737i;
                    Context applicationContext = lVar.f318730b.getApplicationContext();
                    if (kmVar.f139984b == 6) {
                        kgVar = (C53340kg) kmVar.f139985c;
                    } else {
                        kgVar = C53340kg.f139969b;
                    }
                    bVar.mo101590b(nVar.mo81695b(applicationContext, kgVar.f139971a, (C60218r) null));
                }
            } else {
                C59104x d3 = f317838a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "ZSResponseDataManager");
                C59052c cVar = (C59052c) ((C59052c) d3).mo56372aa(29212);
                C88244um a5 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
                if (a5 == null) {
                    a5 = C88244um.ATTACH_WEBVIEW;
                }
                cVar.mo56389s("Wrong service event passed: %s", a5);
            }
        }
    }

    /* renamed from: g */
    public final void mo101445g() {
        new C90873ag(C60856cj.m92907p(this.f317843d.mo76936k(this.f317850k), mo101442d(false)), this.f317845f, "getZeroStateResponse from cache", new C114584be(this)).mo85223a(C114585bf.f317814a);
    }

    /* renamed from: h */
    public final void mo101446h(C53422nh nhVar, List list) {
        C114759m mVar;
        C58485gu b = mo101441b(nhVar, list);
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f317848i) {
            if (!this.f317854o.isDone()) {
                this.f317854o.mo57356n(b);
            } else {
                SettableFuture settableFuture = new SettableFuture();
                this.f317854o = settableFuture;
                settableFuture.mo57356n(b);
                if (Thread.currentThread() == Looper.getMainLooper().getThread() && (mVar = this.f317852m) != null) {
                    mVar.mo101409a(b);
                } else if (this.f317852m != null) {
                    this.f317849j.mo28212l("updateSectionDataListListeners", new C114594bo(this, b));
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean mo101447i() {
        return mo101440a() < TimeUnit.MINUTES.toMillis(this.f317844e.mo79743a(C90014bt.f247806oB));
    }

    /* renamed from: j */
    public final boolean mo101448j() {
        return (this.f317850k == C53306j.MAIN_APP || this.f317850k == C53306j.MORRIS) ? false : true;
    }
}
