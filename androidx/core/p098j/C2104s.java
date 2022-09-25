package androidx.core.p098j;

import android.view.ViewGroup;

/* renamed from: androidx.core.j.s */
/* compiled from: PG */
public final class C2104s {
    /* renamed from: a */
    static int m5788a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    /* renamed from: b */
    public static int m5789b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* renamed from: c */
    public static int m5790c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* renamed from: d */
    public static void m5791d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    /* renamed from: e */
    static void m5792e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    /* renamed from: f */
    public static void m5793f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    /* renamed from: g */
    public static void m5794g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    /* renamed from: h */
    static boolean m5795h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }
}
