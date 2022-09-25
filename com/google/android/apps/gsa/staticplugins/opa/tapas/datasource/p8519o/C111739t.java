package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88343yd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111885bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113442ac;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113443ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113444ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113445af;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113446ag;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121538g;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121493a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121495c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121503k;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121505m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121510r;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3858ar.p3859a.C49714d;
import com.google.assistant.p3858ar.p3859a.C49727q;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.assistant.p3858ar.p3859a.C49736z;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.t */
/* compiled from: PG */
public final class C111739t implements C111727h, C111644a {

    /* renamed from: a */
    public static final C59071e f310591a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.t");

    /* renamed from: d */
    private static final C121537f f310592d = C121537f.m200840b("TapasServerFetchManager", C111700ak.f310512a);

    /* renamed from: b */
    public final C68214a f310593b;

    /* renamed from: c */
    public final C112982q f310594c;

    /* renamed from: e */
    private final C111728i f310595e;

    /* renamed from: f */
    private final C22871g f310596f;

    /* renamed from: g */
    private final Map f310597g = new HashMap();

    /* renamed from: h */
    private final C86124t f310598h;

    /* renamed from: i */
    private final C68214a f310599i;

    /* renamed from: j */
    private final C68214a f310600j;

    /* renamed from: k */
    private final C68214a f310601k;

    /* renamed from: l */
    private final C68214a f310602l;

    /* renamed from: m */
    private final C113446ag f310603m;

    /* renamed from: n */
    private final Map f310604n = new HashMap();

    public C111739t(C111728i iVar, C22871g gVar, C22871g gVar2, C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C112982q qVar, C113446ag agVar) {
        this.f310595e = iVar;
        this.f310596f = gVar;
        this.f310598h = tVar;
        this.f310593b = aVar;
        this.f310599i = aVar2;
        this.f310600j = aVar3;
        this.f310601k = aVar4;
        this.f310602l = aVar5;
        this.f310594c = qVar;
        this.f310603m = agVar;
        gVar2.mo28212l("runInitialFetchFromTapasServer", new C111731l(aVar6));
        iVar.mo99216b(this);
    }

    /* renamed from: a */
    public final void mo99219a(C88347yh yhVar) {
        C49736z zVar = yhVar.f238926b;
        if (zVar == null) {
            zVar = C49736z.f128420e;
        }
        if ((zVar.f128422a & 2) != 0) {
            C49736z zVar2 = yhVar.f238926b;
            if (zVar2 == null) {
                zVar2 = C49736z.f128420e;
            }
            long j = zVar2.f128423b;
            ((C113388b) this.f310601k.mo27525b()).mo99675j(j, C89849ae.TAPAS_FETCHER_SERVICE_EVENT_DATA_RECEIVED);
            synchronized (this.f310597g) {
                List<C111738s> list = (List) this.f310597g.remove(Long.valueOf(j));
                if (list != null) {
                    for (C111738s sVar : list) {
                        sVar.f310590b.mo57356n(yhVar);
                        C113405ep epVar = sVar.f310589a;
                        C49736z zVar3 = yhVar.f238926b;
                        if (zVar3 == null) {
                            zVar3 = C49736z.f128420e;
                        }
                        C49728r rVar = zVar3.f128424c;
                        if (rVar == null) {
                            rVar = C49728r.f128339j;
                        }
                        if (this.f310598h.mo79746e(C90063do.f249415dB) && (rVar.f128341a & 1) != 0 && C58879cp.m90962d(rVar.f128342b) && ((C113425ff) this.f310600j.mo27525b()).mo100143i()) {
                            if (this.f310598h.mo79746e(C90063do.f249407cu)) {
                                this.f310596f.mo28211k(((C113425ff) this.f310600j.mo27525b()).mo100136b(), "process response", new C111737r(this, epVar, rVar));
                            } else {
                                mo99222d(((C113425ff) this.f310600j.mo27525b()).mo100138d(), epVar, rVar);
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        ((C59052c) ((C59052c) f310591a.mo56226d()).mo56372aa(27296)).mo56386p("Invalid response: serviceEventData doesn't contain valid Tapas Response");
    }

    /* renamed from: b */
    public final C60870cx mo99220b(C113405ep epVar) {
        C60870cx cxVar;
        if (!this.f310598h.mo79746e(C90063do.f249457dr) || this.f310598h.mo79746e(C90063do.f249586gN)) {
            return mo99221c(epVar);
        }
        synchronized (this.f310604n) {
            cxVar = (C60870cx) Map.EL.computeIfAbsent(this.f310604n, Long.valueOf(epVar.mo100016a()), new C111729j(this, epVar));
            Collection.EL.removeIf(this.f310604n.entrySet(), C111730k.f310577a);
        }
        return cxVar;
    }

    /* renamed from: c */
    public final C60870cx mo99221c(C113405ep epVar) {
        C121538g gVar;
        Optional optional;
        boolean z;
        long j;
        C121537f fVar = f310592d;
        C121492b a = fVar.mo105233a("fetchResponse");
        this.f310594c.mo99804e(epVar.mo100016a(), C112976k.TAPAS_SERVER_FETCHER);
        C121493a aVar = new C121493a(fVar.f337270a.f337210b, "getTapasResponse");
        C121495c cVar = (C121495c) C121499g.f337178b.get();
        if (cVar == C121495c.OFF) {
            gVar = C121505m.f337191b;
        } else {
            gVar = new C121503k(aVar, C121510r.m200802b(), cVar);
        }
        C111728i iVar = this.f310595e;
        C113446ag agVar = this.f310603m;
        C53499f a2 = gVar.mo105204a();
        C88343yd ydVar = (C88343yd) C88344ye.f238913h.createBuilder();
        String p = epVar.mo100033p();
        ydVar.copyOnWrite();
        C88344ye yeVar = (C88344ye) ydVar.instance;
        p.getClass();
        yeVar.f238915a |= 1;
        yeVar.f238916b = p;
        long a3 = epVar.mo100016a();
        ydVar.copyOnWrite();
        C88344ye yeVar2 = (C88344ye) ydVar.instance;
        yeVar2.f238915a |= 2;
        yeVar2.f238917c = a3;
        C51331dt g = epVar.mo100023g();
        ydVar.copyOnWrite();
        C88344ye yeVar3 = (C88344ye) ydVar.instance;
        yeVar3.f238919e = g.f133647e;
        yeVar3.f238915a |= 8;
        Optional l = epVar.mo100029l();
        Objects.requireNonNull(ydVar);
        l.ifPresent(new C113442ac(ydVar));
        if (agVar.f314133a.mo79746e(C90063do.f249520fA)) {
            optional = ((C112471ap) agVar.f314134b.mo27525b()).mo99540k().filter(new C113443ad(agVar)).map(C113444ae.f314131a);
        } else {
            optional = Optional.empty();
        }
        Objects.requireNonNull(ydVar);
        optional.ifPresent(new C113445af(ydVar));
        if (a2 != null) {
            ydVar.copyOnWrite();
            C88344ye yeVar4 = (C88344ye) ydVar.instance;
            yeVar4.f238918d = a2;
            yeVar4.f238915a |= 4;
        }
        iVar.mo99215a((C88344ye) ydVar.build());
        SettableFuture settableFuture = new SettableFuture();
        C90873ag agVar2 = new C90873ag(C90877ak.m148471e(settableFuture, this.f310598h.mo79743a(C90063do.f249618gt), TimeUnit.MILLISECONDS, this.f310596f), this.f310596f, "handle failure", C111732m.f310579a);
        agVar2.mo85224b(TimeoutException.class, new C111733n(a));
        agVar2.mo85223a(new C111734o(a));
        long a4 = epVar.mo100016a();
        synchronized (this.f310597g) {
            java.util.Map map = this.f310597g;
            Long valueOf = Long.valueOf(a4);
            List list = (List) map.get(valueOf);
            if (list == null) {
                list = new ArrayList();
                this.f310597g.put(valueOf, list);
            } else {
                ((C59052c) ((C59052c) f310591a.mo56226d()).mo56372aa(27300)).mo56386p("Request ID already exists in task map");
            }
            list.add(new C111738s(epVar, settableFuture));
        }
        C60870cx i = this.f310596f.mo28209i(settableFuture, "Get Tapas search Response", new C111736q(this, gVar, a));
        String trim = epVar.mo100033p().trim();
        if (TextUtils.isEmpty(trim) && (!epVar.mo100029l().isPresent() || !((C49714d) epVar.mo100029l().get()).f128302b)) {
            if (C48674ai.BLUE_CHIP.equals(epVar.mo100024h())) {
                z = this.f310598h.mo79746e(C90063do.f249420dG);
            } else {
                z = this.f310598h.mo79746e(C90063do.f249419dF);
            }
            if (z) {
                int c = C111885bw.m185717c(epVar);
                C111885bw bwVar = (C111885bw) this.f310602l.mo27525b();
                if (c - 1 != 0) {
                    j = bwVar.f310893e.mo79743a(C90063do.f249483eQ);
                } else {
                    long j2 = bwVar.f310890b;
                    if (bwVar.f310892d) {
                        j2 += bwVar.f310889a - bwVar.f310891c;
                    }
                    j = j2;
                }
                return this.f310596f.mo28206f(C90877ak.m148471e(i, j, TimeUnit.MILLISECONDS, this.f310596f), "handle failure", Exception.class, new C111735p(this));
            }
            C58833ax c2 = ((C111708as) this.f310593b.mo27525b()).mo99211c(trim);
            if (c2.mo56113h()) {
                return (C60870cx) c2.mo56107c();
            }
        }
        return i;
    }

    /* renamed from: d */
    public final void mo99222d(boolean z, C113405ep epVar, C49728r rVar) {
        if (!z) {
            return;
        }
        if ((rVar.f128341a & 256) != 0) {
            int a = C49727q.m85711a(rVar.f128348h);
            if (a == 0) {
                a = 1;
            }
            if (a == 3) {
                ((C111725f) this.f310599i.mo27525b()).mo99218a(epVar, this);
            } else if (a == 2) {
                ((C111708as) this.f310593b.mo27525b()).mo99213e(rVar);
            }
        } else if (rVar.f128344d.isEmpty()) {
            ((C111725f) this.f310599i.mo27525b()).mo99218a(epVar, this);
        } else {
            ((C111708as) this.f310593b.mo27525b()).mo99213e(rVar);
        }
    }
}
