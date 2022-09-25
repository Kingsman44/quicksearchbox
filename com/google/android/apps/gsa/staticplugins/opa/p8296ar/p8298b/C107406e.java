package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.e */
/* compiled from: PG */
public final /* synthetic */ class C107406e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C48855bv f298919a;

    public /* synthetic */ C107406e(C48855bv bvVar) {
        this.f298919a = bvVar;
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
        C48855bv bvVar = this.f298919a;
        C48851br brVar = ((C83683b) obj).f228110d;
        if (brVar == null) {
            brVar = C48851br.f126412f;
        }
        return C107431k.m178345c(brVar, bvVar);
    }
}
