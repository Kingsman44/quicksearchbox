package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.v */
/* compiled from: PG */
public final /* synthetic */ class C14094v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ int f42761a;

    public /* synthetic */ C14094v(int i) {
        this.f42761a = i;
    }

    public final C60870cx apply(Object obj) {
        int i = this.f42761a;
        C14077e eVar = (C14077e) obj;
        C14075c cVar = (C14075c) eVar.toBuilder();
        C14074b bVar = eVar.f42741i;
        if (bVar == null) {
            bVar = C14074b.f42725e;
        }
        C14065a aVar = (C14065a) bVar.toBuilder();
        aVar.copyOnWrite();
        C14074b bVar2 = (C14074b) aVar.instance;
        bVar2.f42727a |= 1;
        bVar2.f42728b = i;
        C63042fg b = C62950b.m95471b(C60948g.f165068a);
        aVar.copyOnWrite();
        C14074b bVar3 = (C14074b) aVar.instance;
        b.getClass();
        bVar3.f42729c = b;
        bVar3.f42727a |= 2;
        cVar.copyOnWrite();
        C14077e eVar2 = (C14077e) cVar.instance;
        C14074b bVar4 = (C14074b) aVar.build();
        bVar4.getClass();
        eVar2.f42741i = bVar4;
        eVar2.f42733a |= 64;
        return C60856cj.m92900i((C14077e) cVar.build());
    }
}
