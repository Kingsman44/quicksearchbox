package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28808cw;
import com.google.android.libraries.mdi.download.C28809cx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29674n;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.mdi.download.h.b.p */
/* compiled from: PG */
public final /* synthetic */ class C29569p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29576w f80114a;

    /* renamed from: b */
    public final /* synthetic */ C28708an f80115b;

    /* renamed from: c */
    public final /* synthetic */ C58495hd f80116c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f80117d;

    public /* synthetic */ C29569p(C29576w wVar, C28708an anVar, C58495hd hdVar, C58833ax axVar) {
        this.f80114a = wVar;
        this.f80115b = anVar;
        this.f80116c = hdVar;
        this.f80117d = axVar;
    }

    public final C60870cx apply(Object obj) {
        C29576w wVar = this.f80114a;
        C28708an anVar = this.f80115b;
        C58495hd hdVar = this.f80116c;
        C58833ax axVar = this.f80117d;
        if (!((Boolean) obj).booleanValue()) {
            C29045l.m53936h("%s: Failed to add next pending group %s, skipping import", "GddDownloadedElementsListener", anVar.f77997b);
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.GDD_FAIL_TO_ADD_NEXT_PENDING_GROUP;
            return C60856cj.m92899h(bnVar.mo34334a());
        } else if (hdVar.isEmpty()) {
            C29045l.m53931c("%s: No inline files in next pending group %s, skipping import", "GddDownloadedElementsListener", anVar.f77997b);
            return C60866ct.f164955a;
        } else {
            C28808cw h = C28809cx.m53773h();
            h.mo34472c(anVar.f77997b);
            h.mo34471b(anVar.f78004i);
            h.mo34475f(anVar.f78005j);
            h.mo34473d(hdVar);
            h.mo34474e(C29576w.m54563d(anVar.f78003h));
            C29674n nVar = (C29674n) h;
            nVar.f80343b = axVar;
            if ((anVar.f77996a & 8) != 0) {
                C63070h hVar = anVar.f78000e;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                nVar.f80342a = C58833ax.m90834k(hVar);
            }
            return ((C29409fd) wVar.f80136b.mo6453a()).mo34720i(h.mo34470a());
        }
    }
}
