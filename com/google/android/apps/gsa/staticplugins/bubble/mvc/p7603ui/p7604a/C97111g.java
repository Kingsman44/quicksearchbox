package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import android.view.WindowManager;
import com.google.android.libraries.p10982ad.C147445i;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.g */
/* compiled from: PG */
public final /* synthetic */ class C97111g implements C147445i {

    /* renamed from: a */
    public final /* synthetic */ C97112h f271331a;

    public /* synthetic */ C97111g(C97112h hVar) {
        this.f271331a = hVar;
    }

    /* renamed from: a */
    public final void mo18517a() {
        C97112h hVar = this.f271331a;
        if (hVar.f271346o != 2) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) hVar.f271339h.getLayoutParams();
            layoutParams.x = ((int) hVar.f271343l.mo90472a().mo90592a()) - (hVar.f271339h.getWidth() / 2);
            layoutParams.y = ((int) hVar.f271343l.mo90472a().mo90593b()) - (hVar.f271339h.getHeight() / 2);
            hVar.f271340i.updateViewLayout(hVar.f271339h, layoutParams);
            hVar.f271342k.mo18517a();
        }
    }
}
