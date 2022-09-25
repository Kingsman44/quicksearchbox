package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.AppCompatCheckBox;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.widget.C2117d;
import androidx.core.widget.C2118e;
import androidx.p198v.p199a.p200a.C4244c;
import androidx.p198v.p199a.p200a.C4250i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3507d.C44603a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: d */
    private static final int f116062d = 2132151764;

    /* renamed from: e */
    private static final int[] f116063e = {R.attr.state_indeterminate};

    /* renamed from: f */
    private static final int[] f116064f = {R.attr.state_error};

    /* renamed from: g */
    private static final int[][] f116065g = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h */
    private static final int f116066h = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: a */
    ColorStateList f116067a;

    /* renamed from: b */
    ColorStateList f116068b;

    /* renamed from: c */
    public int[] f116069c;

    /* renamed from: i */
    private final LinkedHashSet f116070i;

    /* renamed from: j */
    private ColorStateList f116071j;

    /* renamed from: k */
    private boolean f116072k;

    /* renamed from: l */
    private boolean f116073l;

    /* renamed from: m */
    private boolean f116074m;

    /* renamed from: n */
    private CharSequence f116075n;

    /* renamed from: o */
    private Drawable f116076o;

    /* renamed from: p */
    private Drawable f116077p;

    /* renamed from: q */
    private boolean f116078q;

    /* renamed from: r */
    private PorterDuff.Mode f116079r;

    /* renamed from: s */
    private int f116080s;

    /* renamed from: t */
    private boolean f116081t;

    /* renamed from: u */
    private CharSequence f116082u;

    /* renamed from: v */
    private CompoundButton.OnCheckedChangeListener f116083v;

    /* renamed from: w */
    private final C4250i f116084w;

    /* renamed from: x */
    private final C4244c f116085x;

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    private final void m78923e() {
        int i;
        int i2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C4250i iVar;
        this.f116076o = C44603a.m79020d(this.f116076o, this.f116067a, C2117d.m5878b(this));
        this.f116077p = C44603a.m79020d(this.f116077p, this.f116068b, this.f116079r);
        if (this.f116078q) {
            C4250i iVar2 = this.f116084w;
            if (iVar2 != null) {
                iVar2.mo8963c(this.f116085x);
                this.f116084w.mo8962b(this.f116085x);
            }
            Drawable drawable = this.f116076o;
            if ((drawable instanceof AnimatedStateListDrawable) && (iVar = this.f116084w) != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, iVar, false);
                ((AnimatedStateListDrawable) this.f116076o).addTransition(R.id.indeterminate, R.id.unchecked, this.f116084w, false);
            }
        }
        Drawable drawable2 = this.f116076o;
        if (!(drawable2 == null || (colorStateList2 = this.f116067a) == null)) {
            C1929b.m5226g(drawable2, colorStateList2);
        }
        Drawable drawable3 = this.f116077p;
        if (!(drawable3 == null || (colorStateList = this.f116068b) == null)) {
            C1929b.m5226g(drawable3, colorStateList);
        }
        Drawable drawable4 = this.f116076o;
        Drawable drawable5 = this.f116077p;
        if (drawable4 == null) {
            drawable4 = drawable5;
        } else if (drawable5 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable4, drawable5});
            if (drawable5.getIntrinsicWidth() == -1 || drawable5.getIntrinsicHeight() == -1) {
                int intrinsicWidth = drawable4.getIntrinsicWidth();
                i = drawable4.getIntrinsicHeight();
                i2 = intrinsicWidth;
            } else if (drawable5.getIntrinsicWidth() > drawable4.getIntrinsicWidth() || drawable5.getIntrinsicHeight() > drawable4.getIntrinsicHeight()) {
                float intrinsicWidth2 = ((float) drawable5.getIntrinsicWidth()) / ((float) drawable5.getIntrinsicHeight());
                if (intrinsicWidth2 >= ((float) drawable4.getIntrinsicWidth()) / ((float) drawable4.getIntrinsicHeight())) {
                    i2 = drawable4.getIntrinsicWidth();
                    i = (int) (((float) i2) / intrinsicWidth2);
                } else {
                    i = drawable4.getIntrinsicHeight();
                    i2 = (int) (intrinsicWidth2 * ((float) i));
                }
            } else {
                i2 = drawable5.getIntrinsicWidth();
                i = drawable5.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, i2, i);
            layerDrawable.setLayerGravity(1, 17);
            drawable4 = layerDrawable;
        }
        super.setButtonDrawable(drawable4);
        refreshDrawableState();
    }

    /* renamed from: f */
    private final void m78924f() {
        String str;
        if (Build.VERSION.SDK_INT >= 30 && this.f116082u == null) {
            int i = this.f116080s;
            if (i == 1) {
                str = getResources().getString(R.string.mtrl_checkbox_state_description_checked);
            } else if (i == 0) {
                str = getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
            } else {
                str = getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
            }
            super.setStateDescription(str);
        }
    }

    /* renamed from: d */
    public final void mo47640d(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f116080s != i) {
            this.f116080s = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            m78924f();
            if (!this.f116081t) {
                this.f116081t = true;
                LinkedHashSet linkedHashSet = this.f116070i;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((C44588b) it.next()).mo47658a();
                    }
                }
                if (!(this.f116080s == 2 || (onCheckedChangeListener = this.f116083v) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f116081t = false;
            }
        }
    }

    public final Drawable getButtonDrawable() {
        return this.f116076o;
    }

    public final ColorStateList getButtonTintList() {
        return this.f116067a;
    }

    public final boolean isChecked() {
        return this.f116080s == 1;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f116072k && this.f116067a == null && this.f116068b == null) {
            this.f116072k = true;
            if (this.f116071j == null) {
                int[][] iArr = f116065g;
                int length = iArr.length;
                int b = C44535e.m78719b(this, R.attr.colorControlActivated);
                int b2 = C44535e.m78719b(this, R.attr.colorError);
                int b3 = C44535e.m78719b(this, R.attr.colorSurface);
                int b4 = C44535e.m78719b(this, R.attr.colorOnSurface);
                this.f116071j = new ColorStateList(iArr, new int[]{C44535e.m78721d(b3, b2, 1.0f), C44535e.m78721d(b3, b, 1.0f), C44535e.m78721d(b3, b4, 0.54f), C44535e.m78721d(b3, b4, 0.38f), C44535e.m78721d(b3, b4, 0.38f)});
            }
            C2117d.m5879c(this, this.f116071j);
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f116080s == 2) {
            mergeDrawableStates(onCreateDrawableState, f116063e);
        }
        if (this.f116074m) {
            mergeDrawableStates(onCreateDrawableState, f116064f);
        }
        this.f116069c = C44603a.m79019c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Drawable a;
        if (!this.f116073l || !TextUtils.isEmpty(getText()) || (a = C2118e.m5881a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = 1;
        if (true == C44741bm.m79317j(this)) {
            i = -1;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            C1929b.m5224e(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f116074m) {
            String valueOf = String.valueOf(accessibilityNodeInfo.getText());
            String valueOf2 = String.valueOf(this.f116075n);
            accessibilityNodeInfo.setText(valueOf + ", " + valueOf2);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo47640d(savedState.f116086a);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f116086a = this.f116080s;
        return savedState;
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0678gm.m2375e().mo3100c(getContext(), i));
    }

    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.f116067a != colorStateList) {
            this.f116067a = colorStateList;
            m78923e();
        }
    }

    public final void setButtonTintMode(PorterDuff.Mode mode) {
        mo1934lj(mode);
        m78923e();
    }

    public final void setChecked(boolean z) {
        mo47640d(z ? 1 : 0);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f116083v = onCheckedChangeListener;
    }

    public final void setStateDescription(CharSequence charSequence) {
        this.f116082u = charSequence;
        if (charSequence == null) {
            m78924f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public final void toggle() {
        mo47640d(isChecked() ^ true ? 1 : 0);
    }

    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C44589c();

        /* renamed from: a */
        int f116086a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f116086a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            int i = this.f116086a;
            String str = i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
            return "MaterialCheckBox.SavedState{" + hexString + " CheckedState=" + str + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f116086a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f116062d
            android.content.Context r8 = com.google.android.material.theme.p3518a.C44965a.m79936a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f116070i = r8
            android.content.Context r8 = r7.getContext()
            r0 = 2131233391(0x7f080a6f, float:1.8082918E38)
            androidx.v.a.a.i r8 = androidx.p198v.p199a.p200a.C4250i.m12163a(r8, r0)
            r7.f116084w = r8
            com.google.android.material.checkbox.a r8 = new com.google.android.material.checkbox.a
            r8.<init>(r7)
            r7.f116085x = r8
            android.content.Context r8 = r7.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C2118e.m5881a(r7)
            r7.f116076o = r0
            android.content.res.ColorStateList r0 = r7.f116067a
            if (r0 != 0) goto L_0x0046
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            if (r0 == 0) goto L_0x0042
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            goto L_0x0046
        L_0x0042:
            android.content.res.ColorStateList r0 = r7.mo1930a()
        L_0x0046:
            r7.f116067a = r0
            r7.mo1931c()
            int[] r2 = com.google.android.material.checkbox.C44590d.f116088a
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.support.v7.widget.ip r9 = com.google.android.material.internal.C44733be.m79296b(r0, r1, r2, r3, r4, r5)
            r10 = 2
            android.graphics.drawable.Drawable r10 = r9.mo3246b(r10)
            r7.f116077p = r10
            android.graphics.drawable.Drawable r10 = r7.f116076o
            r0 = 1
            if (r10 == 0) goto L_0x00a2
            r10 = 2130970201(0x7f040659, float:1.7549105E38)
            boolean r10 = com.google.android.material.p3512i.C44693c.m79228d(r8, r10, r6)
            if (r10 == 0) goto L_0x00a2
            android.content.res.TypedArray r10 = r9.f2596b
            int r10 = r10.getResourceId(r6, r6)
            android.content.res.TypedArray r1 = r9.f2596b
            int r1 = r1.getResourceId(r0, r6)
            int r2 = f116066h
            if (r10 != r2) goto L_0x00a2
            if (r1 != 0) goto L_0x00a2
            r10 = 0
            super.setButtonDrawable((android.graphics.drawable.Drawable) r10)
            android.support.v7.widget.gm r10 = android.support.p033v7.widget.C0678gm.m2375e()
            r1 = 2131233390(0x7f080a6e, float:1.8082916E38)
            android.graphics.drawable.Drawable r10 = r10.mo3100c(r8, r1)
            r7.f116076o = r10
            r7.f116078q = r0
            android.graphics.drawable.Drawable r10 = r7.f116077p
            if (r10 != 0) goto L_0x00a2
            android.support.v7.widget.gm r10 = android.support.p033v7.widget.C0678gm.m2375e()
            r1 = 2131233392(0x7f080a70, float:1.808292E38)
            android.graphics.drawable.Drawable r10 = r10.mo3100c(r8, r1)
            r7.f116077p = r10
        L_0x00a2:
            r10 = 3
            android.content.res.ColorStateList r8 = com.google.android.material.p3512i.C44694d.m79231c(r8, r9, r10)
            r7.f116068b = r8
            android.content.res.TypedArray r8 = r9.f2596b
            r10 = 4
            r1 = -1
            int r8 = r8.getInt(r10, r1)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.C44741bm.m79310c(r8, r10)
            r7.f116079r = r8
            android.content.res.TypedArray r8 = r9.f2596b
            r10 = 10
            boolean r8 = r8.getBoolean(r10, r6)
            r7.f116072k = r8
            android.content.res.TypedArray r8 = r9.f2596b
            r10 = 6
            boolean r8 = r8.getBoolean(r10, r0)
            r7.f116073l = r8
            android.content.res.TypedArray r8 = r9.f2596b
            r10 = 9
            boolean r8 = r8.getBoolean(r10, r6)
            r7.f116074m = r8
            android.content.res.TypedArray r8 = r9.f2596b
            r10 = 8
            java.lang.CharSequence r8 = r8.getText(r10)
            r7.f116075n = r8
            android.content.res.TypedArray r8 = r9.f2596b
            r10 = 7
            boolean r8 = r8.hasValue(r10)
            if (r8 == 0) goto L_0x00f2
            android.content.res.TypedArray r8 = r9.f2596b
            int r8 = r8.getInt(r10, r6)
            r7.mo47640d(r8)
        L_0x00f2:
            android.content.res.TypedArray r8 = r9.f2596b
            r8.recycle()
            r7.m78923e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setButtonDrawable(Drawable drawable) {
        this.f116076o = drawable;
        this.f116078q = false;
        m78923e();
    }
}
