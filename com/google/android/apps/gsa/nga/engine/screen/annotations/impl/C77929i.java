package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.assist.C9405d;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.i */
/* compiled from: PG */
public final /* synthetic */ class C77929i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77929i f214667a = new C77929i();

    private /* synthetic */ C77929i() {
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
        return Collection.EL.stream(ScreenAnnotationEngineImpl.f214631c).anyMatch(new C77927g((C9405d) obj));
    }
}
