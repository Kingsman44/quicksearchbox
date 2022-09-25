package org.chromium.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Handler;
import android.os.PowerManager;
import p000J.C0000N;

/* compiled from: PG */
public class PowerMonitor {

    /* renamed from: a */
    private static PowerMonitor f192504a;

    /* renamed from: b */
    private boolean f192505b;

    private PowerMonitor() {
    }

    /* renamed from: a */
    public static void m107026a() {
        if (f192504a == null) {
            Context context = C72382h.f192527a;
            f192504a = new PowerMonitor();
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), (String) null, (Handler) null, 4);
            if (registerReceiver != null) {
                boolean z = false;
                if (registerReceiver.getIntExtra("plugged", 0) == 0) {
                    z = true;
                }
                m107027b(z);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            context.registerReceiver(new C72392r(), intentFilter, (String) null, (Handler) null, 4);
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                powerManager.addThermalStatusListener(new C72393s());
            }
        }
    }

    /* renamed from: b */
    public static void m107027b(boolean z) {
        f192504a.f192505b = z;
        C0000N.MCImhGql();
    }

    private static int getCurrentThermalStatus() {
        if (f192504a == null) {
            m107026a();
        }
        PowerManager powerManager = (PowerManager) C72382h.f192527a.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return powerManager.getCurrentThermalStatus();
    }

    private static int getRemainingBatteryCapacity() {
        if (f192504a == null) {
            m107026a();
        }
        return ((BatteryManager) C72382h.f192527a.getSystemService("batterymanager")).getIntProperty(1);
    }

    private static boolean isBatteryPower() {
        if (f192504a == null) {
            m107026a();
        }
        return f192504a.f192505b;
    }
}
