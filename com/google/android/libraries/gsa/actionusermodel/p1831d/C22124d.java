package com.google.android.libraries.gsa.actionusermodel.p1831d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.actionusermodel.C22044ab;
import com.google.android.libraries.gsa.actionusermodel.C22065aw;
import com.google.android.libraries.gsa.actionusermodel.C22067ay;
import com.google.android.libraries.gsa.actionusermodel.C22073bc;
import com.google.android.libraries.gsa.actionusermodel.C22075be;
import com.google.android.libraries.gsa.actionusermodel.C22077bg;
import com.google.android.libraries.gsa.actionusermodel.C22079bi;
import com.google.android.libraries.gsa.actionusermodel.C22080bj;
import com.google.android.libraries.gsa.actionusermodel.C22082bl;
import com.google.android.libraries.gsa.actionusermodel.C22153y;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22098a;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22099b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d.d */
/* compiled from: PG */
public final class C22124d extends C22044ab {

    /* renamed from: a */
    private static final C58974d f60963a = C58974d.m91136j();

    /* renamed from: b */
    private final C22080bj f60964b;

    /* renamed from: c */
    private final C22871g f60965c;

    /* renamed from: d */
    private final C22871g f60966d;

    public C22124d(C22080bj bjVar, C22871g gVar, C22871g gVar2) {
        this.f60964b = bjVar;
        this.f60965c = gVar;
        this.f60966d = gVar2;
    }

    /* renamed from: g */
    private static Optional m41371g(String str) {
        return str.isEmpty() ? Optional.empty() : Optional.m71637of(str);
    }

    /* renamed from: h */
    private final void m41372h(C60870cx cxVar, C70862aj ajVar) {
        m41373i(this.f60965c.mo28209i(cxVar, "AumImpl.logActionInternal", C22122b.f60961a), ajVar);
    }

    /* renamed from: i */
    private final void m41373i(C60870cx cxVar, C70862aj ajVar) {
        this.f60966d.mo28211k(cxVar, "AUM GRPC send response", new C22123c(ajVar));
    }

    /* renamed from: c */
    public final void mo27341c(C22073bc bcVar, C70862aj ajVar) {
        C64708r rVar;
        C22080bj bjVar = this.f60964b;
        C55421x a = C55421x.m87686a(bcVar.f60823b);
        if (a == null) {
            a = C55421x.UNKNOWN_ACTION_TYPE;
        }
        String str = bcVar.f60824c;
        List list = (List) Collection.EL.stream(bcVar.f60825d).map(C22121a.f60960a).collect(C58370cn.f155946a);
        Optional g = m41371g(bcVar.f60826e);
        C63088z zVar = bcVar.f60827f;
        boolean z = bcVar.f60828g;
        if ((bcVar.f60822a & 32) != 0) {
            rVar = bcVar.f60829h;
            if (rVar == null) {
                rVar = C64708r.f175399l;
            }
        } else {
            rVar = null;
        }
        m41373i(bjVar.mo27339j(a, str, list, g, zVar, z, rVar, bcVar.f60830i, bcVar.f60831j), ajVar);
    }

    /* renamed from: d */
    public final void mo27342d(C22077bg bgVar, C70862aj ajVar) {
        C64708r rVar;
        C22077bg bgVar2 = bgVar;
        C22080bj bjVar = this.f60964b;
        C55421x a = C55421x.m87686a(bgVar2.f60852b);
        if (a == null) {
            a = C55421x.UNKNOWN_ACTION_TYPE;
        }
        String str = bgVar2.f60853c;
        String str2 = bgVar2.f60854d;
        String str3 = bgVar2.f60855e;
        String str4 = bgVar2.f60856f;
        C62971cq cqVar = bgVar2.f60857g;
        Optional g = m41371g(bgVar2.f60858h);
        C63088z zVar = bgVar2.f60859i;
        boolean z = bgVar2.f60860j;
        if ((bgVar2.f60851a & 256) != 0) {
            rVar = bgVar2.f60861k;
            if (rVar == null) {
                rVar = C64708r.f175399l;
            }
        } else {
            rVar = null;
        }
        m41373i(bjVar.mo27336c(a, str, str2, str3, str4, cqVar, g, zVar, z, rVar, bgVar2.f60862l, bgVar2.f60863m, bgVar2.f60864n), ajVar);
    }

    /* renamed from: e */
    public final void mo27343e(C22075be beVar, C70862aj ajVar) {
        C64708r rVar;
        C22080bj bjVar = this.f60964b;
        C55421x a = C55421x.m87686a(beVar.f60836b);
        if (a == null) {
            a = C55421x.UNKNOWN_ACTION_TYPE;
        }
        String str = beVar.f60837c;
        String str2 = beVar.f60838d;
        String str3 = beVar.f60839e;
        C62971cq cqVar = beVar.f60840f;
        Optional g = m41371g(beVar.f60841g);
        C63088z zVar = beVar.f60842h;
        boolean z = beVar.f60843i;
        if ((beVar.f60835a & 128) != 0) {
            rVar = beVar.f60844j;
            if (rVar == null) {
                rVar = C64708r.f175399l;
            }
        } else {
            rVar = null;
        }
        m41373i(bjVar.mo27337d(a, str, str2, str3, cqVar, g, zVar, z, rVar, beVar.f60845k, beVar.f60846l, beVar.f60847m), ajVar);
    }

    /* renamed from: f */
    public final void mo27344f(C22079bi biVar, C70862aj ajVar) {
        C64708r rVar;
        C22080bj bjVar = this.f60964b;
        C55421x a = C55421x.m87686a(biVar.f60869b);
        if (a == null) {
            a = C55421x.UNKNOWN_ACTION_TYPE;
        }
        String str = biVar.f60870c;
        String str2 = biVar.f60871d;
        C62971cq cqVar = biVar.f60872e;
        Optional g = m41371g(biVar.f60873f);
        C63088z zVar = biVar.f60874g;
        boolean z = biVar.f60875h;
        if ((biVar.f60868a & 64) != 0) {
            rVar = biVar.f60876i;
            if (rVar == null) {
                rVar = C64708r.f175399l;
            }
        } else {
            rVar = null;
        }
        m41373i(bjVar.mo27338e(a, str, str2, cqVar, g, zVar, z, rVar, biVar.f60877j, biVar.f60878k), ajVar);
    }

    /* renamed from: b */
    public final void mo27340b(C22065aw awVar, C70862aj ajVar) {
        C22082bl blVar;
        C60870cx cxVar;
        int i = awVar.f60796b;
        int i2 = i != 0 ? i != 3 ? i != 4 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C22080bj bjVar = this.f60964b;
            C55421x a = C55421x.m87686a(awVar.f60798d);
            if (a == null) {
                a = C55421x.UNKNOWN_ACTION_TYPE;
            }
            C55998f a2 = C55998f.m87878a(awVar.f60799e);
            if (a2 == null) {
                a2 = C55998f.UNKNOWN;
            }
            m41372h(bjVar.mo27335b(a, a2, Optional.empty(), awVar.f60796b == 3 ? (String) awVar.f60797c : BuildConfig.FLAVOR, awVar.f60800f), ajVar);
        } else if (i3 == 1) {
            C22080bj bjVar2 = this.f60964b;
            C55421x a3 = C55421x.m87686a(awVar.f60798d);
            if (a3 == null) {
                a3 = C55421x.UNKNOWN_ACTION_TYPE;
            }
            C55421x xVar = a3;
            C55998f a4 = C55998f.m87878a(awVar.f60799e);
            if (a4 == null) {
                a4 = C55998f.UNKNOWN;
            }
            C55998f fVar = a4;
            Optional empty = Optional.empty();
            if (awVar.f60796b == 4) {
                blVar = (C22082bl) awVar.f60797c;
            } else {
                blVar = C22082bl.f60880b;
            }
            C62971cq cqVar = blVar.f60882a;
            boolean z = awVar.f60800f;
            if (fVar == null) {
                cxVar = C60856cj.m92900i(C22099b.f60908d);
            } else if (cqVar.isEmpty()) {
                ((C58970a) ((C58970a) C22153y.f61118a.mo56226d()).mo56372aa(48188)).mo56386p("aumResults must not be empty.");
                cxVar = C60856cj.m92900i(C22099b.f60908d);
            } else {
                C22098a aVar = (C22098a) C22099b.f60908d.createBuilder();
                aVar.mo27353a(cqVar);
                Optional g = ((C22153y) bjVar2).mo27365g(xVar, fVar, cqVar, empty, z);
                if (g.isPresent()) {
                    C65768az azVar = (C65768az) g.get();
                    aVar.copyOnWrite();
                    C22099b bVar = (C22099b) aVar.instance;
                    azVar.getClass();
                    bVar.f60911b = azVar;
                    bVar.f60910a |= 1;
                }
                cxVar = C60856cj.m92900i((C22099b) aVar.build());
            }
            m41372h(cxVar, ajVar);
        } else if (i3 == 2) {
            ((C58970a) ((C58970a) f60963a.mo56225c()).mo56372aa(48217)).mo56386p("Must specify either session id or list of AumResult in AumLogActionRequest.");
            ajVar.mo20123c(C22067ay.f60801d);
            ajVar.mo20121a();
        }
    }
}
