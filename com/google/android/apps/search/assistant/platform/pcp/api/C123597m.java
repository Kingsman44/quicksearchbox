package com.google.android.apps.search.assistant.platform.pcp.api;

import com.google.android.apps.search.assistant.platform.pcp.crossprofile.C123687w;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123991o;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124081bi;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.m */
/* compiled from: PG */
public final class C123597m implements C123587c {

    /* renamed from: a */
    public static final C59071e f341493a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.api.m");

    /* renamed from: b */
    public final C124048ad f341494b;

    /* renamed from: c */
    public final C123604t f341495c;

    /* renamed from: d */
    public final C124100bz f341496d;

    /* renamed from: e */
    private final C124013j f341497e;

    /* renamed from: f */
    private final C124081bi f341498f;

    /* renamed from: g */
    private final Optional f341499g;

    /* renamed from: h */
    private final C123991o f341500h;

    public C123597m(C124013j jVar, C124081bi biVar, C124048ad adVar, Optional optional, C123604t tVar, C124100bz bzVar, C123991o oVar) {
        this.f341497e = jVar;
        this.f341498f = biVar;
        this.f341494b = adVar;
        this.f341499g = optional;
        this.f341495c = tVar;
        this.f341496d = bzVar;
        this.f341500h = oVar;
    }

    /* renamed from: h */
    public static C60870cx m202901h(C60870cx cxVar, C60870cx cxVar2) {
        return C47638k.m84753d(cxVar, cxVar2).mo51520a(new C123588d(cxVar, cxVar2), C60826bg.f164896a);
    }

    /* renamed from: i */
    public static Set m202902i(Set set) {
        return (Set) Collection.EL.stream(set).map(C123590f.f341478a).collect(Collectors.toCollection(C123591g.f341479a));
    }

    /* renamed from: a */
    public final C60870cx mo106041a(C53306j jVar, C123755bv bvVar, Optional optional, C123777f fVar, boolean z) {
        if (optional.isEmpty()) {
            return C60856cj.m92900i(C123746bm.f341818b);
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Set<Integer> i = m202902i((Set) optional.get());
        for (Integer num : i) {
            if (num.intValue() > 100000) {
                hashSet.add(num);
            } else {
                hashSet2.add(num);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        C60870cx a = this.f341500h.mo106224a(arrayList);
        C60870cx a2 = this.f341497e.mo106228a(jVar, bvVar, Optional.m71637of(hashSet2), fVar, z);
        C123595k kVar = new C123595k();
        C60856cj.m92911t(a2, C47810es.m84974n(kVar), C60826bg.f164896a);
        C60870cx b = C47638k.m84751b(a, a2).mo51521b(new C123593i(this, jVar, i, bvVar, fVar), C60826bg.f164896a);
        C58528ij d = this.f341494b.mo106251d(jVar, i);
        if (mo106051k(d)) {
            C60870cx h = m202901h(b, C47638k.m84753d(((C123687w) this.f341499g.get()).mo106088b(d)).mo51521b(new C123594j(this, jVar, d, bvVar, fVar), C60826bg.f164896a));
            mo106050j(h, jVar);
            return h;
        }
        mo106050j(b, jVar);
        return b;
    }

    /* renamed from: b */
    public final C60870cx mo106042b(C53306j jVar, Set set, boolean z, C123755bv bvVar) {
        return mo106043c(jVar, set, z, bvVar, C123777f.f341922a);
    }

    /* renamed from: c */
    public final C60870cx mo106043c(C53306j jVar, Set set, boolean z, C123755bv bvVar, C123777f fVar) {
        C59104x b = f341493a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.DataQuery");
        ((C59052c) ((C59052c) b).mo56372aa(35152)).mo56354G("%s getProactiveContent: %s", jVar, set);
        Set i = m202902i(set);
        C60870cx g = mo106049g(jVar, i, bvVar, fVar, z, false);
        C58528ij d = this.f341494b.mo106251d(jVar, i);
        if (mo106051k(d)) {
            C60870cx h = m202901h(g, mo106048f(jVar, d, bvVar, fVar, z, false));
            mo106050j(h, jVar);
            return h;
        }
        mo106050j(g, jVar);
        return g;
    }

    /* renamed from: d */
    public final void mo106044d(C123598n nVar) {
        this.f341495c.mo106054a(nVar);
    }

    /* renamed from: e */
    public final void mo106045e(C123598n nVar) {
        this.f341495c.f341512b.remove(nVar);
    }

    /* renamed from: f */
    public final C60870cx mo106048f(C53306j jVar, C58528ij ijVar, C123755bv bvVar, C123777f fVar, boolean z, boolean z2) {
        C60870cx a = ((C123687w) this.f341499g.get()).mo106087a(jVar, ijVar, z, bvVar, fVar, z2);
        return C47638k.m84753d(a).mo51520a(new C123589e(a), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo106049g(C53306j jVar, Set set, C123755bv bvVar, C123777f fVar, boolean z, boolean z2) {
        C60870cx f = this.f341498f.mo106275f(jVar, set, z, bvVar, fVar, z2);
        if (!this.f341499g.isPresent()) {
            return f;
        }
        C123687w wVar = (C123687w) this.f341499g.get();
        return (!wVar.mo106089c() || !wVar.mo106090d()) ? f : C60922j.m93045h(f, C47810es.m84966f(C123592h.f341480a), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final void mo106050j(C60870cx cxVar, C53306j jVar) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C123596l(this, jVar)), C60826bg.f164896a);
    }

    /* renamed from: k */
    public final boolean mo106051k(C58528ij ijVar) {
        return !ijVar.isEmpty() && this.f341499g.isPresent() && ((C123687w) this.f341499g.get()).mo106089c() && !((C123687w) this.f341499g.get()).mo106090d();
    }
}
