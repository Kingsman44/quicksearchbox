package com.google.android.libraries.search.p3055n.p3075e.p3076a;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C39679a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39683e f104443a;

    /* renamed from: b */
    public final /* synthetic */ C39294ao f104444b;

    public /* synthetic */ C39679a(C39683e eVar, C39294ao aoVar) {
        this.f104443a = eVar;
        this.f104444b = aoVar;
    }

    public final Object call() {
        C39683e eVar = this.f104443a;
        C39294ao aoVar = this.f104444b;
        C58838bb.m90884s(!eVar.f104451d.isPresent(), "Already have an ASR service callback!");
        C59104x b = C39683e.f104448a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SAO_Impl");
        ((C59052c) ((C59052c) b).mo56372aa(53797)).mo56386p("Registering AsrServiceCallback");
        eVar.f104451d = Optional.m71637of(aoVar);
        return new C39682d(eVar);
    }
}
