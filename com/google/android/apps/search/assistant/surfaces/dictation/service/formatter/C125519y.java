package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.nga.engine.dictation.ag;
import com.google.android.apps.gsa.nga.engine.dictation.r;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4946az.C64354b;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70999az;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71003bc;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.y */
/* compiled from: PG */
public final /* synthetic */ class C125519y implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C125470af f346112a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f346113b;

    /* renamed from: c */
    public final /* synthetic */ C125513s f346114c;

    /* renamed from: d */
    public final /* synthetic */ C125503i f346115d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f346116e;

    public /* synthetic */ C125519y(C125470af afVar, C60870cx cxVar, C125513s sVar, C125503i iVar, C60870cx cxVar2) {
        this.f346112a = afVar;
        this.f346113b = cxVar;
        this.f346114c = sVar;
        this.f346115d = iVar;
        this.f346116e = cxVar2;
    }

    public final Object call() {
        C125065at atVar;
        C125470af afVar = this.f346112a;
        C60870cx cxVar = this.f346113b;
        C125513s sVar = this.f346114c;
        C125503i iVar = this.f346115d;
        C60870cx cxVar2 = this.f346116e;
        ag agVar = (ag) C60856cj.m92909r(cxVar);
        Optional optional = (Optional) C60856cj.m92909r(cxVar2);
        C62971cq cqVar = agVar.e;
        C70999az azVar = (C70999az) C71003bc.f189358g.createBuilder();
        r rVar = agVar.f;
        if (rVar != null) {
            C62971cq cqVar2 = rVar.d;
            Iterable iterable = (Iterable) Collection.EL.stream(cqVar2).filter(C125465aa.f345998a).map(C125466ab.f345999a).collect(C58370cn.f155946a);
            azVar.copyOnWrite();
            C71003bc bcVar = (C71003bc) azVar.instance;
            C62971cq cqVar3 = bcVar.f189361b;
            if (!cqVar3.mo58948c()) {
                bcVar.f189361b = C62942bv.mutableCopy(cqVar3);
            }
            C62947c.addAll(iterable, (List) bcVar.f189361b);
            if (sVar.mo107019c().isPresent()) {
                int i = rVar.e;
                azVar.copyOnWrite();
                C71003bc bcVar2 = (C71003bc) azVar.instance;
                bcVar2.f189360a |= 4;
                bcVar2.f189362c = i;
                int c = ((C125512r) sVar.mo107019c().get()).mo107010c();
                azVar.copyOnWrite();
                C71003bc bcVar3 = (C71003bc) azVar.instance;
                bcVar3.f189360a |= 8;
                bcVar3.f189363d = c;
                int b = ((C125512r) sVar.mo107019c().get()).mo107009b();
                azVar.copyOnWrite();
                C71003bc bcVar4 = (C71003bc) azVar.instance;
                bcVar4.f189360a |= 16;
                bcVar4.f189364e = b;
                int a = ((C125512r) sVar.mo107019c().get()).mo107008a();
                azVar.copyOnWrite();
                C71003bc bcVar5 = (C71003bc) azVar.instance;
                bcVar5.f189360a |= 32;
                bcVar5.f189365f = a + 1;
            }
            Collection.EL.stream(cqVar2).filter(C125467ac.f346000a).forEach(new C125468ad(afVar));
            if (Collection.EL.stream(cqVar2).anyMatch(C125469ae.f346002a)) {
                afVar.f346008f.mo107438i(Collection.EL.stream(cqVar2).anyMatch(C125515u.f346104a));
            }
        }
        if (agVar.a.isEmpty()) {
            atVar = C125065at.f345040b;
        } else {
            C64354b bVar = agVar.b;
            if (bVar == null) {
                bVar = C64354b.f173954b;
            }
            atVar = afVar.mo106979b(bVar, true, iVar.mo106993d(bVar), optional);
        }
        return C125510p.m205497e(atVar, afVar.mo106980c(agVar, iVar, optional), sVar.mo107029d(agVar.a, agVar.c, C125471ag.m205451c(cqVar, iVar.mo106994e(new C58827ar(" ").mo56097d(cqVar)))), (C71003bc) azVar.build());
    }
}
