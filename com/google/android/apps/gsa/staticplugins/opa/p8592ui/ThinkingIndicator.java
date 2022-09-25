package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.p098j.p100b.C2034a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.ThinkingIndicator */
/* compiled from: PG */
public class ThinkingIndicator extends FrameLayout {

    /* renamed from: b */
    private static final Interpolator f314924b = C2034a.m5471c(0.5f, 0.0f, 0.5f, 1.0f);

    /* renamed from: a */
    AnimatorSet f314925a;

    /* renamed from: c */
    private View f314926c;

    /* renamed from: d */
    private View f314927d;

    /* renamed from: e */
    private View f314928e;

    /* renamed from: f */
    private PowerManager f314929f;

    /* renamed from: g */
    private boolean f314930g;

    public ThinkingIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private final float m188271d(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private final AnimatorSet m188272e(View view, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j);
        Interpolator interpolator = f314924b;
        animatorSet.playSequentially(new Animator[]{m188273f(view, 6, 10, interpolator), m188273f(view, 10, 6, interpolator)});
        return animatorSet;
    }

    /* renamed from: f */
    private final ValueAnimator m188273f(View view, int i, int i2, Interpolator interpolator) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) m188271d((float) i), (int) m188271d((float) i2)});
        ofInt.setInterpolator(interpolator);
        ofInt.addUpdateListener(new C113729p(view));
        ofInt.addListener(new C113730q(ofInt));
        ofInt.setDuration(300);
        return ofInt;
    }

    /* renamed from: a */
    public final void mo100562a() {
        boolean isAttachedToWindow = isAttachedToWindow();
        this.f314930g = true;
        if (isAttachedToWindow) {
            mo100563b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo100563b() {
        AnimatorSet animatorSet;
        if (!this.f314929f.isPowerSaveMode() && (animatorSet = this.f314925a) != null && !animatorSet.isStarted()) {
            this.f314925a.start();
        }
    }

    /* renamed from: c */
    public final void mo100564c() {
        AnimatorSet animatorSet;
        boolean isAttachedToWindow = isAttachedToWindow();
        this.f314930g = false;
        if (isAttachedToWindow && (animatorSet = this.f314925a) != null) {
            animatorSet.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{m188272e(this.f314926c, 0), m188272e(this.f314927d, 300), m188272e(this.f314928e, 600)});
        animatorSet.addListener(new C113728o(animatorSet));
        this.f314925a = animatorSet;
        if (this.f314930g) {
            mo100563b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f314925a;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f314925a.removeAllListeners();
            this.f314925a = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f314926c = findViewById(R.id.left_dot);
        this.f314927d = findViewById(R.id.center_dot);
        this.f314928e = findViewById(R.id.right_dot);
        this.f314929f = (PowerManager) getContext().getSystemService("power");
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo100564c();
        }
    }

    public ThinkingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThinkingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f314925a = null;
        this.f314930g = false;
    }
}
