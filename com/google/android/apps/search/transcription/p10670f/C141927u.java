package com.google.android.apps.search.transcription.p10670f;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.transcription.f.u */
/* compiled from: PG */
public final /* synthetic */ class C141927u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141783ab f385121a;

    /* renamed from: b */
    public final /* synthetic */ C141924r f385122b;

    public /* synthetic */ C141927u(C141783ab abVar, C141924r rVar) {
        this.f385121a = abVar;
        this.f385122b = rVar;
    }

    public final void run() {
        C141783ab abVar = this.f385121a;
        C141924r rVar = this.f385122b;
        C141784ac acVar = abVar.f384769a;
        if (abVar == acVar.f384774e) {
            C60870cx cxVar = acVar.f384779j;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            if (rVar.f385109a == C141925s.ERROR) {
                acVar.mo116739d(rVar.f385111c);
            }
            if (!acVar.f384777h) {
                acVar.f384775f.add(rVar.f385109a);
                rVar.f385110b.run();
                C141925s sVar = rVar.f385109a;
                if (sVar == C141925s.FINISHED) {
                    if (!acVar.f384778i) {
                        acVar.f384772c.mo116736a();
                    }
                } else if (sVar != C141925s.ERROR) {
                    acVar.mo116737b();
                }
            }
        } else if (!acVar.f384777h) {
            acVar.f384776g.add(rVar);
            if (rVar.f385109a == C141925s.ERROR) {
                acVar.f384778i = true;
            }
        } else if (!acVar.f384775f.contains(rVar.f385109a) || rVar.f385109a == C141925s.PARTIAL_RESULTS) {
            rVar.f385110b.run();
        }
    }
}
