package com.google.android.apps.search.assistant.platform.appintegration.p8997e;

import android.content.pm.PackageInfo;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.e.c */
/* compiled from: PG */
public final /* synthetic */ class C119534c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119536e f333162a;

    /* renamed from: b */
    public final /* synthetic */ String f333163b;

    /* renamed from: c */
    public final /* synthetic */ C119532a f333164c;

    public /* synthetic */ C119534c(C119536e eVar, String str, C119532a aVar) {
        this.f333162a = eVar;
        this.f333163b = str;
        this.f333164c = aVar;
    }

    public final void run() {
        C119536e eVar = this.f333162a;
        String str = this.f333163b;
        C119532a aVar = this.f333164c;
        PackageInfo c = eVar.mo104422c(str);
        ((C59052c) ((C59052c) C119536e.f333169a.mo56224b()).mo56372aa(34519)).mo56360M("incrementAppIntegrationSessionCounter %s %s %s %d", aVar.f333161d, c.packageName, c.versionName, Integer.valueOf(c.versionCode));
        C39141kp kpVar = eVar.f333170b;
        ((C19567d) kpVar.f103036h.mo6453a()).mo24822a(1, aVar.f333161d, c.packageName, c.versionName, Integer.valueOf(c.versionCode));
    }
}
