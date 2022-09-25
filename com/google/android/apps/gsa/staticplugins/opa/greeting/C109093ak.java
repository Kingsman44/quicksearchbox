package com.google.android.apps.gsa.staticplugins.opa.greeting;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ak */
/* compiled from: PG */
final class C109093ak implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109100ar f303724a;

    public C109093ak(C109100ar arVar) {
        this.f303724a = arVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C109100ar.f303734a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24505)).mo56386p("Failed to get suggestion response, getting local fallback");
        ((C89859i) this.f303724a.f303749N.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_FAILED);
        this.f303724a.mo97599o();
        this.f303724a.mo97595k();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        Boolean bool = (Boolean) obj;
        C59071e eVar = C109100ar.f303734a;
        C58976aa aaVar = C58975e.f156826a;
    }
}
