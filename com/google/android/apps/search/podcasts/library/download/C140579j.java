package com.google.android.apps.search.podcasts.library.download;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.library.p10580b.C140567b;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140984e;
import java.util.ArrayList;
import java.util.List;
import p5462h.C69677g;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.library.download.j */
/* compiled from: PG */
final class C140579j extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C140579j f381787a = new C140579j();

    public C140579j() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "episodeItems");
        ArrayList<C140641b> arrayList = new ArrayList<>();
        for (Object next : list) {
            C97914d dVar = ((C140641b) next).f381987n;
            if (dVar == null) {
                dVar = C97914d.f273393j;
            }
            C97913c a = C97913c.m162190a(dVar.f273396b);
            if (a == null) {
                a = C97913c.UNKNOWN;
            }
            switch (a.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 5:
                    break;
                case 1:
                case 2:
                case 6:
                    arrayList.add(next);
                    break;
                default:
                    throw new C69677g();
            }
        }
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C140641b bVar : arrayList) {
            C97925o oVar = C140984e.f382770a;
            arrayList2.add(new C140567b(bVar, C140984e.f382772c, false, C140509u.AUTOPLAY_DOWNLOAD));
        }
        return new C140952k(arrayList2, (Integer) null);
    }
}
