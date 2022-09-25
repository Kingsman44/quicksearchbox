package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.n */
/* compiled from: PG */
public final /* synthetic */ class C75728n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210194a;

    /* renamed from: b */
    public final /* synthetic */ Optional f210195b;

    public /* synthetic */ C75728n(C75706ac acVar, Optional optional) {
        this.f210194a = acVar;
        this.f210195b = optional;
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
        return !this.f210194a.f210153d.mo74881ab((String) this.f210195b.orElse("CURRENT_APPLICATION_UNKNOWN"), ((C75650ai) obj).mo71806j());
    }
}
