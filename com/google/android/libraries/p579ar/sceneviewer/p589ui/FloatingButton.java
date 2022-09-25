package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AnimationUtilities;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.FloatingButton */
/* compiled from: PG */
public final class FloatingButton extends AppCompatImageButton {
    public static final float DEFAULT_FADE_ALPHA = 0.3f;
    /* access modifiers changed from: private */
    public boolean fullyInflated = false;
    private ViewTreeObserver.OnGlobalLayoutListener fullyInflatedListener = FloatingButton$$ExternalSyntheticLambda0.INSTANCE;
    private Types.Visibility visibilityState = Types.Visibility.VISIBLE;

    public FloatingButton(Context context) {
        super(context);
    }

    static /* synthetic */ void lambda$new$0() {
    }

    private void setVisibilityStateImpl(Types.Visibility visibility, int i) {
        if (!this.fullyInflated) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.fullyInflatedListener);
            this.fullyInflatedListener = new C10758b(this, visibility, i);
            getViewTreeObserver().addOnGlobalLayoutListener(this.fullyInflatedListener);
            return;
        }
        if (isEnabled()) {
            if (Types.Visibility.FADED.equals(visibility)) {
                AnimationUtilities.animateAlpha(this, 0.3f, i);
            } else {
                AnimationUtilities.animateVisibility(this, Types.Visibility.VISIBLE.equals(visibility), i);
            }
        } else if (!Types.Visibility.HIDDEN.equals(this.visibilityState)) {
            AnimationUtilities.animateVisibility(this, false, i);
        }
        this.visibilityState = visibility;
    }

    public Types.Visibility getVisibilityState() {
        return this.visibilityState;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        getViewTreeObserver().addOnGlobalLayoutListener(new C10757a(this));
    }

    public void setEnabled(boolean z) {
        setEnabled(z, 0);
    }

    public void setFullyInflated(boolean z) {
        this.fullyInflated = z;
    }

    public void setVisibilityState(Types.Visibility visibility, int i) {
        setVisibilityStateImpl(visibility, i);
    }

    public void setEnabled(boolean z, int i) {
        super.setEnabled(z);
        setVisibilityStateImpl(this.visibilityState, i);
    }

    public FloatingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FloatingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
