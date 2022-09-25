package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124236c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.C124237a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.C124251b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124266a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124272a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.t */
/* compiled from: PG */
public final class C124234t implements C124272a, C124237a, C124266a, C124236c {

    /* renamed from: a */
    public static final C59071e f343022a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.t");

    /* renamed from: b */
    public static final C58485gu f343023b = C58485gu.m89849q("alarm", "timer", "media", "call");

    /* renamed from: c */
    public final C124294b f343024c;

    /* renamed from: d */
    public final C124251b f343025d;

    /* renamed from: e */
    public final Executor f343026e;

    /* renamed from: f */
    public final Executor f343027f;

    /* renamed from: g */
    public final CopyOnWriteArraySet f343028g = new CopyOnWriteArraySet();

    /* renamed from: h */
    public final CopyOnWriteArraySet f343029h = new CopyOnWriteArraySet();

    /* renamed from: i */
    public final C69464a f343030i;

    /* renamed from: j */
    public final C47632e f343031j = new C47632e();

    /* renamed from: k */
    String f343032k;

    /* renamed from: l */
    private final C124219e f343033l;

    /* renamed from: m */
    private final AtomicInteger f343034m = new AtomicInteger();

    public C124234t(C124219e eVar, C124294b bVar, C124251b bVar2, Executor executor, C69464a aVar) {
        this.f343033l = eVar;
        this.f343024c = bVar;
        this.f343025d = bVar2;
        this.f343026e = executor;
        this.f343027f = new C60904dr(executor);
        this.f343030i = aVar;
        bVar.mo106365f(this);
        bVar2.mo106349d(this);
    }

    /* renamed from: a */
    public final C70862aj mo106338a(C70862aj ajVar, AccountId accountId) {
        String format = String.format(Locale.ENGLISH, "connection-%05d", new Object[]{Integer.valueOf(this.f343034m.getAndIncrement())});
        C124219e eVar = this.f343033l;
        C17602l lVar = new C17602l(this.f343026e, ajVar);
        C124226l lVar2 = new C124226l(this, format);
        C124227m mVar = new C124227m(this);
        format.getClass();
        accountId.getClass();
        Executor executor = (Executor) eVar.f343001a.mo17428b();
        executor.getClass();
        C124218d dVar = new C124218d(format, accountId, lVar, lVar2, mVar, executor);
        this.f343028g.add(dVar);
        mo106341d();
        ((C59052c) ((C59052c) f343022a.mo56224b()).mo56372aa(36125)).mo56352E("New connection(%s) added, total(%d).", dVar.f342992a, this.f343028g.size());
        return C47686k.m84827a(dVar);
    }

    /* renamed from: b */
    public final C60870cx mo106339b(String str, C58485gu guVar) {
        C60870cx c = this.f343025d.mo106348c(str, guVar);
        C124229o oVar = new C124229o(this, guVar);
        return C60922j.m93045h(c, C47810es.m84966f(oVar), this.f343026e);
    }

    /* renamed from: c */
    public final C60870cx mo106340c(Set set) {
        if (Collection.EL.stream(set).anyMatch(C124228n.f343014a)) {
            return this.f343024c.mo106362c();
        }
        return this.f343024c.mo106363d();
    }

    /* renamed from: d */
    public final void mo106341d() {
        ((C59052c) ((C59052c) f343022a.mo56224b()).mo56372aa(36126)).mo56386p("TorusCoordinator receives connection status update.");
        C46459k.m82829b(this.f343031j.mo51512b(new C124220f(this), this.f343027f), "TorusConnectionManager failed to handle connection status change.", new Object[0]);
    }

    /* renamed from: e */
    public final void mo106342e(C48160h hVar) {
        this.f343027f.execute(C47810es.m84977q(new C124224j(this, hVar)));
    }
}
