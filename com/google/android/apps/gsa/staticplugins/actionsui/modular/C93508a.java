package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.AbsoluteTimeArgument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.p4152bb.p4153a.C55296nc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a */
/* compiled from: PG */
final class C93508a implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C93549b f261121a;

    public C93508a(C93549b bVar) {
        this.f261121a = bVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f261121a.mo88128o();
        C91109h b = this.f261121a.f261204a.getItem(i);
        if (!b.f254418c) {
            Object obj = b.f254417b;
            if (obj != null) {
                ((AbsoluteTimeArgument) this.f261121a.f261447m).mo81253f((C55296nc) obj);
                return;
            }
            return;
        }
        this.f261121a.mo87962b();
    }
}
