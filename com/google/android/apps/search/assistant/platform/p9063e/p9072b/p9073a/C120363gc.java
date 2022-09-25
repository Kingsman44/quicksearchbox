package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9032d.C119736a;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67186ad;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.gc */
/* compiled from: PG */
public final class C120363gc implements C17268f {

    /* renamed from: a */
    private final C119736a f334860a;

    /* renamed from: b */
    private final C120362gb f334861b;

    public C120363gc(C119736a aVar, C120362gb gbVar) {
        this.f334860a = aVar;
        this.f334861b = gbVar;
    }

    /* renamed from: a */
    public final void mo23256a() {
        this.f334860a.mo104494b((Throwable) null);
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        this.f334860a.mo104494b(th);
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C67186ad.f182611f);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C67186ad.f182611f);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C67186ad adVar = (C67186ad) obj;
            C120362gb gbVar = this.f334861b;
            if (!gbVar.f334858a.getAndSet(true)) {
                gbVar.f334859b.mo19974a(C37176a.f96889bG);
            }
            if (adVar.f182615c) {
                this.f334861b.f334859b.mo19974a(C37176a.f96890bH);
            }
            this.f334860a.mo104495c(adVar);
        }
    }
}
