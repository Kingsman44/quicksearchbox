package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import android.app.Activity;
import android.widget.ListView;
import com.google.android.libraries.social.licenses.License;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.m */
/* compiled from: PG */
public final class C118671m extends C118660b {

    /* renamed from: h */
    private C118670l f331051h;

    /* renamed from: b */
    public final void mo731b(ListView listView, int i) {
        License license = (License) listView.getItemAtPosition(i);
        C118670l lVar = this.f331051h;
        if (lVar != null) {
            lVar.mo103842e(license);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f331051h = (C118670l) activity;
    }

    public final void onDetach() {
        this.f331051h = null;
        super.onDetach();
    }
}
