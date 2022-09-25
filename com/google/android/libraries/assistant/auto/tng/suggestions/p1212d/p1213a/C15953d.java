package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C15953d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C15953d f47327a = new C15953d();

    private /* synthetic */ C15953d() {
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
        C16327aa a = C16327aa.m33331a(nVar.mo22747b().f48080e);
        if (a == null) {
            a = C16327aa.UNKNOWN_ACTION_TYPE;
        }
        boolean z = true;
        if (!(!C15965p.m32764d(nVar.mo22747b().f48088m) || a == C16327aa.DOWNLOAD_APP || a == C16327aa.PLAY_PERSONALIZED_MUSIC)) {
            z = false;
        }
        if (!z) {
            C58976aa aaVar = C58975e.f156826a;
        }
        return z;
    }
}
