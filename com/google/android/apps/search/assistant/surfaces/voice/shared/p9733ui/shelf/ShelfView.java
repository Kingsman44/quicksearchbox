package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.shelf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128628g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.shelf.ShelfView */
/* compiled from: PG */
public final class ShelfView extends FrameLayout {

    /* renamed from: a */
    private final int f353649a;

    /* renamed from: b */
    private final int f353650b;

    /* renamed from: c */
    private final FrameLayout f353651c;

    /* renamed from: d */
    private final C128646g f353652d;

    /* renamed from: e */
    private final Rect f353653e;

    /* renamed from: f */
    private final ColorDrawable f353654f;

    /* renamed from: g */
    private final ViewTreeObserver.OnPreDrawListener f353655g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShelfView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShelfView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShelfView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShelfView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C69664n.m101061g(context, "context");
        int applyDimension = (int) TypedValue.applyDimension(1, 560.0f, getResources().getDisplayMetrics());
        this.f353649a = applyDimension;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C128640a.f353656a);
            C69664n.m101060f(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.ShelfView)");
            applyDimension = obtainStyledAttributes.getDimensionPixelOffset(0, applyDimension);
            obtainStyledAttributes.recycle();
        }
        this.f353650b = applyDimension;
        Context context2 = getContext();
        C69664n.m101060f(context2, "context");
        C128641b bVar = new C128641b(context2, applyDimension);
        bVar.setBackgroundResource(R.drawable.assistant_shelf_background);
        bVar.setClickable(true);
        bVar.setFocusable(true);
        bVar.setImportantForAccessibility(2);
        bVar.setOutlineProvider(new C128642c());
        bVar.setClipToOutline(true);
        this.f353651c = bVar;
        this.f353652d = new C128646g(this, new C128643d(this));
        this.f353653e = new Rect();
        ColorDrawable colorDrawable = new ColorDrawable(C19391a.m36980a(context, R.attr.assistantBackground));
        this.f353654f = colorDrawable;
        this.f353655g = new C128644e(this);
        super.setBackgroundTintList((ColorStateList) null);
        super.setBackgroundTintBlendMode((BlendMode) null);
        colorDrawable.setCallback(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        super.addView(bVar, -1, layoutParams);
    }

    /* renamed from: a */
    public final void mo108585a() {
        C128628g.m209924b(this, this.f353651c, this.f353653e);
        this.f353654f.setBounds(this.f353653e.left, this.f353653e.bottom, this.f353653e.right, getHeight());
    }

    public final void addView(View view) {
        this.f353651c.addView(view);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C69664n.m101061g(canvas, "canvas");
        this.f353654f.draw(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f353655g);
        C128646g gVar = this.f353652d;
        C59052c cVar = (C59052c) C128646g.f353660a.mo56224b();
        Object a = gVar.f353662c.mo5672a();
        cVar.mo56379ah(new C59094n(37922));
        cVar.mo56389s("Start listening View [%s] insets for centering.", a);
        C128567c.m209821d(gVar.f353661b, new C128645f(gVar));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C128646g gVar = this.f353652d;
        C59052c cVar = (C59052c) C128646g.f353660a.mo56224b();
        Object a = gVar.f353662c.mo5672a();
        cVar.mo56379ah(new C59094n(37923));
        cVar.mo56389s("Stop listening View [%s] insets for centering.", a);
        C2043bi.m5555ai(gVar.f353661b, (C2010ad) null);
        getViewTreeObserver().removeOnPreDrawListener(this.f353655g);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo108585a();
    }

    public final void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("ShelfView does not allow to change its background");
    }

    public final void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("ShelfView does not allow to change its background");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        throw new UnsupportedOperationException("ShelfView does not allow to change its background");
    }

    public final void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("ShelfView does not allow to change its background");
    }

    public final void setBackgroundTintBlendMode(BlendMode blendMode) {
        throw new UnsupportedOperationException("ShelfView does not allow to change background's tint");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("ShelfView does not allow to change background's tint");
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("ShelfView does not allow to change background's tint");
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        C69664n.m101061g(drawable, "who");
        return super.verifyDrawable(drawable) || drawable == this.f353654f;
    }

    public final void addView(View view, int i) {
        this.f353651c.addView(view, i);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f353651c.addView(view, i, layoutParams);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f353651c.addView(view, layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShelfView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C69659i iVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
