package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80322bq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80323br;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80324bs;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80336cd;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bv */
/* compiled from: PG */
public final /* synthetic */ class C77050bv implements C77086dd {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212662a;

    /* renamed from: b */
    public final /* synthetic */ boolean f212663b;

    /* renamed from: c */
    public final /* synthetic */ C77140u f212664c;

    /* renamed from: d */
    public final /* synthetic */ String f212665d;

    public /* synthetic */ C77050bv(C77089dg dgVar, boolean z, C77140u uVar, String str) {
        this.f212662a = dgVar;
        this.f212663b = z;
        this.f212664c = uVar;
        this.f212665d = str;
    }

    /* renamed from: a */
    public final C60870cx mo72388a(long j, af afVar, C80399l lVar, C80303ay ayVar) {
        C77089dg dgVar = this.f212662a;
        boolean z = this.f212663b;
        C77140u uVar = this.f212664c;
        String str = this.f212665d;
        if (z) {
            C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
            C80322bq bqVar = (C80322bq) C80336cd.f220442f.createBuilder();
            String str2 = afVar.b().i;
            bqVar.copyOnWrite();
            str2.getClass();
            ((C80336cd) bqVar.instance).f220446c = str2;
            C80323br brVar = (C80323br) C80324bs.f220416b.createBuilder();
            brVar.copyOnWrite();
            ((C80324bs) brVar.instance).f220418a = j;
            bqVar.copyOnWrite();
            C80336cd cdVar = (C80336cd) bqVar.instance;
            C80324bs bsVar = (C80324bs) brVar.build();
            bsVar.getClass();
            cdVar.f220445b = bsVar;
            cdVar.f220444a = 7;
            aoVar.copyOnWrite();
            C80295aq aqVar = (C80295aq) aoVar.instance;
            C80336cd cdVar2 = (C80336cd) bqVar.build();
            cdVar2.getClass();
            aqVar.f220360b = cdVar2;
            aqVar.f220359a = 4;
            C81442m.m129555q(lVar, aoVar);
            return C118826c.f331423b;
        }
        long j2 = j;
        C80399l lVar2 = lVar;
        if (dgVar.mo72422j(uVar)) {
            return dgVar.mo72419e(j, (df) uVar.mo72410f().get(), afVar, lVar, ayVar, uVar, new C77053by(afVar, str));
        }
        af afVar2 = afVar;
        af afVar3 = afVar;
        C60870cx d = dgVar.mo72418d(j, (df) uVar.mo72410f().get(), afVar3, uVar, ayVar);
        C77069cn cnVar = r1;
        String str3 = str;
        C22871g gVar = dgVar.f212752f;
        C77069cn cnVar2 = new C77069cn(dgVar, j, afVar3, str3, uVar, lVar, ayVar);
        return gVar.mo28210j(d, "[NGA] post getSingleContactEndpoint", cnVar);
    }
}
