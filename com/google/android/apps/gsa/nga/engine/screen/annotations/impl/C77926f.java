package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.assist.C9410f;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.f */
/* compiled from: PG */
public final /* synthetic */ class C77926f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77926f f214664a = new C77926f();

    private /* synthetic */ C77926f() {
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
        C9410f fVar = (C9410f) obj;
        return ScreenAnnotationEngineImpl.f214630b.contains(fVar.f32693b) || Collection.EL.stream(fVar.f32696e).anyMatch(C77929i.f214667a);
    }
}
