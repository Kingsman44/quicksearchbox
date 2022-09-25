package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.gz */
/* compiled from: PG */
public final class C112908gz {

    /* renamed from: a */
    private static final C59071e f312929a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.gz");

    /* renamed from: b */
    private final Map f312930b;

    public C112908gz(Map map) {
        this.f312930b = map;
    }

    /* renamed from: a */
    public final Optional mo99778a(int i) {
        C69464a aVar = (C69464a) this.f312930b.get(Integer.valueOf(i));
        if (aVar == null) {
            C59104x d = f312929a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SIRPRovider");
            ((C59052c) ((C59052c) d).mo56372aa(27832)).mo56387q("No item renderer found for suggestion item type %d", i);
        }
        return Optional.ofNullable(aVar);
    }
}
