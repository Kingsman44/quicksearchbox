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

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.em */
/* compiled from: PG */
public abstract class C93643em extends C93666w {

    /* renamed from: a */
    private static final int[] f261401a = {R.attr.state_showingVoiceOfGoogle};

    /* renamed from: b */
    private static final int[] f261402b = {R.attr.state_error};

    /* renamed from: c */
    private static final int[] f261403c = {R.attr.state_promptedArgument};

    /* renamed from: d */
    private static final int[] f261404d = {R.attr.state_voicePromptedArgument};

    /* renamed from: e */
    public View f261405e;

    /* renamed from: f */
    public boolean f261406f;

    /* renamed from: g */
    private TextView f261407g;

    /* renamed from: h */
    private TextView f261408h;

    /* renamed from: i */
    private View f261409i;

    /* renamed from: v */
    private boolean f261410v;

    public C93643em(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private final boolean mo88095a() {
        return (this.f261407g == null || this.f261408h == null) ? false : true;
    }

    /* renamed from: j */
    protected static void m154507j(int i, View... viewArr) {
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f261408h != null && !this.f261449o) {
            int i = true != mo88130s() ? 0 : 2;
            TextView textView = this.f261408h;
            textView.setTypeface(textView.getTypeface(), i);
        }
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
        View[] i = mo88103i();
        View[] viewArr = (View[]) Arrays.copyOf(i, i.length + 1);
        viewArr[r1 - 1] = this.f261408h;
        for (View enabled : viewArr) {
            enabled.setEnabled(z);
        }
    }

    /* renamed from: f */
    public void mo87732f() {
        Spanned spanned;
        if (C93632eb.m154491f(getContext()) && mo88095a()) {
            Fade fade = new Fade();
            fade.addTarget(this.f261407g);
            fade.setDuration(500);
            TransitionManager.beginDelayedTransition(this, fade);
        }
        int i = 8;
        int i2 = 0;
        if (mo88095a()) {
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
            if (!isEmpty) {
                this.f261407g.setVisibility(0);
                this.f261407g.setText(spanned);
            } else {
                this.f261407g.setVisibility(8);
            }
            if (ig || mo88101g()) {
                this.f261408h.setVisibility(8);
                m154507j(0, mo88103i());
            } else {
                this.f261408h.setVisibility(0);
                this.f261408h.setText(mo88098m());
                m154507j(8, mo88103i());
            }
        }
        View view = this.f261409i;
        if (view != null) {
            if (true == mo88110k()) {
                i = 0;
            }
            view.setVisibility(i);
        }
        this.f261410v = this.f261405e != null && isShown() && this.f261449o && this.f261450p && (this.f261452r || mo88131u()) && !this.f261453s;
        View view2 = this.f261405e;
        if (view2 != null && !this.f261406f) {
            if (true != mo88112v()) {
                i2 = 4;
            }
            view2.setVisibility(i2);
        }
        refreshDrawableState();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo88101g() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract View[] mo88103i();

    /* renamed from: k */
    public boolean mo88110k() {
        return !this.f261449o || !this.f261450p || mo88131u() || (!this.f261455u && !this.f261453s);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        boolean s = mo88130s();
        boolean u = mo88131u();
        boolean z = this.f261452r;
        boolean z2 = this.f261410v;
        if (s || u || z) {
            i++;
        }
        if (z2) {
            i++;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        if (s) {
            mergeDrawableStates(onCreateDrawableState, f261401a);
        } else if (u) {
            mergeDrawableStates(onCreateDrawableState, f261402b);
        } else if (z) {
            mergeDrawableStates(onCreateDrawableState, f261403c);
        }
        if (z2) {
            mergeDrawableStates(onCreateDrawableState, f261404d);
        }
        return onCreateDrawableState;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f261407g = (TextView) findViewById(R.id.argument_label);
        this.f261408h = (TextView) findViewById(R.id.argument_prompt);
        this.f261409i = findViewById(R.id.arrow);
        View findViewById = findViewById(R.id.action_editor_message_separator);
        this.f261405e = findViewById;
        if (findViewById != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, SCALE_X, new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(C91107f.m148859b(0.25f, 0.0f, 0.05f, 1.0f));
            ofFloat.setDuration(667);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f261405e, ALPHA, new float[]{0.0f, 1.0f});
            ofFloat2.setInterpolator(C91107f.m148859b(0.0f, 0.0f, 0.6f, 1.0f));
            ofFloat2.setDuration(333);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f261405e, ALPHA, new float[]{1.0f, 0.0f});
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setDuration(500);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat3});
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat, animatorSet});
            animatorSet2.addListener(new C93642el(this));
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f261404d, animatorSet2);
            this.f261405e.setStateListAnimator(stateListAnimator);
        }
    }

    /* renamed from: v */
    public final boolean mo88112v() {
        return !this.f261449o;
    }
}
