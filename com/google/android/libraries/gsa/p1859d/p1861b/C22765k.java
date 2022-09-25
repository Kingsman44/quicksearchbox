package com.google.android.libraries.gsa.p1859d.p1861b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.d.b.k */
/* compiled from: PG */
final class C22765k implements C22752ab {

    /* renamed from: a */
    final /* synthetic */ C22768n f62648a;

    public C22765k(C22768n nVar) {
        this.f62648a = nVar;
    }

    /* renamed from: k */
    private final void m42476k() {
        this.f62648a.mo28065z();
        C22768n nVar = this.f62648a;
        if (nVar.f62675aw != null && nVar.f62663ak >= 10) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("overlay_animation_complete", true);
                C58976aa aaVar = C58975e.f156826a;
                this.f62648a.f62675aw.mo28130c(bundle);
            } catch (RemoteException e) {
                C59104x c = C22768n.f62652ad.mo56225c();
                c.mo56378ag(C58975e.f156826a, "wo.OverlayController");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48550)).mo56386p("Remote exception in onOverlayTransitionCompleted");
            }
        }
    }

    /* renamed from: a */
    public final String mo27944a() {
        return "SlidingPanelCallback";
    }

    /* renamed from: b */
    public final void mo27945b() {
        this.f62648a.mo28047ag(2);
        this.f62648a.mo28043ac(false);
    }

    /* renamed from: c */
    public final void mo27946c() {
        this.f62648a.mo28047ag(2);
        this.f62648a.mo28042ab(true);
        this.f62648a.mo28043ac(false);
    }

    /* renamed from: d */
    public final void mo27947d(float f) {
        if (this.f62648a.f62675aw != null && !Float.isNaN(f)) {
            try {
                this.f62648a.f62675aw.mo28128a(f);
                C58976aa aaVar = C58975e.f156826a;
                this.f62648a.mo28057r(f);
                if (f <= 0.0f) {
                    this.f62648a.f62657ae.mo28121a("onPanelProgressChanged 0, overlay closed");
                } else if (f >= 1.0f) {
                    this.f62648a.f62657ae.mo28121a("onPanelProgressChanged 1, overlay opened");
                } else {
                    this.f62648a.f62657ae.mo28123c(1, "onPanelProgressChanged", f);
                }
            } catch (RemoteException e) {
                C59104x c = C22768n.f62652ad.mo56225c();
                c.mo56378ag(C58975e.f156826a, "wo.OverlayController");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48555)).mo56386p("Error notifying client");
            }
        }
    }

    /* renamed from: e */
    public final boolean mo27948e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo27949f() {
        return this.f62648a.mo28025J();
    }

    /* renamed from: g */
    public final boolean mo27950g() {
        return false;
    }

    /* renamed from: h */
    public final void mo27951h(float f, int i) {
        C59071e eVar = C22768n.f62652ad;
        C58976aa aaVar = C58975e.f156826a;
        C22768n nVar = this.f62648a;
        nVar.f62655aB = i;
        nVar.f62678az = f;
        nVar.mo28043ac(true);
        this.f62648a.mo28047ag(1);
        m42476k();
    }

    /* renamed from: i */
    public final void mo27952i(boolean z, float f, int i) {
        C59071e eVar = C22768n.f62652ad;
        C58976aa aaVar = C58975e.f156826a;
        C22768n nVar = this.f62648a;
        nVar.f62655aB = i;
        nVar.f62678az = f;
        if (z) {
            nVar.mo28056q();
        }
        this.f62648a.mo28047ag(2);
        this.f62648a.mo28042ab(false);
    }

    /* renamed from: j */
    public final void mo27953j(float f, int i) {
        C59071e eVar = C22768n.f62652ad;
        C58976aa aaVar = C58975e.f156826a;
        C22768n nVar = this.f62648a;
        nVar.f62655aB = i;
        nVar.f62678az = f;
        nVar.mo28047ag(3);
        m42476k();
    }
}
