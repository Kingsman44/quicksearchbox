package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62963cj;
import p3186j$.util.function.Predicate;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69252r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ce */
/* compiled from: PG */
public final /* synthetic */ class C124106ce implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C53306j f342769a;

    public /* synthetic */ C124106ce(C53306j jVar) {
        this.f342769a = jVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return new C62963cj(((C69252r) obj).f185368c, C69252r.f185363d).contains(this.f342769a);
    }
}
