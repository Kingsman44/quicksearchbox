package com.google.android.libraries.search.p3005i;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.i.n */
/* compiled from: PG */
public final class C38470n {
    /* renamed from: a */
    public static C58833ax m67721a(Context context) {
        try {
            return C58833ax.m90833j(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return C58836b.f156633a;
        }
    }
}
