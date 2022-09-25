package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.net.Network;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.gsa.c.a.a.c */
/* compiled from: PG */
final class C22178c implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C22181f f61226a;

    public C22178c(C22181f fVar) {
        this.f61226a = fVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C22181f.f61228a.mo56226d()).mo56382g(th)).mo56372aa(48509)).mo56386p("Getting connectivity info failed.");
        int i = C90755l.f253831a;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C22196u uVar = (C22196u) obj;
        if (uVar.mo27407c().f241373e == 1) {
            this.f61226a.mo27424a();
            Network b = uVar.mo27406b();
            if (b != null) {
                this.f61226a.f61231d.reportNetworkConnectivity(b, false);
            }
        }
    }
}
