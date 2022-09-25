package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C1924a;

/* renamed from: android.support.v7.widget.ik */
/* compiled from: PG */
public final class C0730ik {

    /* renamed from: a */
    static final int[] f2584a = {-16842910};

    /* renamed from: b */
    static final int[] f2585b = {16842908};

    /* renamed from: c */
    static final int[] f2586c = {16842919};

    /* renamed from: d */
    static final int[] f2587d = {16842912};

    /* renamed from: e */
    static final int[] f2588e = new int[0];

    /* renamed from: f */
    private static final ThreadLocal f2589f = new ThreadLocal();

    /* renamed from: g */
    private static final int[] f2590g = new int[1];

    /* renamed from: a */
    public static int m2464a(Context context, int i) {
        ColorStateList c = m2466c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f2584a, c.getDefaultColor());
        }
        ThreadLocal threadLocal = f2589f;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int b = m2465b(context, i);
        return C1924a.m5189h(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: b */
    public static int m2465b(Context context, int i) {
        int[] iArr = f2590g;
        iArr[0] = i;
        C0735ip e = C0735ip.m2472e(context, (AttributeSet) null, iArr);
        try {
            return e.f2596b.getColor(0, 0);
        } finally {
            e.f2596b.recycle();
        }
    }

    /* renamed from: c */
    public static ColorStateList m2466c(Context context, int i) {
        int[] iArr = f2590g;
        iArr[0] = i;
        C0735ip e = C0735ip.m2472e(context, (AttributeSet) null, iArr);
        try {
            return e.mo3245a(0);
        } finally {
            e.f2596b.recycle();
        }
    }

    /* renamed from: d */
    public static void m2467d(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0338a.f1074j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
