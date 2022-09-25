package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.x */
/* compiled from: PG */
public final /* synthetic */ class C16051x implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f47509a;

    public /* synthetic */ C16051x(C58485gu guVar) {
        this.f47509a = guVar;
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
        return this.f47509a.contains(((C16170n) obj).mo22752f());
    }
}
