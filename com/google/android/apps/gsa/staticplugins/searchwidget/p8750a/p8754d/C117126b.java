package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.support.p033v7.app.C0391l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.b */
/* compiled from: PG */
public final /* synthetic */ class C117126b implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117166g f325155a;

    public /* synthetic */ C117126b(C117166g gVar) {
        this.f325155a = gVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117166g gVar = this.f325155a;
        if (((Boolean) obj).booleanValue()) {
            C0391l lVar = new C0391l(gVar.f325249a);
            lVar.mo1307l(R.string.swc_title);
            lVar.mo1300f(R.string.swc_drawer_content);
            lVar.setPositiveButton(R.string.swc_settings_positive_button, new C117164e(gVar));
            lVar.f1347a.f1335p = new C117165f(gVar);
            lVar.create().show();
        }
    }
}
