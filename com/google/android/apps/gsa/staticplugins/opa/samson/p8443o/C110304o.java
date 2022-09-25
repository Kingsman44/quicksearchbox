package com.google.android.apps.gsa.staticplugins.opa.samson.p8443o;

import androidx.lifecycle.C2332ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.o.o */
/* compiled from: PG */
final class C110304o extends C2332ag {

    /* renamed from: h */
    final /* synthetic */ C110305p f307426h;

    public C110304o(C110305p pVar) {
        this.f307426h = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        if (this.f307426h.mo98552c()) {
            try {
                C59104x b = C110305p.f307427a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "DCProviderAcc");
                ((C59052c) ((C59052c) b).mo56372aa(25983)).mo56386p("registerContentObserver");
                C110305p pVar = this.f307426h;
                pVar.f307438k.registerContentObserver(pVar.f307430c, false, pVar.f307434g);
            } catch (Throwable th) {
                C59104x c = C110305p.f307427a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DCProviderAcc");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25984)).mo56386p("Failed to register observer");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        if (this.f307426h.mo98552c()) {
            try {
                C59104x b = C110305p.f307427a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "DCProviderAcc");
                ((C59052c) ((C59052c) b).mo56372aa(25985)).mo56386p("unregisterContentObserver");
                C110305p pVar = this.f307426h;
                pVar.f307438k.unregisterContentObserver(pVar.f307434g);
            } catch (Throwable th) {
                C59104x c = C110305p.f307427a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DCProviderAcc");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25986)).mo56386p("Failed to unregister observer");
            }
        }
    }
}
