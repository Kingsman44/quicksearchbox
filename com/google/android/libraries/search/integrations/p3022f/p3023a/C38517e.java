package com.google.android.libraries.search.integrations.p3022f.p3023a;

import androidx.work.WorkerParameters;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.apps.tiktok.contrib.work.C46577k;
import com.google.apps.tiktok.contrib.work.p3631b.C46542ba;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4572r.C60465a;
import com.google.common.p4552o.p4572r.C60466b;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.integrations.f.a.e */
/* compiled from: PG */
public final class C38517e implements C46577k {

    /* renamed from: a */
    public static final C59071e f101878a = C59071e.m91332i("com.google.android.libraries.search.integrations.f.a.e");

    /* renamed from: b */
    private final C38768q f101879b;

    /* renamed from: c */
    private final Executor f101880c;

    /* renamed from: d */
    private final boolean f101881d;

    /* renamed from: e */
    private final boolean f101882e;

    public C38517e(C38768q qVar, Executor executor, boolean z, boolean z2) {
        this.f101879b = qVar;
        this.f101880c = executor;
        this.f101881d = z;
        this.f101882e = z2;
    }

    /* renamed from: a */
    public final C60870cx mo41449a(C60870cx cxVar, WorkerParameters workerParameters, long j) {
        int a = C38521i.m67772a(C46542ba.m82977c(workerParameters));
        C60465a aVar = (C60465a) C60466b.f163636i.createBuilder();
        aVar.copyOnWrite();
        C60466b bVar = (C60466b) aVar.instance;
        bVar.f163640b = 6;
        bVar.f163639a |= 1;
        aVar.copyOnWrite();
        C60466b bVar2 = (C60466b) aVar.instance;
        bVar2.f163641c = a - 1;
        bVar2.f163639a |= 2;
        aVar.copyOnWrite();
        C60466b bVar3 = (C60466b) aVar.instance;
        bVar3.f163639a |= 32;
        bVar3.f163645g = j;
        aVar.copyOnWrite();
        C60466b bVar4 = (C60466b) aVar.instance;
        bVar4.f163640b = 6;
        bVar4.f163639a |= 1;
        mo41451c((C60466b) aVar.build());
        aVar.copyOnWrite();
        C60466b bVar5 = (C60466b) aVar.instance;
        bVar5.f163640b = 12;
        bVar5.f163639a |= 1;
        return C60922j.m93044g(C60846c.m92878g(cxVar, Throwable.class, C47810es.m84963c(new C38515c(this, (C60466b) aVar.build())), this.f101880c), C47810es.m84963c(C38516d.f101877a), this.f101880c);
    }

    /* renamed from: b */
    public final C60870cx mo41450b(WorkerParameters workerParameters) {
        int a = C38521i.m67772a(C46542ba.m82977c(workerParameters));
        if (this.f101882e) {
            C60465a aVar = (C60465a) C60466b.f163636i.createBuilder();
            aVar.copyOnWrite();
            C60466b bVar = (C60466b) aVar.instance;
            bVar.f163640b = 5;
            bVar.f163639a |= 1;
            aVar.copyOnWrite();
            C60466b bVar2 = (C60466b) aVar.instance;
            bVar2.f163641c = a - 1;
            bVar2.f163639a |= 2;
            boolean z = this.f101881d;
            aVar.copyOnWrite();
            C60466b bVar3 = (C60466b) aVar.instance;
            bVar3.f163639a |= 16;
            bVar3.f163644f = z;
            mo41451c((C60466b) aVar.build());
        }
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo41451c(C60466b bVar) {
        this.f101879b.mo41590b(C59743a.WORKMANAGER_EVENT, C60466b.f163637j, bVar);
    }
}
