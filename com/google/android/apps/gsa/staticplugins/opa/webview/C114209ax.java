package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ax */
/* compiled from: PG */
public final class C114209ax {
    /* renamed from: a */
    static String m189475a(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: b */
    static boolean m189476b(String str, String str2) {
        if (TextUtils.equals(str, str2) || TextUtils.equals(Uri.decode(str), Uri.decode(str2))) {
            return true;
        }
        String a = m189475a(str);
        String a2 = m189475a(str2);
        if (TextUtils.equals(a, a2)) {
            return true;
        }
        return TextUtils.equals(Uri.decode(a), Uri.decode(a2));
    }
}
