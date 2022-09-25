package com.google.android.apps.gsa.nga.engine.education.p6016a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.t */
/* compiled from: PG */
public final /* synthetic */ class C75669t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75674y f210038a;

    /* renamed from: b */
    public final /* synthetic */ C75647af[] f210039b;

    public /* synthetic */ C75669t(C75674y yVar, C75647af[] afVarArr) {
        this.f210038a = yVar;
        this.f210039b = afVarArr;
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
        C75674y yVar = this.f210038a;
        C75647af[] afVarArr = this.f210039b;
        C75650ai aiVar = (C75650ai) obj;
        if (aiVar.mo71803g().isPresent() && !yVar.f210046c.r((String) aiVar.mo71803g().get())) {
            return false;
        }
        int length = afVarArr.length;
        for (int i = 0; i < length; i = 1) {
            if (!aiVar.mo71800d().contains(afVarArr[0])) {
                return false;
            }
        }
        return true;
    }
}
