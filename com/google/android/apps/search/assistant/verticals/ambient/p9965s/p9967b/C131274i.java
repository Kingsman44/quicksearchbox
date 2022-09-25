package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.assistant.p3886c.C50794cr;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.b.i */
/* compiled from: PG */
public final /* synthetic */ class C131274i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131258a f358928a;

    public /* synthetic */ C131274i(C131258a aVar) {
        this.f358928a = aVar;
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
        C131258a aVar = this.f358928a;
        C50794cr a = C50794cr.m85938a(((C83739ak) obj).f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return a.equals(aVar.mo110138d().get(0));
    }
}
