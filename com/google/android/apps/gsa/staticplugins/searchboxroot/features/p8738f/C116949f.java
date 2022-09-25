package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8738f;

import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.f.f */
/* compiled from: PG */
public final /* synthetic */ class C116949f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C116949f f324679a = new C116949f();

    private /* synthetic */ C116949f() {
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
        String str = (String) obj;
        try {
            C48667ab.m85252a(str);
            return true;
        } catch (IllegalArgumentException e) {
            C59104x c = C116953j.f324683a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "gmn.RankParsers");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32525)).mo56389s("Could not load adjuster: %s", str);
            return false;
        }
    }
}
