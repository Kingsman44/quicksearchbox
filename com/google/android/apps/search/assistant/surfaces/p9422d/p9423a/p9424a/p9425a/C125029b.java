package com.google.android.apps.search.assistant.surfaces.p9422d.p9423a.p9424a.p9425a;

import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66607ce;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.apps.search.assistant.surfaces.d.a.a.a.b */
/* compiled from: PG */
final class C125029b extends C57975a {

    /* renamed from: a */
    private final Object f344958a = new Object();

    /* renamed from: b */
    private final C70868g f344959b;

    public C125029b(C70868g gVar) {
        this.f344959b = gVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C66607ce ceVar = (C66607ce) obj;
        synchronized (this.f344958a) {
            this.f344959b.mo20123c(ceVar);
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        synchronized (this.f344958a) {
            this.f344959b.mo20121a();
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        synchronized (this.f344958a) {
            this.f344959b.mo20122b(Status.f186913k.mo61678e(th).asException());
        }
    }
}
