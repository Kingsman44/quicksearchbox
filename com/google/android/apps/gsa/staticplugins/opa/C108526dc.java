package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.dc */
/* compiled from: PG */
final class C108526dc extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C109040fj f301944a;

    public C108526dc(C109040fj fjVar) {
        this.f301944a = fjVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f301944a.f303450o.mo95420i().getLayoutParams().height = -1;
        this.f301944a.mo97552y();
    }

    public final void onAnimationStart(Animator animator) {
        this.f301944a.f303450o.mo95420i().setAlpha(0.0f);
        this.f301944a.f303449n.findViewById(R.id.opa_search_plate_container).setAlpha(0.0f);
    }
}
