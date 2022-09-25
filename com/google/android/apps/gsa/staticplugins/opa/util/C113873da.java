package com.google.android.apps.gsa.staticplugins.opa.util;

import android.net.wifi.WifiManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.da */
/* compiled from: PG */
public final class C113873da {

    /* renamed from: a */
    public static final String f315294a = ((String) m188510a("WIFI_AP_STATE_CHANGED_ACTION", String.class));

    /* renamed from: b */
    public static final String f315295b = ((String) m188510a("EXTRA_WIFI_AP_STATE", String.class));

    /* renamed from: c */
    public static final int f315296c = ((Integer) m188510a("WIFI_AP_STATE_ENABLED", Integer.class)).intValue();

    /* renamed from: d */
    private static final C59071e f315297d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.da");

    /* renamed from: a */
    private static Object m188510a(String str, Class cls) {
        try {
            return cls.cast(WifiManager.class.getDeclaredField(str).get(WifiManager.class));
        } catch (Exception e) {
            ((C59052c) ((C59052c) f315297d.mo56225c()).mo56372aa(28458)).mo56389s("%s", e.getMessage());
            return null;
        }
    }
}
