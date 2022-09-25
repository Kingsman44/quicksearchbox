package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.d */
/* compiled from: PG */
public final /* synthetic */ class C102102d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102103e f284834a;

    public /* synthetic */ C102102d(C102103e eVar) {
        this.f284834a = eVar;
    }

    public final void onClick(View view) {
        C102103e eVar = this.f284834a;
        C102100b bVar = eVar.f284836b;
        if (bVar == null || bVar.getView() == null) {
            C59052c cVar = (C59052c) ((C59052c) C102103e.f284835a.mo56225c()).mo56372aa(20537);
            C102100b bVar2 = eVar.f284836b;
            cVar.mo56354G("Fragment is %s, fragment.getView() is %s", bVar2, bVar2 != null ? bVar2.getView() : null);
            return;
        }
        C101763c cVar2 = new C101763c();
        cVar2.mo92556b(1);
        C47393f.m84236g(cVar2.mo92555a(), eVar.f284836b);
    }
}
