package com.google.android.apps.gsa.shared.p6976ag.p6979c;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.shared.ag.c.e */
/* compiled from: PG */
public final class C89111e {

    /* renamed from: a */
    public static final C59071e f241564a = C59071e.m91332i("com.google.android.apps.gsa.shared.ag.c.e");

    /* renamed from: a */
    public static int m144950a(String str) {
        if (C58837ba.m90859h(str)) {
            return -1;
        }
        if (C63490p.VOLUME_LEVEL.name().equals(str)) {
            return 3;
        }
        if (C63490p.RING_VOLUME.name().equals(str)) {
            return 2;
        }
        if (C63490p.ALARM_VOLUME.name().equals(str)) {
            return 4;
        }
        if (C63490p.CALL_VOLUME.name().equals(str)) {
            return 0;
        }
        if (C63490p.MEDIA_VOLUME.name().equals(str)) {
            return 3;
        }
        if (C63490p.NOTIFICATION_VOLUME.name().equals(str)) {
            return 2;
        }
        return -1;
    }

    /* renamed from: b */
    public static Intent m144951b(C63490p pVar) {
        C63490p pVar2 = C63490p.UNSPECIFIED;
        switch (pVar.ordinal()) {
            case 1:
                C18509a c = C18522b.m35986c();
                ((C18523c) c).f52492a = "about_me";
                return c.mo24020b().mo24031a();
            case 2:
                return new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            case 3:
            case 54:
                return new Intent("android.settings.ASSIST_GESTURE_SETTINGS");
            case 7:
                C18509a c2 = C18522b.m35986c();
                ((C18523c) c2).f52492a = "add_device";
                return c2.mo24020b().mo24031a();
            case 8:
                return new Intent("android.settings.FINGERPRINT_ENROLL");
            case 10:
            case 33:
            case 68:
            case 84:
            case 85:
            case 99:
            case 110:
            case 123:
            case 130:
                return new Intent("android.settings.SOUND_SETTINGS");
            case 13:
            case 106:
            case 116:
                return new Intent("android.settings.DEVICE_INFO_SETTINGS");
            case 15:
            case 40:
                return new Intent("android.settings.DATA_USAGE_SETTINGS");
            case 17:
                C18509a c3 = C18522b.m35986c();
                ((C18523c) c3).f52492a = "app_actions";
                return c3.mo24020b().mo24031a();
            case 18:
                return new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE");
            case 19:
                C18509a c4 = C18522b.m35986c();
                ((C18523c) c4).f52492a = "account";
                return c4.mo24020b().mo24031a();
            case 20:
                C18509a c5 = C18522b.m35986c();
                ((C18523c) c5).f52492a = "avocado";
                return c5.mo24020b().mo24031a();
            case 21:
                C18509a c6 = C18522b.m35986c();
                ((C18523c) c6).f52492a = "language";
                return c6.mo24020b().mo24031a();
            case 22:
                C18509a c7 = C18522b.m35986c();
                ((C18523c) c7).f52492a = "phone_voice_match";
                return c7.mo24020b().mo24031a();
            case 23:
                return new Intent("android.settings.AUTO_ROTATE_SETTINGS");
            case 24:
            case 26:
            case 29:
            case 111:
                return new Intent("android.intent.action.POWER_USAGE_SUMMARY");
            case 28:
                return new Intent("android.settings.BATTERY_SAVER_SETTINGS");
            case 30:
                return new Intent("android.settings.BIOMETRIC_ENROLL");
            case 31:
                return new Intent("android.settings.BLUETOOTH_SETTINGS");
            case 32:
            case 119:
                return new Intent("android.settings.DISPLAY_SETTINGS");
            case 35:
                return new Intent("android.settings.CAST_SETTINGS");
            case 37:
                return new Intent("android.settings.NFC_PAYMENT_SETTINGS");
            case 38:
            case 126:
                return new Intent("android.settings.DATA_ROAMING_SETTINGS");
            case 39:
                return new Intent("android.settings.DATA_SAVER_SETTINGS");
            case 41:
                return new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
            case 42:
                return new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
            case 43:
                return new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            case 45:
                return new Intent("android.settings.ZEN_MODE_PRIORITY_SETTINGS");
            case 48:
            case 56:
            case 96:
                return new Intent("android.settings.TETHER_SETTINGS");
            case 49:
                return new Intent("com.android.settings.action.FACTORY_RESET");
            case 51:
                return new Intent("com.google.android.apps.wellbeing.action.FOCUS_MODE");
            case 53:
            case 91:
            case 133:
                return new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
            case 55:
            case 105:
                return new Intent("com.android.settings.WIFI_TETHER_SETTINGS");
            case 59:
                return new Intent("android.settings.HARD_KEYBOARD_SETTINGS");
            case 61:
                return new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            case 62:
                return new Intent("android.settings.LOCK_SCREEN_SETTINGS");
            case 67:
                return new Intent("android.settings.ACTION_MEDIA_CONTROLS_SETTINGS");
            case 69:
            case 72:
                return new Intent("android.settings.WIRELESS_SETTINGS");
            case 71:
                C18509a c8 = C18522b.m35986c();
                ((C18523c) c8).f52492a = "music";
                return c8.mo24020b().mo24031a();
            case 73:
                return new Intent("android.settings.NFC_SETTINGS");
            case 76:
            case 121:
                return new Intent("android.settings.NIGHT_DISPLAY_SETTINGS");
            case 78:
                try {
                    return Intent.parseUri("intent:#Intent;action=com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS;package=com.google.android.googlequicksearchbox;S.assistant_settings_feature=privacy_advisor;S.assistant_settings_privacy_screen_id=413;B.com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT=true;end", 0);
                } catch (URISyntaxException e) {
                    ((C59052c) ((C59052c) f241564a.mo56226d()).mo56372aa(10978)).mo56354G("Unable to parse intent %s: %s", "intent:#Intent;action=com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS;package=com.google.android.googlequicksearchbox;S.assistant_settings_feature=privacy_advisor;S.assistant_settings_privacy_screen_id=413;B.com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT=true;end", e.getMessage());
                    return null;
                }
            case 79:
                C18509a c9 = C18522b.m35986c();
                ((C18523c) c9).f52492a = "personalization";
                return c9.mo24020b().mo24031a();
            case 80:
                return new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
            case 81:
                return new Intent("android.settings.ACTION_POWER_MENU_SETTINGS");
            case 82:
                C18509a c10 = C18522b.m35986c();
                ((C18523c) c10).f52492a = "reminders";
                return c10.mo24020b().mo24031a();
            case 88:
                return new Intent("android.settings.SETTINGS");
            case 89:
                return new Intent("android.settings.NETWORK_OPERATOR_SETTINGS");
            case 90:
            case 95:
                return new Intent("com.android.settings.TTS_SETTINGS");
            case 101:
                try {
                    return Intent.parseUri("intent://com.google.android.apps.wallpaper#Intent;component=com.google.android.apps.wallpaper/.picker.CategoryPickerActivity;end", 0);
                } catch (URISyntaxException e2) {
                    ((C59052c) ((C59052c) f241564a.mo56226d()).mo56372aa(10977)).mo56354G("Unable to parse intent %s: %s", "intent://com.google.android.apps.wallpaper#Intent;component=com.google.android.apps.wallpaper/.picker.CategoryPickerActivity;end", e2.getMessage());
                    return null;
                }
            case 102:
                return new Intent("android.settings.WEBVIEW_SETTINGS");
            case 103:
                return new Intent("android.settings.WIFI_SETTINGS");
            case 104:
                return new Intent("android.settings.WIFI_CALLING_SETTINGS");
            case 107:
                return new Intent("android.settings.SYNC_SETTINGS");
            case 108:
                return new Intent("android.settings.APPLICATION_SETTINGS");
            case 109:
                C18509a c11 = C18522b.m35986c();
                ((C18523c) c11).f52492a = "main_menu";
                return c11.mo24020b().mo24031a();
            case 112:
                C18509a c12 = C18522b.m35986c();
                ((C18523c) c12).f52492a = "bell_schedule";
                return c12.mo24020b().mo24031a();
            case 113:
                C18509a c13 = C18522b.m35986c();
                ((C18523c) c13).f52492a = "summer_time_mode";
                return c13.mo24020b().mo24031a();
            case 114:
                return new Intent("android.settings.DATE_SETTINGS");
            case 115:
                return new Intent("android.settings.DARK_THEME_SETTINGS");
            case 117:
                return new Intent("android.settings.USER_DICTIONARY_SETTINGS");
            case 118:
                try {
                    return Intent.parseUri("intent://com.google.android.apps.wellbeing#Intent;component=com.google.android.apps.wellbeing/.settings.TopLevelSettingsActivity;end", 0);
                } catch (URISyntaxException e3) {
                    ((C59052c) ((C59052c) f241564a.mo56226d()).mo56372aa(10976)).mo56354G("Unable to parse intent %s: %s", "intent://com.google.android.apps.wellbeing#Intent;component=com.google.android.apps.wellbeing/.settings.TopLevelSettingsActivity;end", e3.getMessage());
                    return null;
                }
            case 120:
                return new Intent("android.settings.LOCALE_SETTINGS");
            case 122:
                return new Intent("android.settings.NOTIFICATION_SETTINGS");
            case 125:
                return new Intent("android.settings.PRIVACY_SETTINGS");
            case 127:
                C18509a c14 = C18522b.m35986c();
                ((C18523c) c14).f52492a = "routines";
                return c14.mo24020b().mo24031a();
            case 129:
                return new Intent("android.settings.SECURITY_SETTINGS");
            case 134:
                return new Intent("android.settings.VPN_SETTINGS");
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static Uri m144952c(String str) {
        if (C58837ba.m90859h(str)) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(str).build();
    }

    /* renamed from: d */
    public static Integer m144953d(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            return null;
        }
        if (i3 < i) {
            i4 = 0;
        } else if (i3 > i2) {
            i4 = 100;
        } else {
            double d = (double) (i3 - i);
            Double.isNaN(d);
            double d2 = (double) (i2 - i);
            Double.isNaN(d2);
            i4 = (int) ((d * 100.0d) / d2);
        }
        return Integer.valueOf(i4);
    }

    /* renamed from: e */
    public static boolean m144954e(Integer num) {
        return num.intValue() >= 0 && num.intValue() <= 100;
    }

    /* renamed from: f */
    static double m144955f(int i, int i2, double d, int i3, int i4, int i5) {
        double d2;
        if (i4 > i5) {
            return C59203do.f157270a;
        }
        int i6 = i5 - i4;
        C63490p pVar = C63490p.UNSPECIFIED;
        int i7 = i2 - 1;
        if (i7 == 1) {
            d *= 0.1d;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 == 4) {
                    return d;
                }
                if (i == 7) {
                    return -1.0d;
                }
                double d3 = (double) i6;
                Double.isNaN(d3);
                return d3 * 0.1d;
            } else if (i3 < i4) {
                return C59203do.f157270a;
            } else {
                if (i3 <= i5) {
                    d2 = (double) (i3 - i4);
                    Double.isNaN(d2);
                    return d * d2;
                }
            }
        }
        d2 = (double) i6;
        Double.isNaN(d2);
        return d * d2;
    }

    /* renamed from: g */
    static int m144956g(int i, int i2, double d, int i3, int i4, int i5) {
        int i6;
        if (i4 > i5) {
            return 0;
        }
        int i7 = i - 1;
        C63490p pVar = C63490p.UNSPECIFIED;
        if (i != 0) {
            if (i7 == 4) {
                i6 = Math.round((float) d) + i3;
            } else if (i7 == 5) {
                i6 = i3 - Math.round((float) d);
            } else if (i7 != 6) {
                return -1;
            } else {
                if (i2 == 5) {
                    i6 = Math.round((float) d);
                } else {
                    double d2 = (double) i4;
                    Double.isNaN(d2);
                    i6 = Math.round((float) (d + d2));
                }
            }
            return Math.min(i5, Math.max(i4, i6));
        }
        throw null;
    }
}
