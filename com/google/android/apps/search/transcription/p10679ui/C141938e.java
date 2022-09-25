package com.google.android.apps.search.transcription.p10679ui;

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

/* renamed from: com.google.android.apps.search.transcription.ui.e */
/* compiled from: PG */
public final class C141938e {

    /* renamed from: a */
    public final ProgressBar f385157a;

    /* renamed from: b */
    public final DrawSoundLevelsView f385158b;

    /* renamed from: c */
    public final ImageView f385159c;

    /* renamed from: d */
    public final ImageView f385160d;

    /* renamed from: e */
    public final Drawable f385161e;

    /* renamed from: f */
    public final Drawable f385162f;

    /* renamed from: g */
    private final Drawable f385163g;

    /* renamed from: h */
    private final FrameLayout f385164h;

    public C141938e(View view) {
        this.f385164h = (FrameLayout) view.findViewById(R.id.transcription_mic_container);
        this.f385158b = (DrawSoundLevelsView) view.findViewById(R.id.transcription_sound_levels);
        this.f385159c = (ImageView) view.findViewById(R.id.transcription_mic_image_indicator);
        this.f385160d = (ImageView) view.findViewById(R.id.transcription_mic_image_indicator_background);
        this.f385157a = (ProgressBar) view.findViewById(R.id.transcription_waiting_for_results);
        Context context = view.getContext();
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_keyboard_voice_googblue_36);
        c.getClass();
        Drawable mutate = c.mutate();
        this.f385161e = mutate;
        C1929b.m5225f(mutate, C1878d.m5128a(context, R.color.agsa_color_primary));
        Drawable c2 = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_keyboard_voice_white_36);
        c2.getClass();
        Drawable mutate2 = c2.mutate();
        this.f385163g = mutate2;
        C1929b.m5225f(mutate2, C1878d.m5128a(context, R.color.agsa_color_on_primary));
        Drawable c3 = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_done_green500_36);
        c3.getClass();
        this.f385162f = c3.mutate();
    }

    /* renamed from: a */
    public final void mo116911a(View.OnClickListener onClickListener, String str) {
        this.f385164h.setOnClickListener(onClickListener);
        this.f385164h.setContentDescription(str);
        if (str == null) {
            this.f385164h.setFocusable(false);
        } else {
            this.f385164h.setFocusable(true);
        }
    }

    /* renamed from: b */
    public final void mo116912b() {
        this.f385157a.setVisibility(4);
        this.f385159c.setImageDrawable(this.f385161e);
        this.f385160d.setBackgroundResource(R.drawable.transcription_intent_api_red_ring);
        this.f385158b.setEnabled(false);
    }

    /* renamed from: c */
    public final void mo116913c() {
        this.f385157a.setVisibility(4);
        this.f385159c.setImageDrawable(this.f385161e);
        this.f385160d.setBackgroundResource(R.drawable.transcription_intent_api_initializing_mic_ring);
        this.f385158b.setEnabled(false);
    }

    /* renamed from: d */
    public final void mo116914d() {
        this.f385157a.setVisibility(4);
        this.f385159c.setImageDrawable(this.f385163g);
        this.f385160d.setBackgroundResource(R.drawable.transcription_intent_api_recording_mic_background);
        this.f385158b.setEnabled(true);
    }
}
