package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.common.p4535g.C59203do;
import java.util.regex.Pattern;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.ao */
/* compiled from: PG */
public final /* synthetic */ class C109391ao implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109391ao f304677a = new C109391ao();

    private /* synthetic */ C109391ao() {
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
        C123766cf cfVar = (C123766cf) obj;
        Pattern pattern = C109398av.f304687a;
        int i = cfVar.f341886a;
        return ((i & 1) == 0 || (i & 32) == 0 || cfVar.f341892g == C59203do.f157270a) ? false : true;
    }
}
