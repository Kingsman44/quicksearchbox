package com.google.android.apps.gsa.staticplugins.p7452bh;

import android.content.Context;
import com.google.android.apps.gsa.hotword.c.v;
import com.google.android.apps.gsa.hotword.c.z;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6560at.C84734a;
import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86798m;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2878f.C37188a;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bh.c */
/* compiled from: PG */
public final class C94595c extends C86734a implements C84734a {

    /* renamed from: a */
    final C86798m f264578a;

    /* renamed from: b */
    public final Context f264579b;

    /* renamed from: c */
    public final String f264580c;

    /* renamed from: f */
    public final C68214a f264581f;

    /* renamed from: g */
    public final C92518d f264582g;

    /* renamed from: h */
    public final ProxyIntentStarter f264583h;

    /* renamed from: i */
    public final C86124t f264584i;

    /* renamed from: j */
    private final C22871g f264585j;

    /* renamed from: k */
    private final C89994f f264586k;

    /* renamed from: l */
    private final C68214a f264587l;

    /* renamed from: m */
    private final C118561t f264588m;

    /* renamed from: n */
    private final C68214a f264589n;

    /* renamed from: o */
    private final C69464a f264590o;

    /* renamed from: p */
    private final z f264591p;

    /* renamed from: q */
    private final C68214a f264592q;

    /* renamed from: r */
    private final C37215b f264593r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94595c(Context context, String str, C86798m mVar, C22871g gVar, C89994f fVar, C68214a aVar, C118561t tVar, C68214a aVar2, C68214a aVar3, C69464a aVar4, z zVar, C92518d dVar, ProxyIntentStarter proxyIntentStarter, C86124t tVar2, C68214a aVar5, C37215b bVar) {
        super(C118575h.WORKER_HOTWORD_MODEL, "hotwordmodel");
        this.f264579b = context;
        this.f264580c = str;
        this.f264578a = mVar;
        this.f264585j = gVar;
        this.f264586k = fVar;
        this.f264587l = aVar;
        this.f264588m = tVar;
        this.f264581f = aVar2;
        this.f264589n = aVar3;
        this.f264590o = aVar4;
        this.f264591p = zVar;
        this.f264582g = dVar;
        this.f264583h = proxyIntentStarter;
        this.f264584i = tVar2;
        this.f264592q = aVar5;
        this.f264593r = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo78448a(long j) {
        return this.f264585j.mo28202b("handleDownloadComplete", new C94593a(this, j));
    }

    /* renamed from: b */
    public final void mo78449b() {
        mo78452e();
    }

    /* renamed from: c */
    public final void mo78450c() {
        C118561t tVar = this.f264588m;
        C118522by byVar = C118522by.UPDATE_HOTWORD_MODELS;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328824d = 1;
        agVar.f328821a |= 4;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
        this.f264578a.mo80469g(((C92504i) this.f264587l.mo27525b()).mo87261a(this.f264586k.mo83863Z(), this.f264586k.mo83827p()));
    }

    /* renamed from: d */
    public final void mo78451d() {
        ((C89859i) this.f264592q.mo27525b()).mo83702b(C89849ae.SILENT_ENROLLMENT_START_NEW_MODEL_DOWNLOAD);
        v vVar = (v) this.f264590o.mo17428b();
        vVar.l = true;
        vVar.h();
        this.f264593r.mo19974a(C37188a.f98366j);
        this.f264585j.mo28211k(this.f264591p.a(), "post silent enrollment tasks", new C94594b(this));
    }

    /* renamed from: e */
    public final void mo78452e() {
        this.f264578a.mo80487z();
        ((C84855a) this.f264589n.mo27525b()).mo78543k(2);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
