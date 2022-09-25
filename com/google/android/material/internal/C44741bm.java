package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2088cv;

/* renamed from: com.google.android.material.internal.bm */
/* compiled from: PG */
public final class C44741bm {
    /* renamed from: a */
    public static float m79308a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static float m79309b(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C2043bi.m5533a((View) parent);
        }
        return f;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m79310c(int i, PorterDuff.Mode mode) {
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

    /* renamed from: d */
    public static InputMethodManager m79311d(View view) {
        return (InputMethodManager) C1878d.m5129b(view.getContext(), InputMethodManager.class);
    }

    /* renamed from: e */
    public static void m79312e(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: f */
    public static void m79313f(View view, C44739bk bkVar) {
        C2043bi.m5555ai(view, new C44737bi(bkVar, new C44740bl(C2043bi.m5583l(view), view.getPaddingTop(), C2043bi.m5582k(view), view.getPaddingBottom())));
        if (C2043bi.m5569aw(view)) {
            C2043bi.m5524R(view);
        } else {
            view.addOnAttachStateChangeListener(new C44738bj());
        }
    }

    /* renamed from: g */
    public static void m79314g(View view, boolean z) {
        C2088cv B;
        if (!z || (B = C2043bi.m5508B(view)) == null) {
            InputMethodManager d = m79311d(view);
            if (d != null) {
                d.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            return;
        }
        B.f5998a.mo5251c();
    }

    /* renamed from: h */
    public static void m79315h(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: i */
    public static void m79316i(View view) {
        view.requestFocus();
        view.post(new C44736bh(view));
    }

    /* renamed from: j */
    public static boolean m79317j(View view) {
        return C2043bi.m5577f(view) == 1;
    }
}
