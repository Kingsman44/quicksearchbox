package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ConfirmCancelCountDownLayout */
/* compiled from: PG */
public class ConfirmCancelCountDownLayout extends LinearLayout {

    /* renamed from: a */
    public final Object f214910a = new Object();

    /* renamed from: b */
    public final Object f214911b = new Object();

    /* renamed from: c */
    public CountDownTimer f214912c;

    /* renamed from: d */
    public Runnable f214913d;

    /* renamed from: e */
    public Runnable f214914e;

    public ConfirmCancelCountDownLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo72978a(ImageView imageView, int i) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{imageView.getDrawable(), C1877c.m5125a(getContext(), i)});
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(200);
    }

    /* renamed from: b */
    public final void mo72979b() {
        synchronized (this.f214911b) {
            Runnable runnable = this.f214913d;
            if (runnable != null) {
                runnable.run();
                this.f214913d = null;
            }
            this.f214914e = null;
        }
    }

    /* renamed from: c */
    public final void mo72980c() {
        synchronized (this.f214910a) {
            CountDownTimer countDownTimer = this.f214912c;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            ((ProgressBar) findViewById(R.id.confirm_progress_circle)).setProgress(0);
        }
    }

    /* renamed from: d */
    public final void mo72981d(View view) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{view.getBackground(), C1877c.m5125a(getContext(), R.drawable.reversed_blue_circle_shape)});
        view.setBackground(transitionDrawable);
        transitionDrawable.startTransition(200);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            mo72980c();
            mo72979b();
        }
    }
}
