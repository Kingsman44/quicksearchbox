package com.google.android.apps.gsa.search.core.p6513aj;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.PowerManager;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.aj.aa */
/* compiled from: PG */
public final class C84516aa {

    /* renamed from: a */
    public final Context f230022a;

    /* renamed from: b */
    public final KeyguardManager f230023b;

    /* renamed from: c */
    private final PowerManager f230024c;

    /* renamed from: d */
    private final DisplayManager f230025d;

    public C84516aa(Context context) {
        this.f230022a = context;
        this.f230024c = (PowerManager) context.getSystemService("power");
        this.f230023b = (KeyguardManager) context.getSystemService("keyguard");
        this.f230025d = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: a */
    public final int mo78227a() {
        if (!this.f230023b.isKeyguardLocked()) {
            return 0;
        }
        C90476a aVar = C91018d.f254254a;
        return this.f230023b.isKeyguardSecure() ? 2 : 1;
    }

    /* renamed from: b */
    public final boolean mo78228b() {
        boolean z = mo78227a() != 0;
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }

    /* renamed from: c */
    public final boolean mo78229c() {
        boolean z = true;
        if (mo78230d() && !mo78228b()) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }

    /* renamed from: e */
    public final void mo78231e(int i) {
        PowerManager powerManager = this.f230024c;
        if (powerManager != null) {
            powerManager.newWakeLock(i, "ScreenStateHelper").acquire(1500);
        }
    }

    /* renamed from: f */
    public final int mo78232f() {
        PowerManager powerManager = this.f230024c;
        if (powerManager == null || !powerManager.isScreenOn()) {
            return 4;
        }
        if (!this.f230023b.isKeyguardLocked()) {
            return 1;
        }
        C90476a aVar = C91018d.f254254a;
        return !this.f230023b.isKeyguardSecure() ? 2 : 3;
    }

    /* renamed from: d */
    public final boolean mo78230d() {
        DisplayManager displayManager = this.f230025d;
        boolean z = true;
        if (!(displayManager == null || displayManager.getDisplay(0).getState() == 2)) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }
}
