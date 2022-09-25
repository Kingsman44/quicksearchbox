package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ay */
/* compiled from: PG */
public final /* synthetic */ class C11162ay implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11162ay f36536a = new C11162ay();

    private /* synthetic */ C11162ay() {
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
        return ((C50954az) obj).f132652l.equals("default_time");
    }
}
