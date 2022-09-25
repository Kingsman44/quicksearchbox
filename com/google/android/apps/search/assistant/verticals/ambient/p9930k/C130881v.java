package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

import com.google.android.apps.search.assistant.verticals.ambient.p9946p.C131116a;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.C131123b;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9947a.C131117a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p4016z.C53738w;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4479cg.C58079k;
import java.util.concurrent.Executor;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.v */
/* compiled from: PG */
public final class C130881v implements C130864e {

    /* renamed from: a */
    public static final Collector f358160a = Collector.CC.m71774of(C130879t.f358158a, C130880u.f358159a, C130866g.f358141a, C130867h.f358142a, new Collector.Characteristics[0]);

    /* renamed from: b */
    public final C131123b f358161b;

    /* renamed from: c */
    public final C131116a f358162c;

    /* renamed from: d */
    public final C131117a f358163d;

    public C130881v(C131123b bVar, C131116a aVar, C131117a aVar2) {
        this.f358161b = bVar;
        this.f358162c = aVar;
        this.f358163d = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo109856a(C53738w wVar, C130883x xVar, Executor executor) {
        C131123b bVar = this.f358161b;
        C58079k kVar = wVar.f141082b;
        if (kVar == null) {
            kVar = C58079k.f155250c;
        }
        return C47633f.m84733g(C47633f.m84733g(bVar.mo110083b(kVar)).mo51516i(new C130868i(this, xVar), executor)).mo51516i(new C130869j(this, wVar, xVar), executor).mo51515h(new C130870k(xVar), executor).mo51516i(new C130871l(this, executor), executor);
    }
}
