package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10130b;

import com.google.common.p4526f.C59071e;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C133207b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C133207b f363075a = new C133207b();

    private /* synthetic */ C133207b() {
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
        C59071e eVar = C133215j.f363083a;
        C65806cj a = C65806cj.m96809a(((C65798cb) obj).f178859d);
        if (a == null) {
            a = C65806cj.UNKNOWN_SETTING_TYPE;
        }
        return a == C65806cj.SEARCH_AND_ASSISTANT;
    }
}
