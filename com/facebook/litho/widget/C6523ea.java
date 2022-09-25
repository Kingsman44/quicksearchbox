package com.facebook.litho.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.p097i.C1968c;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p333i.C6396a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.litho.widget.ea */
/* compiled from: PG */
final class C6523ea {

    /* renamed from: a */
    static final Drawable f19412a;

    /* renamed from: b */
    protected static final ColorStateList f19413b = ColorStateList.valueOf(-16777216);

    /* renamed from: c */
    protected static final ColorStateList f19414c = ColorStateList.valueOf(-3355444);

    /* renamed from: d */
    static final CharSequence f19415d = BuildConfig.FLAVOR;

    /* renamed from: e */
    static final CharSequence f19416e = BuildConfig.FLAVOR;

    /* renamed from: f */
    protected static final Drawable f19417f;

    /* renamed from: g */
    protected static final Typeface f19418g = Typeface.DEFAULT;

    /* renamed from: h */
    protected static final MovementMethod f19419h = ArrowKeyMovementMethod.getInstance();

    /* renamed from: i */
    private static final Rect f19420i = new Rect();

    /* renamed from: j */
    private static final InputFilter[] f19421j = new InputFilter[0];

    static {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        f19412a = colorDrawable;
        f19417f = colorDrawable;
    }

    /* renamed from: a */
    static Drawable m17712a(C6411u uVar, Drawable drawable) {
        if (drawable != f19412a) {
            return drawable;
        }
        TypedArray obtainStyledAttributes = uVar.f19009b.obtainStyledAttributes((AttributeSet) null, new int[]{16842964}, 16842862, 0);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable2;
    }

    /* renamed from: b */
    protected static C6520dy m17713b(Context context) {
        return new C6520dy(context);
    }

    /* renamed from: c */
    static void m17714c(C6411u uVar, C6520dy dyVar, @C6118b List list) {
        C6154cb cbVar;
        C6154cb cbVar2;
        int i = C6517dv.f19363W;
        C6407q qVar = uVar.f19012e;
        if (qVar == null) {
            cbVar = null;
        } else {
            cbVar = ((C6517dv) qVar).f19378O;
        }
        if (qVar != null) {
            C6517dv dvVar = (C6517dv) qVar;
        }
        if (qVar != null) {
            C6517dv dvVar2 = (C6517dv) qVar;
        }
        if (qVar != null) {
            C6517dv dvVar3 = (C6517dv) qVar;
        }
        if (qVar == null) {
            cbVar2 = null;
        } else {
            cbVar2 = ((C6517dv) qVar).f19379P;
        }
        if (qVar != null) {
            C6517dv dvVar4 = (C6517dv) qVar;
        }
        if (list != null && list.size() > 0) {
            dyVar.f19402i = list.size() == 1 ? (TextWatcher) list.get(0) : new C6518dw(list);
            TextWatcher textWatcher = dyVar.f19402i;
            if (textWatcher != null && (textWatcher instanceof C6526ed)) {
                ((C6526ed) textWatcher).f19435a = dyVar;
            }
            dyVar.addTextChangedListener(textWatcher);
        }
        dyVar.f19400g = uVar;
        dyVar.f19394a = cbVar;
        dyVar.f19395b = null;
        dyVar.f19396c = null;
        dyVar.f19397d = null;
        dyVar.f19398e = cbVar2;
        dyVar.f19399f = null;
    }

    /* renamed from: d */
    static void m17715d(C6281fx fxVar, C6281fx fxVar2, C6281fx fxVar3, @C6118b(mo12872a = C6119c.STRING) CharSequence charSequence) {
        fxVar.f18496a = new AtomicReference();
        fxVar3.f18496a = 0;
        fxVar2.f18496a = new AtomicReference(charSequence);
    }

    /* renamed from: e */
    static void m17716e(C6281fx fxVar) {
        fxVar.f18496a = Integer.valueOf(((Integer) fxVar.f18496a).intValue() + 1);
    }

    /* renamed from: f */
    static void m17717f(C6520dy dyVar) {
        TextWatcher textWatcher = dyVar.f19402i;
        if (textWatcher != null) {
            dyVar.removeTextChangedListener(textWatcher);
            TextWatcher textWatcher2 = dyVar.f19402i;
            if (textWatcher2 != null && (textWatcher2 instanceof C6526ed)) {
                ((C6526ed) textWatcher2).f19435a = null;
            }
            dyVar.f19402i = null;
        }
        dyVar.f19400g = null;
        dyVar.f19394a = null;
        dyVar.f19395b = null;
        dyVar.f19396c = null;
        dyVar.f19397d = null;
        dyVar.f19398e = null;
        dyVar.f19399f = null;
    }

    /* renamed from: g */
    static void m17718g(C6520dy dyVar, AtomicReference atomicReference) {
        dyVar.f19401h = null;
        atomicReference.set((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016a, code lost:
        if (androidx.core.p097i.C1968c.m5305b(r0.f18143a, r0.f18144b) != false) goto L_0x016e;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m17719h(@com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.STRING) com.facebook.litho.C6128bi r16, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.STRING) com.facebook.litho.C6128bi r17, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DRAWABLE) com.facebook.litho.C6128bi r18, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) com.facebook.litho.C6128bi r19, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) com.facebook.litho.C6128bi r20, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) com.facebook.litho.C6128bi r21, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.COLOR) com.facebook.litho.C6128bi r22, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r23, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r24, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.COLOR) com.facebook.litho.C6128bi r25, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_TEXT) com.facebook.litho.C6128bi r26, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r27, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r28, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r29, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r30, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r31, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r32, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r33, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r34, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r35, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r36, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r37, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r38, @com.facebook.litho.p323b.C6118b com.facebook.litho.C6128bi r39, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.STRING) com.facebook.litho.C6128bi r40, com.facebook.litho.C6128bi r41, com.facebook.litho.C6128bi r42, com.facebook.litho.C6128bi r43) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r2 = r32
            r2 = r41
            java.lang.Object r15 = r2.f18143a
            java.lang.Object r2 = r2.f18144b
            boolean r2 = androidx.core.p097i.C1968c.m5305b(r15, r2)
            r15 = 1
            if (r2 == 0) goto L_0x01e3
            java.lang.Object r2 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r2, r0)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r1.f18143a
            java.lang.Object r1 = r1.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r3.f18143a
            java.lang.Object r1 = r3.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r4.f18143a
            java.lang.Object r1 = r4.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r5.f18143a
            java.lang.Object r1 = r5.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r6.f18143a
            java.lang.Object r1 = r6.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r7.f18143a
            java.lang.Object r1 = r7.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r8.f18143a
            java.lang.Object r1 = r8.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r9.f18143a
            java.lang.Object r1 = r9.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r10.f18143a
            java.lang.Object r1 = r10.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r11.f18143a
            java.lang.Object r1 = r11.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r12.f18143a
            java.lang.Object r1 = r12.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r13.f18143a
            java.lang.Object r1 = r13.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r14.f18143a
            java.lang.Object r1 = r14.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r1)
            if (r0 == 0) goto L_0x01e3
            r0 = r31
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r0 = r32
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r0 = r33
            java.lang.Object r1 = r0.f18143a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f18144b
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r1 != 0) goto L_0x00e5
            if (r0 != 0) goto L_0x00e5
        L_0x00e2:
            r0 = r34
            goto L_0x0134
        L_0x00e5:
            if (r1 == 0) goto L_0x01e3
            if (r0 != 0) goto L_0x00eb
            goto L_0x01e3
        L_0x00eb:
            int r3 = r1.size()
            int r4 = r0.size()
            if (r3 != r4) goto L_0x01e3
            r3 = 0
        L_0x00f6:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x00e2
            java.lang.Object r4 = r1.get(r3)
            android.text.InputFilter r4 = (android.text.InputFilter) r4
            java.lang.Object r5 = r0.get(r3)
            android.text.InputFilter r5 = (android.text.InputFilter) r5
            boolean r6 = r4 instanceof android.text.InputFilter.AllCaps
            if (r6 == 0) goto L_0x0111
            boolean r6 = r5 instanceof android.text.InputFilter.AllCaps
            if (r6 == 0) goto L_0x0111
            goto L_0x0131
        L_0x0111:
            boolean r6 = r4 instanceof android.text.InputFilter.LengthFilter
            if (r6 == 0) goto L_0x0129
            boolean r6 = r5 instanceof android.text.InputFilter.LengthFilter
            if (r6 == 0) goto L_0x0129
            android.text.InputFilter$LengthFilter r4 = (android.text.InputFilter.LengthFilter) r4
            int r4 = r4.getMax()
            android.text.InputFilter$LengthFilter r5 = (android.text.InputFilter.LengthFilter) r5
            int r5 = r5.getMax()
            if (r4 == r5) goto L_0x0131
            goto L_0x01e3
        L_0x0129:
            boolean r4 = androidx.core.p097i.C1968c.m5305b(r4, r5)
            if (r4 != 0) goto L_0x0131
            goto L_0x01e3
        L_0x0131:
            int r3 = r3 + 1
            goto L_0x00f6
        L_0x0134:
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r0 = r35
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r3 = r0.f18144b
            boolean r1 = androidx.core.p097i.C1968c.m5305b(r1, r3)
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r0 = r0.f18144b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016e
            r0 = r36
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x016d
            r0 = r37
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            return r15
        L_0x016e:
            r0 = r38
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r0 = r39
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r0 = r40
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r0 = r42
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            if (r1 != r0) goto L_0x01e3
            r0 = r43
            java.lang.Object r1 = r0.f18143a
            java.lang.Object r0 = r0.f18144b
            if (r1 != r0) goto L_0x01e3
            r0 = r18
            java.lang.Object r1 = r0.f18143a
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Object r0 = r0.f18144b
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r1 != 0) goto L_0x01b2
            if (r0 != 0) goto L_0x01b1
            goto L_0x01b2
        L_0x01b1:
            return r15
        L_0x01b2:
            if (r1 == 0) goto L_0x01b8
            if (r0 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            return r15
        L_0x01b8:
            if (r1 == 0) goto L_0x01e2
            if (r0 == 0) goto L_0x01e2
            boolean r3 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x01d3
            boolean r3 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x01d3
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r1 = r1.getColor()
            int r0 = r0.getColor()
            if (r1 == r0) goto L_0x01e2
            return r15
        L_0x01d3:
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r1, r0)
            if (r0 != 0) goto L_0x01e2
            return r15
        L_0x01e2:
            return r2
        L_0x01e3:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6523ea.m17719h(com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi, com.facebook.litho.bi):boolean");
    }

    /* renamed from: i */
    static void m17720i(C6411u uVar, int i, int i2, C6276fs fsVar, @C6118b(mo12872a = C6119c.STRING) CharSequence charSequence, @C6118b(mo12872a = C6119c.DRAWABLE) Drawable drawable, @C6118b ColorStateList colorStateList, @C6118b ColorStateList colorStateList2, @C6118b(mo12872a = C6119c.COLOR) Integer num, @C6118b(mo12872a = C6119c.DIMEN_TEXT) int i3, @C6118b Typeface typeface, @C6118b int i4, @C6118b int i5, @C6118b int i6, @C6118b int i7, @C6118b List list, @C6118b boolean z, @C6118b TextUtils.TruncateAt truncateAt, @C6118b int i8, @C6118b(mo12872a = C6119c.COLOR) int i9, AtomicReference atomicReference) {
        C6411u uVar2 = uVar;
        C6276fs fsVar2 = fsVar;
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        C6521dz dzVar = new C6521dz(uVar2.f19009b);
        if (charSequence2 instanceof Spannable) {
            charSequence2 = charSequence2.toString();
        }
        Drawable drawable2 = drawable;
        m17722k(uVar, dzVar, charSequence, m17712a(uVar2, drawable2 == f19412a ? dzVar.getBackground() : drawable2), colorStateList, colorStateList2, num, i3, typeface, i4, i5, i6, 0, i7, list, z, truncateAt, i8, dzVar.getMovementMethod(), charSequence2, true, i9);
        C6521dz dzVar2 = dzVar;
        dzVar2.measure(C6396a.m17149a(i), C6396a.m17149a(i2));
        C6276fs fsVar3 = fsVar;
        fsVar3.f18536b = dzVar2.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            fsVar3.f18535a = 0;
        } else {
            fsVar3.f18535a = Math.min(View.MeasureSpec.getSize(i), dzVar2.getMeasuredWidth());
        }
    }

    /* renamed from: j */
    static void m17721j(C6411u uVar, C6520dy dyVar, @C6118b(mo12872a = C6119c.STRING) CharSequence charSequence, @C6118b(mo12872a = C6119c.DRAWABLE) Drawable drawable, @C6118b ColorStateList colorStateList, @C6118b ColorStateList colorStateList2, @C6118b(mo12872a = C6119c.COLOR) Integer num, @C6118b(mo12872a = C6119c.DIMEN_TEXT) int i, @C6118b Typeface typeface, @C6118b int i2, @C6118b int i3, @C6118b int i4, @C6118b int i5, @C6118b int i6, @C6118b List list, @C6118b boolean z, @C6118b int i7, @C6118b TextUtils.TruncateAt truncateAt, @C6118b MovementMethod movementMethod, @C6118b boolean z2, @C6118b(mo12872a = C6119c.COLOR) int i8, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C6520dy dyVar2 = dyVar;
        if (z2) {
            dyVar.mo13610b();
        }
        atomicReference2.set(dyVar2);
        C6411u uVar2 = uVar;
        m17722k(uVar2, dyVar, charSequence, m17712a(uVar2, drawable), colorStateList, colorStateList2, num, i, typeface, i2, i3, i4, i5, i6, list, z, truncateAt, i7, movementMethod, (CharSequence) atomicReference.get(), false, i8);
        dyVar.f19401h = atomicReference;
    }

    /* renamed from: k */
    static void m17722k(C6411u uVar, EditText editText, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, Integer num, int i, Typeface typeface, int i2, int i3, int i4, int i5, int i6, List list, boolean z, TextUtils.TruncateAt truncateAt, int i7, MovementMethod movementMethod, CharSequence charSequence2, boolean z2, int i8) {
        int i9;
        EditText editText2 = editText;
        Drawable drawable2 = drawable;
        int i10 = i;
        int i11 = i5;
        int i12 = i6;
        List list2 = list;
        CharSequence charSequence3 = charSequence2;
        int i13 = i8;
        if (i10 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, (float) i10);
        }
        if (z) {
            i9 = i4 | C89885b.S3REQUEST_BUILD_PINHOLE_PARAMS_FAILED_VALUE;
            editText.setMinLines(1);
            editText.setMaxLines(i7);
        } else {
            i9 = i4 & -131073;
            editText.setLines(1);
        }
        if (i11 != 0) {
            editText.setRawInputType(i11);
        } else if (i9 != editText.getInputType()) {
            editText.setInputType(i9);
        }
        if (list2 != null) {
            editText.setFilters((InputFilter[]) list2.toArray(new InputFilter[list.size()]));
        } else {
            editText.setFilters(f19421j);
        }
        editText.setHint(charSequence);
        editText.setBackground(drawable);
        if (drawable2 == null || !drawable.getPadding(f19420i)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i3);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setLongClickable(true);
        editText.setCursorVisible(true);
        ColorStateList colorStateList3 = colorStateList;
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        if (num != null) {
            editText.setHighlightColor(num.intValue());
        }
        editText.setMovementMethod(movementMethod);
        int imeOptions = editText.getImeOptions();
        editText.setImeOptions(i12);
        if (imeOptions != i12) {
            ((InputMethodManager) uVar.f19009b.getSystemService("input_method")).restartInput(editText);
        }
        editText.setError((CharSequence) null, (Drawable) null);
        editText.setEllipsize(truncateAt);
        editText.setTextAlignment(i2);
        if (charSequence3 != null && !C1968c.m5305b(editText.getText().toString(), charSequence2.toString())) {
            editText.setText(charSequence3);
            if (!z2) {
                editText.setSelection(editText.getText().toString().length());
            }
        }
        if (i13 != 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN);
            Drawable textCursorDrawable = editText.getTextCursorDrawable();
            textCursorDrawable.setColorFilter(porterDuffColorFilter);
            editText.setTextCursorDrawable(textCursorDrawable);
            C2043bi.m5531Y(editText, ColorStateList.valueOf(i8));
        }
    }
}
