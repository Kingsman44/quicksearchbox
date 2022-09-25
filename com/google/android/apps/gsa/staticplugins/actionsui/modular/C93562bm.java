package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bm */
/* compiled from: PG */
final class C93562bm implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C93563bn f261241a;

    public C93562bm(C93563bn bnVar) {
        this.f261241a = bnVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        GroupArgument groupArgument = (GroupArgument) this.f261241a.f261447m;
        if (!groupArgument.mo81263C() || i != ((Integer) groupArgument.f236203n).intValue()) {
            groupArgument.mo81307a(i);
            C93595cs csVar = this.f261241a.f261444j;
            if (csVar != null) {
                csVar.mo88006c();
            }
            this.f261241a.mo87732f();
            this.f261241a.mo88128o();
            this.f261241a.refreshDrawableState();
        }
    }
}
