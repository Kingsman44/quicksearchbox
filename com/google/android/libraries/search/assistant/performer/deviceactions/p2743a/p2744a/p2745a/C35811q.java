package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import com.google.android.libraries.p1623at.p1632e.C19557e;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35864u;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.assistant.p3897e.p3921j.C52114ft;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60757n;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.q */
/* compiled from: PG */
final class C35811q {

    /* renamed from: a */
    public static final C58495hd f93820a;

    /* renamed from: b */
    private static final C59071e f93821b = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.q");

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C63490p.BRIGHTNESS_LEVEL.name(), "screen_brightness");
        gzVar.mo55429h(C63490p.SCREEN_TIMEOUT.name(), "screen_off_timeout");
        f93820a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static String m64223a(C52115fu fuVar, String str) {
        int a;
        int a2;
        int i = 1;
        if (fuVar.f136760f.equals(C63490p.BRIGHTNESS_LEVEL.name())) {
            int a3 = C19557e.m37299a("config_screenBrightnessSettingMinimum", 1);
            int a4 = C19557e.m37299a("config_screenBrightnessSettingMaximum", PrivateKeyType.INVALID);
            int b = C52112fr.m86508b(fuVar.f136757c);
            int i2 = b == 0 ? 1 : b;
            int a5 = C52114ft.m86509a(fuVar.f136759e);
            if (a5 != 0) {
                i = a5;
            }
            double d = fuVar.f136758d;
            int i3 = i2;
            int i4 = i;
            int parseInt = Integer.parseInt(str);
            int i5 = a3;
            int i6 = a4;
            int f = C35864u.m64264f(i3, i4, C35864u.m64263e(i3, i4, d, parseInt, i5, i6), parseInt, i5, i6);
            if (f != -1) {
                return String.valueOf(f);
            }
            C59104x d2 = f93821b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d2).mo56372aa(52054)).mo56389s("Unable to get slider target value for setting %s", fuVar.f136760f);
            return null;
        }
        int b2 = C52112fr.m86508b(fuVar.f136757c);
        if (b2 == 0) {
            b2 = 1;
        }
        int i7 = b2 - 1;
        if (i7 == 4) {
            int i8 = fuVar.f136755a;
            if ((i8 & 4) != 0 && (a = C52114ft.m86509a(fuVar.f136759e)) != 0 && a == 5) {
                double parseInt2 = (double) Integer.parseInt(str);
                double d3 = fuVar.f136758d;
                Double.isNaN(parseInt2);
                return String.valueOf(Math.round(parseInt2 + d3));
            } else if ((i8 & 128) != 0) {
                return String.valueOf(C60757n.m92748i(((long) Integer.parseInt(str)) + fuVar.f136763i));
            } else {
                C59104x d4 = f93821b.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "SystemSettings");
                ((C59052c) ((C59052c) d4).mo56372aa(52050)).mo56389s("Missing or invalid value for setting %s", fuVar.f136760f);
                return null;
            }
        } else if (i7 == 5) {
            int i9 = fuVar.f136755a;
            if ((i9 & 4) != 0 && (a2 = C52114ft.m86509a(fuVar.f136759e)) != 0 && a2 == 5) {
                double parseInt3 = (double) Integer.parseInt(str);
                double d5 = fuVar.f136758d;
                Double.isNaN(parseInt3);
                return String.valueOf(Math.round(parseInt3 - d5));
            } else if ((i9 & 128) != 0) {
                return String.valueOf(((long) Integer.parseInt(str)) - fuVar.f136763i);
            } else {
                C59104x d6 = f93821b.mo56226d();
                d6.mo56378ag(C58975e.f156826a, "SystemSettings");
                ((C59052c) ((C59052c) d6).mo56372aa(52051)).mo56389s("Missing or invalid value for setting %s", fuVar.f136760f);
                return null;
            }
        } else if (i7 != 6) {
            C59104x d7 = f93821b.mo56226d();
            d7.mo56378ag(C58975e.f156826a, "SystemSettings");
            C59052c cVar = (C59052c) ((C59052c) d7).mo56372aa(52049);
            int b3 = C52112fr.m86508b(fuVar.f136757c);
            if (b3 != 0) {
                i = b3;
            }
            cVar.mo56354G("Unsupported change type %s for setting %s", C52112fr.m86507a(i), fuVar.f136760f);
            return null;
        } else {
            int i10 = fuVar.f136755a;
            if ((i10 & 4) != 0) {
                int a6 = C52114ft.m86509a(fuVar.f136759e);
                if (a6 == 0) {
                    a6 = 1;
                }
                int i11 = a6 - 1;
                if (i11 == 3) {
                    double d8 = fuVar.f136758d;
                    double parseInt4 = (double) Integer.parseInt(str);
                    Double.isNaN(parseInt4);
                    return String.valueOf(Math.round(d8 * parseInt4));
                } else if (i11 == 4) {
                    return String.valueOf(Math.round(fuVar.f136758d));
                } else {
                    C59104x d9 = f93821b.mo56226d();
                    d9.mo56378ag(C58975e.f156826a, "SystemSettings");
                    C59052c cVar2 = (C59052c) ((C59052c) d9).mo56372aa(52053);
                    int a7 = C52114ft.m86509a(fuVar.f136759e);
                    cVar2.mo56354G("Unsupported unit %s for setting %s", (a7 == 0 || a7 == 1) ? "UNKNOWN_UNIT" : a7 != 2 ? a7 != 3 ? a7 != 4 ? a7 != 5 ? "DECIBEL" : "NATIVE" : "FACTOR" : "RANGE" : "STEP", fuVar.f136760f);
                    return null;
                }
            } else if ((i10 & 128) != 0) {
                return String.valueOf(fuVar.f136763i);
            } else {
                C59104x d10 = f93821b.mo56226d();
                d10.mo56378ag(C58975e.f156826a, "SystemSettings");
                ((C59052c) ((C59052c) d10).mo56372aa(52052)).mo56389s("Missing value for setting %s", fuVar.f136760f);
                return null;
            }
        }
    }

    /* renamed from: b */
    public static String m64224b(String str, String str2) {
        if (!str.equals(C63490p.BRIGHTNESS_LEVEL.name())) {
            return str2;
        }
        Integer d = C35864u.m64262d(C19557e.m37299a("config_screenBrightnessSettingMinimum", 1), C19557e.m37299a("config_screenBrightnessSettingMaximum", PrivateKeyType.INVALID), Integer.parseInt(str2));
        if (d != null) {
            return d.toString();
        }
        C59104x d2 = f93821b.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "SystemSettings");
        ((C59052c) ((C59052c) d2).mo56372aa(52055)).mo56389s("Invalid value for setting %s", str);
        return null;
    }
}
