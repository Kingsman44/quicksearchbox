package com.google.android.libraries.material.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.content.C1877c;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2205a.C28503p;

@Deprecated
/* compiled from: PG */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: a */
    public int f77690a;

    /* renamed from: b */
    public int f77691b;

    /* renamed from: c */
    public int f77692c;

    /* renamed from: d */
    private int f77693d;

    /* renamed from: e */
    private int f77694e;

    /* renamed from: f */
    private C28582h f77695f;

    /* renamed from: g */
    private Drawable f77696g;

    public MaterialProgressBar(Context context) {
        super(context, (AttributeSet) null, 16842872);
        super.getProgress();
    }

    /* renamed from: i */
    public static MaterialProgressBar m53446i(Context context, int i) {
        MaterialProgressBar materialProgressBar = new MaterialProgressBar(context);
        int i2 = i != 1 ? 2132151263 : 2132151264;
        materialProgressBar.setIndeterminate(true);
        materialProgressBar.mo34161d(context, (AttributeSet) null, 0, i2);
        materialProgressBar.mo34159b();
        return materialProgressBar;
    }

    /* renamed from: j */
    private static int m53447j(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid attribute value for mtrlLinearGrowFrom: " + i);
    }

    /* renamed from: k */
    private final int m53448k() {
        return isIndeterminate() ? this.f77690a : this.f77691b;
    }

    /* renamed from: l */
    private final Drawable m53449l() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    /* renamed from: m */
    private final void m53450m() {
        if (m53448k() == 0 && isIndeterminate()) {
            if (C28503p.m53282a(getContext())) {
                if (m53449l() != this.f77696g) {
                    C28582h hVar = this.f77695f;
                    hVar.setVisible(false);
                    hVar.mo34199d();
                    this.f77695f.setCallback((Drawable.Callback) null);
                    unscheduleDrawable(this.f77695f);
                    setIndeterminateDrawable(this.f77696g);
                    onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
                }
            } else if (m53449l() != this.f77695f) {
                this.f77696g.setVisible(false, false);
                this.f77696g.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f77696g);
                setIndeterminateDrawable(this.f77695f);
                onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
            }
        }
        Drawable l = m53449l();
        if (l != null) {
            boolean p = m53453p();
            if (!(l instanceof C28575a) || p) {
                l.setVisible(p, true);
            } else {
                ((C28575a) l).mo34175b();
            }
        }
    }

    /* renamed from: n */
    private final void m53451n(TypedArray typedArray, boolean z) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int[] iArr2 = C28591q.f77791a;
        int i4 = typedArray.getInt(7, 3);
        if (typedArray.hasValue(1)) {
            iArr = getResources().getIntArray(typedArray.getResourceId(1, -1));
        } else if (typedArray.hasValue(0)) {
            iArr = new int[]{typedArray.getColor(0, 0)};
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = getResources().getIntArray(R.array.material_google_colors);
        }
        if (i4 == 1) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_small);
        } else if (i4 == 2) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_medium);
        } else if (i4 == 3) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        this.f77693d = i;
        if (i4 == 1) {
            i2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_small);
        } else if (i4 == 2) {
            i2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_medium);
        } else if (i4 == 3) {
            i2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (i4 == 1) {
            i3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_small);
        } else if (i4 == 2) {
            i3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_medium);
        } else if (i4 == 3) {
            i3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (z) {
            this.f77696g = C1877c.m5125a(getContext(), R.drawable.quantum_ic_sync_grey600_24);
            C28582h hVar = new C28582h(i2, i3, iArr);
            this.f77695f = hVar;
            setIndeterminateDrawable(hVar);
            return;
        }
        setProgressDrawable(new C28578d(i2, i3, iArr[0]));
    }

    /* renamed from: o */
    private final void m53452o(TypedArray typedArray, boolean z) {
        int i;
        int[] iArr = C28591q.f77791a;
        if (typedArray.hasValue(0)) {
            i = typedArray.getColor(0, -1);
        } else {
            i = getResources().getColor(R.color.quantum_googblue);
        }
        int i2 = i;
        int color = typedArray.getColor(8, -1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        int i3 = typedArray.getInt(6, 0);
        float f2 = color != -1 ? 1.0f : f;
        if (z) {
            setIndeterminateDrawable(new C28589o(this.f77692c, i2, color, f2, this.f77690a == 2, m53447j(i3)));
        } else {
            setProgressDrawable(new C28585k(this.f77692c, i2, color, f2, m53447j(i3)));
        }
    }

    /* renamed from: p */
    private final boolean m53453p() {
        if (!C2043bi.m5569aw(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo34158a() {
        if (!m53453p()) {
            setVisibility(4);
            return;
        }
        Drawable l = m53449l();
        if (l instanceof C28575a) {
            ((C28575a) l).mo34174a(new C28590p(this));
        } else {
            setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void mo34159b() {
        mo34162e();
        if (isIndeterminate()) {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(m53453p(), true);
            return;
        }
        getProgressDrawable().setVisible(m53453p(), true);
        getIndeterminateDrawable().setVisible(false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo34160c() {
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    /* renamed from: d */
    public final void mo34161d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C28591q.f77791a, i, i2);
        this.f77692c = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f77694e = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        this.f77690a = i3;
        if (i3 == 0) {
            m53451n(obtainStyledAttributes, true);
        } else if (i3 == 1 || i3 == 2) {
            m53452o(obtainStyledAttributes, true);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        int i4 = obtainStyledAttributes.getInt(2, 1);
        this.f77691b = i4;
        if (i4 == 0) {
            m53451n(obtainStyledAttributes, false);
        } else if (i4 == 1) {
            m53452o(obtainStyledAttributes, false);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    public final void mo34162e() {
        if (isIndeterminate()) {
            if (this.f77690a != 0) {
                setMinimumHeight(this.f77692c);
            } else {
                setMinimumHeight(0);
            }
        } else if (this.f77691b != 0) {
            setMinimumHeight(this.f77692c);
        } else {
            setMinimumHeight(0);
        }
    }

    /* renamed from: f */
    public final void mo34163f(int i) {
        if (this.f77691b != 0) {
            ((C28585k) getProgressDrawable()).setColor(i);
        } else {
            ((C28578d) getProgressDrawable()).setColor(i);
        }
        if (this.f77690a != 0) {
            ((C28589o) getIndeterminateDrawable()).setColor(i);
            return;
        }
        this.f77695f.setColors(new int[]{i});
    }

    /* renamed from: g */
    public final void mo34164g(int i) {
        if (!isIndeterminate()) {
            setProgress(i);
            if (this.f77691b == 1) {
                ((C28585k) getProgressDrawable()).mo34227c();
            }
        }
    }

    /* renamed from: h */
    public final void mo34165h() {
        if (getVisibility() != 0) {
            setVisibility(0);
        } else if (m53453p()) {
            m53449l().setVisible(true, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m53453p()) {
            mo34165h();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (m53449l() instanceof C28575a) {
            ((C28575a) m53449l()).mo34175b();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        m53449l().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m53448k() == 0) {
            setMeasuredDimension(this.f77693d + getPaddingLeft() + getPaddingRight(), this.f77693d + getPaddingTop() + getPaddingBottom());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f77692c;
        int i4 = this.f77694e;
        setMeasuredDimension(measuredWidth, resolveSizeAndState(i3 + i4 + i4 + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (m53448k() != 0) {
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            Drawable indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            Drawable progressDrawable = getProgressDrawable();
            if (progressDrawable != null) {
                progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
                return;
            }
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m53450m();
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m53450m();
    }

    public final synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        mo34162e();
        Drawable l = m53449l();
        if (l != null) {
            l.setVisible(m53453p(), false);
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.getProgress();
        mo34161d(context, attributeSet, 0, 2132151262);
        mo34159b();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.getProgress();
        mo34161d(context, attributeSet, i, 2132151262);
        mo34159b();
    }
}
