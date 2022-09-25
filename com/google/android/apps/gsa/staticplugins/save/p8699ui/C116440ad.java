package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116435f;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.ad */
/* compiled from: PG */
public final /* synthetic */ class C116440ad implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C116446aj f322875a;

    public /* synthetic */ C116440ad(C116446aj ajVar) {
        this.f322875a = ajVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C116446aj ajVar = this.f322875a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C116435f fVar = C116435f.LIST_SELECTOR_VISIBLE;
            int ordinal = ((C116435f) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                ajVar.mo102716h();
                ajVar.f322887e.mo102698a();
                Interstitial interstitial = ajVar.f322886d;
                interstitial.setVisibility(0);
                interstitial.animate().alpha(1.0f).setDuration(350).start();
                interstitial.sendAccessibilityEvent(32);
                C89949q.m146521e(C28285c.m52881h(2, C28295m.m52916b(interstitial), (View) null), false);
                interstitial.postDelayed(interstitial.f322862d, 2000);
            } else if (ordinal == 1) {
                ajVar.mo102716h();
                ajVar.f322886d.mo102704b();
                ConfirmationTray confirmationTray = ajVar.f322887e;
                confirmationTray.post(new C116436a(confirmationTray));
            } else if (ordinal == 2) {
                ajVar.f322886d.mo102704b();
                ajVar.f322887e.mo102698a();
                ajVar.mo102718k(false);
            } else if (ordinal == 3) {
                ajVar.f322886d.mo102704b();
                ajVar.f322887e.mo102698a();
                ajVar.mo102718k(true);
            } else if (ordinal == 4) {
                ajVar.mo102715g();
            }
        }
    }
}
