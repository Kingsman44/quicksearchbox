package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.gms.car.C143111aw;
import com.google.android.gms.car.C143112ax;
import com.google.android.gms.car.C143118bb;
import com.google.android.gms.car.C143121be;
import com.google.android.gms.car.C143340y;
import com.google.android.gms.car.C143341z;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1012b.p1013a.C13647b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.f */
/* compiled from: PG */
final class C101376f implements C143341z {

    /* renamed from: a */
    final /* synthetic */ C60870cx f282896a;

    /* renamed from: b */
    final /* synthetic */ C101378h f282897b;

    public C101376f(C101378h hVar, C60870cx cxVar) {
        this.f282897b = hVar;
        this.f282896a = cxVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo20043a(int i) {
        C59104x b = C101378h.f282901a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarClientTokenFctryImpl");
        ((C59052c) ((C59052c) b).mo56372aa(20084)).mo56387q("CarConnectionListener#CarConnected, connectionType=%d", i);
        try {
            C143121be beVar = this.f282897b.f282904d;
            beVar.getClass();
            C143118bb a = C143340y.m232551a(beVar);
            if (a == null) {
                C59104x d = C101378h.f282901a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CarClientTokenFctryImpl");
                ((C59052c) ((C59052c) d).mo56372aa(20087)).mo56386p("Unexpected null CarVendorExtensionManager");
            } else if (this.f282897b.f282903c.mo79746e(C90086ek.f250348bT)) {
                C101378h.m167685b(this.f282896a, new C101375e(a));
            } else {
                ((C13647b) this.f282897b.f282902b.mo27525b()).mo21200a(a);
            }
        } catch (C143111aw | IllegalStateException | SecurityException e) {
            C59104x c = C101378h.f282901a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CarClientTokenFctryImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(20085)).mo56386p("Error connecting to vendor extension");
        } catch (C143112ax e2) {
            C59104x b2 = C101378h.f282901a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "CarClientTokenFctryImpl");
            ((C59052c) ((C59052c) ((C59052c) b2).mo56382g(e2)).mo56372aa(20086)).mo56386p("Car not supported for vendor extension");
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo20044b() {
        C59104x b = C101378h.f282901a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarClientTokenFctryImpl");
        ((C59052c) ((C59052c) b).mo56372aa(20088)).mo56386p("CarConnectionListener#CarDisconnected");
        this.f282897b.mo92272c(this.f282896a);
    }
}
