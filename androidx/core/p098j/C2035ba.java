package androidx.core.p098j;

import android.view.View;
import java.util.Collection;

/* renamed from: androidx.core.j.ba */
/* compiled from: PG */
final class C2035ba {
    /* renamed from: a */
    static int m5472a(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: b */
    static int m5473b(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: c */
    static View m5474c(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* renamed from: d */
    static void m5475d(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* renamed from: e */
    static void m5476e(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: f */
    static void m5477f(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* renamed from: g */
    static void m5478g(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* renamed from: h */
    static void m5479h(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* renamed from: i */
    static void m5480i(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* renamed from: j */
    static void m5481j(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* renamed from: k */
    static boolean m5482k(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: l */
    static boolean m5483l(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: m */
    static boolean m5484m(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: n */
    static boolean m5485n(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: o */
    static boolean m5486o(View view) {
        return view.restoreDefaultFocus();
    }
}
