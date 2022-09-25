package com.google.android.libraries.material.featurehighlight;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.C44573c;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
public class TextContentView extends LinearLayout implements C28523e {

    /* renamed from: a */
    public C28511ab f77359a;

    /* renamed from: b */
    private TextView f77360b;

    /* renamed from: c */
    private TextView f77361c;

    /* renamed from: d */
    private TextView f77362d;

    public TextContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m53288A(android.widget.TextView r5, int r6) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()     // Catch:{ all -> 0x0028 }
            r1 = 1
            int[] r1 = new int[r1]     // Catch:{ all -> 0x0028 }
            r2 = 16843287(0x1010217, float:2.3695057E-38)
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0028 }
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)     // Catch:{ all -> 0x0028 }
            float r0 = r5.getLineSpacingExtra()     // Catch:{ all -> 0x0026 }
            float r0 = r6.getDimension(r3, r0)     // Catch:{ all -> 0x0026 }
            float r1 = r5.getLineSpacingMultiplier()     // Catch:{ all -> 0x0026 }
            r5.setLineSpacing(r0, r1)     // Catch:{ all -> 0x0026 }
            if (r6 == 0) goto L_0x0025
            r6.recycle()
        L_0x0025:
            return
        L_0x0026:
            r5 = move-exception
            goto L_0x002a
        L_0x0028:
            r5 = move-exception
            r6 = 0
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.recycle()
        L_0x002f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.featurehighlight.TextContentView.m53288A(android.widget.TextView, int):void");
    }

    /* renamed from: B */
    private static final void m53289B(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i;
            view.setLayoutParams(layoutParams2);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = i;
            view.setLayoutParams(layoutParams3);
        }
    }

    /* renamed from: C */
    private static final void m53290C(TextView textView, int i) {
        if (i == 0) {
            textView.setTextAlignment(5);
        } else if (i == 1) {
            textView.setTextAlignment(4);
        } else if (i == 2) {
            textView.setTextAlignment(6);
        }
    }

    /* renamed from: D */
    private static final void m53291D(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        if (charSequence instanceof Spanned) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: a */
    public final View mo33966a() {
        return this;
    }

    /* renamed from: b */
    public final View mo33967b() {
        return this.f77361c;
    }

    /* renamed from: c */
    public final View mo33968c() {
        return this.f77362d;
    }

    /* renamed from: d */
    public final View mo33969d() {
        return this.f77360b;
    }

    /* renamed from: e */
    public final CharSequence mo33970e() {
        CharSequence text = this.f77361c.getText();
        return text == null ? BuildConfig.FLAVOR : text;
    }

    /* renamed from: f */
    public final CharSequence mo33971f() {
        CharSequence text = this.f77362d.getText();
        return text == null ? BuildConfig.FLAVOR : text;
    }

    /* renamed from: g */
    public final CharSequence mo33972g() {
        CharSequence text = this.f77360b.getText();
        return text == null ? BuildConfig.FLAVOR : text;
    }

    /* renamed from: h */
    public final void mo33973h(int i) {
        m53290C(this.f77361c, i);
    }

    /* renamed from: i */
    public final void mo33974i(int i) {
        this.f77361c.setTextAppearance(i);
        m53288A(this.f77361c, i);
    }

    /* renamed from: j */
    public final void mo33975j(ColorStateList colorStateList) {
        this.f77361c.setTextColor(colorStateList);
    }

    /* renamed from: k */
    public final void mo33976k(float f) {
        this.f77361c.setTextSize(f);
    }

    /* renamed from: l */
    public final void mo33977l(C28511ab abVar) {
        this.f77359a = abVar;
    }

    /* renamed from: n */
    public final void mo33979n(ColorStateList colorStateList) {
        TextView textView = this.f77362d;
        if (textView instanceof MaterialButton) {
            ((MaterialButton) textView).mo47554k(colorStateList);
        }
    }

    /* renamed from: o */
    public final void mo33980o(ColorStateList colorStateList) {
        TextView textView = this.f77362d;
        if (textView instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) textView;
            if (materialButton.mo47561q()) {
                C44573c cVar = materialButton.f115969b;
                if (cVar.f116003k != colorStateList) {
                    cVar.f116003k = colorStateList;
                    cVar.mo47590e();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.featurehighlight_help_text_header_view);
        textView.getClass();
        this.f77360b = textView;
        TextView textView2 = (TextView) findViewById(R.id.featurehighlight_help_text_body_view);
        textView2.getClass();
        this.f77361c = textView2;
        TextView textView3 = (TextView) findViewById(R.id.featurehighlight_dismiss_action_text_view);
        textView3.getClass();
        this.f77362d = textView3;
    }

    /* renamed from: p */
    public final void mo33982p(int i) {
        m53290C(this.f77362d, i);
    }

    /* renamed from: q */
    public final void mo33983q(int i) {
        this.f77362d.setTextAppearance(i);
        m53288A(this.f77362d, i);
    }

    /* renamed from: r */
    public final void mo33984r(ColorStateList colorStateList) {
        this.f77362d.setTextColor(colorStateList);
    }

    /* renamed from: s */
    public final void mo33985s(int i) {
        m53290C(this.f77360b, i);
    }

    /* renamed from: t */
    public final void mo33986t(int i) {
        this.f77360b.setTextAppearance(i);
        m53288A(this.f77360b, i);
    }

    /* renamed from: u */
    public final void mo33987u(ColorStateList colorStateList) {
        this.f77360b.setTextColor(colorStateList);
    }

    /* renamed from: v */
    public final void mo33988v(float f) {
        this.f77360b.setTextSize(f);
    }

    /* renamed from: w */
    public final void mo33989w(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        m53291D(this.f77360b, charSequence);
        m53291D(this.f77361c, charSequence2);
        m53291D(this.f77362d, charSequence3);
        this.f77362d.setOnClickListener(new C28519aj(this));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence)) {
            spannableStringBuilder.append(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(charSequence2);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(charSequence2)) {
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(charSequence3);
        }
    }

    /* renamed from: x */
    public final boolean mo33990x() {
        return this.f77361c.getVisibility() == 0;
    }

    /* renamed from: y */
    public final boolean mo33991y() {
        return this.f77362d.getVisibility() == 0;
    }

    /* renamed from: z */
    public final boolean mo33992z() {
        return this.f77360b.getVisibility() == 0;
    }

    /* renamed from: m */
    public final void mo33978m(int i) {
        TextView textView = this.f77362d;
        if (i == 0) {
            m53289B(textView, 8388611);
        } else if (i == 1) {
            m53289B(textView, 8388613);
        }
    }
}
