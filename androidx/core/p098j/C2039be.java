package androidx.core.p098j;

import android.view.View;
import android.view.WindowInsetsController;

/* renamed from: androidx.core.j.be */
/* compiled from: PG */
final class C2039be {
    /* renamed from: a */
    public static C2088cv m5500a(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new C2088cv(windowInsetsController);
        }
        return null;
    }

    /* renamed from: b */
    static CharSequence m5501b(View view) {
        return view.getStateDescription();
    }

    /* renamed from: c */
    static void m5502c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
