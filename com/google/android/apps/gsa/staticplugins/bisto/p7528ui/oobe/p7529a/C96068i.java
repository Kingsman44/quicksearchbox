package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.p7529a;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95302h;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.a.i */
/* compiled from: PG */
public final class C96068i implements C68220f {
    /* renamed from: a */
    public static C95299e m159347a(C95302h hVar, String str, C60105ky kyVar, Bundle bundle) {
        C95299e eVar;
        C95299e a;
        String string = bundle.getString("oobe_id");
        string.getClass();
        synchronized (hVar.f266669c) {
            eVar = (C95299e) hVar.f266669c.get(string);
            if (eVar == null) {
                C59104x b = C95302h.f266667a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoOobeLogSessionImpl");
                ((C59052c) ((C59052c) b).mo56372aa(14860)).mo56389s("Missing session, resume %s", string);
                synchronized (hVar.f266669c) {
                    C59104x b2 = C95302h.f266667a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "BistoOobeLogSessionImpl");
                    ((C59052c) ((C59052c) b2).mo56372aa(14861)).mo56389s("Resume OOBE Session %s", string);
                    a = hVar.f266668b.mo89238a();
                    C59104x b3 = C95299e.f266645a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
                    ((C59052c) ((C59052c) b3).mo56372aa(14856)).mo56387q("Resume from source %d", kyVar.f162530s);
                    a.f266648c = string;
                    a.mo89233c(str, (C124548d) null, kyVar);
                    hVar.f266669c.put(string, a);
                }
                eVar = a;
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
