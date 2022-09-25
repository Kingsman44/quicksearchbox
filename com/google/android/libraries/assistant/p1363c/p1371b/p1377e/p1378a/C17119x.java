package com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a;

import com.google.android.libraries.assistant.p1363c.p1371b.p1377e.C17120b;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p590as.p593b.p596b.C10784a;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10878f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.android.libraries.p590as.p593b.p596b.p607i.C10934m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.b.e.a.x */
/* compiled from: PG */
public final class C17119x implements C17120b {

    /* renamed from: a */
    public static final C58974d f49800a = C58974d.m91136j();

    /* renamed from: b */
    public static final Duration f49801b = Duration.ofMillis(500);

    /* renamed from: c */
    public final C68214a f49802c;

    /* renamed from: d */
    public final C60888db f49803d;

    /* renamed from: e */
    private final C17098c f49804e;

    public C17119x(C68214a aVar, C60888db dbVar, C17098c cVar) {
        this.f49802c = aVar;
        this.f49803d = dbVar;
        this.f49804e = cVar;
    }

    /* renamed from: a */
    public final Optional mo23190a(C28740br brVar) {
        String i = brVar.mo34350i();
        if (!C10934m.m25956d(i)) {
            return Optional.empty();
        }
        ((C58970a) ((C58970a) f49800a.mo56224b()).mo56372aa(42617)).mo56389s("downloadFileGroupInBatch - Group %s is supported by speech", i);
        C10882h a = C10934m.m25953a(i);
        C17098c cVar = this.f49804e;
        C10784a aVar = (C10784a) a;
        C60870cx f = cVar.f49765a.mo19304f(aVar.f35801a.toLanguageTag(), aVar.f35802b);
        C17097b bVar = C17097b.f49764a;
        C60870cx g = C60922j.m93044g(f, C47810es.m84963c(bVar), cVar.f49766b);
        C17114s sVar = new C17114s(i);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(sVar), this.f49803d);
        C17115t tVar = new C17115t(this);
        C60870cx h2 = C60922j.m93045h(g, C47810es.m84966f(tVar), this.f49803d);
        C17116u uVar = new C17116u(this, brVar);
        C60870cx h3 = C60922j.m93045h(h, C47810es.m84966f(uVar), this.f49803d);
        C17117v vVar = new C17117v(this, brVar);
        C60870cx h4 = C60922j.m93045h(h3, C47810es.m84966f(vVar), this.f49803d);
        C17118w wVar = new C17118w(this, h2);
        return Optional.m71637of(C60922j.m93045h(h4, C47810es.m84966f(wVar), this.f49803d));
    }

    /* renamed from: b */
    public final Optional mo23191b(C28807cv cvVar) {
        Optional ofNullable = Optional.ofNullable((String) cvVar.mo34464b().mo56111f());
        if (!((Boolean) ofNullable.map(C17113r.f49791a).orElse(false)).booleanValue()) {
            ofNullable.orElse("N/A");
            return Optional.empty();
        }
        ((C58970a) ((C58970a) f49800a.mo56224b()).mo56372aa(42619)).mo56389s("PendingGroupStatus - Group %s is supported by speech", ofNullable.orElse("N/A"));
        C10882h a = C10934m.m25953a((String) ofNullable.get());
        C10878f fVar = (C10878f) C10879g.f35958g.createBuilder();
        C10784a aVar = (C10784a) a;
        String languageTag = aVar.f35801a.toLanguageTag();
        fVar.copyOnWrite();
        C10879g gVar = (C10879g) fVar.instance;
        languageTag.getClass();
        gVar.f35960a |= 1;
        gVar.f35961b = languageTag;
        int i = aVar.f35802b;
        fVar.copyOnWrite();
        C10879g gVar2 = (C10879g) fVar.instance;
        gVar2.f35960a |= 2;
        gVar2.f35962c = (long) i;
        C10879g gVar3 = (C10879g) fVar.build();
        return Optional.m71637of(C60922j.m93044g(C60856cj.m92897f(this.f49804e.f49765a.mo19303e(gVar3), this.f49804e.f49765a.mo19302d(gVar3)), C47810es.m84963c(new C17109n(ofNullable)), this.f49803d));
    }

    /* renamed from: c */
    public final C60870cx mo23192c(C28740br brVar, Duration duration, int i) {
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(brVar.mo34350i());
        f.mo34448b(brVar.mo34344c());
        C60870cx f2 = ((C29409fd) this.f49802c.mo27525b()).mo34717f(f.mo34447a());
        C17110o oVar = new C17110o(this, i, brVar, duration);
        return C60922j.m93045h(f2, C47810es.m84966f(oVar), this.f49803d);
    }
}
