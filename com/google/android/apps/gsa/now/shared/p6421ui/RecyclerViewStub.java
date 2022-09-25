package com.google.android.apps.gsa.now.shared.p6421ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub */
/* compiled from: PG */
public class RecyclerViewStub extends FrameLayout {

    /* renamed from: a */
    public int f227323a;

    /* renamed from: b */
    private int f227324b;

    /* renamed from: c */
    private C83419h f227325c;

    /* renamed from: d */
    private C83420i f227326d;

    public RecyclerViewStub(Context context, int i) {
        this(context, (AttributeSet) null);
        this.f227323a = i;
    }

    /* renamed from: a */
    public final View mo76714a() {
        C83419h hVar = this.f227325c;
        if (hVar != null && hVar.f227390b == this.f227323a) {
            return hVar.f227389a;
        }
        if (this.f227323a != 0) {
            mo76715b();
            C83420i iVar = this.f227326d;
            C83416e a = iVar != null ? iVar.mo76754a(this.f227323a) : null;
            if (a == null) {
                a = new C83416e(LayoutInflater.from(getContext()).inflate(this.f227323a, this, false), this.f227323a);
            }
            int i = this.f227324b;
            if (i != -1) {
                a.f227389a.setId(i);
            }
            a.f227389a.setVisibility(0);
            super.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                addView(a.f227389a, new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height));
            } else {
                addView(a.f227389a);
            }
            this.f227325c = a;
            return a.f227389a;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }

    /* renamed from: b */
    public final void mo76715b() {
        C83416e eVar;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                removeViewAt(childCount);
                removeDetachedView(childAt, false);
                if (!(this.f227326d == null || (eVar = (C83416e) C83420i.m132813c(childAt)) == null)) {
                    this.f227326d.mo76755b(eVar);
                }
            } else {
                this.f227325c = null;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo76716c(C83421j jVar) {
        if (this.f227326d == null) {
            this.f227326d = jVar.mo76756a(RecyclerViewStub.class);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (getChildCount() != 0) {
            super.dispatchDraw(canvas);
        }
    }

    public final void draw(Canvas canvas) {
        if (getChildCount() != 0) {
            super.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (getChildCount() > 0) {
            getChildAt(0).setLayoutParams(generateLayoutParams(layoutParams));
        }
    }

    public final void setVisibility(int i) {
        if (this.f227323a != 0) {
            super.setVisibility(i);
            if (i == 0 || i == 4) {
                mo76714a();
            }
        }
    }

    public RecyclerViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewStub(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C83415d.f227386b);
        this.f227324b = obtainStyledAttributes.getResourceId(0, -1);
        this.f227323a = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
        setMeasureAllChildren(true);
    }
}
