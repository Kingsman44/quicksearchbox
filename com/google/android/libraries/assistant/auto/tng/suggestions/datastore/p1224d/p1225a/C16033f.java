package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C16033f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47476a;

    /* renamed from: b */
    public final /* synthetic */ long f47477b;

    public /* synthetic */ C16033f(C16027ax axVar, long j) {
        this.f47476a = axVar;
        this.f47477b = j;
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
        C16027ax axVar = this.f47476a;
        long j = this.f47477b;
        C58976aa aaVar = C58975e.f156826a;
        return axVar.f47451b.mo26870b() - ((C16077ac) obj).mo22699c() >= j;
    }
}
