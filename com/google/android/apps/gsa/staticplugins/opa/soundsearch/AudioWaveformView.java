package com.google.android.apps.gsa.staticplugins.opa.soundsearch;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.inject.C47266f;

/* compiled from: PG */
public final class AudioWaveformView extends FrameLayout {

    /* renamed from: a */
    public final AudioVisualizerView f309053a;

    /* renamed from: b */
    public final TimeAnimator f309054b;

    /* renamed from: c */
    public long f309055c;

    /* renamed from: d */
    public C104149a f309056d;

    /* renamed from: e */
    private final TextView f309057e;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.soundsearch.AudioWaveformView$a */
    /* compiled from: PG */
    public interface C110934a {
        /* renamed from: qM */
        void mo98951qM(AudioWaveformView audioWaveformView);
    }

    public AudioWaveformView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo98946a() {
        this.f309054b.cancel();
        this.f309053a.f309037a.cancel();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f309057e.setText(((SystemClock.uptimeMillis() - this.f309055c) / 3000) % 2 == 1 ? R.string.opa_soundsearch_label_still_working : R.string.opa_soundsearch_label_listening);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f309054b.setTimeListener(new C110936b(this));
        this.f309054b.start();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f309054b.cancel();
        this.f309054b.setTimeListener((TimeAnimator.TimeListener) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo98946a();
        }
    }

    public AudioWaveformView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioWaveformView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ContextThemeWrapper contextThemeWrapper;
        ((C110934a) C47266f.m84076a(context, C110934a.class)).mo98951qM(this);
        C104149a aVar = this.f309056d;
        if (aVar.mo93970a()) {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132149700);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132150912, true);
            }
        } else if (aVar.mo93971b()) {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132149701);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132150627, true);
            }
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132149701);
        }
        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.opa_soundsearch_audio_visualizer_view, this, true);
        this.f309053a = (AudioVisualizerView) inflate.findViewById(R.id.audio_visualizer_view);
        this.f309057e = (TextView) inflate.findViewById(R.id.opa_soundsearch_status);
        this.f309054b = new TimeAnimator();
    }
}
