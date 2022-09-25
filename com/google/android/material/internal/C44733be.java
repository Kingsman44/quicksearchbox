package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.C0735ip;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.internal.be */
/* compiled from: PG */
public final class C44733be {

    /* renamed from: a */
    private static final int[] f116596a = {R.attr.colorPrimary};

    /* renamed from: b */
    private static final int[] f116597b = {R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static TypedArray m79295a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m79299e(context, attributeSet, i, i2);
        m79300f(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static C0735ip m79296b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m79299e(context, attributeSet, i, i2);
        m79300f(context, attributeSet, iArr, i, i2, iArr2);
        return C0735ip.m2473f(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: c */
    public static void m79297c(Context context) {
        m79301g(context, f116596a, "Theme.AppCompat");
    }

    /* renamed from: d */
    public static void m79298d(Context context) {
        m79301g(context, f116597b, "Theme.MaterialComponents");
    }

    /* renamed from: e */
    private static void m79299e(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44717ap.f116570d, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m79298d(context);
            }
        }
        m79297c(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x001d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m79300f(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = com.google.android.material.internal.C44717ap.f116570d
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L_0x001f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L_0x0039
        L_0x001d:
            r2 = 1
            goto L_0x0039
        L_0x001f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            r6 = 0
        L_0x0024:
            if (r6 >= r1) goto L_0x0035
            r7 = r10[r6]
            int r7 = r5.getResourceId(r7, r4)
            if (r7 != r4) goto L_0x0032
            r5.recycle()
            goto L_0x0039
        L_0x0032:
            int r6 = r6 + 1
            goto L_0x0024
        L_0x0035:
            r5.recycle()
            goto L_0x001d
        L_0x0039:
            r0.recycle()
            if (r2 == 0) goto L_0x003f
            return
        L_0x003f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            goto L_0x0048
        L_0x0047:
            throw r5
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C44733be.m79300f(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: g */
    private static void m79301g(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i = 0;
        while (i <= 0) {
            if (obtainStyledAttributes.hasValue(i)) {
                i++;
            } else {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
