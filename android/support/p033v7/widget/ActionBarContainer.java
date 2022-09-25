package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ActionBarContainer */
/* compiled from: PG */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public View f1719a;

    /* renamed from: b */
    Drawable f1720b;

    /* renamed from: c */
    Drawable f1721c;

    /* renamed from: d */
    Drawable f1722d;

    /* renamed from: e */
    boolean f1723e;

    /* renamed from: f */
    boolean f1724f;

    /* renamed from: g */
    private boolean f1725g;

    /* renamed from: h */
    private View f1726h;

    /* renamed from: i */
    private View f1727i;

    /* renamed from: j */
    private int f1728j;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private static final int m1666c(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: d */
    private static final boolean m1667d(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: a */
    public final void mo1816a(C0687gv gvVar) {
        View view = this.f1719a;
        if (view != null) {
            removeView(view);
        }
        this.f1719a = gvVar;
        if (gvVar != null) {
            addView(gvVar);
            ViewGroup.LayoutParams layoutParams = gvVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            gvVar.f2515d = false;
        }
    }

    /* renamed from: b */
    public final void mo1817b(boolean z) {
        this.f1725g = z;
        setDescendantFocusability(true != z ? C89885b.HTTP_VALUE : 393216);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1720b;
        if (drawable != null && drawable.isStateful()) {
            this.f1720b.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1721c;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1721c.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1722d;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1722d.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1720b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1721c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1722d;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1726h = findViewById(R.id.action_bar);
        this.f1727i = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1725g || super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1719a;
        boolean z2 = true;
        boolean z3 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1723e) {
            Drawable drawable2 = this.f1722d;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            if (this.f1720b == null) {
                z2 = false;
            } else if (this.f1726h.getVisibility() == 0) {
                this.f1720b.setBounds(this.f1726h.getLeft(), this.f1726h.getTop(), this.f1726h.getRight(), this.f1726h.getBottom());
            } else {
                View view2 = this.f1727i;
                if (view2 == null || view2.getVisibility() != 0) {
                    this.f1720b.setBounds(0, 0, 0, 0);
                } else {
                    this.f1720b.setBounds(this.f1727i.getLeft(), this.f1727i.getTop(), this.f1727i.getRight(), this.f1727i.getBottom());
                }
            }
            this.f1724f = z3;
            if (z3 && (drawable = this.f1721c) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else if (!z2) {
                return;
            }
        }
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1726h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f1728j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, i2);
        if (this.f1726h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1719a;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m1667d(this.f1726h)) {
                    i3 = m1666c(this.f1726h);
                } else {
                    i3 = !m1667d(this.f1727i) ? m1666c(this.f1727i) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1666c(this.f1719a), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1720b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1721c;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1722d;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f1720b && !this.f1723e) {
            return true;
        }
        if (drawable != this.f1721c || !this.f1724f) {
            return (drawable == this.f1722d && this.f1723e) || super.verifyDrawable(drawable);
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2043bi.m5530X(this, new C0557c(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338a.f1065a);
        boolean z = false;
        this.f1720b = obtainStyledAttributes.getDrawable(0);
        this.f1721c = obtainStyledAttributes.getDrawable(2);
        this.f1728j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1723e = true;
            this.f1722d = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1723e ? this.f1720b == null && this.f1721c == null : this.f1722d == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
