package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.g.a.y */
/* compiled from: PG */
public final /* synthetic */ class C39754y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39718aa f104583a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f104584b;

    public /* synthetic */ C39754y(C39718aa aaVar, AtomicReference atomicReference) {
        this.f104583a = aaVar;
        this.f104584b = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C39718aa aaVar = this.f104583a;
        AtomicReference atomicReference = this.f104584b;
        TimeoutException timeoutException = (TimeoutException) obj;
        C59104x c = C39718aa.f104523a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaResourceMgrClient");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(timeoutException)).mo56372aa(53842)).mo56386p("updateAndGetSnapshot failed, falling back to default resources.");
        C58833ax axVar = (C58833ax) atomicReference.get();
        if (axVar.mo56113h()) {
            ((C70862aj) axVar.mo56107c()).mo20122b(timeoutException);
        }
        return aaVar.f104526c.mo42009a();
    }
}
