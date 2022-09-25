package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.homescreen.searchbox.C136200c;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.q */
/* compiled from: PG */
final class C136195q implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136193o f370933a;

    public C136195q(C136193o oVar) {
        this.f370933a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C136193o oVar = this.f370933a;
        C69664n.m101061g((C136200c) bVar, "searchboxMicClickEvent");
        oVar.f370915j.mo111645f(107);
        C134744f a = oVar.mo112824a();
        if (a != null) {
            a.mo111956j(C134720e.VOICE_SEARCH_TAPPED);
        }
        oVar.f370927v.mo83702b(C89849ae.SEARCH_WIDGET_MIC_TAP);
        C139708c cVar = oVar.f370929x;
        cVar.f379734a.set(Optional.m71637of(C37182a.f97860bm));
        C37258g gVar = C37182a.f97860bm;
        C69664n.m101060f(gVar, "GOOGLEAPP_SEARCH_BOX_HOMESCREEN_MIC_TAP");
        cVar.mo115177d(gVar);
        return C47392e.m84229a(C139762c.m227232d());
    }
}
