package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.m */
/* compiled from: PG */
public final /* synthetic */ class C18898m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18898m f53182a = new C18898m();

    private /* synthetic */ C18898m() {
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
        return ((Map.Entry) obj).getValue() != null;
    }
}
