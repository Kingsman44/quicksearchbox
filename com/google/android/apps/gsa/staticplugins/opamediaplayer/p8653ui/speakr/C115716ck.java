package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.support.p033v7.widget.C0653fo;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115650z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.ck */
/* compiled from: PG */
public final /* synthetic */ class C115716ck implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115725ct f320964a;

    public /* synthetic */ C115716ck(C115725ct ctVar) {
        this.f320964a = ctVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115725ct ctVar = this.f320964a;
        C52176ia iaVar = (C52176ia) obj;
        C58976aa aaVar = C58975e.f156826a;
        C115650z zVar = ctVar.f320978j;
        zVar.f320828b = iaVar;
        zVar.mObservable.mo2879a();
        if (ctVar.f320977i) {
            C0653fo foVar = ctVar.f320979k.mLayout;
            if (foVar != null) {
                foVar.scrollToPosition(iaVar.f136916d);
            }
            ctVar.f320977i = false;
        }
        View findViewById = ctVar.mo28297il().findViewById(R.id.progress_bar_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}
