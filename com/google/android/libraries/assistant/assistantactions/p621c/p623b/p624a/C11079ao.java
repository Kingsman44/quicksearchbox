package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.knowledge.p4661a.p4662a.C61746h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C11079ao implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11079ao f36358a = new C11079ao();

    private /* synthetic */ C11079ao() {
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
        return ((C61746h) obj).f166796d.equals("id_form");
    }
}
