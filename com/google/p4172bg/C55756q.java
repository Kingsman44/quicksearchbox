package com.google.p4172bg;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bg.q */
/* compiled from: PG */
public final class C55756q extends C62934bn implements C63001dt {
    public C55756q() {
        super(C55760u.f147139f);
    }

    /* renamed from: a */
    public final void mo54276a(String str, C55758s sVar) {
        sVar.getClass();
        copyOnWrite();
        C55760u uVar = (C55760u) this.instance;
        C55760u uVar2 = C55760u.f147139f;
        C62995dn dnVar = uVar.f147141a;
        if (!dnVar.f170058b) {
            uVar.f147141a = dnVar.mo58980a();
        }
        uVar.f147141a.put(str, sVar);
    }
}
