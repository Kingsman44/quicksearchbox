package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j.C110714m;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.k */
/* compiled from: PG */
public final /* synthetic */ class C110823k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123744bk f308768a;

    public /* synthetic */ C110823k(C123744bk bkVar) {
        this.f308768a = bkVar;
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
        C123744bk bkVar = this.f308768a;
        C50818do doVar = ((C83741am) obj).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        return doVar.f132307d == C110714m.m184429a(bkVar);
    }
}
