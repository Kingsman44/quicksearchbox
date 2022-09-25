package com.google.android.apps.gsa.staticplugins.bisto.p7493k;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.k.b */
/* compiled from: PG */
public final /* synthetic */ class C95476b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95477c f267165a;

    /* renamed from: b */
    public final /* synthetic */ String f267166b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f267167c;

    public /* synthetic */ C95476b(C95477c cVar, String str, C124548d dVar) {
        this.f267165a = cVar;
        this.f267166b = str;
        this.f267167c = dVar;
    }

    public final void run() {
        C95477c cVar = this.f267165a;
        String str = this.f267166b;
        C124548d dVar = this.f267167c;
        if (C124715m.FULLY_CONNECTED.equals(dVar.mo106512j())) {
            if (cVar.f267171d.isPresent()) {
                ((C95307m) ((C68214a) cVar.f267171d.get()).mo27525b()).mo83543a("DeviceHelper", "Orphan connected GACS device");
                return;
            }
            C59104x c = C95477c.f267168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceHelperImpl");
            ((C59052c) ((C59052c) c).mo56372aa(15078)).mo56386p("Orphan connected GACS device");
        } else if (((Boolean) dVar.mo106469J().map(new C95475a(cVar)).orElse(false)).booleanValue()) {
            C59104x d = C95477c.f267168a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDeviceHelperImpl");
            ((C59052c) ((C59052c) d).mo56372aa(15077)).mo56386p("Not deleting an orphan GACS device yet.");
        } else {
            C59104x d2 = C95477c.f267168a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoDeviceHelperImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(15076)).mo56386p("Delete orphan GACS device yet.");
            ((C89492cd) cVar.f267170c.mo27525b()).mo83361C(str);
        }
    }
}
