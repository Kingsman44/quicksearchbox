package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62319co;
import com.google.lens.p4701g.C62320cp;
import com.google.lens.p4701g.C62333db;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.gm */
/* compiled from: PG */
public final class C24710gm extends C68247h {

    /* renamed from: a */
    private final C68283d f67562a;

    public C24710gm(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C24710gm.class), aVar);
        this.f67562a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C62320cp cpVar;
        C62333db dbVar = (C62333db) obj;
        if (dbVar.f168279d.isEmpty()) {
            cpVar = C62320cp.f168233b;
        } else {
            C62319co coVar = (C62319co) C62320cp.f168233b.createBuilder();
            C62971cq cqVar = dbVar.f168279d;
            coVar.copyOnWrite();
            C62320cp cpVar2 = (C62320cp) coVar.instance;
            C62971cq cqVar2 = cpVar2.f168235a;
            if (!cqVar2.mo58948c()) {
                cpVar2.f168235a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) cpVar2.f168235a);
            cpVar = (C62320cp) coVar.build();
        }
        return C60856cj.m92900i(cpVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f67562a.mo60297gq();
    }
}
