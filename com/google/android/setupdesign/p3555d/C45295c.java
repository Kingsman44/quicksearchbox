package com.google.android.setupdesign.p3555d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.template.C45280g;
import com.google.android.setupdesign.C45318g;
import com.google.android.setupdesign.p3558f.C45312f;

/* renamed from: com.google.android.setupdesign.d.c */
/* compiled from: PG */
public final class C45295c implements C45280g {

    /* renamed from: a */
    public final TemplateLayout f118340a;

    /* renamed from: b */
    public boolean f118341b = false;

    /* renamed from: c */
    public float f118342c;

    /* renamed from: d */
    public float f118343d;

    /* renamed from: e */
    public int f118344e;

    /* renamed from: f */
    private float f118345f;

    public C45295c(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a;
        this.f118340a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, C45318g.f118382a, i, 0);
        CharSequence text = obtainStyledAttributes.getText(4);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
        obtainStyledAttributes.recycle();
        mo49228e();
        if (text != null) {
            mo49227d(text);
        }
        if (colorStateList != null && (a = mo49224a()) != null) {
            a.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    public final TextView mo49224a() {
        return (TextView) this.f118340a.mo49127h(R.id.suc_layout_title);
    }

    /* renamed from: b */
    public final void mo49225b(TextView textView) {
        if (textView != null) {
            textView.setTextSize(0, this.f118345f);
            textView.setLineHeight(Math.round(this.f118343d + this.f118345f));
            textView.setMaxLines(6);
            textView.getViewTreeObserver().addOnPreDrawListener(new C45294b(this, textView));
        }
    }

    /* renamed from: c */
    public final void mo49226c(int i) {
        TextView a = mo49224a();
        if (a != null) {
            if (this.f118341b) {
                mo49225b(a);
            }
            a.setText(i);
        }
    }

    /* renamed from: d */
    public final void mo49227d(CharSequence charSequence) {
        TextView a = mo49224a();
        if (a != null) {
            if (this.f118341b) {
                mo49225b(a);
            }
            a.setText(charSequence);
        }
    }

    /* renamed from: e */
    public final void mo49228e() {
        Context context = this.f118340a.getContext();
        if (!C45312f.m80763c(this.f118340a)) {
            this.f118341b = false;
            return;
        }
        if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_HEADER_AUTO_SIZE_ENABLED)) {
            this.f118341b = C45240c.m80574e(context).mo49105j(context, C45238a.CONFIG_HEADER_AUTO_SIZE_ENABLED, this.f118341b);
        }
        if (this.f118341b) {
            if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE)) {
                this.f118345f = C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE, 0.0f);
            }
            if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE)) {
                this.f118342c = C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE, 0.0f);
            }
            if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA)) {
                this.f118343d = C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA, 0.0f);
            }
            if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE)) {
                this.f118344e = C45240c.m80574e(context).mo49109s(context, C45238a.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE);
            }
            if (this.f118344e > 0) {
                float f = this.f118342c;
                if (f > 0.0f && this.f118345f >= f) {
                    return;
                }
            }
            Log.w("HeaderMixin", "Invalid configs, disable auto text size.");
            this.f118341b = false;
        }
    }
}
