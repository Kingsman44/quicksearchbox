package com.google.android.apps.gsa.staticplugins.actionsui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ClassicActionView extends C93498d {

    /* renamed from: a */
    C93505k f260733a;

    /* renamed from: b */
    private final Drawable f260734b;

    /* renamed from: c */
    private ViewGroup f260735c;

    /* renamed from: d */
    private View f260736d;

    /* renamed from: e */
    private LinearLayout f260737e;

    public ClassicActionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo87698a() {
        mo87712n().mo87723a();
    }

    /* renamed from: b */
    public final void mo87699b(int i) {
        CountDownView n = mo87712n();
        n.mo87724b(n.getResources().getDrawable(i), true);
    }

    /* renamed from: c */
    public final void mo87700c(int i) {
        mo87712n().setTag(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void mo87701d(int i) {
        mo87712n().f260748c.setText(i);
    }

    /* renamed from: e */
    public final void mo87702e(String str) {
        mo87712n().f260748c.setText(str);
    }

    /* renamed from: f */
    public final void mo87703f(int i) {
        this.f260735c.removeAllViews();
        inflate(getContext(), i, this.f260735c);
    }

    /* renamed from: g */
    public final void mo87704g(boolean z) {
        mo87712n().setVisibility(true != z ? 8 : 0);
    }

    public final Object getTag() {
        return mo87712n().getTag();
    }

    /* renamed from: h */
    public final void mo87706h() {
        setClickable(false);
        mo87712n().f260747b.setEnabled(false);
        mo87711m();
        this.f260735c.setClickable(false);
        this.f260735c.setEnabled(false);
        mo87704g(false);
    }

    /* renamed from: i */
    public final void mo87707i(long j) {
        CountDownView n = mo87712n();
        n.setVisibility(0);
        n.f260746a.setVisibility(0);
        n.f260749d.setVisibility(0);
        n.f260750e = ObjectAnimator.ofInt(n.f260746a, Property.of(ProgressBar.class, Integer.class, "progress"), new int[]{0, n.f260746a.getMax()});
        n.f260750e.setDuration(j);
        n.f260750e.start();
    }

    /* renamed from: j */
    public final void mo87708j(C93505k kVar) {
        this.f260733a = kVar;
        mo87712n().f260751f = kVar;
    }

    /* renamed from: k */
    public final void mo87709k(Drawable drawable) {
        mo87712n().mo87724b(drawable, false);
    }

    /* renamed from: l */
    public final void mo87710l(int i) {
        CountDownView n = mo87712n();
        if (C89941l.m146510a(n.f260747b) != i) {
            C89941l.m146512c(n.f260747b, i);
        }
    }

    /* renamed from: m */
    public final void mo87711m() {
        this.f260736d.setClickable(false);
        this.f260736d.setEnabled(false);
    }

    /* renamed from: n */
    public final CountDownView mo87712n() {
        return (CountDownView) this.f260737e.getChildAt(0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        findViewById(R.id.action_editor_content_wrapper).setBackground(this.f260734b);
        this.f260735c = (ViewGroup) findViewById(R.id.action_editor_content);
        this.f260737e = (LinearLayout) findViewById(R.id.action_editor_countdown_buttons);
        View findViewById = findViewById(R.id.action_editor_content_click_catcher);
        this.f260736d = findViewById;
        findViewById.setClickable(true);
        this.f260736d.setOnClickListener(new C93689n(this));
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ClassicActionView.class.getCanonicalName());
    }

    public final void setContentDescription(CharSequence charSequence) {
        View view = this.f260736d;
        if (view != null) {
            view.setContentDescription(charSequence);
        } else {
            super.setContentDescription(charSequence);
        }
    }

    public ClassicActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.ResultCard);
    }

    public ClassicActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C93480bh.f260877b);
        this.f260734b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }
}
