package androidx.core.widget;

import android.widget.PopupWindow;

/* renamed from: androidx.core.widget.s */
/* compiled from: PG */
public final class C2132s {
    /* renamed from: a */
    static int m5902a(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* renamed from: b */
    public static void m5903b(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    /* renamed from: c */
    public static void m5904c(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    /* renamed from: d */
    static boolean m5905d(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }
}
