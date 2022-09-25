package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.tasks.o */
/* compiled from: PG */
final class C118556o {

    /* renamed from: a */
    public final C118522by f329154a;

    /* renamed from: b */
    public final Queue f329155b = new ArrayDeque(4);

    /* renamed from: c */
    public SettableFuture f329156c = new SettableFuture();

    /* renamed from: d */
    public int f329157d = 0;

    /* renamed from: e */
    final /* synthetic */ C118558q f329158e;

    public C118556o(C118558q qVar, C118522by byVar) {
        this.f329158e = qVar;
        this.f329154a = byVar;
    }

    /* renamed from: a */
    public final void mo103748a(C118557p pVar) {
        if (pVar.f329160b == C118466aa.EXCLUSIVE) {
            this.f329158e.f329164d.mo103715b(this.f329154a);
        }
    }

    /* renamed from: b */
    public final void mo103749b(C118557p pVar) {
        C59104x b = C118558q.f329161a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BgTaskExecutorImpl");
        ((C59052c) ((C59052c) b).mo56372aa(33975)).mo56354G("Starting %s background task %s.", pVar.f329160b, this.f329154a.name());
        mo103748a(pVar);
        long d = this.f329158e.f329168h.mo26872d();
        C31520m a = this.f329158e.f329169i.mo103733a();
        C22871g gVar = this.f329158e.f329165e;
        String name = this.f329154a.name();
        C60870cx e = C90877ak.m148471e(gVar.mo28202b(String.valueOf(name).concat("-runTask"), new C118554m(this, pVar)), C118558q.f329162b, TimeUnit.MILLISECONDS, this.f329158e.f329165e);
        C22871g gVar2 = this.f329158e.f329166f;
        String name2 = this.f329154a.name();
        gVar2.mo28211k(e, String.valueOf(name2).concat("-failure-handler"), new C118553l(this.f329158e, this.f329154a, pVar.f329160b, d, a));
        C22871g gVar3 = this.f329158e.f329166f;
        String name3 = this.f329154a.name();
        gVar3.mo28211k(e, String.valueOf(name3).concat("-done"), new C118555n(this, pVar));
    }
}
