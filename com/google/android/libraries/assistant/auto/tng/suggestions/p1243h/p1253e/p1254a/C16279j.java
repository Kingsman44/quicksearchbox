package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.p1254a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123741bh;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.libraries.assistant.pcp.p1578m.C18983m;
import com.google.android.libraries.assistant.pcp.p1578m.C18985o;
import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.assistant.p3980n.p3985c.C53025p;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.assistant.p3994s.p3995a.C53440nz;
import com.google.assistant.p3994s.p3995a.C53442oa;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.j */
/* compiled from: PG */
public final /* synthetic */ class C16279j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f47917a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f47918b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f47919c;

    public /* synthetic */ C16279j(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f47917a = cxVar;
        this.f47918b = cxVar2;
        this.f47919c = cxVar3;
    }

    public final Object call() {
        Object obj;
        Object obj2;
        C60870cx cxVar = this.f47917a;
        C60870cx cxVar2 = this.f47918b;
        C60870cx cxVar3 = this.f47919c;
        String str = (String) ((Optional) C60856cj.m92909r(cxVar)).orElse(BuildConfig.FLAVOR);
        C123745bl blVar = (C123745bl) C123746bm.f341818b.createBuilder();
        for (C18985o oVar : (List) C60856cj.m92909r(cxVar2)) {
            C58976aa aaVar = C58975e.f156826a;
            oVar.f53349a.size();
            for (C18983m mVar : oVar.f53349a) {
                C49111gw gwVar = mVar.f53345d;
                if (gwVar == null) {
                    gwVar = C49111gw.f127019a;
                }
                C62940bt r7 = C62942bv.checkIsLite(C53435nu.f140234o);
                gwVar.mo58887l(r7);
                if (gwVar.f169962ag.mo58857o(r7.f169971d)) {
                    C123743bj bjVar = (C123743bj) C123744bk.f341804l.createBuilder();
                    C53440nz nzVar = (C53440nz) C53442oa.f140266d.createBuilder();
                    nzVar.copyOnWrite();
                    C53442oa oaVar = (C53442oa) nzVar.instance;
                    str.getClass();
                    oaVar.f140268a |= 1;
                    oaVar.f140269b = str;
                    C49111gw gwVar2 = mVar.f53345d;
                    if (gwVar2 == null) {
                        gwVar2 = C49111gw.f127019a;
                    }
                    C62940bt r9 = C62942bv.checkIsLite(C53435nu.f140234o);
                    gwVar2.mo58887l(r9);
                    Object l = gwVar2.f169962ag.mo58854l(r9.f169971d);
                    if (l == null) {
                        obj2 = r9.f169969b;
                    } else {
                        obj2 = r9.mo58889c(l);
                    }
                    C53435nu nuVar = (C53435nu) obj2;
                    nzVar.copyOnWrite();
                    C53442oa oaVar2 = (C53442oa) nzVar.instance;
                    nuVar.getClass();
                    C62971cq cqVar = oaVar2.f140270c;
                    if (!cqVar.mo58948c()) {
                        oaVar2.f140270c = C62942bv.mutableCopy(cqVar);
                    }
                    oaVar2.f140270c.add(nuVar);
                    bjVar.copyOnWrite();
                    C123744bk bkVar = (C123744bk) bjVar.instance;
                    C53442oa oaVar3 = (C53442oa) nzVar.build();
                    oaVar3.getClass();
                    bkVar.f341809d = oaVar3;
                    bkVar.f341808c = 2;
                    blVar.mo106126c((C123744bk) bjVar.build());
                }
                C49111gw gwVar3 = mVar.f53345d;
                if (gwVar3 == null) {
                    gwVar3 = C49111gw.f127019a;
                }
                C62940bt r72 = C62942bv.checkIsLite(C53025p.f138984c);
                gwVar3.mo58887l(r72);
                if (gwVar3.f169962ag.mo58857o(r72.f169971d)) {
                    C123743bj bjVar2 = (C123743bj) C123744bk.f341804l.createBuilder();
                    C123741bh bhVar = (C123741bh) C123742bi.f341800b.createBuilder();
                    C49111gw gwVar4 = mVar.f53345d;
                    if (gwVar4 == null) {
                        gwVar4 = C49111gw.f127019a;
                    }
                    C62940bt r8 = C62942bv.checkIsLite(C53025p.f138984c);
                    gwVar4.mo58887l(r8);
                    Object l2 = gwVar4.f169962ag.mo58854l(r8.f169971d);
                    if (l2 == null) {
                        obj = r8.f169969b;
                    } else {
                        obj = r8.mo58889c(l2);
                    }
                    bhVar.mo106121a(((C53025p) obj).f138986a);
                    bjVar2.copyOnWrite();
                    C123744bk bkVar2 = (C123744bk) bjVar2.instance;
                    C123742bi biVar = (C123742bi) bhVar.build();
                    biVar.getClass();
                    bkVar2.f341809d = biVar;
                    bkVar2.f341808c = 6;
                    blVar.mo106125b(bjVar2);
                }
            }
        }
        ((Optional) C60856cj.m92909r(cxVar3)).ifPresent(new C16270a(blVar));
        return (C123746bm) blVar.build();
    }
}
