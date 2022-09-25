package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.content.ComponentName;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.o.a.f */
/* compiled from: PG */
public final /* synthetic */ class C34905f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C34905f f92558a = new C34905f();

    private /* synthetic */ C34905f() {
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
        return C34915p.m63773b((ComponentName) obj);
    }
}
