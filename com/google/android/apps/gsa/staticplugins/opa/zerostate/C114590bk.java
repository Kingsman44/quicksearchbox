package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.p7041h.C89783o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114548g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114549h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114550i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.bk */
/* compiled from: PG */
public final /* synthetic */ class C114590bk implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114602bw f317819a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f317820b;

    public /* synthetic */ C114590bk(C114602bw bwVar, C68214a aVar) {
        this.f317819a = bwVar;
        this.f317820b = aVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C114602bw bwVar = this.f317819a;
        C68214a aVar = this.f317820b;
        if ((bwVar.f317844e.mo79746e(C90014bt.f247647lB) && bwVar.f317850k != C53306j.AMBIENT && bwVar.f317850k != C53306j.DOCK) || !bwVar.f317844e.mo79746e(C90014bt.f247672la)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C22871g gVar = bwVar.f317845f;
        C114550i iVar = (C114550i) aVar.mo27525b();
        C22871g gVar2 = (C22871g) iVar.f317652a.mo17428b();
        gVar2.getClass();
        C89783o oVar = (C89783o) iVar.f317653b.mo17428b();
        oVar.getClass();
        C21370a aVar2 = (C21370a) iVar.f317654c.mo17428b();
        aVar2.getClass();
        C114549h hVar = new C114549h(gVar2, oVar, aVar2);
        return gVar.mo28209i(hVar.f317649b.mo28201a("loadActiveCalendarData", new C114548g(hVar)), "updateLocalAgendaContentInOpaStore", new C114583bd(bwVar));
    }
}
