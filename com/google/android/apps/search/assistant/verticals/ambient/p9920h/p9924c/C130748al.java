package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130807i;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130809k;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9921a.C130697a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9921a.C130698b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9921a.C130699c;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9921a.C130700d;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130734d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
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
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.al */
/* compiled from: PG */
public final class C130748al implements C130807i {

    /* renamed from: a */
    public static final C58974d f357945a = C58974d.m91136j();

    /* renamed from: b */
    private final C130734d f357946b;

    /* renamed from: c */
    private final C60887da f357947c;

    /* renamed from: d */
    private final C130809k f357948d;

    /* renamed from: e */
    private final C58528ij f357949e;

    public C130748al(C130734d dVar, C60887da daVar, C130809k kVar, C65599b bVar) {
        this.f357946b = dVar;
        this.f357947c = daVar;
        this.f357948d = kVar;
        C58526ih ihVar = new C58526ih();
        for (Integer num : bVar.f178301a) {
            C49794h a = C49794h.m85713a(num.intValue());
            if (a == null) {
                ((C58970a) ((C58970a) f357945a.mo56226d()).mo56372aa(38968)).mo56389s("Failed to get an ApplicationCategory for number: %d", num);
            } else {
                ihVar.mo55373c(a);
            }
        }
        this.f357949e = ihVar.mo55486f();
    }

    /* renamed from: d */
    private static Optional m213137d(C49752ao aoVar, C58528ij ijVar) {
        C130699c cVar = new C130699c(new C130700d(ijVar));
        C62971cq cqVar = aoVar.f128478a;
        C130741ae aeVar = C130741ae.f357935a;
        C130742af afVar = C130742af.f357936a;
        Stream filter = Collection.EL.stream(cqVar).filter(new C130697a(cVar, aeVar));
        Objects.requireNonNull(afVar);
        return filter.map(new C130698b()).findFirst();
    }

    /* renamed from: a */
    public final C60870cx mo109808a() {
        return C60922j.m93044g(this.f357946b.mo109799a(), C47810es.m84963c(new C130740ad(this)), this.f357947c);
    }

    /* renamed from: b */
    public final C60870cx mo109809b() {
        C60870cx a = this.f357948d.mo109813a();
        C60870cx b = this.f357948d.mo109814b();
        C60870cx a2 = this.f357946b.mo109799a();
        return C47638k.m84753d(a2, a, b).mo51521b(new C130747ak(this, a2, a, b), this.f357947c);
    }

    /* renamed from: c */
    public final C58485gu mo109810c(Optional optional, boolean z, boolean z2) {
        Optional optional2;
        C58974d dVar = f357945a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(38965)).mo56359L("extractApplicationData(): mediaProfile:%b isMorning:%b isEvening:%b", Boolean.valueOf(optional.isPresent()), Boolean.valueOf(z), Boolean.valueOf(z2));
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
        Optional d = m213137d((C49752ao) optional.get(), f);
        if (f.isEmpty()) {
            optional2 = d;
        } else {
            optional2 = m213137d((C49752ao) optional.get(), C58733pz.f156496a);
        }
        C58495hd hdVar = (C58495hd) Collection.EL.stream((List) optional2.orElse(C58485gu.m89845m())).collect(C58370cn.m89403c(C130743ag.f357937a, C130744ah.f357938a, C130745ai.f357939a));
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(38966)).mo56387q("extractApplicationData(): got currentApplications:%d", ((List) d.orElse(C58485gu.m89845m())).size());
        C49798l lVar = ((C49752ao) optional.get()).f128479b;
        if (lVar == null) {
            lVar = C49798l.f128635b;
        }
        C58480gp e = C58485gu.m89837e();
        for (C49750am amVar : (List) d.orElseGet(C130746aj.f357940a)) {
            int i = amVar.f128471a;
            if (i < 0 || i >= lVar.f128637a.size()) {
                ((C58970a) ((C58970a) f357945a.mo56225c()).mo56372aa(38967)).mo56393w("Invalid application index in lexicon. Application index: %d, lexicon size: %d.", i, lVar.f128637a.size());
                return C58485gu.m89845m();
            }
            C49796j jVar = (C49796j) lVar.f128637a.get(i);
            C58528ij ijVar = this.f357949e;
            C49794h a = C49794h.m85713a(jVar.f128634c);
            if (a == null) {
                a = C49794h.UNDEFINED;
            }
            if (ijVar.contains(a)) {
                C130696a b = C130701b.m213087b();
                b.mo109786b(jVar.f128633b);
                C49794h a2 = C49794h.m85713a(jVar.f128634c);
                if (a2 == null) {
                    a2 = C49794h.UNDEFINED;
                }
                ((C130735c) b).f357922b = Optional.m71637of(a2);
                b.mo109787c(amVar.f128472b);
                b.mo109789e(((Float) hdVar.getOrDefault(Integer.valueOf(i), Float.valueOf(0.0f))).floatValue());
                e.mo55395g(b.mo109785a());
            }
        }
        return e.mo55394f();
    }
}
