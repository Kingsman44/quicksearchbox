package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53435nu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.l */
/* compiled from: PG */
public final /* synthetic */ class C16696l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C16696l f48866a = new C16696l();

    private /* synthetic */ C16696l() {
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
        C53435nu nuVar = (C53435nu) obj;
        if (nuVar.f140237b != 5 || (nuVar.f140236a & 2) == 0) {
            return false;
        }
        C51012dc dcVar = nuVar.f140244i;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        return (dcVar.f132815a & 2) != 0;
    }
}
