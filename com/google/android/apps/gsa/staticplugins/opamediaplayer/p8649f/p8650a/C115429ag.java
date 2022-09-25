package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.google.assistant.p3897e.p3921j.C52585xe;
import com.google.assistant.p3897e.p3921j.C52589xi;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C115429ag implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f320254a;

    public /* synthetic */ C115429ag(String str) {
        this.f320254a = str;
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
        String str = this.f320254a;
        C52589xi xiVar = ((C52585xe) obj).f138082b;
        if (xiVar == null) {
            xiVar = C52589xi.f138090c;
        }
        return xiVar.f138093b.equals(str);
    }
}
