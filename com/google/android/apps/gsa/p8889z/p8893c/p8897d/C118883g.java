package com.google.android.apps.gsa.p8889z.p8893c.p8897d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4459c.C58000d;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.c.d.g */
/* compiled from: PG */
public final class C118883g extends C68247h {

    /* renamed from: a */
    private final C68283d f331557a;

    /* renamed from: c */
    private final C68283d f331558c;

    /* renamed from: d */
    private final C68283d f331559d;

    public C118883g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C118883g.class), aVar);
        this.f331557a = C68236af.m98549d(dVar);
        this.f331558c = C68236af.m98549d(dVar2);
        this.f331559d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) list.get(1);
        C118889m mVar = (C118889m) list.get(2);
        C60856cj.m92911t(C60856cj.m92908q(C58000d.m88748a(mVar.f331585b, C118879c.f331552a), 5000, TimeUnit.MILLISECONDS, scheduledExecutorService), new C118882f(mVar), scheduledExecutorService);
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f331557a.mo60297gq(), this.f331558c.mo60297gq(), this.f331559d.mo60297gq());
    }
}
