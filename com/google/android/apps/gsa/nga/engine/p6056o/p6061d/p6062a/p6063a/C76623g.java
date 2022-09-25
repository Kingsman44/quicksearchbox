package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6062a.p6063a;

import com.google.android.apps.gsa.nga.engine.p5903ai.C74846w;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6062a.C76616a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h.C76719b;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76741a;
import com.google.android.apps.gsa.nga.shared.p6311ah.C80631b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122381a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122408b;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import p3186j$.time.ZoneId;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.a.a.g */
/* compiled from: PG */
public final class C76623g implements C76616a {

    /* renamed from: a */
    public final C47770dh f211872a;

    /* renamed from: b */
    public final C76092h f211873b;

    /* renamed from: c */
    private final C76719b f211874c;

    /* renamed from: d */
    private final C69464a f211875d;

    /* renamed from: e */
    private final C76741a f211876e;

    /* renamed from: f */
    private final C74846w f211877f;

    public C76623g(C76719b bVar, C74846w wVar, C69464a aVar, C76741a aVar2, C47770dh dhVar, C76092h hVar) {
        this.f211874c = bVar;
        this.f211877f = wVar;
        this.f211875d = aVar;
        this.f211876e = aVar2;
        this.f211872a = dhVar;
        this.f211873b = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo72283a(String str, Optional optional, Optional optional2, Optional optional3) {
        C122381a aVar = (C122381a) C122408b.f339356h.createBuilder();
        aVar.copyOnWrite();
        str.getClass();
        ((C122408b) aVar.instance).f339359b = str;
        String languageTag = this.f211873b.mo72021b().mo72039e().toLanguageTag();
        aVar.copyOnWrite();
        languageTag.getClass();
        ((C122408b) aVar.instance).f339360c = languageTag;
        C80631b bVar = (C80631b) this.f211875d.mo17428b();
        String id = ZoneId.systemDefault().getId();
        aVar.copyOnWrite();
        id.getClass();
        ((C122408b) aVar.instance).f339361d = id;
        C63179l a = this.f211877f.mo71232a();
        aVar.copyOnWrite();
        a.getClass();
        ((C122408b) aVar.instance).f339362e = a;
        optional2.ifPresent(new C76617a(aVar));
        Optional map = optional.map(C76618b.f211865a);
        Objects.requireNonNull(aVar);
        map.ifPresent(new C76619c(aVar));
        C60870cx g = C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(this.f211874c.mo72312c()), new C76620d(this, aVar), C60826bg.f164896a), C76621e.f211869a, C60826bg.f164896a);
        this.f211876e.mo72316a(g, "annotation", optional3);
        return g;
    }

    /* renamed from: b */
    public final C60870cx mo72284b(String str) {
        C60870cx h = C60922j.m93045h(this.f211874c.mo72312c(), new C76622f(this, str), C60826bg.f164896a);
        this.f211876e.mo72316a(h, "mid", Optional.empty());
        return h;
    }
}
