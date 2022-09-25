package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.k */
/* compiled from: PG */
public final /* synthetic */ class C15960k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C15777d f47338a;

    public /* synthetic */ C15960k(C15777d dVar) {
        this.f47338a = dVar;
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
        C15777d dVar = this.f47338a;
        C16170n nVar = (C16170n) obj;
        C16077ac acVar = C15965p.f47344a;
        String g = C58837ba.m90858g(nVar.mo22752f());
        C16327aa a = C16327aa.m33331a(nVar.mo22747b().f48080e);
        if (a == null) {
            a = C16327aa.UNKNOWN_ACTION_TYPE;
        }
        boolean z = true;
        if (a == C16327aa.SHARE_ETA && dVar.mo22556l().containsKey(g) && ((C16077ac) dVar.mo22556l().get(g)).mo22702f() >= dVar.mo22544b().mo22732f()) {
            z = false;
        }
        if (!z) {
            C58976aa aaVar = C58975e.f156826a;
        }
        return z;
    }
}
