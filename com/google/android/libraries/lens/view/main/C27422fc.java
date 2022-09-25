package com.google.android.libraries.lens.view.main;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.lens.view.imageviewer.C26937a;
import com.google.android.libraries.lens.view.imageviewer.C26952o;
import com.google.android.libraries.lens.view.infopanel.C27073c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.libraries.lens.view.main.fc */
/* compiled from: PG */
final class C27422fc implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75061a;

    public C27422fc(C27384dt dtVar) {
        this.f75061a = dtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C26937a aVar = (C26937a) bVar;
        C27384dt dtVar = this.f75061a;
        C26952o oVar = (C26952o) dtVar.f74987g.getChildFragmentManager().f634a.mo671c("image-viewer-root-fragment-tag");
        if (oVar == null) {
            return C47392e.f123115a;
        }
        oVar.dismiss();
        dtVar.f74987g.getChildFragmentManager().mo462ac();
        Fragment c = dtVar.f74987g.getChildFragmentManager().f634a.mo671c("info_panel_fragment");
        if (c != null) {
            ((C27073c) c).mo17754z().mo32635o();
        }
        return C47392e.f123115a;
    }
}
