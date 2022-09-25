package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115650z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.assistant.p3897e.p3921j.C52176ia;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.aq */
/* compiled from: PG */
public final /* synthetic */ class C115523aq implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115526at f320433a;

    public /* synthetic */ C115523aq(C115526at atVar) {
        this.f320433a = atVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115526at atVar = this.f320433a;
        C115650z zVar = atVar.f320441f;
        zVar.f320828b = (C52176ia) obj;
        zVar.mObservable.mo2879a();
        View findViewById = atVar.mo28297il().findViewById(R.id.progress_bar_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}
