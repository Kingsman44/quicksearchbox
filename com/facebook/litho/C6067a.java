package com.facebook.litho;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: com.facebook.litho.a */
/* compiled from: PG */
public final class C6067a {

    /* renamed from: a */
    private static volatile boolean f17955a = false;

    /* renamed from: a */
    public static synchronized void m15728a() {
        synchronized (C6067a.class) {
            f17955a = false;
        }
    }

    /* renamed from: b */
    public static boolean m15729b(Context context) {
        return m15730c((AccessibilityManager) context.getSystemService("accessibility"));
    }

    /* renamed from: c */
    public static boolean m15730c(AccessibilityManager accessibilityManager) {
        if (!Boolean.getBoolean("is_accessibility_enabled")) {
            return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        }
        return true;
    }
}
