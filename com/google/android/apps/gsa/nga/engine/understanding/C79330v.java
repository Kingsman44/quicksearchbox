package com.google.android.apps.gsa.nga.engine.understanding;

import com.evernote.android.state.BuildConfig;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.v */
/* compiled from: PG */
public abstract class C79330v {
    /* renamed from: b */
    public static C79330v m127277b(String str) {
        return new C78912a(m127279e(str));
    }

    /* renamed from: c */
    public static boolean m127278c(String str, String str2) {
        return m127279e(str).equals(m127279e(str2));
    }

    /* renamed from: e */
    private static String m127279e(String str) {
        return str.replace("_", BuildConfig.FLAVOR).toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public abstract String mo73681a();

    /* renamed from: d */
    public final boolean mo73901d(String str) {
        return mo73681a().equals(m127279e(str));
    }
}
