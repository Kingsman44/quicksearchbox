package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.tasks.C146039s;
import com.google.android.gms.usonia.directory.C146207a;
import com.google.android.libraries.cast.usonia.adapter.p1674a.C19706e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p427am.p438d.p439a.C8744br;
import com.google.p427am.p438d.p439a.C8765cl;
import com.google.p427am.p438d.p439a.C8766cm;
import com.google.p427am.p438d.p439a.C8767cn;
import com.google.p427am.p438d.p439a.C8828v;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.k */
/* compiled from: PG */
public final class C19723k extends C8828v {

    /* renamed from: a */
    public static final C59071e f54768a;

    /* renamed from: b */
    public static final C146039s f54769b;

    /* renamed from: c */
    public final C146207a f54770c;

    static {
        C59071e h = C59071e.m91331h();
        f54768a = h;
        f54769b = new C19706e(h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19723k(C146207a aVar) {
        super(C69586p.f185991a);
        C69664n.m101061g(aVar, "directoryClient");
        this.f54770c = aVar;
    }

    /* renamed from: b */
    public final C71587n mo17245b(C8744br brVar) {
        C69664n.m101061g(brVar, "request");
        C59052c cVar = (C59052c) f54768a.mo56226d();
        cVar.mo56379ah(new C59094n(47915));
        cVar.mo56386p("observeCommonTime() not implemented");
        throw new StatusException(Status.f186916n, (C70334de) null);
    }

    /* renamed from: c */
    public final C71587n mo17246c(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        C59052c cVar = (C59052c) f54768a.mo56226d();
        cVar.mo56379ah(new C59094n(47916));
        cVar.mo56386p("updateMessageObservers() not implemented");
        throw new StatusException(Status.f186916n, (C70334de) null);
    }

    /* renamed from: d */
    public final C71587n mo17247d(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        return C71590q.m104504a(new C19722j(nVar, this, (C69577g) null));
    }

    /* renamed from: e */
    public final Object mo17248e() {
        C59052c cVar = (C59052c) f54768a.mo56226d();
        cVar.mo56379ah(new C59094n(47912));
        cVar.mo56386p("localDeviceInfo() not implemented");
        throw new StatusException(Status.f186916n, (C70334de) null);
    }

    /* renamed from: f */
    public final Object mo17249f() {
        C59052c cVar = (C59052c) f54768a.mo56226d();
        cVar.mo56379ah(new C59094n(47913));
        cVar.mo56386p("sendMessage() not implemented");
        throw new StatusException(Status.f186916n, (C70334de) null);
    }

    /* renamed from: g */
    public final Object mo17250g(C8765cl clVar) {
        int i = clVar.f30128c;
        int i2 = 0;
        int i3 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = i3 - 2;
        if (i4 == 0) {
            i2 = 1;
        } else if (i4 == 1) {
            i2 = 2;
        } else if (i4 == 2) {
            i2 = 3;
        }
        if (i2 != 0) {
            this.f54770c.mo122755k(clVar.f30126a, clVar.f30127b.mo59174N(), i2).mo122498q(f54769b);
            C8766cm cmVar = (C8766cm) C8767cn.f30129a.createBuilder();
            C69664n.m101060f(cmVar, "newBuilder()");
            C69664n.m101061g(cmVar, "builder");
            C62942bv build = cmVar.build();
            C69664n.m101060f(build, "_builder.build()");
            return (C8767cn) build;
        }
        C59052c cVar = (C59052c) f54768a.mo56226d();
        cVar.mo56379ah(new C59094n(47914));
        cVar.mo56389s("Failed to set state for request %s", clVar);
        throw new StatusException(Status.f186906d, (C70334de) null);
    }
}
