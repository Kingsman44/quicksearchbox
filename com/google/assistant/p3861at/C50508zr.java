package com.google.assistant.p3861at;

import com.google.assistant.p3825an.p3832d.p3833a.C49351b;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.zr */
/* compiled from: PG */
public final class C50508zr extends C62934bn implements C63001dt {
    public C50508zr() {
        super(C50509zs.f131479j);
    }

    /* renamed from: a */
    public final void mo53401a(C49351b bVar) {
        copyOnWrite();
        C50509zs zsVar = (C50509zs) this.instance;
        C62962ci ciVar = C50509zs.f131478e;
        bVar.getClass();
        C62961ch chVar = zsVar.f131484d;
        if (!chVar.mo58948c()) {
            zsVar.f131484d = C62942bv.mutableCopy(chVar);
        }
        zsVar.f131484d.mo58916g(bVar.getNumber());
    }

    /* renamed from: b */
    public final void mo53402b(String str) {
        copyOnWrite();
        C50509zs zsVar = (C50509zs) this.instance;
        C62962ci ciVar = C50509zs.f131478e;
        str.getClass();
        C62971cq cqVar = zsVar.f131486g;
        if (!cqVar.mo58948c()) {
            zsVar.f131486g = C62942bv.mutableCopy(cqVar);
        }
        zsVar.f131486g.add(str);
    }
}
