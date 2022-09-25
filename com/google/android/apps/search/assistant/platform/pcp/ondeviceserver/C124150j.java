package com.google.android.apps.search.assistant.platform.pcp.ondeviceserver;

import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123716aj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123717ak;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123718al;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123735bb;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123739bf;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62961ch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.j */
/* compiled from: PG */
public final class C124150j extends C123739bf {

    /* renamed from: a */
    public static final C59071e f342846a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.j");

    /* renamed from: b */
    private final Executor f342847b;

    /* renamed from: c */
    private final C124142b f342848c;

    public C124150j(ExecutorService executorService, C124142b bVar) {
        this.f342847b = executorService;
        this.f342848c = bVar;
    }

    /* renamed from: b */
    public final void mo106117b(C123735bb bbVar, C70862aj ajVar) {
        C124142b bVar = this.f342848c;
        C53306j a = C53306j.m86809a(bbVar.f341784a);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        C62961ch chVar = bbVar.f341785b;
        boolean z = bbVar.f341786c;
        C124147g gVar = new C124147g(ajVar);
        C60856cj.m92911t((C60870cx) bVar.f342836a.map(new C124141a(a, chVar, z)).orElse(C60856cj.m92900i(C123746bm.f341818b)), C47810es.m84974n(gVar), this.f342847b);
    }

    /* renamed from: c */
    public final void mo106118c(C123735bb bbVar, C70862aj ajVar) {
        mo106117b(bbVar, ajVar);
    }

    /* renamed from: d */
    public final void mo106119d(C123716aj ajVar, C70862aj ajVar2) {
        boolean z;
        C53306j a = C53306j.m86809a(ajVar.f341729a);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        String str = ajVar.f341730b;
        C123717ak akVar = (C123717ak) C123718al.f341732c.createBuilder();
        C124142b bVar = this.f342848c;
        C124148h hVar = new C124148h(a, str);
        if (bVar.f342836a.isPresent()) {
            ((C123587c) bVar.f342836a.get()).mo106044d(hVar);
            z = true;
        } else {
            z = false;
        }
        akVar.copyOnWrite();
        C123718al alVar = (C123718al) akVar.instance;
        alVar.f341734a = 1 | alVar.f341734a;
        alVar.f341735b = z;
        ajVar2.mo20123c((C123718al) akVar.build());
        ajVar2.mo20121a();
    }

    /* renamed from: e */
    public final void mo106120e(C123716aj ajVar, C70862aj ajVar2) {
        boolean z;
        C53306j a = C53306j.m86809a(ajVar.f341729a);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        String str = ajVar.f341730b;
        C123717ak akVar = (C123717ak) C123718al.f341732c.createBuilder();
        C124142b bVar = this.f342848c;
        C124149i iVar = new C124149i(a, str);
        if (bVar.f342836a.isPresent()) {
            ((C123587c) bVar.f342836a.get()).mo106045e(iVar);
            z = true;
        } else {
            z = false;
        }
        akVar.copyOnWrite();
        C123718al alVar = (C123718al) akVar.instance;
        alVar.f341734a = 1 | alVar.f341734a;
        alVar.f341735b = z;
        ajVar2.mo20123c((C123718al) akVar.build());
        ajVar2.mo20121a();
    }
}
