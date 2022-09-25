package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136039a;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.r */
/* compiled from: PG */
public final class C136100r implements C136039a {

    /* renamed from: a */
    public final View f370654a;

    /* renamed from: b */
    public final View f370655b;

    /* renamed from: c */
    public AnimatorSet f370656c;

    /* renamed from: d */
    public int f370657d = 1;

    /* renamed from: e */
    private final int f370658e;

    /* renamed from: f */
    private final View f370659f;

    public C136100r(View view, View view2, View view3) {
        this.f370654a = view;
        this.f370655b = view2;
        this.f370659f = view3;
        view2.setAlpha(0.0f);
        view3.setBackgroundResource(R.drawable.googleapp_browser_bottombar_scrim);
        view3.getBackground().setAlpha(0);
        this.f370658e = view.getResources().getInteger(17694722);
    }

    /* renamed from: c */
    private final void m221110c(int i) {
        if (this.f370657d != i) {
            int i2 = 0;
            boolean z = i == 2;
            float f = i == 2 ? 1.0f : 0.0f;
            AnimatorSet animatorSet = this.f370656c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f370656c = animatorSet2;
            Animator[] animatorArr = new Animator[3];
            animatorArr[0] = ObjectAnimator.ofFloat(this.f370654a, View.ALPHA, new float[]{this.f370654a.getAlpha(), f});
            animatorArr[1] = ObjectAnimator.ofFloat(this.f370655b, View.ALPHA, new float[]{this.f370655b.getAlpha(), 1.0f - f});
            View view = this.f370659f;
            C136098p pVar = new C136098p(Integer.class);
            int[] iArr = new int[2];
            iArr[0] = this.f370659f.getBackground().getAlpha();
            if (f != 1.0f) {
                i2 = PrivateKeyType.INVALID;
            }
            iArr[1] = i2;
            animatorArr[2] = ObjectAnimator.ofInt(view, pVar, iArr);
            animatorSet2.playTogether(animatorArr);
            this.f370656c.setDuration((long) this.f370658e);
            this.f370656c.addListener(new C136099q(this, z));
            this.f370656c.start();
            this.f370657d = i;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo112532a(View view, float f) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo112533b(View view, int i) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo112536e(View view) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo112537f(View view) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo112538g(View view) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo112539h(View view) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo112540i(View view) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo112541j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo112542k(View view) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo112543l(View view) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo112544m(View view) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo112545n(View view) {
    }

    /* renamed from: o */
    public final void mo112546o(View view) {
        m221110c(2);
    }

    /* renamed from: p */
    public final /* synthetic */ void mo112547p(float f) {
    }

    /* renamed from: q */
    public final void mo112548q(float f) {
        m221110c(3);
    }

    /* renamed from: r */
    public final /* synthetic */ void mo112549r(float f) {
    }

    /* renamed from: s */
    public final void mo112550s(float f) {
        m221110c(2);
    }

    /* renamed from: t */
    public final /* synthetic */ void mo112551t() {
    }

    /* renamed from: u */
    public final void mo112552u() {
        m221110c(2);
    }
}
