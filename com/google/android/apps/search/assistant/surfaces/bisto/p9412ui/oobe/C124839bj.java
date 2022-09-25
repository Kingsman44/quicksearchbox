package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bj */
/* compiled from: PG */
final class C124839bj implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C124838bi f344415a;

    public C124839bj(C124838bi biVar) {
        this.f344415a = biVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C124804ag agVar = (C124804ag) bVar;
        C124838bi biVar = this.f344415a;
        C59104x b = C124838bi.f344408a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OobeActivity");
        ((C59052c) ((C59052c) b).mo56372aa(36337)).mo56386p("End Setup Event");
        if (agVar.mo106649a() != null) {
            C124825a a = ((OobeActivityViewModel) new C2368bp(biVar.f344409b).mo5770a(OobeActivityViewModel.class)).mo106637a();
            String a2 = agVar.mo106649a();
            a2.getClass();
            a.mo106662b(a2);
        }
        biVar.f344409b.finishAndRemoveTask();
        biVar.f344409b.overridePendingTransition(0, 0);
        return C47392e.f123115a;
    }
}
