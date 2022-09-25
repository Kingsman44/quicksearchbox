package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17867g;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5488io.grpc.C70148al;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.az */
/* compiled from: PG */
public final class C119606az implements C70862aj {

    /* renamed from: a */
    private static final C59071e f333347a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.az");

    /* renamed from: b */
    private C119616bb f333348b;

    /* renamed from: c */
    private final C70862aj f333349c;

    /* renamed from: d */
    private final C119617bc f333350d;

    public C119606az(C119617bc bcVar, C70862aj ajVar) {
        this.f333350d = bcVar;
        this.f333349c = ajVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f333349c.mo20121a();
        this.f333350d.mo104462e(this.f333348b);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f333347a.mo56225c()).mo56382g(th)).mo56372aa(34493)).mo56386p("onError()");
        C119616bb bbVar = this.f333348b;
        if (bbVar != null) {
            bbVar.mo104443f();
            this.f333350d.mo104462e(this.f333348b);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        ParcelableBinder parcelableBinder;
        C17867g gVar = (C17867g) obj;
        if ((gVar.f51198a & 1) != 0) {
            this.f333348b = this.f333350d.mo104458a(gVar, this.f333349c);
        }
        if (gVar.f51201d && (parcelableBinder = (ParcelableBinder) C119619be.f333370b.mo61711a(C70148al.m102135m())) != null) {
            C119616bb bbVar = this.f333348b;
            if (bbVar == null) {
                this.f333349c.mo20122b(Status.f186912j.withDescription("Package name is missing.").asException());
                ((C59052c) ((C59052c) f333347a.mo56225c()).mo56372aa(34496)).mo56386p("Package name is missing.");
            } else {
                bbVar.mo104446i(parcelableBinder.f333271a);
            }
        }
        if ((gVar.f51198a & 2) != 0) {
            C119616bb bbVar2 = this.f333348b;
            if (bbVar2 == null) {
                this.f333349c.mo20122b(Status.f186912j.withDescription("Package name is missing.").asException());
                ((C59052c) ((C59052c) f333347a.mo56225c()).mo56372aa(34495)).mo56386p("Package name is missing.");
                return;
            }
            C17881ak akVar = gVar.f51200c;
            if (akVar == null) {
                akVar = C17881ak.f51231h;
            }
            bbVar2.mo104445h(akVar);
        }
    }
}
