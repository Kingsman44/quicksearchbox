package com.google.android.apps.search.googleapp.stampviewer.p10490d.p10492b;

import com.google.android.apps.search.googleapp.discover.p10238u.C134944ae;
import com.google.android.apps.search.googleapp.stampviewer.p10490d.C139377c;
import com.google.apps.tiktok.cache.C46406u;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46704av;
import com.google.apps.tiktok.dataservice.C46771co;
import com.google.apps.tiktok.dataservice.C46775cs;
import com.google.apps.tiktok.dataservice.C46776ct;
import com.google.apps.tiktok.dataservice.C46882v;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46681b;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53894f;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53898j;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53899k;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53901m;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.d.b.l */
/* compiled from: PG */
public final class C139376l implements C139377c {

    /* renamed from: a */
    public final Executor f378996a;

    /* renamed from: b */
    public final C46406u f378997b;

    /* renamed from: c */
    public final C53894f f378998c;

    /* renamed from: d */
    public final C134944ae f378999d;

    /* renamed from: e */
    private final C46776ct f379000e;

    /* renamed from: f */
    private final C46459k f379001f;

    public C139376l(InstanceStateStoreFactory instanceStateStoreFactory, Executor executor, C46776ct ctVar, C53894f fVar, C134944ae aeVar, C46459k kVar) {
        this.f378997b = new C46406u(instanceStateStoreFactory.mo50325a("fetchHeartState", C53901m.f141434b));
        this.f378996a = executor;
        this.f379000e = ctVar;
        this.f378998c = fVar;
        this.f378999d = aeVar;
        this.f379001f = kVar;
    }

    /* renamed from: a */
    public final C46689ag mo114936a(String str) {
        C46776ct ctVar = this.f379000e;
        C46406u uVar = this.f378997b;
        C53898j jVar = (C53898j) C53899k.f141430c.createBuilder();
        jVar.mo54044a(str);
        return new C46775cs(ctVar, new C46704av(new C46681b("HeartDataService#fetchHeartState", uVar, (C53899k) jVar.build(), new C139372h(this, str)), new C139373i(str), this.f378996a));
    }

    /* renamed from: b */
    public final C60870cx mo114937b(String str) {
        C47633f i = this.f378999d.mo112084a().mo51516i(new C139365a(this, str), this.f378996a).mo51516i(new C139367c(this, str), this.f378996a);
        C46882v vVar = new C46882v();
        vVar.f122320a = i;
        vVar.f122321b = "HeartDataService#fetchHeartState";
        vVar.f122322c = new C139368d(str);
        C46771co a = vVar.mo50884a();
        C46459k kVar = this.f379001f;
        C60870cx a2 = this.f379000e.mo50786a(a);
        kVar.mo50456d(a2, C47831fm.m85015j());
        kVar.mo50455c(a2, C47831fm.m85015j());
        return C60922j.m93044g(i, new C58819aj((Object) null), this.f378996a);
    }

    /* renamed from: c */
    public final C60870cx mo114938c(String str) {
        C47633f i = this.f378999d.mo112084a().mo51516i(new C139369e(this, str), this.f378996a).mo51516i(new C139370f(this, str), this.f378996a);
        C46882v vVar = new C46882v();
        vVar.f122320a = i;
        vVar.f122321b = "HeartDataService#fetchHeartState";
        vVar.f122322c = new C139371g(str);
        this.f379000e.mo50786a(vVar.mo50884a());
        return C60922j.m93044g(i, new C58819aj((Object) null), this.f378996a);
    }
}
