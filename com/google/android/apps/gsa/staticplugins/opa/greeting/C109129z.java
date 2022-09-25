package com.google.android.apps.gsa.staticplugins.opa.greeting;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.z */
/* compiled from: PG */
final class C109129z implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109100ar f303891a;

    public C109129z(C109100ar arVar) {
        this.f303891a = arVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109100ar.f303734a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24501)).mo56386p("Failed to get nestPromoInteractionCount");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f303891a.f303758W.mo101394d("opa_nest_growth_promo_interaction_count", Integer.valueOf(((Integer) obj).intValue() + 1));
    }
}
