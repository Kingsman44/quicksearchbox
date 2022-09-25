package com.google.android.libraries.assistant.auto.tng.p1101o.p1110c.p1111a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13044f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15496v;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.p1106b.C15475a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.p1106b.C15476b;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p5535j.p5536a.p5543b.C70936a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.c.a.f */
/* compiled from: PG */
public final class C15504f implements C15496v {
    /* renamed from: a */
    public final void mo22367a(C70936a aVar, C15474b bVar) {
    }

    /* renamed from: b */
    public final void mo22368b(C15471a aVar, C12991i iVar, Optional optional, Optional optional2) {
        Object obj;
        C62940bt btVar = C15476b.f46417g;
        C15475a aVar2 = (C15475a) C15476b.f46416f.createBuilder();
        if (optional.isPresent()) {
            aVar2.copyOnWrite();
            C15476b bVar = (C15476b) aVar2.instance;
            bVar.f46422d = ((C62722b) optional.get()).f169415s;
            bVar.f46419a |= 4;
        }
        if (optional2.isPresent()) {
            String str = (String) optional2.get();
            aVar2.copyOnWrite();
            C15476b bVar2 = (C15476b) aVar2.instance;
            str.getClass();
            bVar2.f46419a |= 8;
            bVar2.f46423e = str;
            aVar2.copyOnWrite();
            C15476b bVar3 = (C15476b) aVar2.instance;
            str.getClass();
            bVar3.f46419a |= 1;
            bVar3.f46420b = str;
        }
        C62940bt r6 = C62942bv.checkIsLite(C13042d.f40481n);
        iVar.mo58887l(r6);
        if (iVar.f169962ag.mo58857o(r6.f169971d)) {
            C62940bt r62 = C62942bv.checkIsLite(C13042d.f40481n);
            iVar.mo58887l(r62);
            Object l = iVar.f169962ag.mo58854l(r62.f169971d);
            if (l == null) {
                obj = r62.f169969b;
            } else {
                obj = r62.mo58889c(l);
            }
            C13044f fVar = ((C13042d) obj).f40486d;
            if (fVar == null) {
                fVar = C13044f.f40495e;
            }
            aVar2.copyOnWrite();
            C15476b bVar4 = (C15476b) aVar2.instance;
            fVar.getClass();
            bVar4.f46421c = fVar;
            bVar4.f46419a |= 2;
        }
        aVar.mo58885m(btVar, (C15476b) aVar2.build());
    }
}
