package org.chromium.base;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
public class JNIUtils {

    /* renamed from: a */
    private static Boolean f192493a;

    public static ClassLoader getSplitClassLoader(String str) {
        Context context = C72382h.f192527a;
        if (TextUtils.isEmpty(str) || !BundleUtils.m107015c(context, str)) {
            return JNIUtils.class.getClassLoader();
        }
        return BundleUtils.m107013a(context, str).getClassLoader();
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (f192493a == null) {
            f192493a = false;
        }
        return f192493a.booleanValue();
    }
}
