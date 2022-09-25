package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.gms.car.C143111aw;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4543n.p4546c.C59400h;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.m */
/* compiled from: PG */
public final /* synthetic */ class C101384m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C101351ad f282912a;

    /* renamed from: b */
    public final /* synthetic */ C12986d f282913b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f282914c;

    /* renamed from: d */
    public final /* synthetic */ int f282915d;

    public /* synthetic */ C101384m(C101351ad adVar, C12986d dVar, int i, C58833ax axVar) {
        this.f282912a = adVar;
        this.f282913b = dVar;
        this.f282915d = i;
        this.f282914c = axVar;
    }

    public final void run() {
        C101351ad adVar = this.f282912a;
        C12986d dVar = this.f282913b;
        int i = this.f282915d;
        C58833ax axVar = this.f282914c;
        try {
            adVar.mo92262j(dVar, i, axVar);
        } catch (C143111aw e) {
            ((C59052c) ((C59052c) ((C59052c) C101351ad.f282845a.mo56225c()).mo56382g(e)).mo56372aa(20105)).mo56386p("Did not connect to car");
            C90875ai.m148465b(C101349ab.f282843a, C90877ak.m148469c(adVar.f282848d, "Retry car token connection", new C101348aa(adVar, dVar, i, axVar), new C59400h(5)), adVar.f282847c, "Retry car token connection callback").mo85223a(C101350ac.f282844a);
        }
    }
}
