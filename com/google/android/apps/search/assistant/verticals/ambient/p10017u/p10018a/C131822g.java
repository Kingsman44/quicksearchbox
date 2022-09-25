package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import java.io.File;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.g */
/* compiled from: PG */
public final /* synthetic */ class C131822g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131822g f360022a = new C131822g();

    private /* synthetic */ C131822g() {
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
        return ((File) obj).getName().startsWith("trace");
    }
}
