package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ca */
/* compiled from: PG */
final class C93577ca extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ C93583cg f261272a;

    public C93577ca(C93583cg cgVar) {
        this.f261272a = cgVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        C93583cg cgVar = this.f261272a;
        int i = cgVar.f261280d;
        if (i == 1 || i == 3 || i == 6) {
            C88507a aVar = cgVar.f239232a;
            aVar.getClass();
            if (((C93602cz) aVar).mo88038ag()) {
                C88507a aVar2 = this.f261272a.f239232a;
                aVar2.getClass();
                C93602cz czVar = (C93602cz) aVar2;
                czVar.mo88035ad(!czVar.mo88040ai());
                C88507a aVar3 = this.f261272a.f239232a;
                aVar3.getClass();
                ((C93602cz) aVar3).mo88025T();
                this.f261272a.mo88000m(true);
            }
        }
        C88507a aVar4 = this.f261272a.f239232a;
        aVar4.getClass();
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 1;
        kVar.f236086a |= 1;
        ((C93602cz) aVar4).mo82038C(1, (C87423k) jVar.build());
    }
}
