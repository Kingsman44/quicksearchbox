package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.da */
/* compiled from: PG */
public final class C96596da {

    /* renamed from: b */
    private static final C59071e f270221b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.da");

    /* renamed from: a */
    public C96594cz f270222a;

    /* renamed from: c */
    private final C22871g f270223c;

    /* renamed from: d */
    private final Queue f270224d = new ArrayDeque();

    public C96596da(C22871g gVar) {
        this.f270223c = gVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo90266a(C96588ct ctVar) {
        return mo90267b(ctVar, C96589cu.f270209a, C96590cv.f270210a);
    }

    /* renamed from: b */
    public final synchronized C60870cx mo90267b(C96588ct ctVar, C90919bp bpVar, C90919bp bpVar2) {
        this.f270224d.add(new C96594cz(ctVar, new C96593cy(bpVar, bpVar2)));
        if (!mo90270e()) {
            mo90269d();
        }
        return ctVar.mo90256d();
    }

    /* renamed from: c */
    public final synchronized void mo90268c() {
        if (!mo90270e()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f270224d.clear();
        C96594cz czVar = this.f270222a;
        czVar.getClass();
        czVar.f270215a.mo90259g();
    }

    /* renamed from: d */
    public final synchronized void mo90269d() {
        if (mo90270e()) {
            C59104x d = f270221b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OtaTaskRunner");
            ((C59052c) ((C59052c) d).mo56372aa(16713)).mo56386p("Requested to execute next task when current one did not finish.");
        } else if (this.f270224d.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C96594cz czVar = (C96594cz) this.f270224d.remove();
            this.f270222a = czVar;
            czVar.getClass();
            C60870cx e = czVar.f270215a.mo90257e();
            C22871g gVar = this.f270223c;
            Object[] objArr = new Object[1];
            C96594cz czVar2 = this.f270222a;
            czVar2.getClass();
            objArr[0] = czVar2.f270215a.mo90248a();
            new C90873ag(e, gVar, String.format("Task: %s", objArr), new C96591cw(this)).mo85223a(new C96592cx(this));
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo90270e() {
        return this.f270222a != null;
    }
}
