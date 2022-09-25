package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114736f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114753g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114759m;
import com.google.android.libraries.logging.C28291i;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.au */
/* compiled from: PG */
final class C114571au implements C114759m {

    /* renamed from: a */
    final /* synthetic */ C114575ay f317707a;

    public C114571au(C114575ay ayVar) {
        this.f317707a = ayVar;
    }

    /* renamed from: a */
    public final void mo101409a(C58485gu guVar) {
        C58976aa aaVar = C58975e.f156826a;
        ViewGroup viewGroup = this.f317707a.f317765y;
        viewGroup.getClass();
        viewGroup.clearAnimation();
        ViewGroup viewGroup2 = this.f317707a.f317765y;
        viewGroup2.getClass();
        viewGroup2.setVisibility(4);
        C114575ay ayVar = this.f317707a;
        if (ayVar.f317760t) {
            ayVar.f317757q.mo33787c();
            C114575ay ayVar2 = this.f317707a;
            ayVar2.f317718G = null;
            ayVar2.f317713B = ayVar2.f317744d.mo101533a(C53306j.MAIN_APP);
            C114575ay ayVar3 = this.f317707a;
            C28291i iVar = ayVar3.f317757q;
            C114711cl clVar = ayVar3.f317713B;
            clVar.getClass();
            iVar.f76970d = clVar;
            RecyclerView recyclerView = ayVar3.f317714C;
            recyclerView.getClass();
            ViewGroup viewGroup3 = ayVar3.f317766z;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
                this.f317707a.f317766z.setAlpha(0.0f);
                this.f317707a.f317766z.animate().alpha(1.0f).setDuration(400);
            }
            View view = this.f317707a.f317715D;
            if (view != null) {
                view.setVisibility(8);
            }
            recyclerView.setVisibility(4);
            recyclerView.setAdapter(this.f317707a.f317713B);
            ((C89859i) this.f317707a.f317751k.mo27525b()).mo83702b(C89849ae.OPA_ZERO_STATE_REFRESHED_RESPONSE_LOADED);
            try {
                C114575ay ayVar4 = this.f317707a;
                ayVar4.mo101414d(guVar, (C87546b) C60856cj.m92909r(ayVar4.f317745e), true);
                recyclerView.setAlpha(0.0f);
                recyclerView.setVisibility(0);
                this.f317707a.mo101419i(recyclerView);
                C114753g gVar = this.f317707a.f317717F;
                if (gVar != null) {
                    gVar.mo96386a();
                }
                recyclerView.animate().setListener(new C114736f((C114737g) this.f317707a.f317753m.mo27525b())).alpha(1.0f).setDuration(400);
            } catch (ExecutionException e) {
                C59104x d = C114575ay.f317711a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ZSMainController");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29150)).mo56386p("#onDataRefresh(): called before cardFactoryFuture is complete");
            } catch (IllegalStateException e2) {
                C59104x d2 = C114575ay.f317711a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ZSMainController");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(29151)).mo56386p("IllegalStateException");
            }
        }
        C114575ay ayVar5 = this.f317707a;
        ayVar5.f317759s = false;
        ayVar5.f317760t = false;
        ayVar5.mo101426p();
    }
}
