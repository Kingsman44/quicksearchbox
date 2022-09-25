package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.s */
/* compiled from: PG */
public final /* synthetic */ class C115823s implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115827w f321217a;

    public /* synthetic */ C115823s(C115827w wVar) {
        this.f321217a = wVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115827w wVar = this.f321217a;
        C58485gu guVar = (C58485gu) obj;
        C58976aa aaVar = C58975e.f156826a;
        C115822r rVar = wVar.f321222f;
        rVar.f321213a = guVar;
        rVar.mObservable.mo2879a();
        if (!guVar.isEmpty()) {
            wVar.mo28297il().findViewById(R.id.loading_progress_bar_container).setVisibility(8);
        }
    }
}
