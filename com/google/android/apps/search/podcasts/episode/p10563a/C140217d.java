package com.google.android.apps.search.podcasts.episode.p10563a;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10588n.C140673b;
import com.google.android.apps.search.podcasts.p10601r.C140993o;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.common.base.C58833ax;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54152d;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54153e;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54154f;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54164p;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63111j;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.episode.a.d */
/* compiled from: PG */
final class C140217d implements Callable {

    /* renamed from: a */
    final /* synthetic */ C140219f f380943a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f380944b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f380945c;

    public C140217d(C140219f fVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f380943a = fVar;
        this.f380944b = cxVar;
        this.f380945c = cxVar2;
    }

    public final /* synthetic */ Object call() {
        C46688af b = this.f380943a.f380954g.mo50715b((C58833ax) C60856cj.m92909r(this.f380944b), C46788de.SAME_WEEK);
        Object r = C60856cj.m92909r(this.f380945c);
        C69664n.m101060f(r, "getDone(episodeDataFuture)");
        C140673b bVar = (C140673b) r;
        C140641b bVar2 = bVar.f382069b;
        C59308f fVar = null;
        if (bVar2 == null) {
            return this.f380943a.f380958k.get() ? C46688af.m83205b(new C140221h(bVar.f382068a, (C140641b) null, (C59308f) null), 0) : C46688af.f121976a;
        }
        this.f380943a.f380952e.mo115477h(bVar2);
        C140993o oVar = C140993o.AVAILABLE;
        if (b.f121977b.f121974b) {
            C54154f fVar2 = ((C54164p) b.mo50739f()).f142146a;
            if (fVar2 == null) {
                fVar2 = C54154f.f142115b;
            }
            C62971cq cqVar = fVar2.f142117a;
            C69664n.m101060f(cqVar, "cacheResult.data.result.itemsList");
            if (!cqVar.isEmpty()) {
                C54154f fVar3 = ((C54164p) b.mo50739f()).f142146a;
                if (fVar3 == null) {
                    fVar3 = C54154f.f142115b;
                }
                int a = C54152d.m87192a(((C54153e) fVar3.f142117a.get(0)).f142112a);
                if (a != 0 && a == 2) {
                    C54154f fVar4 = ((C54164p) b.mo50739f()).f142146a;
                    if (fVar4 == null) {
                        fVar4 = C54154f.f142115b;
                    }
                    C63111j jVar = ((C54153e) fVar4.f142117a.get(0)).f142113b;
                    if (jVar == null) {
                        jVar = C63111j.f170348p;
                    }
                    fVar = jVar.f170362m;
                    if (fVar == null) {
                        fVar = C59308f.f157472b;
                    }
                }
            }
        }
        C140221h hVar = new C140221h(oVar, bVar2, fVar);
        if (this.f380943a.f380958k.get()) {
            return C46688af.m83205b(hVar, 0);
        }
        return C46688af.m83206c(hVar);
    }
}
