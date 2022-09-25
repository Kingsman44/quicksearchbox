package com.google.android.apps.gsa.nga.engine.education.p6016a;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.s */
/* compiled from: PG */
public final /* synthetic */ class C75668s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f210037a;

    public /* synthetic */ C75668s(Locale locale) {
        this.f210037a = locale;
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
        return C75674y.m121963j(this.f210037a, ((C75650ai) obj).mo71807k());
    }
}
