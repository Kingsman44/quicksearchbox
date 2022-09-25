package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62311cg;
import com.google.lens.p4701g.C62312ch;
import com.google.lens.p4701g.C62324ct;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.gl */
/* compiled from: PG */
public final class C24709gl extends C68247h {

    /* renamed from: a */
    private final C68283d f67561a;

    public C24709gl(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C24709gl.class), aVar);
        this.f67561a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C62312ch chVar;
        C62324ct ctVar = (C62324ct) obj;
        if (ctVar.f168242d.isEmpty()) {
            chVar = C62312ch.f168214b;
        } else {
            C62311cg cgVar = (C62311cg) C62312ch.f168214b.createBuilder();
            C62971cq cqVar = ctVar.f168242d;
            cgVar.copyOnWrite();
            C62312ch chVar2 = (C62312ch) cgVar.instance;
            C62971cq cqVar2 = chVar2.f168216a;
            if (!cqVar2.mo58948c()) {
                chVar2.f168216a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) chVar2.f168216a);
            chVar = (C62312ch) cgVar.build();
        }
        return C60856cj.m92900i(chVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f67561a.mo60297gq();
    }
}
