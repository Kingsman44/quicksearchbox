package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.base.C58887cx;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5543b.C70936a;
import p5535j.p5536a.p5543b.C70958e;
import p5535j.p5536a.p5543b.C70965l;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.m */
/* compiled from: PG */
public final class C15487m {

    /* renamed from: a */
    private final Map f46434a;

    public C15487m(Map map) {
        this.f46434a = map;
    }

    /* renamed from: b */
    public static C58485gu m32219b(Throwable th) {
        return (C58485gu) Collection.EL.stream(C58485gu.m89841i(C58557jl.m90125f(C58887cx.m90978e(th), 10))).map(C15485k.f46432a).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public static void m32220c(C37252a aVar, C15474b bVar, Optional optional) {
        C70936a aVar2 = (C70936a) C70958e.f189197m.createBuilder();
        C62971cq cqVar = bVar.f46409d;
        aVar2.copyOnWrite();
        C70958e eVar = (C70958e) aVar2.instance;
        C62971cq cqVar2 = eVar.f189208i;
        if (!cqVar2.mo58948c()) {
            eVar.f189208i = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) eVar.f189208i);
        if ((bVar.f46406a & 1) != 0) {
            String str = bVar.f46407b;
            aVar2.copyOnWrite();
            C70958e eVar2 = (C70958e) aVar2.instance;
            str.getClass();
            eVar2.f189200a |= 1;
            eVar2.f189203d = str;
        }
        if ((bVar.f46406a & 2) != 0) {
            long j = bVar.f46408c;
            aVar2.copyOnWrite();
            C70958e eVar3 = (C70958e) aVar2.instance;
            eVar3.f189200a |= 2;
            eVar3.f189204e = j;
        }
        if (!bVar.f46410e.isEmpty()) {
            C62971cq cqVar3 = bVar.f46410e;
            aVar2.copyOnWrite();
            C70958e eVar4 = (C70958e) aVar2.instance;
            C62971cq cqVar4 = eVar4.f189205f;
            if (!cqVar4.mo58948c()) {
                eVar4.f189205f = C62942bv.mutableCopy(cqVar4);
            }
            C62947c.addAll((Iterable) cqVar3, (List) eVar4.f189205f);
        }
        if ((bVar.f46406a & 4) != 0) {
            String str2 = bVar.f46411f;
            aVar2.copyOnWrite();
            C70958e eVar5 = (C70958e) aVar2.instance;
            str2.getClass();
            eVar5.f189200a |= 16;
            eVar5.f189206g = str2;
        }
        if (optional.isPresent()) {
            ((C15496v) optional.get()).mo22367a(aVar2, bVar);
        }
        if ((bVar.f46406a & 8) != 0) {
            C70967n a = C70967n.m103850a(bVar.f46412g);
            if (a == null) {
                a = C70967n.UNKNOWN;
            }
            aVar2.copyOnWrite();
            C70958e eVar6 = (C70958e) aVar2.instance;
            eVar6.f189207h = a.f189241p;
            eVar6.f189200a |= 32;
        }
        if ((bVar.f46406a & 16) != 0) {
            boolean z = bVar.f46413h;
            aVar2.copyOnWrite();
            C70958e eVar7 = (C70958e) aVar2.instance;
            eVar7.f189200a |= 512;
            eVar7.f189211l = z;
        }
        if ((bVar.f46406a & 32) != 0) {
            C70965l lVar = bVar.f46414i;
            if (lVar == null) {
                lVar = C70965l.f189217f;
            }
            aVar2.copyOnWrite();
            C70958e eVar8 = (C70958e) aVar2.instance;
            lVar.getClass();
            eVar8.f189210k = lVar;
            eVar8.f189200a |= 256;
        }
        C70958e eVar9 = (C70958e) aVar2.build();
        if (!eVar9.equals(C70958e.f189197m)) {
            aVar.mo40792p(C70958e.f189198n, eVar9);
        }
    }

    /* renamed from: a */
    public final C15474b mo22362a(C12991i iVar, Optional optional, Optional optional2) {
        C15471a aVar = (C15471a) C15474b.f46404j.createBuilder();
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        if ((yVar.f40415a & 2) != 0) {
            C13007y yVar2 = iVar.f40383b;
            if (yVar2 == null) {
                yVar2 = C13007y.f40413d;
            }
            String str = yVar2.f40417c;
            aVar.copyOnWrite();
            C15474b bVar = (C15474b) aVar.instance;
            str.getClass();
            bVar.f46406a |= 1;
            bVar.f46407b = str;
        }
        Map map = this.f46434a;
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (map.containsKey(a)) {
            Map map2 = this.f46434a;
            C12989g a2 = C12989g.m29225a(iVar.f40385d);
            if (a2 == null) {
                a2 = C12989g.UNKNOWN;
            }
            ((C15496v) ((C69464a) map2.get(a2)).mo17428b()).mo22368b(aVar, iVar, optional, optional2);
        }
        return (C15474b) aVar.build();
    }
}
