package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.ab */
/* compiled from: PG */
public final /* synthetic */ class C131370ab implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131370ab f359109a = new C131370ab();

    private /* synthetic */ C131370ab() {
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
        C51012dc dcVar = (C51012dc) obj;
        return (dcVar.f132815a & 2) != 0 && !dcVar.f132817c.isEmpty() && dcVar.f132819e.mo59173M();
    }
}
