package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137046o;
import com.google.android.apps.search.googleapp.promomanager.p10375d.C137054f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46786dc;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58894dd;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63901ao;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63905as;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63907au;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63921bh;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63938by;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63949m;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p5535j.p5536a.p5545c.p5547b.C70970a;
import p5535j.p5536a.p5545c.p5547b.C70971b;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.dd */
/* compiled from: PG */
public final class C137003dd implements C136969bx {

    /* renamed from: a */
    public static final C58974d f372837a = C58974d.m91135i("PromoManagerDataService");

    /* renamed from: b */
    static final C46690ah f372838b = new C46885y("PromoManagerMainAppDataSourceKey");

    /* renamed from: c */
    static final C46690ah f372839c = new C46885y("PromoManagerMinusOneDataSourceKey");

    /* renamed from: d */
    static final C46690ah f372840d = new C46885y("PromoManagerGoogleAppBrowserDataSourceKey");

    /* renamed from: e */
    static final C46690ah f372841e = new C46885y("PromoManagerDiscoverTooltipDataSourceKey");

    /* renamed from: f */
    static final C46690ah f372842f = new C46885y("PromoManagerEligibleDiscoverTooltipsDataSourceKey");

    /* renamed from: g */
    static final C46690ah f372843g = new C46885y("PromoManagerAccountMenuDataSourceKey");

    /* renamed from: h */
    static final C58495hd f372844h;

    /* renamed from: A */
    private final long f372845A;

    /* renamed from: i */
    public final C21370a f372846i;

    /* renamed from: j */
    public final C137020o f372847j;

    /* renamed from: k */
    public final C42876ab f372848k;

    /* renamed from: l */
    public final C37215b f372849l;

    /* renamed from: m */
    public final Executor f372850m;

    /* renamed from: n */
    public C60870cx f372851n = C60856cj.m92900i(C137007dh.f372869h);

    /* renamed from: o */
    public C60870cx f372852o = C60856cj.m92900i(C58485gu.m89845m());

    /* renamed from: p */
    private final C46723bg f372853p;

    /* renamed from: q */
    private final C46778cv f372854q;

    /* renamed from: r */
    private final C136967bv f372855r;

    /* renamed from: s */
    private final C137054f f372856s;

    /* renamed from: t */
    private final C42876ab f372857t;

    /* renamed from: u */
    private final Set f372858u;

    /* renamed from: v */
    private final C60950i f372859v;

    /* renamed from: w */
    private final C58528ij f372860w;

    /* renamed from: x */
    private final boolean f372861x;

    /* renamed from: y */
    private final boolean f372862y;

    /* renamed from: z */
    private final boolean f372863z;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C139779t.HOME_SCREEN, C63926bm.HOME);
        gzVar.mo55429h(C139779t.SEARCH, C63926bm.SEARCH);
        gzVar.mo55429h(C139779t.COLLECTIONS, C63926bm.COLLECTIONS);
        gzVar.mo55429h(C139779t.TABS, C63926bm.TABS);
        gzVar.mo55429h(C139779t.GOOGLE_APP_BROWSER, C63926bm.GOOGLE_APP_BROWSER);
        f372844h = gzVar.mo55427f(false);
    }

    public C137003dd(C21370a aVar, C46723bg bgVar, C46778cv cvVar, C137020o oVar, C136967bv bvVar, C137054f fVar, C42876ab abVar, C42876ab abVar2, C37215b bVar, Executor executor, C60950i iVar, C65599b bVar2, boolean z, boolean z2, boolean z3, long j) {
        this.f372846i = aVar;
        this.f372853p = bgVar;
        this.f372854q = cvVar;
        this.f372847j = oVar;
        this.f372855r = bvVar;
        this.f372856s = fVar;
        this.f372848k = abVar;
        this.f372857t = abVar2;
        this.f372849l = bVar;
        this.f372850m = executor;
        this.f372859v = iVar;
        this.f372860w = C58528ij.m90006F(bVar2.f178301a);
        this.f372861x = z;
        this.f372862y = z2;
        this.f372863z = z3;
        this.f372845A = j;
        HashSet hashSet = new HashSet();
        this.f372858u = hashSet;
        hashSet.add(f372838b);
        hashSet.add(f372839c);
        hashSet.add(f372840d);
        hashSet.add(f372843g);
        hashSet.add(f372841e);
        hashSet.add(f372842f);
    }

    /* renamed from: A */
    private final void m222667A(C137009dj djVar) {
        C58970a aVar = (C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40878);
        C63926bm a = C63926bm.m96318a(djVar.f372882b);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        aVar.mo56389s("showPromo[Tab: %s]", a.name());
        C60870cx d = this.f372848k.mo46042d();
        C60870cx d2 = this.f372857t.mo46042d();
        this.f372851n = C47638k.m84751b(d, d2).mo51521b(new C136971bz(this, d, d2, djVar), this.f372850m);
        this.f372852o = C47638k.m84751b(d, d2).mo51521b(new C136973ca(this, d, d2, djVar), this.f372850m);
        C60870cx cxVar = this.f372851n;
        Object[] objArr = new Object[1];
        C63926bm a2 = C63926bm.m96318a(djVar.f372882b);
        if (a2 == null) {
            a2 = C63926bm.UNSPECIFIED;
        }
        objArr[0] = a2.name();
        C46459k.m82829b(cxVar, "Failed to showPromo[%s]", objArr);
        this.f372854q.mo50787a(C60866ct.f164955a, C46786dc.m83350a(C58528ij.m90006F(this.f372858u)));
    }

    /* renamed from: v */
    public static boolean m222668v(C137007dh dhVar) {
        C63959w wVar;
        C63958v vVar = C63958v.ACCOUNT_MENU_EDUCATION;
        if (dhVar.f372872b == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C63958v a = C63958v.m96327a(wVar.f172983a);
        if (a == null) {
            a = C63958v.TYPE_UNSPECIFIED;
        }
        return vVar.equals(a);
    }

    /* renamed from: w */
    public static boolean m222669w(C137007dh dhVar) {
        C63959w wVar;
        C63958v vVar = C63958v.DISCOVER_TOOLTIP;
        if (dhVar.f372872b == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C63958v a = C63958v.m96327a(wVar.f172983a);
        if (a == null) {
            a = C63958v.TYPE_UNSPECIFIED;
        }
        return vVar.equals(a);
    }

    /* renamed from: y */
    private final C137009dj m222670y(C137009dj djVar, C63926bm bmVar) {
        C137008di diVar = (C137008di) djVar.toBuilder();
        diVar.copyOnWrite();
        C137009dj djVar2 = (C137009dj) diVar.instance;
        djVar2.f372882b = bmVar.f172871h;
        djVar2.f372881a |= 1;
        C63042fg i = C62953e.m95484i(this.f372846i.mo26870b());
        diVar.copyOnWrite();
        C137009dj djVar3 = (C137009dj) diVar.instance;
        i.getClass();
        djVar3.f372883c = i;
        djVar3.f372881a |= 2;
        return (C137009dj) diVar.build();
    }

    /* renamed from: z */
    private final void m222671z() {
        this.f372851n = C60856cj.m92900i(C137007dh.f372869h);
        this.f372854q.mo50787a(C60866ct.f164955a, C46786dc.m83350a(C58528ij.m90006F(this.f372858u)));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (com.google.protobuf.p4750c.C62950b.m95474e(r0).plus(p3186j$.time.Duration.ofDays(r4.f372845A)).isBefore(r4.f372859v.mo57444a()) != false) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.C60870cx mo113473a(com.google.common.util.concurrent.C60870cx r5, com.google.common.util.concurrent.C60870cx r6, com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj r7) {
        /*
            r4 = this;
            java.lang.Object r5 = com.google.common.util.concurrent.C60856cj.m92909r(r5)     // Catch:{ ExecutionException -> 0x00b6, CancellationException -> 0x00b4 }
            com.google.protos.aw.a.a.a.bb r5 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb) r5     // Catch:{ ExecutionException -> 0x00b6, CancellationException -> 0x00b4 }
            java.lang.Object r6 = com.google.common.util.concurrent.C60856cj.m92909r(r6)     // Catch:{ ExecutionException -> 0x00b6, CancellationException -> 0x00b4 }
            com.google.android.apps.search.googleapp.promomanager.c.o r6 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137046o) r6     // Catch:{ ExecutionException -> 0x00b6, CancellationException -> 0x00b4 }
            boolean r0 = r4.f372862y
            if (r0 == 0) goto L_0x0039
            boolean r0 = r6.f372966c
            if (r0 != 0) goto L_0x0034
            com.google.protobuf.fg r0 = r6.f372965b
            if (r0 != 0) goto L_0x001a
            com.google.protobuf.fg r0 = com.google.protobuf.C63042fg.f170152c
        L_0x001a:
            j$.time.Instant r0 = com.google.protobuf.p4750c.C62950b.m95474e(r0)
            long r1 = r4.f372845A
            j$.time.Duration r1 = p3186j$.time.Duration.ofDays(r1)
            j$.time.Instant r0 = r0.plus(r1)
            com.google.common.v.i r1 = r4.f372859v
            j$.time.Instant r1 = r1.mo57444a()
            boolean r0 = r0.isBefore(r1)
            if (r0 == 0) goto L_0x0039
        L_0x0034:
            com.google.android.apps.search.googleapp.promomanager.d.f r0 = r4.f372856s
            r0.mo113482a()
        L_0x0039:
            com.google.android.libraries.search.b.b r0 = r4.f372849l
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97890cP
            com.google.android.libraries.search.b.i.a r1 = r1.mo40779c()
            r0.mo19974a(r1)
            com.google.common.f.a.d r0 = f372837a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Select eligible promotion"
            r2 = 40864(0x9fa0, float:5.7263E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.search.googleapp.promomanager.b.o r0 = r4.f372847j
            com.google.protobuf.fg r1 = r7.f372883c
            if (r1 != 0) goto L_0x005a
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c
        L_0x005a:
            com.google.android.apps.search.googleapp.promomanager.b.n r2 = r0.f372898b
            com.google.android.apps.search.googleapp.promomanager.b.b r2 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C136945b) r2
            com.google.protobuf.fg r2 = r2.f372706b
            com.google.protobuf.fg r3 = r6.f372965b
            if (r3 != 0) goto L_0x0066
            com.google.protobuf.fg r3 = com.google.protobuf.C63042fg.f170152c
        L_0x0066:
            boolean r2 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137019n.m222705c(r2, r3)
            if (r2 == 0) goto L_0x008e
            com.google.protos.aw.a.a.a.au r2 = r6.f372967d
            if (r2 != 0) goto L_0x0072
            com.google.protos.aw.a.a.a.au r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63907au.f172809d
        L_0x0072:
            com.google.protos.aw.a.a.a.ai r3 = r2.f172811a
            if (r3 != 0) goto L_0x0078
            com.google.protos.aw.a.a.a.ai r3 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63895ai.f172768f
        L_0x0078:
            r0.f372900d = r3
            com.google.protos.aw.a.a.a.bh r3 = r2.f172813c
            if (r3 != 0) goto L_0x0080
            com.google.protos.aw.a.a.a.bh r3 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63921bh.f172854b
        L_0x0080:
            com.google.protos.aw.a.a.a.bj r2 = r2.f172812b
            if (r2 != 0) goto L_0x0086
            com.google.protos.aw.a.a.a.bj r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63923bj.f172858c
        L_0x0086:
            com.google.protobuf.ch r2 = r2.f172860a
            com.google.android.apps.search.googleapp.promomanager.b.n r2 = r0.mo113478a(r3, r2, r1)
            r0.f372898b = r2
        L_0x008e:
            com.google.android.apps.search.googleapp.promomanager.b.n r2 = r0.f372898b
            com.google.android.apps.search.googleapp.promomanager.b.b r2 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C136945b) r2
            com.google.common.b.hd r2 = r2.f372705a
            com.google.common.util.concurrent.cx r5 = r0.mo113479b(r5, r7, r1, r2)
            com.google.android.apps.search.googleapp.promomanager.b.d r7 = com.google.android.apps.search.googleapp.promomanager.p10372b.C136999d.f372828a
            java.util.concurrent.Executor r0 = r0.f372897a
            com.google.common.base.ah r7 = com.google.apps.tiktok.tracing.C47810es.m84963c(r7)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60922j.m93044g(r5, r7, r0)
            com.google.android.apps.search.googleapp.promomanager.b.cj r7 = new com.google.android.apps.search.googleapp.promomanager.b.cj
            r7.<init>(r4, r6)
            java.util.concurrent.Executor r6 = r4.f372850m
            com.google.common.base.ah r7 = com.google.apps.tiktok.tracing.C47810es.m84963c(r7)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60922j.m93044g(r5, r7, r6)
            return r5
        L_0x00b4:
            r5 = move-exception
            goto L_0x00b7
        L_0x00b6:
            r5 = move-exception
        L_0x00b7:
            com.google.common.base.dd r6 = new com.google.common.base.dd
            java.lang.String r7 = "Failed to get from promo manager data storage"
            r6.<init>(r7, r5)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92899h(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C137003dd.mo113473a(com.google.common.util.concurrent.cx, com.google.common.util.concurrent.cx, com.google.android.apps.search.googleapp.promomanager.b.dj):com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C60870cx mo113474b(C60870cx cxVar, C60870cx cxVar2, C137009dj djVar) {
        try {
            C63915bb bbVar = (C63915bb) C60856cj.m92909r(cxVar);
            C137046o oVar = (C137046o) C60856cj.m92909r(cxVar2);
            ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40865)).mo56386p("Select eligible discover promotions");
            C60870cx cxVar3 = this.f372851n;
            C136979cg cgVar = new C136979cg(this, bbVar, djVar, oVar);
            C60870cx h = C60922j.m93045h(cxVar3, C47810es.m84966f(cgVar), this.f372850m);
            if (!this.f372861x) {
                return h;
            }
            C136980ch chVar = new C136980ch(this, djVar);
            return C60922j.m93044g(h, C47810es.m84963c(chVar), this.f372850m);
        } catch (CancellationException | ExecutionException e) {
            return C60856cj.m92899h(new C58894dd("Failed to get from promo manager data storage", e));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C60870cx mo113475c(C60870cx cxVar, C60870cx cxVar2, int i, C63926bm bmVar, C137009dj djVar) {
        try {
            C63915bb bbVar = (C63915bb) C60856cj.m92909r(cxVar);
            C137046o oVar = (C137046o) C60856cj.m92909r(cxVar2);
            this.f372849l.mo19974a(C37182a.f97890cP.mo40779c());
            C63919bf k = mo113476k(i, C63958v.TYPE_UNSPECIFIED, bmVar, oVar);
            C63042fg fgVar = oVar.f372965b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (((C58528ij) Collection.EL.stream(k.f172850d).map(C136987co.f372804a).collect(C58370cn.f155947b)).contains(bmVar) && C136968bw.m222637b(k)) {
                C63905as asVar = k.f172852f;
                if (asVar == null) {
                    asVar = C63905as.f172804c;
                }
                if (asVar.f172806a) {
                    if ((bbVar.f172828a & 2) != 0) {
                        C63901ao aoVar = bbVar.f172833f;
                        if (aoVar == null) {
                            aoVar = C63901ao.f172789b;
                        }
                        C62971cq cqVar = aoVar.f172791a;
                        C63909aw awVar = k.f172848b;
                        if (awVar == null) {
                            awVar = C63909aw.f172816e;
                        }
                        if (cqVar.contains(awVar)) {
                            C37259h d = C37182a.f98112gZ.mo40806d();
                            C137005df dfVar = (C137005df) C137007dh.f372869h.createBuilder();
                            C63909aw awVar2 = k.f172848b;
                            if (awVar2 == null) {
                                awVar2 = C63909aw.f172816e;
                            }
                            dfVar.copyOnWrite();
                            C137007dh dhVar = (C137007dh) dfVar.instance;
                            awVar2.getClass();
                            dhVar.f372875e = awVar2;
                            dhVar.f372871a |= 8;
                            mo113477x(d, (C137007dh) dfVar.build(), fgVar);
                            return C60856cj.m92900i(C137007dh.f372869h);
                        }
                    }
                    C136967bv bvVar = this.f372855r;
                    C63938by byVar = k.f172849c;
                    if (byVar == null) {
                        byVar = C63938by.f172910d;
                    }
                    C63949m mVar = byVar.f172914c;
                    if (mVar == null) {
                        mVar = C63949m.f172943c;
                    }
                    C60870cx a = bvVar.mo113467a(mVar, djVar);
                    C137005df dfVar2 = (C137005df) C137007dh.f372869h.createBuilder();
                    C63959w wVar = k.f172851e;
                    if (wVar == null) {
                        wVar = C63959w.f172981b;
                    }
                    dfVar2.copyOnWrite();
                    C137007dh dhVar2 = (C137007dh) dfVar2.instance;
                    wVar.getClass();
                    dhVar2.f372873c = wVar;
                    dhVar2.f372872b = 2;
                    C63926bm a2 = C63926bm.m96318a(djVar.f372882b);
                    if (a2 == null) {
                        a2 = C63926bm.UNSPECIFIED;
                    }
                    dfVar2.copyOnWrite();
                    C137007dh dhVar3 = (C137007dh) dfVar2.instance;
                    dhVar3.f372874d = a2.f172871h;
                    dhVar3.f372871a |= 4;
                    C63909aw awVar3 = k.f172848b;
                    if (awVar3 == null) {
                        awVar3 = C63909aw.f172816e;
                    }
                    dfVar2.copyOnWrite();
                    C137007dh dhVar4 = (C137007dh) dfVar2.instance;
                    awVar3.getClass();
                    dhVar4.f372875e = awVar3;
                    dhVar4.f372871a |= 8;
                    C63905as asVar2 = k.f172852f;
                    if (asVar2 == null) {
                        asVar2 = C63905as.f172804c;
                    }
                    boolean z = asVar2.f172807b;
                    dfVar2.copyOnWrite();
                    C137007dh dhVar5 = (C137007dh) dfVar2.instance;
                    dhVar5.f372871a |= 16;
                    dhVar5.f372876f = z;
                    C63905as asVar3 = k.f172852f;
                    if (asVar3 == null) {
                        asVar3 = C63905as.f172804c;
                    }
                    boolean z2 = asVar3.f172806a;
                    dfVar2.copyOnWrite();
                    C137007dh dhVar6 = (C137007dh) dfVar2.instance;
                    dhVar6.f372871a |= 32;
                    dhVar6.f372877g = z2;
                    return C60922j.m93044g(a, C47810es.m84963c(new C136988cp(this, k, fgVar, (C137007dh) dfVar2.build())), this.f372850m);
                }
            }
            C37259h d2 = C37182a.f98155hP.mo40806d();
            C137005df dfVar3 = (C137005df) C137007dh.f372869h.createBuilder();
            C63909aw awVar4 = k.f172848b;
            if (awVar4 == null) {
                awVar4 = C63909aw.f172816e;
            }
            dfVar3.copyOnWrite();
            C137007dh dhVar7 = (C137007dh) dfVar3.instance;
            awVar4.getClass();
            dhVar7.f372875e = awVar4;
            dhVar7.f372871a |= 8;
            mo113477x(d2, (C137007dh) dfVar3.build(), fgVar);
            return C60856cj.m92900i(C137007dh.f372869h);
        } catch (CancellationException | ExecutionException e) {
            return C60856cj.m92899h(new C58894dd("Failed to get from promo manager data storage", e));
        }
    }

    /* renamed from: d */
    public final C46689ag mo113447d() {
        ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40858)).mo56386p("getAccountMenuPromotion");
        return new C46719bc(this.f372853p, new C136977ce(this), f372843g);
    }

    /* renamed from: e */
    public final C46689ag mo113448e() {
        return new C46719bc(this.f372853p, new C136986cn(this), f372842f);
    }

    /* renamed from: f */
    public final C46689ag mo113449f() {
        ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40859)).mo56386p("getEmptyPromotion");
        return new C46719bc(this.f372853p, C136976cd.f372788a, f372838b);
    }

    /* renamed from: g */
    public final C46689ag mo113450g() {
        ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40860)).mo56386p("getGoogleAppBrowserPromotion");
        return new C46719bc(this.f372853p, new C136978cf(this), f372840d);
    }

    /* renamed from: h */
    public final C46689ag mo113451h() {
        ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40861)).mo56386p("getMinusOnePromotion");
        return new C46719bc(this.f372853p, new C136985cm(this), f372839c);
    }

    /* renamed from: i */
    public final C46689ag mo113452i(C139779t tVar) {
        ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40862)).mo56389s("getPromotion[%s]", tVar.name());
        C60870cx cxVar = this.f372851n;
        C136983ck ckVar = new C136983ck(tVar);
        this.f372851n = C60922j.m93044g(cxVar, C47810es.m84963c(ckVar), this.f372850m);
        return new C46719bc(this.f372853p, new C136984cl(this), f372838b);
    }

    /* renamed from: j */
    public final C46689ag mo113453j(C63934bu buVar, C63926bm bmVar) {
        ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40863)).mo56354G("getTooltipPromotion[%s, %s]", buVar.name(), bmVar.name());
        C46885y yVar = new C46885y(String.format("%s_%s_%s", new Object[]{"PromoManagerToolipDataSourceKey", bmVar.name(), buVar.name()}));
        this.f372858u.add(yVar);
        return new C46719bc(this.f372853p, new C136998cz(this, buVar, bmVar), yVar);
    }

    /* renamed from: k */
    public final C63919bf mo113476k(int i, C63958v vVar, C63926bm bmVar, C137046o oVar) {
        C58495hd hdVar;
        C63919bf bfVar;
        C137020o oVar2 = this.f372847j;
        if (vVar.equals(C63958v.DISCOVER_TOOLTIP)) {
            hdVar = ((C136945b) oVar2.f372899c).f372705a;
        } else {
            hdVar = ((C136945b) oVar2.f372898b).f372705a;
        }
        Optional findFirst = Collection.EL.stream((List) Map.EL.getOrDefault(hdVar, bmVar, C58485gu.m89845m())).filter(new C137014i(i)).findFirst();
        C63907au auVar = oVar.f372967d;
        if (auVar == null) {
            auVar = C63907au.f172809d;
        }
        C58528ij ijVar = this.f372860w;
        C63921bh bhVar = auVar.f172813c;
        if (bhVar == null) {
            bhVar = C63921bh.f172854b;
        }
        Iterator it = bhVar.f172856a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bfVar = C63919bf.f172845g;
                break;
            }
            bfVar = (C63919bf) it.next();
            C63909aw awVar = bfVar.f172848b;
            if (awVar == null) {
                awVar = C63909aw.f172816e;
            }
            if (awVar.f172820c == i) {
                C63909aw awVar2 = bfVar.f172848b;
                if (awVar2 == null) {
                    awVar2 = C63909aw.f172816e;
                }
                if (ijVar.contains(Integer.valueOf(awVar2.f172821d))) {
                    break;
                }
            }
        }
        return (C63919bf) findFirst.orElse(bfVar);
    }

    /* renamed from: l */
    public final void mo113455l(C137007dh dhVar) {
        C58974d dVar = f372837a;
        C58970a aVar = (C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40868);
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        Integer valueOf = Integer.valueOf(awVar.f172819b);
        C63909aw awVar2 = dhVar.f372875e;
        Integer valueOf2 = Integer.valueOf((awVar2 == null ? C63909aw.f172816e : awVar2).f172820c);
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        aVar.mo56359L("#reportAccept[campaignId %d, deploymentId %d, placementId %d]", valueOf, valueOf2, Integer.valueOf(awVar2.f172821d));
        m222671z();
        C63909aw awVar3 = dhVar.f372875e;
        if (awVar3 == null) {
            awVar3 = C63909aw.f172816e;
        }
        if (!C136968bw.m222636a(awVar3)) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40869)).mo56386p("#reportAccept failed with invalid promoManagerId");
        } else {
            C47633f.m84733g(this.f372857t.mo46042d()).mo51516i(new C136989cq(this, dhVar), C60826bg.f164896a).mo51513e(RuntimeException.class, new C136990cr(dhVar), C60826bg.f164896a);
        }
    }

    /* renamed from: m */
    public final void mo113456m(C137007dh dhVar) {
        C58974d dVar = f372837a;
        C58970a aVar = (C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40870);
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        Integer valueOf = Integer.valueOf(awVar.f172819b);
        C63909aw awVar2 = dhVar.f372875e;
        Integer valueOf2 = Integer.valueOf((awVar2 == null ? C63909aw.f172816e : awVar2).f172820c);
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        aVar.mo56359L("#reportFailure[campaignId %d, deploymentId %d, placementId %d]", valueOf, valueOf2, Integer.valueOf(awVar2.f172821d));
        m222671z();
        C63909aw awVar3 = dhVar.f372875e;
        if (awVar3 == null) {
            awVar3 = C63909aw.f172816e;
        }
        if (!C136968bw.m222636a(awVar3)) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40871)).mo56386p("#reportFailure failed as invalid promoManagerId");
            return;
        }
        this.f372849l.mo19974a(C37182a.f97900cZ.mo40779c());
        mo113477x(C37182a.f97954da.mo40806d(), dhVar, C63042fg.f170152c);
    }

    /* renamed from: n */
    public final void mo113457n(C137007dh dhVar) {
        C58974d dVar = f372837a;
        C58970a aVar = (C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40872);
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        Integer valueOf = Integer.valueOf(awVar.f172819b);
        C63909aw awVar2 = dhVar.f372875e;
        Integer valueOf2 = Integer.valueOf((awVar2 == null ? C63909aw.f172816e : awVar2).f172820c);
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        aVar.mo56359L("#reportIgnored[campaignId %d, deploymentId %d, placementId %d]", valueOf, valueOf2, Integer.valueOf(awVar2.f172821d));
        m222671z();
        C63909aw awVar3 = dhVar.f372875e;
        if (awVar3 == null) {
            awVar3 = C63909aw.f172816e;
        }
        if (!C136968bw.m222636a(awVar3)) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40873)).mo56386p("#reportIgnored failed as invalid promoManagerId");
            return;
        }
        this.f372849l.mo19974a(C37182a.f97898cX.mo40779c());
        mo113477x(C37182a.f97899cY.mo40806d(), dhVar, C63042fg.f170152c);
    }

    /* renamed from: o */
    public final void mo113458o(C137007dh dhVar) {
        C58974d dVar = f372837a;
        C58970a aVar = (C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40874);
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        Integer valueOf = Integer.valueOf(awVar.f172819b);
        C63909aw awVar2 = dhVar.f372875e;
        Integer valueOf2 = Integer.valueOf((awVar2 == null ? C63909aw.f172816e : awVar2).f172820c);
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        aVar.mo56359L("#reportImpression[campaignId %d, deploymentId %d, placementId %d]", valueOf, valueOf2, Integer.valueOf(awVar2.f172821d));
        C63909aw awVar3 = dhVar.f372875e;
        if (awVar3 == null) {
            awVar3 = C63909aw.f172816e;
        }
        if (!C136968bw.m222636a(awVar3)) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40875)).mo56386p("#reportImpression failed with invalid promoManagerId");
            return;
        }
        if (this.f372863z) {
            this.f372856s.mo113482a();
        }
        this.f372857t.mo46039a(C136991cs.f372812a, C60826bg.f164896a);
        C47633f i = C47633f.m84733g(this.f372857t.mo46042d()).mo51516i(new C136995cw(this, dhVar), C60826bg.f164896a);
        this.f372851n = C60856cj.m92900i(C137007dh.f372869h);
        Object[] objArr = new Object[3];
        C63909aw awVar4 = dhVar.f372875e;
        objArr[0] = Integer.valueOf((awVar4 == null ? C63909aw.f172816e : awVar4).f172819b);
        objArr[1] = Integer.valueOf((awVar4 == null ? C63909aw.f172816e : awVar4).f172820c);
        if (awVar4 == null) {
            awVar4 = C63909aw.f172816e;
        }
        objArr[2] = Integer.valueOf(awVar4.f172821d);
        C46459k.m82829b(i, "Failed to reportImpression [campaignId %d, deploymentId %d, placementId %d]", objArr);
    }

    /* renamed from: p */
    public final void mo113459p(C137007dh dhVar) {
        C58974d dVar = f372837a;
        C58970a aVar = (C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40876);
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        Integer valueOf = Integer.valueOf(awVar.f172819b);
        C63909aw awVar2 = dhVar.f372875e;
        Integer valueOf2 = Integer.valueOf((awVar2 == null ? C63909aw.f172816e : awVar2).f172820c);
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        aVar.mo56359L("#reportReject[campaignId %d, deploymentId %d, placementId %d]", valueOf, valueOf2, Integer.valueOf(awVar2.f172821d));
        m222671z();
        C63909aw awVar3 = dhVar.f372875e;
        if (awVar3 == null) {
            awVar3 = C63909aw.f172816e;
        }
        if (!C136968bw.m222636a(awVar3)) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40877)).mo56386p("#reportReject failed with invalid promoManagerId");
        } else {
            C47633f.m84733g(this.f372857t.mo46042d()).mo51516i(new C136992ct(this, dhVar), C60826bg.f164896a).mo51513e(RuntimeException.class, new C136993cu(dhVar), C60826bg.f164896a);
        }
    }

    /* renamed from: q */
    public final void mo113460q(C137009dj djVar) {
        m222667A(m222670y(djVar, C63926bm.GOOGLE_APP_BROWSER));
    }

    /* renamed from: r */
    public final void mo113461r() {
        m222667A(m222670y(C137009dj.f372879f, C63926bm.MINUS_ONE));
    }

    /* renamed from: s */
    public final void mo113462s(C137009dj djVar) {
        m222667A(m222670y(djVar, C63926bm.SEARCH));
    }

    /* renamed from: t */
    public final void mo113463t(C139779t tVar) {
        if (tVar != C139779t.SEARCH && tVar != C139779t.GOOGLE_APP_BROWSER) {
            m222667A(m222670y(C137009dj.f372879f, (C63926bm) f372844h.getOrDefault(tVar, C63926bm.UNSPECIFIED)));
        }
    }

    /* renamed from: u */
    public final void mo113464u(C139779t tVar, int i) {
        ((C58970a) ((C58970a) f372837a.mo56224b()).mo56372aa(40879)).mo56395y("showReactiveOverlay[%d] for tab %s", i, tVar.name());
        C63926bm bmVar = (C63926bm) f372844h.getOrDefault(tVar, C63926bm.UNSPECIFIED);
        C137009dj y = m222670y(C137009dj.f372879f, bmVar);
        C60870cx d = this.f372848k.mo46042d();
        C60870cx d2 = this.f372857t.mo46042d();
        C60870cx b = C47638k.m84751b(d, d2).mo51521b(new C137000da(this, d, d2, i, bmVar, y), this.f372850m);
        this.f372851n = b;
        C46459k.m82829b(b, "Failed to showReactiveOverlay[%s]", tVar.name());
        this.f372854q.mo50787a(C60866ct.f164955a, C46786dc.m83350a(C58528ij.m90006F(this.f372858u)));
    }

    /* renamed from: x */
    public final void mo113477x(C37259h hVar, C137007dh dhVar, C63042fg fgVar) {
        C63959w wVar;
        C70970a aVar = (C70970a) C70971b.f189249k.createBuilder();
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172819b;
        aVar.copyOnWrite();
        C70971b bVar = (C70971b) aVar.instance;
        bVar.f189252a |= 1;
        bVar.f189253b = i;
        C63909aw awVar2 = dhVar.f372875e;
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        int i2 = awVar2.f172820c;
        aVar.copyOnWrite();
        C70971b bVar2 = (C70971b) aVar.instance;
        bVar2.f189252a |= 2;
        bVar2.f189254c = i2;
        C63909aw awVar3 = dhVar.f372875e;
        if (awVar3 == null) {
            awVar3 = C63909aw.f172816e;
        }
        int i3 = awVar3.f172821d;
        aVar.copyOnWrite();
        C70971b bVar3 = (C70971b) aVar.instance;
        bVar3.f189252a |= 4;
        bVar3.f189255d = i3;
        C63926bm a = C63926bm.m96318a(dhVar.f372874d);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        aVar.copyOnWrite();
        C70971b bVar4 = (C70971b) aVar.instance;
        bVar4.f189257f = a.f172871h;
        bVar4.f189252a |= 16;
        if (dhVar.f372872b == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C63958v a2 = C63958v.m96327a(wVar.f172983a);
        if (a2 == null) {
            a2 = C63958v.TYPE_UNSPECIFIED;
        }
        aVar.copyOnWrite();
        C70971b bVar5 = (C70971b) aVar.instance;
        bVar5.f189258g = a2.f172980h;
        bVar5.f189252a |= 32;
        boolean z = dhVar.f372876f;
        aVar.copyOnWrite();
        C70971b bVar6 = (C70971b) aVar.instance;
        bVar6.f189252a |= 64;
        bVar6.f189259h = z;
        if (!fgVar.equals(C63042fg.f170152c)) {
            aVar.copyOnWrite();
            C70971b bVar7 = (C70971b) aVar.instance;
            fgVar.getClass();
            bVar7.f189260i = fgVar;
            bVar7.f189252a |= 128;
        }
        C37252a e = hVar.mo40781e(C62722b.OK);
        ((C37253b) e).mo40792p(C70971b.f189250l, (C70971b) aVar.build());
        this.f372849l.mo19974a(e);
    }
}
