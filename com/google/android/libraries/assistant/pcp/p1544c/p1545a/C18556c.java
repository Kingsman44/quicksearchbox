package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C18556c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18556c f52568a = new C18556c();

    private /* synthetic */ C18556c() {
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
        return ((Optional) ((Map.Entry) obj).getValue()).isPresent();
    }
}
