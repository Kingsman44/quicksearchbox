package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.i */
/* compiled from: PG */
final class C14024i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60887da f42637a;

    /* renamed from: b */
    final /* synthetic */ C14027l f42638b;

    public C14024i(C14027l lVar, C60887da daVar) {
        this.f42638b = lVar;
        this.f42637a = daVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f42638b.mo21388b();
        ((C59052c) ((C59052c) ((C59052c) C14027l.f42639a.mo56225c()).mo56382g(th)).mo56372aa(45296)).mo56386p("Failed to get playMediaArgs, schedule next NewsContentFetcher");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C52176ia iaVar = (C52176ia) obj;
        int i = (iaVar.f136913a & 1024) != 0 ? iaVar.f136922j : 0;
        if (i < 2) {
            C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder(iaVar);
            hvVar.copyOnWrite();
            C52176ia iaVar2 = (C52176ia) hvVar.instance;
            iaVar2.f136913a |= 1024;
            iaVar2.f136922j = i + 1;
            C60856cj.m92911t(this.f42638b.f42641c.mo46039a(new C14022g((C52176ia) hvVar.build()), this.f42637a), C47810es.m84974n(new C14023h(this)), this.f42637a);
            return;
        }
        this.f42638b.mo21388b();
    }
}
