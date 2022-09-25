package com.google.p4172bg.p4174b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bg.b.q */
/* compiled from: PG */
public final class C55728q extends C62934bn implements C63001dt {
    public C55728q() {
        super(C55729r.f147055d);
    }

    /* renamed from: a */
    public final void mo54271a(int i) {
        copyOnWrite();
        C55729r rVar = (C55729r) this.instance;
        C55729r rVar2 = C55729r.f147055d;
        C62961ch chVar = rVar.f147059c;
        if (!chVar.mo58948c()) {
            rVar.f147059c = C62942bv.mutableCopy(chVar);
        }
        rVar.f147059c.mo58916g(i);
    }
}
