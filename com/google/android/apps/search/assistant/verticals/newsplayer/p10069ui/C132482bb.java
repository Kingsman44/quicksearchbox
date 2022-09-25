package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.bb */
/* compiled from: PG */
public final /* synthetic */ class C132482bb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ PlayingIndicatorView f361607a;

    public /* synthetic */ C132482bb(PlayingIndicatorView playingIndicatorView) {
        this.f361607a = playingIndicatorView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PlayingIndicatorView playingIndicatorView = this.f361607a;
        playingIndicatorView.f361525a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        playingIndicatorView.invalidate();
    }
}
