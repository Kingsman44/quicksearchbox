package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.hm */
/* compiled from: PG */
public final class C145422hm {
    /* renamed from: a */
    public static String m236341a(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m236342b(Context context, String str) {
        C143919bh.m233958a(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = C145352ex.m236168a(context);
        }
        return C145352ex.m236169b("google_app_id", resources, str);
    }
}
