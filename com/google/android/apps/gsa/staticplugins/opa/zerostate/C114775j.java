package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.support.p033v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j */
/* compiled from: PG */
public final /* synthetic */ class C114775j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114966q f318498a;

    public /* synthetic */ C114775j(C114966q qVar) {
        this.f318498a = qVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        RecyclerView recyclerView;
        C114966q qVar = this.f318498a;
        List list = (List) obj;
        C58485gu guVar = (C58485gu) list.get(0);
        C87546b bVar = (C87546b) list.get(1);
        if (qVar.f319042g.f318285f.f317856q.get() && !qVar.f319042g.f318285f.mo101447i()) {
            qVar.f319053r.mo101662a(new C114896l(qVar));
        }
        qVar.mo101547c(guVar, bVar);
        ViewGroup viewGroup = qVar.f319059x;
        if (viewGroup != null) {
            viewGroup.clearAnimation();
        }
        ViewGroup viewGroup2 = qVar.f319059x;
        if (viewGroup2 != null && (recyclerView = qVar.f319033A) != null) {
            qVar.f319048m.mo101651d(viewGroup2, recyclerView, qVar.f319049n).start();
        }
    }
}
