package com.google.android.apps.search.podcasts.playerpanel;

import android.animation.Animator;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.p */
/* compiled from: PG */
public final class C140930p implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C69648ae f382683a;

    /* renamed from: b */
    final /* synthetic */ C140879aj f382684b;

    /* renamed from: c */
    final /* synthetic */ Fragment f382685c;

    public C140930p(C69648ae aeVar, C140879aj ajVar, Fragment fragment) {
        this.f382683a = aeVar;
        this.f382684b = ajVar;
        this.f382685c = fragment;
    }

    public final void onAnimationCancel(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        ((View) this.f382683a.f186027a).findViewById(R.id.podcasts_panel_container).animate().setListener((Animator.AnimatorListener) null);
        this.f382684b.mo115980c(this.f382685c);
        ((View) this.f382683a.f186027a).sendAccessibilityEvent(8);
    }

    public final void onAnimationRepeat(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }

    public final void onAnimationStart(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }
}
