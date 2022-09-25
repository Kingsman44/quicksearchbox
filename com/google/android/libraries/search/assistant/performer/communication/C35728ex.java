package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C52633yz;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ex */
/* compiled from: PG */
public final /* synthetic */ class C35728ex implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35728ex f93639a = new C35728ex();

    private /* synthetic */ C35728ex() {
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
        return ((C52633yz) obj).f138195b.equals("com.whatsapp");
    }
}
