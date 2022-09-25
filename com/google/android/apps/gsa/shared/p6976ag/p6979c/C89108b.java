package com.google.android.apps.gsa.shared.p6976ag.p6979c;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.apps.gsa.shared.ag.c.b */
/* compiled from: PG */
public final class C89108b {

    /* renamed from: a */
    public static final C58528ij f241541a = C58528ij.m90015O(C63490p.VOLUME_LEVEL, C63490p.ALARM_VOLUME, C63490p.CALL_VOLUME, C63490p.MEDIA_VOLUME, C63490p.NOTIFICATION_VOLUME, C63490p.RING_VOLUME, new C63490p[0]);

    /* renamed from: b */
    public static final C58528ij f241542b = C58528ij.m90012L(C63490p.VOLUME_LEVEL, C63490p.MEDIA_VOLUME, C63490p.RING_VOLUME);

    /* renamed from: c */
    public static final C58495hd f241543c;

    /* renamed from: d */
    static final String f241544d = "android.intent.extra.REFERRER_NAME";

    /* renamed from: e */
    static final String f241545e = "android.intent.category.VOICE";

    /* renamed from: f */
    static final String f241546f = "android.settings.VOICE_CONTROL_AIRPLANE_MODE";

    /* renamed from: g */
    static final String f241547g = "android.settings.VOICE_CONTROL_BATTERY_SAVER_MODE";

    /* renamed from: h */
    static final String f241548h = "android.settings.VOICE_CONTROL_DO_NOT_DISTURB_MODE";

    /* renamed from: i */
    static final String f241549i = "android.settings.extra.battery_saver_mode_enabled";

    /* renamed from: j */
    static final String f241550j = "airplane_mode_enabled";

    /* renamed from: k */
    static final String f241551k = "android.settings.extra.do_not_disturb_mode_enabled";

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("content://android.settings.slices/action/wifi", Integer.valueOf(R.drawable.quantum_gm_ic_wifi_gm_grey_36));
        gzVar.mo55429h("content://android.settings.slices/action/bluetooth", Integer.valueOf(R.drawable.quantum_gm_ic_bluetooth_gm_grey_36));
        gzVar.mo55429h("content://android.settings.slices/action/airplane_mode", Integer.valueOf(R.drawable.quantum_gm_ic_airplanemode_active_gm_grey_36));
        gzVar.mo55429h("content://android.settings.slices/action/battery_saver", Integer.valueOf(R.drawable.quantum_gm_ic_battery_saver_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/auto_rotate", Integer.valueOf(R.drawable.quantum_gm_ic_screen_rotation_gm_grey_36));
        Integer valueOf = Integer.valueOf(R.drawable.quantum_gm_ic_do_not_disturb_on_gm_grey_36);
        gzVar.mo55429h("content://com.android.settings.slices/action/zen_mode", valueOf);
        gzVar.mo55429h("content://com.android.settings.slices/action/zen_mode_toggle", valueOf);
        gzVar.mo55429h("content://com.android.settings.slices/action/toggle_nfc", Integer.valueOf(R.drawable.quantum_gm_ic_nfc_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/flashlight", Integer.valueOf(R.drawable.quantum_gm_ic_flashlight_on_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/mobile_data", Integer.valueOf(R.drawable.quantum_gm_ic_signal_cellular_4_bar_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/night_display_activated", Integer.valueOf(R.drawable.quantum_gm_ic_nightlight_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/auto_brightness", Integer.valueOf(R.drawable.quantum_gm_ic_brightness_auto_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/media_volume", Integer.valueOf(R.drawable.quantum_gm_ic_music_note_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/call_volume", Integer.valueOf(R.drawable.quantum_gm_ic_call_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/ring_volume", Integer.valueOf(R.drawable.quantum_gm_ic_notifications_gm_grey_36));
        gzVar.mo55429h("content://com.android.settings.slices/action/alarm_volume", Integer.valueOf(R.drawable.quantum_gm_ic_alarm_gm_grey_36));
        Integer valueOf2 = Integer.valueOf(R.drawable.product_logo_talk_back_color_36);
        gzVar.mo55429h("content://com.android.settings.slices/action/com.google.android.marvin.talkback/com.google.android.marvin.talkback.TalkBackService", valueOf2);
        gzVar.mo55429h("content://com.android.settings.slices/action/com.google.android.marvin.talkback%2Fcom.google.android.marvin.talkback.TalkBackService", valueOf2);
        f241543c = gzVar.mo55427f(false);
    }
}
