package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bh */
/* compiled from: PG */
public final /* synthetic */ class C106900bh implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106900bh f297802a = new C106900bh();

    private /* synthetic */ C106900bh() {
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
        C51012dc dcVar = (C51012dc) obj;
        C58485gu guVar = C106918bz.f297826a;
        return (dcVar.f132815a & 2) != 0 && !dcVar.f132817c.isEmpty() && dcVar.f132819e.mo59173M();
    }
}
