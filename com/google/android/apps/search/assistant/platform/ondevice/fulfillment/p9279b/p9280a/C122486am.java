package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122428bt;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122457l;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122458m;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.am */
/* compiled from: PG */
public final /* synthetic */ class C122486am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122504bd f339568a;

    /* renamed from: b */
    public final /* synthetic */ Iterable f339569b;

    public /* synthetic */ C122486am(C122504bd bdVar, Iterable iterable) {
        this.f339568a = bdVar;
        this.f339569b = iterable;
    }

    public final void run() {
        C122504bd bdVar = this.f339568a;
        Iterable h = C58557jl.m90127h(this.f339569b, C122493at.f339576a);
        C58976aa aaVar = C58975e.f156826a;
        C17597g gVar = bdVar.f339602b;
        C122428bt btVar = (C122428bt) C122430bv.f339419c.createBuilder();
        C122457l lVar = (C122457l) C122458m.f339484b.createBuilder();
        lVar.copyOnWrite();
        C122458m mVar = (C122458m) lVar.instance;
        C62961ch chVar = mVar.f339486a;
        if (!chVar.mo58948c()) {
            mVar.f339486a = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(h, (List) mVar.f339486a);
        btVar.copyOnWrite();
        C122430bv bvVar = (C122430bv) btVar.instance;
        C122458m mVar2 = (C122458m) lVar.build();
        mVar2.getClass();
        bvVar.f339422b = mVar2;
        bvVar.f339421a = 4;
        gVar.mo20123c((C122430bv) btVar.build());
    }
}
