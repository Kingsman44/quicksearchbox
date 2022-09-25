package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C104565bf implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C7681g f290961a;

    public /* synthetic */ C104565bf(C7681g gVar) {
        this.f290961a = gVar;
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
        C7681g gVar = this.f290961a;
        C7681g a = C7681g.m22802a(((C7708h) obj).f26897b);
        if (a == null) {
            a = C7681g.INVALID;
        }
        return a == gVar;
    }
}
