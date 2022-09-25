package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.geller.portable.C21947am;
import com.google.android.libraries.geller.portable.C21952d;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5030q.p5032b.C65022ag;
import com.google.protos.p4985f.p5030q.p5032b.C65025aj;
import com.google.protos.p4985f.p5030q.p5032b.C65058e;
import com.google.protos.p4985f.p5030q.p5032b.C65059f;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.geller.f.y */
/* compiled from: PG */
final class C21875y {

    /* renamed from: a */
    public static final C59071e f60357a = C59071e.m91332i("com.google.android.libraries.geller.f.y");

    /* renamed from: b */
    public static final C58528ij f60358b = new C58759qy(C65753ak.HOME_AUTOMATION_DISCOVERY);

    /* renamed from: c */
    public final C21857g f60359c;

    /* renamed from: d */
    public final Map f60360d = new HashMap();

    /* renamed from: e */
    public final Geller f60361e;

    /* renamed from: f */
    public final C21942ah f60362f;

    /* renamed from: g */
    public final String f60363g;

    /* renamed from: h */
    public final ExecutorService f60364h;

    /* renamed from: i */
    public final ExecutorService f60365i;

    public C21875y(String str, Geller geller, C21942ah ahVar, C21857g gVar, ExecutorService executorService, ExecutorService executorService2) {
        this.f60359c = gVar;
        this.f60361e = geller;
        this.f60362f = ahVar;
        this.f60363g = str;
        this.f60364h = executorService;
        this.f60365i = executorService2;
    }

    /* renamed from: b */
    public static C65025aj m40977b(C21947am amVar, List list) {
        C65059f fVar;
        C65022ag agVar = (C65022ag) C65025aj.f176085d.createBuilder();
        if (amVar.equals(C21947am.SYNCED)) {
            agVar.copyOnWrite();
            C65025aj ajVar = (C65025aj) agVar.instance;
            ajVar.f176088b = 1;
            ajVar.f176087a |= 1;
        } else if (amVar.equals(C21947am.DELETION_SYNCED)) {
            agVar.copyOnWrite();
            C65025aj ajVar2 = (C65025aj) agVar.instance;
            ajVar2.f176088b = 2;
            ajVar2.f176087a |= 1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21952d dVar = (C21952d) it.next();
            C65058e eVar = (C65058e) C65059f.f176180d.createBuilder();
            String b = dVar.mo27229b();
            eVar.copyOnWrite();
            C65059f fVar2 = (C65059f) eVar.instance;
            b.getClass();
            fVar2.f176182a |= 2;
            fVar2.f176184c = b;
            if (dVar.mo27228a().mo56113h()) {
                long longValue = ((Long) dVar.mo27228a().mo56107c()).longValue();
                eVar.copyOnWrite();
                C65059f fVar3 = (C65059f) eVar.instance;
                fVar3.f176182a |= 1;
                fVar3.f176183b = longValue;
                fVar = (C65059f) eVar.build();
            } else {
                fVar = (C65059f) eVar.build();
            }
            agVar.copyOnWrite();
            C65025aj ajVar3 = (C65025aj) agVar.instance;
            fVar.getClass();
            C62971cq cqVar = ajVar3.f176089c;
            if (!cqVar.mo58948c()) {
                ajVar3.f176089c = C62942bv.mutableCopy(cqVar);
            }
            ajVar3.f176089c.add(fVar);
        }
        return (C65025aj) agVar.build();
    }

    /* renamed from: a */
    public final C21849ce mo27167a(C65753ak akVar) {
        if (!this.f60360d.containsKey(akVar)) {
            this.f60360d.put(akVar, new C21855e());
        }
        return (C21849ce) this.f60360d.get(akVar);
    }
}
