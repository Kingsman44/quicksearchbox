package com.google.android.apps.gsa.nga.engine.education.p6016a;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.x */
/* compiled from: PG */
public final /* synthetic */ class C75673x implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f210043a;

    public /* synthetic */ C75673x(Locale locale) {
        this.f210043a = locale;
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
        return C75674y.m121963j(this.f210043a, ((C75650ai) obj).mo71807k());
    }
}
