package com.google.android.apps.gsa.staticplugins.p7920en;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.en.f */
/* compiled from: PG */
public final class C100564f {

    /* renamed from: a */
    public static final C59071e f281157a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.en.f");

    /* renamed from: b */
    public static final int[] f281158b = {22, 6, 13, 9, 41, 8, 1, 5, 16, 7, 20, 2, 35, 19, 17, 38, 11, 3, 30, 32, 46, 14, 31, 29, 24, 18};

    /* renamed from: a */
    public static String m166668a(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= '!' && c <= '~') {
                charArray[i] = (char) (((c + 14) % 94) + 33);
            }
        }
        return new String(charArray);
    }

    /* renamed from: b */
    static String m166669b(String str) {
        String replace = str.replace("\\", "\\\\").replace("\"", "\\\"");
        return "\"" + replace + "\"";
    }

    /* renamed from: c */
    static String m166670c(String str) {
        return (str.length() >= 2 && str.charAt(0) == '\"' && str.charAt(str.length() + -1) == '\"') ? str.substring(1, str.length() - 1).replace("\\\"", "\"").replace("\\\\", "\\") : str;
    }

    /* renamed from: d */
    static void m166671d(C86338r rVar) {
        C86337q b = rVar.mo80076b();
        b.mo80075j("vic_last_vehicle_mac_address");
        b.mo80075j("vic_last_vehicle_info");
        b.commit();
    }

    /* renamed from: e */
    static boolean m166672e(C86338r rVar) {
        return rVar.getBoolean("vic_dialog_presented", false);
    }

    /* renamed from: f */
    static void m166673f(C86338r rVar) {
        C86337q b = rVar.mo80076b();
        b.mo80067b("bluetoothHeadset", true);
        b.commit();
    }
}
