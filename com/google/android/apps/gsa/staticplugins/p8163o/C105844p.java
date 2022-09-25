package com.google.android.apps.gsa.staticplugins.p8163o;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88398a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.p */
/* compiled from: PG */
final class C105844p implements C22869e {

    /* renamed from: a */
    public int f295271a;

    /* renamed from: b */
    public long f295272b;

    /* renamed from: c */
    final /* synthetic */ C105846r f295273c;

    /* renamed from: d */
    private int f295274d;

    public C105844p(C105846r rVar) {
        this.f295273c = rVar;
    }

    public final void run() {
        int i = this.f295274d + 1;
        this.f295274d = i;
        if (i >= this.f295271a) {
            if (i == 1) {
                C105846r rVar = this.f295273c;
                if (rVar.f295320p) {
                    if (rVar.f295326v) {
                        C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
                        aVar.copyOnWrite();
                        C88458h hVar = (C88458h) aVar.instance;
                        hVar.f239138a = 1 | hVar.f239138a;
                        hVar.f239139b = 4;
                        rVar.mo95095o((C88458h) aVar.build());
                    } else {
                        rVar.f295320p = false;
                        rVar.mo95097p(rVar.mo95102u());
                    }
                } else if (rVar.f295326v) {
                    C88398a aVar2 = (C88398a) C88458h.f239136h.createBuilder();
                    aVar2.copyOnWrite();
                    C88458h hVar2 = (C88458h) aVar2.instance;
                    hVar2.f239138a = 1 | hVar2.f239138a;
                    hVar2.f239139b = 2;
                    rVar.mo95095o((C88458h) aVar2.build());
                } else {
                    rVar.mo95087f();
                }
            } else if (i == 2) {
                C105846r rVar2 = this.f295273c;
                if (!rVar2.f295319o) {
                    C88398a aVar3 = (C88398a) C88458h.f239136h.createBuilder();
                    aVar3.copyOnWrite();
                    C88458h hVar3 = (C88458h) aVar3.instance;
                    hVar3.f239138a = 1 | hVar3.f239138a;
                    hVar3.f239139b = 32;
                    rVar2.mo95095o((C88458h) aVar3.build());
                } else if (rVar2.f295326v) {
                    C88398a aVar4 = (C88398a) C88458h.f239136h.createBuilder();
                    aVar4.copyOnWrite();
                    C88458h hVar4 = (C88458h) aVar4.instance;
                    hVar4.f239138a = 1 | hVar4.f239138a;
                    hVar4.f239139b = 64;
                    rVar2.mo95095o((C88458h) aVar4.build());
                } else {
                    rVar2.mo95093l();
                }
            } else if (i != 3) {
                C59071e eVar = C105846r.f295277a;
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C105846r rVar3 = this.f295273c;
                if (!rVar3.f295319o) {
                    C88398a aVar5 = (C88398a) C88458h.f239136h.createBuilder();
                    aVar5.copyOnWrite();
                    C88458h hVar5 = (C88458h) aVar5.instance;
                    hVar5.f239138a = 1 | hVar5.f239138a;
                    hVar5.f239139b = 16;
                    rVar3.mo95095o((C88458h) aVar5.build());
                } else if (rVar3.f295326v) {
                    C88398a aVar6 = (C88398a) C88458h.f239136h.createBuilder();
                    aVar6.copyOnWrite();
                    C88458h hVar6 = (C88458h) aVar6.instance;
                    hVar6.f239138a = 1 | hVar6.f239138a;
                    hVar6.f239139b = 8;
                    rVar3.mo95095o((C88458h) aVar6.build());
                } else {
                    rVar3.mo95092k();
                }
            }
            this.f295274d = 0;
            this.f295271a = 0;
        }
    }
}
