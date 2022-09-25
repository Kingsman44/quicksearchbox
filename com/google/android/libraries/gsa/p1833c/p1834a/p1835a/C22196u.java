package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.net.Network;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;

/* renamed from: com.google.android.libraries.gsa.c.a.a.u */
/* compiled from: PG */
abstract class C22196u implements C90991b {

    /* renamed from: a */
    static final C22196u f61276a = m41513n(C89062r.f241369a).mo27370a();

    /* renamed from: n */
    static C22195t m41513n(C89062r rVar) {
        C22157a aVar = new C22157a();
        aVar.f61135a = rVar;
        aVar.f61136b = C22199x.f61280b;
        aVar.mo27375f(true);
        aVar.mo27372c(true);
        aVar.mo27373d(true);
        aVar.mo27371b(false);
        aVar.f61138d = false;
        aVar.f61139e = 5;
        aVar.f61140f = true;
        aVar.f61141g = C58729pv.f156485a;
        aVar.mo27374e(0);
        return aVar;
    }

    /* renamed from: a */
    public abstract long mo27405a();

    /* renamed from: b */
    public abstract Network mo27406b();

    /* renamed from: c */
    public abstract C89062r mo27407c();

    /* renamed from: e */
    public abstract C22199x mo27408e();

    /* renamed from: f */
    public abstract C58495hd mo27410f();

    /* renamed from: g */
    public abstract Boolean mo27411g();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("DetailedConnectivityInfo");
        fVar.mo85285l(mo27407c());
        fVar.mo85279c("NetworkId").mo85276a(C91006f.m148644a(mo27408e()));
        fVar.mo85279c("WifiEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo27418m())));
        fVar.mo85279c("CellDataEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo27416k())));
        fVar.mo85279c("DataRoamingEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo27417l())));
        fVar.mo85279c("AirplaneModeEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo27415j())));
        fVar.mo85279c("NetworkRoaming").mo85276a(C90752i.m148228b(mo27412h()));
        fVar.mo85279c("SimState").mo85276a(C90752i.m148230d(mo27414i()));
        fVar.mo85279c("CellDataSupported").mo85276a(C90752i.m148228b(Boolean.valueOf(mo27416k())));
    }

    /* renamed from: h */
    public abstract Boolean mo27412h();

    /* renamed from: i */
    public abstract Integer mo27414i();

    /* renamed from: j */
    public abstract boolean mo27415j();

    /* renamed from: k */
    public abstract boolean mo27416k();

    /* renamed from: l */
    public abstract boolean mo27417l();

    /* renamed from: m */
    public abstract boolean mo27418m();

    public final String toString() {
        return String.format("ConnectivityInfo=%s NetworkId=%s LastConnectivityInfoChangeTimeMs=%d", new Object[]{mo27407c(), mo27408e(), Long.valueOf(mo27405a())});
    }
}
