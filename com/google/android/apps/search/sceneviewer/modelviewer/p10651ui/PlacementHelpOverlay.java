package com.google.android.apps.search.sceneviewer.modelviewer.p10651ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.googlequicksearchbox.R;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ui.PlacementHelpOverlay */
/* compiled from: PG */
public final class PlacementHelpOverlay extends RelativeLayout {

    /* renamed from: a */
    public static final Duration f384401a = Duration.ofMillis(300);

    /* renamed from: b */
    public static final Duration f384402b = Duration.ofMillis(33);

    /* renamed from: c */
    public ViewPropertyAnimator f384403c = null;

    /* renamed from: d */
    public boolean f384404d = false;

    /* renamed from: e */
    public boolean f384405e = false;

    /* renamed from: f */
    private ViewTreeObserver.OnGlobalLayoutListener f384406f = C141612a.f384407a;

    public PlacementHelpOverlay(Context context) {
        super(context);
    }

    /* renamed from: d */
    private final void m229826d(float f, float f2) {
        ViewPropertyAnimator viewPropertyAnimator = this.f384403c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator alpha = animate().setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(f384401a.toMillis()).y(f).alpha(f2);
        this.f384403c = alpha;
        alpha.start();
    }

    /* renamed from: a */
    public final void mo116603a() {
        if (!this.f384404d) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f384406f);
            this.f384406f = new C141617f(this);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f384406f);
            return;
        }
        m229826d((float) ((getTop() + getHeight()) - 1), 0.0f);
    }

    /* renamed from: b */
    public final void mo116604b() {
        setY((float) ((getTop() + getHeight()) - 1));
        setAlpha(0.0f);
    }

    /* renamed from: c */
    public final void mo116605c() {
        if (!this.f384404d) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f384406f);
            this.f384406f = new C141616e(this);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f384406f);
            return;
        }
        m229826d((float) getTop(), 1.0f);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((ImageView) findViewById(R.id.sceneviewer_close_help_button)).setOnClickListener(new C141613b(this));
        getViewTreeObserver().addOnGlobalLayoutListener(new C141614c(this));
        setOnTouchListener(new C141615d(this));
    }

    public PlacementHelpOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlacementHelpOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
