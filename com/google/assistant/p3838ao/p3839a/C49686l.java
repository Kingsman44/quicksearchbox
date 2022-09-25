package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49603df;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.assistant.ao.a.l */
/* compiled from: PG */
public final /* synthetic */ class C49686l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C49603df f128247a;

    public /* synthetic */ C49686l(C49603df dfVar) {
        this.f128247a = dfVar;
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
        C49603df dfVar = this.f128247a;
        C49503d dVar = (C49503d) obj;
        int a = dVar.mo53267a();
        if (a == 0) {
            throw null;
        } else if (a != 1) {
            return false;
        } else {
            C49693s sVar = (C49693s) dVar;
            if (sVar.f128265a.isEmpty() || ((String) sVar.f128265a.get()).isEmpty()) {
                return true;
            }
            if (dfVar == null) {
                return false;
            }
            return dfVar.f128005a.contains(sVar.f128265a.get());
        }
    }
}
