package com.google.android.apps.gsa.staticplugins.opa.greeting;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ai */
/* compiled from: PG */
final class C109091ai implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109100ar f303722a;

    public C109091ai(C109100ar arVar) {
        this.f303722a = arVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C109100ar.f303734a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24503)).mo56386p("Failed to get suggestion response, getting local fallback");
        ((C89859i) this.f303722a.f303749N.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_FAILED);
        this.f303722a.mo97599o();
        this.f303722a.mo97595k();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C59071e eVar = C109100ar.f303734a;
        C58976aa aaVar = C58975e.f156826a;
        C53593bz bzVar = (C53593bz) ((C58485gu) obj).get(0);
        if ((bzVar.f140660a & 1) != 0) {
            C109100ar arVar = this.f303722a;
            String str = bzVar.f140661b;
            arVar.f303778k.setText(arVar.mo97587c().getString(R.string.opa_first_time_greeting_query_suggestion_quote, new Object[]{str}));
            this.f303722a.mo97595k();
            return;
        }
        ((C89859i) this.f303722a.f303749N.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_EMPTY);
        this.f303722a.mo97599o();
        this.f303722a.mo97595k();
    }
}
