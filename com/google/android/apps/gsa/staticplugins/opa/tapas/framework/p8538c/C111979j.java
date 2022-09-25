package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.j */
/* compiled from: PG */
public final /* synthetic */ class C111979j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f311084a;

    public /* synthetic */ C111979j(Map map) {
        this.f311084a = map;
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
        C48672ag agVar = (C48672ag) obj;
        boolean containsKey = this.f311084a.containsKey(agVar);
        if (!containsKey) {
            C59104x d = C111983n.f311093a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CFPM");
            ((C59052c) ((C59052c) d).mo56372aa(27456)).mo56389s("Source %s is missing a producer module and will not be included in the TaskGraph!", agVar.name());
        }
        return containsKey;
    }
}
