package com.google.android.libraries.notifications.platform.p2307a;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.libraries.notifications.platform.a.a */
/* compiled from: PG */
public final class C30057a {

    /* renamed from: a */
    public boolean f81323a = false;

    /* renamed from: a */
    public static String m55787a(String str, String str2, Object[] objArr) {
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        return "[" + str + "] " + str2;
    }

    /* renamed from: b */
    public final boolean mo35399b(int i) {
        return Log.isLoggable("GnpSdk", i);
    }
}
