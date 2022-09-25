package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.bd */
/* compiled from: PG */
public final /* synthetic */ class C11168bd implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11168bd f36542a = new C11168bd();

    private /* synthetic */ C11168bd() {
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
        int i = C11169be.f36543a;
        return ((String) obj).equals("datetime");
    }
}
