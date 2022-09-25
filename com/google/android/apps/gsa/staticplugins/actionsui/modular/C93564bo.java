package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bo */
/* compiled from: PG */
final class C93564bo extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ GroupArgumentView f261244a;

    public C93564bo(GroupArgumentView groupArgumentView) {
        this.f261244a = groupArgumentView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        int id = view.getId();
        if (!((GroupArgument) this.f261244a.f261447m).mo81263C() || id != ((Integer) ((GroupArgument) this.f261244a.f261447m).f236203n).intValue()) {
            ((GroupArgument) this.f261244a.f261447m).mo81307a(id);
            C93595cs csVar = this.f261244a.f261444j;
            if (csVar != null) {
                csVar.mo88006c();
            }
            C93665v vVar = this.f261244a.f261445k;
            if (vVar != null) {
                vVar.mo87850k();
            }
            this.f261244a.refreshDrawableState();
        }
    }
}
