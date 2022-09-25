package com.google.android.apps.search.podcasts.p10566g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10549a.C139962g;
import com.google.android.apps.search.podcasts.p10588n.C140667ap;
import com.google.android.apps.search.podcasts.p10588n.C140672au;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140983d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54299ac;
import com.google.p4017at.p4082j.p4083a.C54391cq;
import com.google.p4017at.p4082j.p4083a.C54392cr;
import com.google.p4017at.p4082j.p4083a.C54452q;
import com.google.p4017at.p4082j.p4083a.C54453r;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.g.g */
/* compiled from: PG */
public final class C140379g {

    /* renamed from: a */
    public static final C59071e f381331a = C59071e.m91331h();

    /* renamed from: b */
    private final C140672au f381332b;

    /* renamed from: c */
    private final C139958c f381333c;

    /* renamed from: d */
    private final C139962g f381334d;

    public C140379g(C140672au auVar, C139958c cVar, C139962g gVar) {
        this.f381332b = auVar;
        this.f381333c = cVar;
        this.f381334d = gVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C60870cx m228068a(C140379g gVar, C54297aa aaVar, C97925o oVar, C140983d dVar, C140332a aVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        C60870cx cxVar;
        boolean z5;
        ArrayList arrayList;
        C140379g gVar2 = gVar;
        C54297aa aaVar2 = aaVar;
        C97925o oVar2 = oVar;
        int i2 = i;
        C140332a aVar2 = (i2 & 8) != 0 ? C140332a.NONE : aVar;
        int i3 = 1;
        boolean z6 = ((i2 & 16) == 0) & z;
        boolean z7 = ((i2 & 32) == 0) & z2;
        boolean z8 = ((i2 & 64) == 0) & z3;
        boolean z9 = ((i2 & 128) == 0) & z4;
        C69664n.m101061g(aaVar2, "feed");
        C69664n.m101061g(oVar2, "episodeItemVe");
        C69664n.m101061g(aVar2, "filterType");
        C62971cq<C54299ac> cqVar = aaVar2.f142652a;
        C69664n.m101060f(cqVar, "feed.feedItemsList");
        ArrayList arrayList2 = new ArrayList();
        for (C54299ac acVar : cqVar) {
            C69664n.m101060f(acVar, "it");
            int i4 = acVar.f142655a;
            if (i4 == 3) {
                cxVar = C140989k.m228944b(gVar2.f381332b.mo115824a(C140667ap.LAST_ACTIVITY), C140378f.f381330a);
            } else {
                int i5 = 2;
                if (i4 == i3) {
                    C54453r rVar = (C54453r) acVar.f142656b;
                    C69664n.m101060f(rVar, "feedItem.episodeGroup");
                    int i6 = rVar.f142986b;
                    int a = C54452q.m87382a(i6);
                    if (a != 0 && a == 2) {
                        C62971cq cqVar2 = rVar.f142987c;
                        C69664n.m101060f(cqVar2, "episodeGroup.episodesList");
                        cxVar = C140989k.m228944b(gVar2.f381333c.mo115362b(cqVar2), new C140365b(aVar2, oVar2, z6));
                    } else {
                        C59052c cVar = (C59052c) f381331a.mo56224b();
                        int a2 = C54452q.m87382a(i6);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        cVar.mo56379ah(new C59094n(41590));
                        cVar.mo56387q("EpisodeGroup displayType not supported: %d", a2 - 1);
                        cxVar = C60856cj.m92900i(C69496am.f185918a);
                    }
                } else {
                    if (i4 == 4) {
                        C54392cr crVar = (C54392cr) acVar.f142656b;
                        C69664n.m101060f(crVar, "feedItem.showGroup");
                        int i7 = crVar.f142862b;
                        int a3 = C54391cq.m87373a(i7);
                        if (a3 != 0 && a3 == 2) {
                            C139962g gVar3 = gVar2.f381334d;
                            C62971cq cqVar3 = crVar.f142865e;
                            C69664n.m101060f(cqVar3, "showGroup.showsList");
                            C140377e eVar = r5;
                            arrayList = arrayList2;
                            z5 = z8;
                            C140377e eVar2 = new C140377e(crVar, dVar, aVar2, z6, z7, z9);
                            cxVar = C140989k.m228944b(gVar3.mo115364a(cqVar3), eVar);
                        } else {
                            arrayList = arrayList2;
                            z5 = z8;
                            C59052c cVar2 = (C59052c) f381331a.mo56224b();
                            int a4 = C54391cq.m87373a(i7);
                            if (a4 == 0) {
                                a4 = 1;
                            }
                            cVar2.mo56379ah(new C59094n(41592));
                            cVar2.mo56387q("ShowGroup displayType not supported: %d", a4 - 1);
                            cxVar = C60856cj.m92900i(C69496am.f185918a);
                        }
                    } else {
                        arrayList = arrayList2;
                        z5 = z8;
                        if (i4 == 9) {
                            cxVar = C60856cj.m92900i(C69496am.f185918a);
                        } else {
                            C59052c cVar3 = (C59052c) f381331a.mo56224b();
                            switch (i4) {
                                case 0:
                                    i5 = 1;
                                    break;
                                case 1:
                                    break;
                                case 3:
                                    i5 = 4;
                                    break;
                                case 4:
                                    i5 = 5;
                                    break;
                                case 5:
                                    i5 = 6;
                                    break;
                                case 6:
                                    i5 = 7;
                                    break;
                                case 7:
                                    i5 = 8;
                                    break;
                                case 8:
                                    i5 = 9;
                                    break;
                                case 9:
                                    i5 = 10;
                                    break;
                                default:
                                    i5 = 0;
                                    break;
                            }
                            cVar3.mo56379ah(new C59094n(41591));
                            cVar3.mo56387q("FeedItem type not supported: %d", i5 - 1);
                            cxVar = C60856cj.m92900i(C69496am.f185918a);
                        }
                    }
                    arrayList.add(cxVar);
                    arrayList2 = arrayList;
                    z8 = z5;
                    i3 = 1;
                    gVar2 = gVar;
                    oVar2 = oVar;
                }
            }
            arrayList = arrayList2;
            z5 = z8;
            arrayList.add(cxVar);
            arrayList2 = arrayList;
            z8 = z5;
            i3 = 1;
            gVar2 = gVar;
            oVar2 = oVar;
        }
        return C140989k.m228944b(C60856cj.m92906o(arrayList2), new C140375c(aaVar2, z8));
    }
}
