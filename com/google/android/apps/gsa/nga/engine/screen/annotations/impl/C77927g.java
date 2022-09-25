package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.assist.C9405d;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.g */
/* compiled from: PG */
public final /* synthetic */ class C77927g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C9405d f214665a;

    public /* synthetic */ C77927g(C9405d dVar) {
        this.f214665a = dVar;
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
        C9405d dVar = this.f214665a;
        C58974d dVar2 = ScreenAnnotationEngineImpl.f214629a;
        return dVar.f32679e.contains((String) obj);
    }
}
