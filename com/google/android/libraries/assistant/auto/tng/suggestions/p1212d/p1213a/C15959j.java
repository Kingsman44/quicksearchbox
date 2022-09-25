package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16385u;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.j */
/* compiled from: PG */
public final /* synthetic */ class C15959j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f47337a;

    public /* synthetic */ C15959j(C58833ax axVar) {
        this.f47337a = axVar;
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
        C58833ax axVar = this.f47337a;
        C16170n nVar = (C16170n) obj;
        C16077ac acVar = C15965p.f47344a;
        boolean z = ((C16385u) axVar.mo56107c()).f48229c;
        C16327aa aaVar = C16327aa.UNKNOWN_ACTION_TYPE;
        C16327aa a = C16327aa.m33331a(nVar.mo22747b().f48080e);
        if (a == null) {
            a = C16327aa.UNKNOWN_ACTION_TYPE;
        }
        int ordinal = a.ordinal();
        boolean z2 = true;
        if (ordinal != 28) {
            if (ordinal == 29) {
                z2 = true ^ z;
            } else if (C15965p.m32764d(nVar.mo22747b().f48088m) && !z) {
                z2 = false;
            }
        }
        if (!z2) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        return z2;
    }
}
