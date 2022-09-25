package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a.C97069d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a.C97071f;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a.C97072g;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97029d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.i */
/* compiled from: PG */
public final /* synthetic */ class C97058i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97029d f271197a;

    public /* synthetic */ C97058i(C97029d dVar) {
        this.f271197a = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C97029d dVar = this.f271197a;
        ((C59052c) ((C59052c) ((C59052c) C97072g.f271242a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(18363)).mo56386p("Error while fetching live update");
        C97071f fVar = (C97071f) dVar;
        C97072g gVar = fVar.f271241a;
        if (gVar.f271246e > 0 && gVar.f271243b.mo26870b() - gVar.f271245d > gVar.f271246e) {
            C97072g gVar2 = fVar.f271241a;
            C97053d dVar2 = gVar2.f271244c;
            C97054e eVar = dVar2.f271191a;
            if (eVar.f271152a) {
                eVar.f271152a = false;
                dVar2.mo90423d();
                return;
            }
            C97069d dVar3 = gVar2.f271247f;
            if (dVar3 != null) {
                dVar3.f271231a.f271232a.f271248a.mo90458a(3);
            }
        }
    }
}
