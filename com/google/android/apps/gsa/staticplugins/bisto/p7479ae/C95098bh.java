package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124646bl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bh */
/* compiled from: PG */
final class C95098bh implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C95099bi f266055a;

    public C95098bh(C95099bi biVar) {
        this.f266055a = biVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C95099bi.f266056a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "QueryHelper");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(18058)).mo56389s("Failed to get deviceinfo for %s", this.f266055a.f266058c.mo89270k());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        boolean z;
        C124548d dVar = (C124548d) obj;
        synchronized (this.f266055a) {
            C95099bi biVar = this.f266055a;
            if (!C124719q.CAR_ACCESSORY.equals(dVar.mo106513k())) {
                if (!dVar.mo106526x().f386149b) {
                    z = false;
                    biVar.f266059d = z;
                    this.f266055a.f266060e = C124707e.INPUT_ONLY_MODE.equals(dVar.mo106508g());
                    C124646bl t = dVar.mo106522t();
                    this.f266055a.f266061f = !C124646bl.SOUND_DISABLED.equals(t);
                }
            }
            z = true;
            biVar.f266059d = z;
            this.f266055a.f266060e = C124707e.INPUT_ONLY_MODE.equals(dVar.mo106508g());
            C124646bl t2 = dVar.mo106522t();
            this.f266055a.f266061f = !C124646bl.SOUND_DISABLED.equals(t2);
        }
    }
}
