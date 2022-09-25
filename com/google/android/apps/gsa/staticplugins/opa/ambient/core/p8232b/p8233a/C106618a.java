package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8233a;

import com.google.assistant.p3860as.C49748ak;
import com.google.assistant.p3860as.C49807u;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C106618a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106620c f297259a;

    /* renamed from: b */
    public final /* synthetic */ Function f297260b;

    public /* synthetic */ C106618a(C106620c cVar, Function function) {
        this.f297259a = cVar;
        this.f297260b = function;
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
        C106620c cVar = this.f297259a;
        if (!((Boolean) this.f297260b.apply(obj)).booleanValue()) {
            return true;
        }
        C49807u uVar = ((C49748ak) obj).f128467b;
        if (uVar == null) {
            uVar = C49807u.f128653c;
        }
        return cVar.mo95602a(uVar);
    }
}
