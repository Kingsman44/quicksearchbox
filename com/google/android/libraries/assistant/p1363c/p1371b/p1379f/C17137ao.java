package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.c.b.f.ao */
/* compiled from: PG */
public final /* synthetic */ class C17137ao implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C17138ap f49824a;

    /* renamed from: b */
    public final /* synthetic */ Context f49825b;

    public /* synthetic */ C17137ao(C17138ap apVar, Context context) {
        this.f49824a = apVar;
        this.f49825b = context;
    }

    public final Object call() {
        C17138ap apVar = this.f49824a;
        Context context = this.f49825b;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService(DevicePolicyManager.class);
        PackageManager packageManager = context.getPackageManager();
        apVar.f49826a = false;
        Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
        while (true) {
            if (it.hasNext()) {
                if (devicePolicyManager.isProfileOwnerApp(it.next().packageName)) {
                    apVar.f49826a = true;
                    break;
                }
            } else {
                break;
            }
        }
        return Boolean.valueOf(apVar.f49826a);
    }
}
