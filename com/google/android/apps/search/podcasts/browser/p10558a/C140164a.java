package com.google.android.apps.search.podcasts.browser.p10558a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.a */
/* compiled from: PG */
final class C140164a extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140175l f380835a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140164a(C140175l lVar) {
        super(1);
        this.f380835a = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "episodeItems");
        C140175l lVar = this.f380835a;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C97914d dVar = ((C140641b) next).f381987n;
            if (dVar == null) {
                dVar = C97914d.f273393j;
            }
            C97913c a = C97913c.m162190a(dVar.f273396b);
            if (a == null) {
                a = C97913c.UNKNOWN;
            }
            if (a == C97913c.DOWNLOADED) {
                arrayList.add(next);
            }
        }
        return lVar.mo115484b(arrayList, C140509u.AUTOPLAY_DOWNLOAD);
    }
}
