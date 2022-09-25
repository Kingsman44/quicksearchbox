package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C94997o;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95005w;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.q */
/* compiled from: PG */
public final /* synthetic */ class C94956q implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94961v f265622a;

    public /* synthetic */ C94956q(C94961v vVar) {
        this.f265622a = vVar;
    }

    public final void run() {
        C94961v vVar = this.f265622a;
        vVar.f265636i = false;
        if (vVar.f265637j == null) {
            C59104x d = C94961v.f265628a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) d).mo56372aa(17699)).mo56386p("Not decoding");
            return;
        }
        vVar.mo88862a();
        vVar.mo88870i();
        C94948i iVar = vVar.f265631d;
        C58976aa aaVar = C58975e.f156826a;
        if (!iVar.f265605e.get()) {
            C59104x c = C94948i.f265601a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17675)).mo56386p("Input not started!");
        } else {
            iVar.f265604d.mo88853b();
            C95005w wVar = iVar.f265602b;
            wVar.f265807a.execute(new C94997o(wVar));
            iVar.f265605e.set(false);
            iVar.f265606f.set(false);
        }
        vVar.f265633f.mo88938c();
        synchronized (vVar) {
            if (vVar.f265644q != vVar.f265643p) {
                long j = ((long) (vVar.f265642o * 1000)) / (vVar.f265644q - vVar.f265643p);
                C59104x b = C94961v.f265628a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VoiceInputListener");
                ((C59052c) ((C59052c) b).mo56372aa(17698)).mo56359L("throughput: %d, bytes: %d, duration %d ms", Long.valueOf(j), Integer.valueOf(vVar.f265642o), Long.valueOf(vVar.f265644q - vVar.f265643p));
            }
            vVar.f265639l = null;
            vVar.f265645r = 4;
            vVar.f265640m = 0;
            vVar.f265641n = 0;
            vVar.f265642o = 0;
        }
    }
}
