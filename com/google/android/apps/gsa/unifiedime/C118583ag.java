package com.google.android.apps.gsa.unifiedime;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.unifiedime.ag */
/* compiled from: PG */
public final class C118583ag {

    /* renamed from: a */
    public static final C59071e f330846a = C59071e.m91332i("com.google.android.apps.gsa.unifiedime.ag");

    /* renamed from: a */
    public static String m196881a(String str, Map map, List list) {
        String str2;
        String str3 = null;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (map.containsKey(lowerCase)) {
                str2 = (String) map.get(lowerCase);
            } else if (list.contains(str)) {
                str2 = str;
            } else if (str.indexOf("_") == 2) {
                str2 = str.replace("_", "-");
            } else if (str.length() == 2) {
                str2 = str + "-" + str.toUpperCase(Locale.US);
            } else {
                str2 = null;
            }
            if (str2 == null || list.contains(str2)) {
                str3 = str2;
            } else {
                ((C59052c) ((C59052c) f330846a.mo56226d()).mo56372aa(34055)).mo56389s("Invalid recognition locale: %s", str2);
            }
            if (str3 == null) {
                ((C59052c) ((C59052c) f330846a.mo56226d()).mo56372aa(34052)).mo56389s("#updateForSpokenLanguage - Could not convert locale: %s", str);
            }
        }
        return str3;
    }

    /* renamed from: b */
    public static synchronized void m196882b(String str, C86338r rVar) {
        synchronized (C118583ag.class) {
            m196887g("unified_ime_account_toast_shown_count_".concat(str), rVar);
        }
    }

    /* renamed from: c */
    public static synchronized void m196883c(String str, C86338r rVar) {
        synchronized (C118583ag.class) {
            m196887g("unified_ime_fallback_locale_toast_shown_count_".concat(String.valueOf(str)), rVar);
        }
    }

    /* renamed from: d */
    public static void m196884d(Context context, String str) {
        new Handler(Looper.getMainLooper()).post(new C118581ae(context, str));
    }

    /* renamed from: e */
    public static synchronized boolean m196885e(String str, C86338r rVar) {
        int i;
        synchronized (C118583ag.class) {
            i = rVar.getInt("unified_ime_account_toast_shown_count_".concat(str), 0);
        }
        return i < 3;
    }

    /* renamed from: f */
    public static synchronized boolean m196886f(String str, C86338r rVar) {
        int i;
        synchronized (C118583ag.class) {
            i = rVar.getInt("unified_ime_fallback_locale_toast_shown_count_".concat(String.valueOf(str)), 0);
        }
        return i < 3;
    }

    /* renamed from: g */
    private static void m196887g(String str, C86338r rVar) {
        int i = rVar.getInt(str, 0);
        C86337q b = rVar.mo80076b();
        b.mo80070e(str, i + 1);
        b.apply();
    }
}
