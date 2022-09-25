package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.c */
/* compiled from: PG */
public final /* synthetic */ class C102101c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102103e f284833a;

    public /* synthetic */ C102101c(C102103e eVar) {
        this.f284833a = eVar;
    }

    public final void onClick(View view) {
        C102103e eVar = this.f284833a;
        C102100b bVar = eVar.f284836b;
        if (bVar == null || bVar.getView() == null) {
            C59052c cVar = (C59052c) ((C59052c) C102103e.f284835a.mo56225c()).mo56372aa(20536);
            C102100b bVar2 = eVar.f284836b;
            cVar.mo56354G("Fragment is %s, fragment.getView() is %s", bVar2, bVar2 != null ? bVar2.getView() : null);
            return;
        }
        C47393f.m84236g(new C101783w(), bVar);
    }
}
