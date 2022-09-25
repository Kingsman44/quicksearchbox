package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a;

import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C121413b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C121415d f337064a;

    public /* synthetic */ C121413b(C121415d dVar) {
        this.f337064a = dVar;
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
        C48667ab abVar = (C48667ab) obj;
        boolean containsKey = this.f337064a.f337067b.containsKey(abVar);
        if (!containsKey) {
            C59104x c = C121415d.f337066a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AdjusterProvider");
            ((C59052c) ((C59052c) c).mo56372aa(35832)).mo56387q("Could not find specified adjuster '%s'", abVar.f125795r);
        }
        return containsKey;
    }
}
