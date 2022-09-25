package androidx.core.p098j;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.j.bs */
/* compiled from: PG */
public final class C2053bs {
    /* renamed from: a */
    public static void m5621a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C2007aa) {
            ((C2007aa) viewParent).mo1848d(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                C2052br.m5614a(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: b */
    public static void m5622b(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C2008ab) {
            ((C2008ab) viewParent2).mo1851f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C2007aa) {
            ((C2007aa) viewParent2).mo1850e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                C2052br.m5615b(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                AbstractMethodError abstractMethodError = e;
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    /* renamed from: c */
    public static void m5623c(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C2007aa) {
            ((C2007aa) viewParent).mo1852g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                C2052br.m5616c(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: d */
    public static void m5624d(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C2007aa) {
            ((C2007aa) viewParent).mo1857h(view, i);
        } else if (i == 0) {
            try {
                C2052br.m5617d(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    /* renamed from: e */
    public static boolean m5625e(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return C2052br.m5618e(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m5626f(ViewParent viewParent, View view, float f, float f2) {
        try {
            return C2052br.m5619f(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m5627g(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C2007aa) {
            return ((C2007aa) viewParent).mo1884t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C2052br.m5620g(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }
}
