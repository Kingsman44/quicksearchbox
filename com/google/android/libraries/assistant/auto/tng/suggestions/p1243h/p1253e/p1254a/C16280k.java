package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.p1254a;

import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15968a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1251c.C16247a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.android.libraries.assistant.pcp.C18701g;
import com.google.android.libraries.assistant.pcp.p1557g.C18768g;
import com.google.android.libraries.assistant.pcp.p1573k.C18933m;
import com.google.android.libraries.assistant.pcp.p1573k.C18934n;
import com.google.android.libraries.assistant.pcp.p1573k.C18935o;
import com.google.android.libraries.assistant.pcp.p1573k.C18936p;
import com.google.android.libraries.assistant.pcp.p1573k.C18937q;
import com.google.android.libraries.assistant.pcp.p1573k.C18938r;
import com.google.android.libraries.assistant.pcp.p1573k.C18939s;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.android.concurrent.C58301z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.k */
/* compiled from: PG */
public final class C16280k implements C16269a {

    /* renamed from: a */
    public static final Duration f47920a = Duration.ofMinutes(20);

    /* renamed from: k */
    private static final C59071e f47921k = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.k");

    /* renamed from: l */
    private static final Duration f47922l = Duration.ofMinutes(1);

    /* renamed from: b */
    public final Map f47923b = new ConcurrentHashMap();

    /* renamed from: c */
    public final C60888db f47924c;

    /* renamed from: d */
    public final Executor f47925d;

    /* renamed from: e */
    public final C15973f f47926e;

    /* renamed from: f */
    public final C15968a f47927f;

    /* renamed from: g */
    public final C18701g f47928g;

    /* renamed from: h */
    public final C60950i f47929h;

    /* renamed from: i */
    public final C18768g f47930i;

    /* renamed from: j */
    public final C69464a f47931j;

    /* renamed from: m */
    private final C18939s f47932m;

    /* renamed from: n */
    private final C21370a f47933n;

    public C16280k(C60888db dbVar, Executor executor, C18768g gVar, C18939s sVar, C18701g gVar2, C15973f fVar, C15968a aVar, C21370a aVar2, C60950i iVar, C69464a aVar3) {
        this.f47924c = dbVar;
        this.f47925d = executor;
        this.f47930i = gVar;
        this.f47928g = gVar2;
        this.f47932m = sVar;
        this.f47926e = fVar;
        this.f47927f = aVar;
        this.f47929h = iVar;
        this.f47933n = aVar2;
        this.f47931j = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo22867a(C53306j jVar, List list, boolean z, C53270hr hrVar, Optional optional) {
        C60870cx cxVar;
        Object obj;
        C59104x b = f47921k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveClientPlatform");
        ((C59052c) ((C59052c) b).mo56372aa(46666)).mo56389s("Syncing with proactive using %s", hrVar.name());
        if (jVar.equals(C53306j.AUTO_EMBEDDED)) {
            this.f47926e.f47378s.set(this.f47929h.mo57444a().toEpochMilli());
        }
        C18939s sVar = this.f47932m;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (optional.isPresent()) {
            C123777f fVar = (C123777f) optional.get();
            C62940bt r1 = C62942bv.checkIsLite(C123726at.f341744i);
            fVar.mo58887l(r1);
            if (fVar.f169962ag.mo58857o(r1.f169971d)) {
                C123777f fVar2 = (C123777f) optional.get();
                C62940bt r12 = C62942bv.checkIsLite(C123726at.f341744i);
                fVar2.mo58887l(r12);
                Object l = fVar2.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj = r12.f169969b;
                } else {
                    obj = r12.mo58889c(l);
                }
                Stream map = Collection.EL.stream(((C123726at) obj).f341747b).map(new C18933m(sVar)).filter(C18934n.f53232a).map(C18935o.f53233a);
                Objects.requireNonNull(linkedHashSet);
                map.forEach(new C18936p(linkedHashSet));
            }
        }
        C18937q qVar = new C18937q(sVar, linkedHashSet);
        C47633f h = C47633f.m84733g(C47633f.m84733g(C60856cj.m92904m(C47810es.m84978r(qVar), sVar.f53244c)).mo51515h(new C18938r(sVar, linkedHashSet, jVar, optional, list), sVar.f53244c)).mo51515h(new C16272c(this, jVar, hrVar), this.f47925d);
        if (jVar == C53306j.AUTO_EMBEDDED) {
            cxVar = C47633f.m84733g(h).mo51516i(C16273d.f47907a, this.f47925d);
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        return C47638k.m84751b(cxVar, h).mo51521b(new C16274e(this, cxVar, list, h), this.f47925d);
    }

    /* renamed from: b */
    public final boolean mo22868b(C123598n nVar) {
        C53306j jVar = ((C16247a) nVar).f47853a;
        if (Map.EL.putIfAbsent(this.f47923b, jVar, nVar) != null) {
            C58976aa aaVar = C58975e.f156826a;
            jVar.name();
            return false;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        jVar.name();
        if (!jVar.equals(C53306j.AUTO_EMBEDDED)) {
            return true;
        }
        Runnable q = C47810es.m84977q(new C16277h(this, jVar));
        Duration duration = f47922l;
        C46459k.m82829b(C58301z.m89281a(q, duration.toMillis(), duration.toMillis(), TimeUnit.MILLISECONDS, this.f47933n, this.f47924c), "Failed to schedule next background sync.", new Object[0]);
        return true;
    }
}
