package com.google.android.libraries.web.webview.contrib.intenturi.p3477a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Collection;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.contrib.intenturi.a.c */
/* compiled from: PG */
public final class C44377c {

    /* renamed from: a */
    public final Context f115377a;

    /* renamed from: b */
    private final PackageManager f115378b;

    public C44377c(PackageManager packageManager, Context context) {
        C69664n.m101061g(packageManager, "packageManager");
        C69664n.m101061g(context, "applicationContext");
        this.f115378b = packageManager;
        this.f115377a = context;
    }

    /* renamed from: a */
    public final boolean mo47271a(Intent intent, List list) {
        List<ResolveInfo> queryIntentActivities = this.f115378b.queryIntentActivities(intent, 65536);
        C69664n.m101060f(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        if (queryIntentActivities.isEmpty()) {
            return false;
        }
        if ((queryIntentActivities instanceof Collection) && queryIntentActivities.isEmpty()) {
            return true;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (!resolveInfo.activityInfo.exported && !list.contains(resolveInfo.activityInfo.name)) {
                return false;
            }
        }
        return true;
    }
}
