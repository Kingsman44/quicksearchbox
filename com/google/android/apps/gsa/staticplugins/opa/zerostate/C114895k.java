package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.support.p033v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.k */
/* compiled from: PG */
public final /* synthetic */ class C114895k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114966q f318780a;

    public /* synthetic */ C114895k(C114966q qVar) {
        this.f318780a = qVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        RecyclerView recyclerView;
        C114966q qVar = this.f318780a;
        C59104x c = C114966q.f319032e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ZSBaseController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(29119)).mo56386p("Failed to load Zero State section data.");
        C114711cl clVar = qVar.f319061z;
        if (clVar != null) {
            clVar.f318305a = C58485gu.m89845m();
            clVar.mObservable.mo2879a();
        }
        ViewGroup viewGroup = qVar.f319059x;
        if (viewGroup != null) {
            viewGroup.clearAnimation();
        }
        ViewGroup viewGroup2 = qVar.f319058w;
        if (viewGroup2 != null && viewGroup2.getWindowVisibility() == 0 && qVar.f319058w.getWindowToken() != null) {
            ViewGroup viewGroup3 = qVar.f319059x;
            if (!(viewGroup3 == null || (recyclerView = qVar.f319033A) == null)) {
                qVar.f319048m.mo101651d(viewGroup3, recyclerView, qVar.f319049n).start();
            }
            SwipeRefreshLayout swipeRefreshLayout = qVar.f319060y;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.mo8794l(false, false);
            }
            qVar.f319053r.mo101662a(new C114897m(qVar));
        }
    }
}
