package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22098a;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22099b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.l */
/* compiled from: PG */
public final /* synthetic */ class C22140l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61055a;

    /* renamed from: b */
    public final /* synthetic */ C55421x f61056b;

    /* renamed from: c */
    public final /* synthetic */ C55998f f61057c;

    /* renamed from: d */
    public final /* synthetic */ Optional f61058d;

    /* renamed from: e */
    public final /* synthetic */ boolean f61059e;

    public /* synthetic */ C22140l(C22153y yVar, C55421x xVar, C55998f fVar, Optional optional, boolean z) {
        this.f61055a = yVar;
        this.f61056b = xVar;
        this.f61057c = fVar;
        this.f61058d = optional;
        this.f61059e = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C22153y yVar = this.f61055a;
        C55421x xVar = this.f61056b;
        C55998f fVar = this.f61057c;
        Optional optional = this.f61058d;
        boolean z = this.f61059e;
        C58485gu guVar = (C58485gu) obj;
        C22098a aVar = (C22098a) C22099b.f60908d.createBuilder();
        Optional g = yVar.mo27365g(xVar, fVar, guVar, optional, z);
        if (g.isPresent()) {
            C65768az azVar = (C65768az) g.get();
            aVar.copyOnWrite();
            C22099b bVar = (C22099b) aVar.instance;
            azVar.getClass();
            bVar.f60911b = azVar;
            bVar.f60910a |= 1;
        }
        aVar.mo27353a(guVar);
        return (C22099b) aVar.build();
    }
}
