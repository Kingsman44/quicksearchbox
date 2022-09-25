package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3504a.C44498c;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3512i.C44694d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.textfield.ad */
/* compiled from: PG */
public final class C44923ad {

    /* renamed from: a */
    public final TextInputLayout f117340a;

    /* renamed from: b */
    public Animator f117341b;

    /* renamed from: c */
    public int f117342c;

    /* renamed from: d */
    public int f117343d;

    /* renamed from: e */
    public CharSequence f117344e;

    /* renamed from: f */
    public boolean f117345f;

    /* renamed from: g */
    public TextView f117346g;

    /* renamed from: h */
    public CharSequence f117347h;

    /* renamed from: i */
    public boolean f117348i;

    /* renamed from: j */
    public TextView f117349j;

    /* renamed from: k */
    private final int f117350k;

    /* renamed from: l */
    private final int f117351l;

    /* renamed from: m */
    private final int f117352m;

    /* renamed from: n */
    private final TimeInterpolator f117353n;

    /* renamed from: o */
    private final TimeInterpolator f117354o;

    /* renamed from: p */
    private final TimeInterpolator f117355p;

    /* renamed from: q */
    private final Context f117356q;

    /* renamed from: r */
    private LinearLayout f117357r;

    /* renamed from: s */
    private int f117358s;

    /* renamed from: t */
    private FrameLayout f117359t;

    /* renamed from: u */
    private final float f117360u;

    /* renamed from: v */
    private CharSequence f117361v;

    /* renamed from: w */
    private int f117362w;

    /* renamed from: x */
    private ColorStateList f117363x;

    /* renamed from: y */
    private int f117364y;

    /* renamed from: z */
    private ColorStateList f117365z;

    public C44923ad(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f117356q = context;
        this.f117340a = textInputLayout;
        this.f117360u = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f117350k = C44693c.m79225a(context, R.attr.motionDurationShort4, 217);
        this.f117351l = C44693c.m79225a(context, R.attr.motionDurationMedium4, 167);
        this.f117352m = C44693c.m79225a(context, R.attr.motionDurationShort4, 167);
        this.f117353n = C44688a.m79217a(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, C44497b.f115653d);
        this.f117354o = C44688a.m79217a(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, C44497b.f115650a);
        this.f117355p = C44688a.m79217a(context, R.attr.motionEasingLinearInterpolator, C44497b.f115650a);
    }

    /* renamed from: q */
    static final boolean m79803q(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: r */
    private final int m79804r(boolean z, int i, int i2) {
        return z ? this.f117356q.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: s */
    private final TextView m79805s(int i) {
        if (i == 1) {
            return this.f117346g;
        }
        if (i != 2) {
            return null;
        }
        return this.f117349j;
    }

    /* renamed from: t */
    private final void m79806t(List list, boolean z, TextView textView, int i, int i2, int i3) {
        int i4;
        TimeInterpolator timeInterpolator;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                boolean z2 = i3 == i;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i3 == i ? 1.0f : 0.0f});
                if (z2) {
                    i4 = this.f117351l;
                } else {
                    i4 = this.f117352m;
                }
                ofFloat.setDuration((long) i4);
                if (z2) {
                    timeInterpolator = this.f117354o;
                } else {
                    timeInterpolator = this.f117355p;
                }
                ofFloat.setInterpolator(timeInterpolator);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f117360u, 0.0f});
                    ofFloat2.setDuration((long) this.f117350k);
                    ofFloat2.setInterpolator(this.f117353n);
                    list.add(ofFloat2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo48503a() {
        TextView textView = this.f117346g;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo48504b(TextView textView, int i) {
        if (this.f117357r == null && this.f117359t == null) {
            LinearLayout linearLayout = new LinearLayout(this.f117356q);
            this.f117357r = linearLayout;
            linearLayout.setOrientation(0);
            this.f117340a.addView(this.f117357r, -1, -2);
            this.f117359t = new FrameLayout(this.f117356q);
            this.f117357r.addView(this.f117359t, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f117340a.f117309c != null) {
                mo48505c();
            }
        }
        if (m79803q(i)) {
            this.f117359t.setVisibility(0);
            this.f117359t.addView(textView);
        } else {
            this.f117357r.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f117357r.setVisibility(0);
        this.f117358s++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo48505c() {
        EditText editText;
        if (this.f117357r != null && (editText = this.f117340a.f117309c) != null) {
            boolean e = C44694d.m79233e(this.f117356q);
            C2043bi.m5556aj(this.f117357r, m79804r(e, R.dimen.material_helper_text_font_1_3_padding_horizontal, C2043bi.m5583l(editText)), m79804r(e, R.dimen.material_helper_text_font_1_3_padding_top, this.f117356q.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), m79804r(e, R.dimen.material_helper_text_font_1_3_padding_horizontal, C2043bi.m5582k(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo48506d() {
        Animator animator = this.f117341b;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo48507e() {
        this.f117344e = null;
        mo48506d();
        if (this.f117342c == 1) {
            if (!this.f117348i || TextUtils.isEmpty(this.f117347h)) {
                this.f117343d = 0;
            } else {
                this.f117343d = 2;
            }
        }
        mo48516n(this.f117342c, this.f117343d, mo48518p(this.f117346g, BuildConfig.FLAVOR));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo48509g(CharSequence charSequence) {
        this.f117361v = charSequence;
        TextView textView = this.f117346g;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: h */
    public final void mo48510h(boolean z) {
        if (this.f117345f != z) {
            mo48506d();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f117356q);
                this.f117346g = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                this.f117346g.setTextAlignment(5);
                mo48511i(this.f117362w);
                mo48512j(this.f117363x);
                mo48509g(this.f117361v);
                this.f117346g.setVisibility(4);
                C2043bi.m5527U(this.f117346g, 1);
                mo48504b(this.f117346g, 0);
            } else {
                mo48507e();
                mo48508f(this.f117346g, 0);
                this.f117346g = null;
                this.f117340a.mo48491s();
                this.f117340a.mo48496w();
            }
            this.f117345f = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo48511i(int i) {
        this.f117362w = i;
        TextView textView = this.f117346g;
        if (textView != null) {
            this.f117340a.mo48489q(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo48512j(ColorStateList colorStateList) {
        this.f117363x = colorStateList;
        TextView textView = this.f117346g;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo48513k(int i) {
        this.f117364y = i;
        TextView textView = this.f117349j;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    /* renamed from: l */
    public final void mo48514l(boolean z) {
        if (this.f117348i != z) {
            mo48506d();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f117356q);
                this.f117349j = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                this.f117349j.setTextAlignment(5);
                this.f117349j.setVisibility(4);
                C2043bi.m5527U(this.f117349j, 1);
                mo48513k(this.f117364y);
                mo48515m(this.f117365z);
                mo48504b(this.f117349j, 1);
                this.f117349j.setAccessibilityDelegate(new C44922ac(this));
            } else {
                mo48506d();
                int i = this.f117342c;
                if (i == 2) {
                    this.f117343d = 0;
                }
                mo48516n(i, this.f117343d, mo48518p(this.f117349j, BuildConfig.FLAVOR));
                mo48508f(this.f117349j, 1);
                this.f117349j = null;
                this.f117340a.mo48491s();
                this.f117340a.mo48496w();
            }
            this.f117348i = z;
        }
    }

    /* renamed from: m */
    public final void mo48515m(ColorStateList colorStateList) {
        this.f117365z = colorStateList;
        TextView textView = this.f117349j;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: n */
    public final void mo48516n(int i, int i2, boolean z) {
        TextView s;
        TextView s2;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (i3 != i4) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f117341b = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i5 = i;
                int i6 = i2;
                m79806t(arrayList2, this.f117348i, this.f117349j, 2, i5, i6);
                m79806t(arrayList2, this.f117345f, this.f117346g, 1, i5, i6);
                C44498c.m78600a(animatorSet, arrayList);
                animatorSet.addListener(new C44921ab(this, i2, m79805s(i), i, m79805s(i4)));
                animatorSet.start();
            } else if (i3 != i4) {
                if (!(i4 == 0 || (s2 = m79805s(i4)) == null)) {
                    s2.setVisibility(0);
                    s2.setAlpha(1.0f);
                }
                if (!(i3 == 0 || (s = m79805s(i)) == null)) {
                    s.setVisibility(4);
                    if (i3 == 1) {
                        s.setText((CharSequence) null);
                    }
                }
                this.f117342c = i4;
            }
            this.f117340a.mo48491s();
            this.f117340a.mo48494u(z2, false);
            this.f117340a.mo48496w();
        }
    }

    /* renamed from: o */
    public final boolean mo48517o(int i) {
        return i == 1 && this.f117346g != null && !TextUtils.isEmpty(this.f117344e);
    }

    /* renamed from: p */
    public final boolean mo48518p(TextView textView, CharSequence charSequence) {
        if (!C2043bi.m5570ax(this.f117340a) || !this.f117340a.isEnabled()) {
            return false;
        }
        if (this.f117343d != this.f117342c || textView == null || !TextUtils.equals(textView.getText(), charSequence)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo48508f(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f117357r;
        if (linearLayout != null) {
            if (!m79803q(i) || (frameLayout = this.f117359t) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f117358s - 1;
            this.f117358s = i2;
            LinearLayout linearLayout2 = this.f117357r;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }
}
