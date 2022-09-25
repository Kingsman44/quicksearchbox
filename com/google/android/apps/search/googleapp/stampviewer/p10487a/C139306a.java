package com.google.android.apps.search.googleapp.stampviewer.p10487a;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.a.a */
/* compiled from: PG */
public final /* synthetic */ class C139306a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C139306a f378892a = new C139306a();

    private /* synthetic */ C139306a() {
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
        return ((Boolean) ((Map.Entry) obj).getValue()).booleanValue();
    }
}
