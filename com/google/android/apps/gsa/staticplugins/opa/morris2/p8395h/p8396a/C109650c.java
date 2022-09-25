package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.p8396a;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.p9002a.C119578b;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.p9002a.C119579c;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17900bc;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17906h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C109650c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C17835u f305367a;

    public /* synthetic */ C109650c(C17835u uVar) {
        this.f305367a = uVar;
    }

    public final void accept(Object obj) {
        C17835u uVar = this.f305367a;
        C119579c cVar = ((C119578b) obj).f333274a;
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.VOICE_PLATE_STATE_CHANGED;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        hVar.mo58885m(C17900bc.f51289a, uVar);
        C58976aa aaVar = C58975e.f156826a;
        cVar.mo104447j((C17909k) hVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
