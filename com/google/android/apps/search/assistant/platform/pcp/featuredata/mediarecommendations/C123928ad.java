package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123913k;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130931bp;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130932bq;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130933br;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130934bs;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ad */
/* compiled from: PG */
public final class C123928ad implements C123913k {

    /* renamed from: a */
    public final C60950i f342288a;

    /* renamed from: b */
    public final C58974d f342289b;

    /* renamed from: c */
    public final C69464a f342290c;

    /* renamed from: d */
    public Optional f342291d = Optional.empty();

    /* renamed from: e */
    private final Context f342292e;

    /* renamed from: f */
    private final C130934bs f342293f;

    /* renamed from: g */
    private final Executor f342294g;

    /* renamed from: h */
    private final Executor f342295h;

    /* renamed from: i */
    private final C123935ak f342296i;

    public C123928ad(Context context, C60950i iVar, C123983t tVar, C130934bs bsVar, C123929ae aeVar, Executor executor, Executor executor2, C130603a aVar, C69464a aVar2) {
        this.f342292e = context;
        this.f342288a = iVar;
        this.f342293f = bsVar;
        this.f342294g = executor;
        this.f342295h = executor2;
        this.f342289b = aVar.mo109740b(this);
        this.f342290c = aVar2;
        C130931bp bpVar = C130931bp.PERIODIC;
        Objects.requireNonNull(tVar);
        this.f342296i = aeVar.mo106192a(bpVar, new C123925aa(tVar));
        C130931bp bpVar2 = C130931bp.MEDIA_PAUSED;
        Objects.requireNonNull(tVar);
        aeVar.mo106192a(bpVar2, new C123926ab(tVar));
    }

    /* renamed from: a */
    public final C60870cx mo106151a() {
        C47633f fVar;
        C130934bs bsVar = this.f342293f;
        C123935ak akVar = this.f342296i;
        if (this.f342291d.isPresent()) {
            fVar = C47633f.m84733g(C60856cj.m92900i(this.f342291d));
        } else {
            fVar = C47633f.m84733g(C123624c.m202993b(this.f342292e).mo106072b(C53306j.AMBIENT_ASSISTANT, C123777f.f341922a, C58485gu.m89846n(100008))).mo51515h(C123989z.f342457a, this.f342294g).mo51515h(new C123984u(this), this.f342295h);
        }
        C47633f i = fVar.mo51516i(new C123988y(this, akVar), this.f342294g);
        C123927ac acVar = new C123927ac(this);
        C60856cj.m92911t(i, C47810es.m84974n(acVar), this.f342295h);
        C130931bp bpVar = this.f342296i.f342325b;
        C69664n.m101061g(bpVar, "syncType");
        C130932bq bqVar = new C130932bq(bsVar, bpVar);
        C60856cj.m92911t(i, C47810es.m84974n(bqVar), bsVar.f358270d);
        C130933br brVar = C130933br.f358266a;
        return C60922j.m93045h(i, C47810es.m84966f(brVar), bsVar.f358269c);
    }
}
