package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cm */
/* compiled from: PG */
public final class C126833cm {

    /* renamed from: a */
    public final ProgressBar f349290a;

    /* renamed from: b */
    public final ImageView f349291b;

    /* renamed from: c */
    public final ImageView f349292c;

    /* renamed from: d */
    public final Drawable f349293d;

    /* renamed from: e */
    public final Drawable f349294e;

    /* renamed from: f */
    public final Drawable f349295f;

    /* renamed from: g */
    public final DrawSoundLevelsView f349296g;

    /* renamed from: h */
    private final FrameLayout f349297h;

    public C126833cm(View view) {
        this.f349297h = (FrameLayout) view.findViewById(R.id.assistant_roti_mic_container);
        this.f349291b = (ImageView) view.findViewById(R.id.assistant_roti_mic_image_indicator);
        this.f349292c = (ImageView) view.findViewById(R.id.assistant_roti_mic_image_indicator_background);
        this.f349290a = (ProgressBar) view.findViewById(R.id.assistant_roti_waiting_for_results);
        this.f349296g = (DrawSoundLevelsView) view.findViewById(R.id.assistant_roti_sound_levels);
        Context context = view.getContext();
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_keyboard_voice_googblue_36);
        c.getClass();
        Drawable mutate = c.mutate();
        this.f349293d = mutate;
        C1929b.m5225f(mutate, C1878d.m5128a(context, R.color.agsa_color_primary));
        Drawable c2 = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_keyboard_voice_white_36);
        c2.getClass();
        Drawable mutate2 = c2.mutate();
        this.f349294e = mutate2;
        C1929b.m5225f(mutate2, C1878d.m5128a(context, R.color.agsa_color_on_primary));
        Drawable c3 = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_done_green500_36);
        c3.getClass();
        this.f349295f = c3.mutate();
    }

    /* renamed from: a */
    public final void mo107825a(View.OnClickListener onClickListener, String str) {
        this.f349297h.setOnClickListener(onClickListener);
        this.f349297h.setContentDescription(str);
        if (str == null) {
            this.f349297h.setFocusable(false);
        } else {
            this.f349297h.setFocusable(true);
        }
    }

    /* renamed from: b */
    public final void mo107826b() {
        this.f349290a.setVisibility(4);
        this.f349291b.setImageDrawable(this.f349293d);
        this.f349292c.setBackgroundResource(R.drawable.assistant_roti_intent_api_initializing_mic_ring);
        this.f349296g.setEnabled(false);
    }
}
