package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b.p */
/* compiled from: PG */
public final /* synthetic */ class C126016p implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C126016p f347287a = new C126016p();

    private /* synthetic */ C126016p() {
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
        C125143dq dqVar = (C125143dq) obj;
        C125141do doVar = dqVar.f345224b;
        if (doVar == null) {
            doVar = C125141do.f345217c;
        }
        if (doVar.f345219a.isEmpty()) {
            return false;
        }
        C125141do doVar2 = dqVar.f345224b;
        if (doVar2 == null) {
            doVar2 = C125141do.f345217c;
        }
        return !doVar2.f345220b.isEmpty();
    }
}
