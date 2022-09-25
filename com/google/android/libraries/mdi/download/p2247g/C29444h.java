package com.google.android.libraries.mdi.download.p2247g;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.g.h */
/* compiled from: PG */
final class C29444h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C29445i f79825a;

    public C29444h(C29445i iVar) {
        this.f79825a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Object[] objArr = new Object[2];
        objArr[0] = "NetworkUsageMonitor";
        C29392ep epVar = this.f79825a.f79826a.f79656b;
        if (epVar == null) {
            epVar = C29392ep.f79679g;
        }
        objArr[1] = epVar.f79682b;
        C29045l.m53938j(th, "%s: Unable to increment LoggingStateStore network usage for %s", objArr);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C29392ep epVar = this.f79825a.f79826a.f79656b;
        if (epVar == null) {
            epVar = C29392ep.f79679g;
        }
        C29045l.m53931c("%s: Successfully incremented LoggingStateStore network usage for %s", "NetworkUsageMonitor", epVar.f79682b);
    }
}
