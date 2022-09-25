package android.support.p033v7.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: android.support.v7.widget.cn */
/* compiled from: PG */
public final class C0571cn {

    /* renamed from: a */
    public static final Rect f2215a = new Rect();

    /* renamed from: b */
    private static final int[] f2216b = {16842912};

    /* renamed from: c */
    private static final int[] f2217c = new int[0];

    /* renamed from: a */
    public static PorterDuff.Mode m2114a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: b */
    public static Rect m2115b(Drawable drawable) {
        Insets a = C0570cm.m2113a(drawable);
        return new Rect(a.left, a.top, a.right, a.bottom);
    }

    /* renamed from: c */
    static void m2116c(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f2216b);
            } else {
                drawable.setState(f2217c);
            }
            drawable.setState(state);
        }
    }
}
