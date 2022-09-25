package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.android.launcher3.Workspace;
import com.android.launcher3.util.CircleRevealOutlineProvider;
import com.google.android.googlequicksearchbox.R;
import java.util.HashMap;

/* compiled from: PG */
public final class LauncherStateTransitionAnimation {
    AnimatorSet mCurrentAnimation;
    final Launcher mLauncher;

    /* compiled from: PG */
    class PrivateTransitionCallbacks {
        public final float materialRevealViewFinalAlpha;

        public PrivateTransitionCallbacks(float f) {
            this.materialRevealViewFinalAlpha = f;
        }

        public AnimatorListenerAdapter getMaterialRevealViewAnimatorListener(View view, View view2) {
            return null;
        }

        public float getMaterialRevealViewStartFinalRadius() {
            return 0.0f;
        }

        public void onTransitionComplete() {
        }
    }

    public LauncherStateTransitionAnimation(Launcher launcher) {
        this.mLauncher = launcher;
    }

    private final void cancelAnimation() {
        AnimatorSet animatorSet = this.mCurrentAnimation;
        if (animatorSet != null) {
            animatorSet.setDuration(0);
            this.mCurrentAnimation.cancel();
            this.mCurrentAnimation = null;
        }
    }

    static final void dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(View view, boolean z) {
        if (view instanceof LauncherTransitionable) {
            ((LauncherTransitionable) view).onLauncherTransitionEnd$ar$ds(z);
        }
        dispatchOnLauncherTransitionStep$ar$ds(view, 1.0f);
    }

    static final void dispatchOnLauncherTransitionPrepare$ar$ds(View view) {
        if (view instanceof LauncherTransitionable) {
            ((LauncherTransitionable) view).onLauncherTransitionPrepare$ar$ds();
        }
    }

    static final void dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(View view) {
        if (view instanceof LauncherTransitionable) {
            ((LauncherTransitionable) view).onLauncherTransitionStart$ar$ds();
        }
        dispatchOnLauncherTransitionStep$ar$ds(view, 0.0f);
    }

    static final void dispatchOnLauncherTransitionStep$ar$ds(View view, float f) {
        if (view instanceof LauncherTransitionable) {
            ((LauncherTransitionable) view).onLauncherTransitionStep$ar$ds(f);
        }
    }

    private final Animator dispatchOnLauncherTransitionStepAnim(final View view, final View view2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LauncherStateTransitionAnimation.dispatchOnLauncherTransitionStep$ar$ds(view, valueAnimator.getAnimatedFraction());
                LauncherStateTransitionAnimation.dispatchOnLauncherTransitionStep$ar$ds(view2, valueAnimator.getAnimatedFraction());
            }
        });
        return ofFloat;
    }

    private final AnimatorSet startAnimationToWorkspaceFromOverlay$ar$ds(Workspace.State state, int i, View view, BaseContainerView baseContainerView, boolean z, Runnable runnable, PrivateTransitionCallbacks privateTransitionCallbacks) {
        Workspace workspace;
        float f;
        float f2;
        TimeInterpolator timeInterpolator;
        float f3;
        long j;
        int i2;
        long j2;
        Workspace.State state2 = state;
        View view2 = view;
        BaseContainerView baseContainerView2 = baseContainerView;
        boolean z2 = z;
        PrivateTransitionCallbacks privateTransitionCallbacks2 = privateTransitionCallbacks;
        AnimatorSet createAnimatorSet = LauncherAnimUtils.createAnimatorSet();
        Resources resources = this.mLauncher.getResources();
        boolean z3 = Utilities.ATLEAST_LOLLIPOP;
        int integer = resources.getInteger(R.integer.config_overlayRevealTime);
        int integer2 = resources.getInteger(R.integer.config_overlayItemsAlphaStagger);
        Workspace workspace2 = this.mLauncher.mWorkspace;
        HashMap hashMap = new HashMap();
        cancelAnimation();
        Animator startWorkspaceStateChangeAnimation = this.mLauncher.startWorkspaceStateChangeAnimation(state2, i, z2, hashMap);
        startWorkspaceSearchBarAnimation(state2, true != z2 ? 0 : integer, createAnimatorSet);
        Animator dispatchOnLauncherTransitionStepAnim = dispatchOnLauncherTransitionStepAnim(baseContainerView2, workspace2);
        if (!z2 || view2 == null) {
            BaseContainerView baseContainerView3 = baseContainerView2;
            Workspace workspace3 = workspace2;
            baseContainerView3.setVisibility(8);
            dispatchOnLauncherTransitionPrepare$ar$ds(baseContainerView);
            dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(baseContainerView);
            dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(baseContainerView3, true);
            dispatchOnLauncherTransitionPrepare$ar$ds(workspace3);
            dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(workspace3);
            dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(workspace3, true);
            privateTransitionCallbacks.onTransitionComplete();
            if (runnable == null) {
                return null;
            }
            runnable.run();
            return null;
        }
        if (startWorkspaceStateChangeAnimation != null) {
            createAnimatorSet.play(startWorkspaceStateChangeAnimation);
        }
        createAnimatorSet.play(dispatchOnLauncherTransitionStepAnim);
        View view3 = baseContainerView2.mRevealView;
        final View view4 = baseContainerView2.mContent;
        if (baseContainerView.getVisibility() == 0) {
            int measuredWidth = view3.getMeasuredWidth();
            int measuredHeight = view3.getMeasuredHeight();
            int i3 = measuredWidth / 2;
            int i4 = measuredHeight / 2;
            View view5 = view4;
            float hypot = (float) Math.hypot((double) i3, (double) i4);
            view3.setVisibility(0);
            view3.setAlpha(1.0f);
            view3.setTranslationY(0.0f);
            hashMap.put(view3, 1);
            if (z3) {
                int[] centerDeltaInScreenSpace$ar$ds = Utilities.getCenterDeltaInScreenSpace$ar$ds(view3, view2);
                f2 = (float) centerDeltaInScreenSpace$ar$ds[1];
                f = (float) centerDeltaInScreenSpace$ar$ds[0];
            } else {
                f2 = (float) ((measuredHeight + measuredHeight) / 3);
                f = 0.0f;
            }
            if (z3) {
                timeInterpolator = new LogDecelerateInterpolator();
            } else {
                timeInterpolator = new DecelerateInterpolator(1.0f);
            }
            workspace = workspace2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "translationY", new float[]{0.0f, f2});
            int i5 = i3;
            long j3 = (long) (integer - 16);
            ofFloat.setDuration(j3);
            float f4 = hypot;
            String str = "translationY";
            int i6 = i4;
            long j4 = (long) (integer2 + 16);
            ofFloat.setStartDelay(j4);
            ofFloat.setInterpolator(timeInterpolator);
            createAnimatorSet.play(ofFloat);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "translationX", new float[]{0.0f, f});
            ofFloat2.setDuration(j3);
            ofFloat2.setStartDelay(j4);
            ofFloat2.setInterpolator(timeInterpolator);
            createAnimatorSet.play(ofFloat2);
            if (!z3) {
                PrivateTransitionCallbacks privateTransitionCallbacks3 = privateTransitionCallbacks;
                f3 = 0.0f;
            } else {
                f3 = privateTransitionCallbacks.materialRevealViewFinalAlpha;
            }
            if (f3 != 1.0f) {
                i2 = integer2;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, f3});
                if (z3) {
                    j = j4;
                    j2 = (long) integer;
                } else {
                    j = j4;
                    j2 = 150;
                }
                ofFloat3.setDuration(j2);
                ofFloat3.setStartDelay(z3 ? 0 : j);
                ofFloat3.setInterpolator(timeInterpolator);
                createAnimatorSet.play(ofFloat3);
            } else {
                i2 = integer2;
                j = j4;
            }
            view4 = view5;
            hashMap.put(view4, 1);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view4, str, new float[]{0.0f, f2});
            view4.setTranslationY(0.0f);
            ofFloat4.setDuration(j3);
            ofFloat4.setInterpolator(timeInterpolator);
            ofFloat4.setStartDelay(j);
            createAnimatorSet.play(ofFloat4);
            view4.setAlpha(1.0f);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view4, "alpha", new float[]{1.0f, 0.0f});
            ofFloat5.setDuration(100);
            ofFloat5.setInterpolator(timeInterpolator);
            createAnimatorSet.play(ofFloat5);
            if (z3) {
                float materialRevealViewStartFinalRadius = privateTransitionCallbacks.getMaterialRevealViewStartFinalRadius();
                AnimatorListenerAdapter materialRevealViewAnimatorListener = privateTransitionCallbacks.getMaterialRevealViewAnimatorListener(view3, view);
                ValueAnimator createRevealAnimator = new CircleRevealOutlineProvider(i5, i6, f4, materialRevealViewStartFinalRadius).createRevealAnimator(view3, false);
                createRevealAnimator.setInterpolator(new LogDecelerateInterpolator());
                createRevealAnimator.setDuration((long) integer);
                createRevealAnimator.setStartDelay((long) i2);
                if (materialRevealViewAnimatorListener != null) {
                    createRevealAnimator.addListener(materialRevealViewAnimatorListener);
                }
                createAnimatorSet.play(createRevealAnimator);
            } else {
                PrivateTransitionCallbacks privateTransitionCallbacks4 = privateTransitionCallbacks;
            }
        } else {
            workspace = workspace2;
        }
        dispatchOnLauncherTransitionPrepare$ar$ds(baseContainerView);
        dispatchOnLauncherTransitionPrepare$ar$ds(workspace);
        final BaseContainerView baseContainerView4 = baseContainerView;
        final Workspace workspace4 = workspace;
        final Runnable runnable2 = runnable;
        final HashMap hashMap2 = hashMap;
        final PrivateTransitionCallbacks privateTransitionCallbacks5 = privateTransitionCallbacks;
        createAnimatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                baseContainerView4.setVisibility(8);
                LauncherStateTransitionAnimation.dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(baseContainerView4, true);
                LauncherStateTransitionAnimation.dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(workspace4, true);
                Runnable runnable = runnable2;
                if (runnable != null) {
                    runnable.run();
                }
                for (View view : hashMap2.keySet()) {
                    if (((Integer) hashMap2.get(view)).intValue() == 1) {
                        view.setLayerType(0, (Paint) null);
                    }
                }
                View view2 = view4;
                if (view2 != null) {
                    view2.setTranslationX(0.0f);
                    view4.setTranslationY(0.0f);
                    view4.setAlpha(1.0f);
                }
                LauncherStateTransitionAnimation.this.mCurrentAnimation = null;
                privateTransitionCallbacks5.onTransitionComplete();
            }
        });
        final AnimatorSet animatorSet = createAnimatorSet;
        final BaseContainerView baseContainerView5 = baseContainerView;
        final Workspace workspace5 = workspace;
        baseContainerView.post(new Runnable() {
            public final void run() {
                if (LauncherStateTransitionAnimation.this.mCurrentAnimation == animatorSet) {
                    LauncherStateTransitionAnimation.dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(baseContainerView5);
                    LauncherStateTransitionAnimation.dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(workspace5);
                    for (View view : hashMap2.keySet()) {
                        if (((Integer) hashMap2.get(view)).intValue() == 1) {
                            view.setLayerType(2, (Paint) null);
                        }
                        if (Utilities.ATLEAST_LOLLIPOP && Utilities.isViewAttachedToWindow(view)) {
                            view.buildLayer();
                        }
                    }
                    animatorSet.start();
                }
            }
        });
        return createAnimatorSet;
    }

    private final void startWorkspaceSearchBarAnimation(Workspace.State state, int i, AnimatorSet animatorSet) {
        this.mLauncher.mSearchDropTargetBar.animateToState(state.searchDropTargetBarState, i, animatorSet);
    }

    public final AnimatorSet startAnimationToOverlay$ar$ds(Workspace.State state, View view, BaseContainerView baseContainerView, boolean z, PrivateTransitionCallbacks privateTransitionCallbacks) {
        Workspace workspace;
        Animator animator;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        Workspace.State state2 = state;
        View view2 = view;
        BaseContainerView baseContainerView2 = baseContainerView;
        boolean z2 = z;
        PrivateTransitionCallbacks privateTransitionCallbacks2 = privateTransitionCallbacks;
        AnimatorSet createAnimatorSet = LauncherAnimUtils.createAnimatorSet();
        Resources resources = this.mLauncher.getResources();
        boolean z3 = Utilities.ATLEAST_LOLLIPOP;
        int integer = resources.getInteger(R.integer.config_overlayRevealTime);
        int integer2 = resources.getInteger(R.integer.config_overlayItemsAlphaStagger);
        Workspace workspace2 = this.mLauncher.mWorkspace;
        HashMap hashMap = new HashMap();
        cancelAnimation();
        Animator startWorkspaceStateChangeAnimation = this.mLauncher.startWorkspaceStateChangeAnimation(state2, -1, z2, hashMap);
        startWorkspaceSearchBarAnimation(state2, true != z2 ? 0 : integer, createAnimatorSet);
        Animator dispatchOnLauncherTransitionStepAnim = dispatchOnLauncherTransitionStepAnim(workspace2, baseContainerView2);
        View view3 = baseContainerView2.mContent;
        if (!z2 || view2 == null) {
            BaseContainerView baseContainerView3 = baseContainerView2;
            Workspace workspace3 = workspace2;
            baseContainerView3.setTranslationX(0.0f);
            baseContainerView3.setTranslationY(0.0f);
            baseContainerView3.setScaleX(1.0f);
            baseContainerView3.setScaleY(1.0f);
            baseContainerView3.setVisibility(0);
            baseContainerView.bringToFront();
            view3.setVisibility(0);
            dispatchOnLauncherTransitionPrepare$ar$ds(workspace3);
            dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(workspace3);
            dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(workspace3, false);
            dispatchOnLauncherTransitionPrepare$ar$ds(baseContainerView);
            dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(baseContainerView);
            dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(baseContainerView3, false);
            privateTransitionCallbacks.onTransitionComplete();
            return null;
        }
        View view4 = baseContainerView2.mRevealView;
        int measuredWidth = view4.getMeasuredWidth();
        int measuredHeight = view4.getMeasuredHeight();
        int i3 = measuredWidth / 2;
        int i4 = measuredHeight / 2;
        Animator animator2 = startWorkspaceStateChangeAnimation;
        int i5 = i3;
        float hypot = (float) Math.hypot((double) i3, (double) i4);
        view4.setVisibility(0);
        view4.setAlpha(0.0f);
        view4.setTranslationY(0.0f);
        view4.setTranslationX(0.0f);
        if (z3) {
            int[] centerDeltaInScreenSpace$ar$ds = Utilities.getCenterDeltaInScreenSpace$ar$ds(view4, view2);
            f = privateTransitionCallbacks2.materialRevealViewFinalAlpha;
            i = 1;
            f3 = (float) centerDeltaInScreenSpace$ar$ds[1];
            f2 = (float) centerDeltaInScreenSpace$ar$ds[0];
            workspace = workspace2;
            animator = dispatchOnLauncherTransitionStepAnim;
            i2 = 2;
        } else {
            i = 1;
            f3 = (float) ((measuredHeight + measuredHeight) / 3);
            workspace = workspace2;
            animator = dispatchOnLauncherTransitionStepAnim;
            f2 = 0.0f;
            i2 = 2;
            f = 0.0f;
        }
        float[] fArr = new float[i2];
        fArr[0] = f;
        fArr[i] = 1.0f;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", fArr);
        float f4 = hypot;
        float[] fArr2 = new float[i2];
        fArr2[0] = f3;
        fArr2[i] = 0.0f;
        int i6 = i4;
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", fArr2);
        float[] fArr3 = new float[i2];
        fArr3[0] = f2;
        fArr3[i] = 0.0f;
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("translationX", fArr3);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
        propertyValuesHolderArr[0] = ofFloat;
        propertyValuesHolderArr[i] = ofFloat2;
        propertyValuesHolderArr[i2] = ofFloat3;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view4, propertyValuesHolderArr);
        long j = (long) integer;
        ofPropertyValuesHolder.setDuration(j);
        ofPropertyValuesHolder.setInterpolator(new LogDecelerateInterpolator());
        Integer valueOf = Integer.valueOf(i);
        hashMap.put(view4, valueOf);
        createAnimatorSet.play(ofPropertyValuesHolder);
        view3.setVisibility(0);
        view3.setAlpha(0.0f);
        view3.setTranslationY(f3);
        hashMap.put(view3, valueOf);
        float[] fArr4 = new float[2];
        fArr4[0] = f3;
        fArr4[i] = 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, "translationY", fArr4);
        ofFloat4.setDuration(j);
        ofFloat4.setInterpolator(new LogDecelerateInterpolator());
        long j2 = (long) integer2;
        ofFloat4.setStartDelay(j2);
        createAnimatorSet.play(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view3, "alpha", new float[]{0.0f, 1.0f});
        ofFloat5.setDuration(j);
        ofFloat5.setInterpolator(new AccelerateInterpolator(1.5f));
        ofFloat5.setStartDelay(j2);
        createAnimatorSet.play(ofFloat5);
        if (z3) {
            float materialRevealViewStartFinalRadius = privateTransitionCallbacks.getMaterialRevealViewStartFinalRadius();
            long j3 = j;
            AnimatorListenerAdapter materialRevealViewAnimatorListener = privateTransitionCallbacks.getMaterialRevealViewAnimatorListener(view4, view);
            ValueAnimator createRevealAnimator = new CircleRevealOutlineProvider(i5, i6, materialRevealViewStartFinalRadius, f4).createRevealAnimator(view4, false);
            createRevealAnimator.setDuration(j3);
            createRevealAnimator.setInterpolator(new LogDecelerateInterpolator());
            if (materialRevealViewAnimatorListener != null) {
                createRevealAnimator.addListener(materialRevealViewAnimatorListener);
            }
            createAnimatorSet.play(createRevealAnimator);
        } else {
            PrivateTransitionCallbacks privateTransitionCallbacks3 = privateTransitionCallbacks;
        }
        final View view5 = view4;
        final Workspace workspace4 = workspace;
        final BaseContainerView baseContainerView4 = baseContainerView;
        final HashMap hashMap2 = hashMap;
        final PrivateTransitionCallbacks privateTransitionCallbacks4 = privateTransitionCallbacks;
        createAnimatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                LauncherStateTransitionAnimation.dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(workspace4, false);
                LauncherStateTransitionAnimation.dispatchOnLauncherTransitionEnd$ar$ds$9297aa09_0(baseContainerView4, false);
                view5.setVisibility(4);
                for (View view : hashMap2.keySet()) {
                    if (((Integer) hashMap2.get(view)).intValue() == 1) {
                        view.setLayerType(0, (Paint) null);
                    }
                }
                LauncherStateTransitionAnimation.this.mCurrentAnimation = null;
                privateTransitionCallbacks4.onTransitionComplete();
            }
        });
        if (animator2 != null) {
            createAnimatorSet.play(animator2);
        }
        createAnimatorSet.play(animator);
        dispatchOnLauncherTransitionPrepare$ar$ds(workspace);
        dispatchOnLauncherTransitionPrepare$ar$ds(baseContainerView);
        final AnimatorSet animatorSet = createAnimatorSet;
        final Workspace workspace5 = workspace;
        final BaseContainerView baseContainerView5 = baseContainerView;
        final HashMap hashMap3 = hashMap;
        C53723 r0 = new Runnable() {
            public final void run() {
                if (LauncherStateTransitionAnimation.this.mCurrentAnimation == animatorSet) {
                    LauncherStateTransitionAnimation.dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(workspace5);
                    LauncherStateTransitionAnimation.dispatchOnLauncherTransitionStart$ar$ds$49c92ae7_0(baseContainerView5);
                    for (View view : hashMap3.keySet()) {
                        if (((Integer) hashMap3.get(view)).intValue() == 1) {
                            view.setLayerType(2, (Paint) null);
                        }
                        if (Utilities.ATLEAST_LOLLIPOP && Utilities.isViewAttachedToWindow(view)) {
                            view.buildLayer();
                        }
                    }
                    baseContainerView5.requestFocus();
                    animatorSet.start();
                }
            }
        };
        baseContainerView.bringToFront();
        BaseContainerView baseContainerView6 = baseContainerView;
        baseContainerView6.setVisibility(0);
        baseContainerView6.post(r0);
        return createAnimatorSet;
    }

    public final void startAnimationToWorkspace$ar$edu$ar$ds(int i, Workspace.State state, int i2, boolean z, Runnable runnable) {
        if (!(state == Workspace.State.NORMAL || state == Workspace.State.SPRING_LOADED || state == Workspace.State.OVERVIEW)) {
            Log.e("LSTAnimation", "Unexpected call to startAnimationToWorkspace");
        }
        if (i == 3 || i == 4) {
            Launcher launcher = this.mLauncher;
            Workspace.State state2 = state;
            int i3 = i2;
            this.mCurrentAnimation = startAnimationToWorkspaceFromOverlay$ar$ds(state2, i3, launcher.mAllAppsButton, launcher.mAppsView, z, runnable, new PrivateTransitionCallbacks() {
                public final AnimatorListenerAdapter getMaterialRevealViewAnimatorListener(final View view, final View view2) {
                    return new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            view.setVisibility(4);
                            view2.setAlpha(1.0f);
                        }

                        public final void onAnimationStart(Animator animator) {
                            view2.setVisibility(0);
                            view2.setAlpha(0.0f);
                        }
                    };
                }

                public final float getMaterialRevealViewStartFinalRadius() {
                    return (float) (LauncherStateTransitionAnimation.this.mLauncher.mDeviceProfile.allAppsButtonVisualSize / 2);
                }
            });
            return;
        }
        Launcher launcher2 = this.mLauncher;
        Workspace.State state3 = state;
        int i4 = i2;
        this.mCurrentAnimation = startAnimationToWorkspaceFromOverlay$ar$ds(state3, i4, launcher2.mWidgetsButton, launcher2.mWidgetsView, z, runnable, new PrivateTransitionCallbacks() {
            public final AnimatorListenerAdapter getMaterialRevealViewAnimatorListener(final View view, View view2) {
                return new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        view.setVisibility(4);
                    }
                };
            }
        });
    }
}
