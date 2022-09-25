package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.au */
/* compiled from: PG */
public final /* synthetic */ class C106886au implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f297783a;

    public /* synthetic */ C106886au(boolean z) {
        this.f297783a = z;
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
        boolean z = this.f297783a;
        C58485gu guVar = C106918bz.f297826a;
        int i = ((C123744bk) obj).f341810e;
        if (i == 9) {
            return !z;
        }
        if (i != 19) {
            return true;
        }
        return z;
    }
}
