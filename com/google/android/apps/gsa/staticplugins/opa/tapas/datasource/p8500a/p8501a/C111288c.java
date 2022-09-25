package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8501a;

import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C111288c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111288c f309692a = new C111288c();

    private /* synthetic */ C111288c() {
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
        C59071e eVar = C111296k.f309706a;
        return !((C49335l) obj).f127517e.equals("schema.org/Thing");
    }
}
