package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.u */
/* compiled from: PG */
public final /* synthetic */ class C115825u implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115827w f321219a;

    public /* synthetic */ C115825u(C115827w wVar) {
        this.f321219a = wVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115827w wVar = this.f321219a;
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) obj).booleanValue()) {
            View il = wVar.mo28297il();
            C115826v vVar = new C115826v(wVar);
            Snackbar p = Snackbar.m79660p(il, R.string.speakr_select_language_snackbar_failure_message, -2);
            p.mo48353t(R.string.speakr_snackbar_close_button, new C115817m(p, vVar));
            p.mo48343h();
        }
    }
}
