package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.analytics.p10733a.C142681b;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144010j;
import com.google.common.p4535g.C59203do;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.internal.ba */
/* compiled from: PG */
public final class C142731ba {
    /* renamed from: a */
    public static long m231601a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static C142681b m231602b(C142722as asVar, String str) {
        C143919bh.m233958a(asVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map a = C144010j.m234188a(new URI("?" + str));
            C142681b bVar = new C142681b();
            bVar.f387177e = (String) a.get("utm_content");
            bVar.f387175c = (String) a.get("utm_medium");
            bVar.f387173a = (String) a.get("utm_campaign");
            bVar.f387174b = (String) a.get("utm_source");
            bVar.f387176d = (String) a.get("utm_term");
            bVar.f387178f = (String) a.get("utm_id");
            bVar.f387179g = (String) a.get("anid");
            bVar.f387180h = (String) a.get("gclid");
            bVar.f387181i = (String) a.get("dclid");
            bVar.f387182j = (String) a.get("aclid");
            return bVar;
        } catch (URISyntaxException e) {
            asVar.mo117536i(5, "No valid campaign data found", e, (Object) null, (Object) null);
            return null;
        }
    }

    /* renamed from: c */
    public static String m231603c(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m231604d(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* renamed from: e */
    public static void m231605e(Map map, String str, Map map2) {
        m231604d(map, str, (String) map2.get(str));
    }

    /* renamed from: f */
    public static boolean m231606f(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo == null || !receiverInfo.enabled || (z && !receiverInfo.exported)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: g */
    public static boolean m231607g(double d, String str) {
        int i;
        if (d > C59203do.f157270a && d < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 65535) + charAt + (charAt << 14);
                    int i2 = 266338304 & i;
                    if (i2 != 0) {
                        i ^= i2 >> 21;
                    }
                }
            } else {
                i = 1;
            }
            if (((double) (i % 10000)) >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static MessageDigest m231608h() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
