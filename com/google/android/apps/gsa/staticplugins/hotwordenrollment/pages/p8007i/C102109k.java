package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.k */
/* compiled from: PG */
public final /* synthetic */ class C102109k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102110l f284851a;

    public /* synthetic */ C102109k(C102110l lVar) {
        this.f284851a = lVar;
    }

    public final void onClick(View view) {
        C102110l lVar = this.f284851a;
        C102108j jVar = lVar.f284853b;
        if (jVar == null || jVar.getView() == null) {
            C59052c cVar = (C59052c) ((C59052c) C102110l.f284852a.mo56225c()).mo56372aa(20539);
            C102108j jVar2 = lVar.f284853b;
            cVar.mo56354G("Fragment is %s, fragment.getView() is %s", jVar2, jVar2 != null ? jVar2.getView() : null);
            return;
        }
        C47393f.m84236g(new C101783w(), jVar);
    }
}
