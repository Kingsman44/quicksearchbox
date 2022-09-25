package com.google.android.libraries.p1936h.p1937a.p1938a.p1939a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.api.C144354b;

/* renamed from: com.google.android.libraries.h.a.a.a.a */
/* compiled from: PG */
public final class C23342a {

    /* renamed from: a */
    private static final String[] f63874a = {"com.google.android.apps.tachyon", "com.google.android.gm", "com.google.android.apps.meetings"};

    /* renamed from: a */
    public static Intent m43779a(Context context, String str, String str2, int i) {
        Uri build = Uri.parse(str).buildUpon().appendQueryParameter("hs", String.valueOf(i)).build();
        if (TextUtils.isEmpty(build.getPath())) {
            build = build.buildUpon().path("/").build();
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(build);
        String[] strArr = f63874a;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            intent.setPackage(strArr[i2]);
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null) {
                intent.setComponent(new ComponentName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name));
                break;
            }
            intent.setPackage((String) null);
            i2++;
        }
        if (str2 != null) {
            C144354b.m234631a(context, intent, AccountData.m234630a(str2));
        }
        return intent;
    }
}
