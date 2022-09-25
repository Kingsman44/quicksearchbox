package com.google.android.libraries.assistant.soda.p1606e.p1607a;

import com.google.android.libraries.mdi.C28595b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.soda.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C19288b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C19288b f54011a = new C19288b();

    private /* synthetic */ C19288b() {
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
        return "hotmatch.data".equals(((C28595b) obj).f77798b);
    }
}
