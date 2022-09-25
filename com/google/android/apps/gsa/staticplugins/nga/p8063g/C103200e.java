package com.google.android.apps.gsa.staticplugins.nga.p8063g;

import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.g.e */
/* compiled from: PG */
public final /* synthetic */ class C103200e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C65806cj f287956a;

    public /* synthetic */ C103200e(C65806cj cjVar) {
        this.f287956a = cjVar;
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
        C65806cj cjVar = this.f287956a;
        C65806cj a = C65806cj.m96809a(((C65798cb) obj).f178859d);
        if (a == null) {
            a = C65806cj.UNKNOWN_SETTING_TYPE;
        }
        return a.equals(cjVar);
    }
}
