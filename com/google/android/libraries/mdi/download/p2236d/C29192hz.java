package com.google.android.libraries.mdi.download.p2236d;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.p2228a.C28693a;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29032au;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29040g;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29042i;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29057x;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29059z;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.d.hz */
/* compiled from: PG */
public final /* synthetic */ class C29192hz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79153a;

    public /* synthetic */ C29192hz(C29211ir irVar) {
        this.f79153a = irVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C29211ir irVar = this.f79153a;
        Integer num = (Integer) obj;
        ArrayList arrayList = new ArrayList();
        C29045l.m53930b("%s checkResetTrigger", "MDDManager");
        C60870cx h = irVar.mo34632h();
        C29210iq iqVar = new C29210iq(irVar);
        arrayList.add(C60922j.m93045h(h, C47810es.m84966f(iqVar), irVar.f79204n));
        if (irVar.f79206p.mo34414D()) {
            C29117fe feVar = irVar.f79194d;
            arrayList.add(feVar.mo34587j(new C29113fa(feVar)));
        }
        if (irVar.f79206p.mo34417G()) {
            C29117fe feVar2 = irVar.f79194d;
            C60870cx d = feVar2.f78975d.mo34599d();
            C29008dy dyVar = new C29008dy(feVar2);
            arrayList.add(C60922j.m93045h(d, C47810es.m84966f(dyVar), feVar2.f78980i));
        }
        if (irVar.f79206p.mo34416F()) {
            C29117fe feVar3 = irVar.f79194d;
            if (!feVar3.f78979h.mo56113h()) {
                cxVar2 = C60866ct.f164955a;
            } else {
                try {
                    C28693a aVar = (C28693a) feVar3.f78979h.mo56107c();
                    C58485gu l = C58485gu.m89844l(aVar.f77964b.getAccountsByTypeForPackage("com.google", aVar.f77963a));
                    C58526ih ihVar = new C58526ih();
                    int i = ((C58724pq) l).f156474d;
                    for (int i2 = 0; i2 < i; i2++) {
                        Account account = (Account) l.get(i2);
                        if (!(account.name == null || account.type == null)) {
                            ihVar.mo55373c(C28694b.m53577b(account));
                        }
                    }
                    C58528ij f = ihVar.mo55486f();
                    C60870cx d2 = feVar3.f78975d.mo34599d();
                    C28942cg cgVar = new C28942cg(feVar3, f);
                    cxVar2 = C60922j.m93045h(d2, C47810es.m84966f(cgVar), feVar3.f78980i);
                } catch (RuntimeException e) {
                    cxVar2 = C60856cj.m92899h(e);
                }
            }
            arrayList.add(cxVar2);
        }
        if (irVar.f79206p.mo34444x()) {
            C29117fe feVar4 = irVar.f79194d;
            arrayList.add(feVar4.mo34587j(new C28986dc(feVar4)));
        }
        if (irVar.f79206p.mo34419I()) {
            C29314z zVar = irVar.f79198h;
            C60870cx e2 = zVar.f79441b.mo34600e();
            C29305q qVar = new C29305q(zVar);
            C60870cx h2 = C60922j.m93045h(e2, C47810es.m84966f(qVar), zVar.f79449j);
            C29309u uVar = new C29309u(zVar);
            arrayList.add(C60922j.m93045h(h2, C47810es.m84966f(uVar), zVar.f79449j));
            irVar.f79193c.mo34543h(1053);
        }
        C29042i iVar = irVar.f79201k;
        arrayList.add(iVar.f78837c.mo34536a(new C29040g(iVar, num.intValue())));
        C29034aw awVar = irVar.f79200j;
        arrayList.add(awVar.f78822d.mo34538c(new C29032au(awVar, num.intValue())));
        C29059z zVar2 = irVar.f79202l;
        if (!zVar2.f78869b.mo34415E()) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = zVar2.f78868a.mo34537b(new C29057x(zVar2.f78870c.mo34550b()));
        }
        arrayList.add(cxVar);
        if (irVar.f79205o.mo56113h()) {
            C29117fe feVar5 = irVar.f79194d;
            C60870cx d3 = feVar5.f78975d.mo34599d();
            C29074eo eoVar = new C29074eo(feVar5);
            arrayList.add(C60922j.m93045h(d3, C47810es.m84966f(eoVar), feVar5.f78980i));
        }
        C29111y.m54038a(irVar.f79192b, "gms_icing_mdd_manager_metadata", irVar.f79203m).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
        return C29672d.m54726a(arrayList).mo34823a(C29190hx.f79151a, irVar.f79204n);
    }
}
