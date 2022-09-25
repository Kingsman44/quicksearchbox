package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91116o;
import com.google.p4152bb.p4153a.C55112gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bs */
/* compiled from: PG */
final class C93568bs implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C93569bt f261259a;

    public C93568bs(C93569bt btVar) {
        this.f261259a = btVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f261259a.mo88128o();
        C91116o oVar = (C91116o) this.f261259a.f261260a.getItem(i);
        if (oVar.f254418c) {
            C93569bt btVar = this.f261259a;
            btVar.f261451q.mo87961i(btVar.f261447m, "locationpicker_tag");
            return;
        }
        ((LocationArgument) this.f261259a.f261447m).mo81314i((C55112gh) oVar.f254417b);
        this.f261259a.mo87732f();
    }
}
