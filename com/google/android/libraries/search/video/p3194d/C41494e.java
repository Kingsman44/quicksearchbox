package com.google.android.libraries.search.video.p3194d;

import com.google.android.libraries.search.video.p3191a.C41446e;
import com.google.android.libraries.search.video.p3191a.C41447f;
import com.google.android.libraries.search.video.players.C41589t;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54794n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57149f;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.d.e */
/* compiled from: PG */
public final class C41494e implements C41490a {

    /* renamed from: a */
    public static final C59071e f108397a = C59071e.m91332i("com.google.android.libraries.search.video.d.e");

    /* renamed from: b */
    final C41446e f108398b;

    /* renamed from: c */
    boolean f108399c;

    /* renamed from: d */
    public int f108400d = 0;

    /* renamed from: e */
    private final C60887da f108401e;

    /* renamed from: f */
    private final C61531o f108402f;

    /* renamed from: g */
    private final C57143b f108403g;

    public C41494e(C41447f fVar, C60887da daVar, C61531o oVar, C57143b bVar) {
        this.f108401e = daVar;
        this.f108402f = oVar;
        this.f108403g = bVar;
        C41492c cVar = new C41492c(this, bVar, daVar);
        C57149f fVar2 = bVar.f152540k;
        Duration ofMillis = Duration.ofMillis((long) (fVar2 == null ? C57149f.f152565f : fVar2).f152568b);
        C60888db dbVar = (C60888db) fVar.f108256a.mo17428b();
        dbVar.getClass();
        ofMillis.getClass();
        this.f108398b = new C41446e(dbVar, cVar, ofMillis);
    }

    /* renamed from: a */
    public final void mo44011a() {
        mo44013b(this.f108403g, this.f108401e);
    }

    /* renamed from: b */
    public final void mo44013b(C57143b bVar, C60887da daVar) {
        C60870cx cxVar;
        C57149f fVar = this.f108403g.f152540k;
        if (fVar == null) {
            fVar = C57149f.f152565f;
        }
        if (!fVar.f152570d || !this.f108399c) {
            int i = this.f108400d;
            C57149f fVar2 = this.f108403g.f152540k;
            if (fVar2 == null) {
                fVar2 = C57149f.f152565f;
            }
            if (i > fVar2.f152571e) {
                C59104x b = f108397a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AdsReporting");
                ((C59052c) ((C59052c) b).mo56372aa(53901)).mo56386p("#shouldReportEngagedView(): EV ping failed too many times. Won't try again.");
                return;
            }
            C57149f fVar3 = bVar.f152540k;
            if (fVar3 == null) {
                fVar3 = C57149f.f152565f;
            }
            if (!fVar3.f152567a.isEmpty()) {
                C57149f fVar4 = bVar.f152540k;
                if (fVar4 == null) {
                    fVar4 = C57149f.f152565f;
                }
                String str = fVar4.f152567a;
                try {
                    C61531o oVar = this.f108402f;
                    C61363ae aeVar = new C61363ae();
                    str.getClass();
                    aeVar.f165930a = str;
                    cxVar = oVar.mo42484a(new C61365ag(aeVar));
                } catch (RuntimeException e) {
                    cxVar = C60856cj.m92899h(e);
                }
                C60856cj.m92911t(cxVar, C47810es.m84974n(new C41493d(this, bVar, daVar)), daVar);
                return;
            }
            C59104x d = f108397a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AdsReporting");
            ((C59052c) ((C59052c) d).mo56372aa(53900)).mo56386p("#maybeReportEngagedView(): engaged view url not provided.");
            return;
        }
        C59104x b2 = f108397a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AdsReporting");
        ((C59052c) ((C59052c) b2).mo56372aa(53902)).mo56386p("#shouldReportEngagedView(): Already reported EV. Won't report again.");
    }

    /* renamed from: c */
    public final void mo44014c(C41592w wVar, C41589t tVar) {
        C57149f fVar = this.f108403g.f152540k;
        if (fVar == null) {
            fVar = C57149f.f152565f;
        }
        if (fVar.f152568b > 0) {
            C41589t tVar2 = C41589t.INIT_START;
            int ordinal = tVar.ordinal();
            if (ordinal == 5) {
                C41446e eVar = this.f108398b;
                eVar.getClass();
                eVar.mo43978b();
            } else if (ordinal == 11 || ordinal == 8) {
                C57149f fVar2 = this.f108403g.f152540k;
                if (fVar2 == null) {
                    fVar2 = C57149f.f152565f;
                }
                if (!fVar2.f152569c || wVar.mo44082e().getSeconds() < Duration.ofMillis(this.f108403g.f152536g).getSeconds()) {
                    C41446e eVar2 = this.f108398b;
                    eVar2.getClass();
                    eVar2.mo43977a();
                    return;
                }
                C41446e eVar3 = this.f108398b;
                eVar3.getClass();
                eVar3.mo43979c();
                mo44013b(this.f108403g, this.f108401e);
            } else if (ordinal == 9) {
                C41446e eVar4 = this.f108398b;
                eVar4.getClass();
                eVar4.mo43979c();
            }
        }
    }

    /* renamed from: d */
    public final void mo44015d(C41592w wVar, int i) {
    }

    /* renamed from: e */
    public final void mo44016e(C54794n nVar) {
    }
}
