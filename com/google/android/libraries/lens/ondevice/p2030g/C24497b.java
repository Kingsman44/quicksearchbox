package com.google.android.libraries.lens.ondevice.p2030g;

import com.google.android.libraries.lens.ondevice.p2025e.C24434a;
import com.google.android.libraries.lens.ondevice.p2037n.C24771ad;
import com.google.android.libraries.lens.ondevice.p2037n.C24772ae;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64598c;
import com.google.protos.p4963bf.p4964a.p4965a.C64602g;

/* renamed from: com.google.android.libraries.lens.ondevice.g.b */
/* compiled from: PG */
public final class C24497b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24771ad f67028a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f67029b;

    public C24497b(C24771ad adVar, C58833ax axVar) {
        this.f67028a = adVar;
        this.f67029b = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24771ad adVar = this.f67028a;
        C64598c cVar = (C64598c) C64602g.f175147c.createBuilder();
        C63088z byteString = ((C55731t) obj).toByteString();
        cVar.copyOnWrite();
        C64602g gVar = (C64602g) cVar.instance;
        byteString.getClass();
        gVar.f175150a = 10;
        gVar.f175151b = byteString;
        adVar.copyOnWrite();
        C24772ae aeVar = (C24772ae) adVar.instance;
        C64602g gVar2 = (C64602g) cVar.build();
        C24772ae aeVar2 = C24772ae.f67686d;
        gVar2.getClass();
        aeVar.f67690c = gVar2;
        aeVar.f67688a |= 8;
        ((C58970a) ((C58970a) C24500e.f67033a.mo56224b()).mo56372aa(48804)).mo56386p("Adding the final result in the debug sink.");
        C24772ae aeVar3 = (C24772ae) this.f67028a.build();
        ((C24434a) this.f67029b.mo56107c()).mo29881h();
    }
}
