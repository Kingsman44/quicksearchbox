package com.google.android.libraries.assistant.auto.tng.p1272t.p1273a.p1274a;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.t.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C16444a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C16444a f48349a = new C16444a();

    private /* synthetic */ C16444a() {
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
        return ((String) ((Map.Entry) obj).getKey()).contains("assistant_auto_tng_libraries");
    }
}
