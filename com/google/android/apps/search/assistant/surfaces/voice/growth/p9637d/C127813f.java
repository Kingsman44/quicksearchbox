package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9638a.p9639a.C127737a;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127764b;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127786c;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129446a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129457d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129459f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g;
import com.google.android.libraries.search.assistant.p2714o.p2715a.C34907h;
import com.google.android.libraries.search.assistant.p2714o.p2715a.C34913n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.f */
/* compiled from: PG */
public final class C127813f implements C129446a {

    /* renamed from: a */
    public static final C59071e f351787a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.d.f");

    /* renamed from: b */
    public volatile Optional f351788b = Optional.empty();

    /* renamed from: c */
    private final Executor f351789c;

    /* renamed from: d */
    private final C127737a f351790d;

    public C127813f(C127737a aVar, Executor executor) {
        this.f351790d = aVar;
        this.f351789c = executor;
    }

    /* renamed from: a */
    public final C129460g mo108219a() {
        C127743d dVar;
        Optional optional = this.f351788b;
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) f351787a.mo56226d()).mo56372aa(37660)).mo56386p("FreSuggestion is null when Feature.content() is called. Did you forget to call hasContentToShow()?");
            dVar = C127743d.f351634g;
        } else {
            dVar = (C127743d) optional.get();
        }
        C129457d dVar2 = (C129457d) C129460g.f355452c.createBuilder();
        C129459f fVar = C129459f.TRY_SAYING;
        dVar2.copyOnWrite();
        C129460g gVar = (C129460g) dVar2.instance;
        gVar.f355455b = fVar.f355451d;
        gVar.f355454a |= 1;
        C62940bt btVar = C127810c.f351780d;
        C127738b bVar = (C127738b) C127810c.f351779c.createBuilder();
        bVar.copyOnWrite();
        C127810c cVar = (C127810c) bVar.instance;
        dVar.getClass();
        cVar.f351783b = dVar;
        cVar.f351782a |= 1;
        dVar2.mo58885m(btVar, (C127810c) bVar.build());
        return (C129460g) dVar2.build();
    }

    /* renamed from: b */
    public final C60870cx mo108220b() {
        ((C59052c) ((C59052c) f351787a.mo56224b()).mo56372aa(37661)).mo56386p("Check if try saying feature has content to show");
        C127786c cVar = this.f351790d.f351628a;
        C34913n nVar = (C34913n) cVar.f351744b;
        C34907h hVar = new C34907h(nVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(hVar), nVar.f92571f);
        C60870cx f = ((C34913n) cVar.f351744b).mo39623a();
        C60870cx b = C47638k.m84753d(m, f).mo51521b(new C127764b(cVar, m, f), cVar.f351746d);
        C127812e eVar = new C127812e(this);
        return C60922j.m93044g(b, C47810es.m84963c(eVar), this.f351789c);
    }

    public final String toString() {
        return String.format("TrySayingFeature{suggestion=%s}", new Object[]{this.f351788b});
    }
}
