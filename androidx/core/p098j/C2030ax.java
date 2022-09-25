package androidx.core.p098j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1926c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.core.j.ax */
/* compiled from: PG */
final class C2030ax {
    /* renamed from: a */
    static float m5431a(View view) {
        return view.getElevation();
    }

    /* renamed from: b */
    static float m5432b(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: c */
    static float m5433c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    static ColorStateList m5434d(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: e */
    static PorterDuff.Mode m5435e(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: f */
    static C2082cp m5436f(View view, C2082cp cpVar, Rect rect) {
        WindowInsets e = cpVar.mo5243e();
        if (e != null) {
            return C2082cp.m5717h(view.computeSystemWindowInsets(e, rect), view);
        }
        rect.setEmpty();
        return cpVar;
    }

    /* renamed from: g */
    public static C2082cp m5437g(View view) {
        C2073cg cgVar;
        if (!C2070cd.f5972d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = C2070cd.f5969a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) C2070cd.f5970b.get(obj);
            Rect rect2 = (Rect) C2070cd.f5971c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                cgVar = new C2072cf();
            } else {
                cgVar = new C2071ce();
            }
            cgVar.mo5210c(C1926c.m5197c(rect));
            cgVar.mo5212e(C1926c.m5197c(rect2));
            C2082cp a = cgVar.mo5208a();
            a.f5994b.mo5225i(a);
            a.f5994b.mo5222f(view.getRootView());
            return a;
        } catch (IllegalAccessException e) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. ".concat(String.valueOf(e.getMessage())), e);
            return null;
        }
    }

    /* renamed from: h */
    static String m5438h(View view) {
        return view.getTransitionName();
    }

    /* renamed from: i */
    static void m5439i(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: j */
    static void m5440j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: k */
    static void m5441k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: l */
    static void m5442l(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: m */
    static void m5443m(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* renamed from: n */
    static void m5444n(View view, C2010ad adVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, adVar);
        }
        if (adVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new C2029aw(view, adVar));
        }
    }

    /* renamed from: o */
    static void m5445o(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: p */
    static void m5446p(View view, float f) {
        view.setTranslationZ(f);
    }

    /* renamed from: q */
    static void m5447q(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: r */
    static void m5448r(View view) {
        view.stopNestedScroll();
    }

    /* renamed from: s */
    static boolean m5449s(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* renamed from: t */
    static boolean m5450t(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* renamed from: u */
    static boolean m5451u(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* renamed from: v */
    static boolean m5452v(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* renamed from: w */
    static boolean m5453w(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: x */
    static boolean m5454x(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: y */
    static boolean m5455y(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: z */
    static boolean m5456z(View view, int i) {
        return view.startNestedScroll(i);
    }
}
