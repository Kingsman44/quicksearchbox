package com.google.android.apps.gsa.staticplugins.s3request.producers;

import com.google.android.apps.gsa.p6487s3.producers.C84311j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.speech.p5207g.C66503a;
import com.google.speech.p5207g.C66504b;
import com.google.speech.p5207g.C66505c;
import com.google.speech.p5207g.C66506d;
import com.google.speech.p5207g.C66507e;
import com.google.speech.p5207g.C66508f;
import com.google.speech.p5208h.C66575ba;
import com.google.speech.p5208h.C66576bb;
import com.google.speech.p5208h.C66577bc;
import com.google.speech.p5208h.C66580bf;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.d */
/* compiled from: PG */
public final class C116345d extends C84311j {

    /* renamed from: a */
    private final Collection f322568a;

    /* renamed from: b */
    private final boolean f322569b;

    public C116345d(Collection collection, int i, C86124t tVar) {
        this.f322568a = collection;
        boolean e = tVar.mo79746e(C90059dk.f249072ai);
        boolean z = false;
        if (e && i == 4) {
            z = true;
        }
        this.f322569b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C66606cd mo77837a() {
        if (this.f322569b) {
            C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
            C62940bt btVar = C66580bf.f181102g;
            C66577bc bcVar = (C66577bc) C66580bf.f181101f.createBuilder();
            C66503a aVar = (C66503a) C66504b.f180871b.createBuilder();
            C66505c cVar = (C66505c) C66506d.f180874b.createBuilder();
            C58801sm G = ((C58485gu) this.f322568a).listIterator(0);
            while (G.hasNext()) {
                String str = (String) G.next();
                C66507e eVar = (C66507e) C66508f.f180877d.createBuilder();
                eVar.copyOnWrite();
                C66508f fVar = (C66508f) eVar.instance;
                str.getClass();
                C62971cq cqVar = fVar.f180880b;
                if (!cqVar.mo58948c()) {
                    fVar.f180880b = C62942bv.mutableCopy(cqVar);
                }
                fVar.f180880b.add(str);
                eVar.copyOnWrite();
                C66508f fVar2 = (C66508f) eVar.instance;
                fVar2.f180879a |= 1;
                fVar2.f180881c = true;
                cVar.copyOnWrite();
                C66506d dVar = (C66506d) cVar.instance;
                C66508f fVar3 = (C66508f) eVar.build();
                fVar3.getClass();
                C62971cq cqVar2 = dVar.f180876a;
                if (!cqVar2.mo58948c()) {
                    dVar.f180876a = C62942bv.mutableCopy(cqVar2);
                }
                dVar.f180876a.add(fVar3);
            }
            C66506d dVar2 = (C66506d) cVar.build();
            aVar.copyOnWrite();
            C66504b bVar = (C66504b) aVar.instance;
            dVar2.getClass();
            C62971cq cqVar3 = bVar.f180873a;
            if (!cqVar3.mo58948c()) {
                bVar.f180873a = C62942bv.mutableCopy(cqVar3);
            }
            bVar.f180873a.add(dVar2);
            bcVar.copyOnWrite();
            C66580bf bfVar = (C66580bf) bcVar.instance;
            C66504b bVar2 = (C66504b) aVar.build();
            bVar2.getClass();
            bfVar.f181106c = bVar2;
            bfVar.f181104a |= 4;
            cdVar.mo58885m(btVar, (C66580bf) bcVar.build());
            return cdVar;
        }
        C66606cd cdVar2 = (C66606cd) C66607ce.f181191f.createBuilder();
        C62940bt btVar2 = C66576bb.f181094f;
        C66575ba baVar = (C66575ba) C66576bb.f181093e.createBuilder();
        Collection collection = this.f322568a;
        baVar.copyOnWrite();
        C66576bb bbVar = (C66576bb) baVar.instance;
        C62971cq cqVar4 = bbVar.f181098c;
        if (!cqVar4.mo58948c()) {
            bbVar.f181098c = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) collection, (List) bbVar.f181098c);
        cdVar2.mo58885m(btVar2, (C66576bb) baVar.build());
        return cdVar2;
    }

    /* renamed from: b */
    public final boolean mo77850b() {
        return true;
    }
}
