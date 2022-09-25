package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52397qf;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.af */
/* compiled from: PG */
public final /* synthetic */ class C11143af implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C11139ab f36511a;

    public /* synthetic */ C11143af(C11139ab abVar) {
        this.f36511a = abVar;
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
        C52397qf qfVar;
        C11139ab abVar = this.f36511a;
        C50954az azVar = (C50954az) obj;
        int i = C11160aw.f36531a;
        C52397qf qfVar2 = (C52397qf) abVar.f36506d.get();
        if (azVar.f132642b == 6) {
            qfVar = (C52397qf) azVar.f132643c;
        } else {
            qfVar = C52397qf.f137491j;
        }
        return qfVar2.equals(qfVar);
    }
}
