package com.google.android.apps.gsa.speech.p7295k.p7296a;

import com.google.android.apps.gsa.p6487s3.producers.C84309h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.p4541l.C59317ae;

/* renamed from: com.google.android.apps.gsa.speech.k.a.f */
/* compiled from: PG */
final class C92442f extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C92443g f257811a;

    /* renamed from: b */
    private final C84309h f257812b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92442f(C92443g gVar, C84309h hVar) {
        super("OnProducerReady", 1, 4);
        this.f257811a = gVar;
        this.f257812b = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        synchronized (this.f257811a.f257815b) {
            C59317ae.m92163a(this.f257812b);
            this.f257811a.f257814a.remove(this.f257812b);
            if (this.f257811a.f257814a.isEmpty()) {
                this.f257811a.mo87123c(false);
            } else {
                this.f257811a.f257816c.remove(this.f257812b);
            }
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        synchronized (this.f257811a.f257815b) {
            this.f257811a.f257816c.remove(this.f257812b);
            C92443g gVar = this.f257811a;
            if (!gVar.f257817d) {
                gVar.mo87124d();
            }
        }
    }
}
