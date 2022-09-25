package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatTextView;
import android.support.p033v7.widget.C0735ip;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p3512i.C44694d;

/* renamed from: com.google.android.material.textfield.al */
/* compiled from: PG */
final class C44931al extends LinearLayout {

    /* renamed from: a */
    public final TextView f117384a;

    /* renamed from: b */
    public CharSequence f117385b;

    /* renamed from: c */
    public final CheckableImageButton f117386c;

    /* renamed from: d */
    public boolean f117387d;

    /* renamed from: e */
    private final TextInputLayout f117388e;

    /* renamed from: f */
    private ColorStateList f117389f;

    /* renamed from: g */
    private PorterDuff.Mode f117390g;

    /* renamed from: h */
    private int f117391h;

    public C44931al(TextInputLayout textInputLayout, C0735ip ipVar) {
        super(textInputLayout.getContext());
        this.f117388e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f117386c = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f117384a = appCompatTextView;
        if (C44694d.m79233e(getContext())) {
            C2104s.m5793f((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        CharSequence charSequence = null;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        C44920aa.m79801d(checkableImageButton);
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        C44920aa.m79801d(checkableImageButton);
        int[] iArr = C44930ak.f117381a;
        if (ipVar.f2596b.hasValue(66)) {
            this.f117389f = C44694d.m79231c(getContext(), ipVar, 66);
        }
        if (ipVar.f2596b.hasValue(67)) {
            this.f117390g = C44741bm.m79310c(ipVar.f2596b.getInt(67, -1), (PorterDuff.Mode) null);
        }
        if (ipVar.f2596b.hasValue(63)) {
            Drawable b = ipVar.mo3246b(63);
            checkableImageButton.setImageDrawable(b);
            if (b != null) {
                C44920aa.m79799b(textInputLayout, checkableImageButton, this.f117389f, this.f117390g);
                mo48542c(true);
                mo48540a();
            } else {
                mo48542c(false);
                checkableImageButton.setOnClickListener((View.OnClickListener) null);
                C44920aa.m79801d(checkableImageButton);
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                C44920aa.m79801d(checkableImageButton);
                mo48541b((CharSequence) null);
            }
            if (ipVar.f2596b.hasValue(62)) {
                mo48541b(ipVar.f2596b.getText(62));
            }
            checkableImageButton.mo48001a(ipVar.f2596b.getBoolean(61, true));
        }
        int dimensionPixelSize = ipVar.f2596b.getDimensionPixelSize(64, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f117391h) {
                this.f117391h = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (ipVar.f2596b.hasValue(65)) {
                checkableImageButton.setScaleType(C44920aa.m79798a(ipVar.f2596b.getInt(65, -1)));
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            C2043bi.m5527U(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(ipVar.f2596b.getResourceId(57, 0));
            if (ipVar.f2596b.hasValue(58)) {
                appCompatTextView.setTextColor(ipVar.mo3245a(58));
            }
            CharSequence text = ipVar.f2596b.getText(56);
            this.f117385b = true != TextUtils.isEmpty(text) ? text : charSequence;
            appCompatTextView.setText(text);
            mo48544e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48540a() {
        C44920aa.m79800c(this.f117388e, this.f117386c, this.f117389f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo48541b(CharSequence charSequence) {
        if (this.f117386c.getContentDescription() != charSequence) {
            this.f117386c.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo48542c(boolean z) {
        if (mo48545f() != z) {
            this.f117386c.setVisibility(true != z ? 8 : 0);
            mo48543d();
            mo48544e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo48543d() {
        EditText editText = this.f117388e.f117309c;
        if (editText != null) {
            C2043bi.m5556aj(this.f117384a, mo48545f() ? 0 : C2043bi.m5583l(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    /* renamed from: e */
    public final void mo48544e() {
        int i = 0;
        int i2 = (this.f117385b == null || this.f117387d) ? 8 : 0;
        if (!(this.f117386c.getVisibility() == 0 || i2 == 0)) {
            i = 8;
        }
        setVisibility(i);
        this.f117384a.setVisibility(i2);
        this.f117388e.mo48497x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo48545f() {
        return this.f117386c.getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo48543d();
    }
}
