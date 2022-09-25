package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.h */
/* compiled from: PG */
public final /* synthetic */ class C95744h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95759w f268052a;

    /* renamed from: b */
    public final /* synthetic */ Semaphore f268053b;

    public /* synthetic */ C95744h(C95759w wVar, Semaphore semaphore) {
        this.f268052a = wVar;
        this.f268053b = semaphore;
    }

    public final void run() {
        C95759w wVar = this.f268052a;
        Semaphore semaphore = this.f268053b;
        try {
            if (!wVar.f268094e.mo89718u()) {
                C59104x c = C95759w.f268078a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) c).mo56372aa(15425)).mo56386p("startCache failed");
            }
            C59104x b = C95759w.f268078a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordStage2");
            ((C59052c) ((C59052c) b).mo56372aa(15422)).mo56386p("Bind To Search Service");
            wVar.f268094e.f268191e.mo88987b();
        } finally {
            C59104x b2 = C95759w.f268078a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HotwordStage2");
            ((C59052c) ((C59052c) b2).mo56372aa(15424)).mo56386p("Semaphore release");
            semaphore.release();
        }
    }
}
