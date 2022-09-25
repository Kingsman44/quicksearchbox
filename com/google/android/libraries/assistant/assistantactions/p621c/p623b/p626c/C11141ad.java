package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ad */
/* compiled from: PG */
public final /* synthetic */ class C11141ad implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C11139ab f36509a;

    public /* synthetic */ C11141ad(C11139ab abVar) {
        this.f36509a = abVar;
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
        C52403ql qlVar;
        C11139ab abVar = this.f36509a;
        C50954az azVar = (C50954az) obj;
        int i = C11160aw.f36531a;
        C52403ql qlVar2 = (C52403ql) abVar.f36505c.get();
        if (azVar.f132642b == 4) {
            qlVar = (C52403ql) azVar.f132643c;
        } else {
            qlVar = C52403ql.f137512f;
        }
        return C11160aw.m26451g(qlVar2, qlVar);
    }
}
