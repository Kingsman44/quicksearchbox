package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i;

import android.content.Context;
import android.location.LocationManager;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8221h.C106561b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106587a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106588b;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131834f;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130839a;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130863d;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130882w;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a.C130842c;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a.C130855p;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a.C130857r;
import com.google.android.apps.search.assistant.verticals.ambient.p9933l.p9934a.C130885b;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131687a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131692b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53715bm;
import com.google.assistant.p4016z.C53723h;
import com.google.assistant.p4016z.C53732q;
import com.google.assistant.p4016z.C53734s;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63042fg;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.i.k */
/* compiled from: PG */
public final class C131755k implements C131692b {

    /* renamed from: a */
    public final C130863d f359914a;

    /* renamed from: b */
    public final C131834f f359915b;

    /* renamed from: c */
    public final C131749e f359916c;

    /* renamed from: d */
    public final ExecutorService f359917d;

    /* renamed from: e */
    public Optional f359918e = Optional.empty();

    /* renamed from: f */
    private final C58974d f359919f;

    /* renamed from: g */
    private final Context f359920g;

    /* renamed from: h */
    private final C130857r f359921h;

    /* renamed from: i */
    private final double f359922i;

    /* renamed from: j */
    private final double f359923j;

    /* renamed from: k */
    private final double f359924k;

    /* renamed from: l */
    private final C130885b f359925l;

    public C131755k(C130603a aVar, Context context, C130885b bVar, C130863d dVar, C130857r rVar, C131834f fVar, C131749e eVar, ExecutorService executorService, double d, double d2, double d3) {
        this.f359919f = aVar.mo109740b(this);
        this.f359920g = context;
        this.f359925l = bVar;
        this.f359914a = dVar;
        this.f359921h = rVar;
        this.f359915b = fVar;
        this.f359916c = eVar;
        this.f359917d = executorService;
        this.f359922i = d;
        this.f359923j = d2;
        this.f359924k = d3;
    }

    /* renamed from: a */
    public final C60870cx mo110298a(C58485gu guVar, long j) {
        if (this.f359918e.isEmpty()) {
            ((C58970a) ((C58970a) this.f359919f.mo56226d()).mo56372aa(39391)).mo56386p("Listener removed while the inference was running");
            return C60866ct.f164955a;
        }
        C106587a aVar = (C106587a) C106588b.f297185b.createBuilder();
        aVar.copyOnWrite();
        C106588b bVar = (C106588b) aVar.instance;
        bVar.mo95584a();
        C62947c.addAll((Iterable) guVar, (List) bVar.f297187a);
        return ((C131713d) this.f359918e.get()).mo110075a(new C131687a((C106588b) aVar.build(), j));
    }

    /* renamed from: b */
    public final C60870cx mo110268b(C131713d dVar) {
        this.f359918e = Optional.m71637of(dVar);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo110269c() {
        this.f359918e = Optional.empty();
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final C60870cx mo110270d(C53715bm bmVar, long j) {
        C60870cx cxVar;
        if (this.f359918e.isEmpty()) {
            return C60866ct.f164955a;
        }
        C131834f fVar = this.f359915b;
        C53732q qVar = (C53732q) C53734s.f141066i.createBuilder();
        C63042fg c = fVar.mo110336c();
        qVar.copyOnWrite();
        C53734s sVar = (C53734s) qVar.instance;
        c.getClass();
        sVar.f141069b = c;
        sVar.f141068a |= 1;
        C53734s sVar2 = (C53734s) qVar.build();
        if (((LocationManager) this.f359920g.getSystemService(LocationManager.class)).isLocationEnabled()) {
            int i = bmVar.f141023a;
            if (i != 14) {
                if (i == 3) {
                    C53738w wVar = ((C106561b) bmVar.f141024b).f297137a;
                    if (wVar == null) {
                        wVar = C53738w.f141079d;
                    }
                    cxVar = C60856cj.m92900i(wVar);
                } else {
                    cxVar = this.f359925l.mo109858a();
                }
                C60856cj.m92911t(cxVar, C47810es.m84974n(new C131754j(this, sVar2, j)), this.f359917d);
                return C60922j.m93045h(cxVar, C47810es.m84966f(new C131752h(this, sVar2, j)), this.f359917d);
            }
            C130882w j2 = C130883x.m213237j();
            C130839a aVar = (C130839a) j2;
            aVar.f358093h = Double.valueOf(this.f359922i);
            aVar.f358094i = Double.valueOf(this.f359923j);
            aVar.f358087b = Double.valueOf(this.f359924k);
            C130883x a = j2.mo109836a();
            C130857r rVar = this.f359921h;
            C60870cx h = C60922j.m93045h(rVar.f358128e.mo109858a(), C47810es.m84966f(new C130855p(rVar, (C53723h) bmVar.f141024b, a)), rVar.f358125b);
            C46459k.m82829b(C60922j.m93044g(h, C47810es.m84963c(new C130842c(rVar)), rVar.f358125b), "Failed to log location inference finished count", new Object[0]);
            return C60922j.m93045h(h, C47810es.m84966f(new C131751g(this, j)), this.f359917d);
        }
        this.f359915b.mo110339f(sVar2, 5, j);
        return ((C131713d) this.f359918e.get()).mo110075a(new C131687a(C106588b.f297185b, j));
    }
}
