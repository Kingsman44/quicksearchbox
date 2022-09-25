package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3921j.C52490tr;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C11147aj implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f36515a;

    public /* synthetic */ C11147aj(String str) {
        this.f36515a = str;
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
        String str = this.f36515a;
        int i = C11160aw.f36531a;
        return ((C52490tr) obj).f137800d.equals(str);
    }
}
