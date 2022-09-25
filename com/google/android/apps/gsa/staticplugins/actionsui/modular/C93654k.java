package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.shared.p7148ui.C90660be;
import com.google.p4152bb.p4153a.C55361pn;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.k */
/* compiled from: PG */
final class C93654k extends C90660be {

    /* renamed from: a */
    final /* synthetic */ AppPickerGridView f261423a;

    public C93654k(AppPickerGridView appPickerGridView) {
        this.f261423a = appPickerGridView;
    }

    /* renamed from: a */
    public final void mo84955a(int i) {
        AppPickerGridView appPickerGridView = this.f261423a;
        C93653j jVar = appPickerGridView.f260981c;
        if (jVar != null) {
            C93602cz czVar = jVar.f261422a.f260979a;
            czVar.getClass();
            if (!czVar.mo88041aj((C55361pn) appPickerGridView.f260980b.get(i))) {
                czVar.mo88035ad(false);
                czVar.mo88025T();
                czVar.mo82057t();
                C87422j jVar2 = (C87422j) C87423k.f236084e.createBuilder();
                jVar2.copyOnWrite();
                C87423k kVar = (C87423k) jVar2.instance;
                kVar.f236087b = 1;
                kVar.f236086a = 1 | kVar.f236086a;
                czVar.mo82038C(2, (C87423k) jVar2.build());
            }
        }
    }
}
