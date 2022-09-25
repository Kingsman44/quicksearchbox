package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.C1588c;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.p3513j.C44767a;
import com.google.android.material.p3515l.C44770aa;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.p3515l.C44785p;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public class MaterialCardView extends CardView implements Checkable, C44770aa {

    /* renamed from: i */
    private static final int[] f116029i = {16842911};

    /* renamed from: j */
    private static final int[] f116030j = {16842912};

    /* renamed from: g */
    public final C44585c f116031g;

    /* renamed from: h */
    public boolean f116032h;

    /* renamed from: k */
    private boolean f116033k;

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public final void mo4473c(int i) {
        C44585c cVar = this.f116031g;
        cVar.f116038c.mo48124V(ColorStateList.valueOf(i));
    }

    /* renamed from: d */
    public final void mo4474d(float f) {
        this.f4345f.f4347b.setElevation(f);
        this.f116031g.mo47633h();
    }

    /* renamed from: e */
    public final void mo4475e(float f) {
        super.mo4475e(f);
        C44585c cVar = this.f116031g;
        cVar.mo47631f(cVar.f116048m.mo48151b(f));
        cVar.f116044i.invalidateSelf();
        if (cVar.mo47639n() || cVar.mo47638m()) {
            cVar.mo47632g();
        }
        if (cVar.mo47639n()) {
            cVar.mo47634i();
        }
    }

    /* renamed from: f */
    public final void mo4476f() {
        super.mo4476f();
        this.f116031g.mo47634i();
        this.f116031g.mo47632g();
    }

    public final boolean isChecked() {
        return this.f116032h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo47609j(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* renamed from: k */
    public final void mo47610k(ColorStateList colorStateList) {
        C44585c cVar = this.f116031g;
        if (cVar.f116049n != colorStateList) {
            cVar.f116049n = colorStateList;
            cVar.mo47635j();
        }
        invalidate();
    }

    /* renamed from: l */
    public final void mo47555l(C44785p pVar) {
        RectF rectF = new RectF();
        rectF.set(this.f116031g.f116038c.getBounds());
        setClipToOutline(pVar.mo48152c(rectF));
        this.f116031g.mo47631f(pVar);
    }

    /* renamed from: m */
    public final void mo47611m(int i) {
        C44585c cVar = this.f116031g;
        if (i != cVar.f116043h) {
            cVar.f116043h = i;
            cVar.mo47635j();
        }
        invalidate();
    }

    /* renamed from: n */
    public final boolean mo47612n() {
        C44585c cVar = this.f116031g;
        return cVar != null && cVar.f116054s;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79413d(this, this.f116031g.f116038c);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo47612n()) {
            mergeDrawableStates(onCreateDrawableState, f116029i);
        }
        if (this.f116032h) {
            mergeDrawableStates(onCreateDrawableState, f116030j);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f116032h);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo47612n());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f116032h);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onMeasure(i, i2);
        C44585c cVar = this.f116031g;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (cVar.f116051p != null) {
            if (cVar.f116036a.f4341a) {
                float b = cVar.mo47627b();
                i4 = (int) Math.ceil((double) (b + b));
                float a = cVar.mo47626a();
                i3 = (int) Math.ceil((double) (a + a));
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (cVar.mo47637l()) {
                i5 = ((measuredWidth - cVar.f116040e) - cVar.f116041f) - i3;
            } else {
                i5 = cVar.f116040e;
            }
            if (cVar.mo47636k()) {
                i6 = cVar.f116040e;
            } else {
                i6 = ((measuredHeight - cVar.f116040e) - cVar.f116041f) - i4;
            }
            int i9 = i6;
            if (cVar.mo47637l()) {
                i7 = cVar.f116040e;
            } else {
                i7 = ((measuredWidth - cVar.f116040e) - cVar.f116041f) - i3;
            }
            if (cVar.mo47636k()) {
                i8 = ((measuredHeight - cVar.f116040e) - cVar.f116041f) - i4;
            } else {
                i8 = cVar.f116040e;
            }
            int i10 = i8;
            int f = C2043bi.m5577f(cVar.f116036a);
            cVar.f116051p.setLayerInset(2, f != 1 ? i5 : i7, i10, f == 1 ? i5 : i7, i9);
        }
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.f116033k) {
            if (!this.f116031g.f116053r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f116031g.f116053r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public final void setChecked(boolean z) {
        if (this.f116032h != z) {
            toggle();
        }
    }

    public final void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        C44585c cVar = this.f116031g;
        if (cVar != null) {
            Drawable drawable2 = cVar.f116044i;
            if (cVar.f116036a.isClickable()) {
                drawable = cVar.mo47628c();
            } else {
                drawable = cVar.f116039d;
            }
            cVar.f116044i = drawable;
            Drawable drawable3 = cVar.f116044i;
            if (drawable2 == drawable3) {
                return;
            }
            if (cVar.f116036a.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) cVar.f116036a.getForeground()).setDrawable(drawable3);
            } else {
                cVar.f116036a.setForeground(cVar.mo47629d(drawable3));
            }
        }
    }

    public final void toggle() {
        if (mo47612n() && isEnabled()) {
            this.f116032h = !this.f116032h;
            refreshDrawableState();
            C44585c cVar = this.f116031g;
            Drawable drawable = cVar.f116050o;
            if (drawable != null) {
                Rect bounds = drawable.getBounds();
                int i = bounds.bottom;
                cVar.f116050o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                cVar.f116050o.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            this.f116031g.mo47630e(this.f116032h, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151752), attributeSet, i);
        Drawable drawable;
        this.f116032h = false;
        this.f116033k = true;
        TypedArray a = C44733be.m79295a(getContext(), attributeSet, C44586d.f116061b, i, 2132151752, new int[0]);
        C44585c cVar = new C44585c(this, attributeSet, i);
        this.f116031g = cVar;
        cVar.f116038c.mo48124V(((C1588c) this.f4345f.f4346a).f4352e);
        cVar.f116037b.set(this.f4343c.left, this.f4343c.top, this.f4343c.right, this.f4343c.bottom);
        cVar.mo47632g();
        cVar.f116049n = C44694d.m79230b(cVar.f116036a.getContext(), a, 11);
        if (cVar.f116049n == null) {
            cVar.f116049n = ColorStateList.valueOf(-1);
        }
        cVar.f116043h = a.getDimensionPixelSize(12, 0);
        boolean z = a.getBoolean(0, false);
        cVar.f116054s = z;
        cVar.f116036a.setLongClickable(z);
        cVar.f116047l = C44694d.m79230b(cVar.f116036a.getContext(), a, 6);
        Drawable d = C44694d.m79232d(cVar.f116036a.getContext(), a, 2);
        if (d != null) {
            cVar.f116045j = d.mutate();
            C1929b.m5226g(cVar.f116045j, cVar.f116047l);
            cVar.mo47630e(cVar.f116036a.f116032h, false);
        } else {
            cVar.f116045j = null;
        }
        LayerDrawable layerDrawable = cVar.f116051p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, cVar.f116045j);
        }
        cVar.f116041f = a.getDimensionPixelSize(5, 0);
        cVar.f116040e = a.getDimensionPixelSize(4, 0);
        cVar.f116042g = a.getInteger(3, 8388661);
        cVar.f116046k = C44694d.m79230b(cVar.f116036a.getContext(), a, 7);
        if (cVar.f116046k == null) {
            cVar.f116046k = ColorStateList.valueOf(C44535e.m78719b(cVar.f116036a, R.attr.colorControlHighlight));
        }
        ColorStateList b = C44694d.m79230b(cVar.f116036a.getContext(), a, 1);
        cVar.f116039d.mo48124V(b == null ? ColorStateList.valueOf(0) : b);
        int i2 = C44767a.f116704a;
        Drawable drawable2 = cVar.f116050o;
        if (drawable2 != null) {
            ((RippleDrawable) drawable2).setColor(cVar.f116046k);
        } else {
            C44779j jVar = cVar.f116052q;
        }
        cVar.mo47633h();
        cVar.mo47635j();
        super.setBackgroundDrawable(cVar.mo47629d(cVar.f116038c));
        if (cVar.f116036a.isClickable()) {
            drawable = cVar.mo47628c();
        } else {
            drawable = cVar.f116039d;
        }
        cVar.f116044i = drawable;
        cVar.f116036a.setForeground(cVar.mo47629d(cVar.f116044i));
        a.recycle();
    }
}
