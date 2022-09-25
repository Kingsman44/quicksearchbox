package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6108e;

import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82379d;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82406e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82514i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.e.a */
/* compiled from: PG */
public final /* synthetic */ class C77544a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C77546c f213660a;

    /* renamed from: b */
    public final /* synthetic */ C37462ck f213661b;

    public /* synthetic */ C77544a(C77546c cVar, C37462ck ckVar) {
        this.f213660a = cVar;
        this.f213661b = ckVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C77546c cVar = this.f213660a;
        C37462ck ckVar = this.f213661b;
        C37460ci ciVar = (C37460ci) obj;
        C58970a aVar = (C58970a) ((C58970a) C77546c.f213663a.mo56224b()).mo56372aa(4299);
        C37476cy a = C37476cy.m66492a(ciVar.f99441b);
        if (a == null) {
            a = C37476cy.UNKNOWN_DISCONNECT_REASON;
        }
        aVar.mo56389s("Audio route lost with reason: %s", a.name());
        C77732a aVar2 = cVar.f213664b;
        C37476cy a2 = C37476cy.m66492a(ciVar.f99441b);
        if (a2 == null) {
            a2 = C37476cy.UNKNOWN_DISCONNECT_REASON;
        }
        C37467cp cpVar = ckVar.f99445b;
        if (cpVar == null) {
            cpVar = C37467cp.f99458c;
        }
        int i = cpVar.f99460a;
        String str = i == 4 ? "Bisto" : i == 1 ? "Bluetooth" : i == 2 ? "BuiltIn" : i == 3 ? "Dsp" : "Unknown";
        C83305i iVar = aVar2.f214135e;
        C82379d b = C82406e.m130964b();
        b.mo75948b(a2.name());
        ((C82514i) b).f225465b = str;
        iVar.mo75579d(b.mo75947a());
    }
}
