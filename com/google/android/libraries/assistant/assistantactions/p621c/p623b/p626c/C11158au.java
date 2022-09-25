package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52393qb;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.au */
/* compiled from: PG */
public final /* synthetic */ class C11158au implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C11139ab f36529a;

    public /* synthetic */ C11158au(C11139ab abVar) {
        this.f36529a = abVar;
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
        C52393qb qbVar;
        C11139ab abVar = this.f36529a;
        C50954az azVar = (C50954az) obj;
        int i = C11160aw.f36531a;
        C52393qb qbVar2 = (C52393qb) abVar.f36504b.get();
        if (azVar.f132642b == 3) {
            qbVar = (C52393qb) azVar.f132643c;
        } else {
            qbVar = C52393qb.f137479e;
        }
        return C11160aw.m26450c(qbVar2, qbVar);
    }
}
