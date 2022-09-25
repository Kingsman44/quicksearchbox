package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.scrim;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.scrim.ScrimView */
/* compiled from: PG */
public final class ScrimView extends FrameLayout {

    /* renamed from: a */
    public static final Rect f353638a = new Rect(0, 0, 0, 0);

    /* renamed from: f */
    private static final C128638b f353639f = new C128638b();

    /* renamed from: b */
    public final int f353640b;

    /* renamed from: c */
    public final ColorDrawable f353641c;

    /* renamed from: d */
    public final Rect f353642d;

    /* renamed from: e */
    public final C128638b f353643e;

    /* renamed from: g */
    private final ViewTreeObserver.OnPreDrawListener f353644g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrimView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrimView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrimView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C69664n.m101061g(context, "context");
        int i3 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C128637a.f353645a);
            C69664n.m101060f(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.ScrimView)");
            i3 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
        }
        this.f353640b = i3;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f353641c = colorDrawable;
        this.f353642d = new Rect();
        this.f353644g = new C128639c(this);
        this.f353643e = f353639f;
        super.setBackgroundDrawable(colorDrawable);
        super.setBackgroundTintList((ColorStateList) null);
        super.setBackgroundTintBlendMode((BlendMode) null);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrimView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f353644g);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f353644g);
    }

    public final void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("ScrimView does not allow to change its background");
    }

    public final void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("ScrimView does not allow to change its background");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        throw new UnsupportedOperationException("ScrimView does not allow to change its background");
    }

    public final void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("ScrimView does not allow to change its background");
    }

    public final void setBackgroundTintBlendMode(BlendMode blendMode) {
        throw new UnsupportedOperationException("ScrimView does not allow to change background's tint");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("ScrimView does not allow to change background's tint");
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("ScrimView does not allow to change background's tint");
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        C69664n.m101061g(drawable, "who");
        return super.verifyDrawable(drawable) || drawable == this.f353641c;
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrimView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrimView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrimView can host only one direct child");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrimView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C69659i iVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
