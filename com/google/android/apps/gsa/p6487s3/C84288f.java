package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.C70286co;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.s3.f */
/* compiled from: PG */
final class C84288f extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C84295m f229375a;

    /* renamed from: b */
    final /* synthetic */ C92439c f229376b;

    /* renamed from: c */
    final /* synthetic */ C84290h f229377c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84288f(C84290h hVar, C84295m mVar, C92439c cVar) {
        super("S3Connection", 1, 4);
        this.f229377c = hVar;
        this.f229375a = mVar;
        this.f229376b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C84290h.f229383a.mo56225c()).mo56382g(th)).mo56372aa(7152)).mo56386p("gRPC channel construction failed");
        C84292j.m134451c(this.f229375a, th, 65539);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C84290h hVar = this.f229377c;
        hVar.f229384b = (C70286co) obj;
        C70862aj b = C84292j.m134450b(this.f229375a, hVar.f229384b);
        C84290h hVar2 = this.f229377c;
        C92439c cVar = this.f229376b;
        C84295m mVar = this.f229375a;
        C70286co coVar = hVar2.f229384b;
        try {
            cVar.mo87118a().mo20440jJ(new C84289g(b, mVar, coVar));
        } catch (C90523o e) {
            b.mo20122b(Status.f186913k.asException());
            C84292j.m134451c(mVar, e, 65549);
            coVar.mo61974f();
        }
    }
}
