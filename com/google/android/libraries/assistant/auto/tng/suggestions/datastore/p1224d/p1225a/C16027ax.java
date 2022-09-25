package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15975a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1219a.p1220a.C15988a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1219a.p1220a.C15989b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1219a.p1220a.C15991d;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1221b.C15993a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1221b.C15994b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16078ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16092ar;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16107bf;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16116bo;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16144cp;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16171o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16334ah;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.ax */
/* compiled from: PG */
public final class C16027ax implements C16002a {

    /* renamed from: a */
    public static final C59071e f47450a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.ax");

    /* renamed from: b */
    public final C21370a f47451b;

    /* renamed from: c */
    public final Executor f47452c;

    /* renamed from: d */
    public final C15973f f47453d;

    /* renamed from: e */
    public final C16171o f47454e;

    /* renamed from: f */
    public final C16078ad f47455f;

    /* renamed from: g */
    public final C16116bo f47456g;

    /* renamed from: h */
    public final C16144cp f47457h;

    /* renamed from: i */
    public final C69464a f47458i;

    /* renamed from: j */
    public final C69464a f47459j;

    /* renamed from: k */
    private final Context f47460k;

    /* renamed from: l */
    private final C15975a f47461l;

    /* renamed from: m */
    private final C69464a f47462m;

    /* renamed from: n */
    private final C16092ar f47463n;

    /* renamed from: o */
    private final C16107bf f47464o;

    /* renamed from: p */
    private final C69464a f47465p;

    /* renamed from: q */
    private final C15991d f47466q;

    public C16027ax(C16171o oVar, C16078ad adVar, C16092ar arVar, C16107bf bfVar, C16116bo boVar, C16144cp cpVar, C21370a aVar, Executor executor, C69464a aVar2, C15975a aVar3, Context context, C15991d dVar, C15973f fVar, C69464a aVar4, C69464a aVar5, C69464a aVar6) {
        this.f47451b = aVar;
        this.f47452c = executor;
        this.f47462m = aVar2;
        this.f47461l = aVar3;
        this.f47460k = context;
        this.f47466q = dVar;
        this.f47453d = fVar;
        this.f47454e = oVar;
        this.f47455f = adVar;
        this.f47463n = arVar;
        this.f47464o = bfVar;
        this.f47456g = boVar;
        this.f47457h = cpVar;
        this.f47458i = aVar4;
        this.f47459j = aVar5;
        this.f47465p = aVar6;
    }

    /* renamed from: u */
    public static String m32836u(String str, AtomicLong atomicLong) {
        long andIncrement = atomicLong.getAndIncrement();
        return str + andIncrement;
    }

    /* renamed from: v */
    public static HashSet m32837v(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C16170n) it.next()).mo22752f());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final C60870cx mo22644a() {
        C60870cx c = this.f47455f.mo22708c();
        C16003a aVar = new C16003a(this);
        return C60922j.m93045h(c, C47810es.m84966f(aVar), this.f47452c);
    }

    /* renamed from: b */
    public final C60870cx mo22645b(String str) {
        C60870cx d = this.f47455f.mo22709d(str);
        C16048u uVar = new C16048u(this, str);
        return C60922j.m93045h(d, C47810es.m84966f(uVar), this.f47452c);
    }

    /* renamed from: c */
    public final C60870cx mo22646c(String str) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f47463n.mo22736a(str);
    }

    /* renamed from: d */
    public final C60870cx mo22647d(String str) {
        C60870cx d = this.f47455f.mo22709d(str);
        C16017an anVar = new C16017an(this, str);
        return C60922j.m93045h(d, C47810es.m84966f(anVar), this.f47452c);
    }

    /* renamed from: e */
    public final C60870cx mo22648e() {
        return this.f47463n.mo22737b();
    }

    /* renamed from: f */
    public final C60870cx mo22649f(String str) {
        return this.f47463n.mo22738c(str);
    }

    /* renamed from: g */
    public final C60870cx mo22650g(C16090ap apVar) {
        return this.f47463n.mo22739d(apVar);
    }

    /* renamed from: h */
    public final C60870cx mo22651h(C16090ap apVar, String str) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx c = this.f47455f.mo22708c();
        C58833ax g = this.f47453d.mo22632g(apVar);
        if (g.mo56113h()) {
            cxVar = C60856cj.m92900i(g);
        } else {
            cxVar = this.f47464o.mo22762b(apVar.mo22726c());
        }
        Optional findFirst = Collection.EL.stream(this.f47453d.mo22633h()).filter(new C16024au(apVar)).findFirst();
        if (findFirst.isPresent()) {
            cxVar2 = C60856cj.m92900i((C16091aq) findFirst.get());
        } else {
            C60870cx g2 = mo22650g(apVar);
            C16025av avVar = new C16025av(apVar);
            cxVar2 = C60922j.m93044g(g2, C47810es.m84963c(avVar), this.f47452c);
        }
        C16041n nVar = new C16041n(this, str);
        C60870cx h = C60922j.m93045h(cxVar2, C47810es.m84966f(nVar), this.f47452c);
        return C47638k.m84753d(c, cxVar, cxVar2, h).mo51520a(new C16042o(c, cxVar, cxVar2, h), this.f47452c);
    }

    /* renamed from: i */
    public final C60870cx mo22652i(String str) {
        return this.f47456g.mo22780a(str);
    }

    /* renamed from: j */
    public final C60870cx mo22653j(String str) {
        return this.f47457h.mo22807b(str);
    }

    /* renamed from: k */
    public final C60870cx mo22654k(String str) {
        return this.f47457h.mo22808c(str);
    }

    /* renamed from: l */
    public final C60870cx mo22655l(C16091aq aqVar) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f47463n.mo22740e(aqVar);
    }

    /* renamed from: m */
    public final C60870cx mo22656m(String str) {
        C60870cx cxVar;
        C15991d dVar = this.f47466q;
        C58528ij H = C58528ij.m90008H(((String) this.f47465p.mo17428b()).split(","));
        if (!dVar.f47399c.f47379t.isEmpty()) {
            cxVar = C60856cj.m92900i(dVar.f47399c.f47379t);
        } else {
            C60870cx d = dVar.f47397a.mo46042d();
            C15988a aVar = C15988a.f47394a;
            cxVar = C60922j.m93044g(d, C47810es.m84963c(aVar), dVar.f47398b);
        }
        C15989b bVar = new C15989b(H);
        return C47633f.m84733g(C60922j.m93044g(cxVar, C47810es.m84963c(bVar), dVar.f47398b)).mo51516i(new C16021ar(this), this.f47452c).mo51516i(new C16022as(this, str), this.f47452c);
    }

    /* renamed from: n */
    public final C60870cx mo22657n(List list) {
        return C47638k.m84750a((C58485gu) Collection.EL.stream(list).map(new C16009af(this)).collect(C58370cn.f155946a)).mo51520a(C16011ah.f47424a, this.f47452c);
    }

    /* renamed from: o */
    public final C60870cx mo22658o() {
        C15994b bVar = (C15994b) this.f47462m.mo17428b();
        C15993a aVar = new C15993a(bVar, this.f47460k);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(aVar), bVar.f47405a);
        C16008ae aeVar = new C16008ae(this);
        return C60922j.m93045h(m, C47810es.m84966f(aeVar), this.f47452c);
    }

    /* renamed from: p */
    public final C60870cx mo22659p(List list, List list2, C16091aq aqVar) {
        C58976aa aaVar = C58975e.f156826a;
        String i = aqVar.mo22735i();
        return C47633f.m84733g(this.f47456g.mo22782c(i)).mo51516i(new C16037j(this, i), this.f47452c).mo51516i(new C16038k(this, (List) Collection.EL.stream(list).map(new C16036i(this, list2, aqVar)).collect(Collectors.toCollection(C16031d.f47472a))), this.f47452c);
    }

    /* renamed from: q */
    public final C60870cx mo22660q(List list, C16091aq aqVar) {
        String i = aqVar.mo22735i();
        C58976aa aaVar = C58975e.f156826a;
        return C47633f.m84733g(this.f47457h.mo22810e(i)).mo51516i(new C16026aw(this, i), this.f47452c).mo51516i(new C16029b(this, list, i, aqVar), this.f47452c);
    }

    /* renamed from: r */
    public final C60870cx mo22661r(int i) {
        return this.f47464o.mo22761a(i);
    }

    /* renamed from: s */
    public final C60870cx mo22662s(String str) {
        return this.f47456g.mo22783d(str);
    }

    /* renamed from: t */
    public final C60870cx mo22663t(String str) {
        return this.f47457h.mo22811f(str);
    }

    /* renamed from: w */
    public final C16335ai mo22665w(C16335ai aiVar, C16090ap apVar, C16327aa aaVar, boolean z, int i) {
        String a = this.f47461l.mo22642a(apVar, aaVar, z, i, aiVar.f48095d);
        if (TextUtils.isEmpty(a)) {
            return aiVar;
        }
        C16334ah ahVar = (C16334ah) aiVar.toBuilder();
        ahVar.copyOnWrite();
        C16335ai aiVar2 = (C16335ai) ahVar.instance;
        a.getClass();
        aiVar2.f48092a |= 4;
        aiVar2.f48095d = a;
        return (C16335ai) ahVar.build();
    }
}
