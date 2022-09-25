package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.b */
/* compiled from: PG */
public final class C90743b {

    /* renamed from: a */
    public final AccessibilityManager f253818a;

    public C90743b(AccessibilityManager accessibilityManager) {
        this.f253818a = accessibilityManager;
    }

    /* renamed from: a */
    public static void m148214a(View view, long j) {
        if (view == null) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            view.postDelayed(new C90715a(view), j);
        }
    }

    /* renamed from: b */
    public final void mo85089b(Context context, String str) {
        if (!C58837ba.m90859h(str) && this.f253818a.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(context.getClass().getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(str);
            this.f253818a.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: c */
    public final boolean mo85090c() {
        return this.f253818a.isEnabled() && this.f253818a.isTouchExplorationEnabled();
    }
}
