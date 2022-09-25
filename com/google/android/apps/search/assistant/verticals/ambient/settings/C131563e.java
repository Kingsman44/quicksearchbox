package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.e */
/* compiled from: PG */
public final /* synthetic */ class C131563e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ ak f359453a;

    public /* synthetic */ C131563e(ak akVar) {
        this.f359453a = akVar;
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
        ak akVar = this.f359453a;
        C58528ij ijVar = C131567i.f359464a;
        return !((C50818do) obj).f132322s || (akVar.a & 32) == 0 || akVar.g;
    }
}
