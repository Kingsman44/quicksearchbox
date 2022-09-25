package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.f */
/* compiled from: PG */
public final class C102416f {

    /* renamed from: a */
    private static final Interpolator f285835a = C91107f.m148859b(0.0f, 0.0f, 0.1f, 1.0f);

    /* renamed from: b */
    private static final Interpolator f285836b = C91107f.m148859b(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: c */
    private static final Interpolator f285837c = C91107f.m148859b(0.0f, 0.0f, 0.6f, 1.0f);

    /* renamed from: d */
    private static final Interpolator f285838d = C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: e */
    private static final Deque f285839e = new ArrayDeque();

    /* renamed from: f */
    private static final Set f285840f = new HashSet();

    /* renamed from: a */
    static void m169815a(Animator animator) {
        Deque deque = f285839e;
        deque.addLast(animator);
        if (deque.size() == 1) {
            ((Animator) deque.getFirst()).start();
        }
    }

    /* renamed from: b */
    static void m169816b() {
        Deque deque = f285839e;
        if (!deque.isEmpty()) {
            deque.pollFirst();
        }
        if (!deque.isEmpty()) {
            ((Animator) deque.getFirst()).start();
        } else {
            f285840f.clear();
        }
    }

    /* renamed from: c */
    public static void m169817c(ProgressBar progressBar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(progressBar, View.ALPHA, new float[]{0.5f, 1.0f}).setDuration(233);
        duration.addListener(new C102415e());
        m169815a(duration);
    }

    /* renamed from: d */
    public static void m169818d(ImageView imageView, ImageView imageView2) {
        ImageView imageView3 = imageView;
        ImageView imageView4 = imageView2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(imageView3, View.SCALE_X, new float[]{1.0f, 1.66f}), ObjectAnimator.ofFloat(imageView3, View.SCALE_Y, new float[]{1.0f, 1.66f})});
        animatorSet.setDuration(233);
        Interpolator interpolator = f285835a;
        animatorSet.setInterpolator(interpolator);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(imageView3, View.SCALE_X, new float[]{1.66f, 1.0f}), ObjectAnimator.ofFloat(imageView3, View.SCALE_Y, new float[]{1.66f, 1.0f})});
        animatorSet2.setDuration(483);
        animatorSet2.setInterpolator(interpolator);
        animatorSet2.setStartDelay(233);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(imageView4, View.SCALE_X, new float[]{2.66f, 1.25f}), ObjectAnimator.ofFloat(imageView4, View.SCALE_Y, new float[]{2.66f, 1.25f})});
        animatorSet3.setDuration(716);
        animatorSet3.setInterpolator(f285836b);
        animatorSet3.setStartDelay(283);
        ObjectAnimator duration = ObjectAnimator.ofFloat(imageView3, View.ALPHA, new float[]{0.15f, 1.0f}).setDuration(233);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView4, View.ALPHA, new float[]{0.1f, 1.0f});
        ofFloat.setDuration(233);
        ofFloat.setInterpolator(f285837c);
        ofFloat.setStartDelay(283);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView4, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(483);
        ofFloat2.setInterpolator(f285838d);
        ofFloat2.setStartDelay(516);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(new Animator[]{animatorSet, animatorSet2, animatorSet3, duration, ofFloat, ofFloat2});
        animatorSet4.addListener(new C102414d(imageView4, imageView3));
        m169815a(animatorSet4);
    }

    /* renamed from: e */
    public static void m169819e(Context context, ImmersiveActionsHeader immersiveActionsHeader, ImmersiveActionsListenableScrollView immersiveActionsListenableScrollView, int i) {
        int dimension = (int) context.getResources().getDimension(R.dimen.gsa_immersive_actions_header_height);
        float dimension2 = context.getResources().getDimension(R.dimen.immersive_actions_collapsing_header_height);
        int i2 = immersiveActionsHeader.getLayoutParams().height;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{immersiveActionsListenableScrollView.getScrollY(), i});
        ofInt.addUpdateListener(new C102412b(immersiveActionsListenableScrollView));
        ofInt.setDuration((long) ((int) (Math.abs(((float) ((dimension - i2) - i)) / ((float) (dimension - ((int) dimension2)))) * 400.0f)));
        ofInt.setInterpolator(C102396ac.f285788a);
        ofInt.addListener(new C102413c());
        f285840f.add(ofInt);
        m169815a(ofInt);
    }

    /* renamed from: f */
    public static void m169820f() {
        Deque deque = f285839e;
        if (!deque.isEmpty()) {
            ((Animator) deque.removeFirst()).cancel();
            deque.clear();
        }
    }

    /* renamed from: g */
    public static boolean m169821g() {
        return !f285839e.isEmpty();
    }
}
