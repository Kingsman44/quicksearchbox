package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.UserManager;
import com.google.android.apps.gsa.nga.engine.am.an;
import com.google.android.apps.gsa.nga.engine.am.q;
import com.google.android.apps.gsa.nga.engine.am.r;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.am.x.b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5945z.C74980b;
import com.google.android.apps.gsa.nga.engine.p6056o.C76540c;
import com.google.android.apps.gsa.nga.engine.p6056o.C77420n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80282ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80283ae;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52110fp;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52128gg;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import java.util.Locale;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.u */
/* compiled from: PG */
final class C77301u {

    /* renamed from: c */
    public static final /* synthetic */ int f213187c = 0;

    /* renamed from: d */
    private static final C58495hd f213188d;

    /* renamed from: e */
    private static final C58495hd f213189e;

    /* renamed from: f */
    private static final C58495hd f213190f;

    /* renamed from: g */
    private static final C58495hd f213191g;

    /* renamed from: h */
    private static final C58485gu f213192h;

    /* renamed from: i */
    private static final C58495hd f213193i;

    /* renamed from: j */
    private static final C58495hd f213194j;

    /* renamed from: k */
    private static final Intent f213195k;

    /* renamed from: l */
    private static final Intent f213196l;

    /* renamed from: m */
    private static final Intent f213197m;

    /* renamed from: n */
    private static final Intent f213198n;

    /* renamed from: o */
    private static final Intent f213199o;

    /* renamed from: p */
    private static final Intent f213200p;

    /* renamed from: q */
    private static final C58495hd f213201q;

    /* renamed from: r */
    private static final C58495hd f213202r;

    /* renamed from: a */
    public final t f213203a;

    /* renamed from: b */
    public final C81515c f213204b;

    /* renamed from: s */
    private final Context f213205s;

    /* renamed from: t */
    private final BatteryManager f213206t;

    /* renamed from: u */
    private final UserManager f213207u;

    /* renamed from: v */
    private final an f213208v;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C63490p.HOT_SPOT, new C77281a("enable_wifi_ap", R.string.nga_phone_settings_wifi_hotspot_card_display_name));
        gzVar.mo55429h(C63490p.FLASHLIGHT, new C77281a("FLASHLIGHT", R.string.nga_phone_settings_flashlight_card_display_name));
        f213188d = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C63490p.WIFI, Integer.valueOf(R.string.nga_phone_settings_display_name_wifi));
        gzVar2.mo55429h(C63490p.BLUETOOTH, Integer.valueOf(R.string.nga_phone_settings_display_name_bluetooth));
        gzVar2.mo55429h(C63490p.AIRPLANE_MODE, Integer.valueOf(R.string.nga_phone_settings_display_name_airplane_mode));
        gzVar2.mo55429h(C63490p.ADAPTIVE_BRIGHTNESS, Integer.valueOf(R.string.nga_phone_settings_display_name_adaptive_brightness));
        gzVar2.mo55429h(C63490p.BATTERY_SAVER, Integer.valueOf(R.string.nga_phone_settings_display_name_battery_saver));
        gzVar2.mo55429h(C63490p.ACCESSIBILITY, Integer.valueOf(R.string.nga_phone_settings_display_name_accessibility));
        gzVar2.mo55429h(C63490p.AUTO_ROTATE, Integer.valueOf(R.string.nga_phone_settings_display_name_auto_rotate));
        gzVar2.mo55429h(C63490p.DO_NOT_DISTURB, Integer.valueOf(R.string.nga_phone_settings_display_name_dnd));
        gzVar2.mo55429h(C63490p.NFC, Integer.valueOf(R.string.nga_phone_settings_display_name_nfc));
        gzVar2.mo55429h(C63490p.FLASHLIGHT, Integer.valueOf(R.string.nga_phone_settings_display_name_flashlight));
        gzVar2.mo55429h(C63490p.MOBILE_DATA, Integer.valueOf(R.string.nga_phone_settings_display_name_mobile_data));
        C63490p pVar = C63490p.NIGHT_MODE;
        Integer valueOf = Integer.valueOf(R.string.nga_phone_settings_display_name_night_mode);
        gzVar2.mo55429h(pVar, valueOf);
        gzVar2.mo55429h(C63490p.NIGHT_LIGHT_SWITCH, valueOf);
        gzVar2.mo55429h(C63490p.BRIGHTNESS_LEVEL, Integer.valueOf(R.string.nga_phone_settings_brightness_card_display_name));
        C63490p pVar2 = C63490p.VOLUME_LEVEL;
        Integer valueOf2 = Integer.valueOf(R.string.nga_phone_settings_display_name_media_volume);
        gzVar2.mo55429h(pVar2, valueOf2);
        gzVar2.mo55429h(C63490p.MEDIA_VOLUME, valueOf2);
        C63490p pVar3 = C63490p.NOTIFICATION_VOLUME;
        Integer valueOf3 = Integer.valueOf(R.string.nga_phone_settings_display_name_ring_volume);
        gzVar2.mo55429h(pVar3, valueOf3);
        gzVar2.mo55429h(C63490p.RING_VOLUME, valueOf3);
        gzVar2.mo55429h(C63490p.ALARM_VOLUME, Integer.valueOf(R.string.nga_phone_settings_display_name_alarm_volume));
        gzVar2.mo55429h(C63490p.CALL_VOLUME, Integer.valueOf(R.string.nga_phone_settings_display_name_call_volume));
        f213189e = gzVar2.mo55427f(false);
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h(C63490p.BATTERY_SAVER, Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_battery_saver_settings));
        gzVar3.mo55429h(C63490p.BLUETOOTH, Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_bluetooth_settings));
        gzVar3.mo55429h(C63490p.WIFI, Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_wifi_settings));
        gzVar3.mo55429h(C63490p.HOT_SPOT, Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_hotspot_settings));
        gzVar3.mo55429h(C63490p.BRIGHTNESS_LEVEL, Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_display_settings));
        C63490p pVar4 = C63490p.NIGHT_LIGHT_SWITCH;
        Integer valueOf4 = Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_night_light_settings);
        gzVar3.mo55429h(pVar4, valueOf4);
        gzVar3.mo55429h(C63490p.NIGHT_MODE, valueOf4);
        gzVar3.mo55429h(C63490p.DO_NOT_DISTURB, Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_do_not_disturb_settings));
        C63490p pVar5 = C63490p.VOLUME_LEVEL;
        Integer valueOf5 = Integer.valueOf(R.string.nga_fulfiller_suggestion_chip_open_sound_settings);
        gzVar3.mo55429h(pVar5, valueOf5);
        gzVar3.mo55429h(C63490p.MEDIA_VOLUME, valueOf5);
        gzVar3.mo55429h(C63490p.NOTIFICATION_VOLUME, valueOf5);
        gzVar3.mo55429h(C63490p.RING_VOLUME, valueOf5);
        gzVar3.mo55429h(C63490p.ALARM_VOLUME, valueOf5);
        gzVar3.mo55429h(C63490p.CALL_VOLUME, valueOf5);
        f213190f = gzVar3.mo55427f(false);
        C58490gz gzVar4 = new C58490gz(4);
        gzVar4.mo55429h(C63490p.BATTERY_SAVER, "android.settings.BATTERY_SAVER_SETTINGS");
        gzVar4.mo55429h(C63490p.BLUETOOTH, "android.settings.BLUETOOTH_SETTINGS");
        gzVar4.mo55429h(C63490p.WIFI, "android.settings.WIFI_SETTINGS");
        gzVar4.mo55429h(C63490p.HOT_SPOT, "com.android.settings.WIFI_TETHER_SETTINGS");
        gzVar4.mo55429h(C63490p.BRIGHTNESS_LEVEL, "android.settings.DISPLAY_SETTINGS");
        gzVar4.mo55429h(C63490p.NIGHT_LIGHT_SWITCH, "android.settings.NIGHT_DISPLAY_SETTINGS");
        gzVar4.mo55429h(C63490p.NIGHT_MODE, "android.settings.NIGHT_DISPLAY_SETTINGS");
        gzVar4.mo55429h(C63490p.DO_NOT_DISTURB, "android.settings.ZEN_MODE_PRIORITY_SETTINGS");
        gzVar4.mo55429h(C63490p.VOLUME_LEVEL, "android.settings.SOUND_SETTINGS");
        gzVar4.mo55429h(C63490p.MEDIA_VOLUME, "android.settings.SOUND_SETTINGS");
        gzVar4.mo55429h(C63490p.NOTIFICATION_VOLUME, "android.settings.SOUND_SETTINGS");
        gzVar4.mo55429h(C63490p.RING_VOLUME, "android.settings.SOUND_SETTINGS");
        gzVar4.mo55429h(C63490p.ALARM_VOLUME, "android.settings.SOUND_SETTINGS");
        gzVar4.mo55429h(C63490p.CALL_VOLUME, "android.settings.SOUND_SETTINGS");
        f213191g = gzVar4.mo55427f(false);
        C58485gu o = C58485gu.m89847o("no_adjust_volume", "disallow_unmute_device");
        f213192h = o;
        C58490gz gzVar5 = new C58490gz(4);
        gzVar5.mo55429h(C63490p.AIRPLANE_MODE, C58485gu.m89846n("no_airplane_mode"));
        gzVar5.mo55429h(C63490p.ALARM_VOLUME, o);
        gzVar5.mo55429h(C63490p.BLUETOOTH, C58485gu.m89846n("no_bluetooth"));
        gzVar5.mo55429h(C63490p.BRIGHTNESS_LEVEL, C58485gu.m89846n("no_config_brightness"));
        gzVar5.mo55429h(C63490p.CALL_VOLUME, o);
        gzVar5.mo55429h(C63490p.HOT_SPOT, C58485gu.m89846n("no_config_tethering"));
        gzVar5.mo55429h(C63490p.MOBILE_DATA, C58485gu.m89846n("no_config_mobile_networks"));
        gzVar5.mo55429h(C63490p.NFC, C58485gu.m89846n("no_outgoing_beam"));
        gzVar5.mo55429h(C63490p.NOTIFICATION_VOLUME, o);
        gzVar5.mo55429h(C63490p.RING_VOLUME, o);
        gzVar5.mo55429h(C63490p.SOUND, o);
        gzVar5.mo55429h(C63490p.VOLUME_LEVEL, o);
        gzVar5.mo55429h(C63490p.WIFI, C58485gu.m89846n("no_config_wifi"));
        f213193i = gzVar5.mo55427f(false);
        C58490gz gzVar6 = new C58490gz(4);
        gzVar6.mo55429h(C63490p.ACCESSIBILITY, 23094);
        gzVar6.mo55429h(C63490p.ADAPTIVE_BRIGHTNESS, 81993);
        gzVar6.mo55429h(C63490p.AIRPLANE_MODE, 23095);
        gzVar6.mo55429h(C63490p.ALARM_VOLUME, 23103);
        gzVar6.mo55429h(C63490p.AUTO_ROTATE, 81994);
        gzVar6.mo55429h(C63490p.BATTERY_SAVER, 23096);
        gzVar6.mo55429h(C63490p.BLUETOOTH, 23097);
        gzVar6.mo55429h(C63490p.BRIGHTNESS_LEVEL, 23098);
        gzVar6.mo55429h(C63490p.CALL_VOLUME, 23103);
        gzVar6.mo55429h(C63490p.DO_NOT_DISTURB, 81991);
        gzVar6.mo55429h(C63490p.FLASHLIGHT, 23100);
        gzVar6.mo55429h(C63490p.HOT_SPOT, 81992);
        gzVar6.mo55429h(C63490p.LOCATION, 23101);
        gzVar6.mo55429h(C63490p.MEDIA_VOLUME, 23103);
        gzVar6.mo55429h(C63490p.MOBILE_DATA, 81995);
        gzVar6.mo55429h(C63490p.NFC, 23102);
        gzVar6.mo55429h(C63490p.NIGHT_LIGHT_SWITCH, 81996);
        gzVar6.mo55429h(C63490p.NIGHT_MODE, 81996);
        gzVar6.mo55429h(C63490p.NOTIFICATION_VOLUME, 23103);
        gzVar6.mo55429h(C63490p.RING_VOLUME, 23103);
        gzVar6.mo55429h(C63490p.SOUND, 23103);
        gzVar6.mo55429h(C63490p.VOLUME_LEVEL, 23103);
        gzVar6.mo55429h(C63490p.WIFI, 23104);
        f213194j = gzVar6.mo55427f(false);
        Intent intent = new Intent("android.settings.DISPLAY_SETTINGS");
        f213195k = intent;
        Intent intent2 = new Intent("android.settings.NIGHT_DISPLAY_SETTINGS");
        f213196l = intent2;
        Intent intent3 = new Intent("android.settings.SOUND_SETTINGS");
        f213197m = intent3;
        Intent component = new Intent().setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.settings.AssistantAndroidSettingsActivity"));
        f213198n = component;
        Intent component2 = new Intent().setAction("android.intent.action.MAIN").setComponent(new ComponentName("com.android.phone", "com.android.phone.MobileNetworkSettings"));
        f213199o = component2;
        Intent component3 = new Intent().setComponent(new ComponentName("com.google.android.apps.wellbeing", "com.google.android.apps.wellbeing.settings.TopLevelSettingsActivity"));
        f213200p = component3;
        C58490gz gzVar7 = new C58490gz(4);
        gzVar7.mo55429h(C63490p.ABOUT_PHONE, new Intent("android.settings.DEVICE_INFO_SETTINGS"));
        gzVar7.mo55429h(C63490p.ACCESSIBILITY, new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
        gzVar7.mo55429h(C63490p.ACCOUNTS, new Intent("android.settings.SYNC_SETTINGS"));
        gzVar7.mo55429h(C63490p.ACTIVE_EDGE, new Intent("android.settings.ASSIST_GESTURE_SETTINGS"));
        gzVar7.mo55429h(C63490p.ADAPTIVE_BRIGHTNESS, intent);
        gzVar7.mo55429h(C63490p.ADD_FINGERPRINT, new Intent("android.settings.FINGERPRINT_ENROLL"));
        gzVar7.mo55429h(C63490p.AIRPLANE_MODE, new Intent("android.settings.WIRELESS_SETTINGS"));
        gzVar7.mo55429h(C63490p.APPLICATION, new Intent("android.settings.APPLICATION_SETTINGS"));
        gzVar7.mo55429h(C63490p.ASSISTANT, component);
        gzVar7.mo55429h(C63490p.AUDIO, intent3);
        gzVar7.mo55429h(C63490p.AUTO_ROTATE, intent);
        gzVar7.mo55429h(C63490p.BATTERY, new Intent("android.intent.action.POWER_USAGE_SUMMARY"));
        gzVar7.mo55429h(C63490p.BATTERY_SAVER, new Intent("android.settings.BATTERY_SAVER_SETTINGS"));
        gzVar7.mo55429h(C63490p.BLUETOOTH, new Intent("android.settings.BLUETOOTH_SETTINGS"));
        gzVar7.mo55429h(C63490p.CONTINUED_CONVERSATION, component);
        gzVar7.mo55429h(C63490p.DARK_THEME, intent);
        gzVar7.mo55429h(C63490p.DATA_ROAMING, component2);
        gzVar7.mo55429h(C63490p.DATA_SAVER, new Intent("android.settings.DATA_SAVER_SETTINGS"));
        gzVar7.mo55429h(C63490p.DATE_TIME, new Intent("android.settings.DATE_SETTINGS"));
        gzVar7.mo55429h(C63490p.DEVICE_INFO, new Intent("android.settings.DEVICE_INFO_SETTINGS"));
        gzVar7.mo55429h(C63490p.DICTIONARY, new Intent("android.settings.USER_DICTIONARY_SETTINGS"));
        gzVar7.mo55429h(C63490p.DIGITAL_WELLBEING, component3);
        gzVar7.mo55429h(C63490p.DISPLAY, intent);
        gzVar7.mo55429h(C63490p.HOT_SPOT, new Intent("com.android.settings.WIFI_TETHER_SETTINGS"));
        gzVar7.mo55429h(C63490p.LANGUAGE, new Intent("android.settings.LOCALE_SETTINGS"));
        gzVar7.mo55429h(C63490p.LOCATION, new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        gzVar7.mo55429h(C63490p.NFC, new Intent("android.settings.NFC_SETTINGS"));
        gzVar7.mo55429h(C63490p.NIGHT_LIGHT, intent2);
        gzVar7.mo55429h(C63490p.NIGHT_MODE, intent2);
        gzVar7.mo55429h(C63490p.NOTIFICATION, new Intent("android.settings.NOTIFICATION_SETTINGS"));
        gzVar7.mo55429h(C63490p.PHONE_RINGTONE, intent3);
        gzVar7.mo55429h(C63490p.PRIVACY, new Intent("android.settings.PRIVACY_SETTINGS"));
        gzVar7.mo55429h(C63490p.RINGTONE, intent3);
        gzVar7.mo55429h(C63490p.ROAMING, component2);
        gzVar7.mo55429h(C63490p.SECURITY, new Intent("android.settings.SECURITY_SETTINGS"));
        gzVar7.mo55429h(C63490p.SOUND, intent3);
        gzVar7.mo55429h(C63490p.STORAGE, new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
        gzVar7.mo55429h(C63490p.TEXT_TO_SPEECH, new Intent("android.settings.TTS_SETTINGS"));
        gzVar7.mo55429h(C63490p.VPN, new Intent("android.settings.VPN_SETTINGS"));
        gzVar7.mo55429h(C63490p.WIFI, new Intent("android.settings.WIFI_SETTINGS"));
        gzVar7.mo55429h(C63490p.WIFI_HOTSPOT, new Intent("com.android.settings.WIFI_TETHER_SETTINGS"));
        f213201q = gzVar7.mo55427f(false);
        C58490gz gzVar8 = new C58490gz(4);
        gzVar8.mo55429h(C63490p.DARK_THEME, Integer.valueOf(R.string.nga_phone_search_fallback_dark_theme));
        gzVar8.mo55429h(C63490p.SPELL_CHECKER, Integer.valueOf(R.string.nga_phone_search_fallback_spell_check));
        f213202r = gzVar8.mo55427f(false);
    }

    public C77301u(Context context, t tVar, an anVar, C81515c cVar) {
        this.f213205s = context;
        this.f213206t = (BatteryManager) context.getSystemService(BatteryManager.class);
        this.f213207u = (UserManager) context.getSystemService(UserManager.class);
        this.f213203a = tVar;
        this.f213208v = anVar;
        this.f213204b = cVar;
    }

    /* renamed from: p */
    static boolean m124047p(Optional optional) {
        return optional.isPresent() && ((C74980b) optional.get()).mo71364b() == 3 && ((C74980b) optional.get()).mo71363a() > 1.0d;
    }

    /* renamed from: t */
    private static boolean m124048t(C63490p pVar) {
        if ((b.a.containsKey(pVar) || b.b.containsKey(pVar)) && pVar != C63490p.FLASHLIGHT) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo72497a(C63490p pVar, Locale locale) {
        return this.f213204b.mo75121a(locale).getString(((Integer) f213189e.getOrDefault(pVar, Integer.valueOf(R.string.nga_phone_settings_display_name_default))).intValue(), new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo72498b(C80399l lVar, Intent intent, C74965n nVar) {
        lVar.mo74319k(41285);
        if (Build.VERSION.SDK_INT == 29) {
            intent.addFlags(32768);
        }
        C81442m.m129557s(lVar, t.u(intent, 1, nVar.mo71336k(), false, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo72499c(C80399l lVar, C63490p pVar, Locale locale) {
        C52128gg ggVar = (C52128gg) C52131gj.f136789h.createBuilder();
        ggVar.copyOnWrite();
        C52131gj gjVar = (C52131gj) ggVar.instance;
        gjVar.f136795e = 1;
        gjVar.f136791a |= 8;
        String name = pVar.name();
        ggVar.copyOnWrite();
        C52131gj gjVar2 = (C52131gj) ggVar.instance;
        name.getClass();
        gjVar2.f136791a |= 32;
        gjVar2.f136797g = name;
        String a = mo72497a(pVar, locale);
        ggVar.copyOnWrite();
        C52131gj gjVar3 = (C52131gj) ggVar.instance;
        a.getClass();
        gjVar3.f136791a |= 2;
        gjVar3.f136793c = a;
        if (m124048t(pVar)) {
            b.a(pVar).ifPresent(new C77299s(ggVar));
        }
        C81442m.m129557s(lVar, t.l((C52131gj) ggVar.build()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo72500d(C80399l lVar, Locale locale, boolean z) {
        String str;
        if (this.f213208v.g) {
            str = this.f213204b.mo75121a(locale).getString(true != z ? R.string.nga_phone_settings_flashlight_turned_off : R.string.nga_phone_settings_flashlight_turned_on, new Object[0]);
        } else {
            str = this.f213204b.mo75121a(locale).getString(true != z ? R.string.nga_phone_settings_cant_turn_off_flashlight_with_camera : R.string.nga_phone_settings_cant_turn_on_flashlight_with_camera, new Object[0]);
        }
        C81442m.m129557s(lVar, t.r(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo72501e(C80399l lVar, Locale locale) {
        C81442m.m129557s(lVar, t.r(this.f213204b.mo75121a(locale).getString(R.string.nga_phone_settings_cant_change_setting_restricted, new Object[0])));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo72502f(C80399l lVar, Locale locale, C63490p pVar, boolean z) {
        String str;
        String a = mo72497a(pVar, locale);
        if (z) {
            Object[] objArr = {a};
            str = this.f213204b.mo75121a(locale).getString(R.string.nga_phone_settings_cant_turn_on_setting_restricted, objArr);
        } else {
            Object[] objArr2 = {a};
            str = this.f213204b.mo75121a(locale).getString(R.string.nga_phone_settings_cant_turn_off_setting_restricted, objArr2);
        }
        C81442m.m129557s(lVar, t.r(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo72503g(C80399l lVar, C63490p pVar, boolean z) {
        if (pVar == C63490p.FLASHLIGHT && !this.f213208v.g) {
            return;
        }
        if (pVar != C63490p.BATTERY_SAVER || !mo72510n()) {
            lVar.mo74319k(41280);
            Optional ofNullable = Optional.ofNullable((Integer) f213194j.get(pVar));
            Objects.requireNonNull(lVar);
            ofNullable.ifPresent(new C77296p(lVar));
            if (pVar == C63490p.FLASHLIGHT) {
                C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
                C80282ad adVar = (C80282ad) C80283ae.f220302b.createBuilder();
                adVar.copyOnWrite();
                ((C80283ae) adVar.instance).f220304a = z;
                aoVar.copyOnWrite();
                C80295aq aqVar = (C80295aq) aoVar.instance;
                C80283ae aeVar = (C80283ae) adVar.build();
                aeVar.getClass();
                aqVar.f220360b = aeVar;
                aqVar.f220359a = 20;
                C81442m.m129555q(lVar, aoVar);
            } else if (pVar == C63490p.HOT_SPOT) {
                C52110fp fpVar = (C52110fp) C52115fu.f136753n.createBuilder();
                int i = true != z ? 3 : 2;
                fpVar.copyOnWrite();
                C52115fu fuVar = (C52115fu) fpVar.instance;
                fuVar.f136757c = i - 1;
                fuVar.f136755a |= 2;
                String name = C63490p.HOT_SPOT.name();
                fpVar.copyOnWrite();
                C52115fu fuVar2 = (C52115fu) fpVar.instance;
                name.getClass();
                fuVar2.f136755a |= 16;
                fuVar2.f136760f = name;
                fpVar.copyOnWrite();
                C52115fu fuVar3 = (C52115fu) fpVar.instance;
                fuVar3.f136755a |= 1;
                fuVar3.f136756b = "enable_wifi_ap";
                C81442m.m129557s(lVar, t.c((C52115fu) fpVar.build()));
            } else {
                t.q(pVar, z).ifPresent(new C77297q(lVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo72504h(C80399l lVar, C77420n nVar, boolean z) {
        lVar.mo74319k(41281);
        C76540c cVar = (C76540c) nVar;
        Optional ofNullable = Optional.ofNullable((Integer) f213194j.get(cVar.f211762a));
        Objects.requireNonNull(lVar);
        ofNullable.ifPresent(new C77296p(lVar));
        C63490p pVar = cVar.f211762a;
        double a = cVar.f211763b.mo71363a();
        C52110fp fpVar = (C52110fp) C52115fu.f136753n.createBuilder();
        int i = true != z ? 6 : 5;
        fpVar.copyOnWrite();
        C52115fu fuVar = (C52115fu) fpVar.instance;
        fuVar.f136757c = i - 1;
        fuVar.f136755a |= 2;
        fpVar.copyOnWrite();
        C52115fu fuVar2 = (C52115fu) fpVar.instance;
        fuVar2.f136755a |= 4;
        fuVar2.f136758d = a;
        fpVar.copyOnWrite();
        C52115fu fuVar3 = (C52115fu) fpVar.instance;
        fuVar3.f136759e = 2;
        fuVar3.f136755a |= 8;
        String name = pVar.name();
        fpVar.copyOnWrite();
        C52115fu fuVar4 = (C52115fu) fpVar.instance;
        name.getClass();
        fuVar4.f136755a |= 16;
        fuVar4.f136760f = name;
        b.a(pVar).ifPresent(new q(fpVar));
        C81442m.m129557s(lVar, t.c((C52115fu) fpVar.build()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo72505i(C63490p pVar, C80399l lVar, Locale locale) {
        C51986gl glVar;
        C58495hd hdVar = f213190f;
        if (hdVar.containsKey(pVar)) {
            C58495hd hdVar2 = f213191g;
            if (hdVar2.containsKey(pVar)) {
                Integer num = (Integer) hdVar.get(pVar);
                if (num == null || num.intValue() == 0) {
                    glVar = C51986gl.f136421f;
                } else {
                    C80595f e = C80595f.m128215e(C80590x.CLIENT_OP_SUGGESTION_ON_DEVICE, R.drawable.quantum_ic_settings_grey600_18, this.f213204b.mo75121a(locale).getString(num.intValue(), new Object[0]));
                    e.mo74361h(27105);
                    glVar = C80600k.m128226a(e.mo74357a(new Intent((String) Objects.requireNonNull((String) hdVar2.get(pVar)))).mo74356a());
                }
                if (glVar.f136424b.size() != 0) {
                    C81442m.m129557s(lVar, t.n(glVar));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo72506j(C80399l lVar, C63490p pVar, boolean z) {
        lVar.mo74319k(true != z ? 24454 : 24453);
        t.q(pVar, !z).ifPresent(new C77298r(lVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo72507k(C80399l lVar, C77420n nVar) {
        lVar.mo74319k(41281);
        C76540c cVar = (C76540c) nVar;
        Optional ofNullable = Optional.ofNullable((Integer) f213194j.get(cVar.f211762a));
        Objects.requireNonNull(lVar);
        ofNullable.ifPresent(new C77296p(lVar));
        C63490p pVar = cVar.f211762a;
        double a = cVar.f211763b.mo71363a();
        C52110fp fpVar = (C52110fp) C52115fu.f136753n.createBuilder();
        fpVar.copyOnWrite();
        C52115fu fuVar = (C52115fu) fpVar.instance;
        fuVar.f136757c = 6;
        fuVar.f136755a |= 2;
        fpVar.copyOnWrite();
        C52115fu fuVar2 = (C52115fu) fpVar.instance;
        fuVar2.f136755a |= 4;
        fuVar2.f136758d = a;
        fpVar.copyOnWrite();
        C52115fu fuVar3 = (C52115fu) fpVar.instance;
        fuVar3.f136759e = 2;
        fuVar3.f136755a |= 8;
        String name = pVar.name();
        fpVar.copyOnWrite();
        C52115fu fuVar4 = (C52115fu) fpVar.instance;
        name.getClass();
        fuVar4.f136755a |= 16;
        fuVar4.f136760f = name;
        b.a(pVar).ifPresent(new r(fpVar));
        C81442m.m129557s(lVar, t.c((C52115fu) fpVar.build()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo72508l(C80399l lVar, C63490p pVar, Locale locale) {
        Optional optional;
        if (!m124048t(pVar)) {
            return false;
        }
        String a = mo72497a(pVar, locale);
        Optional a2 = b.a(pVar);
        if (a2.isEmpty()) {
            optional = Optional.empty();
        } else {
            C52128gg ggVar = (C52128gg) C52131gj.f136789h.createBuilder();
            ggVar.copyOnWrite();
            C52131gj gjVar = (C52131gj) ggVar.instance;
            a.getClass();
            gjVar.f136791a |= 2;
            gjVar.f136793c = a;
            String uri = ((Uri) a2.get()).toString();
            ggVar.copyOnWrite();
            C52131gj gjVar2 = (C52131gj) ggVar.instance;
            uri.getClass();
            gjVar2.f136791a |= 16;
            gjVar2.f136796f = uri;
            optional = Optional.m71637of(t.l((C52131gj) ggVar.build()));
        }
        if (!optional.isPresent()) {
            return false;
        }
        C81442m.m129557s(lVar, (C51809dy) optional.get());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo72509m(C80399l lVar, C63490p pVar, Locale locale) {
        C58495hd hdVar = f213188d;
        C77300t tVar = (C77300t) hdVar.get(pVar);
        if (tVar == null || !hdVar.containsKey(pVar) || (pVar == C63490p.FLASHLIGHT && (((UserManager) this.f213205s.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) != 0 || !this.f213208v.g))) {
            return false;
        }
        C52128gg ggVar = (C52128gg) C52131gj.f136789h.createBuilder();
        ggVar.copyOnWrite();
        C52131gj gjVar = (C52131gj) ggVar.instance;
        gjVar.f136795e = 0;
        gjVar.f136791a |= 8;
        String name = pVar.name();
        ggVar.copyOnWrite();
        C52131gj gjVar2 = (C52131gj) ggVar.instance;
        name.getClass();
        gjVar2.f136791a |= 32;
        gjVar2.f136797g = name;
        String b = tVar.mo72493b();
        ggVar.copyOnWrite();
        C52131gj gjVar3 = (C52131gj) ggVar.instance;
        b.getClass();
        gjVar3.f136791a |= 1;
        gjVar3.f136792b = b;
        String string = this.f213204b.mo75121a(locale).getString(tVar.mo72492a(), new Object[0]);
        ggVar.copyOnWrite();
        C52131gj gjVar4 = (C52131gj) ggVar.instance;
        string.getClass();
        gjVar4.f136791a |= 2;
        gjVar4.f136793c = string;
        C81442m.m129557s(lVar, t.l((C52131gj) ggVar.build()));
        return true;
    }

    /* renamed from: n */
    public final boolean mo72510n() {
        BatteryManager batteryManager = this.f213206t;
        return batteryManager != null && batteryManager.isCharging();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo72511o(C63490p pVar) {
        if (this.f213207u == null) {
            return false;
        }
        C58495hd hdVar = f213193i;
        if (hdVar.containsKey(pVar)) {
            Bundle userRestrictions = this.f213207u.getUserRestrictions();
            C58485gu guVar = (C58485gu) hdVar.get(pVar);
            if (guVar == null) {
                return false;
            }
            int size = guVar.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (userRestrictions.getBoolean((String) guVar.get(i))) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo72512q(C80399l lVar, C63490p pVar, C74965n nVar) {
        Integer num = (Integer) f213202r.get(pVar);
        if (num == null) {
            return false;
        }
        mo72514s(lVar, this.f213204b.mo75121a(nVar.mo71342q()).getString(num.intValue(), new Object[0]), nVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo72513r(C80399l lVar, C63490p pVar, C74965n nVar, C91142g gVar) {
        Intent intent = (Intent) f213201q.get(pVar);
        if (intent == null) {
            return false;
        }
        if (pVar == C63490p.CONTINUED_CONVERSATION || (pVar == C63490p.ASSISTANT && !gVar.mo85405j(C90126fx.f251762ot))) {
            lVar.copyOnWrite();
            C80401n nVar2 = C80401n.f220656k;
            ((C80401n) lVar.instance).f220663f = true;
        }
        mo72498b(lVar, intent, nVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo72514s(C80399l lVar, String str, C74965n nVar) {
        lVar.mo74319k(41284);
        C81442m.m129557s(lVar, t.u(new Intent("android.settings.APP_SEARCH_SETTINGS").addFlags(335544320).putExtra("query", str), 1, nVar.mo71336k(), false, false));
    }
}
