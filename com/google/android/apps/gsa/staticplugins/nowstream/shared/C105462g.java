package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91826c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.g */
/* compiled from: PG */
final class C105462g implements C91826c {

    /* renamed from: a */
    final /* synthetic */ C105464i f294099a;

    /* renamed from: b */
    private int f294100b;

    public C105462g(C105464i iVar) {
        this.f294099a = iVar;
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
        if (i2 != 0) {
            if ((i2 > 0 && this.f294100b < 0) || (i2 < 0 && this.f294100b > 0)) {
                this.f294100b = 0;
            }
            int i3 = this.f294100b + i2;
            this.f294100b = i3;
            if (Math.abs(i3) > ViewConfiguration.get(this.f294099a.f294101a).getScaledTouchSlop()) {
                if (this.f294100b < 0) {
                    this.f294099a.mo94793b();
                } else {
                    AccessibilityManager accessibilityManager = (AccessibilityManager) this.f294099a.f294101a.getSystemService("accessibility");
                    if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                        this.f294099a.mo94792a();
                    }
                }
                this.f294100b = 0;
            }
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo86307h(View view, String str, int i) {
    }
}
