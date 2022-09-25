package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d;

import android.animation.Animator;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.j */
/* compiled from: PG */
final class C130243j implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C130244k f357062a;

    public C130243j(C130244k kVar) {
        this.f357062a = kVar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        C130244k kVar = this.f357062a;
        kVar.f357071g.cancel();
        kVar.f357066b.requireView().findViewById(R.id.assistant_feedback_survey_floater).setVisibility(8);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
