package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16364bk;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.m */
/* compiled from: PG */
public final /* synthetic */ class C15962m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C15777d f47340a;

    public /* synthetic */ C15962m(C15777d dVar) {
        this.f47340a = dVar;
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
        C15777d dVar = this.f47340a;
        C16170n nVar = (C16170n) obj;
        C16077ac acVar = C15965p.f47344a;
        boolean z = false;
        if (!dVar.mo22544b().mo22733g().equals(C16090ap.SMART_CHIP)) {
            C16389y a = C16389y.m33345a(((C16364bk) dVar.mo22554j().mo56107c()).f48171b);
            if (a == null) {
                a = C16389y.DRIVE_STATUS_UNKNOWN;
            }
            if (!a.equals(C16389y.DURING_DRIVE) || nVar.mo22747b().f48079d) {
                z = true;
            }
        }
        if (!z) {
            C58976aa aaVar = C58975e.f156826a;
        }
        return z;
    }
}
