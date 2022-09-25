package com.google.android.libraries.lens.view.filters.p2100d;

import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.p2070an.C25369ag;
import com.google.android.libraries.lens.view.p2070an.C25453y;
import com.google.android.libraries.lens.view.p2070an.C25454z;
import com.google.android.libraries.lens.view.p2081au.C25564n;
import com.google.common.p4552o.p4563i.C59918c;
import com.google.common.p4552o.p4563i.C59959i;
import com.google.common.p4552o.p4563i.C59960j;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

@Deprecated
/* renamed from: com.google.android.libraries.lens.view.filters.d.a */
/* compiled from: PG */
public final class C25972a {

    /* renamed from: a */
    private final C25974c f70589a;

    public C25972a(C25974c cVar) {
        this.f70589a = cVar;
    }

    /* renamed from: a */
    public final C59961k mo31166a() {
        C25564n nVar;
        C56280cg cgVar = ((C25989d) this.f70589a.f70590a.mo17428b()).f70643b;
        C25453y yVar = ((C25454z) this.f70589a.f70591b.mo17428b()).f69369e;
        if (yVar == null) {
            nVar = C25564n.ON_DEVICE;
        } else {
            C25369ag agVar = yVar.f69347i;
            if (agVar == null) {
                nVar = C25564n.ON_DEVICE;
            } else {
                nVar = agVar.mo30417a();
            }
        }
        C56278ce ceVar = (C56278ce) cgVar.f149994a.get(0);
        C25564n nVar2 = C25564n.ONLINE;
        int ordinal = nVar.ordinal();
        int i = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? 1 : 4 : 3 : 2;
        C59918c cVar = (C59918c) C59961k.f162053f.createBuilder();
        C56306df a = C56306df.m87964a(ceVar.f149991d);
        if (a == null) {
            a = C56306df.UNKNOWN_FILTER_TYPE;
        }
        cVar.copyOnWrite();
        C59961k kVar = (C59961k) cVar.instance;
        kVar.f162058d = a.f150068m;
        kVar.f162055a |= 1;
        cVar.copyOnWrite();
        C59961k kVar2 = (C59961k) cVar.instance;
        kVar2.f162059e = i - 1;
        kVar2.f162055a |= 16;
        if (ceVar.f149989b == 3) {
            C56277cd cdVar = (C56277cd) ceVar.f149990c;
            C59959i iVar = (C59959i) C59960j.f162046f.createBuilder();
            String str = cdVar.f149985c;
            iVar.copyOnWrite();
            C59960j jVar = (C59960j) iVar.instance;
            str.getClass();
            jVar.f162048a = 1 | jVar.f162048a;
            jVar.f162049b = str;
            String str2 = cdVar.f149984b;
            iVar.copyOnWrite();
            C59960j jVar2 = (C59960j) iVar.instance;
            str2.getClass();
            jVar2.f162048a = 4 | jVar2.f162048a;
            jVar2.f162050c = str2;
            C59960j jVar3 = (C59960j) iVar.build();
            cVar.copyOnWrite();
            C59961k kVar3 = (C59961k) cVar.instance;
            jVar3.getClass();
            kVar3.f162057c = jVar3;
            kVar3.f162056b = 2;
        }
        return (C59961k) cVar.build();
    }
}
