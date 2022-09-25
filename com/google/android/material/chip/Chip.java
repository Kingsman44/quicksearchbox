package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.p033v7.widget.AppCompatCheckBox;
import android.support.p033v7.widget.C0678gm;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.C1882h;
import androidx.core.graphics.drawable.C1930c;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44701a;
import com.google.android.material.internal.C44729ba;
import com.google.android.material.internal.C44757q;
import com.google.android.material.p3512i.C44698h;
import com.google.android.material.p3512i.C44699i;
import com.google.android.material.p3513j.C44767a;
import com.google.android.material.p3515l.C44770aa;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.p3515l.C44785p;

/* compiled from: PG */
public class Chip extends AppCompatCheckBox implements C44595e, C44770aa, C44757q {

    /* renamed from: a */
    private static final int f116089a = 2132151754;

    /* renamed from: b */
    private static final int[] f116090b = {16842913};

    /* renamed from: c */
    public static final Rect f116091c = new Rect();

    /* renamed from: j */
    private static final int[] f116092j = {16842911};

    /* renamed from: d */
    public C44596f f116093d;

    /* renamed from: e */
    public View.OnClickListener f116094e;

    /* renamed from: f */
    public CompoundButton.OnCheckedChangeListener f116095f;

    /* renamed from: g */
    public boolean f116096g;

    /* renamed from: h */
    public CharSequence f116097h;

    /* renamed from: i */
    public C44701a f116098i;

    /* renamed from: k */
    private InsetDrawable f116099k;

    /* renamed from: l */
    private RippleDrawable f116100l;

    /* renamed from: m */
    private boolean f116101m;

    /* renamed from: n */
    private boolean f116102n;

    /* renamed from: o */
    private boolean f116103o;

    /* renamed from: p */
    private boolean f116104p;

    /* renamed from: q */
    private int f116105q;

    /* renamed from: r */
    private int f116106r;

    /* renamed from: s */
    private final C44594d f116107s;

    /* renamed from: t */
    private boolean f116108t;

    /* renamed from: u */
    private final Rect f116109u;

    /* renamed from: v */
    private final RectF f116110v;

    /* renamed from: w */
    private final C44699i f116111w;

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: L */
    private final void m78929L() {
        this.f116100l = new RippleDrawable(C44767a.m79372b(this.f116093d.f116160f), mo47681k(), (Drawable) null);
        boolean z = this.f116093d.f116178x;
        C2043bi.m5530X(this, this.f116100l);
        m78930M();
    }

    /* renamed from: M */
    private final void m78930M() {
        C44596f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f116093d) != null) {
            int b = (int) (fVar.f116175u + fVar.f116172r + fVar.mo47750b());
            int a = (int) (fVar.f116170p + fVar.f116171q + fVar.mo47749a());
            if (this.f116099k != null) {
                Rect rect = new Rect();
                this.f116099k.getPadding(rect);
                a += rect.left;
                b += rect.right;
            }
            C2043bi.m5556aj(this, a, getPaddingTop(), b, getPaddingBottom());
        }
    }

    /* renamed from: N */
    private final void m78931N() {
        TextPaint paint = getPaint();
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        C44596f fVar2 = this.f116093d;
        C44698h hVar = fVar2 != null ? fVar2.f116177w.f116593e : null;
        if (hVar != null) {
            hVar.mo47995d(getContext(), paint, this.f116111w);
        }
    }

    /* renamed from: d */
    private final void m78932d() {
        if (this.f116099k != null) {
            this.f116099k = null;
            setMinWidth(0);
            C44596f fVar = this.f116093d;
            setMinHeight((int) (fVar != null ? fVar.f116157c : 0.0f));
            int i = C44767a.f116704a;
            m78929L();
        }
    }

    /* renamed from: e */
    private final void m78933e(boolean z) {
        if (this.f116103o != z) {
            this.f116103o = z;
            refreshDrawableState();
        }
    }

    /* renamed from: f */
    private final void m78934f(boolean z) {
        if (this.f116102n != z) {
            this.f116102n = z;
            refreshDrawableState();
        }
    }

    /* renamed from: A */
    public final void mo47661A(float f) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47790z(f);
        }
    }

    /* renamed from: B */
    public final void mo47662B(float f) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47740A(f);
        }
    }

    /* renamed from: C */
    public final void mo47663C(float f) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47744E(f);
        }
    }

    /* renamed from: D */
    public final void mo47664D(float f) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47745F(f);
        }
    }

    /* renamed from: E */
    public final void mo47665E() {
        if (!mo47666F() || !mo47668H() || this.f116094e == null) {
            C2043bi.m5526T(this, (C2061c) null);
            this.f116108t = false;
            return;
        }
        C2043bi.m5526T(this, this.f116107s);
        this.f116108t = true;
    }

    /* renamed from: F */
    public final boolean mo47666F() {
        C44596f fVar = this.f116093d;
        return (fVar == null || fVar.mo47753e() == null) ? false : true;
    }

    /* renamed from: G */
    public final boolean mo47667G() {
        C44596f fVar = this.f116093d;
        return fVar != null && fVar.f116167m;
    }

    /* renamed from: H */
    public final boolean mo47668H() {
        C44596f fVar = this.f116093d;
        return fVar != null && fVar.f116162h;
    }

    /* renamed from: I */
    public final boolean mo47669I() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f116094e;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f116108t) {
            this.f116107s.sendEventForVirtualView$ar$ds(1, 1);
        }
        return z;
    }

    /* renamed from: J */
    public final void mo47670J(C44701a aVar) {
        this.f116098i = aVar;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f116108t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return this.f116107s.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f116108t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f116107s.dispatchKeyEvent(keyEvent) || this.f116107s.mKeyboardFocusedVirtualViewId == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C44596f fVar = this.f116093d;
        if (fVar != null && C44596f.m78972H(fVar.f116163i)) {
            C44596f fVar2 = this.f116093d;
            int isEnabled = isEnabled();
            if (this.f116096g) {
                isEnabled++;
            }
            if (this.f116103o) {
                isEnabled++;
            }
            if (this.f116102n) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            int i = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f116096g) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f116103o) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f116102n) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (fVar2.mo47747I(iArr)) {
                invalidate();
            }
        }
    }

    /* renamed from: g */
    public final ColorStateList mo47674g() {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            return fVar.f116156b;
        }
        return null;
    }

    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f116097h)) {
            return this.f116097h;
        }
        if (mo47667G()) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f116114c.f116586c) {
                return "android.widget.Button";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public final TextUtils.TruncateAt getEllipsize() {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            return fVar.f116179y;
        }
        return null;
    }

    /* renamed from: h */
    public final ColorStateList mo47678h() {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            return fVar.f116159e;
        }
        return null;
    }

    /* renamed from: i */
    public final Rect mo47679i() {
        RectF j = mo47680j();
        this.f116109u.set((int) j.left, (int) j.top, (int) j.right, (int) j.bottom);
        return this.f116109u;
    }

    /* renamed from: j */
    public final RectF mo47680j() {
        this.f116110v.setEmpty();
        if (mo47666F() && this.f116094e != null) {
            C44596f fVar = this.f116093d;
            RectF rectF = this.f116110v;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.mo47748J()) {
                float f = fVar.f116175u + fVar.f116174t + fVar.f116165k + fVar.f116173s + fVar.f116172r;
                if (C1930c.m5229a(fVar) == 0) {
                    rectF.right = (float) bounds.right;
                    rectF.left = rectF.right - f;
                } else {
                    rectF.left = (float) bounds.left;
                    rectF.right = ((float) bounds.left) + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.f116110v;
    }

    /* renamed from: k */
    public final Drawable mo47681k() {
        InsetDrawable insetDrawable = this.f116099k;
        return insetDrawable == null ? this.f116093d : insetDrawable;
    }

    /* renamed from: l */
    public final void mo47555l(C44785p pVar) {
        this.f116093d.mo47555l(pVar);
    }

    /* renamed from: m */
    public final void mo47682m() {
        mo47671K(this.f116106r);
        requestLayout();
        invalidateOutline();
    }

    /* renamed from: n */
    public final void mo47683n(boolean z) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47762h(z);
        }
    }

    /* renamed from: o */
    public final void mo47684o(ColorStateList colorStateList) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47766j(colorStateList);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79413d(this, this.f116093d);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f116090b);
        }
        if (mo47667G()) {
            mergeDrawableStates(onCreateDrawableState, f116092j);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f116108t) {
            this.f116107s.onFocusChanged(z, i, rect);
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            m78933e(mo47680j().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            m78933e(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(mo47667G());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C1991k kVar = new C1991k(accessibilityNodeInfo);
            if (chipGroup.f116687f) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i3);
                    if ((childAt instanceof Chip) && chipGroup.mo47728c(i3)) {
                        if (((Chip) childAt) == this) {
                            i = i4;
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
            }
            i = -1;
            Object tag = getTag(R.id.row_index_key);
            if (!(tag instanceof Integer)) {
                i2 = -1;
            } else {
                i2 = ((Integer) tag).intValue();
            }
            kVar.mo5155d(C1990j.m5333a(i2, 1, i, 1, false, isChecked()));
        }
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!mo47680j().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f116105q != i) {
            this.f116105q = i;
            m78930M();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r0 != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.mo47680j()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 == r3) goto L_0x002d
            r4 = 2
            if (r0 == r4) goto L_0x0023
            r1 = 3
            if (r0 == r1) goto L_0x0021
            goto L_0x0041
        L_0x0021:
            r0 = 0
            goto L_0x0035
        L_0x0023:
            boolean r0 = r5.f116102n
            if (r0 == 0) goto L_0x0041
            if (r1 != 0) goto L_0x0047
            r5.m78934f(r2)
            return r3
        L_0x002d:
            boolean r0 = r5.f116102n
            if (r0 == 0) goto L_0x0021
            r5.mo47669I()
            r0 = 1
        L_0x0035:
            r5.m78934f(r2)
            if (r0 != 0) goto L_0x0047
            goto L_0x0041
        L_0x003b:
            if (r1 == 0) goto L_0x0041
            r5.m78934f(r3)
            goto L_0x0047
        L_0x0041:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0048
        L_0x0047:
            return r3
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo47693p(int i) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47766j(C1882h.m5138d(fVar.f116176v, i));
        }
    }

    /* renamed from: q */
    public final void mo47694q(Drawable drawable) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47768m(drawable);
        }
    }

    /* renamed from: r */
    public final void mo47695r(float f) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47769n(f);
        }
    }

    /* renamed from: s */
    public final void mo47696s(ColorStateList colorStateList) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47770o(colorStateList);
        }
    }

    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setChecked(boolean z) {
        C44596f fVar = this.f116093d;
        if (fVar == null) {
            this.f116101m = z;
        } else if (fVar.f116167m) {
            super.setChecked(z);
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo48123U(f);
        }
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f116093d != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C44596f fVar = this.f116093d;
                if (fVar != null) {
                    fVar.f116179y = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    public final void setLayoutDirection(int i) {
        if (this.f116093d != null) {
            super.setLayoutDirection(i);
        }
    }

    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.f116124A = i;
        }
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f116095f = onCheckedChangeListener;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(true != fVar.f116180z ? charSequence : null, bufferType);
            C44596f fVar2 = this.f116093d;
            if (fVar2 != null) {
                fVar2.mo47741B(charSequence);
            }
        }
    }

    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47743D(i);
        }
        m78931N();
    }

    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C44729ba baVar = fVar.f116177w;
            C44698h hVar = baVar.f116593e;
            if (hVar != null) {
                hVar.f116504k = applyDimension;
                baVar.f116589a.setTextSize(applyDimension);
                fVar.mo47755g();
                fVar.invalidateSelf();
            }
        }
        m78931N();
    }

    /* renamed from: t */
    public final void mo47719t(boolean z) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47773p(z);
        }
    }

    /* renamed from: u */
    public final void mo47720u(float f) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47774q(f);
        }
    }

    /* renamed from: v */
    public final void mo47721v(ColorStateList colorStateList) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47775r(colorStateList);
        }
    }

    /* renamed from: w */
    public final void mo47722w(int i) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47775r(C1882h.m5138d(fVar.f116176v, i));
        }
    }

    /* renamed from: x */
    public final void mo47723x(Drawable drawable) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47783t(drawable);
        }
        mo47665E();
    }

    /* renamed from: y */
    public final void mo47724y(float f) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47784u(f);
        }
    }

    /* renamed from: z */
    public final void mo47725z(int i) {
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47783t(C0678gm.m2375e().mo3100c(fVar.f116176v, i));
        }
        mo47665E();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f116108t) {
            C44594d dVar = this.f116107s;
            if (dVar.mKeyboardFocusedVirtualViewId == 1 || dVar.mAccessibilityFocusedVirtualViewId == 1) {
                rect.set(mo47679i());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public final void setBackground(Drawable drawable) {
        if (drawable == mo47681k() || drawable == this.f116100l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == mo47681k() || drawable == this.f116100l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public final void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(true);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013c, code lost:
        r4 = r1.getResourceId(0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x032e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = f116089a
            r1 = r18
            android.content.Context r1 = com.google.android.material.theme.p3518a.C44965a.m79936a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f116109u = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f116110v = r1
            com.google.android.material.chip.b r1 = new com.google.android.material.chip.b
            r1.<init>(r0)
            r0.f116111w = r1
            android.content.Context r10 = r17.getContext()
            r11 = 8388627(0x800013, float:1.175497E-38)
            r12 = 1
            if (r7 != 0) goto L_0x0031
            goto L_0x0091
        L_0x0031:
            java.lang.String r1 = "background"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r7.getAttributeValue(r2, r1)
            java.lang.String r3 = "Chip"
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r1)
        L_0x0042:
            java.lang.String r1 = "drawableLeft"
            java.lang.String r1 = r7.getAttributeValue(r2, r1)
            if (r1 != 0) goto L_0x03ca
            java.lang.String r1 = "drawableStart"
            java.lang.String r1 = r7.getAttributeValue(r2, r1)
            if (r1 != 0) goto L_0x03c2
            java.lang.String r1 = "drawableEnd"
            java.lang.String r1 = r7.getAttributeValue(r2, r1)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r1 != 0) goto L_0x03bc
            java.lang.String r1 = "drawableRight"
            java.lang.String r1 = r7.getAttributeValue(r2, r1)
            if (r1 != 0) goto L_0x03b6
            java.lang.String r1 = "singleLine"
            boolean r1 = r7.getAttributeBooleanValue(r2, r1, r12)
            if (r1 == 0) goto L_0x03ae
            java.lang.String r1 = "lines"
            int r1 = r7.getAttributeIntValue(r2, r1, r12)
            if (r1 != r12) goto L_0x03ae
            java.lang.String r1 = "minLines"
            int r1 = r7.getAttributeIntValue(r2, r1, r12)
            if (r1 != r12) goto L_0x03ae
            java.lang.String r1 = "maxLines"
            int r1 = r7.getAttributeIntValue(r2, r1, r12)
            if (r1 != r12) goto L_0x03ae
            java.lang.String r1 = "gravity"
            int r1 = r7.getAttributeIntValue(r2, r1, r11)
            if (r1 == r11) goto L_0x0091
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0091:
            com.google.android.material.chip.f r13 = new com.google.android.material.chip.f
            r13.<init>(r10, r7, r8, r9)
            android.content.Context r1 = r13.f116176v
            int[] r3 = com.google.android.material.chip.C44602l.f116186a
            r14 = 0
            int[] r6 = new int[r14]
            r2 = r19
            r4 = r20
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C44733be.m79295a(r1, r2, r3, r4, r5, r6)
            r15 = 37
            boolean r2 = r1.hasValue(r15)
            r13.f116125B = r2
            android.content.Context r2 = r13.f116176v
            r3 = 24
            android.content.res.ColorStateList r2 = com.google.android.material.p3512i.C44694d.m79230b(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.f116142a
            if (r3 == r2) goto L_0x00c3
            r13.f116142a = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00c3:
            android.content.Context r2 = r13.f116176v
            r3 = 11
            android.content.res.ColorStateList r2 = com.google.android.material.p3512i.C44694d.m79230b(r2, r1, r3)
            r13.mo47766j(r2)
            r2 = 19
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            float r4 = r13.f116157c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00e3
            r13.f116157c = r2
            r13.invalidateSelf()
            r13.mo47755g()
        L_0x00e3:
            r2 = 12
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0102
            float r2 = r1.getDimension(r2, r3)
            float r4 = r13.f116158d
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0102
            r13.f116158d = r2
            com.google.android.material.l.i r4 = r13.f116741C
            com.google.android.material.l.p r4 = r4.f116718a
            com.google.android.material.l.p r2 = r4.mo48151b(r2)
            r13.mo47555l(r2)
        L_0x0102:
            android.content.Context r2 = r13.f116176v
            r4 = 22
            android.content.res.ColorStateList r2 = com.google.android.material.p3512i.C44694d.m79230b(r2, r1, r4)
            r13.mo47775r(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r3)
            r13.mo47776s(r2)
            android.content.Context r2 = r13.f116176v
            r4 = 36
            android.content.res.ColorStateList r2 = com.google.android.material.p3512i.C44694d.m79230b(r2, r1, r4)
            android.content.res.ColorStateList r4 = r13.f116160f
            if (r4 == r2) goto L_0x012b
            r13.f116160f = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x012b:
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            r13.mo47741B(r2)
            android.content.Context r2 = r13.f116176v
            boolean r4 = r1.hasValue(r14)
            r6 = 0
            if (r4 == 0) goto L_0x0148
            int r4 = r1.getResourceId(r14, r14)
            if (r4 == 0) goto L_0x0148
            com.google.android.material.i.h r5 = new com.google.android.material.i.h
            r5.<init>(r2, r4)
            goto L_0x0149
        L_0x0148:
            r5 = r6
        L_0x0149:
            float r2 = r5.f116504k
            float r2 = r1.getDimension(r12, r2)
            r5.f116504k = r2
            r13.mo47742C(r5)
            r2 = 3
            int r4 = r1.getInt(r2, r14)
            if (r4 == r12) goto L_0x0167
            r5 = 2
            if (r4 == r5) goto L_0x0164
            if (r4 == r2) goto L_0x0161
            goto L_0x016b
        L_0x0161:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L_0x0169
        L_0x0164:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0169
        L_0x0167:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L_0x0169:
            r13.f116179y = r2
        L_0x016b:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r14)
            r13.mo47773p(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0191
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x0191
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x0191
            r4 = 15
            boolean r4 = r1.getBoolean(r4, r14)
            r13.mo47773p(r4)
        L_0x0191:
            android.content.Context r4 = r13.f116176v
            r5 = 14
            android.graphics.drawable.Drawable r4 = com.google.android.material.p3512i.C44694d.m79232d(r4, r1, r5)
            r13.mo47768m(r4)
            r4 = 17
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x01ad
            android.content.Context r5 = r13.f116176v
            android.content.res.ColorStateList r4 = com.google.android.material.p3512i.C44694d.m79230b(r5, r1, r4)
            r13.mo47770o(r4)
        L_0x01ad:
            r4 = 16
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getDimension(r4, r5)
            r13.mo47769n(r4)
            r4 = 31
            boolean r4 = r1.getBoolean(r4, r14)
            r13.mo47788x(r4)
            if (r7 == 0) goto L_0x01dc
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01dc
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01dc
            r4 = 26
            boolean r4 = r1.getBoolean(r4, r14)
            r13.mo47788x(r4)
        L_0x01dc:
            android.content.Context r4 = r13.f116176v
            r5 = 25
            android.graphics.drawable.Drawable r4 = com.google.android.material.p3512i.C44694d.m79232d(r4, r1, r5)
            r13.mo47783t(r4)
            android.content.Context r4 = r13.f116176v
            r5 = 30
            android.content.res.ColorStateList r4 = com.google.android.material.p3512i.C44694d.m79230b(r4, r1, r5)
            android.content.res.ColorStateList r5 = r13.f116164j
            if (r5 == r4) goto L_0x0207
            r13.f116164j = r4
            boolean r5 = r13.mo47748J()
            if (r5 == 0) goto L_0x0200
            android.graphics.drawable.Drawable r5 = r13.f116163i
            androidx.core.graphics.drawable.C1929b.m5226g(r5, r4)
        L_0x0200:
            int[] r4 = r13.getState()
            r13.onStateChange(r4)
        L_0x0207:
            r4 = 28
            float r4 = r1.getDimension(r4, r3)
            r13.mo47786v(r4)
            r4 = 6
            boolean r4 = r1.getBoolean(r4, r14)
            r13.mo47762h(r4)
            r4 = 10
            boolean r4 = r1.getBoolean(r4, r14)
            r13.mo47763i(r4)
            if (r7 == 0) goto L_0x023c
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x023c
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x023c
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r14)
            r13.mo47763i(r2)
        L_0x023c:
            android.content.Context r2 = r13.f116176v
            r4 = 7
            android.graphics.drawable.Drawable r2 = com.google.android.material.p3512i.C44694d.m79232d(r2, r1, r4)
            android.graphics.drawable.Drawable r4 = r13.f116168n
            if (r4 == r2) goto L_0x0265
            float r4 = r13.mo47749a()
            r13.f116168n = r2
            float r2 = r13.mo47749a()
            android.graphics.drawable.Drawable r5 = r13.f116168n
            com.google.android.material.chip.C44596f.m78973K(r5)
            android.graphics.drawable.Drawable r5 = r13.f116168n
            r13.mo47754f(r5)
            r13.invalidateSelf()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0265
            r13.mo47755g()
        L_0x0265:
            r2 = 9
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x028b
            android.content.Context r4 = r13.f116176v
            android.content.res.ColorStateList r2 = com.google.android.material.p3512i.C44694d.m79230b(r4, r1, r2)
            android.content.res.ColorStateList r4 = r13.f116169o
            if (r4 == r2) goto L_0x028b
            r13.f116169o = r2
            boolean r4 = r13.mo47746G()
            if (r4 == 0) goto L_0x0284
            android.graphics.drawable.Drawable r4 = r13.f116168n
            androidx.core.graphics.drawable.C1929b.m5226g(r4, r2)
        L_0x0284:
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x028b:
            android.content.Context r2 = r13.f116176v
            r4 = 39
            com.google.android.material.p3504a.C44502g.m78603b(r2, r1, r4)
            android.content.Context r2 = r13.f116176v
            r4 = 33
            com.google.android.material.p3504a.C44502g.m78603b(r2, r1, r4)
            r2 = 21
            float r2 = r1.getDimension(r2, r3)
            r13.mo47774q(r2)
            r2 = 35
            float r2 = r1.getDimension(r2, r3)
            r13.mo47740A(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r3)
            r13.mo47790z(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r3)
            r13.mo47745F(r2)
            r2 = 40
            float r2 = r1.getDimension(r2, r3)
            r13.mo47744E(r2)
            r2 = 29
            float r2 = r1.getDimension(r2, r3)
            r13.mo47787w(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r3)
            r13.mo47784u(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r3)
            r13.mo47767k(r2)
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r13.f116124A = r2
            r1.recycle()
            int[] r3 = com.google.android.material.chip.C44602l.f116186a
            int[] r5 = new int[r14]
            r1 = r10
            r2 = r19
            r4 = r20
            r16 = r5
            r5 = r9
            r11 = r6
            r6 = r16
            android.content.res.TypedArray r1 = com.google.android.material.internal.C44733be.m79295a(r1, r2, r3, r4, r5, r6)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r14)
            r0.f116104p = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = com.google.android.material.internal.C44741bm.m79308a(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f116106r = r2
            r1.recycle()
            com.google.android.material.chip.f r1 = r0.f116093d
            if (r1 == r13) goto L_0x033f
            if (r1 == 0) goto L_0x0333
            r1.mo47789y(r11)
        L_0x0333:
            r0.f116093d = r13
            r13.f116180z = r14
            r13.mo47789y(r0)
            int r1 = r0.f116106r
            r0.mo47671K(r1)
        L_0x033f:
            float r1 = androidx.core.p098j.C2043bi.m5533a(r17)
            r13.mo48123U(r1)
            int[] r3 = com.google.android.material.chip.C44602l.f116186a
            int[] r6 = new int[r14]
            r1 = r10
            r2 = r19
            r4 = r20
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C44733be.m79295a(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r15)
            r1.recycle()
            com.google.android.material.chip.d r1 = new com.google.android.material.chip.d
            r1.<init>(r0, r0)
            r0.f116107s = r1
            r17.mo47665E()
            if (r2 != 0) goto L_0x036f
            com.google.android.material.chip.c r1 = new com.google.android.material.chip.c
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x036f:
            boolean r1 = r0.f116101m
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.f116161g
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.f116179y
            r0.setEllipsize(r1)
            r17.m78931N()
            com.google.android.material.chip.f r1 = r0.f116093d
            boolean r1 = r1.f116180z
            if (r1 != 0) goto L_0x038d
            super.setLines(r12)
            r0.setHorizontallyScrolling(r12)
        L_0x038d:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.m78930M()
            boolean r1 = r0.f116104p
            if (r1 == 0) goto L_0x039f
            int r1 = r0.f116106r
            r0.setMinHeight(r1)
        L_0x039f:
            int r1 = androidx.core.p098j.C2043bi.m5577f(r17)
            r0.f116105q = r1
            com.google.android.material.chip.a r1 = new com.google.android.material.chip.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x03ae:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x03b6:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03bc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03c2:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03ca:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: K */
    public final void mo47671K(int i) {
        this.f116106r = i;
        if (this.f116104p) {
            int max = Math.max(0, i - ((int) this.f116093d.f116157c));
            int max2 = Math.max(0, i - this.f116093d.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i2 = max2 > 0 ? max2 >> 1 : 0;
                int i3 = max > 0 ? max >> 1 : 0;
                if (this.f116099k != null) {
                    Rect rect = new Rect();
                    this.f116099k.getPadding(rect);
                    if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                        int i4 = C44767a.f116704a;
                        m78929L();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.f116099k = new InsetDrawable(this.f116093d, i2, i3, i2, i3);
                int i5 = C44767a.f116704a;
                m78929L();
            } else if (this.f116099k != null) {
                m78932d();
            } else {
                int i6 = C44767a.f116704a;
                m78929L();
            }
        } else if (this.f116099k != null) {
            m78932d();
        } else {
            int i7 = C44767a.f116704a;
            m78929L();
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47743D(i);
        }
        m78931N();
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }
}
