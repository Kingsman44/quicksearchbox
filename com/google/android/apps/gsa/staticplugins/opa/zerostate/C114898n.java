package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114736f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114753g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114759m;
import com.google.android.libraries.logging.C28291i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.n */
/* compiled from: PG */
final class C114898n implements C114759m {

    /* renamed from: a */
    final /* synthetic */ C114966q f318783a;

    public C114898n(C114966q qVar) {
        this.f318783a = qVar;
    }

    /* renamed from: a */
    public final void mo101409a(C58485gu guVar) {
        C114966q qVar = this.f318783a;
        qVar.f319056u = false;
        if (qVar.f319057v) {
            C58976aa aaVar = C58975e.f156826a;
            this.f318783a.f319055t.mo33787c();
            C114966q qVar2 = this.f318783a;
            qVar2.f319061z = qVar2.f319044i.mo101533a(qVar2.f319049n);
            C114966q qVar3 = this.f318783a;
            C28291i iVar = qVar3.f319055t;
            C114711cl clVar = qVar3.f319061z;
            clVar.getClass();
            iVar.f76970d = clVar;
            RecyclerView recyclerView = qVar3.f319033A;
            recyclerView.getClass();
            View view = qVar3.f319034B;
            if (view != null) {
                view.setVisibility(8);
            }
            recyclerView.setVisibility(4);
            recyclerView.setAdapter(this.f318783a.f319061z);
            SwipeRefreshLayout swipeRefreshLayout = this.f318783a.f319060y;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.mo8794l(false, false);
            }
            try {
                C114966q qVar4 = this.f318783a;
                qVar4.mo101547c(guVar, (C87546b) C60856cj.m92909r(qVar4.f319045j));
                recyclerView.setAlpha(0.0f);
                recyclerView.setVisibility(0);
                this.f318783a.mo101760x(recyclerView);
                C114753g gVar = this.f318783a.f319036D;
                if (gVar != null) {
                    gVar.mo96386a();
                }
                recyclerView.animate().setListener(new C114736f((C114737g) this.f318783a.f319050o.mo27525b())).alpha(1.0f).setDuration(400);
            } catch (ExecutionException e) {
                C59104x d = C114966q.f319032e.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ZSBaseController");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29109)).mo56386p("#onDataRefresh(): called before cardFactoryFuture is complete");
            } catch (IllegalStateException e2) {
                C59104x d2 = C114966q.f319032e.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ZSBaseController");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(29110)).mo56386p("IllegalStateException");
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        this.f318783a.f319057v = false;
    }
}
