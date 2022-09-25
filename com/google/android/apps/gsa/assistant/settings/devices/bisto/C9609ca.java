package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.p10712d.C142346by;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ca */
/* compiled from: PG */
public final /* synthetic */ class C9609ca implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33221a;

    public /* synthetic */ C9609ca(C9619ck ckVar) {
        this.f33221a = ckVar;
    }

    public final void run() {
        String str;
        C9619ck ckVar = this.f33221a;
        C142346by byVar = ckVar.f33291y.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        String e = C58837ba.m90856e(byVar.f386227g);
        if (e == null) {
            e = "com.google.android.googlequicksearchbox.BISTO_FEEDBACK";
        }
        C90461c cVar = new C90461c();
        cVar.f252693e = e;
        try {
            str = ckVar.f32988d.getPackageManager().getPackageInfo("com.google.android.tts", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "unknown";
        }
        cVar.mo84200d("TTS App Version", str);
        String Q = ckVar.f33290x.mo106476Q();
        String name = ckVar.f33290x.mo106514l().name();
        String M = ckVar.f33290x.mo106472M();
        String S = ckVar.f33290x.mo106478S();
        String name2 = ckVar.f33290x.mo106512j().name();
        String name3 = ckVar.f33290x.mo106523u().name();
        cVar.mo84200d("Connected Device Info", "deviceName=" + Q + ", deviceType=" + name + ", build#firmware=" + M + "#" + S + ", connectivity=" + name2 + ", ota_state=" + name3);
        ckVar.f33276j.mo84210a(ckVar.f32988d).mo84209b(cVar, 1);
    }
}
