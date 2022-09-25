package com.google.android.apps.search.assistant.platform.appintegration.p8997e;

import android.content.pm.PackageInfo;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.e.d */
/* compiled from: PG */
public final /* synthetic */ class C119535d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119536e f333165a;

    /* renamed from: b */
    public final /* synthetic */ String f333166b;

    /* renamed from: c */
    public final /* synthetic */ C119532a f333167c;

    /* renamed from: d */
    public final /* synthetic */ boolean f333168d;

    public /* synthetic */ C119535d(C119536e eVar, String str, C119532a aVar, boolean z) {
        this.f333165a = eVar;
        this.f333166b = str;
        this.f333167c = aVar;
        this.f333168d = z;
    }

    public final void run() {
        C119536e eVar = this.f333165a;
        String str = this.f333166b;
        C119532a aVar = this.f333167c;
        boolean z = this.f333168d;
        PackageInfo c = eVar.mo104422c(str);
        String str2 = aVar.f333161d;
        String str3 = c.packageName;
        String str4 = c.versionName;
        Integer valueOf = Integer.valueOf(c.versionCode);
        Boolean valueOf2 = Boolean.valueOf(z);
        ((C59052c) ((C59052c) C119536e.f333169a.mo56224b()).mo56372aa(34520)).mo56361N("incrementAppIntegrationVoicePlateCounter %s %s %s %d %b", str2, str3, str4, valueOf, valueOf2);
        C39141kp kpVar = eVar.f333170b;
        ((C19567d) kpVar.f103035g.mo6453a()).mo24822a(1, aVar.f333161d, c.packageName, c.versionName, Integer.valueOf(c.versionCode), valueOf2);
    }
}
