package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62278ba;
import com.google.lens.p4701g.C62279bb;
import com.google.lens.p4701g.C62280bc;
import com.google.lens.p4701g.C62281bd;
import com.google.p4172bg.p4173a.C55692c;
import com.google.p4172bg.p4174b.C55715d;
import com.google.p4172bg.p4174b.C55721j;
import com.google.protobuf.C62947c;
import com.google.protos.p5132q.C65861d;
import com.google.protos.p5132q.C65873p;
import com.google.protos.p5132q.C65874q;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.dz */
/* compiled from: PG */
public final class C24642dz extends C68247h {

    /* renamed from: a */
    private final C68283d f67383a;

    public C24642dz(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C24642dz.class), aVar);
        this.f67383a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C62281bd bdVar;
        C55692c cVar = (C55692c) obj;
        int i = 0;
        if (cVar.f146927b.mo55277g(C65873p.PARAGRAPH).isEmpty()) {
            C62280bc bcVar = (C62280bc) C62281bd.f168141b.createBuilder();
            C58485gu b = cVar.f146927b.mo55277g(C65873p.LINE);
            int size = b.size();
            while (i < size) {
                C65874q qVar = (C65874q) b.get(i);
                C62278ba baVar = (C62278ba) C62279bb.f168134e.createBuilder();
                C65861d dVar = qVar.f179084c;
                if (dVar == null) {
                    dVar = C65861d.f179033c;
                }
                C55715d b2 = C24629dm.m45716b(dVar);
                baVar.copyOnWrite();
                C62279bb bbVar = (C62279bb) baVar.instance;
                b2.getClass();
                bbVar.f168139d = b2;
                bbVar.f168136a |= 2;
                int a = cVar.mo54269a(qVar);
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                String sb2 = sb.toString();
                baVar.copyOnWrite();
                C62279bb bbVar2 = (C62279bb) baVar.instance;
                bbVar2.f168136a |= 1;
                bbVar2.f168137b = sb2;
                C55721j d = C24629dm.m45718d(qVar, cVar);
                baVar.copyOnWrite();
                C62279bb bbVar3 = (C62279bb) baVar.instance;
                d.getClass();
                bbVar3.mo58490a();
                bbVar3.f168138c.add(d);
                bcVar.mo58491a(baVar);
                i++;
            }
            bdVar = (C62281bd) bcVar.build();
        } else {
            C62280bc bcVar2 = (C62280bc) C62281bd.f168141b.createBuilder();
            C58485gu b3 = cVar.f146927b.mo55277g(C65873p.PARAGRAPH);
            int size2 = b3.size();
            while (i < size2) {
                C65874q qVar2 = (C65874q) b3.get(i);
                C62278ba baVar2 = (C62278ba) C62279bb.f168134e.createBuilder();
                int a2 = cVar.mo54269a(qVar2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a2);
                String sb4 = sb3.toString();
                baVar2.copyOnWrite();
                C62279bb bbVar4 = (C62279bb) baVar2.instance;
                bbVar4.f168136a |= 1;
                bbVar4.f168137b = sb4;
                baVar2.copyOnWrite();
                C62279bb bbVar5 = (C62279bb) baVar2.instance;
                bbVar5.mo58490a();
                C62947c.addAll((Iterable) Collection.EL.stream(cVar.mo54270b(qVar2)).map(new C24637du(cVar)).collect(C58370cn.f155946a), (List) bbVar5.f168138c);
                C65861d dVar2 = qVar2.f179084c;
                if (dVar2 == null) {
                    dVar2 = C65861d.f179033c;
                }
                C55715d b4 = C24629dm.m45716b(dVar2);
                baVar2.copyOnWrite();
                C62279bb bbVar6 = (C62279bb) baVar2.instance;
                b4.getClass();
                bbVar6.f168139d = b4;
                bbVar6.f168136a |= 2;
                bcVar2.mo58491a(baVar2);
                i++;
            }
            bdVar = (C62281bd) bcVar2.build();
        }
        return C60856cj.m92900i(bdVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f67383a.mo60297gq();
    }
}
