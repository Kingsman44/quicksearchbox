package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import java.util.Set;
import java.util.regex.Pattern;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.aq */
/* compiled from: PG */
public final /* synthetic */ class C109393aq implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f304679a;

    public /* synthetic */ C109393aq(Set set) {
        this.f304679a = set;
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
        Set set = this.f304679a;
        Pattern pattern = C109398av.f304687a;
        return !set.contains(((C123766cf) obj).f341889d);
    }
}
