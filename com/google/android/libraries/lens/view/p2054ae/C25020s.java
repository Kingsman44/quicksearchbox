package com.google.android.libraries.lens.view.p2054ae;

import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.p4017at.p4056g.p4057a.p4058a.C54042cw;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70877p;

/* renamed from: com.google.android.libraries.lens.view.ae.s */
/* compiled from: PG */
final class C25020s implements C70877p {

    /* renamed from: a */
    final /* synthetic */ C25021t f68222a;

    public C25020s(C25021t tVar) {
        this.f68222a = tVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        Duration duration = C25021t.f68223a;
        this.f68222a.mo30230a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        Duration duration = C25021t.f68223a;
        th.getMessage();
        C25021t tVar = this.f68222a;
        Executor executor = tVar.f68225c;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C25015n(tVar, th)))));
        this.f68222a.mo30233d();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C54042cw cwVar = (C54042cw) obj;
        if ((cwVar.f141796a & 1) != 0) {
            Duration duration = C25021t.f68223a;
            C56244ay ayVar = cwVar.f141797b;
            if (ayVar == null) {
                ayVar = C56244ay.f149802e;
            }
            long j = ayVar.f149805b;
            C56244ay ayVar2 = cwVar.f141797b;
            if (ayVar2 == null) {
                ayVar2 = C56244ay.f149802e;
            }
            long j2 = ayVar2.f149807d;
            Executor executor = this.f68222a.f68225c;
            ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C25019r(this, cwVar)))));
            return;
        }
        Duration duration2 = C25021t.f68223a;
    }

    /* renamed from: d */
    public final void mo22390d(C70868g gVar) {
    }
}
