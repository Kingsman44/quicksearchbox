package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.animation.Animator;
import android.view.View;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.bb */
/* compiled from: PG */
public final /* synthetic */ class C115680bb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320874a;

    public /* synthetic */ C115680bb(C115711cf cfVar) {
        this.f320874a = cfVar;
    }

    public final void onClick(View view) {
        C115711cf cfVar = this.f320874a;
        cfVar.f320944o.mo102126a(((Float) ((C23249a) cfVar.f320935f.mo102008l()).mo28725a()).floatValue());
        cfVar.f320939j.setAlpha(0.0f);
        cfVar.f320939j.setVisibility(0);
        cfVar.f320939j.animate().alpha(0.54f).setDuration(400).setListener((Animator.AnimatorListener) null);
        cfVar.f320945p.mo47519v(3);
        C28292j a = C28295m.m52915a(cfVar.f320944o);
        if (a != null) {
            a.mo33794h(1);
        }
    }
}
