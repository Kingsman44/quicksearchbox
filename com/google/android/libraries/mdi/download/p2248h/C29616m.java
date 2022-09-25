package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.mdi.download.h.m */
/* compiled from: PG */
public final class C29616m implements C28746bx {

    /* renamed from: a */
    public final C58485gu f80209a;

    /* renamed from: b */
    public final C58485gu f80210b;

    /* renamed from: c */
    public final C42813k f80211c;

    /* renamed from: d */
    public final C58881cr f80212d;

    /* renamed from: e */
    public final boolean f80213e;

    /* renamed from: f */
    private final String f80214f;

    public C29616m(C29615l lVar) {
        this.f80209a = lVar.f80203a;
        this.f80210b = lVar.f80204b;
        this.f80211c = lVar.f80205c;
        this.f80214f = lVar.f80206d;
        this.f80212d = lVar.f80207e;
        this.f80213e = lVar.f80208f;
    }

    /* renamed from: a */
    public static C60870cx m54585a(C28708an anVar, C58485gu guVar) {
        return C29672d.m54728c(guVar).mo34823a(new C29611h(guVar, anVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C29045l.m53930b("%s: Refresh file groups config with MDD", "FilteringPopulator");
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(this.f80214f);
        C29670b i = C29670b.m54719g(fdVar.mo34717f(f.mo34447a())).mo34822i(new C29609f(this, fdVar), C60826bg.f164896a);
        C29612i iVar = new C29612i();
        C60856cj.m92911t(i, C47810es.m84974n(iVar), C60826bg.f164896a);
        return i;
    }
}
