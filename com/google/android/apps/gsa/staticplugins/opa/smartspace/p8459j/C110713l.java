package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123774cn;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.j.l */
/* compiled from: PG */
public final /* synthetic */ class C110713l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C110713l f308483a = new C110713l();

    private /* synthetic */ C110713l() {
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
        C123744bk bkVar = (C123744bk) obj;
        int a = C123774cn.m203111a(bkVar.f341815j);
        if (a != 0 && a == 2) {
            return true;
        }
        int i = bkVar.f341815j;
        int a2 = C123774cn.m203111a(i);
        if (a2 != 0 && a2 == 3) {
            return true;
        }
        int a3 = C123774cn.m203111a(i);
        return a3 != 0 && a3 == 4;
    }
}
