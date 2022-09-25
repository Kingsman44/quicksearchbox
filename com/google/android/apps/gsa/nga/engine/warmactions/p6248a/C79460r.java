package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.r */
/* compiled from: PG */
public final /* synthetic */ class C79460r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10026c f218139a;

    public /* synthetic */ C79460r(C10026c cVar) {
        this.f218139a = cVar;
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
        C10026c cVar = this.f218139a;
        C58974d dVar = C79418an.f218059a;
        return cVar.f34233a.containsKey(Integer.valueOf(((C79570b) obj).f218339o));
    }
}
