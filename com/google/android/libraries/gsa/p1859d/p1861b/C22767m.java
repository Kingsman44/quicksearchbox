package com.google.android.libraries.gsa.p1859d.p1861b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.d.b.m */
/* compiled from: PG */
final class C22767m implements C22752ab {

    /* renamed from: a */
    final /* synthetic */ C22768n f62651a;

    public C22767m(C22768n nVar) {
        this.f62651a = nVar;
    }

    /* renamed from: k */
    private final void m42487k() {
        C22768n nVar = this.f62651a;
        if (nVar.f62675aw != null && nVar.f62663ak >= 10) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("overlay_animation_complete", true);
                this.f62651a.f62675aw.mo28130c(bundle);
                this.f62651a.mo28065z();
            } catch (RemoteException e) {
                C59104x c = C22768n.f62652ad.mo56225c();
                c.mo56378ag(C58975e.f156826a, "wo.OverlayController");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48556)).mo56386p("Remote exception in onOverlayTransitionCompleted");
            }
        }
    }

    /* renamed from: a */
    public final String mo27944a() {
        return "TransparentModePanelCallback";
    }

    /* renamed from: b */
    public final void mo27945b() {
        C59071e eVar = C22768n.f62652ad;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: c */
    public final void mo27946c() {
    }

    /* renamed from: d */
    public final void mo27947d(float f) {
    }

    /* renamed from: e */
    public final boolean mo27948e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo27949f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo27950g() {
        return false;
    }

    /* renamed from: h */
    public final void mo27951h(float f, int i) {
        C22768n nVar = this.f62651a;
        nVar.f62655aB = i;
        nVar.f62678az = f;
        nVar.mo28043ac(true);
        this.f62651a.mo28042ab(false);
        this.f62651a.mo28047ag(1);
        C22768n nVar2 = this.f62651a;
        nVar2.f62669aq.mo27969k(nVar2.f62658af);
        m42487k();
    }

    /* renamed from: i */
    public final void mo27952i(boolean z, float f, int i) {
    }

    /* renamed from: j */
    public final void mo27953j(float f, int i) {
        C22768n nVar = this.f62651a;
        nVar.f62655aB = i;
        nVar.f62678az = f;
        nVar.mo28042ab(true);
        this.f62651a.mo28043ac(false);
        this.f62651a.mo28047ag(4);
        m42487k();
    }
}
