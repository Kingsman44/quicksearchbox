package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44728b;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44754n;
import com.google.android.material.internal.C44757q;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public class ChipGroup extends C44754n {

    /* renamed from: a */
    public int f116112a;

    /* renamed from: b */
    public C44600j f116113b;

    /* renamed from: c */
    public final C44728b f116114c;

    /* renamed from: h */
    private int f116115h;

    /* renamed from: i */
    private final int f116116i;

    /* renamed from: j */
    private final C44601k f116117j;

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo47726a(int i) {
        if (this.f116112a != i) {
            this.f116112a = i;
            this.f116686e = i;
            requestLayout();
        }
    }

    /* renamed from: b */
    public final void mo47727b(int i) {
        if (this.f116115h != i) {
            this.f116115h = i;
            this.f116685d = i;
            requestLayout();
        }
    }

    /* renamed from: c */
    public final boolean mo47728c(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C44599i);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C44599i();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C44599i(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f116116i;
        if (i != -1) {
            C44728b bVar = this.f116114c;
            C44757q qVar = (C44757q) bVar.f116584a.get(Integer.valueOf(i));
            if (qVar != null && bVar.mo48039d(qVar)) {
                bVar.mo48038c();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1991k kVar = new C1991k(accessibilityNodeInfo);
        if (this.f116687f) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof Chip) && mo47728c(i2)) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        int i3 = this.f116688g;
        int i4 = 1;
        if (true != this.f116114c.f116586c) {
            i4 = 2;
        }
        kVar.mo5154c(C1989i.m5331a(i3, i, false, i4));
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f116117j.f116184a = onHierarchyChangeListener;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C44599i(layoutParams);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151758), attributeSet, i);
        C44728b bVar = new C44728b();
        this.f116114c = bVar;
        this.f116117j = new C44601k(this);
        TypedArray a = C44733be.m79295a(getContext(), attributeSet, C44602l.f116187b, i, 2132151758, new int[0]);
        int dimensionPixelOffset = a.getDimensionPixelOffset(1, 0);
        mo47726a(a.getDimensionPixelOffset(2, dimensionPixelOffset));
        mo47727b(a.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.f116687f = a.getBoolean(5, false);
        boolean z = a.getBoolean(6, false);
        if (bVar.f116586c != z) {
            bVar.f116586c = z;
            boolean z2 = !bVar.f116585b.isEmpty();
            for (C44757q e : bVar.f116584a.values()) {
                bVar.mo48040e(e, false);
            }
            if (z2) {
                bVar.mo48038c();
            }
        }
        this.f116114c.f116587d = a.getBoolean(4, false);
        this.f116116i = a.getResourceId(0, -1);
        a.recycle();
        this.f116114c.f116588e = new C44597g(this);
        super.setOnHierarchyChangeListener(this.f116117j);
        C2043bi.m5551ae(this, 1);
    }
}
