package com.google.apps.tiktok.p3663j.p3664a.p3665a;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.google.apps.tiktok.p3663j.p3664a.C47279a;

/* renamed from: com.google.apps.tiktok.j.a.a.a */
/* compiled from: PG */
public final class C47280a implements C47279a {

    /* renamed from: a */
    private final BatteryManager f122930a;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public C47280a(Context context) {
        this.f122930a = (BatteryManager) context.getSystemService("batterymanager");
    }

    /* renamed from: a */
    public final boolean mo51162a() {
        return this.f122930a.isCharging();
    }
}
