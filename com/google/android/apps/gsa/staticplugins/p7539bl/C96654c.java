package com.google.android.apps.gsa.staticplugins.p7539bl;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.apps.gsa.assistant.settings.shared.pronlearning.C73772f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bl.c */
/* compiled from: PG */
public final class C96654c {

    /* renamed from: a */
    public final Drawable f270408a;

    /* renamed from: b */
    public ImageView f270409b;

    /* renamed from: c */
    public ImageView f270410c;

    /* renamed from: d */
    public C73772f f270411d;

    /* renamed from: e */
    private final Activity f270412e;

    /* renamed from: f */
    private final Drawable f270413f;

    /* renamed from: g */
    private final Drawable f270414g;

    /* renamed from: h */
    private final View.OnClickListener f270415h = new C96653b(this);

    public C96654c(Activity activity) {
        this.f270412e = activity;
        Drawable c = C0678gm.m2375e().mo3100c(activity, R.drawable.quantum_ic_keyboard_voice_googblue_36);
        c.getClass();
        Drawable mutate = c.mutate();
        this.f270408a = mutate;
        C1929b.m5225f(mutate, C1878d.m5128a(activity, R.color.agsa_color_primary));
        Drawable c2 = C0678gm.m2375e().mo3100c(activity, R.drawable.quantum_ic_keyboard_voice_white_36);
        c2.getClass();
        Drawable mutate2 = c2.mutate();
        this.f270413f = mutate2;
        C1929b.m5225f(mutate2, C1878d.m5128a(activity, R.color.agsa_color_on_primary));
        Drawable c3 = C0678gm.m2375e().mo3100c(activity, R.drawable.quantum_ic_done_green500_36);
        c3.getClass();
        Drawable mutate3 = c3.mutate();
        this.f270414g = mutate3;
        C1929b.m5225f(mutate3, C1878d.m5128a(activity, R.color.ime_success));
    }

    /* renamed from: a */
    public final void mo90299a() {
        ImageView imageView = (ImageView) this.f270412e.findViewById(R.id.mic_image_indicator);
        imageView.getClass();
        this.f270410c = imageView;
        ImageView imageView2 = (ImageView) this.f270412e.findViewById(R.id.mic_image_indicator_background);
        imageView2.getClass();
        this.f270409b = imageView2;
        imageView2.setFocusable(true);
    }

    /* renamed from: b */
    public final void mo90300b() {
        if (this.f270410c == null || this.f270409b == null) {
            mo90299a();
        }
    }

    /* renamed from: c */
    public final void mo90301c() {
        this.f270409b.setOnClickListener(this.f270415h);
        this.f270409b.setContentDescription(this.f270412e.getString(R.string.vs_hint_tap_to_cancel));
    }

    /* renamed from: d */
    public final void mo90302d() {
        mo90300b();
        this.f270410c.setImageDrawable(this.f270413f);
        this.f270409b.setBackgroundResource(R.drawable.ime_recording_mic);
        mo90301c();
    }
}
