package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50951aw;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ac */
/* compiled from: PG */
public final /* synthetic */ class C11140ac implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11140ac f36508a = new C11140ac();

    private /* synthetic */ C11140ac() {
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
        int i = C11160aw.f36531a;
        C50951aw a = C50951aw.m85988a(((C50954az) obj).f132649i);
        if (a == null) {
            a = C50951aw.DEFAULT_STATUS;
        }
        return a == C50951aw.ERROR;
    }
}
