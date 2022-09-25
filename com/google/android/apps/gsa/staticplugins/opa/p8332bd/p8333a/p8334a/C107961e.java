package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C107961e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C107961e f300399a = new C107961e();

    private /* synthetic */ C107961e() {
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
        C51098gh ghVar = (C51098gh) obj;
        if (ghVar.f133012b != 1 || ((C51058ev) ghVar.f133013c).f132944b.isEmpty()) {
            return false;
        }
        return true;
    }
}
