package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.AbsoluteTimeArgument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.p4152bb.p4153a.C55296nc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ef */
/* compiled from: PG */
final class C93636ef implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C93637eg f261388a;

    public C93636ef(C93637eg egVar) {
        this.f261388a = egVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f261388a.mo88128o();
        C91109h b = this.f261388a.f261389a.getItem(i);
        if (!b.f254418c) {
            Object obj = b.f254417b;
            if (obj != null) {
                ((AbsoluteTimeArgument) this.f261388a.f261447m).mo81253f((C55296nc) obj);
                return;
            }
            return;
        }
        this.f261388a.mo88096b();
    }
}
