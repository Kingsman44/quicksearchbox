package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ct */
/* compiled from: PG */
public final /* synthetic */ class C108620ct implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108623cw f302142a;

    /* renamed from: b */
    public final /* synthetic */ String f302143b;

    public /* synthetic */ C108620ct(C108623cw cwVar, String str) {
        this.f302142a = cwVar;
        this.f302143b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108623cw cwVar = this.f302142a;
        String str = this.f302143b;
        Exception exc = (Exception) obj;
        if (exc instanceof CancellationException) {
            return C60856cj.m92898g();
        }
        C58887cx.m90980g(exc);
        C59104x c = C108623cw.f302147a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DeviceSetupRespCache");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(24171)).mo56386p("Failed to sync provider, Re-sync immediately.");
        return cwVar.f302149c.mo97029d(str);
    }
}
