package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.b */
/* compiled from: PG */
final class C10735b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C10736c f35672a;

    public C10735b(C10736c cVar) {
        this.f35672a = cVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35672a.f35673a.coverView.setVisibility(8);
    }
}
