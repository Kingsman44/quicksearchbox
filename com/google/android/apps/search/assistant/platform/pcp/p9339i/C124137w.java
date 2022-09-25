package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import p3186j$.util.function.Predicate;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69236b;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.w */
/* compiled from: PG */
public final /* synthetic */ class C124137w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f342825a;

    public /* synthetic */ C124137w(int i) {
        this.f342825a = i;
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
        return ((C69236b) obj).f185331b == this.f342825a;
    }
}
