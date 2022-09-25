package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.view.View;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114753g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114759m;
import com.google.android.libraries.logging.C28292j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.e */
/* compiled from: PG */
final class C114720e implements C114759m {

    /* renamed from: a */
    final /* synthetic */ C114730f f318325a;

    public C114720e(C114730f fVar) {
        this.f318325a = fVar;
    }

    /* renamed from: a */
    public final void mo101409a(C58485gu guVar) {
        C114730f fVar = this.f318325a;
        fVar.f319056u = false;
        if (fVar.f319057v) {
            C58976aa aaVar = C58975e.f156826a;
            View view = this.f318325a.f319034B;
            if (view != null) {
                view.setVisibility(8);
            }
            try {
                this.f318325a.f318384c = new C28292j(75838);
                this.f318325a.f318383b.clear();
                C114730f fVar2 = this.f318325a;
                fVar2.mo101547c(guVar, (C87546b) C60856cj.m92909r(fVar2.f319045j));
                C114753g gVar = this.f318325a.f319036D;
                if (gVar != null) {
                    gVar.mo96386a();
                }
            } catch (ExecutionException e) {
                C59104x d = C114730f.f318373a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ZSAmbientController");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29100)).mo56386p("#onDataRefresh(): called before cardFactoryFuture is complete");
            } catch (IllegalStateException e2) {
                C59104x d2 = C114730f.f318373a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ZSAmbientController");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(29101)).mo56386p("IllegalStateException");
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        this.f318325a.f319057v = false;
    }
}
