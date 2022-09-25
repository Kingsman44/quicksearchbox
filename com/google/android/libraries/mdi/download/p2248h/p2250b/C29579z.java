package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.geller.p1818f.p1819a.C21790e;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.mdi.download.h.b.z */
/* compiled from: PG */
public final /* synthetic */ class C29579z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80143a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f80144b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f80145c;

    public /* synthetic */ C29579z(C29538as asVar, C58872ci ciVar, C65753ak akVar) {
        this.f80143a = asVar;
        this.f80144b = ciVar;
        this.f80145c = akVar;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80143a;
        C58872ci ciVar = this.f80144b;
        C65753ak akVar = this.f80145c;
        C58495hd hdVar = (C58495hd) obj;
        C21790e.m40906a(asVar.f80063j, hdVar, ciVar.mo56158a(TimeUnit.MILLISECONDS), C65813cq.PERIODIC);
        return C29538as.m54520c(hdVar, akVar);
    }
}
