package com.google.android.libraries.lens.view.livingsurfaces.p2150ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.ui.LivingSurfaceAudioButton */
/* compiled from: PG */
public final class LivingSurfaceAudioButton extends FloatingActionButton {

    /* renamed from: a */
    public boolean f74565a;

    /* renamed from: g */
    private Drawable f74566g;

    /* renamed from: h */
    private Drawable f74567h;

    /* renamed from: i */
    private String f74568i;

    /* renamed from: j */
    private String f74569j;

    public LivingSurfaceAudioButton(Context context) {
        super(context);
        this.f74565a = true;
    }

    /* renamed from: b */
    public final void mo32788b(boolean z) {
        this.f74565a = z;
        if (z) {
            setImageDrawable(this.f74567h);
            setContentDescription(this.f74569j);
            return;
        }
        setImageDrawable(this.f74566g);
        setContentDescription(this.f74568i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f74568i = getResources().getString(R.string.lens_living_surface_audio_button_mute);
        this.f74569j = getResources().getString(R.string.lens_living_surface_audio_button_unmute);
        this.f74566g = getResources().getDrawable(R.drawable.quantum_ic_volume_up_black_24);
        this.f74567h = getResources().getDrawable(R.drawable.quantum_ic_volume_off_black_24);
        mo32788b(true);
    }

    public LivingSurfaceAudioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LivingSurfaceAudioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f74565a = true;
    }
}
