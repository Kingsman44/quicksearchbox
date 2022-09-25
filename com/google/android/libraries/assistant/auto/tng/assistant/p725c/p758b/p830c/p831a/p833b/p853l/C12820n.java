package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.n */
/* compiled from: PG */
public final /* synthetic */ class C12820n implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C12820n f40028a = new C12820n();

    private /* synthetic */ C12820n() {
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
        C59071e eVar = C12830x.f40040a;
        return ((C51943ew) obj).f136289c.equals("smart_actions_field_id");
    }
}
