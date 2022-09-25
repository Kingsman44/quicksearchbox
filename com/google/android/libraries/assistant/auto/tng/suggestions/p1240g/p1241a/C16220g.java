package com.google.android.libraries.assistant.auto.tng.suggestions.p1240g.p1241a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16115bn;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1240g.C16213a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28376al;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.logging.p2185ve.synthetic.C28465i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28470n;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.g.a.g */
/* compiled from: PG */
public final class C16220g implements C16213a {

    /* renamed from: a */
    public final C28463g f47795a;

    /* renamed from: b */
    public final C28463g f47796b;

    /* renamed from: c */
    public final C28463g f47797c;

    /* renamed from: d */
    public final C28443m f47798d;

    /* renamed from: e */
    public final C28310af f47799e;

    /* renamed from: f */
    public final Map f47800f = new ConcurrentHashMap();

    /* renamed from: g */
    public final Map f47801g = new ConcurrentHashMap();

    /* renamed from: h */
    private final Executor f47802h;

    /* renamed from: i */
    private final AccountId f47803i;

    public C16220g(C28465i iVar, C28443m mVar, AccountId accountId, Executor executor, C28310af afVar) {
        this.f47795a = iVar.mo33923a(C58733pz.f156496a);
        this.f47796b = iVar.mo33923a(C58733pz.f156496a);
        this.f47797c = iVar.mo33923a(C58733pz.f156496a);
        this.f47798d = mVar;
        this.f47802h = new C60904dr(executor);
        this.f47799e = afVar;
        this.f47803i = accountId;
    }

    /* renamed from: g */
    public static void m33254g(Map map, C28463g gVar) {
        Map.EL.computeIfPresent(map, "root", new C16218e(gVar));
        map.clear();
    }

    /* renamed from: a */
    public final C60870cx mo22850a(List list) {
        if (list.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60866ct.f164955a;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C16217d dVar = new C16217d(this, list);
        return C60856cj.m92904m(C47810es.m84978r(dVar), this.f47802h);
    }

    /* renamed from: b */
    public final C60870cx mo22851b(List list) {
        if (list.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60866ct.f164955a;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C16214a aVar = new C16214a(this, list);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f47802h);
    }

    /* renamed from: c */
    public final C60870cx mo22852c() {
        C16215b bVar = new C16215b(this);
        return C60856cj.m92904m(C47810es.m84978r(bVar), this.f47802h);
    }

    /* renamed from: d */
    public final void mo22853d(C16115bn bnVar, C28442l lVar) {
        C58976aa aaVar = C58975e.f156826a;
        Optional.ofNullable((C28439i) this.f47801g.get(bnVar.mo22777e())).ifPresent(new C16219f(this, lVar));
    }

    /* renamed from: e */
    public final void mo22854e(C16143co coVar, C28442l lVar) {
        if (coVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        Optional.ofNullable((C28439i) this.f47800f.get(coVar.mo22804h())).ifPresent(new C16216c(this, lVar));
    }

    /* renamed from: f */
    public final C28439i mo22858f(boolean z, C28463g gVar) {
        C28313c a = this.f47799e.mo33805a(C28427h.m53115a(true != z ? 82842 : 115423));
        a.mo33859g(C45954d.m82060a(this.f47803i));
        a.mo33859g(C28375ak.m53061c(82844));
        C28439i b = gVar.mo33918b(a);
        gVar.mo33920d(b);
        return b;
    }

    /* renamed from: h */
    public final void mo22859h(String str, boolean z, C16335ai aiVar, C28439i iVar, java.util.Map map, C28463g gVar) {
        C28313c a = this.f47799e.mo33805a(C28427h.m53115a(true != z ? 82843 : 115300));
        gVar.mo33919c(iVar);
        C28439i a2 = C28470n.m53226a(iVar, a);
        int i = aiVar.f48094c;
        if (i > 0) {
            C28313c a3 = this.f47799e.mo33805a(C28427h.m53115a(i));
            if ((1 & aiVar.f48092a) != 0) {
                C63204j jVar = aiVar.f48093b;
                if (jVar == null) {
                    jVar = C63204j.f170749e;
                }
                a3.mo33858f(new C28353e(C28376al.f77109a, jVar));
            }
            gVar.mo33919c(a2);
            map.put(str, C28470n.m53226a(a2, a3));
            return;
        }
        map.put(str, a2);
    }
}
