package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ch */
/* compiled from: PG */
public final /* synthetic */ class C9616ch implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33232a;

    /* renamed from: b */
    public final /* synthetic */ C91097g f33233b;

    public /* synthetic */ C9616ch(C9619ck ckVar, C91097g gVar) {
        this.f33232a = ckVar;
        this.f33233b = gVar;
    }

    public final void run() {
        C9619ck ckVar = this.f33232a;
        C91097g gVar = this.f33233b;
        ckVar.mo17903L();
        if (ckVar.f33286t != null) {
            C58976aa aaVar = C58975e.f156826a;
            C18509a c = C18522b.m35986c();
            c.mo24027i(8);
            ((C18523c) c).f52492a = "device_info";
            c.mo24021c(ckVar.f33286t);
            Intent a = c.mo24020b().mo24031a();
            a.addFlags(603979776);
            if (gVar != null) {
                gVar.mo65089a(a);
            }
        }
    }
}
