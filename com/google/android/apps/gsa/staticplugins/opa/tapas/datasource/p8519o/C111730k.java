package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.k */
/* compiled from: PG */
public final /* synthetic */ class C111730k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111730k f310577a = new C111730k();

    private /* synthetic */ C111730k() {
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
        C59071e eVar = C111739t.f310591a;
        return ((C60870cx) ((Map.Entry) obj).getValue()).isDone();
    }
}
