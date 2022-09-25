package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ca */
/* compiled from: PG */
public final class C96569ca extends C96558bq {

    /* renamed from: a */
    public static final C59071e f270168a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.ca");

    /* renamed from: b */
    private final C96618u f270169b;

    public C96569ca(C22871g gVar, C96525ak akVar, C68214a aVar, C96618u uVar, C96534at atVar, C96533as asVar, C95355bf bfVar) {
        super(gVar, akVar, aVar, atVar, asVar, uVar, bfVar);
        this.f270169b = uVar;
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.UPLOADING_DFU_TO_HEADSET;
    }

    /* renamed from: e */
    public final void mo90228e(C124629av avVar, C124548d dVar) {
        super.mo90228e(avVar, dVar);
        C59104x b = f270168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaStateUploading");
        ((C59052c) ((C59052c) b).mo56372aa(16666)).mo56389s("Uploading OTA for %s", this.f270138p.mo89270k());
        mo90242q(this.f270140r.mo90209e(this.f270169b, this.f270138p, dVar.mo106514l(), this.f270133k, dVar.mo106470K().intValue()), "Uploading OTA.", new C96566by(this), new C96567bz(this));
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateUploading";
    }
}
