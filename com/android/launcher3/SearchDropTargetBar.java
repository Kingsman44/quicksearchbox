package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.launcher3.DragController;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class SearchDropTargetBar extends FrameLayout implements DragController.DragListener {
    private static int DEFAULT_DRAG_FADE_DURATION = 175;
    private static final TimeInterpolator DEFAULT_INTERPOLATOR = new AccelerateInterpolator();
    private static final TimeInterpolator MOVE_DOWN_INTERPOLATOR = new DecelerateInterpolator(0.6f);
    private static final TimeInterpolator MOVE_UP_INTERPOLATOR = new DecelerateInterpolator(1.5f);
    boolean mAccessibilityEnabled;
    private AnimatorSet mCurrentAnimation;
    public boolean mDeferOnDragEnd;
    public ButtonDropTarget mDeleteDropTarget;
    View mDropTargetBar;
    public ButtonDropTarget mInfoDropTarget;
    View mQSB;
    private State mState;
    public ButtonDropTarget mUninstallDropTarget;

    /* compiled from: PG */
    public enum State {
        INVISIBLE(0.0f, 0.0f, 0.0f),
        INVISIBLE_TRANSLATED(0.0f, 0.0f, -1.0f),
        SEARCH_BAR(1.0f, 0.0f, 0.0f),
        DROP_TARGET(0.0f, 1.0f, 0.0f);
        
        public final float mDropTargetBarAlpha;
        public final float mSearchBarAlpha;
        public final float mTranslation;

        private State(float f, float f2, float f3) {
            this.mSearchBarAlpha = f;
            this.mDropTargetBarAlpha = f2;
            this.mTranslation = f3;
        }
    }

    /* compiled from: PG */
    final class ViewVisiblilyUpdateHandler extends AnimatorListenerAdapter {
        private final View mView;

        public ViewVisiblilyUpdateHandler(View view) {
            this.mView = view;
        }

        public final void onAnimationEnd(Animator animator) {
            AlphaUpdateListener.updateVisibility(this.mView, SearchDropTargetBar.this.mAccessibilityEnabled);
        }

        public final void onAnimationStart(Animator animator) {
            this.mView.setVisibility(0);
        }
    }

    public SearchDropTargetBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void animateAlpha(View view, float f, TimeInterpolator timeInterpolator) {
        if (Float.compare(view.getAlpha(), f) != 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f});
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat.addListener(new ViewVisiblilyUpdateHandler(view));
            this.mCurrentAnimation.play(ofFloat);
        }
    }

    public final void animateToState(State state, int i, AnimatorSet animatorSet) {
        float f;
        TimeInterpolator timeInterpolator;
        if (this.mState != state) {
            this.mState = state;
            this.mAccessibilityEnabled = ((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled();
            AnimatorSet animatorSet2 = this.mCurrentAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.mCurrentAnimation = null;
            if (i > 0) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.mCurrentAnimation = animatorSet3;
                animatorSet3.setDuration((long) i);
                View view = this.mDropTargetBar;
                State state2 = this.mState;
                State state3 = State.INVISIBLE;
                animateAlpha(view, state2.mDropTargetBarAlpha, DEFAULT_INTERPOLATOR);
            } else {
                View view2 = this.mDropTargetBar;
                State state4 = this.mState;
                State state5 = State.INVISIBLE;
                view2.setAlpha(state4.mDropTargetBarAlpha);
                AlphaUpdateListener.updateVisibility(this.mDropTargetBar, this.mAccessibilityEnabled);
            }
            if (this.mQSB != null) {
                if (Launcher.getLauncher(getContext()).mDeviceProfile.isVerticalBarLayout()) {
                    f = 0.0f;
                } else {
                    f = this.mState.mTranslation * ((float) getMeasuredHeight());
                }
                if (i > 0) {
                    int compare = Float.compare(this.mQSB.getTranslationY(), f);
                    View view3 = this.mQSB;
                    float f2 = this.mState.mSearchBarAlpha;
                    if (compare == 0) {
                        timeInterpolator = DEFAULT_INTERPOLATOR;
                    } else if (compare < 0) {
                        timeInterpolator = MOVE_DOWN_INTERPOLATOR;
                    } else {
                        timeInterpolator = MOVE_UP_INTERPOLATOR;
                    }
                    animateAlpha(view3, f2, timeInterpolator);
                    if (compare != 0) {
                        this.mCurrentAnimation.play(ObjectAnimator.ofFloat(this.mQSB, View.TRANSLATION_Y, new float[]{f}));
                    }
                } else {
                    this.mQSB.setTranslationY(f);
                    this.mQSB.setAlpha(this.mState.mSearchBarAlpha);
                    AlphaUpdateListener.updateVisibility(this.mQSB, this.mAccessibilityEnabled);
                }
            }
            if (i <= 0) {
                return;
            }
            if (animatorSet != null) {
                animatorSet.play(this.mCurrentAnimation);
            } else {
                this.mCurrentAnimation.start();
            }
        }
    }

    public final void enableAccessibleDrag(boolean z) {
        View view = this.mQSB;
        if (view != null) {
            view.setVisibility(true != z ? 0 : 8);
        }
        ButtonDropTarget buttonDropTarget = this.mInfoDropTarget;
        ButtonDropTarget buttonDropTarget2 = null;
        buttonDropTarget.setOnClickListener(true != z ? null : buttonDropTarget);
        ButtonDropTarget buttonDropTarget3 = this.mDeleteDropTarget;
        buttonDropTarget3.setOnClickListener(true != z ? null : buttonDropTarget3);
        ButtonDropTarget buttonDropTarget4 = this.mUninstallDropTarget;
        if (true == z) {
            buttonDropTarget2 = buttonDropTarget4;
        }
        buttonDropTarget4.setOnClickListener(buttonDropTarget2);
    }

    public final void onDragEnd() {
        if (!this.mDeferOnDragEnd) {
            animateToState(State.SEARCH_BAR, DEFAULT_DRAG_FADE_DURATION, (AnimatorSet) null);
        } else {
            this.mDeferOnDragEnd = false;
        }
    }

    public final void onDragStart$ar$ds(DragSource dragSource, Object obj) {
        animateToState(State.DROP_TARGET, DEFAULT_DRAG_FADE_DURATION, (AnimatorSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.drag_target_bar);
        this.mDropTargetBar = findViewById;
        this.mInfoDropTarget = (ButtonDropTarget) findViewById.findViewById(R.id.info_target_text);
        this.mDeleteDropTarget = (ButtonDropTarget) this.mDropTargetBar.findViewById(R.id.delete_target_text);
        this.mUninstallDropTarget = (ButtonDropTarget) this.mDropTargetBar.findViewById(R.id.uninstall_target_text);
        this.mInfoDropTarget.mSearchDropTargetBar = this;
        this.mDeleteDropTarget.mSearchDropTargetBar = this;
        this.mUninstallDropTarget.mSearchDropTargetBar = this;
        this.mDropTargetBar.setAlpha(0.0f);
        AlphaUpdateListener.updateVisibility(this.mDropTargetBar, this.mAccessibilityEnabled);
    }

    public SearchDropTargetBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mState = State.SEARCH_BAR;
        this.mDeferOnDragEnd = false;
        this.mAccessibilityEnabled = false;
    }
}
