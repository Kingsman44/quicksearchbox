package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.p119j.p120a.p121a.C2300b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.SimpleSnackbar */
/* compiled from: PG */
public final class SimpleSnackbar {
    private static final int ANIMATION_DURATION = 250;
    public static final int LENGTH_INDEFINITE = -1;
    public static final int LENGTH_LONG = 3500;
    public static final int LENGTH_SHORT = 2000;
    private static final Set allVisibleSnackbars = new HashSet();
    private final TextView actionText;
    /* access modifiers changed from: private */
    public final View content;
    private final Runnable dismissRunnable = new SimpleSnackbar$$ExternalSyntheticLambda1(this);
    private int duration;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private ValueAnimator hideAnimator;
    private boolean isQueued;
    private boolean isShown = false;
    private final Object lock = new Object();
    private final TextView mainText;
    private final ViewGroup parent;
    private ValueAnimator showAnimator;

    private SimpleSnackbar(ViewGroup viewGroup, View view) {
        this.parent = viewGroup;
        this.content = view;
        this.mainText = (TextView) view.findViewById(C10753R.C10755id.snackbar_text);
        this.actionText = (TextView) view.findViewById(C10753R.C10755id.snackbar_action);
    }

    /* access modifiers changed from: private */
    public void animateViewIn() {
        int translationYBottom = getTranslationYBottom();
        this.content.setTranslationY((float) translationYBottom);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.showAnimator = valueAnimator;
        valueAnimator.setIntValues(new int[]{translationYBottom, 0});
        this.showAnimator.setInterpolator(new C2300b());
        this.showAnimator.setDuration(250);
        this.showAnimator.addListener(new C10760d(this));
        this.showAnimator.addUpdateListener(new SimpleSnackbar$$ExternalSyntheticLambda0(this));
        this.showAnimator.start();
    }

    private void animateViewOut() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.hideAnimator = valueAnimator;
        valueAnimator.setIntValues(new int[]{0, getTranslationYBottom()});
        this.hideAnimator.setInterpolator(new C2300b());
        this.hideAnimator.setDuration(250);
        this.hideAnimator.addListener(new C10761e(this));
        this.hideAnimator.addUpdateListener(new SimpleSnackbar$$ExternalSyntheticLambda2(this));
        this.hideAnimator.start();
    }

    private void closeAllActiveSnackbars() {
        for (SimpleSnackbar dismiss : allVisibleSnackbars) {
            dismiss.dismiss();
        }
    }

    private static ViewGroup findSuitableParent(View view) {
        ViewGroup viewGroup = null;
        do {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
        } while (view != null);
        return viewGroup;
    }

    private int getTranslationYBottom() {
        int height = this.content.getHeight();
        ViewGroup.LayoutParams layoutParams = this.content.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public static SimpleSnackbar make(View view, int i, int i2) {
        ViewGroup findSuitableParent = findSuitableParent(view);
        if (findSuitableParent != null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(findSuitableParent.getContext()).inflate(C10753R.layout.viewer_snackbar, findSuitableParent, false);
            SimpleSnackbar simpleSnackbar = new SimpleSnackbar(findSuitableParent, viewGroup);
            simpleSnackbar.setText(i);
            simpleSnackbar.setDuration(i2);
            Resources resources = findSuitableParent.getContext().getResources();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 81;
            int dimensionPixelSize = resources.getDimensionPixelSize(C10753R.dimen.snackbar_side_margin);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C10753R.dimen.snackbar_bottom_margin);
            layoutParams.leftMargin = dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.bottomMargin = dimensionPixelSize2;
            viewGroup.setLayoutParams(layoutParams);
            return simpleSnackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* access modifiers changed from: private */
    public synchronized void onViewHidden() {
        this.isShown = false;
        allVisibleSnackbars.remove(this);
        this.parent.removeView(this.content);
    }

    /* access modifiers changed from: private */
    public synchronized void onViewShown() {
        this.isShown = true;
        this.isQueued = false;
        allVisibleSnackbars.add(this);
        int i = this.duration;
        if (i > 0) {
            this.handler.postDelayed(this.dismissRunnable, (long) i);
        }
        this.mainText.sendAccessibilityEvent(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismiss() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            android.os.Handler r1 = r3.handler     // Catch:{ all -> 0x0032 }
            java.lang.Runnable r2 = r3.dismissRunnable     // Catch:{ all -> 0x0032 }
            r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0032 }
            android.animation.ValueAnimator r1 = r3.showAnimator     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.isRunning()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0015
            goto L_0x001f
        L_0x0015:
            android.animation.ValueAnimator r1 = r3.showAnimator     // Catch:{ all -> 0x0032 }
            r1.cancel()     // Catch:{ all -> 0x0032 }
            r3.animateViewOut()     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x001f:
            boolean r1 = r3.isShown     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            android.animation.ValueAnimator r1 = r3.hideAnimator     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.isStarted()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
        L_0x002d:
            r3.animateViewOut()     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar.dismiss():void");
    }

    public boolean isShown() {
        return this.isShown;
    }

    public boolean isShownOrQueued() {
        return this.isShown || this.isQueued;
    }

    /* renamed from: lambda$animateViewIn$0$com-google-android-libraries-ar-sceneviewer-ui-SimpleSnackbar */
    public /* synthetic */ void mo19204x3a6c2c95(ValueAnimator valueAnimator) {
        this.content.setTranslationY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* renamed from: lambda$animateViewOut$1$com-google-android-libraries-ar-sceneviewer-ui-SimpleSnackbar */
    public /* synthetic */ void mo19205x428b9ccd(ValueAnimator valueAnimator) {
        this.content.setTranslationY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public SimpleSnackbar setAction(int i, View.OnClickListener onClickListener) {
        this.actionText.setText(i);
        this.actionText.setOnClickListener(onClickListener);
        this.actionText.setVisibility(0);
        return this;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setText(int i) {
        this.mainText.setText(i);
    }

    public void show() {
        ValueAnimator valueAnimator;
        this.isQueued = true;
        synchronized (this.lock) {
            if (!this.isShown && ((valueAnimator = this.showAnimator) == null || !valueAnimator.isStarted())) {
                closeAllActiveSnackbars();
                this.parent.addView(this.content);
                if (C2043bi.m5570ax(this.content)) {
                    animateViewIn();
                } else {
                    this.content.addOnLayoutChangeListener(new C10759c(this));
                }
            }
        }
    }
}
