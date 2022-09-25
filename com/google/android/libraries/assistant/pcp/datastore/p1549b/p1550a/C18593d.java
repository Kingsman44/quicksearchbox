package com.google.android.libraries.assistant.pcp.datastore.p1549b.p1550a;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C18593d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18593d f52617a = new C18593d();

    private /* synthetic */ C18593d() {
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
        return ((Map.Entry) obj).getKey() != null;
    }
}
