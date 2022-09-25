package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.AppCompatButton;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.C0779y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.widget.C2134u;
import androidx.customview.view.AbsSavedState;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3513j.C44767a;
import com.google.android.material.p3515l.C44770aa;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.p3515l.C44785p;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
public class MaterialButton extends AppCompatButton implements Checkable, C44770aa {

    /* renamed from: h */
    private static final int[] f115967h = {16842911};

    /* renamed from: i */
    private static final int[] f115968i = {16842912};

    /* renamed from: b */
    public final C44573c f115969b;

    /* renamed from: c */
    public ColorStateList f115970c;

    /* renamed from: d */
    public Drawable f115971d;

    /* renamed from: e */
    public int f115972e;

    /* renamed from: f */
    public boolean f115973f;

    /* renamed from: g */
    public C44578h f115974g;

    /* renamed from: j */
    private final LinkedHashSet f115975j;

    /* renamed from: k */
    private PorterDuff.Mode f115976k;

    /* renamed from: l */
    private int f115977l;

    /* renamed from: m */
    private int f115978m;

    /* renamed from: n */
    private int f115979n;

    /* renamed from: o */
    private boolean f115980o;

    /* renamed from: p */
    private int f115981p;

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final String mo32790b() {
        return (true != mo47560p() ? Button.class : CompoundButton.class).getName();
    }

    /* renamed from: c */
    private final void mo47888c() {
        if (m78846r()) {
            C2134u.m5912d(this, this.f115971d, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (mo32798e()) {
            C2134u.m5912d(this, (Drawable) null, (Drawable) null, this.f115971d, (Drawable) null);
        } else if (m78847s()) {
            C2134u.m5912d(this, (Drawable) null, this.f115971d, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d4 A[ADDED_TO_REGION] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m78844d(int r11, int r12) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f115971d
            if (r0 == 0) goto L_0x0175
            android.text.Layout r0 = r10.getLayout()
            if (r0 != 0) goto L_0x000c
            goto L_0x0175
        L_0x000c:
            boolean r0 = r10.m78846r()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r10.mo32798e()
            if (r0 == 0) goto L_0x001d
            goto L_0x00a2
        L_0x001d:
            boolean r11 = r10.m78847s()
            if (r11 == 0) goto L_0x016f
            r10.f115977l = r3
            int r11 = r10.f115981p
            r0 = 16
            if (r11 != r0) goto L_0x0031
            r10.f115978m = r3
            r10.mo47558o(r3)
            return
        L_0x0031:
            int r11 = r10.f115972e
            if (r11 != 0) goto L_0x003b
            android.graphics.drawable.Drawable r11 = r10.f115971d
            int r11 = r11.getIntrinsicHeight()
        L_0x003b:
            int r0 = r10.getLineCount()
            if (r0 <= r2) goto L_0x004a
            android.text.Layout r0 = r10.getLayout()
            int r0 = r0.getHeight()
            goto L_0x0084
        L_0x004a:
            android.text.TextPaint r0 = r10.getPaint()
            java.lang.CharSequence r2 = r10.getText()
            java.lang.String r2 = r2.toString()
            android.text.method.TransformationMethod r4 = r10.getTransformationMethod()
            if (r4 == 0) goto L_0x0068
            android.text.method.TransformationMethod r4 = r10.getTransformationMethod()
            java.lang.CharSequence r2 = r4.getTransformation(r2, r10)
            java.lang.String r2 = r2.toString()
        L_0x0068:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            int r5 = r2.length()
            r0.getTextBounds(r2, r3, r5, r4)
            int r0 = r4.height()
            android.text.Layout r2 = r10.getLayout()
            int r2 = r2.getHeight()
            int r0 = java.lang.Math.min(r0, r2)
        L_0x0084:
            int r12 = r12 - r0
            int r0 = r10.getPaddingTop()
            int r12 = r12 - r0
            int r12 = r12 - r11
            int r11 = r10.f115979n
            int r12 = r12 - r11
            int r11 = r10.getPaddingBottom()
            int r12 = r12 - r11
            int r12 = r12 / r1
            int r11 = java.lang.Math.max(r3, r12)
            int r12 = r10.f115978m
            if (r12 == r11) goto L_0x016f
            r10.f115978m = r11
            r10.mo47558o(r3)
            return
        L_0x00a2:
            r10.f115978m = r3
            int r12 = r10.getTextAlignment()
            r0 = 3
            r4 = 4
            if (r12 == r2) goto L_0x00bc
            r5 = 6
            if (r12 == r5) goto L_0x00b9
            if (r12 == r0) goto L_0x00b9
            if (r12 == r4) goto L_0x00b6
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x00d0
        L_0x00b6:
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x00d0
        L_0x00b9:
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x00d0
        L_0x00bc:
            int r12 = r10.getGravity()
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r12 = r12 & r5
            if (r12 == r2) goto L_0x00b6
            r5 = 5
            if (r12 == r5) goto L_0x00b9
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r12 == r5) goto L_0x00b9
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x00d0:
            int r5 = r10.f115981p
            if (r5 == r2) goto L_0x0170
            if (r5 == r0) goto L_0x0170
            if (r5 != r1) goto L_0x00dc
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r12 == r0) goto L_0x0170
        L_0x00dc:
            int r0 = r10.f115981p
            if (r0 != r4) goto L_0x00e4
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r12 == r0) goto L_0x0170
        L_0x00e4:
            int r0 = r10.f115972e
            if (r0 != 0) goto L_0x00ee
            android.graphics.drawable.Drawable r0 = r10.f115971d
            int r0 = r0.getIntrinsicWidth()
        L_0x00ee:
            int r1 = r10.getLineCount()
            r5 = 0
            r6 = 0
        L_0x00f4:
            if (r5 >= r1) goto L_0x0140
            android.text.Layout r7 = r10.getLayout()
            int r7 = r7.getLineStart(r5)
            android.text.Layout r8 = r10.getLayout()
            int r8 = r8.getLineEnd(r5)
            java.lang.CharSequence r9 = r10.getText()
            java.lang.CharSequence r7 = r9.subSequence(r7, r8)
            android.text.TextPaint r8 = r10.getPaint()
            java.lang.String r7 = r7.toString()
            android.text.method.TransformationMethod r9 = r10.getTransformationMethod()
            if (r9 == 0) goto L_0x0128
            android.text.method.TransformationMethod r9 = r10.getTransformationMethod()
            java.lang.CharSequence r7 = r9.getTransformation(r7, r10)
            java.lang.String r7 = r7.toString()
        L_0x0128:
            float r7 = r8.measureText(r7)
            int r7 = (int) r7
            android.text.Layout r8 = r10.getLayout()
            int r8 = r8.getEllipsizedWidth()
            int r7 = java.lang.Math.min(r7, r8)
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = r5 + 1
            goto L_0x00f4
        L_0x0140:
            int r11 = r11 - r6
            int r1 = androidx.core.p098j.C2043bi.m5582k(r10)
            int r11 = r11 - r1
            int r11 = r11 - r0
            int r0 = r10.f115979n
            int r11 = r11 - r0
            int r0 = androidx.core.p098j.C2043bi.m5583l(r10)
            int r11 = r11 - r0
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r12 != r0) goto L_0x0155
            int r11 = r11 / 2
        L_0x0155:
            int r12 = androidx.core.p098j.C2043bi.m5577f(r10)
            if (r12 == r2) goto L_0x015d
            r12 = 0
            goto L_0x015e
        L_0x015d:
            r12 = 1
        L_0x015e:
            int r0 = r10.f115981p
            if (r0 == r4) goto L_0x0163
            r2 = 0
        L_0x0163:
            if (r12 == r2) goto L_0x0166
            int r11 = -r11
        L_0x0166:
            int r12 = r10.f115977l
            if (r12 == r11) goto L_0x016f
            r10.f115977l = r11
            r10.mo47558o(r3)
        L_0x016f:
            return
        L_0x0170:
            r10.f115977l = r3
            r10.mo47558o(r3)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.m78844d(int, int):void");
    }

    /* renamed from: e */
    private final boolean mo32798e() {
        int i = this.f115981p;
        return i == 3 || i == 4;
    }

    /* renamed from: r */
    private final boolean m78846r() {
        int i = this.f115981p;
        return i == 1 || i == 2;
    }

    /* renamed from: s */
    private final boolean m78847s() {
        int i = this.f115981p;
        return i == 16 || i == 32;
    }

    /* renamed from: f */
    public final int mo47546f() {
        if (mo47561q()) {
            return this.f115969b.f116000h;
        }
        return 0;
    }

    /* renamed from: g */
    public final C44785p mo47547g() {
        if (mo47561q()) {
            return this.f115969b.f115994b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public final ColorStateList getBackgroundTintList() {
        if (mo47561q()) {
            return this.f115969b.f116002j;
        }
        C0779y yVar = this.f1797a;
        if (yVar != null) {
            return yVar.mo3304a();
        }
        return null;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        if (mo47561q()) {
            return this.f115969b.f116001i;
        }
        C0779y yVar = this.f1797a;
        if (yVar != null) {
            return yVar.mo3305b();
        }
        return null;
    }

    /* renamed from: h */
    public final void mo47550h(int i) {
        if (mo47561q()) {
            C44573c cVar = this.f115969b;
            if (!cVar.f116008p || cVar.f115999g != i) {
                cVar.f115999g = i;
                cVar.f116008p = true;
                C44785p b = cVar.f115994b.mo48151b((float) i);
                cVar.f115994b = b;
                cVar.mo47589d(b);
            }
        }
    }

    /* renamed from: i */
    public final void mo47551i(int i) {
        if (this.f115979n != i) {
            this.f115979n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public final boolean isChecked() {
        return this.f115973f;
    }

    /* renamed from: j */
    public final void mo47553j(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0678gm.m2375e().mo3100c(getContext(), i);
        } else {
            drawable = null;
        }
        mo28945lq(drawable);
    }

    /* renamed from: k */
    public final void mo47554k(ColorStateList colorStateList) {
        if (mo47561q()) {
            C44573c cVar = this.f115969b;
            if (cVar.f116004l != colorStateList) {
                cVar.f116004l = colorStateList;
                if (cVar.f115993a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) cVar.f115993a.getBackground()).setColor(C44767a.m79372b(colorStateList));
                }
            }
        }
    }

    /* renamed from: lq */
    public void mo28945lq(Drawable drawable) {
        if (this.f115971d != drawable) {
            this.f115971d = drawable;
            mo47558o(true);
            m78844d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: o */
    public final void mo47558o(boolean z) {
        Drawable drawable = this.f115971d;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f115971d = mutate;
            C1929b.m5226g(mutate, this.f115970c);
            PorterDuff.Mode mode = this.f115976k;
            if (mode != null) {
                C1929b.m5227h(this.f115971d, mode);
            }
            int i = this.f115972e;
            if (i == 0) {
                i = this.f115971d.getIntrinsicWidth();
            }
            int i2 = this.f115972e;
            if (i2 == 0) {
                i2 = this.f115971d.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f115971d;
            int i3 = this.f115977l;
            int i4 = this.f115978m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f115971d.setVisible(true, z);
        }
        if (!z) {
            Drawable[] h = C2134u.m5916h(this);
            Drawable drawable3 = h[0];
            Drawable drawable4 = h[1];
            Drawable drawable5 = h[2];
            if ((m78846r() && drawable3 != this.f115971d) || ((mo32798e() && drawable5 != this.f115971d) || (m78847s() && drawable4 != this.f115971d))) {
                mo47888c();
                return;
            }
            return;
        }
        mo47888c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo47561q()) {
            C44780k.m79413d(this, this.f115969b.mo47586a(false));
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo47560p()) {
            mergeDrawableStates(onCreateDrawableState, f115967h);
        }
        if (this.f115973f) {
            mergeDrawableStates(onCreateDrawableState, f115968i);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(mo32790b());
        accessibilityEvent.setChecked(this.f115973f);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(mo32790b());
        accessibilityNodeInfo.setCheckable(mo47560p());
        accessibilityNodeInfo.setChecked(this.f115973f);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m78844d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        setChecked(savedState.f115982a);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f115982a = this.f115973f;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m78844d(getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: p */
    public final boolean mo47560p() {
        C44573c cVar = this.f115969b;
        return cVar != null && cVar.f116009q;
    }

    public boolean performClick() {
        if (this.f115969b.f116010r) {
            toggle();
        }
        return super.performClick();
    }

    /* renamed from: q */
    public final boolean mo47561q() {
        C44573c cVar = this.f115969b;
        return cVar != null && !cVar.f116007o;
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f115971d != null) {
            if (this.f115971d.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundColor(int i) {
        if (mo47561q()) {
            C44573c cVar = this.f115969b;
            if (cVar.mo47586a(false) != null) {
                cVar.mo47586a(false).setTintList(ColorStateList.valueOf(i));
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!mo47561q()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f115969b.mo47588c();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public final void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0678gm.m2375e().mo3100c(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        mo47556m(colorStateList);
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        mo47557n(mode);
    }

    public final void setChecked(boolean z) {
        if (mo47560p() && isEnabled() && this.f115973f != z) {
            this.f115973f = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.f115973f;
                if (!materialButtonToggleGroup.f115984b) {
                    materialButtonToggleGroup.mo47572a(getId(), z2);
                }
            }
            if (!this.f115980o) {
                this.f115980o = true;
                Iterator it = this.f115975j.iterator();
                while (it.hasNext()) {
                    ((C44571a) it.next()).mo47582a();
                }
                this.f115980o = false;
            }
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        if (mo47561q()) {
            this.f115969b.mo47586a(false).mo48123U(f);
        }
    }

    public final void setPressed(boolean z) {
        C44578h hVar = this.f115974g;
        if (hVar != null) {
            hVar.f116020a.invalidate();
        }
        super.setPressed(z);
    }

    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m78844d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void toggle() {
        setChecked(!this.f115973f);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    /* renamed from: l */
    public final void mo47555l(C44785p pVar) {
        if (mo47561q()) {
            C44573c cVar = this.f115969b;
            cVar.f115994b = pVar;
            cVar.mo47589d(pVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* renamed from: m */
    public final void mo47556m(ColorStateList colorStateList) {
        if (mo47561q()) {
            C44573c cVar = this.f115969b;
            if (cVar.f116002j != colorStateList) {
                cVar.f116002j = colorStateList;
                if (cVar.mo47586a(false) != null) {
                    C1929b.m5226g(cVar.mo47586a(false), cVar.f116002j);
                    return;
                }
                return;
            }
            return;
        }
        C0779y yVar = this.f1797a;
        if (yVar != null) {
            yVar.mo3310g(colorStateList);
        }
    }

    /* renamed from: n */
    public final void mo47557n(PorterDuff.Mode mode) {
        if (mo47561q()) {
            C44573c cVar = this.f115969b;
            if (cVar.f116001i != mode) {
                cVar.f116001i = mode;
                if (cVar.mo47586a(false) != null && cVar.f116001i != null) {
                    C1929b.m5227h(cVar.mo47586a(false), cVar.f116001i);
                    return;
                }
                return;
            }
            return;
        }
        C0779y yVar = this.f1797a;
        if (yVar != null) {
            yVar.mo3311h(mode);
        }
    }

    /* compiled from: PG */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C44572b();

        /* renamed from: a */
        boolean f115982a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f115982a = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeInt(this.f115982a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            r9 = 2132151740(0x7f160dbc, float:1.9945551E38)
            r1 = r21
            android.content.Context r1 = com.google.android.material.theme.p3518a.C44965a.m79936a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f115975j = r1
            r10 = 0
            r0.f115973f = r10
            r0.f115980o = r10
            android.content.Context r11 = r20.getContext()
            int[] r3 = com.google.android.material.button.C44579i.f116021a
            r5 = 2132151740(0x7f160dbc, float:1.9945551E38)
            int[] r6 = new int[r10]
            r1 = r11
            r2 = r22
            r4 = r23
            android.content.res.TypedArray r1 = com.google.android.material.internal.C44733be.m79295a(r1, r2, r3, r4, r5, r6)
            r2 = 12
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r0.f115979n = r2
            r2 = 15
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C44741bm.m79310c(r2, r4)
            r0.f115976k = r2
            android.content.Context r2 = r20.getContext()
            r4 = 14
            android.content.res.ColorStateList r2 = com.google.android.material.p3512i.C44694d.m79230b(r2, r1, r4)
            r0.f115970c = r2
            android.content.Context r2 = r20.getContext()
            r4 = 10
            android.graphics.drawable.Drawable r2 = com.google.android.material.p3512i.C44694d.m79232d(r2, r1, r4)
            r0.f115971d = r2
            r2 = 11
            r4 = 1
            int r2 = r1.getInteger(r2, r4)
            r0.f115981p = r2
            r2 = 13
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r0.f115972e = r2
            com.google.android.material.l.o r2 = com.google.android.material.p3515l.C44785p.m79428e(r11, r7, r8, r9)
            com.google.android.material.l.p r5 = new com.google.android.material.l.p
            r5.<init>(r2)
            com.google.android.material.button.c r2 = new com.google.android.material.button.c
            r2.<init>(r0, r5)
            r0.f115969b = r2
            int r5 = r1.getDimensionPixelOffset(r4, r10)
            r2.f115995c = r5
            r5 = 2
            int r6 = r1.getDimensionPixelOffset(r5, r10)
            r2.f115996d = r6
            r6 = 3
            int r6 = r1.getDimensionPixelOffset(r6, r10)
            r2.f115997e = r6
            r6 = 4
            int r6 = r1.getDimensionPixelOffset(r6, r10)
            r2.f115998f = r6
            r6 = 8
            boolean r7 = r1.hasValue(r6)
            if (r7 == 0) goto L_0x00b9
            int r6 = r1.getDimensionPixelSize(r6, r3)
            r2.f115999g = r6
            com.google.android.material.l.p r7 = r2.f115994b
            float r6 = (float) r6
            com.google.android.material.l.p r6 = r7.mo48151b(r6)
            r2.f115994b = r6
            r2.mo47589d(r6)
            r2.f116008p = r4
        L_0x00b9:
            r6 = 20
            int r6 = r1.getDimensionPixelSize(r6, r10)
            r2.f116000h = r6
            r6 = 7
            int r6 = r1.getInt(r6, r3)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C44741bm.m79310c(r6, r7)
            r2.f116001i = r6
            com.google.android.material.button.MaterialButton r6 = r2.f115993a
            android.content.Context r6 = r6.getContext()
            r7 = 6
            android.content.res.ColorStateList r6 = com.google.android.material.p3512i.C44694d.m79230b(r6, r1, r7)
            r2.f116002j = r6
            com.google.android.material.button.MaterialButton r6 = r2.f115993a
            android.content.Context r6 = r6.getContext()
            r7 = 19
            android.content.res.ColorStateList r6 = com.google.android.material.p3512i.C44694d.m79230b(r6, r1, r7)
            r2.f116003k = r6
            com.google.android.material.button.MaterialButton r6 = r2.f115993a
            android.content.Context r6 = r6.getContext()
            r7 = 16
            android.content.res.ColorStateList r6 = com.google.android.material.p3512i.C44694d.m79230b(r6, r1, r7)
            r2.f116004l = r6
            r6 = 5
            boolean r6 = r1.getBoolean(r6, r10)
            r2.f116009q = r6
            r6 = 9
            int r6 = r1.getDimensionPixelSize(r6, r10)
            r2.f116012t = r6
            r6 = 21
            boolean r6 = r1.getBoolean(r6, r4)
            r2.f116010r = r6
            com.google.android.material.button.MaterialButton r6 = r2.f115993a
            int r6 = androidx.core.p098j.C2043bi.m5583l(r6)
            com.google.android.material.button.MaterialButton r7 = r2.f115993a
            int r7 = r7.getPaddingTop()
            com.google.android.material.button.MaterialButton r8 = r2.f115993a
            int r8 = androidx.core.p098j.C2043bi.m5582k(r8)
            com.google.android.material.button.MaterialButton r9 = r2.f115993a
            int r9 = r9.getPaddingBottom()
            boolean r11 = r1.hasValue(r10)
            if (r11 == 0) goto L_0x0132
            r2.mo47588c()
            r3 = 0
            goto L_0x01d8
        L_0x0132:
            com.google.android.material.button.MaterialButton r11 = r2.f115993a
            com.google.android.material.l.j r12 = new com.google.android.material.l.j
            com.google.android.material.l.p r13 = r2.f115994b
            r12.<init>((com.google.android.material.p3515l.C44785p) r13)
            com.google.android.material.button.MaterialButton r13 = r2.f115993a
            android.content.Context r13 = r13.getContext()
            r12.mo48121S(r13)
            android.content.res.ColorStateList r13 = r2.f116002j
            androidx.core.graphics.drawable.C1929b.m5226g(r12, r13)
            android.graphics.PorterDuff$Mode r13 = r2.f116001i
            if (r13 == 0) goto L_0x0150
            androidx.core.graphics.drawable.C1929b.m5227h(r12, r13)
        L_0x0150:
            int r13 = r2.f116000h
            android.content.res.ColorStateList r14 = r2.f116003k
            float r13 = (float) r13
            r12.mo48129aa(r13)
            r12.mo48128Z(r14)
            com.google.android.material.l.j r13 = new com.google.android.material.l.j
            com.google.android.material.l.p r14 = r2.f115994b
            r13.<init>((com.google.android.material.p3515l.C44785p) r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r10)
            r13.setTintList(r14)
            int r14 = r2.f116000h
            float r14 = (float) r14
            boolean r15 = r2.f116006n
            if (r15 == 0) goto L_0x017a
            com.google.android.material.button.MaterialButton r15 = r2.f115993a
            r4 = 2130969167(0x7f04024f, float:1.7547008E38)
            int r4 = com.google.android.material.p3505b.C44535e.m78719b(r15, r4)
            goto L_0x017b
        L_0x017a:
            r4 = 0
        L_0x017b:
            r13.mo48127Y(r14, r4)
            com.google.android.material.l.j r4 = new com.google.android.material.l.j
            com.google.android.material.l.p r14 = r2.f115994b
            r4.<init>((com.google.android.material.p3515l.C44785p) r14)
            r2.f116005m = r4
            android.graphics.drawable.Drawable r4 = r2.f116005m
            androidx.core.graphics.drawable.C1929b.m5225f(r4, r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r4 = r2.f116004l
            android.content.res.ColorStateList r4 = com.google.android.material.p3513j.C44767a.m79372b(r4)
            android.graphics.drawable.LayerDrawable r15 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
            r5[r10] = r13
            r13 = 1
            r5[r13] = r12
            r15.<init>(r5)
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            int r12 = r2.f115995c
            int r14 = r2.f115997e
            int r13 = r2.f115996d
            int r10 = r2.f115998f
            r17 = r14
            r14 = r5
            r16 = r12
            r18 = r13
            r19 = r10
            r14.<init>(r15, r16, r17, r18, r19)
            android.graphics.drawable.Drawable r10 = r2.f116005m
            r3.<init>(r4, r5, r10)
            r2.f116011s = r3
            android.graphics.drawable.LayerDrawable r3 = r2.f116011s
            super.setBackgroundDrawable(r3)
            r3 = 0
            com.google.android.material.l.j r4 = r2.mo47586a(r3)
            if (r4 == 0) goto L_0x01d8
            int r5 = r2.f116012t
            float r5 = (float) r5
            r4.mo48123U(r5)
            com.google.android.material.button.MaterialButton r5 = r2.f115993a
            int[] r5 = r5.getDrawableState()
            r4.setState(r5)
        L_0x01d8:
            com.google.android.material.button.MaterialButton r4 = r2.f115993a
            int r5 = r2.f115995c
            int r6 = r6 + r5
            int r5 = r2.f115997e
            int r7 = r7 + r5
            int r5 = r2.f115996d
            int r8 = r8 + r5
            int r2 = r2.f115998f
            int r9 = r9 + r2
            androidx.core.p098j.C2043bi.m5556aj(r4, r6, r7, r8, r9)
            r1.recycle()
            int r1 = r0.f115979n
            r0.setCompoundDrawablePadding(r1)
            android.graphics.drawable.Drawable r1 = r0.f115971d
            if (r1 == 0) goto L_0x01f7
            r10 = 1
            goto L_0x01f8
        L_0x01f7:
            r10 = 0
        L_0x01f8:
            r0.mo47558o(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
