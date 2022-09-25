package com.google.android.libraries.lens.sdk.p2045c;

import android.os.Bundle;
import com.google.android.libraries.lens.sdk.avs.C24904u;
import com.google.android.libraries.lens.sdk.avs.C24905v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.lens.sdk.c.c */
/* compiled from: PG */
public final /* synthetic */ class C24918c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24923h f68033a;

    /* renamed from: b */
    public final /* synthetic */ int f68034b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f68035c;

    public /* synthetic */ C24918c(C24923h hVar, int i, Bundle bundle) {
        this.f68033a = hVar;
        this.f68034b = i;
        this.f68035c = bundle;
    }

    public final void run() {
        C24923h hVar = this.f68033a;
        int i = this.f68034b;
        Bundle bundle = this.f68035c;
        C59104x b = C24923h.f68044a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) b).mo56372aa(48957)).mo56386p("onClientEventInner");
        C24914a aVar = (C24914a) hVar.f68049f.get(Integer.valueOf(i));
        if (aVar == null) {
            C59104x d = C24923h.f68044a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LensServiceController");
            ((C59052c) ((C59052c) d).mo56372aa(48964)).mo56386p("Unknown client, message ignored.");
            return;
        }
        String string = bundle.getString("SessionType");
        if (string == null) {
            C59104x b2 = C24923h.f68044a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "LensServiceController");
            ((C59052c) ((C59052c) b2).mo56372aa(48963)).mo56386p("Ignored client event without session type");
        } else if (aVar.f68029d.contains(string)) {
            C59104x d2 = C24923h.f68044a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "LensServiceController");
            ((C59052c) ((C59052c) d2).mo56372aa(48962)).mo56389s("Ignored client event with rejected session type %s", string);
        } else if (aVar.mo30135b(string)) {
            C24927l lVar = (C24927l) hVar.f68048e.get(string);
            if (lVar != null) {
                lVar.mo30132b(aVar, bundle);
                return;
            }
            C59104x d3 = C24923h.f68044a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "LensServiceController");
            ((C59052c) ((C59052c) d3).mo56372aa(48961)).mo56389s("Unexpected: controller not exist for session type %s", string);
        } else {
            C24904u uVar = (C24904u) hVar.f68047d.get(string);
            if (uVar == null) {
                C59104x d4 = C24923h.f68044a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "LensServiceController");
                ((C59052c) ((C59052c) d4).mo56372aa(48960)).mo56389s("Unknown session type %s", string);
                return;
            }
            ((C58970a) ((C58970a) C24905v.f68024a.mo56224b()).mo56372aa(48917)).mo56386p("creating VisualSearchController");
            C24927l lVar2 = (C24927l) uVar.f68023a.mo17428b();
            if (lVar2.mo30133c(aVar)) {
                C59104x b3 = C24923h.f68044a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "LensServiceController");
                ((C59052c) ((C59052c) b3).mo56372aa(48959)).mo56395y("client uid %d is accepted by session type %s", i, string);
                aVar.f68028c.add(string);
                hVar.f68048e.put(string, lVar2);
                lVar2.mo30132b(aVar, bundle);
                return;
            }
            C59104x b4 = C24923h.f68044a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "LensServiceController");
            ((C59052c) ((C59052c) b4).mo56372aa(48958)).mo56395y("client uid %d is rejected by session type %s", i, string);
            aVar.f68029d.add(string);
        }
    }
}
