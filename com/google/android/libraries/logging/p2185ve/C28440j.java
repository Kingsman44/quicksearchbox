package com.google.android.libraries.logging.p2185ve;

import com.google.common.base.C58838bb;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.android.libraries.logging.ve.j */
/* compiled from: PG */
public final class C28440j {

    /* renamed from: a */
    final C28444n f77222a;

    public C28440j(int i) {
        C28444n nVar = (C28444n) C28445o.f77226d.createBuilder();
        this.f77222a = nVar;
        nVar.copyOnWrite();
        C28445o oVar = (C28445o) nVar.instance;
        oVar.f77229b = i - 1;
        oVar.f77228a |= 1;
    }

    /* renamed from: a */
    public final C28442l mo33894a() {
        return new C28442l((C28445o) this.f77222a.build());
    }

    /* renamed from: b */
    public final void mo33895b(C28441k kVar) {
        kVar.getClass();
        C58838bb.m90883r(!this.f77222a.mo58882j(kVar.f77223a));
        C28444n nVar = this.f77222a;
        int i = ((C62940bt) kVar.f77223a).f169971d.f169964b;
        nVar.copyOnWrite();
        C28445o oVar = (C28445o) nVar.instance;
        C28445o oVar2 = C28445o.f77226d;
        C62961ch chVar = oVar.f77230c;
        if (!chVar.mo58948c()) {
            oVar.f77230c = C62942bv.mutableCopy(chVar);
        }
        oVar.f77230c.mo58916g(i);
        this.f77222a.mo58885m(kVar.f77223a, kVar.f77224b);
    }
}
