package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1237f;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.f.b */
/* compiled from: PG */
public final /* synthetic */ class C16208b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C16327aa f47772a;

    public /* synthetic */ C16208b(C16327aa aaVar) {
        this.f47772a = aaVar;
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
        C16327aa aaVar = this.f47772a;
        int i = C16209c.f47773a;
        C16327aa a = C16327aa.m33331a(((C16170n) obj).mo22747b().f48080e);
        if (a == null) {
            a = C16327aa.UNKNOWN_ACTION_TYPE;
        }
        return a.equals(aaVar);
    }
}
