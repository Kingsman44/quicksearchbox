package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.C73799ab;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.search.core.p6918z.C87392a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90065dq;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.accl.p7331c.C92798g;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107555d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.libraries.assistant.p1533o.C18443af;
import com.google.android.libraries.assistant.p1533o.C18444ag;
import com.google.android.libraries.assistant.p1533o.C18450am;
import com.google.android.libraries.assistant.p1533o.C18451an;
import com.google.android.libraries.assistant.p1533o.C18452ao;
import com.google.android.libraries.assistant.p1533o.C18454aq;
import com.google.android.libraries.assistant.p1533o.C18502t;
import com.google.android.libraries.assistant.p1533o.C18503u;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51968fu;
import com.google.assistant.p3897e.p3921j.p3926e.C51970fw;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bs */
/* compiled from: PG */
public final class C92915bs extends C22538o {

    /* renamed from: a */
    public static final C59071e f259214a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.bs");

    /* renamed from: b */
    public final Query f259215b;

    /* renamed from: c */
    public final C22720x f259216c;

    /* renamed from: d */
    public final C22695ah f259217d;

    /* renamed from: e */
    public final Context f259218e;

    /* renamed from: f */
    public final C86255j f259219f;

    /* renamed from: g */
    public final C58833ax f259220g;

    /* renamed from: h */
    public final C22871g f259221h;

    /* renamed from: i */
    public final Executor f259222i;

    /* renamed from: j */
    public final Executor f259223j;

    /* renamed from: k */
    private final C86124t f259224k;

    /* renamed from: l */
    private final C68214a f259225l;

    /* renamed from: m */
    private final C68214a f259226m;

    /* renamed from: o */
    private final C86034c f259227o;

    /* renamed from: p */
    private final C22871g f259228p;

    /* renamed from: q */
    private final C68214a f259229q;

    /* renamed from: r */
    private final C68214a f259230r;

    /* renamed from: s */
    private final C68214a f259231s;

    /* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bs$a */
    /* compiled from: PG */
    public interface C92916a {
        /* renamed from: eK */
        C18443af mo87481eK();
    }

    public C92915bs(Context context, Query query, C86124t tVar, C22695ah ahVar, C22871g gVar, C22871g gVar2, Executor executor, Executor executor2, C86255j jVar, C58833ax axVar, C22720x xVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C86034c cVar, C68214a aVar4, C68214a aVar5) {
        this.f259224k = tVar;
        this.f259216c = xVar;
        this.f259225l = aVar2;
        this.f259226m = aVar3;
        this.f259218e = context;
        this.f259217d = ahVar;
        this.f259219f = jVar;
        this.f259220g = axVar;
        this.f259227o = cVar;
        this.f259221h = gVar;
        this.f259228p = gVar2;
        this.f259222i = executor;
        this.f259215b = query;
        this.f259223j = executor2;
        this.f259229q = aVar;
        this.f259230r = aVar4;
        this.f259231s = aVar5;
    }

    /* renamed from: c */
    public static C18454aq m152965c(C63088z zVar) {
        C18452ao aoVar = (C18452ao) C18454aq.f52369c.createBuilder();
        C18502t tVar = (C18502t) C18503u.f52450f.createBuilder();
        C18450am amVar = (C18450am) C18451an.f52363e.createBuilder();
        amVar.mo23991b(zVar);
        tVar.copyOnWrite();
        C18451an anVar = (C18451an) amVar.build();
        anVar.getClass();
        ((C18503u) tVar.instance).f52452a = anVar;
        aoVar.copyOnWrite();
        C18454aq aqVar = (C18454aq) aoVar.instance;
        C18503u uVar = (C18503u) tVar.build();
        uVar.getClass();
        aqVar.f52372b = uVar;
        aqVar.f52371a = 1;
        return (C18454aq) aoVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        int a;
        if (this.f259224k.mo79746e(C90014bt.f247385gE) || (this.f259224k.mo79746e(C90014bt.f247760nI) && this.f259224k.mo79746e(C90014bt.f247677lf))) {
            C58833ax axVar = ((C22407c) eVar).f61902d;
            if (!axVar.mo56113h() || !(axVar.mo56107c() instanceof C92798g)) {
                throw new C22534k();
            }
            C60870cx cxVar = ((C92798g) axVar.mo56107c()).f258955a;
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51971fx fxVar = (C51971fx) m41992m(dwVar, "show_search_results_page_args", C51971fx.f136380g.getParserForType());
            if (!fxVar.f136383b.isEmpty()) {
                String str = fxVar.f136383b;
                if (!this.f259224k.mo79746e(C90014bt.f247385gE)) {
                    int i = fxVar.f136382a;
                    if ((i & 32) == 0 || (a = C51970fw.m86457a(fxVar.f136387f)) == 0 || a != 2) {
                        if ((i & 8) == 0) {
                            return mo87478d(dyVar, eVar, cxVar, fxVar, this.f259216c);
                        }
                        this.f259228p.mo28212l("Perform renderOpaWebView", new C92913bq(this, dyVar, eVar, cxVar, fxVar));
                        return C60856cj.m92900i(C22402a.f61894b);
                    }
                }
                boolean z = !this.f259224k.mo79746e(C90065dq.f249655b) || ((C84486a) this.f259230r.mo27525b()).mo78207n();
                if (!this.f259224k.mo79746e(C90065dq.f249654a) || !z) {
                    return this.f259221h.mo28210j(cxVar, "SearchResultWithHtmlSrp -> processClientOp", new C92912bp(this, str));
                }
                C60870cx b = this.f259227o.mo79697b();
                if (this.f259224k.mo79746e(C90065dq.f249657d)) {
                    ((C73799ab) this.f259231s.mo27525b()).f195096a.set(true);
                }
                C51968fu fuVar = fxVar.f136384c;
                if (fuVar == null) {
                    fuVar = C51968fu.f136374d;
                }
                if ((fuVar.f136376a & 1) != 0) {
                    C51968fu fuVar2 = fxVar.f136385d;
                    if (fuVar2 == null) {
                        fuVar2 = C51968fu.f136374d;
                    }
                    if ((fuVar2.f136376a & 1) != 0) {
                        return C47636i.m84744c(b, cxVar).mo51519b(new C92910bn(this, b, str, cxVar, fxVar), this.f259222i);
                    }
                }
                return C47636i.m84744c(b, cxVar).mo51519b(new C92911bo(this, b, cxVar, str), this.f259222i);
            }
            throw new C22534k();
        }
        ((C59052c) ((C59052c) f259214a.mo56225c()).mo56372aa(13131)).mo56389s("Can't perform the operation %s. This feature is disabled", dyVar.f135936b);
        return f62144n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007e, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x0098;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.p1533o.C18454aq mo87477b(java.lang.String r7, com.google.common.base.C58833ax r8) {
        /*
            r6 = this;
            boolean r0 = r8.mo56113h()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r8.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            long r0 = r0.f252749G
            java.lang.String r0 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r0)
            goto L_0x001d
        L_0x0013:
            java.util.Random r0 = com.google.common.base.C58851bo.f156649a
            long r0 = r0.nextLong()
            java.lang.String r0 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r0)
        L_0x001d:
            boolean r1 = r8.mo56113h()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r8.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r1 = (com.google.android.apps.gsa.shared.search.Query) r1
            long r2 = r1.f252747E
            long r4 = r1.f252748F
            long r2 = r2 + r4
            goto L_0x0031
        L_0x002f:
            r2 = 0
        L_0x0031:
            com.google.android.libraries.assistant.o.aq r1 = com.google.android.libraries.assistant.p1533o.C18454aq.f52369c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.o.ao r1 = (com.google.android.libraries.assistant.p1533o.C18452ao) r1
            com.google.android.libraries.assistant.o.r r4 = com.google.android.libraries.assistant.p1533o.C18500r.f52444e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.o.q r4 = (com.google.android.libraries.assistant.p1533o.C18499q) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.o.r r5 = (com.google.android.libraries.assistant.p1533o.C18500r) r5
            r7.getClass()
            r5.f52446a = r7
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.libraries.assistant.o.r r7 = (com.google.android.libraries.assistant.p1533o.C18500r) r7
            r0.getClass()
            r7.f52448c = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.libraries.assistant.o.r r7 = (com.google.android.libraries.assistant.p1533o.C18500r) r7
            r7.f52447b = r2
            android.content.Context r7 = r6.f259218e
            java.lang.String r7 = r7.getPackageName()
            boolean r0 = r8.mo56113h()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r8 = (com.google.android.apps.gsa.shared.search.Query) r8
            java.lang.String r0 = "android.opa.extra.FOREGROUND_APP_TRIGGERED_ON"
            java.lang.String r8 = r8.mo84347bf(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0081
            goto L_0x0098
        L_0x0081:
            com.google.common.base.ax r8 = r6.f259220g
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x0096
            com.google.common.base.ax r8 = r6.f259220g
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r8 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r8
            java.lang.String r8 = r8.mo96439d()
            goto L_0x0098
        L_0x0096:
            java.lang.String r8 = ""
        L_0x0098:
            boolean r7 = r7.equals(r8)
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.android.libraries.assistant.o.r r8 = (com.google.android.libraries.assistant.p1533o.C18500r) r8
            r8.f52449d = r7
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.libraries.assistant.o.aq r7 = (com.google.android.libraries.assistant.p1533o.C18454aq) r7
            com.google.protobuf.bv r8 = r4.build()
            com.google.android.libraries.assistant.o.r r8 = (com.google.android.libraries.assistant.p1533o.C18500r) r8
            r8.getClass()
            r7.f52372b = r8
            r8 = 2
            r7.f52371a = r8
            com.google.protobuf.bv r7 = r1.build()
            com.google.android.libraries.assistant.o.aq r7 = (com.google.android.libraries.assistant.p1533o.C18454aq) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.C92915bs.mo87477b(java.lang.String, com.google.common.base.ax):com.google.android.libraries.assistant.o.aq");
    }

    /* renamed from: d */
    public final C60870cx mo87478d(C51809dy dyVar, C22434e eVar, C60870cx cxVar, C51971fx fxVar, C22720x xVar) {
        C86775r rVar = ((C86610af) this.f259225l.mo27525b()).f233977l;
        if (rVar != null) {
            C107555d dVar = (C107555d) C107556e.f299210c.createBuilder();
            dVar.copyOnWrite();
            C107556e eVar2 = (C107556e) dVar.instance;
            eVar2.f299213b = 9;
            eVar2.f299212a |= 1;
            C87684al alVar = new C87684al(C88244um.OPA_SESSION_SERVICE_EVENT);
            alVar.mo81965b(C107505a.f299120a, (C107556e) dVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
            return ((C87392a) this.f259226m.mo27525b()).mo81048a(dyVar, eVar, cxVar, fxVar, xVar);
        }
        ((C59052c) ((C59052c) f259214a.mo56225c()).mo56372aa(13132)).mo56386p("Error renderOpaWebView, AttachedClient is missing");
        mo87480f(C89885b.OPA_LOCKHART_ATTACHED_CLIENT_MISSING_VALUE);
        return f62144n;
    }

    /* renamed from: e */
    public final C70862aj mo87479e(AccountId accountId) {
        C18443af eK = ((C92916a) C47245e.m84045a(this.f259218e, C92916a.class, accountId)).mo87481eK();
        return C70876o.m103761b(eK.f189039a.mo39510a(C18444ag.m35922c(), eK.f189040b), new C92914br(), false);
    }

    /* renamed from: f */
    public final void mo87480f(int i) {
        ((C89911f) this.f259229q.mo27525b()).mo83756b(new C90452a(211, i)).mo83721a();
    }
}
