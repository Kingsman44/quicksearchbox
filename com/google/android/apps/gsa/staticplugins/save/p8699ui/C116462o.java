package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.o */
/* compiled from: PG */
public final /* synthetic */ class C116462o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Interstitial f322921a;

    /* renamed from: b */
    public final /* synthetic */ int f322922b;

    public /* synthetic */ C116462o(Interstitial interstitial, int i) {
        this.f322921a = interstitial;
        this.f322922b = i;
    }

    public final void run() {
        Interstitial interstitial = this.f322921a;
        int i = this.f322922b;
        interstitial.findViewById(R.id.interstitial_progress_v2).setVisibility(8);
        int max = Math.max(i, (int) Math.min((float) (interstitial.f322864f.computeVerticalScrollRange() + interstitial.f322864f.getTop() + ((int) interstitial.getResources().getDimension(R.dimen.list_end_margin))), ((float) interstitial.getRootView().getHeight()) * 0.6f));
        interstitial.getLayoutParams().height = max;
        interstitial.requestLayout();
        interstitial.setTranslationY((float) (max - i));
        interstitial.animate().setInterpolator(Interstitial.f322858a).setDuration(250).translationY(0.0f);
        interstitial.f322864f.animate().setInterpolator(Interstitial.f322858a).setDuration(250).alpha(1.0f);
    }
}
