package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.animation.Animator;
import android.view.View;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.dg */
/* compiled from: PG */
public final /* synthetic */ class C115739dg implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321005a;

    public /* synthetic */ C115739dg(C115791fe feVar) {
        this.f321005a = feVar;
    }

    public final void onClick(View view) {
        C115791fe feVar = this.f321005a;
        feVar.f321107r.mo102126a(((Float) ((C23249a) feVar.f321095f.mo102008l()).mo28725a()).floatValue());
        feVar.f321100k.setAlpha(0.0f);
        feVar.f321100k.setVisibility(0);
        feVar.f321100k.animate().alpha(0.54f).setDuration(400).setListener((Animator.AnimatorListener) null);
        feVar.f321108s.mo47519v(3);
        C28292j a = C28295m.m52915a(feVar.f321107r);
        if (a != null) {
            a.mo33794h(1);
        }
    }
}
