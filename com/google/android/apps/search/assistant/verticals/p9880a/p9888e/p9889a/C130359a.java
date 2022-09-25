package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.assistant.p3931f.p3939c.C52828e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130359a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130359a f357279a = new C130359a();

    private /* synthetic */ C130359a() {
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
        C52828e eVar = (C52828e) obj;
        return !eVar.f138604a.isEmpty() && !eVar.f138606c.isEmpty();
    }
}
