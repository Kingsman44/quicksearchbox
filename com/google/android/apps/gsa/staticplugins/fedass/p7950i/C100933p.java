package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19415s;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19422z;
import com.google.android.libraries.assistant.trainingcache.p1618c.C19444e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63258c;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63259d;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63260e;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f;
import com.google.speech.p5228m.p5229a.C67260i;
import com.google.speech.p5228m.p5229a.C67261j;
import java.io.File;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.p */
/* compiled from: PG */
public final class C100933p implements C19415s {

    /* renamed from: a */
    public static final C59071e f281974a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.p");

    /* renamed from: b */
    public final C69464a f281975b;

    /* renamed from: c */
    private final C69464a f281976c;

    /* renamed from: d */
    private final Executor f281977d;

    /* renamed from: e */
    private final C60950i f281978e;

    public C100933p(C69464a aVar, C69464a aVar2, Executor executor, C60950i iVar) {
        this.f281975b = aVar;
        this.f281976c = aVar2;
        this.f281977d = executor;
        this.f281978e = iVar;
    }

    /* renamed from: c */
    public static Optional m167163c(C19422z zVar) {
        if (!zVar.mo24594i()) {
            return Optional.empty();
        }
        C67260i iVar = (C67260i) C67261j.f182827i.createBuilder();
        boolean j = zVar.mo24595j();
        iVar.copyOnWrite();
        C67261j jVar = (C67261j) iVar.instance;
        jVar.f182829a |= 4;
        jVar.f182832d = j;
        boolean h = zVar.mo24592h();
        iVar.copyOnWrite();
        C67261j jVar2 = (C67261j) iVar.instance;
        jVar2.f182829a |= 16;
        jVar2.f182834f = h;
        boolean isPresent = zVar.mo24587d().isPresent();
        iVar.copyOnWrite();
        C67261j jVar3 = (C67261j) iVar.instance;
        jVar3.f182829a |= 1;
        jVar3.f182830b = isPresent;
        boolean isPresent2 = zVar.mo24586c().isPresent();
        iVar.copyOnWrite();
        C67261j jVar4 = (C67261j) iVar.instance;
        jVar4.f182829a |= 2;
        jVar4.f182831c = isPresent2;
        return Optional.m71637of((C67261j) iVar.build());
    }

    /* renamed from: a */
    public final C60870cx mo24605a(String str) {
        return C47633f.m84733g(((C100719ab) this.f281976c.mo17428b()).mo92021e(str)).mo51515h(new C100932o(this), this.f281977d);
    }

    /* renamed from: b */
    public final C63259d mo92100b(C19422z zVar, boolean z, boolean z2) {
        C63260e a = C19444e.m37134a(3, (File) zVar.mo24587d().orElse(null), (File) zVar.mo24586c().orElse(null));
        C63258c cVar = (C63258c) C63259d.f170934n.createBuilder();
        boolean j = zVar.mo24595j();
        cVar.copyOnWrite();
        C63259d dVar = (C63259d) cVar.instance;
        dVar.f170936a |= 4;
        dVar.f170939d = j;
        boolean h = zVar.mo24592h();
        cVar.copyOnWrite();
        C63259d dVar2 = (C63259d) cVar.instance;
        dVar2.f170936a |= 8;
        dVar2.f170940e = h;
        boolean isPresent = zVar.mo24587d().isPresent();
        cVar.copyOnWrite();
        C63259d dVar3 = (C63259d) cVar.instance;
        dVar3.f170936a |= 64;
        dVar3.f170943h = isPresent;
        boolean isPresent2 = zVar.mo24586c().isPresent();
        cVar.copyOnWrite();
        C63259d dVar4 = (C63259d) cVar.instance;
        dVar4.f170936a |= 128;
        dVar4.f170944i = isPresent2;
        cVar.copyOnWrite();
        C63259d dVar5 = (C63259d) cVar.instance;
        dVar5.f170936a |= 2;
        dVar5.f170938c = z;
        long epochMilli = this.f281978e.mo57444a().toEpochMilli();
        cVar.copyOnWrite();
        C63259d dVar6 = (C63259d) cVar.instance;
        dVar6.f170936a |= 2048;
        dVar6.f170947l = epochMilli;
        cVar.copyOnWrite();
        C63259d dVar7 = (C63259d) cVar.instance;
        C63261f fVar = (C63261f) a.build();
        fVar.getClass();
        dVar7.f170937b = fVar;
        dVar7.f170936a |= 1;
        cVar.copyOnWrite();
        C63259d dVar8 = (C63259d) cVar.instance;
        dVar8.f170936a |= 512;
        dVar8.f170946k = z2;
        return (C63259d) cVar.build();
    }

    /* renamed from: d */
    public final void mo24606d(C19414r rVar, boolean z) {
        C19422z zVar = (C19422z) rVar.mo24571f();
        if (zVar != null) {
            ((C100918bc) this.f281975b.mo17428b()).mo92094b(mo92100b(zVar, true, z), m167163c(zVar));
        }
    }
}
