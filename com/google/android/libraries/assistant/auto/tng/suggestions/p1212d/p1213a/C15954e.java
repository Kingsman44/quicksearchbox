package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124032d;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15783j;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C15954e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C15965p f47328a;

    /* renamed from: b */
    public final /* synthetic */ C15783j f47329b;

    public /* synthetic */ C15954e(C15965p pVar, C15783j jVar) {
        this.f47328a = pVar;
        this.f47329b = jVar;
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
        C15965p pVar = this.f47328a;
        C15783j jVar = this.f47329b;
        C16170n nVar = (C16170n) obj;
        if ((nVar.mo22747b().f48076a & 64) == 0) {
            return true;
        }
        C124032d dVar = pVar.f47346b;
        C48952az azVar = nVar.mo22747b().f48085j;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        boolean a = dVar.mo106244a(azVar, jVar);
        if (a) {
            return a;
        }
        C58976aa aaVar = C58975e.f156826a;
        return a;
    }
}
