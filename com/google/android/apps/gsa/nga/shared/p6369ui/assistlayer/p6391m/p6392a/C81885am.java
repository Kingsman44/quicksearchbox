package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80708cj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80710cl;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.am */
/* compiled from: PG */
public final /* synthetic */ class C81885am implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81886an f223909a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f223910b;

    public /* synthetic */ C81885am(C81886an anVar, C22871g gVar) {
        this.f223909a = anVar;
        this.f223910b = gVar;
    }

    public final void run() {
        C81886an anVar = this.f223909a;
        C22871g gVar = this.f223910b;
        if (!((C80710cl) ((C83352b) anVar.f223913c.f223924i).mo76654b()).mo74471b().equals(C80708cj.GONE)) {
            ((C59052c) ((C59052c) C81889aq.f223915a.mo56224b()).mo56372aa(6310)).mo56386p("Edge lights are visible. Not animating the mic in.");
            return;
        }
        C81889aq aqVar = anVar.f223913c;
        if (!aqVar.mo75390i(((C80710cl) ((C83352b) aqVar.f223924i).mo76654b()).mo74470a())) {
            C83349aj.m132647b(gVar, anVar.f223913c.f223928m, false, "isVisible");
        }
    }
}
