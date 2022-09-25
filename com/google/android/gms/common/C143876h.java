package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143896al;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.gms.common.util.C144007g;

/* renamed from: com.google.android.gms.common.h */
/* compiled from: PG */
public class C143876h {

    /* renamed from: c */
    public static final int f389990c = 223810000;

    /* renamed from: d */
    public static final C143876h f389991d = new C143876h();

    static {
        int i = C143700ab.f389600d;
    }

    /* renamed from: j */
    public final int mo119362j(Context context, int i) {
        int b = C143700ab.m233440b(context, i);
        if (C143700ab.m233445g(context, b)) {
            return 18;
        }
        return b;
    }

    /* renamed from: k */
    public final Intent mo119363k(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C144007g.m234186b(context)) {
                return C143896al.m233933a();
            }
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(f389990c);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C143873c.f389983a.mo119351a(context).mo119348b(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C143896al.m233934b(sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C143896al.m233935c();
        }
    }

    /* renamed from: l */
    public final PendingIntent mo119364l(Context context, int i, String str) {
        Intent k = mo119363k(context, i, str);
        if (k == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, k, 201326592);
    }
}
