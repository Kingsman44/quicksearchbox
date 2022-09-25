package com.google.assistant.p3838ao.p3839a.p3846f;

import com.google.assistant.p3838ao.p3839a.p3849i.C49670a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.assistant.ao.a.f.b */
/* compiled from: PG */
public final /* synthetic */ class C49638b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C49638b f128125a = new C49638b();

    private /* synthetic */ C49638b() {
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
        return C49670a.f128204c.contains((String) obj);
    }
}
