package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28808cw;
import com.google.android.libraries.mdi.download.C28809cx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29674n;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63070h;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.h.b.k */
/* compiled from: PG */
public final /* synthetic */ class C29564k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29576w f80105a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f80106b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f80107c;

    public /* synthetic */ C29564k(C29576w wVar, C58485gu guVar, C58833ax axVar) {
        this.f80105a = wVar;
        this.f80106b = guVar;
        this.f80107c = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C29576w wVar = this.f80105a;
        C58485gu guVar = this.f80106b;
        C58833ax axVar = this.f80107c;
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C29574u uVar = (C29574u) guVar.get(i);
            C28708an a = uVar.mo34757a();
            C58495hd b = uVar.mo34758b();
            C29045l.m53931c("%s: Updating current active instance of group: %s", "GddDownloadedElementsListener", a.f77997b);
            if (b.isEmpty()) {
                C29045l.m53936h("%s: No inline files in received current active group %s, skipping import", "GddDownloadedElementsListener", a.f77997b);
                C28736bn bnVar = new C28736bn();
                bnVar.f78062a = C28737bo.GDD_CURRENT_ACTIVE_GROUP_HAS_NO_INLINE_FILE;
                cxVar = C60856cj.m92899h(bnVar.mo34334a());
            } else {
                C28808cw h = C28809cx.m53773h();
                h.mo34472c(a.f77997b);
                h.mo34471b(a.f78004i);
                h.mo34475f(a.f78005j);
                h.mo34473d(b);
                h.mo34474e(C29576w.m54563d(a.f78003h));
                if (axVar != null) {
                    C29674n nVar = (C29674n) h;
                    nVar.f80343b = axVar;
                    if ((a.f77996a & 8) != 0) {
                        C63070h hVar = a.f78000e;
                        if (hVar == null) {
                            hVar = C63070h.f170215c;
                        }
                        nVar.f80342a = C58833ax.m90834k(hVar);
                    }
                    C60870cx i2 = ((C29409fd) wVar.f80136b.mo6453a()).mo34720i(h.mo34470a());
                    C29570q qVar = new C29570q(a);
                    cxVar = C60846c.m92879h(i2, C28738bp.class, C47810es.m84966f(qVar), wVar.f80135a);
                } else {
                    throw new NullPointerException("Null accountOptional");
                }
            }
            arrayList.add(cxVar);
        }
        return C29672d.m54726a(arrayList).mo34824b(new C29568o(arrayList), wVar.f80135a);
    }
}
