package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C11117h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11117h f36439a = new C11117h();

    private /* synthetic */ C11117h() {
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
        C52232kc kcVar = (C52232kc) obj;
        if (!"asst.request.logging.params".equals(kcVar.f137065b)) {
            return false;
        }
        C52230ka kaVar = kcVar.f137066c;
        if (kaVar == null) {
            kaVar = C52230ka.f137057d;
        }
        return "assistant.api.params.RequestLoggingParams".equals(kaVar.f137060b);
    }
}
