package com.google.android.libraries.geller.portable;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p5030q.p5032b.C65072s;
import com.google.protos.p4985f.p5030q.p5032b.C65073t;
import com.google.protos.p4985f.p5030q.p5032b.C65074u;
import com.google.protos.p4985f.p5030q.p5032b.C65075v;
import com.google.protos.p4985f.p5030q.p5032b.C65076w;
import com.google.protos.p4985f.p5030q.p5032b.C65077x;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.portable.al */
/* compiled from: PG */
public final class C21946al {

    /* renamed from: a */
    public static final C59071e f60546a = C59071e.m91332i("com.google.android.libraries.geller.portable.al");

    /* renamed from: a */
    public static MessageLite m41084a(byte[] bArr, MessageLite messageLite) {
        if (bArr != null) {
            try {
                return (MessageLite) messageLite.getParserForType().mo59015n(bArr, C62921ba.m95368a());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f60546a.mo56225c()).mo56382g(e)).mo56372aa(48047)).mo56386p("Invalid native result.");
            }
        } else {
            ((C59052c) ((C59052c) f60546a.mo56225c()).mo56372aa(48046)).mo56386p("Native result is null.");
            return messageLite;
        }
    }

    /* renamed from: b */
    static C65077x m41085b(C65753ak akVar, List list) {
        C65075v vVar;
        C65073t tVar = (C65073t) C65076w.f176219d.createBuilder();
        tVar.copyOnWrite();
        C65076w wVar = (C65076w) tVar.instance;
        wVar.f176222b = akVar.f178757bE;
        wVar.f176221a |= 1;
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C21952d dVar = (C21952d) G.next();
            C65074u uVar = (C65074u) C65075v.f176214d.createBuilder();
            String b = dVar.mo27229b();
            uVar.copyOnWrite();
            C65075v vVar2 = (C65075v) uVar.instance;
            b.getClass();
            vVar2.f176216a |= 2;
            vVar2.f176218c = b;
            if (dVar.mo27228a().mo56113h()) {
                long longValue = ((Long) dVar.mo27228a().mo56107c()).longValue();
                uVar.copyOnWrite();
                C65075v vVar3 = (C65075v) uVar.instance;
                vVar3.f176216a |= 1;
                vVar3.f176217b = longValue;
                vVar = (C65075v) uVar.build();
            } else {
                vVar = (C65075v) uVar.build();
            }
            tVar.copyOnWrite();
            C65076w wVar2 = (C65076w) tVar.instance;
            vVar.getClass();
            C62971cq cqVar = wVar2.f176223c;
            if (!cqVar.mo58948c()) {
                wVar2.f176223c = C62942bv.mutableCopy(cqVar);
            }
            wVar2.f176223c.add(vVar);
        }
        C65072s sVar = (C65072s) C65077x.f176224b.createBuilder();
        sVar.copyOnWrite();
        C65077x xVar = (C65077x) sVar.instance;
        C65076w wVar3 = (C65076w) tVar.build();
        wVar3.getClass();
        C62971cq cqVar2 = xVar.f176226a;
        if (!cqVar2.mo58948c()) {
            xVar.f176226a = C62942bv.mutableCopy(cqVar2);
        }
        xVar.f176226a.add(wVar3);
        return (C65077x) sVar.build();
    }
}
