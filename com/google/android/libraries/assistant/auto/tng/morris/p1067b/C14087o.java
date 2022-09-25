package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.o */
/* compiled from: PG */
public final /* synthetic */ class C14087o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ int f42754a;

    public /* synthetic */ C14087o(int i) {
        this.f42754a = i;
    }

    public final C60870cx apply(Object obj) {
        int i = this.f42754a;
        C14077e eVar = (C14077e) obj;
        C14068ac acVar = eVar.f42740h;
        if (acVar == null) {
            acVar = C14068ac.f42705h;
        }
        C14066aa aaVar = (C14066aa) acVar.toBuilder();
        if (i == 3) {
            C63042fg b = C62950b.m95471b(C60948g.f165068a);
            aaVar.copyOnWrite();
            C14068ac acVar2 = (C14068ac) aaVar.instance;
            b.getClass();
            acVar2.f42710d = b;
            acVar2.f42707a |= 4;
            C14068ac acVar3 = eVar.f42740h;
            if (acVar3 == null) {
                acVar3 = C14068ac.f42705h;
            }
            int i2 = acVar3.f42712f;
            aaVar.copyOnWrite();
            C14068ac acVar4 = (C14068ac) aaVar.instance;
            acVar4.f42707a |= 16;
            acVar4.f42712f = i2 + 1;
        } else {
            C63042fg b2 = C62950b.m95471b(C60948g.f165068a);
            aaVar.copyOnWrite();
            C14068ac acVar5 = (C14068ac) aaVar.instance;
            b2.getClass();
            acVar5.f42711e = b2;
            acVar5.f42707a |= 8;
            C14068ac acVar6 = eVar.f42740h;
            if (acVar6 == null) {
                acVar6 = C14068ac.f42705h;
            }
            int i3 = acVar6.f42713g;
            aaVar.copyOnWrite();
            C14068ac acVar7 = (C14068ac) aaVar.instance;
            acVar7.f42707a |= 32;
            acVar7.f42713g = i3 + 1;
            i = 4;
        }
        C14075c cVar = (C14075c) eVar.toBuilder();
        aaVar.copyOnWrite();
        C14068ac acVar8 = (C14068ac) aaVar.instance;
        acVar8.f42709c = C14067ab.m30356a(i);
        acVar8.f42707a |= 2;
        cVar.copyOnWrite();
        C14077e eVar2 = (C14077e) cVar.instance;
        C14068ac acVar9 = (C14068ac) aaVar.build();
        acVar9.getClass();
        eVar2.f42740h = acVar9;
        eVar2.f42733a |= 32;
        return C60856cj.m92900i((C14077e) cVar.build());
    }
}
