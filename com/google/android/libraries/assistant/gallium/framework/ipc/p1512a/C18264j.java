package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63070h;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65692r;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65697w;
import com.google.protos.p5127o.C65699y;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.j */
/* compiled from: PG */
final class C18264j implements C70862aj {

    /* renamed from: a */
    public final GalliumIpc f51834a;

    /* renamed from: b */
    public final C65682h f51835b;

    /* renamed from: c */
    public final String f51836c;

    /* renamed from: d */
    private final ReentrantReadWriteLock f51837d = new ReentrantReadWriteLock();

    /* renamed from: e */
    private C60870cx f51838e = C60866ct.f164955a;

    public C18264j(GalliumIpc galliumIpc, C65682h hVar, String str) {
        this.f51834a = galliumIpc;
        this.f51835b = hVar;
        this.f51836c = str;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C18253ak.m35566e(mo23743e(C18219aw.m35484b()), "onCompleted", Level.SEVERE, (C70862aj) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        Status d = Status.m102100d(th);
        C18253ak.m35566e(mo23743e(C18219aw.m35485c(d.getCode().value(), d.getDescription())), "onError", Level.SEVERE, (C70862aj) null);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C63070h hVar;
        C65697w wVar = (C65697w) obj;
        C65692r rVar = (C65692r) C65693s.f178486d.createBuilder();
        if (wVar.f178497a == 1) {
            hVar = (C63070h) wVar.f178498b;
        } else {
            hVar = C63070h.f170215c;
        }
        rVar.copyOnWrite();
        C65693s sVar = (C65693s) rVar.instance;
        hVar.getClass();
        sVar.f178489b = hVar;
        sVar.f178488a |= 1;
        C18253ak.m35566e(mo23742d(new C18262h(this, (C65693s) rVar.build())), "onNext", Level.SEVERE, (C70862aj) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C60870cx mo23742d(C58881cr crVar) {
        this.f51837d.writeLock().lock();
        try {
            C60870cx cxVar = this.f51838e;
            C18261g gVar = new C18261g(crVar);
            C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(gVar), this.f51834a.f51694g);
            this.f51838e = h;
            return h;
        } finally {
            this.f51837d.writeLock().unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C60870cx mo23743e(C65699y yVar) {
        return mo23742d(new C18263i(this, yVar));
    }
}
