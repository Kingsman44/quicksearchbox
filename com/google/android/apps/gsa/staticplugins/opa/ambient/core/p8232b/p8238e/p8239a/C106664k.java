package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e.p8239a;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.p6437d.p6439b.C83606a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.C106617a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8233a.C106618a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8233a.C106619b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8233a.C106620c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8233a.C106621d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.C106703g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106727g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106728h;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.assistant.p3860as.C49750am;
import com.google.assistant.p3860as.C49752ao;
import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3860as.C49796j;
import com.google.assistant.p3860as.C49798l;
import com.google.assistant.p3860as.C49812z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.a.k */
/* compiled from: PG */
public final class C106664k implements C83606a {

    /* renamed from: a */
    public final C58974d f297327a;

    /* renamed from: b */
    public final C106617a f297328b;

    /* renamed from: c */
    public final C60887da f297329c;

    /* renamed from: d */
    public final C106703g f297330d;

    /* renamed from: e */
    private final C86124t f297331e;

    /* renamed from: f */
    private final C106728h f297332f;

    public C106664k(C106617a aVar, C60887da daVar, C86124t tVar, C106728h hVar, C83564a aVar2, C106703g gVar) {
        this.f297328b = aVar;
        this.f297329c = daVar;
        this.f297331e = tVar;
        this.f297332f = hVar;
        this.f297327a = aVar2.mo76901b(this);
        this.f297330d = gVar;
    }

    /* renamed from: d */
    private static Optional m177420d(C49752ao aoVar, C58528ij ijVar) {
        C106620c cVar = new C106620c(new C106621d(ijVar));
        C62971cq cqVar = aoVar.f128478a;
        C106663j jVar = C106663j.f297326a;
        C106654a aVar = C106654a.f297314a;
        Stream filter = Collection.EL.stream(cqVar).filter(new C106618a(cVar, jVar));
        Objects.requireNonNull(aVar);
        return filter.map(new C106619b()).findFirst();
    }

    /* renamed from: a */
    public final C60870cx mo76965a() {
        return C60922j.m93044g(this.f297328b.mo95601a(), new C106655b(this), this.f297329c);
    }

    /* renamed from: b */
    public final C60870cx mo76966b() {
        return C106727g.m177484a(this.f297332f, new C106657d(this), C106656c.f297316a, this.f297329c);
    }

    /* renamed from: c */
    public final C58485gu mo95609c(Optional optional, boolean z, boolean z2) {
        Optional optional2;
        C58528ij ijVar;
        ((C58970a) ((C58970a) this.f297327a.mo56224b()).mo56372aa(23178)).mo56359L("extractApplicationData(): mediaProfile:%b isMorning:%b isEvening:%b", Boolean.valueOf(optional.isPresent()), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (optional.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58526ih ihVar = new C58526ih();
        if (z) {
            ihVar.mo55373c(C49812z.SEMANTIC_MORNING);
        }
        if (z2) {
            ihVar.mo55373c(C49812z.SEMANTIC_EVENING);
        }
        C58528ij f = ihVar.mo55486f();
        Optional d = m177420d((C49752ao) optional.get(), f);
        if (f.isEmpty()) {
            optional2 = d;
        } else {
            optional2 = m177420d((C49752ao) optional.get(), C58733pz.f156496a);
        }
        C58495hd hdVar = (C58495hd) Collection.EL.stream((List) optional2.orElse(C58485gu.m89845m())).collect(C58370cn.m89403c(C106658e.f297318a, C106659f.f297319a, C106660g.f297320a));
        ((C58970a) ((C58970a) this.f297327a.mo56224b()).mo56372aa(23179)).mo56387q("extractApplicationData(): got currentApplications:%d", ((List) d.orElse(C58485gu.m89845m())).size());
        C49798l lVar = ((C49752ao) optional.get()).f128479b;
        if (lVar == null) {
            lVar = C49798l.f128635b;
        }
        C58480gp e = C58485gu.m89837e();
        C58526ih ihVar2 = new C58526ih();
        try {
            C58485gu c = C89988b.m146550c(this.f297331e.mo79758x(C90017bw.f247990bz));
            int size = c.size();
            for (int i = 0; i < size; i++) {
                Long l = (Long) c.get(i);
                C49794h a = C49794h.m85713a(l.intValue());
                if (a == null) {
                    ((C58970a) ((C58970a) this.f297327a.mo56226d()).mo56372aa(23181)).mo56389s("Failed to get an ApplicationCategory for number: %d", l);
                } else {
                    ihVar2.mo55373c(a);
                }
            }
            ijVar = ihVar2.mo55486f();
        } catch (NumberFormatException e2) {
            ((C58970a) ((C58970a) ((C58970a) this.f297327a.mo56226d()).mo56382g(e2)).mo56372aa(23182)).mo56389s("Invalid category flag value: %s", this.f297331e.mo79758x(C90017bw.f247990bz));
            ijVar = C58733pz.f156496a;
        }
        for (C49750am amVar : (List) d.orElseGet(C106661h.f297321a)) {
            int i2 = amVar.f128471a;
            if (i2 < 0 || i2 >= lVar.f128637a.size()) {
                ((C58970a) ((C58970a) this.f297327a.mo56225c()).mo56372aa(23180)).mo56393w("Invalid application index in lexicon. Application index: %d, lexicon size: %d.", i2, lVar.f128637a.size());
                return C58485gu.m89845m();
            }
            C49796j jVar = (C49796j) lVar.f128637a.get(i2);
            C49794h a2 = C49794h.m85713a(jVar.f128634c);
            if (a2 == null) {
                a2 = C49794h.UNDEFINED;
            }
            if (ijVar.contains(a2)) {
                C130696a b = C130701b.m213087b();
                b.mo109786b(jVar.f128633b);
                C49794h a3 = C49794h.m85713a(jVar.f128634c);
                if (a3 == null) {
                    a3 = C49794h.UNDEFINED;
                }
                ((C130735c) b).f357922b = Optional.m71637of(a3);
                b.mo109787c(amVar.f128472b);
                b.mo109789e(((Float) hdVar.getOrDefault(Integer.valueOf(i2), Float.valueOf(0.0f))).floatValue());
                e.mo55395g(b.mo109785a());
            }
        }
        return e.mo55394f();
    }
}
