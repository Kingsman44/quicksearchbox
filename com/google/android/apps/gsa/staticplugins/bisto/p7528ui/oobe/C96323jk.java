package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import androidx.lifecycle.C2358bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95302h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.jk */
/* compiled from: PG */
public final class C96323jk extends C2358bf {

    /* renamed from: a */
    public C68214a f269536a;

    /* renamed from: b */
    public String f269537b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        C95299e eVar;
        if (this.f269537b != null && this.f269536a != null) {
            C59104x b = OobeActivity.f268955k.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OobeActivity");
            ((C59052c) ((C59052c) b).mo56372aa(17053)).mo56389s("Flush Log %s", this.f269537b);
            C95302h hVar = (C95302h) this.f269536a.mo27525b();
            String str = this.f269537b;
            synchronized (hVar.f266669c) {
                eVar = (C95299e) hVar.f266669c.remove(str);
                if (eVar != null && eVar.f266651f.get()) {
                    C59104x d = C95302h.f266667a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoOobeLogSessionImpl");
                    ((C59052c) ((C59052c) d).mo56372aa(14865)).mo56389s("Orphan session %s", str);
                    hVar.f266669c.put(str, eVar);
                }
            }
            if (eVar != null) {
                C59104x b2 = C95302h.f266667a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "BistoOobeLogSessionImpl");
                ((C59052c) ((C59052c) b2).mo56372aa(14864)).mo56389s("End OOBE session %s", str);
                eVar.mo89232b(false);
                return;
            }
            C59104x d2 = C95302h.f266667a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoOobeLogSessionImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(14863)).mo56389s("Missing OOBE session %s", str);
        }
    }
}
