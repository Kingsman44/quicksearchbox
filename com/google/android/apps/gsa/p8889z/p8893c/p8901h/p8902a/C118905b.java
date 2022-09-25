package com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8902a;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.c.h.a.b */
/* compiled from: PG */
public final class C118905b extends C68247h {

    /* renamed from: a */
    private final C68283d f331614a;

    /* renamed from: c */
    private final C68283d f331615c;

    /* renamed from: d */
    private final C68283d f331616d;

    public C118905b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C118905b.class), aVar);
        this.f331614a = C68236af.m98549d(dVar);
        this.f331615c = C68236af.m98549d(dVar2);
        this.f331616d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return C60856cj.m92908q(this.f331614a.mo60297gq(), ((C90021c) list.get(1)).mo79743a(C90114fl.f250731e), TimeUnit.MILLISECONDS, (ScheduledExecutorService) list.get(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f331615c.mo60297gq(), this.f331616d.mo60297gq());
    }
}
