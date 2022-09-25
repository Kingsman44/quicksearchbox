package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.android.libraries.logging.C28260b;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60446qi;
import com.google.common.p4552o.C60448qk;
import com.google.common.p4552o.C60449ql;
import com.google.common.p4552o.C60450qm;
import com.google.common.p4552o.C60451qn;
import com.google.common.p4552o.C60452qo;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.af */
/* compiled from: PG */
public final class C40025af implements C40027ah {

    /* renamed from: a */
    public static final C59071e f105182a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.a.c.af");

    /* renamed from: b */
    public final C38750am f105183b;

    /* renamed from: c */
    public final C59743a f105184c;

    /* renamed from: d */
    public final boolean f105185d;

    /* renamed from: e */
    private final C60870cx f105186e;

    /* renamed from: f */
    private final Consumer f105187f;

    public C40025af(C38750am amVar, C59743a aVar, C60870cx cxVar, Consumer consumer, boolean z) {
        this.f105183b = amVar;
        this.f105184c = aVar;
        this.f105186e = cxVar;
        this.f105187f = consumer;
        this.f105185d = z;
    }

    /* renamed from: e */
    public static aql m69528e(int i, C57696b bVar) {
        aql aql = (aql) aqm.f159760n.createBuilder();
        aql.copyOnWrite();
        aqm aqm = (aqm) aql.instance;
        aqm.f159762a |= 16;
        aqm.f159767f = i - 1;
        C60214n nVar = bVar.f154142c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        aql.copyOnWrite();
        aqm aqm2 = (aqm) aql.instance;
        nVar.getClass();
        aqm2.f159763b = nVar;
        aqm2.f159762a |= 1;
        return aql;
    }

    /* renamed from: a */
    public final void mo42128a(C57696b bVar) {
        C60214n nVar = bVar.f154142c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        int i = nVar.f162918c;
        mo42131d(bVar, m69528e(32, bVar), (C60450qm) null);
    }

    /* renamed from: b */
    public final void mo42129b(C57696b bVar) {
        mo42132f(2, bVar);
    }

    /* renamed from: c */
    public final void mo42130c(C57696b bVar) {
        C60214n nVar = bVar.f154142c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        int i = nVar.f162918c;
        mo42131d(bVar, m69528e(5, bVar), (C60450qm) null);
    }

    /* renamed from: d */
    public final void mo42131d(C57696b bVar, aql aql, C60450qm qmVar) {
        if ((bVar.f154140a & 256) != 0) {
            int i = bVar.f154149j;
            aql.copyOnWrite();
            aqm aqm = (aqm) aql.instance;
            aqm aqm2 = aqm.f159760n;
            aqm.f159762a |= 128;
            aqm.f159770i = i;
        }
        this.f105187f.accept(new C40024ae(aql, bVar));
        C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
        C60218r a = C28260b.m52825a();
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        a.getClass();
        oeVar.f163227b = a;
        oeVar.f163226a |= 1;
        C60214n nVar = bVar.f154142c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        C60218r rVar = nVar.f162921f;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        odVar.copyOnWrite();
        C60321oe oeVar2 = (C60321oe) odVar.instance;
        rVar.getClass();
        oeVar2.f163229d = rVar;
        oeVar2.f163226a |= 2;
        odVar.copyOnWrite();
        C60321oe oeVar3 = (C60321oe) odVar.instance;
        aqm aqm3 = (aqm) aql.build();
        aqm3.getClass();
        oeVar3.f163230e = aqm3;
        oeVar3.f163226a |= 16;
        if (qmVar != null) {
            odVar.copyOnWrite();
            C60321oe oeVar4 = (C60321oe) odVar.instance;
            oeVar4.f163232g = qmVar;
            oeVar4.f163226a |= 64;
        }
        C60856cj.m92911t(this.f105186e, C47810es.m84974n(new C40022ac(this, odVar)), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final void mo42132f(int i, C57696b bVar) {
        C60214n nVar = bVar.f154142c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        C60214n nVar2 = bVar.f154142c;
        if (nVar2 == null) {
            nVar2 = C60214n.f162914g;
        }
        int i2 = nVar2.f162918c;
        aql aql = (aql) aqm.f159760n.createBuilder();
        C60449ql qlVar = (C60449ql) C60450qm.f163590b.createBuilder();
        C60446qi qiVar = (C60446qi) C60448qk.f163581g.createBuilder();
        qiVar.copyOnWrite();
        C60448qk qkVar = (C60448qk) qiVar.instance;
        qkVar.f163585c = i - 1;
        qkVar.f163583a |= 2;
        C60451qn qnVar = (C60451qn) C60452qo.f163594e.createBuilder();
        qnVar.copyOnWrite();
        C60452qo qoVar = (C60452qo) qnVar.instance;
        nVar.getClass();
        qoVar.f163599d = nVar;
        qoVar.f163598c = 2;
        C60218r rVar = nVar.f162921f;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        qnVar.copyOnWrite();
        C60452qo qoVar2 = (C60452qo) qnVar.instance;
        rVar.getClass();
        qoVar2.f163597b = rVar;
        qoVar2.f163596a = 3;
        qiVar.copyOnWrite();
        C60448qk qkVar2 = (C60448qk) qiVar.instance;
        C60452qo qoVar3 = (C60452qo) qnVar.build();
        qoVar3.getClass();
        qkVar2.f163584b = qoVar3;
        qkVar2.f163583a |= 1;
        qlVar.mo57090a(qiVar);
        mo42131d(bVar, aql, (C60450qm) qlVar.build());
    }
}
