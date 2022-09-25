package com.google.android.libraries.mdi.download;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.android.libraries.mdi.download.p2236d.C29208io;
import com.google.android.libraries.mdi.download.p2236d.C29211ir;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.gd */
/* compiled from: PG */
public final /* synthetic */ class C29450gd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79844a;

    /* renamed from: b */
    public final /* synthetic */ C29653hx f79845b;

    public /* synthetic */ C29450gd(C29647hr hrVar, C29653hx hxVar) {
        this.f79844a = hrVar;
        this.f79845b = hxVar;
    }

    public final C60870cx apply(Object obj) {
        C29647hr hrVar = this.f79844a;
        C29653hx hxVar = this.f79845b;
        C58526ih ihVar = new C58526ih();
        for (C28816c cVar : (List) obj) {
            C29680t tVar = (C29680t) hxVar;
            if (C28694b.m53577b((Account) ((C58847bk) tVar.f80373b).f156646a).equals(cVar.mo34484b().f79684d)) {
                C28745bw bwVar = (C28745bw) ((C58847bk) tVar.f80372a).f156646a;
                C28745bw a = C28745bw.m53621a(cVar.mo34483a().f79506h);
                if (a == null) {
                    a = C28745bw.GDD_UNKNOWN;
                }
                if (bwVar.equals(a)) {
                    C29391eo eoVar = (C29391eo) cVar.mo34484b().toBuilder();
                    eoVar.copyOnWrite();
                    C29392ep epVar = (C29392ep) eoVar.instance;
                    epVar.f79681a &= -9;
                    epVar.f79685e = false;
                    ihVar.mo55373c((C29392ep) eoVar.build());
                }
            }
        }
        C58528ij f = ihVar.mo55486f();
        if (f.isEmpty()) {
            C29681u uVar = new C29681u();
            uVar.mo34799b(0);
            return C60856cj.m92900i(uVar.mo34798a());
        }
        C29211ir irVar = hrVar.f80297c;
        C58485gu u = f.mo55229u();
        C29045l.m53931c("%s removeFileGroups for %d groups", "MDDManager", Integer.valueOf(u.size()));
        return C60922j.m93044g(C60922j.m93045h(irVar.mo34632h(), C47810es.m84966f(new C29208io(irVar, u)), irVar.f79204n), C47810es.m84963c(new C29416fk(f)), hrVar.f80301g);
    }
}
