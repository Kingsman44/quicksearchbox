package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.ag */
/* compiled from: PG */
public final /* synthetic */ class C92769ag implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C92769ag f258891a = new C92769ag();

    private /* synthetic */ C92769ag() {
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
        C52083ep epVar = (C52083ep) obj;
        int i = epVar.f136691a;
        return (i & 1) != 0 && (i & 2) != 0 && epVar.f136692b == 3 && ((C52078ek) epVar.f136693c).f136674b == 3;
    }
}
