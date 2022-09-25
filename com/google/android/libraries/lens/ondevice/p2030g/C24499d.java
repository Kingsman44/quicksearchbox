package com.google.android.libraries.lens.ondevice.p2030g;

import com.google.android.libraries.lens.ondevice.p2025e.C24434a;
import com.google.android.libraries.lens.ondevice.p2037n.C24771ad;
import com.google.android.libraries.lens.ondevice.p2037n.C24772ae;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4701g.C62281bd;
import com.google.p4172bg.p4174b.C55730s;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64598c;
import com.google.protos.p4963bf.p4964a.p4965a.C64602g;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.ondevice.g.d */
/* compiled from: PG */
public final class C24499d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24771ad f67031a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f67032b;

    public C24499d(C24771ad adVar, C58833ax axVar) {
        this.f67031a = adVar;
        this.f67032b = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24771ad adVar = this.f67031a;
        C64598c cVar = (C64598c) C64602g.f175147c.createBuilder();
        C55730s sVar = (C55730s) C55731t.f147061g.createBuilder();
        C63088z zVar = C63088z.f170246b;
        sVar.copyOnWrite();
        C55731t tVar = (C55731t) sVar.instance;
        zVar.getClass();
        tVar.f147063a |= 1;
        tVar.f147064b = zVar;
        sVar.mo54272a((Iterable) Collection.EL.stream(((C62281bd) obj).f168143a).flatMap(C24498c.f67030a).collect(C58370cn.f155946a));
        C63088z byteString = ((C55731t) sVar.build()).toByteString();
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
        ((C58970a) ((C58970a) C24500e.f67033a.mo56224b()).mo56372aa(48805)).mo56386p("Adding the final result in the debug sink.");
        C24772ae aeVar3 = (C24772ae) this.f67031a.build();
        ((C24434a) this.f67032b.mo56107c()).mo29881h();
    }
}
