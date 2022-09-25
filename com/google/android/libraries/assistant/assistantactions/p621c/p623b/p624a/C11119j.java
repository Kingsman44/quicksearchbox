package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C11119j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11119j f36441a = new C11119j();

    private /* synthetic */ C11119j() {
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
        C59071e eVar = C11129t.f36469a;
        return ((C52623yp) obj).f138166c.size() > 0;
    }
}
