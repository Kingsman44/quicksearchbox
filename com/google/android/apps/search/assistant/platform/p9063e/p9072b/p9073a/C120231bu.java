package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.gsa.binaries.satin.app.ajk;
import com.google.android.apps.gsa.binaries.satin.app.ajm;
import com.google.android.apps.gsa.binaries.satin.app.aml;
import com.google.android.apps.gsa.binaries.satin.app.amn;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120810c;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.p4449cd.p4450a.C57934a;
import dagger.p5294a.C68225k;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bu */
/* compiled from: PG */
public final /* synthetic */ class C120231bu implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C120235by f334574a;

    /* renamed from: b */
    public final /* synthetic */ C120811d f334575b;

    public /* synthetic */ C120231bu(C120235by byVar, C120811d dVar) {
        this.f334574a = byVar;
        this.f334575b = dVar;
    }

    public final Object call() {
        amn amn;
        C120235by byVar = this.f334574a;
        C120811d dVar = this.f334575b;
        if (byVar.f334584b == null) {
            int b = C120810c.m200013b(dVar.f335967a);
            int i = b - 1;
            if (b != 0) {
                if (i == 0) {
                    ajk ajk = byVar.f334586d;
                    ajk.f196360e = byVar.f334588f.mo54628a("RecognitionPassthroughProcessingGraph");
                    C68225k.m98529a(ajk.f196360e, C57934a.class);
                    amn = new ajm(ajk.f196356a, ajk.f196357b, ajk.f196358c, ajk.f196359d, ajk.f196360e);
                } else if (i == 1) {
                    aml aml = byVar.f334587e;
                    aml.f197985e = byVar.f334588f.mo54628a("SingleShotProcessingGraph");
                    C68225k.m98529a(aml.f197985e, C57934a.class);
                    amn = new amn(aml.f197981a, aml.f197982b, aml.f197983c, aml.f197984d, aml.f197985e);
                } else {
                    throw new C120365ge(b);
                }
                byVar.f334584b = amn;
                byVar.mo104700a(byVar.f334584b);
            } else {
                throw null;
            }
        }
        C120252cj b2 = byVar.f334584b.mo104702b();
        b2.mo104709b(dVar);
        return new C120233bw(byVar, b2.mo104708a(new C120368j(dVar, false)), b2, dVar);
    }
}
