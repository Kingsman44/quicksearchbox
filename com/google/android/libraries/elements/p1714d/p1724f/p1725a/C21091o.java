package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import android.view.accessibility.AccessibilityManager;

/* renamed from: com.google.android.libraries.elements.d.f.a.o */
/* compiled from: PG */
final class C21091o {

    /* renamed from: a */
    private final AccessibilityManager f59118a;

    /* renamed from: b */
    private boolean f59119b = true;

    /* renamed from: c */
    private Boolean f59120c = null;

    public C21091o(AccessibilityManager accessibilityManager) {
        this.f59118a = accessibilityManager;
    }

    /* renamed from: a */
    public final synchronized Boolean mo26147a() {
        if (this.f59119b) {
            this.f59120c = Boolean.valueOf(this.f59118a.isTouchExplorationEnabled());
            this.f59119b = false;
        }
        return this.f59120c;
    }

    /* renamed from: b */
    public final synchronized void mo26148b() {
        this.f59119b = true;
    }
}
