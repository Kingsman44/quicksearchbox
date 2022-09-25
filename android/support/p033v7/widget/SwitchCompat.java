package android.support.p033v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.p039d.C0418a;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.C2139z;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2266i;
import androidx.p111g.p113b.C2267j;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.SwitchCompat */
/* compiled from: PG */
public class SwitchCompat extends CompoundButton {

    /* renamed from: i */
    private static final Property f1877i = new C0728ii(Float.class);

    /* renamed from: j */
    private static final int[] f1878j = {16842912};

    /* renamed from: A */
    private float f1879A;

    /* renamed from: B */
    private VelocityTracker f1880B;

    /* renamed from: C */
    private int f1881C;

    /* renamed from: D */
    private int f1882D;

    /* renamed from: E */
    private int f1883E;

    /* renamed from: F */
    private int f1884F;

    /* renamed from: G */
    private int f1885G;

    /* renamed from: H */
    private int f1886H;

    /* renamed from: I */
    private int f1887I;

    /* renamed from: J */
    private int f1888J;

    /* renamed from: K */
    private boolean f1889K;

    /* renamed from: L */
    private final TextPaint f1890L;

    /* renamed from: M */
    private ColorStateList f1891M;

    /* renamed from: N */
    private Layout f1892N;

    /* renamed from: O */
    private Layout f1893O;

    /* renamed from: P */
    private TransformationMethod f1894P;

    /* renamed from: Q */
    private final C0543bm f1895Q;

    /* renamed from: R */
    private C0510ah f1896R;

    /* renamed from: S */
    private final Rect f1897S;

    /* renamed from: a */
    public ColorStateList f1898a;

    /* renamed from: b */
    public PorterDuff.Mode f1899b;

    /* renamed from: c */
    public boolean f1900c;

    /* renamed from: d */
    public ColorStateList f1901d;

    /* renamed from: e */
    public PorterDuff.Mode f1902e;

    /* renamed from: f */
    public boolean f1903f;

    /* renamed from: g */
    float f1904g;

    /* renamed from: h */
    ObjectAnimator f1905h;

    /* renamed from: k */
    private Drawable f1906k;

    /* renamed from: l */
    private boolean f1907l;

    /* renamed from: m */
    private Drawable f1908m;

    /* renamed from: n */
    private boolean f1909n;

    /* renamed from: o */
    private int f1910o;

    /* renamed from: p */
    private int f1911p;

    /* renamed from: q */
    private int f1912q;

    /* renamed from: r */
    private boolean f1913r;

    /* renamed from: s */
    private CharSequence f1914s;

    /* renamed from: t */
    private CharSequence f1915t;

    /* renamed from: u */
    private CharSequence f1916u;

    /* renamed from: v */
    private CharSequence f1917v;

    /* renamed from: w */
    private boolean f1918w;

    /* renamed from: x */
    private int f1919x;

    /* renamed from: y */
    private int f1920y;

    /* renamed from: z */
    private float f1921z;

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: k */
    private final int m1788k() {
        float f;
        if (C0763jq.m2570b(this)) {
            f = 1.0f - this.f1904g;
        } else {
            f = this.f1904g;
        }
        return (int) ((f * ((float) m1789l())) + 0.5f);
    }

    /* renamed from: l */
    private final int m1789l() {
        Rect rect;
        Drawable drawable = this.f1908m;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1897S;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1906k;
        if (drawable2 != null) {
            rect = C0571cn.m2115b(drawable2);
        } else {
            rect = C0571cn.f2215a;
        }
        return ((((this.f1882D - this.f1884F) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* renamed from: m */
    private final C0510ah m1790m() {
        if (this.f1896R == null) {
            this.f1896R = new C0510ah(this);
        }
        return this.f1896R;
    }

    /* renamed from: n */
    private final Layout m1791n(CharSequence charSequence) {
        TextPaint textPaint = this.f1890L;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: o */
    private final CharSequence m1792o(CharSequence charSequence) {
        C0510ah m = m1790m();
        TransformationMethod transformationMethod = this.f1894P;
        C2267j jVar = m.f2055a;
        C2253a aVar = C2253a.f6344b;
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    /* renamed from: p */
    private final void m1793p() {
        if (((C2266i) this.f1896R.f2055a.f6359a).f6358a.f6357a) {
            C2253a aVar = C2253a.f6344b;
        }
    }

    /* renamed from: q */
    private final boolean m1794q() {
        return this.f1904g > 0.5f;
    }

    /* renamed from: a */
    public final void mo2353a() {
        Drawable drawable = this.f1906k;
        if (drawable == null) {
            return;
        }
        if (this.f1907l || this.f1900c) {
            Drawable mutate = drawable.mutate();
            this.f1906k = mutate;
            if (this.f1907l) {
                C1929b.m5226g(mutate, this.f1898a);
            }
            if (this.f1900c) {
                C1929b.m5227h(this.f1906k, this.f1899b);
            }
            if (this.f1906k.isStateful()) {
                this.f1906k.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo2354b() {
        Drawable drawable = this.f1908m;
        if (drawable == null) {
            return;
        }
        if (this.f1909n || this.f1903f) {
            Drawable mutate = drawable.mutate();
            this.f1908m = mutate;
            if (this.f1909n) {
                C1929b.m5226g(mutate, this.f1901d);
            }
            if (this.f1903f) {
                C1929b.m5227h(this.f1908m, this.f1902e);
            }
            if (this.f1908m.isStateful()) {
                this.f1908m.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public final void mo2355c() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1916u;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            C2043bi.m5594w().mo5186e(this, obj);
        }
    }

    /* renamed from: d */
    public final void mo2356d() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1914s;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            C2043bi.m5594w().mo5186e(this, obj);
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1897S;
        int i3 = this.f1885G;
        int i4 = this.f1886H;
        int i5 = this.f1887I;
        int i6 = this.f1888J;
        int k = m1788k() + i3;
        Drawable drawable = this.f1906k;
        if (drawable != null) {
            rect = C0571cn.m2115b(drawable);
        } else {
            rect = C0571cn.f2215a;
        }
        Drawable drawable2 = this.f1908m;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            k += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.f1908m.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1908m.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1906k;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = k - rect2.left;
            int i8 = k + this.f1884F + rect2.right;
            this.f1906k.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1929b.m5224e(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1906k;
        if (drawable != null) {
            C1929b.m5223d(drawable, f, f2);
        }
        Drawable drawable2 = this.f1908m;
        if (drawable2 != null) {
            C1929b.m5223d(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1906k;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1908m;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo2360e(Typeface typeface) {
        if ((this.f1890L.getTypeface() != null && !this.f1890L.getTypeface().equals(typeface)) || (this.f1890L.getTypeface() == null && typeface != null)) {
            this.f1890L.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: f */
    public final void mo2361f(CharSequence charSequence) {
        this.f1916u = charSequence;
        this.f1917v = m1792o(charSequence);
        this.f1893O = null;
        if (this.f1918w) {
            m1793p();
        }
    }

    /* renamed from: g */
    public final void mo2362g(CharSequence charSequence) {
        this.f1914s = charSequence;
        this.f1915t = m1792o(charSequence);
        this.f1892N = null;
        if (this.f1918w) {
            m1793p();
        }
    }

    public final int getCompoundPaddingLeft() {
        if (!C0763jq.m2570b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1882D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1912q : compoundPaddingLeft;
    }

    public final int getCompoundPaddingRight() {
        if (C0763jq.m2570b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1882D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1912q : compoundPaddingRight;
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        C2139z.m5937b(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    /* renamed from: h */
    public final void mo2366h(ColorStateList colorStateList) {
        this.f1898a = colorStateList;
        this.f1907l = true;
        mo2353a();
    }

    /* renamed from: i */
    public final void mo2367i(ColorStateList colorStateList) {
        this.f1901d = colorStateList;
        this.f1909n = true;
        mo2354b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo2368j() {
        this.f1889K = false;
        invalidate();
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1906k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1908m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1905h;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1905h.end();
            this.f1905h = null;
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1878j);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Layout layout;
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1897S;
        Drawable drawable = this.f1908m;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1886H;
        int i3 = this.f1888J;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1906k;
        if (drawable != null) {
            if (!this.f1913r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b = C0571cn.m2115b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (m1794q()) {
            layout = this.f1892N;
        } else {
            layout = this.f1893O;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1891M;
            if (colorStateList != null) {
                this.f1890L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1890L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f1914s;
            } else {
                charSequence = this.f1916u;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f1906k != null) {
            Rect rect = this.f1897S;
            Drawable drawable = this.f1908m;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = C0571cn.m2115b(this.f1906k);
            i5 = Math.max(0, b.left - rect.left);
            i10 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0763jq.m2570b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1882D + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.f1882D) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i11 = this.f1883E;
            i9 = (((paddingTop + height) - paddingBottom) / 2) - (i11 / 2);
            i8 = i9 + i11;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1883E + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1883E;
        }
        this.f1885G = i7;
        this.f1886H = i9;
        this.f1888J = i8;
        this.f1887I = i6;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f1918w) {
            if (this.f1892N == null) {
                this.f1892N = m1791n(this.f1915t);
            }
            if (this.f1893O == null) {
                this.f1893O = m1791n(this.f1917v);
            }
        }
        Rect rect = this.f1897S;
        Drawable drawable = this.f1906k;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1906k.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1906k.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f1918w) {
            int max = Math.max(this.f1892N.getWidth(), this.f1893O.getWidth());
            int i8 = this.f1910o;
            i5 = max + i8 + i8;
        } else {
            i5 = 0;
        }
        this.f1884F = Math.max(i5, i4);
        Drawable drawable2 = this.f1908m;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f1908m.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f1906k;
        if (drawable3 != null) {
            Rect b = C0571cn.m2115b(drawable3);
            i9 = Math.max(i9, b.left);
            i10 = Math.max(i10, b.right);
        }
        if (this.f1889K) {
            int i11 = this.f1911p;
            int i12 = this.f1884F;
            i6 = Math.max(i11, i12 + i12 + i9 + i10);
        } else {
            i6 = this.f1911p;
        }
        int max2 = Math.max(i7, i3);
        this.f1882D = i6;
        this.f1883E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f1914s;
        } else {
            charSequence = this.f1916u;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 != 3) goto L_0x0154;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.f1880B
            r0.addMovement(r10)
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x0100
            r2 = 3
            r3 = 2
            r4 = 0
            if (r0 == r1) goto L_0x0092
            if (r0 == r3) goto L_0x0017
            if (r0 == r2) goto L_0x0092
            goto L_0x0154
        L_0x0017:
            int r0 = r9.f1919x
            if (r0 == r1) goto L_0x005e
            if (r0 == r3) goto L_0x001f
            goto L_0x0154
        L_0x001f:
            float r10 = r10.getX()
            int r0 = r9.m1789l()
            float r2 = r9.f1921z
            float r2 = r10 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003b
        L_0x0039:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003b:
            boolean r0 = android.support.p033v7.widget.C0763jq.m2570b(r9)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r9.f1904g
            float r2 = r2 + r0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004a
            goto L_0x0052
        L_0x004a:
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0052
        L_0x0051:
            r4 = r2
        L_0x0052:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            r9.f1921z = r10
            r9.f1904g = r4
            r9.invalidate()
        L_0x005d:
            return r1
        L_0x005e:
            float r0 = r10.getX()
            float r2 = r10.getY()
            float r4 = r9.f1921z
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.f1920y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0084
            float r4 = r9.f1879A
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.f1920y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0154
        L_0x0084:
            r9.f1919x = r3
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r1)
            r9.f1921z = r0
            r9.f1879A = r2
            return r1
        L_0x0092:
            int r0 = r9.f1919x
            r5 = 0
            if (r0 != r3) goto L_0x00f8
            r9.f1919x = r5
            int r0 = r10.getAction()
            if (r0 != r1) goto L_0x00a7
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            boolean r3 = r9.isChecked()
            if (r0 == 0) goto L_0x00de
            android.view.VelocityTracker r0 = r9.f1880B
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r9.f1880B
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r9.f1881C
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d9
            boolean r6 = android.support.p033v7.widget.C0763jq.m2570b(r9)
            if (r6 == 0) goto L_0x00d1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
            goto L_0x00d5
        L_0x00d1:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
        L_0x00d5:
            r0 = 1
            goto L_0x00df
        L_0x00d7:
            r0 = 0
            goto L_0x00df
        L_0x00d9:
            boolean r0 = r9.m1794q()
            goto L_0x00df
        L_0x00de:
            r0 = r3
        L_0x00df:
            if (r0 == r3) goto L_0x00e4
            r9.playSoundEffect(r5)
        L_0x00e4:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r2)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r1
        L_0x00f8:
            r9.f1919x = r5
            android.view.VelocityTracker r0 = r9.f1880B
            r0.clear()
            goto L_0x0154
        L_0x0100:
            float r0 = r10.getX()
            float r2 = r10.getY()
            boolean r3 = r9.isEnabled()
            if (r3 == 0) goto L_0x0154
            android.graphics.drawable.Drawable r3 = r9.f1906k
            if (r3 != 0) goto L_0x0113
            goto L_0x0154
        L_0x0113:
            int r3 = r9.m1788k()
            android.graphics.drawable.Drawable r4 = r9.f1906k
            android.graphics.Rect r5 = r9.f1897S
            r4.getPadding(r5)
            int r4 = r9.f1886H
            int r5 = r9.f1920y
            int r4 = r4 - r5
            int r6 = r9.f1885G
            int r6 = r6 + r3
            int r6 = r6 - r5
            int r3 = r9.f1884F
            android.graphics.Rect r5 = r9.f1897S
            int r5 = r5.left
            android.graphics.Rect r7 = r9.f1897S
            int r7 = r7.right
            int r8 = r9.f1920y
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r3 = r3 + r7
            int r3 = r3 + r8
            int r5 = r9.f1888J
            int r5 = r5 + r8
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0154
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0154
            float r3 = (float) r4
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0154
            float r3 = (float) r5
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0154
            r9.f1919x = r1
            r9.f1921z = r0
            r9.f1879A = r2
        L_0x0154:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C2267j jVar = m1790m().f2055a;
        C2253a aVar = C2253a.f6344b;
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            mo2356d();
        } else {
            mo2355c();
        }
        float f = 0.0f;
        if (getWindowToken() == null || !C2043bi.m5570ax(this)) {
            ObjectAnimator objectAnimator = this.f1905h;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (true == isChecked) {
                f = 1.0f;
            }
            this.f1904g = f;
            invalidate();
            return;
        }
        if (true == isChecked) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1877i, new float[]{f});
        this.f1905h = ofFloat;
        ofFloat.setDuration(250);
        C0729ij.m2463a(this.f1905h, true);
        this.f1905h.start();
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        C2267j jVar = m1790m().f2055a;
        C2253a aVar = C2253a.f6344b;
        super.setFilters(inputFilterArr);
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1906k || drawable == this.f1908m;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface typeface2;
        this.f1898a = null;
        this.f1899b = null;
        this.f1907l = false;
        this.f1900c = false;
        this.f1901d = null;
        this.f1902e = null;
        this.f1909n = false;
        this.f1903f = false;
        this.f1880B = VelocityTracker.obtain();
        boolean z = true;
        this.f1889K = true;
        this.f1897S = new Rect();
        C0730ik.m2467d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1890L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0735ip f = C0735ip.m2473f(context, attributeSet, C0338a.f1088x, i, 0);
        C2043bi.m5525S(this, context, C0338a.f1088x, attributeSet, f.f2596b, i, 0);
        Drawable b = f.mo3246b(2);
        this.f1906k = b;
        if (b != null) {
            b.setCallback(this);
        }
        Drawable b2 = f.mo3246b(11);
        this.f1908m = b2;
        if (b2 != null) {
            b2.setCallback(this);
        }
        mo2362g(f.f2596b.getText(0));
        mo2361f(f.f2596b.getText(1));
        this.f1918w = f.f2596b.getBoolean(3, true);
        this.f1910o = f.f2596b.getDimensionPixelSize(8, 0);
        this.f1911p = f.f2596b.getDimensionPixelSize(5, 0);
        this.f1912q = f.f2596b.getDimensionPixelSize(6, 0);
        this.f1913r = f.f2596b.getBoolean(4, false);
        ColorStateList a = f.mo3245a(9);
        if (a != null) {
            this.f1898a = a;
            this.f1907l = true;
        }
        PorterDuff.Mode a2 = C0571cn.m2114a(f.f2596b.getInt(10, -1), (PorterDuff.Mode) null);
        if (this.f1899b != a2) {
            this.f1899b = a2;
            this.f1900c = true;
        }
        if (this.f1907l || this.f1900c) {
            mo2353a();
        }
        ColorStateList a3 = f.mo3245a(12);
        if (a3 != null) {
            this.f1901d = a3;
            this.f1909n = true;
        }
        PorterDuff.Mode a4 = C0571cn.m2114a(f.f2596b.getInt(13, -1), (PorterDuff.Mode) null);
        if (this.f1902e != a4) {
            this.f1902e = a4;
            this.f1903f = true;
        }
        if (this.f1909n || this.f1903f) {
            mo2354b();
        }
        int resourceId = f.f2596b.getResourceId(7, 0);
        if (resourceId != 0) {
            C0735ip d = C0735ip.m2471d(context, resourceId, C0338a.f1089y);
            ColorStateList a5 = d.mo3245a(3);
            if (a5 != null) {
                this.f1891M = a5;
            } else {
                this.f1891M = getTextColors();
            }
            int dimensionPixelSize = d.f2596b.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = (float) dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = d.f2596b.getInt(1, -1);
            int i3 = d.f2596b.getInt(2, -1);
            if (i2 != 1) {
                typeface = i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF;
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            float f3 = 0.0f;
            if (i3 > 0) {
                if (typeface == null) {
                    typeface2 = Typeface.defaultFromStyle(i3);
                } else {
                    typeface2 = Typeface.create(typeface, i3);
                }
                mo2360e(typeface2);
                int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & i3;
                textPaint.setFakeBoldText(1 != (style & 1) ? false : z);
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : f3);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                mo2360e(typeface);
            }
            if (d.f2596b.getBoolean(14, false)) {
                this.f1894P = new C0418a(getContext());
            } else {
                this.f1894P = null;
            }
            mo2362g(this.f1914s);
            mo2361f(this.f1916u);
            d.f2596b.recycle();
        }
        C0543bm bmVar = new C0543bm(this);
        this.f1895Q = bmVar;
        bmVar.mo2570b(attributeSet, i);
        f.f2596b.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1920y = viewConfiguration.getScaledTouchSlop();
        this.f1881C = viewConfiguration.getScaledMinimumFlingVelocity();
        m1790m().mo2496a(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
