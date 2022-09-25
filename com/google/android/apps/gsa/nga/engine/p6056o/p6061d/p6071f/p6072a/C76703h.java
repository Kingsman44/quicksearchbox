package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6071f.p6072a;

import com.google.android.apps.gsa.nga.engine.ai.ad;
import com.google.android.apps.gsa.nga.engine.ai.k;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76627c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6071f.C76695a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h.C76719b;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76741a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76746f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76758r;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.f.a.h */
/* compiled from: PG */
public final class C76703h implements C76695a {

    /* renamed from: a */
    public final C76719b f212010a;

    /* renamed from: b */
    public final C76758r f212011b;

    /* renamed from: c */
    public final C79853ak f212012c;

    /* renamed from: d */
    public final k f212013d;

    /* renamed from: e */
    public final C76746f f212014e;

    /* renamed from: f */
    public final C47770dh f212015f;

    /* renamed from: g */
    public final C76627c f212016g;

    /* renamed from: h */
    private final C76741a f212017h;

    /* renamed from: i */
    private final ad f212018i;

    public C76703h(C76719b bVar, C76758r rVar, C76627c cVar, C79853ak akVar, k kVar, C76741a aVar, C76746f fVar, C47770dh dhVar, ad adVar) {
        this.f212010a = bVar;
        this.f212011b = rVar;
        this.f212016g = cVar;
        this.f212012c = akVar;
        this.f212013d = kVar;
        this.f212017h = aVar;
        this.f212014e = fVar;
        this.f212015f = dhVar;
        this.f212018i = adVar;
    }

    /* renamed from: c */
    private final C60870cx m123307c(C52091ex exVar, C74965n nVar) {
        return C60922j.m93044g(this.f212018i.a(nVar), new C76697b(this, exVar, nVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo72296a(String str, C61752n nVar, C74965n nVar2, C52091ex exVar) {
        C60870cx h = C60922j.m93045h(m123307c(exVar, nVar2), new C76699d(this, nVar2, str, nVar), C60826bg.f164896a);
        this.f212017h.mo72316a(h, "callIGDP", Optional.m71637of(nVar2.mo71336k()));
        return h;
    }

    /* renamed from: b */
    public final C60870cx mo72297b(String str, C74965n nVar, C52091ex exVar) {
        C60870cx h = C60922j.m93045h(m123307c(exVar, nVar), new C76702g(this, nVar, str), C60826bg.f164896a);
        this.f212017h.mo72316a(h, "getIntent", Optional.m71637of(nVar.mo71336k()));
        return h;
    }
}
