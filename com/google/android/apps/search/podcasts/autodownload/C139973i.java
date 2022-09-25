package com.google.android.apps.search.podcasts.autodownload;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97917g;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140007a;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60826bg;
import com.google.protos.p4757ac.p4758a.C63111j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.i */
/* compiled from: PG */
final class C139973i extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C139977m f380460a;

    /* renamed from: b */
    final /* synthetic */ Map f380461b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139973i(C139977m mVar, Map map) {
        super(1);
        this.f380460a = mVar;
        this.f380461b = map;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "episodeItems");
        C139977m mVar = this.f380460a;
        Map map = this.f380461b;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C140641b bVar = (C140641b) next;
            C140646b bVar2 = bVar.f381974a;
            if (bVar2 == null) {
                bVar2 = C140646b.f381993r;
            }
            if (bVar2.f382008n) {
                C97914d dVar = bVar.f381987n;
                if (dVar == null) {
                    dVar = C97914d.f273393j;
                }
                C97913c a = C97913c.m162190a(dVar.f273396b);
                if (a == null) {
                    a = C97913c.UNKNOWN;
                }
                if (a != C97913c.DOWNLOADED) {
                    C140644e eVar = bVar.f381984k;
                    if (eVar == null) {
                        eVar = C140644e.f381988d;
                    }
                    if (eVar.f381990a <= 0.0f) {
                        C140022ao aoVar = mVar.f380471g;
                        if (!aoVar.f380563f.contains(C140968d.m228923a(bVar))) {
                            long j = bVar.f381980g;
                            C140646b bVar3 = bVar.f381974a;
                            if (bVar3 == null) {
                                bVar3 = C140646b.f381993r;
                            }
                            C97929s sVar = (C97929s) map.get(bVar3.f381995a);
                            long j2 = 0;
                            if (sVar != null) {
                                C63111j jVar = sVar.f273463k;
                                if (jVar == null) {
                                    jVar = C63111j.f170348p;
                                }
                                if (jVar != null) {
                                    j2 = jVar.f170358i;
                                }
                            }
                            if (j >= j2) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
        }
        List<C140641b> V = C69540x.m100840V(arrayList);
        C59052c cVar = (C59052c) C139977m.f380465a.mo56224b();
        int size = V.size();
        cVar.mo56379ah(new C59094n(41502));
        cVar.mo56387q("Downloading items=[%d]", size);
        C140022ao aoVar2 = this.f380460a.f380471g;
        ArrayList arrayList2 = new ArrayList();
        for (C140641b a2 : V) {
            arrayList2.add(aoVar2.mo115396b(C140007a.m227660a(a2, C97917g.DOWNLOAD, true)));
        }
        return C47638k.m84750a(arrayList2).mo51520a(C139972h.f380459a, C60826bg.f164896a);
    }
}
