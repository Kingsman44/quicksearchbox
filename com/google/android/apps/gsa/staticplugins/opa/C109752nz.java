package com.google.android.apps.gsa.staticplugins.opa;

import com.google.assistant.p4008y.p4009a.C53597f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nz */
/* compiled from: PG */
public final /* synthetic */ class C109752nz implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109752nz f305771a = new C109752nz();

    private /* synthetic */ C109752nz() {
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
        int i = ((C53597f) obj).f140677a;
        return i == 1 || i == 2;
    }
}
