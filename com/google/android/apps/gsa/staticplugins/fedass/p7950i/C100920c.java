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

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.c */
/* compiled from: PG */
public final class C100920c implements C19415s {

    /* renamed from: a */
    public static final C59071e f281952a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.c");

    /* renamed from: b */
    public final C69464a f281953b;

    /* renamed from: c */
    private final C69464a f281954c;

    /* renamed from: d */
    private final Executor f281955d;

    /* renamed from: e */
    private final C60950i f281956e;

    public C100920c(C69464a aVar, C69464a aVar2, Executor executor, C60950i iVar) {
        this.f281953b = aVar;
        this.f281954c = aVar2;
        this.f281955d = executor;
        this.f281956e = iVar;
    }

    /* renamed from: c */
    public static Optional m167150c(C19422z zVar) {
        if (!zVar.mo24594i()) {
            return Optional.empty();
        }
        C67260i iVar = (C67260i) C67261j.f182827i.createBuilder();
        boolean j = zVar.mo24595j();
        iVar.copyOnWrite();
        C67261j jVar = (C67261j) iVar.instance;
        jVar.f182829a |= 4;
        jVar.f182832d = j;
        boolean g = zVar.mo24591g();
        iVar.copyOnWrite();
        C67261j jVar2 = (C67261j) iVar.instance;
        jVar2.f182829a |= 8;
        jVar2.f182833e = g;
        boolean isPresent = zVar.mo24587d().isPresent();
        iVar.copyOnWrite();
        C67261j jVar3 = (C67261j) iVar.instance;
        jVar3.f182829a |= 1;
        jVar3.f182830b = isPresent;
        boolean isPresent2 = zVar.mo24585b().isPresent();
        iVar.copyOnWrite();
        C67261j jVar4 = (C67261j) iVar.instance;
        jVar4.f182829a |= 2;
        jVar4.f182831c = isPresent2;
        return Optional.m71637of((C67261j) iVar.build());
    }

    /* renamed from: a */
    public final C60870cx mo24605a(String str) {
        return C47633f.m84733g(((C100719ab) this.f281954c.mo17428b()).mo92021e(str)).mo51515h(new C100915b(this), this.f281955d);
    }

    /* renamed from: b */
    public final C63259d mo92095b(C19422z zVar, boolean z, boolean z2) {
        C63260e a = C19444e.m37134a(2, (File) zVar.mo24587d().orElse(null), (File) zVar.mo24585b().orElse(null));
        C63258c cVar = (C63258c) C63259d.f170934n.createBuilder();
        boolean j = zVar.mo24595j();
        cVar.copyOnWrite();
        C63259d dVar = (C63259d) cVar.instance;
        dVar.f170936a |= 4;
        dVar.f170939d = j;
        boolean g = zVar.mo24591g();
        cVar.copyOnWrite();
        C63259d dVar2 = (C63259d) cVar.instance;
        dVar2.f170936a |= 8;
        dVar2.f170940e = g;
        boolean isPresent = zVar.mo24587d().isPresent();
        cVar.copyOnWrite();
        C63259d dVar3 = (C63259d) cVar.instance;
        dVar3.f170936a |= 64;
        dVar3.f170943h = isPresent;
        boolean isPresent2 = zVar.mo24585b().isPresent();
        cVar.copyOnWrite();
        C63259d dVar4 = (C63259d) cVar.instance;
        dVar4.f170936a |= 128;
        dVar4.f170944i = isPresent2;
        cVar.copyOnWrite();
        C63259d dVar5 = (C63259d) cVar.instance;
        dVar5.f170936a = 2 | dVar5.f170936a;
        dVar5.f170938c = z;
        long epochMilli = this.f281956e.mo57444a().toEpochMilli();
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
            ((C100918bc) this.f281953b.mo17428b()).mo92094b(mo92095b(zVar, true, z), m167150c(zVar));
        }
    }
}
