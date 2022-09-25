package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatTextView;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.C0735ip;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import androidx.core.p098j.p099a.C1985e;
import androidx.core.p098j.p099a.C1986f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p3512i.C44694d;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.textfield.y */
/* compiled from: PG */
public final class C44962y extends LinearLayout {

    /* renamed from: a */
    final TextInputLayout f117442a;

    /* renamed from: b */
    public final CheckableImageButton f117443b;

    /* renamed from: c */
    public ColorStateList f117444c;

    /* renamed from: d */
    public final CheckableImageButton f117445d;

    /* renamed from: e */
    public int f117446e = 0;

    /* renamed from: f */
    public ColorStateList f117447f;

    /* renamed from: g */
    public PorterDuff.Mode f117448g;

    /* renamed from: h */
    public CharSequence f117449h;

    /* renamed from: i */
    public final TextView f117450i;

    /* renamed from: j */
    public boolean f117451j;

    /* renamed from: k */
    public EditText f117452k;

    /* renamed from: l */
    public final TextWatcher f117453l = new C44958u(this);

    /* renamed from: m */
    private final FrameLayout f117454m;

    /* renamed from: n */
    private PorterDuff.Mode f117455n;

    /* renamed from: o */
    private final C44961x f117456o;

    /* renamed from: p */
    private final LinkedHashSet f117457p = new LinkedHashSet();

    /* renamed from: q */
    private int f117458q;

    /* renamed from: r */
    private final AccessibilityManager f117459r;

    /* renamed from: s */
    private C1986f f117460s;

    /* renamed from: t */
    private final C44959v f117461t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44962y(TextInputLayout textInputLayout, C0735ip ipVar) {
        super(textInputLayout.getContext());
        TextInputLayout textInputLayout2 = textInputLayout;
        C0735ip ipVar2 = ipVar;
        C44959v vVar = new C44959v(this);
        this.f117461t = vVar;
        this.f117459r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f117442a = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f117454m = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton t = m79885t(this, from, R.id.text_input_error_icon);
        this.f117443b = t;
        CheckableImageButton t2 = m79885t(frameLayout, from, R.id.text_input_end_icon);
        this.f117445d = t2;
        this.f117456o = new C44961x(this, ipVar2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f117450i = appCompatTextView;
        int[] iArr = C44930ak.f117381a;
        if (ipVar2.f2596b.hasValue(35)) {
            this.f117444c = C44694d.m79231c(getContext(), ipVar2, 35);
        }
        CharSequence charSequence = null;
        if (ipVar2.f2596b.hasValue(36)) {
            this.f117455n = C44741bm.m79310c(ipVar2.f2596b.getInt(36, -1), (PorterDuff.Mode) null);
        }
        if (ipVar2.f2596b.hasValue(34)) {
            mo48602l(ipVar2.mo3246b(34));
        }
        t.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        C2043bi.m5551ae(t, 2);
        t.setClickable(false);
        t.f116512c = false;
        t.setFocusable(false);
        if (!ipVar2.f2596b.hasValue(50)) {
            if (ipVar2.f2596b.hasValue(30)) {
                this.f117447f = C44694d.m79231c(getContext(), ipVar2, 30);
            }
            if (ipVar2.f2596b.hasValue(31)) {
                this.f117448g = C44741bm.m79310c(ipVar2.f2596b.getInt(31, -1), (PorterDuff.Mode) null);
            }
        }
        if (ipVar2.f2596b.hasValue(28)) {
            mo48599i(ipVar2.f2596b.getInt(28, 0));
            if (ipVar2.f2596b.hasValue(25)) {
                mo48597g(ipVar2.f2596b.getText(25));
            }
            t2.mo48001a(ipVar2.f2596b.getBoolean(24, true));
        } else if (ipVar2.f2596b.hasValue(50)) {
            if (ipVar2.f2596b.hasValue(51)) {
                this.f117447f = C44694d.m79231c(getContext(), ipVar2, 51);
            }
            if (ipVar2.f2596b.hasValue(52)) {
                this.f117448g = C44741bm.m79310c(ipVar2.f2596b.getInt(52, -1), (PorterDuff.Mode) null);
            }
            mo48599i(ipVar2.f2596b.getBoolean(50, false) ? 1 : 0);
            mo48597g(ipVar2.f2596b.getText(48));
        }
        int dimensionPixelSize = ipVar2.f2596b.getDimensionPixelSize(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f117458q) {
                this.f117458q = dimensionPixelSize;
                t2.setMinimumWidth(dimensionPixelSize);
                t2.setMinimumHeight(dimensionPixelSize);
                t.setMinimumWidth(dimensionPixelSize);
                t.setMinimumHeight(dimensionPixelSize);
            }
            if (ipVar2.f2596b.hasValue(29)) {
                ImageView.ScaleType a = C44920aa.m79798a(ipVar2.f2596b.getInt(29, -1));
                t2.setScaleType(a);
                t.setScaleType(a);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            C2043bi.m5527U(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(ipVar2.f2596b.getResourceId(69, 0));
            if (ipVar2.f2596b.hasValue(70)) {
                appCompatTextView.setTextColor(ipVar2.mo3245a(70));
            }
            CharSequence text = ipVar2.f2596b.getText(68);
            this.f117449h = true != TextUtils.isEmpty(text) ? text : charSequence;
            appCompatTextView.setText(text);
            mo48606p();
            frameLayout.addView(t2);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(t);
            textInputLayout2.f117319m.add(vVar);
            if (textInputLayout2.f117309c != null) {
                vVar.mo48588a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new C44960w(this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    /* renamed from: t */
    private final CheckableImageButton m79885t(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (C44694d.m79233e(getContext())) {
            C2104s.m5794g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: u */
    private final void m79886u() {
        int i = 0;
        this.f117454m.setVisibility((this.f117445d.getVisibility() != 0 || mo48609s()) ? 8 : 0);
        char c = (this.f117449h == null || this.f117451j) ? (char) 8 : 0;
        if (!mo48608r() && !mo48609s() && c != 0) {
            i = 8;
        }
        setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C44963z mo48591a() {
        C44961x xVar = this.f117456o;
        int i = this.f117446e;
        C44963z zVar = (C44963z) xVar.f117438a.get(i);
        if (zVar == null) {
            if (i == -1) {
                zVar = new C44946i(xVar.f117439b);
            } else if (i == 0) {
                zVar = new C44927ah(xVar.f117439b);
            } else if (i == 1) {
                zVar = new C44929aj(xVar.f117439b, xVar.f117441d);
            } else if (i == 2) {
                zVar = new C44945h(xVar.f117439b);
            } else if (i == 3) {
                zVar = new C44956s(xVar.f117439b);
            } else {
                throw new IllegalArgumentException("Invalid end icon mode: " + i);
            }
            xVar.f117438a.append(i, zVar);
        }
        return zVar;
    }

    /* renamed from: b */
    public final void mo48592b() {
        if (this.f117460s != null && this.f117459r != null && C2043bi.m5569aw(this)) {
            C1985e.m5326a(this.f117459r, this.f117460s);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo48593c() {
        C44920aa.m79800c(this.f117442a, this.f117445d, this.f117447f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo48594d(boolean z) {
        boolean isActivated;
        boolean z2;
        C44963z a = mo48591a();
        boolean z3 = false;
        boolean z4 = true;
        if (a.mo48537s() && (z2 = this.f117445d.f116510a) != a.mo48538t()) {
            this.f117445d.setChecked(!z2);
            z3 = true;
        }
        if (!a.mo48583q() || (isActivated = this.f117445d.isActivated()) == a.mo48584r()) {
            z4 = z3;
        } else {
            this.f117445d.setActivated(!isActivated);
        }
        if (z || z4) {
            mo48593c();
        }
    }

    /* renamed from: e */
    public final void mo48595e() {
        AccessibilityManager accessibilityManager;
        C1986f fVar = this.f117460s;
        if (fVar != null && (accessibilityManager = this.f117459r) != null) {
            C1985e.m5327b(accessibilityManager, fVar);
        }
    }

    /* renamed from: f */
    public final void mo48596f(int i) {
        mo48597g(i != 0 ? getResources().getText(i) : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo48597g(CharSequence charSequence) {
        if (this.f117445d.getContentDescription() != charSequence) {
            this.f117445d.setContentDescription(charSequence);
        }
    }

    /* renamed from: h */
    public final void mo48598h(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0678gm.m2375e().mo3100c(getContext(), i);
        } else {
            drawable = null;
        }
        this.f117445d.setImageDrawable(drawable);
        if (drawable != null) {
            C44920aa.m79799b(this.f117442a, this.f117445d, this.f117447f, this.f117448g);
            mo48593c();
        }
    }

    /* renamed from: i */
    public final void mo48599i(int i) {
        if (this.f117446e != i) {
            C44963z a = mo48591a();
            mo48595e();
            this.f117460s = null;
            a.mo48535j();
            this.f117446e = i;
            Iterator it = this.f117457p.iterator();
            while (it.hasNext()) {
                ((C44937ar) it.next()).mo48553a();
            }
            mo48601k(i != 0);
            C44963z a2 = mo48591a();
            int i2 = this.f117456o.f117440c;
            if (i2 == 0) {
                i2 = a2.mo48531b();
            }
            mo48598h(i2);
            mo48596f(a2.mo48530a());
            this.f117445d.mo48001a(a2.mo48537s());
            int i3 = this.f117442a.f117318l;
            if (a2.mo48581o(i3)) {
                a2.mo48534i();
                this.f117460s = a2.mo48577A();
                mo48592b();
                View.OnClickListener c = a2.mo48532c();
                CheckableImageButton checkableImageButton = this.f117445d;
                checkableImageButton.setOnClickListener(c);
                C44920aa.m79801d(checkableImageButton);
                EditText editText = this.f117452k;
                if (editText != null) {
                    a2.mo48533g(editText);
                    mo48603m(a2);
                }
                C44920aa.m79799b(this.f117442a, this.f117445d, this.f117447f, this.f117448g);
                mo48594d(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + i3 + " is not supported by the end icon mode " + i);
        }
    }

    /* renamed from: j */
    public final void mo48600j(ColorStateList colorStateList) {
        if (this.f117447f != colorStateList) {
            this.f117447f = colorStateList;
            C44920aa.m79799b(this.f117442a, this.f117445d, colorStateList, this.f117448g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo48601k(boolean z) {
        if (mo48608r() != z) {
            this.f117445d.setVisibility(true != z ? 8 : 0);
            m79886u();
            mo48605o();
            this.f117442a.mo48497x();
        }
    }

    /* renamed from: l */
    public final void mo48602l(Drawable drawable) {
        this.f117443b.setImageDrawable(drawable);
        mo48604n();
        C44920aa.m79799b(this.f117442a, this.f117443b, this.f117444c, this.f117455n);
    }

    /* renamed from: m */
    public final void mo48603m(C44963z zVar) {
        EditText editText = this.f117452k;
        if (editText != null) {
            if (zVar.mo48563d() != null) {
                editText.setOnFocusChangeListener(zVar.mo48563d());
            }
            if (zVar.mo48564e() != null) {
                this.f117445d.setOnFocusChangeListener(zVar.mo48564e());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48604n() {
        /*
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.f117443b
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            com.google.android.material.textfield.TextInputLayout r0 = r4.f117442a
            com.google.android.material.textfield.ad r0 = r0.f117310d
            boolean r3 = r0.f117345f
            if (r3 == 0) goto L_0x001c
            int r3 = r0.f117343d
            boolean r0 = r0.mo48517o(r3)
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            com.google.android.material.internal.CheckableImageButton r3 = r4.f117443b
            if (r1 == r0) goto L_0x0023
            r2 = 8
        L_0x0023:
            r3.setVisibility(r2)
            r4.m79886u()
            r4.mo48605o()
            boolean r0 = r4.mo48607q()
            if (r0 != 0) goto L_0x0037
            com.google.android.material.textfield.TextInputLayout r0 = r4.f117442a
            r0.mo48497x()
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.C44962y.mo48604n():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo48605o() {
        if (this.f117442a.f117309c != null) {
            int i = 0;
            if (!mo48608r() && !mo48609s()) {
                i = C2043bi.m5582k(this.f117442a.f117309c);
            }
            C2043bi.m5556aj(this.f117450i, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f117442a.f117309c.getPaddingTop(), i, this.f117442a.f117309c.getPaddingBottom());
        }
    }

    /* renamed from: p */
    public final void mo48606p() {
        int visibility = this.f117450i.getVisibility();
        boolean z = false;
        int i = 8;
        if (this.f117449h != null && !this.f117451j) {
            i = 0;
        }
        if (visibility != i) {
            C44963z a = mo48591a();
            if (i == 0) {
                z = true;
            }
            a.mo48566h(z);
        }
        m79886u();
        this.f117450i.setVisibility(i);
        this.f117442a.mo48497x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo48607q() {
        return this.f117446e != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo48608r() {
        return this.f117454m.getVisibility() == 0 && this.f117445d.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo48609s() {
        return this.f117443b.getVisibility() == 0;
    }
}
