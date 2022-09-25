package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55136he;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bq */
/* compiled from: PG */
public abstract class C93566bq extends C93666w {

    /* renamed from: a */
    private static final int[] f261246a = {R.attr.state_showingVoiceOfGoogle};

    /* renamed from: b */
    private static final int[] f261247b = {R.attr.state_error};

    /* renamed from: c */
    private static final int[] f261248c = {R.attr.state_promptedArgument};

    /* renamed from: d */
    private static final int[] f261249d = {R.attr.state_voicePromptedArgument};

    /* renamed from: e */
    private TextView f261250e;

    /* renamed from: f */
    private TextView f261251f;

    /* renamed from: g */
    public View f261252g;

    /* renamed from: h */
    public boolean f261253h;

    /* renamed from: i */
    public boolean f261254i;

    /* renamed from: v */
    public boolean f261255v;

    /* renamed from: w */
    private View f261256w;

    /* renamed from: x */
    private boolean f261257x;

    public C93566bq(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    protected static void m154318B(int i, View... viewArr) {
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }

    /* renamed from: a */
    private final boolean mo87734a() {
        return (this.f261250e == null || this.f261251f == null) ? false : true;
    }

    /* renamed from: A */
    public final void mo87982A(boolean z) {
        View view = this.f261252g;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, SCALE_X, new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(C91107f.m148859b(0.25f, 0.0f, 0.05f, 1.0f));
            ofFloat.setDuration(667);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f261252g, ALPHA, new float[]{0.0f, 1.0f});
            ofFloat2.setInterpolator(C91107f.m148859b(0.0f, 0.0f, 0.6f, 1.0f));
            ofFloat2.setDuration(333);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f261252g, ALPHA, new float[]{1.0f, 0.0f});
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setDuration(500);
            AnimatorSet animatorSet = new AnimatorSet();
            if (z) {
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat3});
            } else {
                animatorSet.play(ofFloat2);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat, animatorSet});
            animatorSet2.addListener(new C93565bp(this));
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f261249d, animatorSet2);
            this.f261252g.setStateListAnimator(stateListAnimator);
        }
    }

    /* renamed from: C */
    public final boolean mo87983C() {
        return !this.f261449o || !this.f261450p || mo88131u() || (!this.f261455u && !this.f261453s);
    }

    /* renamed from: D */
    public final View[] mo87984D() {
        View[] j = mo87741j();
        View[] viewArr = (View[]) Arrays.copyOf(j, j.length + 1);
        viewArr[viewArr.length - 1] = this.f261251f;
        return viewArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo87736c() {
        View view = this.f261256w;
        int i = 0;
        if (view != null) {
            view.setVisibility(true != mo87737g() ? 8 : 0);
        }
        this.f261257x = this.f261252g != null && isShown() && this.f261449o && this.f261450p && (this.f261452r || mo88131u()) && !this.f261453s;
        View view2 = this.f261252g;
        if (view2 != null && !this.f261255v) {
            if (true != mo87738h()) {
                i = 4;
            }
            view2.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f261251f != null && !this.f261449o) {
            int i = true != mo88130s() ? 0 : 2;
            TextView textView = this.f261251f;
            textView.setTypeface(textView.getTypeface(), i);
        }
    }

    /* renamed from: e */
    public void mo87731e(boolean z) {
        for (View enabled : mo87984D()) {
            enabled.setEnabled(z);
        }
    }

    /* renamed from: f */
    public void mo87732f() {
        Spanned spanned;
        if (C93632eb.m154491f(getContext()) && mo87734a()) {
            Fade fade = new Fade();
            fade.addTarget(this.f261250e);
            fade.setDuration(500);
            TransitionManager.beginDelayedTransition(this, fade);
        }
        if (mo87734a()) {
            Argument argument = this.f261447m;
            C55136he heVar = argument.f236145f;
            if (heVar != null) {
                C93595cs csVar = this.f261444j;
                spanned = null;
                if (csVar != null) {
                    String a = csVar.mo88004a(heVar);
                    if (!TextUtils.isEmpty(a)) {
                        spanned = Html.fromHtml(a);
                    }
                }
            } else {
                spanned = argument.f236143d;
            }
            boolean isEmpty = TextUtils.isEmpty(spanned);
            boolean ig = mo87740ig();
            boolean z = this.f261449o;
            if (ig || mo87917y()) {
                if (this.f261254i || isEmpty || mo87739i(argument)) {
                    this.f261250e.setVisibility(8);
                } else {
                    this.f261250e.setVisibility(0);
                    this.f261250e.setText(spanned);
                }
                this.f261251f.setVisibility(8);
                m154318B(0, mo87741j());
            } else if (mo88130s() && !z) {
                if (isEmpty || this.f261254i) {
                    this.f261250e.setVisibility(8);
                } else {
                    this.f261250e.setVisibility(4);
                }
                this.f261251f.setVisibility(0);
                this.f261251f.setText(mo88098m());
                m154318B(8, mo87741j());
            } else if (!mo88130s() || z) {
                if (isEmpty || this.f261254i) {
                    this.f261250e.setVisibility(8);
                } else {
                    this.f261250e.setVisibility(4);
                }
                this.f261251f.setVisibility(0);
                this.f261251f.setText(spanned);
                m154318B(8, mo87741j());
            }
        }
        mo87736c();
        refreshDrawableState();
    }

    /* renamed from: g */
    public boolean mo87737g() {
        return mo87983C();
    }

    /* renamed from: h */
    public boolean mo87738h() {
        return this.f261253h || !this.f261449o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo87739i(Argument argument) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract View[] mo87741j();

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        boolean s = mo88130s();
        boolean u = mo88131u();
        boolean z = this.f261452r;
        boolean z2 = this.f261257x;
        if (s || u || z) {
            i++;
        }
        if (z2) {
            i++;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        if (s) {
            mergeDrawableStates(onCreateDrawableState, f261246a);
        } else if (u) {
            mergeDrawableStates(onCreateDrawableState, f261247b);
        } else if (z) {
            mergeDrawableStates(onCreateDrawableState, f261248c);
        }
        if (z2) {
            mergeDrawableStates(onCreateDrawableState, f261249d);
        }
        return onCreateDrawableState;
    }

    public void onFinishInflate() {
        this.f261250e = (TextView) findViewById(R.id.argument_label);
        this.f261251f = (TextView) findViewById(R.id.argument_prompt);
        this.f261256w = findViewById(R.id.arrow);
        this.f261252g = findViewById(R.id.action_editor_message_separator);
        mo87982A(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo87917y() {
        return false;
    }

    public C93566bq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C93566bq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
