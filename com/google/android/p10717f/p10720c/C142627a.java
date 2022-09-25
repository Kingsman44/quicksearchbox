package com.google.android.p10717f.p10720c;

import android.util.Log;

/* renamed from: com.google.android.f.c.a */
/* compiled from: PG */
public final class C142627a {
    /* renamed from: a */
    public static String m231236a(String str, String str2, Object... objArr) {
        if (objArr.length == 0) {
            return String.format("[%s]%s", new Object[]{str, str2});
        }
        return String.valueOf(String.format("[%s]", new Object[]{str})).concat(String.valueOf(String.format(str2, objArr)));
    }

    /* renamed from: b */
    public static void m231237b(String str, String str2) {
        if (Log.isLoggable("ctxmgr", 6)) {
            Log.e("ctxmgr", m231236a(str, str2, new Object[0]));
        }
    }

    /* renamed from: c */
    public static void m231238c(String str, String str2, Object obj) {
        if (Log.isLoggable("ctxmgr", 6)) {
            Log.e("ctxmgr", m231236a(str, str2, obj));
        }
    }
}
