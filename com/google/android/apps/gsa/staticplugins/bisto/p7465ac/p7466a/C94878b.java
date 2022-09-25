package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.b */
/* compiled from: PG */
public final /* synthetic */ class C94878b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94887k f265355a;

    /* renamed from: b */
    public final /* synthetic */ boolean f265356b;

    public /* synthetic */ C94878b(C94887k kVar, boolean z) {
        this.f265355a = kVar;
        this.f265356b = z;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94887k kVar = this.f265355a;
        boolean z = this.f265356b;
        C59104x c = C94887k.f265367a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(17301)).mo56389s("[%s] updateDeviceInfo: Failed to get device info", C94876ay.m156554c(kVar.f265385b));
        kVar.mo88751j(z);
    }
}
