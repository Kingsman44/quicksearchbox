package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9087b;

import com.google.android.apps.gsa.binaries.satin.app.asa;
import com.google.android.apps.gsa.binaries.satin.app.asm;
import com.google.android.apps.gsa.binaries.satin.app.avn;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119779aa;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119906y;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.C120479b;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120464l;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120476x;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120692g;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33578c;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2605b.C33586a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2605b.C33587b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33437e;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.b.a */
/* compiled from: PG */
public final class C120480a {
    /* renamed from: a */
    public static C120479b m199547a(C119779aa aaVar, C120476x xVar, avn avn, Optional optional, Optional optional2, C120691f fVar, C120692g gVar, C33437e eVar, C33447g gVar2) {
        avn avn2 = avn;
        C34053bp bpVar = fVar.f335676b;
        if (bpVar == null) {
            bpVar = C34053bp.f90753a;
        }
        C119906y yVar = aaVar.f333645b;
        if (yVar == null) {
            yVar = C119906y.f333913e;
        }
        if (!yVar.f333918d || C34708c.m63443b(bpVar) || bpVar.equals(C34053bp.f90753a) || !optional.isPresent() || !optional2.isPresent()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return xVar;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        C69664n.m101061g(bpVar, "invocationToken");
        asm asm = ((C33586a) optional.get()).f89797a;
        return new C120464l(new C33578c(bpVar, (asa) asm.f201461a.a.d.f201694du.mo17428b(), (C71422aw) asm.f201461a.a.ft.mo17428b(), (Executor) asm.f201461a.a.n.mo17428b()), ((C33587b) optional2.get()).mo38996a(bpVar), gVar, eVar, gVar2, (Executor) avn2.f204439a.a.n.mo17428b(), (C71422aw) avn2.f204439a.a.H.mo17428b());
    }
}
