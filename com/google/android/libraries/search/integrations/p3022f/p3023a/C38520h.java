package com.google.android.libraries.search.integrations.p3022f.p3023a;

import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.apps.tiktok.contrib.work.C46581o;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.contrib.work.p3631b.C46542ba;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4572r.C60465a;
import com.google.common.p4552o.p4572r.C60466b;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.integrations.f.a.h */
/* compiled from: PG */
public final class C38520h implements C46581o {

    /* renamed from: a */
    public static final C59071e f101886a = C59071e.m91332i("com.google.android.libraries.search.integrations.f.a.h");

    /* renamed from: b */
    private final C38768q f101887b;

    /* renamed from: c */
    private final Executor f101888c;

    /* renamed from: d */
    private final boolean f101889d;

    public C38520h(C38768q qVar, Executor executor, boolean z) {
        this.f101887b = qVar;
        this.f101888c = executor;
        this.f101889d = z;
    }

    /* renamed from: e */
    private final C60870cx m67767e(C60870cx cxVar, C60466b bVar) {
        C38518f fVar = new C38518f(this, bVar);
        return C60922j.m93044g(C60846c.m92878g(cxVar, Throwable.class, C47810es.m84963c(fVar), this.f101888c), C47810es.m84963c(C38519g.f101885a), this.f101888c);
    }

    /* renamed from: a */
    public final C60870cx mo41452a(C60870cx cxVar, String str) {
        C60465a aVar = (C60465a) C60466b.f163636i.createBuilder();
        aVar.copyOnWrite();
        C60466b bVar = (C60466b) aVar.instance;
        bVar.f163640b = 3;
        bVar.f163639a |= 1;
        aVar.copyOnWrite();
        C60466b bVar2 = (C60466b) aVar.instance;
        str.getClass();
        bVar2.f163639a |= 64;
        bVar2.f163646h = str;
        mo41454c((C60466b) aVar.build());
        C60465a aVar2 = (C60465a) C60466b.f163636i.createBuilder();
        aVar2.copyOnWrite();
        C60466b bVar3 = (C60466b) aVar2.instance;
        bVar3.f163640b = 9;
        bVar3.f163639a |= 1;
        aVar2.copyOnWrite();
        C60466b bVar4 = (C60466b) aVar2.instance;
        str.getClass();
        bVar4.f163639a |= 64;
        bVar4.f163646h = str;
        return m67767e(cxVar, (C60466b) aVar2.build());
    }

    /* renamed from: b */
    public final C60870cx mo41453b(C60870cx cxVar, C46586t tVar) {
        int a = C38521i.m67772a(C46542ba.m82978d(tVar));
        tVar.mo50570f().mo56113h();
        C60465a aVar = (C60465a) C60466b.f163636i.createBuilder();
        aVar.copyOnWrite();
        C60466b bVar = (C60466b) aVar.instance;
        bVar.f163641c = a - 1;
        bVar.f163639a |= 2;
        boolean z = this.f101889d;
        aVar.copyOnWrite();
        C60466b bVar2 = (C60466b) aVar.instance;
        bVar2.f163639a |= 16;
        bVar2.f163644f = z;
        boolean h = tVar.mo50570f().mo56113h();
        aVar.copyOnWrite();
        C60466b bVar3 = (C60466b) aVar.instance;
        bVar3.f163639a |= 4;
        bVar3.f163642d = h;
        boolean h2 = tVar.mo50571g().mo56113h();
        aVar.copyOnWrite();
        C60466b bVar4 = (C60466b) aVar.instance;
        bVar4.f163639a |= 8;
        bVar4.f163643e = h2;
        aVar.copyOnWrite();
        C60466b bVar5 = (C60466b) aVar.instance;
        bVar5.f163640b = 1;
        bVar5.f163639a |= 1;
        mo41454c((C60466b) aVar.build());
        aVar.copyOnWrite();
        C60466b bVar6 = (C60466b) aVar.instance;
        bVar6.f163640b = 7;
        bVar6.f163639a = 1 | bVar6.f163639a;
        return m67767e(cxVar, (C60466b) aVar.build());
    }

    /* renamed from: c */
    public final void mo41454c(C60466b bVar) {
        this.f101887b.mo41590b(C59743a.WORKMANAGER_EVENT, C60466b.f163637j, bVar);
    }

    /* renamed from: d */
    public final C60870cx mo41455d(C60870cx cxVar) {
        C60465a aVar = (C60465a) C60466b.f163636i.createBuilder();
        aVar.copyOnWrite();
        C60466b bVar = (C60466b) aVar.instance;
        bVar.f163640b = 2;
        bVar.f163639a |= 1;
        mo41454c((C60466b) aVar.build());
        C60465a aVar2 = (C60465a) C60466b.f163636i.createBuilder();
        aVar2.copyOnWrite();
        C60466b bVar2 = (C60466b) aVar2.instance;
        bVar2.f163640b = 8;
        bVar2.f163639a |= 1;
        return m67767e(cxVar, (C60466b) aVar2.build());
    }
}
