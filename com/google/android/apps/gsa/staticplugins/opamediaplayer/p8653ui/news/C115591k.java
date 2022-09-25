package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.k */
/* compiled from: PG */
public final /* synthetic */ class C115591k implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115595o f320665a;

    public /* synthetic */ C115591k(C115595o oVar) {
        this.f320665a = oVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115595o oVar = this.f320665a;
        C52176ia iaVar = (C52176ia) obj;
        C58976aa aaVar = C58975e.f156826a;
        C115587g gVar = oVar.f320676h;
        gVar.f320828b = iaVar;
        gVar.mObservable.mo2879a();
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < iaVar.f136914b.size(); i++) {
            C28292j jVar = new C28292j(71363);
            e.mo55395g(C28293k.m52908e(new C28292j(71364), C28293k.m52908e(jVar, new C28293k[0])));
        }
        gVar.f320661a = C28293k.m52907d(new C28292j(71362), e.mo55394f());
        View findViewById = oVar.mo28297il().findViewById(R.id.progress_bar_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}
