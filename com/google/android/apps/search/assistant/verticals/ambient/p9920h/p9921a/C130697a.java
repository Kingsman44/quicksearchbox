package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9921a;

import com.google.assistant.p3860as.C49748ak;
import com.google.assistant.p3860as.C49807u;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130697a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130699c f357868a;

    /* renamed from: b */
    public final /* synthetic */ Function f357869b;

    public /* synthetic */ C130697a(C130699c cVar, Function function) {
        this.f357868a = cVar;
        this.f357869b = function;
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
        C130699c cVar = this.f357868a;
        if (!((Boolean) this.f357869b.apply(obj)).booleanValue()) {
            return true;
        }
        C49807u uVar = ((C49748ak) obj).f128467b;
        if (uVar == null) {
            uVar = C49807u.f128653c;
        }
        return cVar.mo109790a(uVar);
    }
}
