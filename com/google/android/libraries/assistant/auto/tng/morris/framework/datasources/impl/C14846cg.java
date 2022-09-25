package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cg */
/* compiled from: PG */
public final /* synthetic */ class C14846cg implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14846cg f44703a = new C14846cg();

    private /* synthetic */ C14846cg() {
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
        C59071e eVar = C14856cq.f44715a;
        return !((C14216b) obj).f43011c.equals("com.google.android.googlequicksearchbox");
    }
}
