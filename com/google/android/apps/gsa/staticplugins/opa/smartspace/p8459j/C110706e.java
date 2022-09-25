package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j;

import com.google.android.apps.gsa.shared.p7066m.C90070dv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.j.e */
/* compiled from: PG */
public final /* synthetic */ class C110706e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C110707f f308467a;

    public /* synthetic */ C110706e(C110707f fVar) {
        this.f308467a = fVar;
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
        C110714m mVar = this.f308467a.f308470c;
        Integer valueOf = Integer.valueOf(((C123744bk) obj).f341810e);
        if (valueOf.intValue() == 7 && mVar.f308493j.mo79746e(C90070dv.f249755g)) {
            return true;
        }
        if (valueOf.intValue() == 16 && mVar.f308493j.mo79746e(C90070dv.f249749a)) {
            return true;
        }
        if (valueOf.intValue() == 41 && mVar.f308488e.mo77186y()) {
            return true;
        }
        if ((valueOf.intValue() == 25 && mVar.f308488e.mo77186y()) || valueOf.intValue() == 32 || valueOf.intValue() == 31) {
            return true;
        }
        if (valueOf.intValue() != 17 || !mVar.f308488e.mo77185x()) {
            return false;
        }
        return true;
    }
}
