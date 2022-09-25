package com.google.android.apps.search.googleapp.launcher.minusone.p10355c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.apps.search.googleapp.launcher.minusone.p10354b.C136593a;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.c.a */
/* compiled from: PG */
public final class C136622a {
    /* renamed from: a */
    public static boolean m222082a(Context context) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
        return (resolveActivity != null && resolveActivity.activityInfo != null && "com.google.android.apps.nexuslauncher".equals(resolveActivity.activityInfo.packageName) && "com.google.android.apps.nexuslauncher.NexusLauncherActivity".equals(resolveActivity.activityInfo.name)) || context.getPackageManager().hasSystemFeature("com.google.android.feature.ANDROID_ONE_EXPERIENCE") || C136593a.m221995a();
    }
}
