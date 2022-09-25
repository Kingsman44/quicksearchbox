package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a.C119982bi;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120783a;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120809b;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120814g;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120815h;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120887b;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.ak */
/* compiled from: PG */
public final class C120657ak {

    /* renamed from: a */
    public static final C59071e f335603a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.g.a.ak");

    /* renamed from: b */
    public final C120783a f335604b;

    /* renamed from: c */
    public final Executor f335605c;

    /* renamed from: d */
    public final C120686z f335606d;

    /* renamed from: e */
    public final Optional f335607e;

    /* renamed from: f */
    public final C120659am f335608f;

    /* renamed from: g */
    public final boolean f335609g;

    /* renamed from: h */
    public final boolean f335610h;

    /* renamed from: i */
    public final Optional f335611i;

    /* renamed from: j */
    public final AtomicBoolean f335612j = new AtomicBoolean(false);

    /* renamed from: k */
    public C60870cx f335613k;

    /* renamed from: l */
    public final C119982bi f335614l;

    /* renamed from: m */
    private final C68214a f335615m;

    /* renamed from: n */
    private final C33447g f335616n;

    public C120657ak(C68214a aVar, C120783a aVar2, Executor executor, C33447g gVar, C120686z zVar, Optional optional, C120659am amVar, C119982bi biVar, boolean z, boolean z2, Optional optional2) {
        this.f335615m = aVar;
        this.f335604b = aVar2;
        this.f335605c = new C60904dr(executor);
        this.f335616n = gVar;
        this.f335606d = zVar;
        this.f335607e = optional;
        this.f335608f = amVar;
        this.f335614l = biVar;
        this.f335609g = z;
        this.f335610h = z2;
        this.f335611i = optional2;
    }

    /* renamed from: a */
    public static C120811d m199808a(Iterable iterable, Optional optional, Optional optional2, boolean z) {
        C120814g gVar = (C120814g) C120815h.f335972f.createBuilder();
        String str = (String) C58557jl.m90130k(iterable, BuildConfig.FLAVOR);
        gVar.copyOnWrite();
        str.getClass();
        ((C120815h) gVar.instance).f335975b = str;
        gVar.copyOnWrite();
        C120815h hVar = (C120815h) gVar.instance;
        C62971cq cqVar = hVar.f335976c;
        if (!cqVar.mo58948c()) {
            hVar.f335976c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hVar.f335976c);
        Objects.requireNonNull(gVar);
        optional.ifPresent(new C120652af(gVar));
        optional2.ifPresent(new C120653ag(z, gVar));
        C120809b bVar = (C120809b) C120811d.f335965c.createBuilder();
        bVar.copyOnWrite();
        C120811d dVar = (C120811d) bVar.instance;
        C120815h hVar2 = (C120815h) gVar.build();
        hVar2.getClass();
        dVar.f335968b = hVar2;
        dVar.f335967a = 1;
        return (C120811d) bVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo104869b() {
        C60870cx b = ((C120887b) this.f335615m.mo27525b()).mo104701b(new C120655ai(this));
        this.f335616n.mo38849b(new C120649ac(b));
        C120650ad adVar = new C120650ad(this);
        return C60922j.m93045h(b, C47810es.m84966f(adVar), this.f335605c);
    }
}
