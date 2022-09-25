package com.google.android.apps.gsa.shared.bisto;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.shared.bisto.f */
/* compiled from: PG */
public final class C89651f {
    /* renamed from: a */
    public static void m145940a(C88483e eVar, ClientEventData clientEventData) {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.BISTO_WORK_REQUEST;
        gVar.f239204f = "bisto";
        eVar.mo82004b(new ClientConfig(gVar), clientEventData, 50000);
    }

    /* renamed from: b */
    public static boolean m145941b(Intent intent) {
        return "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 2;
    }

    /* renamed from: c */
    public static boolean m145942c(Intent intent) {
        return "android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction());
    }

    /* renamed from: d */
    public static boolean m145943d(Intent intent) {
        return "android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction());
    }

    /* renamed from: e */
    public static boolean m145944e(Intent intent) {
        return "android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1) == 12;
    }

    /* renamed from: f */
    public static boolean m145945f(Intent intent) {
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction()) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction()) || "android.bluetooth.device.action.UUID".equals(intent.getAction()) || "android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction()) || m145941b(intent)) {
            return true;
        }
        return "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 0;
    }

    /* renamed from: g */
    public static boolean m145946g(Intent intent) {
        return "android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1) == 10;
    }

    /* renamed from: h */
    public static boolean m145947h(Intent intent) {
        return "android.intent.action.HEADSET_PLUG".equals(intent.getAction());
    }

    /* renamed from: i */
    public static boolean m145948i(Intent intent) {
        return m145945f(intent) || m145949j(intent) || "bisto_apply_ota".equals(intent.getAction()) || "local_conn".equals(intent.getAction()) || "com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED".equals(intent.getAction()) || "com.google.android.apps.gsa.broadcastreceiver.SETTINGS_CHANGED".equals(intent.getAction()) || "enable_mini_dump".equals(intent.getAction()) || "trigger_mini_dump".equals(intent.getAction()) || "dump_status".equals(intent.getAction()) || "crash".equals(intent.getAction()) || "set_boolean_pref".equals(intent.getAction()) || "set_long_pref".equals(intent.getAction()) || "clear_pref_prefix".equals(intent.getAction()) || "reset_announcements".equals(intent.getAction()) || "action_ota".equals(intent.getAction()) || "action_abort_ota".equals(intent.getAction()) || "update_device_customization".equals(intent.getAction()) || "bypass_oobe".equals(intent.getAction()) || "modify_bisto_db".equals(intent.getAction()) || "com.google.android.apps.gsa.broadcastreceiver.ACTION_OPA_ELIGIBILITY_CHANGE".equals(intent.getAction()) || m145947h(intent) || m145950k(intent) || "android.intent.action.VOICE_COMMAND".equals(intent.getAction());
    }

    /* renamed from: j */
    public static boolean m145949j(Intent intent) {
        return "android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction()) || "android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction());
    }

    /* renamed from: k */
    public static boolean m145950k(Intent intent) {
        return "android.intent.action.USER_PRESENT".equals(intent.getAction());
    }
}
