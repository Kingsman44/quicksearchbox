package com.google.android.apps.gsa.searchplate.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class HintTextView extends TextView {

    /* renamed from: a */
    private ObjectAnimator f241129a;

    /* renamed from: b */
    private ObjectAnimator f241130b;

    public HintTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo82919a() {
        this.f241129a.cancel();
        float alpha = getAlpha();
        if (alpha == 1.0f) {
            this.f241130b.setStartDelay(200);
        } else {
            this.f241130b.setStartDelay(0);
        }
        this.f241130b.setDuration((long) (alpha * 250.0f)).setFloatValues(new float[]{0.0f});
        this.f241130b.start();
    }

    /* renamed from: b */
    public final void mo82920b() {
        if (!this.f241129a.isStarted()) {
            this.f241130b.cancel();
            float alpha = getAlpha();
            long j = (long) ((1.0f - alpha) * 500.0f);
            if (alpha == 0.0f) {
                this.f241129a.setStartDelay(200);
            } else {
                this.f241129a.setStartDelay(0);
            }
            this.f241129a.setDuration(j).setFloatValues(new float[]{1.0f});
            this.f241129a.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.say_ok_google_x_translation);
        int i = true != C88939k.m144553i() ? 1 : -1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        this.f241129a = ofFloat;
        ofFloat.setDuration(500);
        ObjectAnimator.ofFloat(this, "translationX", new float[]{(float) (dimensionPixelSize * i), 0.0f}).setInterpolator(C91107f.f254408d);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        this.f241130b = ofFloat2;
        ofFloat2.setDuration(250);
    }

    public HintTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HintTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
