package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16106be;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.f */
/* compiled from: PG */
public final class C15973f {

    /* renamed from: v */
    private static final C59071e f47359v = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.f");

    /* renamed from: a */
    public final C21370a f47360a;

    /* renamed from: b */
    public final Map f47361b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map f47362c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map f47363d = new ConcurrentHashMap();

    /* renamed from: e */
    public final Map f47364e = new ConcurrentHashMap();

    /* renamed from: f */
    public final Map f47365f = new ConcurrentHashMap();

    /* renamed from: g */
    public final Map f47366g = new ConcurrentHashMap();

    /* renamed from: h */
    public C58485gu f47367h = C58485gu.m89845m();

    /* renamed from: i */
    public C58485gu f47368i = C58485gu.m89845m();

    /* renamed from: j */
    public C58485gu f47369j = C58485gu.m89845m();

    /* renamed from: k */
    public C58485gu f47370k = C58485gu.m89845m();

    /* renamed from: l */
    public C58485gu f47371l = C58485gu.m89845m();

    /* renamed from: m */
    public C58485gu f47372m = C58485gu.m89845m();

    /* renamed from: n */
    public C58485gu f47373n = C58485gu.m89845m();

    /* renamed from: o */
    public final AtomicLong f47374o;

    /* renamed from: p */
    public final Map f47375p;

    /* renamed from: q */
    public final Map f47376q;

    /* renamed from: r */
    public final Map f47377r;

    /* renamed from: s */
    public final AtomicLong f47378s;

    /* renamed from: t */
    public C58528ij f47379t;

    /* renamed from: u */
    public C58528ij f47380u;

    /* renamed from: w */
    private final Map f47381w = new ConcurrentHashMap();

    public C15973f(C21370a aVar) {
        this.f47360a = aVar;
        C58733pz pzVar = C58733pz.f156496a;
        new AtomicReference();
        new AtomicReference();
        new ConcurrentHashMap();
        this.f47374o = new AtomicLong(aVar.mo26870b());
        this.f47375p = new ConcurrentHashMap();
        this.f47376q = new ConcurrentHashMap();
        this.f47377r = new ConcurrentHashMap();
        this.f47378s = new AtomicLong(0);
        C58733pz pzVar2 = C58733pz.f156496a;
        this.f47379t = pzVar2;
        this.f47380u = pzVar2;
        new AtomicReference();
        new AtomicReference();
    }

    /* renamed from: a */
    public final C16143co mo22626a(String str) {
        return (C16143co) this.f47375p.get(str);
    }

    /* renamed from: b */
    public final C58833ax mo22627b() {
        if (this.f47368i.isEmpty()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(this.f47368i);
    }

    /* renamed from: c */
    public final C58833ax mo22628c() {
        if (this.f47369j.isEmpty()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(this.f47369j);
    }

    /* renamed from: d */
    public final C58833ax mo22629d(String str) {
        return C58833ax.m90833j((C16091aq) this.f47361b.get(str));
    }

    /* renamed from: e */
    public final C58833ax mo22630e(C16090ap apVar) {
        return C58833ax.m90833j((Instant) this.f47364e.get(apVar));
    }

    /* renamed from: f */
    public final C58833ax mo22631f(String str) {
        C16091aq aqVar = (C16091aq) this.f47361b.get(str);
        return aqVar != null ? C58833ax.m90834k(aqVar.mo22733g()) : C58836b.f156633a;
    }

    /* renamed from: g */
    public final C58833ax mo22632g(C16090ap apVar) {
        return C58833ax.m90833j((C16106be) this.f47362c.get(apVar));
    }

    /* renamed from: h */
    public final C58485gu mo22633h() {
        return C58485gu.m89842j(this.f47361b.values());
    }

    /* renamed from: i */
    public final C58485gu mo22634i(String str) {
        if (this.f47365f.isEmpty()) {
            return C58485gu.m89845m();
        }
        if (this.f47365f.containsKey(str)) {
            return (C58485gu) Map.EL.getOrDefault(this.f47365f, str, C58485gu.m89845m());
        }
        mo22636k();
        ((C59052c) ((C59052c) f47359v.mo56226d()).mo56372aa(46508)).mo56386p("Didn't fetch PCP suggestion when the locale changed");
        return C58485gu.m89845m();
    }

    /* renamed from: j */
    public final C58485gu mo22635j(String str) {
        if (this.f47366g.isEmpty()) {
            return C58485gu.m89845m();
        }
        if (this.f47366g.containsKey(str)) {
            return (C58485gu) Map.EL.getOrDefault(this.f47366g, str, C58485gu.m89845m());
        }
        mo22637l();
        ((C59052c) ((C59052c) f47359v.mo56226d()).mo56372aa(46509)).mo56386p("Didn't fetch PCP suggestion when the locale changed");
        return C58485gu.m89845m();
    }

    /* renamed from: k */
    public final void mo22636k() {
        this.f47365f.clear();
    }

    /* renamed from: l */
    public final void mo22637l() {
        this.f47366g.clear();
    }

    /* renamed from: m */
    public final synchronized void mo22638m(C16091aq aqVar) {
        Collection.EL.stream(this.f47361b.entrySet()).filter(new C15970c(aqVar)).findFirst().ifPresent(new C15971d(this));
        this.f47361b.put(aqVar.mo22735i(), aqVar);
    }

    /* renamed from: n */
    public final void mo22639n(C16090ap apVar, Boolean bool) {
        this.f47381w.put(apVar, bool);
    }

    /* renamed from: o */
    public final void mo22640o(C16090ap apVar, C15763a aVar) {
        this.f47363d.put(apVar, aVar);
    }

    /* renamed from: p */
    public final boolean mo22641p(C16090ap apVar) {
        return ((Boolean) Map.EL.getOrDefault(this.f47381w, apVar, true)).booleanValue();
    }
}
