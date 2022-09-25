package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import com.google.assistant.p3994s.p3995a.C53175ed;
import com.google.common.p4526f.C59071e;
import p3186j$.time.LocalDate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.l */
/* compiled from: PG */
public final /* synthetic */ class C110678l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ LocalDate f308399a;

    public /* synthetic */ C110678l(LocalDate localDate) {
        this.f308399a = localDate;
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
        LocalDate localDate = this.f308399a;
        C53175ed edVar = (C53175ed) obj;
        C59071e eVar = C110679m.f308400a;
        return !localDate.isBefore(LocalDate.parse(edVar.f139361c)) && !localDate.isAfter(LocalDate.parse(edVar.f139362d));
    }
}
