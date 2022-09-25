package com.google.android.libraries.assistant.hotword;

import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.shared.p6339f.C81066e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.hotword.ak */
/* compiled from: PG */
final class C18338ak implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C81066e f51995a;

    public C18338ak(C81066e eVar) {
        this.f51995a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C18339al.f51996a.mo56226d()).mo56382g(th)).mo56372aa(47242)).mo56386p("Failed to open Bisto mic");
        C81060a.m129009b(this.f51995a.mo74805a(), h.m);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37561eb ebVar = ((C37656hc) obj).mo41049a().f100041b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a != 1) {
            C81060a.m129009b(this.f51995a.mo74805a(), h.l);
        }
    }
}
