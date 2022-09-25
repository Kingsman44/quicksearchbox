package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.q */
/* compiled from: PG */
public final /* synthetic */ class C106392q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106394s f296748a;

    public /* synthetic */ C106392q(C106394s sVar) {
        this.f296748a = sVar;
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
        C106394s sVar = this.f296748a;
        String str = (String) obj;
        if (sVar.f296750a.mo79746e(C90037cp.f248471az)) {
            return str.matches("(.*)(%([^%]+)%)(.*)");
        }
        if (sVar.f296750a.mo79746e(C90037cp.f248422aC) || !str.matches("(.*)(%([^%]+)%)(.*)")) {
            return true;
        }
        return false;
    }
}
