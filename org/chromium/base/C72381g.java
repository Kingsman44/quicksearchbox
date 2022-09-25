package org.chromium.base;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: org.chromium.base.g */
/* compiled from: PG */
final class C72381g {

    /* renamed from: a */
    public static final SharedPreferences f192526a;

    static {
        C72408u b = C72408u.m107066b();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C72382h.f192527a);
            b.close();
            f192526a = defaultSharedPreferences;
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
