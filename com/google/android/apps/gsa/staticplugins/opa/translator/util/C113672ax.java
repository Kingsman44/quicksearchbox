package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.content.res.Configuration;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ax */
/* compiled from: PG */
public final class C113672ax {

    /* renamed from: a */
    private static final C59071e f314859a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.ax");

    /* renamed from: a */
    public static String m188246a(String str) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        int indexOf = lowerCase.indexOf(45);
        if (indexOf >= 0) {
            return lowerCase.substring(0, indexOf);
        }
        int indexOf2 = lowerCase.indexOf(95);
        return indexOf2 >= 0 ? lowerCase.substring(0, indexOf2) : lowerCase;
    }

    /* renamed from: b */
    public static String m188247b(Context context, int i, String str) {
        if (C58837ba.m90859h(str)) {
            ((C59052c) ((C59052c) f314859a.mo56226d()).mo56372aa(28294)).mo56386p("desired lang not set");
            return context.getString(i);
        }
        Locale locale = new Locale(str);
        if (str != null) {
            String[] split = str.split("-");
            if (split.length == 2) {
                locale = new Locale(split[0], split[1]);
            }
            String[] split2 = str.split("_");
            if (split2.length == 2) {
                locale = new Locale(split2[0], split2[1]);
            }
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getString(i);
    }

    /* renamed from: c */
    public static boolean m188248c(String str, String str2) {
        return m188246a(str).equals(m188246a(str2));
    }
}
