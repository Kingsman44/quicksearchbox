package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1986f;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;

/* renamed from: com.google.android.material.textfield.s */
/* compiled from: PG */
final class C44956s extends C44963z {

    /* renamed from: a */
    public AutoCompleteTextView f117421a;

    /* renamed from: b */
    public boolean f117422b;

    /* renamed from: c */
    public boolean f117423c;

    /* renamed from: d */
    public ValueAnimator f117424d;

    /* renamed from: i */
    private final int f117425i;

    /* renamed from: j */
    private final int f117426j;

    /* renamed from: k */
    private final TimeInterpolator f117427k;

    /* renamed from: l */
    private final View.OnClickListener f117428l = new C44948k(this);

    /* renamed from: m */
    private final View.OnFocusChangeListener f117429m = new C44949l(this);

    /* renamed from: n */
    private final C1986f f117430n = new C44950m(this);

    /* renamed from: o */
    private boolean f117431o;

    /* renamed from: p */
    private long f117432p = Long.MAX_VALUE;

    /* renamed from: q */
    private AccessibilityManager f117433q;

    /* renamed from: r */
    private ValueAnimator f117434r;

    public C44956s(C44962y yVar) {
        super(yVar);
        this.f117426j = C44693c.m79225a(yVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f117425i = C44693c.m79225a(yVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f117427k = C44688a.m79217a(yVar.getContext(), R.attr.motionEasingLinearInterpolator, C44497b.f115650a);
    }

    /* renamed from: z */
    private final ValueAnimator m79861z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f117427k);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C44951n(this));
        return ofFloat;
    }

    /* renamed from: A */
    public final C1986f mo48577A() {
        return this.f117430n;
    }

    /* renamed from: a */
    public final int mo48530a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    /* renamed from: b */
    public final int mo48531b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    /* renamed from: c */
    public final View.OnClickListener mo48532c() {
        return this.f117428l;
    }

    /* renamed from: d */
    public final View.OnFocusChangeListener mo48563d() {
        return this.f117429m;
    }

    /* renamed from: g */
    public final void mo48533g(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f117421a = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new C44953p(this));
            this.f117421a.setOnDismissListener(new C44954q(this));
            this.f117421a.setThreshold(0);
            this.f117462e.f117308b.mo48602l((Drawable) null);
            if (!C44957t.m79883a(editText) && this.f117433q.isTouchExplorationEnabled()) {
                C2043bi.m5551ae(this.f117465h, 2);
            }
            this.f117462e.f117308b.mo48601k(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: i */
    public final void mo48534i() {
        this.f117424d = m79861z(this.f117426j, 0.0f, 1.0f);
        ValueAnimator z = m79861z(this.f117425i, 1.0f, 0.0f);
        this.f117434r = z;
        z.addListener(new C44955r(this));
        this.f117433q = (AccessibilityManager) this.f117464g.getSystemService("accessibility");
    }

    /* renamed from: j */
    public final void mo48535j() {
        AutoCompleteTextView autoCompleteTextView = this.f117421a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f117421a.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    /* renamed from: k */
    public final void mo48578k(boolean z) {
        if (this.f117431o != z) {
            this.f117431o = z;
            this.f117424d.cancel();
            this.f117434r.start();
        }
    }

    /* renamed from: l */
    public final void mo48568l() {
        if (this.f117433q.isTouchExplorationEnabled() && C44957t.m79883a(this.f117421a) && !this.f117465h.hasFocus()) {
            this.f117421a.dismissDropDown();
        }
        this.f117421a.post(new C44952o(this));
    }

    /* renamed from: m */
    public final void mo48579m() {
        if (this.f117421a != null) {
            if (mo48582p()) {
                this.f117423c = false;
            }
            if (!this.f117423c) {
                mo48578k(!this.f117431o);
                if (this.f117431o) {
                    this.f117421a.requestFocus();
                    this.f117421a.showDropDown();
                    return;
                }
                this.f117421a.dismissDropDown();
                return;
            }
            this.f117423c = false;
        }
    }

    /* renamed from: n */
    public final void mo48580n() {
        this.f117423c = true;
        this.f117432p = System.currentTimeMillis();
    }

    /* renamed from: o */
    public final boolean mo48581o(int i) {
        return i != 0;
    }

    /* renamed from: p */
    public final boolean mo48582p() {
        long currentTimeMillis = System.currentTimeMillis() - this.f117432p;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: q */
    public final boolean mo48583q() {
        return true;
    }

    /* renamed from: r */
    public final boolean mo48584r() {
        return this.f117422b;
    }

    /* renamed from: s */
    public final boolean mo48537s() {
        return true;
    }

    /* renamed from: t */
    public final boolean mo48538t() {
        return this.f117431o;
    }

    /* renamed from: u */
    public final boolean mo48585u() {
        return true;
    }

    /* renamed from: v */
    public final void mo48586v(C1991k kVar) {
        if (!C44957t.m79883a(this.f117421a)) {
            kVar.f5921a.setClassName(Spinner.class.getName());
        }
        if (kVar.f5921a.isShowingHintText()) {
            kVar.f5921a.setHintText((CharSequence) null);
        }
    }

    /* renamed from: w */
    public final void mo48587w(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f117433q.isEnabled() && !C44957t.m79883a(this.f117421a)) {
            mo48579m();
            mo48580n();
        }
    }
}
