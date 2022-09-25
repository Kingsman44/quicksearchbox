package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.view.p2070an.C25387ay;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.u */
/* compiled from: PG */
public final /* synthetic */ class C28012u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28014w f76224a;

    /* renamed from: b */
    public final /* synthetic */ C56244ay f76225b;

    /* renamed from: c */
    public final /* synthetic */ C27971i f76226c;

    public /* synthetic */ C28012u(C28014w wVar, C56244ay ayVar, C27971i iVar) {
        this.f76224a = wVar;
        this.f76225b = ayVar;
        this.f76226c = iVar;
    }

    public final void run() {
        C28014w wVar = this.f76224a;
        C56244ay ayVar = this.f76225b;
        C27971i iVar = this.f76226c;
        C28017z zVar = wVar.f76228a;
        C25387ay.m46760a();
        C28015x xVar = zVar.f76247j;
        if (xVar == null || !ayVar.equals(xVar.f76230b) || iVar.mo33390h() == null) {
            ((C58970a) ((C58970a) C28017z.f76238a.mo56224b()).mo56372aa(49985)).mo56388r("Ignoring obsolete intermediate engine result (%d)", ayVar.f149807d);
        }
    }
}
