package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;

/* renamed from: com.google.android.material.textfield.h */
/* compiled from: PG */
final class C44945h extends C44963z {

    /* renamed from: a */
    public EditText f117403a;

    /* renamed from: b */
    private final int f117404b;

    /* renamed from: c */
    private final int f117405c;

    /* renamed from: d */
    private final TimeInterpolator f117406d;

    /* renamed from: i */
    private final TimeInterpolator f117407i;

    /* renamed from: j */
    private final View.OnClickListener f117408j = new C44941d(this);

    /* renamed from: k */
    private final View.OnFocusChangeListener f117409k = new C44942e(this);

    /* renamed from: l */
    private AnimatorSet f117410l;

    /* renamed from: m */
    private ValueAnimator f117411m;

    public C44945h(C44962y yVar) {
        super(yVar);
        this.f117404b = C44693c.m79225a(yVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f117405c = C44693c.m79225a(yVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f117406d = C44688a.m79217a(yVar.getContext(), R.attr.motionEasingLinearInterpolator, C44497b.f115650a);
        this.f117407i = C44688a.m79217a(yVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, C44497b.f115653d);
    }

    /* renamed from: m */
    private final ValueAnimator m79844m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f117406d);
        ofFloat.setDuration((long) this.f117404b);
        ofFloat.addUpdateListener(new C44940c(this));
        return ofFloat;
    }

    /* renamed from: a */
    public final int mo48530a() {
        return R.string.clear_text_end_icon_content_description;
    }

    /* renamed from: b */
    public final int mo48531b() {
        return R.drawable.mtrl_ic_cancel;
    }

    /* renamed from: c */
    public final View.OnClickListener mo48532c() {
        return this.f117408j;
    }

    /* renamed from: d */
    public final View.OnFocusChangeListener mo48563d() {
        return this.f117409k;
    }

    /* renamed from: e */
    public final View.OnFocusChangeListener mo48564e() {
        return this.f117409k;
    }

    /* renamed from: f */
    public final void mo48565f(boolean z) {
        boolean r = this.f117463f.mo48608r();
        if (!z) {
            this.f117410l.cancel();
            this.f117411m.start();
            if (!r) {
                this.f117411m.end();
            }
        } else if (!this.f117410l.isRunning()) {
            this.f117411m.cancel();
            this.f117410l.start();
            if (r) {
                this.f117410l.end();
            }
        }
    }

    /* renamed from: g */
    public final void mo48533g(EditText editText) {
        this.f117403a = editText;
        TextInputLayout textInputLayout = this.f117462e;
        textInputLayout.f117308b.mo48601k(mo48567k());
    }

    /* renamed from: h */
    public final void mo48566h(boolean z) {
        if (this.f117463f.f117449h != null) {
            mo48565f(z);
        }
    }

    /* renamed from: i */
    public final void mo48534i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f117407i);
        ofFloat.setDuration((long) this.f117405c);
        ofFloat.addUpdateListener(new C44939b(this));
        ValueAnimator m = m79844m(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f117410l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, m});
        this.f117410l.addListener(new C44943f(this));
        ValueAnimator m2 = m79844m(1.0f, 0.0f);
        this.f117411m = m2;
        m2.addListener(new C44944g(this));
    }

    /* renamed from: j */
    public final void mo48535j() {
        EditText editText = this.f117403a;
        if (editText != null) {
            editText.post(new C44919a(this));
        }
    }

    /* renamed from: k */
    public final boolean mo48567k() {
        EditText editText = this.f117403a;
        if (editText != null) {
            return (editText.hasFocus() || this.f117465h.hasFocus()) && this.f117403a.getText().length() > 0;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo48568l() {
        if (this.f117463f.f117449h == null) {
            mo48565f(mo48567k());
        }
    }
}
