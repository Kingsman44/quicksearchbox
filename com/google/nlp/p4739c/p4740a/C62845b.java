package com.google.nlp.p4739c.p4740a;

import com.google.knowledge.p4661a.p4662a.C61746h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.nlp.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C62845b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C62845b f169721a = new C62845b();

    private /* synthetic */ C62845b() {
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
        return ((C61746h) obj).f166796d.equals("media_object");
    }
}
