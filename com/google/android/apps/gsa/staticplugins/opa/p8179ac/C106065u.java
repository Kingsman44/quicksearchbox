package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3814ai.p3815a.p3816a.C49172f;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.u */
/* compiled from: PG */
public final /* synthetic */ class C106065u implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106065u f296106a = new C106065u();

    private /* synthetic */ C106065u() {
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
        Map.Entry entry = (Map.Entry) obj;
        C59071e eVar = C106025ax.f295983a;
        return ((C49172f) entry.getValue()).f127150b && C106044bp.m176654a((C49172f) entry.getValue());
    }
}
