package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.ai */
/* compiled from: PG */
public final class C140878ai implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f382546a;

    /* renamed from: b */
    final /* synthetic */ View f382547b;

    public C140878ai(View view, View view2) {
        this.f382546a = view;
        this.f382547b = view2;
    }

    public final void onGlobalLayout() {
        this.f382546a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f382546a.setVisibility(0);
        float height = (float) this.f382547b.findViewById(R.id.podcasts_panel_container).getHeight();
        this.f382547b.findViewById(R.id.podcasts_main_container).animate().translationY((-height) + ((float) this.f382547b.findViewById(R.id.podcasts_playback_options_button_container).getHeight())).alpha(0.3f);
        this.f382547b.findViewById(R.id.podcasts_playback_options_button_container).animate().translationY(height).alpha(0.3f);
        this.f382547b.findViewById(R.id.podcasts_panel_container).setTranslationY(height);
        this.f382547b.findViewById(R.id.podcasts_panel_container).setAlpha(0.0f);
        this.f382547b.findViewById(R.id.podcasts_panel_container).animate().translationY(0.0f).alpha(1.0f).setListener(new C140877ah(this.f382547b));
        this.f382547b.findViewById(R.id.podcasts_panel_click_mask).setVisibility(0);
        this.f382547b.findViewById(R.id.podcasts_main_container).setImportantForAccessibility(4);
    }
}
