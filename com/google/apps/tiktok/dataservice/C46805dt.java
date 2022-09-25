package com.google.apps.tiktok.dataservice;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.apps.tiktok.dataservice.dt */
/* compiled from: PG */
public final /* synthetic */ class C46805dt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46815ec f122175a;

    /* renamed from: b */
    public final /* synthetic */ C46790dg f122176b;

    /* renamed from: c */
    public final /* synthetic */ C46762cf f122177c;

    public /* synthetic */ C46805dt(C46815ec ecVar, C46790dg dgVar, C46762cf cfVar) {
        this.f122175a = ecVar;
        this.f122176b = dgVar;
        this.f122177c = cfVar;
    }

    public final void run() {
        C46815ec ecVar = this.f122175a;
        C46790dg dgVar = this.f122176b;
        C46762cf cfVar = this.f122177c;
        if (ecVar.f122199j.mo50399c(cfVar) && !cfVar.f122116a.isCancelled()) {
            C19559g.m37304c();
            try {
                C60856cj.m92909r(cfVar.f122116a);
                if ((((C46683aa) dgVar).f121961a.mo18088c() instanceof C46770cn) && dgVar.mo50804h(ecVar.f122196g)) {
                    C46785db dbVar = ecVar.f122191b;
                    C46780cx cxVar = (C46780cx) dbVar;
                    cxVar.mo50789c(C60866ct.f164955a, ((C46683aa) dgVar).f121961a.mo18088c(), C46782cz.f122142a, C58836b.f156633a, ecVar.f122192c);
                } else if (!dgVar.mo50804h(ecVar.f122196g)) {
                    ecVar.mo50821c(dgVar);
                    C46785db dbVar2 = ecVar.f122191b;
                    C60870cx cxVar2 = C60866ct.f164955a;
                    Object c = ((C46683aa) dgVar).f121961a.mo18088c();
                    C46784da daVar = ecVar.f122194e;
                    C46780cx cxVar3 = (C46780cx) dbVar2;
                    cxVar3.mo50789c(cxVar2, c, C46782cz.f122142a, C58833ax.m90834k(daVar), ecVar.f122192c);
                } else if (ecVar.f122198i.mo50729e() && ecVar.mo50823g()) {
                    C58838bb.m90884s(ecVar.f122198i.mo50728d().mo56113h(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                    C46815ec.m83392e((C46685ac) ecVar.f122198i.mo50726b());
                    ecVar.f122198i = ecVar.f122198i.mo50808g(false);
                }
            } catch (ExecutionException e) {
                ecVar.mo50822f(e.getCause());
            } catch (Throwable th) {
                ecVar.f122193d.execute(new C46807dv(th));
            }
        }
    }
}
