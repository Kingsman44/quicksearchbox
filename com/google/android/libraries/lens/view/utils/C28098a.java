package com.google.android.libraries.lens.view.utils;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: com.google.android.libraries.lens.view.utils.a */
/* compiled from: PG */
public final class C28098a {
    /* renamed from: a */
    public static boolean m52377a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }
}
