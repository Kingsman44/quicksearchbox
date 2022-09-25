package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import p3186j$.util.function.Predicate;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69252r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ca */
/* compiled from: PG */
public final /* synthetic */ class C124102ca implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f342765a;

    public /* synthetic */ C124102ca(boolean z) {
        this.f342765a = z;
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
        return ((C69252r) obj).f185369e == this.f342765a;
    }
}
