package com.google.android.libraries.lens.view.gleam;

import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62203ap;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.gleam.ck */
/* compiled from: PG */
public final /* synthetic */ class C26506ck implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26506ck f72233a = new C26506ck();

    private /* synthetic */ C26506ck() {
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
        C62203ap apVar;
        C62195ah ahVar = (C62195ah) obj;
        int i = C26507cl.f72234c;
        if (ahVar.f167933a == 3) {
            apVar = (C62203ap) ahVar.f167934b;
        } else {
            apVar = C62203ap.f167949d;
        }
        return (apVar.f167951a & 2) != 0;
    }
}
