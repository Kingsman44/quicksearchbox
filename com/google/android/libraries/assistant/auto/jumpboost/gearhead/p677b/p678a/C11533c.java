package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.p678a;

import com.google.android.gms.car.C143111aw;
import com.google.android.gms.car.C143112ax;
import com.google.android.gms.car.C143118bb;
import com.google.android.gms.car.C143121be;
import com.google.android.gms.car.C143340y;
import com.google.android.gms.car.C143341z;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11552b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.c */
/* compiled from: PG */
final class C11533c implements C143341z {

    /* renamed from: a */
    final /* synthetic */ C11552b f37415a;

    /* renamed from: b */
    final /* synthetic */ C11534d f37416b;

    public C11533c(C11534d dVar, C11552b bVar) {
        this.f37416b = dVar;
        this.f37415a = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo20043a(int i) {
        C59104x b = C11534d.f37417a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarClientTokenFactory");
        ((C59052c) ((C59052c) b).mo56372aa(43358)).mo56387q("CarConnectionListener#CarConnected, connectionType=%d", i);
        try {
            C143121be beVar = this.f37416b.f37419c;
            beVar.getClass();
            C143118bb a = C143340y.m232551a(beVar);
            if (a == null) {
                C59104x d = C11534d.f37417a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CarClientTokenFactory");
                ((C59052c) ((C59052c) d).mo56372aa(43361)).mo56386p("Unexpected null CarVendorExtensionManager");
                return;
            }
            this.f37415a.mo20009a(a);
        } catch (C143111aw | IllegalStateException | SecurityException e) {
            C59104x c = C11534d.f37417a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CarClientTokenFactory");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(43359)).mo56386p("Error connecting to vendor extension");
        } catch (C143112ax e2) {
            C59104x b2 = C11534d.f37417a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "CarClientTokenFactory");
            ((C59052c) ((C59052c) ((C59052c) b2).mo56382g(e2)).mo56372aa(43360)).mo56386p("Car not supported for vendor extension");
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo20044b() {
        C59104x b = C11534d.f37417a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarClientTokenFactory");
        ((C59052c) ((C59052c) b).mo56372aa(43362)).mo56386p("CarConnectionListener#CarDisconnected");
        this.f37415a.mo20010b();
    }
}
