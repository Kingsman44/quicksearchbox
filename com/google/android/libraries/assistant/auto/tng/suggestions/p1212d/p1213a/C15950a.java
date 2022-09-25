package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15950a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C15950a f47324a = new C15950a();

    private /* synthetic */ C15950a() {
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
        C16170n nVar = (C16170n) obj;
        C16077ac acVar = C15965p.f47344a;
        boolean z = false;
        if (!nVar.mo22747b().f48077b && nVar.mo22747b().f48088m != 4) {
            z = true;
        }
        if (!z) {
            C58976aa aaVar = C58975e.f156826a;
        }
        return z;
    }
}
