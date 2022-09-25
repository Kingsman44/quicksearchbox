package com.google.android.apps.gsa.staticplugins.nga.p8051e;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65789bt;
import com.google.protos.p5129p.p5131b.C65811co;
import com.google.protos.p5129p.p5131b.C65819cw;
import p5488io.grpc.C70286co;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.e.d */
/* compiled from: PG */
public final /* synthetic */ class C103025d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103028g f287619a;

    /* renamed from: b */
    public final /* synthetic */ C65811co f287620b;

    public /* synthetic */ C103025d(C103028g gVar, C65811co coVar) {
        this.f287619a = gVar;
        this.f287620b = coVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103028g gVar = this.f287619a;
        C65811co coVar = this.f287620b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C65819cw.f178926i);
        }
        return gVar.f287625a.mo28205e(C65789bt.m96808a((C70286co) axVar.mo56107c()).mo59428b(coVar), "[NGA] DeeplinkGrpcHelper.getServerResponse.catchRPCError", Exception.class, C103026e.f287621a);
    }
}
