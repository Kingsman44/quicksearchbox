package com.google.android.apps.gsa.shared.p7148ui.header;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.g */
/* compiled from: PG */
final class C90694g implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ArgbEvaluator f253686a = new ArgbEvaluator();

    /* renamed from: b */
    private ValueAnimator f253687b;

    /* renamed from: c */
    private final View f253688c;

    /* renamed from: d */
    private View f253689d;

    /* renamed from: e */
    private View f253690e;

    /* renamed from: f */
    private View f253691f;

    /* renamed from: g */
    private final List f253692g = new ArrayList();

    /* renamed from: h */
    private int f253693h;

    /* renamed from: i */
    private int f253694i;

    /* renamed from: j */
    private int f253695j;

    /* renamed from: k */
    private boolean f253696k;

    public C90694g(View view) {
        this.f253688c = view;
        this.f253687b = m148085b();
    }

    /* renamed from: b */
    private final ValueAnimator m148085b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(660);
        ofFloat.setInterpolator(C91107f.f254408d);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        return ofFloat;
    }

    /* renamed from: c */
    private final void m148086c(int i) {
        for (ImageView colorFilter : this.f253692g) {
            colorFilter.setColorFilter(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85012a(View view, int i, boolean z) {
        if (this.f253696k) {
            if (this.f253690e != view) {
                this.f253691f = view;
                this.f253695j = i;
                return;
            }
            this.f253691f = null;
        } else if (this.f253688c.getVisibility() == 8 && view == this.f253689d) {
            m148086c(i);
        } else if (z) {
            View view2 = this.f253689d;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            this.f253689d = view;
            view.setVisibility(0);
            this.f253688c.setVisibility(8);
            this.f253693h = i;
        } else {
            this.f253690e = view;
            this.f253694i = i;
            this.f253687b.setStartDelay(0);
            this.f253687b.start();
            this.f253696k = true;
        }
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (animator == this.f253687b) {
            this.f253688c.setVisibility(8);
            this.f253689d = this.f253690e;
            int i = this.f253694i;
            this.f253693h = i;
            m148086c(i);
            View view = this.f253691f;
            if (view != null) {
                this.f253690e = view;
                this.f253694i = this.f253695j;
                this.f253691f = null;
                this.f253687b.removeAllListeners();
                ValueAnimator b = m148085b();
                this.f253687b = b;
                b.start();
                return;
            }
            this.f253696k = false;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        if (animator == this.f253687b) {
            this.f253688c.setVisibility(0);
            this.f253688c.setAlpha(0.0f);
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (valueAnimator == this.f253687b) {
            if (floatValue < 0.5f) {
                this.f253688c.setAlpha(floatValue / 0.5f);
            } else {
                View view = this.f253689d;
                if (view != null) {
                    view.setVisibility(8);
                }
                this.f253690e.setVisibility(0);
                this.f253688c.setAlpha((1.0f - floatValue) / 0.5f);
            }
            m148086c(((Integer) this.f253686a.evaluate(floatValue, Integer.valueOf(this.f253693h), Integer.valueOf(this.f253694i))).intValue());
        }
    }
}
