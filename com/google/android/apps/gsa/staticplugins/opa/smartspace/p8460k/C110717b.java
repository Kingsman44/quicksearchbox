package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.k.b */
/* compiled from: PG */
public final /* synthetic */ class C110717b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110722g f308501a;

    public /* synthetic */ C110717b(C110722g gVar) {
        this.f308501a = gVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110722g gVar = this.f308501a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent() || ((Boolean) optional.get()).booleanValue()) {
            SettableFuture settableFuture = new SettableFuture();
            new C90873ag(gVar.f308511e.mo28201a("loadActiveEvents", new C110719d(gVar)), gVar.f308511e, "loadActiveEvents", new C110720e(gVar, settableFuture)).mo85223a(new C110721f(settableFuture));
            return settableFuture;
        }
        C59104x d = C110722g.f308507a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "opaSmartspaceRmCtrl");
        ((C59052c) ((C59052c) d).mo56372aa(26727)).mo56386p("sending personal data is not allowed, not fetching reminders");
        return C118826c.f331423b;
    }
}
