package com.google.android.apps.gsa.staticplugins.accl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.libraries.search.assistant.performer.communication.IncomingCallInCallService;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.q */
/* compiled from: PG */
public final /* synthetic */ class C93237q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C93238r f259996a;

    public /* synthetic */ C93237q(C93238r rVar) {
        this.f259996a = rVar;
    }

    public final void run() {
        C93238r rVar = this.f259996a;
        Context context = rVar.f259997a;
        context.getClass();
        rVar.f259998b.getClass();
        ComponentName componentName = new ComponentName(context.getPackageName(), IncomingCallInCallService.class.getName());
        PackageManager packageManager = rVar.f259997a.getPackageManager();
        if (((C86124t) rVar.f259998b.mo27525b()).mo79746e(C90025cd.f248165w)) {
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } else if (packageManager.getComponentEnabledSetting(componentName) != 0) {
            packageManager.setComponentEnabledSetting(componentName, 0, 1);
        }
    }
}
