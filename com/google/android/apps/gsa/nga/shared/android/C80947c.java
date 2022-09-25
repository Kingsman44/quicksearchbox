package com.google.android.apps.gsa.nga.shared.android;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.c */
/* compiled from: PG */
public final class C80947c {

    /* renamed from: a */
    private final PackageManager f221941a;

    /* renamed from: b */
    private volatile AtomicReference f221942b = new AtomicReference(new HashSet());

    public C80947c(Context context, PackageManager packageManager, C91142g gVar) {
        this.f221941a = packageManager;
        C80958n nVar = new C80958n(new C80946b(this), gVar, C90126fx.f251112cf);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(nVar, intentFilter);
        mo74731a();
    }

    /* renamed from: a */
    public final void mo74731a() {
        Intent data = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("http:"));
        HashSet hashSet = new HashSet();
        hashSet.add("com.android.browser");
        for (ResolveInfo next : this.f221941a.queryIntentActivities(data, C89885b.S3REQUEST_VALUE)) {
            if (!(next == null || next.activityInfo == null || next.activityInfo.packageName == null)) {
                hashSet.add(next.activityInfo.packageName);
            }
        }
        this.f221942b.set(hashSet);
    }

    /* renamed from: b */
    public final boolean mo74732b(String str) {
        return ((Set) this.f221942b.get()).contains(str);
    }
}
