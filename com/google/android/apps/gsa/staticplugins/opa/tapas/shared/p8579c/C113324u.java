package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.u */
/* compiled from: PG */
public final class C113324u {

    /* renamed from: a */
    private static final C59071e f313848a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.u");

    /* renamed from: b */
    private final PackageManager f313849b;

    public C113324u(Context context) {
        this.f313849b = context.getPackageManager();
    }

    /* renamed from: d */
    private final ApplicationInfo m187485d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.f313849b.getApplicationInfo(str, 1024);
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f313848a.mo56225c()).mo56382g(e)).mo56372aa(27860)).mo56386p("Invalid caller package");
            return null;
        }
    }

    /* renamed from: a */
    public final String mo100115a(String str) {
        ApplicationInfo d = m187485d(str);
        return (d == null || d.icon == 0) ? BuildConfig.FLAVOR : this.f313849b.getApplicationLabel(d).toString();
    }

    /* renamed from: b */
    public final String mo100116b(String str) {
        ApplicationInfo d = m187485d(str);
        int i = 0;
        if (!(d == null || d.icon == 0)) {
            i = d.icon;
        }
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        return "android.resource://" + str + "/" + i;
    }

    /* renamed from: c */
    public final String mo100117c(Intent intent) {
        ResolveInfo resolveActivity = this.f313849b.resolveActivity(intent, 65536);
        String str = null;
        if (resolveActivity == null) {
            return null;
        }
        if (resolveActivity.activityInfo != null && !"com.android.internal.app.ResolverActivity".equals(resolveActivity.activityInfo.name)) {
            return resolveActivity.activityInfo.packageName;
        }
        List<ResolveInfo> queryIntentActivities = this.f313849b.queryIntentActivities(intent, 65536);
        if (!queryIntentActivities.isEmpty()) {
            for (ResolveInfo next : queryIntentActivities) {
                if (next.activityInfo != null && str == null) {
                    str = next.activityInfo.packageName;
                }
            }
        }
        return str;
    }
}
