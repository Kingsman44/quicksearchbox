package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.protobuf.C62995dn;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.r */
/* compiled from: PG */
public final /* synthetic */ class C10052r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10026c f34278a;

    public /* synthetic */ C10052r(C10026c cVar) {
        this.f34278a = cVar;
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
        C10026c cVar = this.f34278a;
        int i = ((C79570b) obj).f218339o;
        C62995dn dnVar = cVar.f34233a;
        Integer valueOf = Integer.valueOf(i);
        if (dnVar.containsKey(valueOf)) {
            return ((Boolean) dnVar.get(valueOf)).booleanValue();
        }
        return false;
    }
}
