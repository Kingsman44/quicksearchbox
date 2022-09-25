package com.google.android.setupcompat.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.C45252d;
import com.google.android.setupcompat.template.C45280g;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class TemplateLayout extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f118196a;

    /* renamed from: b */
    private final Map f118197b = new HashMap();

    /* renamed from: c */
    public float f118198c;

    /* renamed from: d */
    public ViewTreeObserver.OnPreDrawListener f118199d;

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        m80616a(i, i2, (AttributeSet) null, R.attr.sucLayoutTheme);
    }

    /* renamed from: a */
    private final void m80616a(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C45252d.f118195f, i3, 0);
        if (i == 0) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = obtainStyledAttributes.getResourceId(1, 0);
        }
        mo49119d(attributeSet, i3);
        super.addView(mo49117b(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        ViewGroup c = mo49118c(i2);
        this.f118196a = c;
        if (c != null) {
            mo49130k();
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f118196a.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo49117b(LayoutInflater layoutInflater, int i) {
        return mo49128i(layoutInflater, 0, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ViewGroup mo49118c(int i) {
        return (ViewGroup) findViewById(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo49119d(AttributeSet attributeSet, int i) {
    }

    public float getXFraction() {
        return this.f118198c;
    }

    /* renamed from: h */
    public View mo49127h(int i) {
        return findViewById(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final View mo49128i(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 != 0) {
            if (i != 0) {
                layoutInflater = LayoutInflater.from(new C45255c(layoutInflater.getContext(), i));
            }
            return layoutInflater.inflate(i2, this, false);
        }
        throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
    }

    /* renamed from: j */
    public final C45280g mo49129j(Class cls) {
        return (C45280g) this.f118197b.get(cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49130k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo49131l(Class cls, C45280g gVar) {
        this.f118197b.put(cls, gVar);
    }

    public void setXFraction(float f) {
        this.f118198c = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(((float) width) * f);
        } else if (this.f118199d == null) {
            this.f118199d = new C45268p(this);
            getViewTreeObserver().addOnPreDrawListener(this.f118199d);
        }
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80616a(0, 0, attributeSet, R.attr.sucLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80616a(0, 0, attributeSet, i);
    }
}
