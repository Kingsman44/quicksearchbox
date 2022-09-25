package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22043aa;
import com.google.android.libraries.gsa.actionusermodel.C22046ad;
import com.google.android.libraries.gsa.actionusermodel.C22064av;
import com.google.android.libraries.gsa.actionusermodel.C22065aw;
import com.google.android.libraries.gsa.actionusermodel.C22072bb;
import com.google.android.libraries.gsa.actionusermodel.C22073bc;
import com.google.android.libraries.gsa.actionusermodel.C22074bd;
import com.google.android.libraries.gsa.actionusermodel.C22075be;
import com.google.android.libraries.gsa.actionusermodel.C22076bf;
import com.google.android.libraries.gsa.actionusermodel.C22077bg;
import com.google.android.libraries.gsa.actionusermodel.C22078bh;
import com.google.android.libraries.gsa.actionusermodel.C22079bi;
import com.google.android.libraries.gsa.actionusermodel.C22080bj;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22099b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64708r;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.t */
/* compiled from: PG */
public final class C22041t implements C22080bj {

    /* renamed from: a */
    public static final C58974d f60763a = C58974d.m91136j();

    /* renamed from: b */
    private final C22043aa f60764b;

    /* renamed from: c */
    private final Executor f60765c;

    public C22041t(C22043aa aaVar, Executor executor) {
        this.f60764b = aaVar;
        this.f60765c = executor;
    }

    /* renamed from: a */
    private static void m41276a(Object obj, Consumer consumer) {
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    /* renamed from: b */
    public final C60870cx mo27335b(C55421x xVar, C55998f fVar, Optional optional, String str, boolean z) {
        if (fVar == null) {
            return C60856cj.m92900i(C22099b.f60908d);
        }
        C22064av avVar = (C22064av) C22065aw.f60793g.createBuilder();
        avVar.copyOnWrite();
        C22065aw awVar = (C22065aw) avVar.instance;
        awVar.f60798d = xVar.f146230cP;
        awVar.f60795a |= 1;
        avVar.copyOnWrite();
        C22065aw awVar2 = (C22065aw) avVar.instance;
        awVar2.f60799e = fVar.f149132g;
        awVar2.f60795a |= 2;
        avVar.copyOnWrite();
        C22065aw awVar3 = (C22065aw) avVar.instance;
        str.getClass();
        awVar3.f60796b = 3;
        awVar3.f60797c = str;
        avVar.copyOnWrite();
        C22065aw awVar4 = (C22065aw) avVar.instance;
        awVar4.f60795a |= 16;
        awVar4.f60800f = z;
        C22043aa aaVar = this.f60764b;
        return C60846c.m92879h(C60922j.m93044g(C60838bs.m92859i(C70876o.m103760a(aaVar.f189039a.mo39510a(C22046ad.m41293a(), aaVar.f189040b), (C22065aw) avVar.build())), C22035n.f60757a, this.f60765c), Throwable.class, C22036o.f60758a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo27336c(C55421x xVar, String str, String str2, String str3, String str4, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3, boolean z4) {
        C22076bf bfVar = (C22076bf) C22077bg.f60849o.createBuilder();
        bfVar.copyOnWrite();
        C22077bg bgVar = (C22077bg) bfVar.instance;
        bgVar.f60852b = xVar.f146230cP;
        bgVar.f60851a |= 1;
        bfVar.copyOnWrite();
        C22077bg bgVar2 = (C22077bg) bfVar.instance;
        str.getClass();
        bgVar2.f60851a |= 2;
        bgVar2.f60853c = str;
        bfVar.copyOnWrite();
        C22077bg bgVar3 = (C22077bg) bfVar.instance;
        str2.getClass();
        bgVar3.f60851a |= 4;
        bgVar3.f60854d = str2;
        bfVar.copyOnWrite();
        C22077bg bgVar4 = (C22077bg) bfVar.instance;
        str3.getClass();
        bgVar4.f60851a |= 8;
        bgVar4.f60855e = str3;
        bfVar.copyOnWrite();
        C22077bg bgVar5 = (C22077bg) bfVar.instance;
        str4.getClass();
        bgVar5.f60851a |= 16;
        bgVar5.f60856f = str4;
        bfVar.copyOnWrite();
        C22077bg bgVar6 = (C22077bg) bfVar.instance;
        bgVar6.f60851a |= 128;
        bgVar6.f60860j = z;
        bfVar.copyOnWrite();
        C22077bg bgVar7 = (C22077bg) bfVar.instance;
        bgVar7.f60851a |= 512;
        bgVar7.f60862l = z2;
        bfVar.copyOnWrite();
        C22077bg bgVar8 = (C22077bg) bfVar.instance;
        bgVar8.f60851a |= 1024;
        bgVar8.f60863m = z3;
        bfVar.copyOnWrite();
        C22077bg bgVar9 = (C22077bg) bfVar.instance;
        bgVar9.f60851a |= 2048;
        bgVar9.f60864n = z4;
        bfVar.copyOnWrite();
        C22077bg bgVar10 = (C22077bg) bfVar.instance;
        C62971cq cqVar = bgVar10.f60857g;
        if (!cqVar.mo58948c()) {
            bgVar10.f60857g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) bgVar10.f60857g);
        Objects.requireNonNull(bfVar);
        optional.ifPresent(new C22037p(bfVar));
        Objects.requireNonNull(bfVar);
        m41276a(zVar, new C22038q(bfVar));
        Objects.requireNonNull(bfVar);
        m41276a(rVar, new C22039r(bfVar));
        C22043aa aaVar = this.f60764b;
        return C60846c.m92879h(C70876o.m103760a(aaVar.f189039a.mo39510a(C22046ad.m41296d(), aaVar.f189040b), (C22077bg) bfVar.build()), Throwable.class, C22040s.f60762a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo27337d(C55421x xVar, String str, String str2, String str3, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3, boolean z4) {
        C22074bd bdVar = (C22074bd) C22075be.f60833n.createBuilder();
        bdVar.copyOnWrite();
        C22075be beVar = (C22075be) bdVar.instance;
        beVar.f60836b = xVar.f146230cP;
        beVar.f60835a |= 1;
        bdVar.copyOnWrite();
        C22075be beVar2 = (C22075be) bdVar.instance;
        str.getClass();
        beVar2.f60835a |= 2;
        beVar2.f60837c = str;
        bdVar.copyOnWrite();
        C22075be beVar3 = (C22075be) bdVar.instance;
        str2.getClass();
        beVar3.f60835a |= 4;
        beVar3.f60838d = str2;
        bdVar.copyOnWrite();
        C22075be beVar4 = (C22075be) bdVar.instance;
        str3.getClass();
        beVar4.f60835a |= 8;
        beVar4.f60839e = str3;
        bdVar.copyOnWrite();
        C22075be beVar5 = (C22075be) bdVar.instance;
        beVar5.f60835a |= 64;
        beVar5.f60843i = z;
        bdVar.copyOnWrite();
        C22075be beVar6 = (C22075be) bdVar.instance;
        beVar6.f60835a |= 256;
        beVar6.f60845k = z2;
        bdVar.copyOnWrite();
        C22075be beVar7 = (C22075be) bdVar.instance;
        beVar7.f60835a |= 512;
        beVar7.f60846l = z3;
        bdVar.copyOnWrite();
        C22075be beVar8 = (C22075be) bdVar.instance;
        beVar8.f60835a |= 1024;
        beVar8.f60847m = z4;
        bdVar.copyOnWrite();
        C22075be beVar9 = (C22075be) bdVar.instance;
        C62971cq cqVar = beVar9.f60840f;
        if (!cqVar.mo58948c()) {
            beVar9.f60840f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) beVar9.f60840f);
        Objects.requireNonNull(bdVar);
        optional.ifPresent(new C22022a(bdVar));
        Objects.requireNonNull(bdVar);
        m41276a(zVar, new C22032k(bdVar));
        Objects.requireNonNull(bdVar);
        m41276a(rVar, new C22033l(bdVar));
        C22043aa aaVar = this.f60764b;
        return C60846c.m92879h(C70876o.m103760a(aaVar.f189039a.mo39510a(C22046ad.m41295c(), aaVar.f189040b), (C22075be) bdVar.build()), Throwable.class, C22034m.f60756a, C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo27338e(C55421x xVar, String str, String str2, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3) {
        C22078bh bhVar = (C22078bh) C22079bi.f60866l.createBuilder();
        bhVar.copyOnWrite();
        C22079bi biVar = (C22079bi) bhVar.instance;
        biVar.f60869b = xVar.f146230cP;
        biVar.f60868a |= 1;
        bhVar.copyOnWrite();
        C22079bi biVar2 = (C22079bi) bhVar.instance;
        str.getClass();
        biVar2.f60868a |= 2;
        biVar2.f60870c = str;
        bhVar.copyOnWrite();
        C22079bi biVar3 = (C22079bi) bhVar.instance;
        str2.getClass();
        biVar3.f60868a |= 4;
        biVar3.f60871d = str2;
        bhVar.copyOnWrite();
        C22079bi biVar4 = (C22079bi) bhVar.instance;
        biVar4.f60868a |= 32;
        biVar4.f60875h = z;
        bhVar.copyOnWrite();
        C22079bi biVar5 = (C22079bi) bhVar.instance;
        C62971cq cqVar = biVar5.f60872e;
        if (!cqVar.mo58948c()) {
            biVar5.f60872e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) biVar5.f60872e);
        bhVar.copyOnWrite();
        C22079bi biVar6 = (C22079bi) bhVar.instance;
        biVar6.f60868a |= 128;
        biVar6.f60877j = z2;
        bhVar.copyOnWrite();
        C22079bi biVar7 = (C22079bi) bhVar.instance;
        biVar7.f60868a |= 256;
        biVar7.f60878k = z3;
        Objects.requireNonNull(bhVar);
        optional.ifPresent(new C22028g(bhVar));
        Objects.requireNonNull(bhVar);
        m41276a(zVar, new C22029h(bhVar));
        Objects.requireNonNull(bhVar);
        m41276a(rVar, new C22030i(bhVar));
        C22043aa aaVar = this.f60764b;
        return C60846c.m92879h(C70876o.m103760a(aaVar.f189039a.mo39510a(C22046ad.m41297e(), aaVar.f189040b), (C22079bi) bhVar.build()), Throwable.class, C22031j.f60753a, C60826bg.f164896a);
    }

    /* renamed from: j */
    public final C60870cx mo27339j(C55421x xVar, String str, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3) {
        C22072bb bbVar = (C22072bb) C22073bc.f60820k.createBuilder();
        bbVar.copyOnWrite();
        C22073bc bcVar = (C22073bc) bbVar.instance;
        bcVar.f60823b = xVar.f146230cP;
        bcVar.f60822a |= 1;
        bbVar.copyOnWrite();
        C22073bc bcVar2 = (C22073bc) bbVar.instance;
        str.getClass();
        bcVar2.f60822a |= 2;
        bcVar2.f60824c = str;
        bbVar.copyOnWrite();
        C22073bc bcVar3 = (C22073bc) bbVar.instance;
        bcVar3.f60822a |= 16;
        bcVar3.f60828g = z;
        bbVar.copyOnWrite();
        C22073bc bcVar4 = (C22073bc) bbVar.instance;
        bcVar4.f60822a |= 64;
        bcVar4.f60830i = z2;
        bbVar.copyOnWrite();
        C22073bc bcVar5 = (C22073bc) bbVar.instance;
        bcVar5.f60822a |= 128;
        bcVar5.f60831j = z3;
        Iterable iterable = (Iterable) Collection.EL.stream(list).map(C22023b.f60745a).collect(C58370cn.f155946a);
        bbVar.copyOnWrite();
        C22073bc bcVar6 = (C22073bc) bbVar.instance;
        C62971cq cqVar = bcVar6.f60825d;
        if (!cqVar.mo58948c()) {
            bcVar6.f60825d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bcVar6.f60825d);
        Objects.requireNonNull(bbVar);
        optional.ifPresent(new C22024c(bbVar));
        Objects.requireNonNull(bbVar);
        m41276a(zVar, new C22025d(bbVar));
        Objects.requireNonNull(bbVar);
        m41276a(rVar, new C22026e(bbVar));
        C22043aa aaVar = this.f60764b;
        return C60846c.m92879h(C70876o.m103760a(aaVar.f189039a.mo39510a(C22046ad.m41294b(), aaVar.f189040b), (C22073bc) bbVar.build()), Throwable.class, C22027f.f60749a, C60826bg.f164896a);
    }
}
