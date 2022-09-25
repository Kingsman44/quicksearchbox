package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.assistant.p3897e.p3921j.C52232kc;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.ai */
/* compiled from: PG */
public final /* synthetic */ class C92771ai implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f258893a = "fetch_assist_data_result";

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
        return ((C52232kc) obj).f137065b.equals(this.f258893a);
    }
}
