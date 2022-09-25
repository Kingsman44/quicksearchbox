package androidx.core.p098j;

import android.view.View;
import androidx.p060c.C0984n;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: androidx.core.j.bc */
/* compiled from: PG */
final class C2037bc {
    /* renamed from: a */
    static CharSequence m5487a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: b */
    static Object m5488b(View view, int i) {
        return view.requireViewById(i);
    }

    /* renamed from: c */
    static void m5489c(View view, C2042bh bhVar) {
        C0984n nVar = (C0984n) view.getTag(R.id.tag_unhandled_key_listeners);
        if (nVar == null) {
            nVar = new C0984n(0);
            view.setTag(R.id.tag_unhandled_key_listeners, nVar);
        }
        Objects.requireNonNull(bhVar);
        C2036bb bbVar = new C2036bb(bhVar);
        nVar.put(bhVar, bbVar);
        view.addOnUnhandledKeyEventListener(bbVar);
    }

    /* renamed from: d */
    static void m5490d(View view, C2042bh bhVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0984n nVar = (C0984n) view.getTag(R.id.tag_unhandled_key_listeners);
        if (nVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) nVar.get(bhVar)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    /* renamed from: e */
    static void m5491e(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* renamed from: f */
    static void m5492f(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: g */
    static void m5493g(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* renamed from: h */
    static boolean m5494h(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: i */
    static boolean m5495i(View view) {
        return view.isScreenReaderFocusable();
    }
}
