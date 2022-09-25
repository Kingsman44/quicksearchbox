package com.google.android.apps.gsa.p6487s3;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66611ci;
import p5488io.grpc.C70286co;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.s3.t */
/* compiled from: PG */
public final class C84331t implements C70862aj {

    /* renamed from: a */
    private static final C59071e f229520a = C59071e.m91332i("com.google.android.apps.gsa.s3.t");

    /* renamed from: b */
    private final C70286co f229521b;

    /* renamed from: c */
    private final C84295m f229522c;

    public C84331t(C70286co coVar, C84295m mVar) {
        this.f229521b = coVar;
        this.f229522c = mVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59104x b = f229520a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcS3Connection");
        ((C59052c) ((C59052c) b).mo56372aa(7210)).mo56386p("gRPC call completed, shutting down channel");
        this.f229521b.mo61975g();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = f229520a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GrpcS3Connection");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7211)).mo56386p("ResponseObserver: onError");
        C84292j.m134451c(this.f229522c, th, 65544);
        this.f229521b.mo61975g();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f229522c.mo77833d((C66611ci) obj);
    }
}
