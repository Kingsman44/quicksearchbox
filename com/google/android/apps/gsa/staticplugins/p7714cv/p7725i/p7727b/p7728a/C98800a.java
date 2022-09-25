package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a;

import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.p7298l.C92474g;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C98800a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98871c f275981a;

    /* renamed from: b */
    public final /* synthetic */ Query f275982b;

    public /* synthetic */ C98800a(C98871c cVar, Query query) {
        this.f275981a = cVar;
        this.f275982b = query;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        List aj;
        C98871c cVar = this.f275981a;
        Query query = this.f275982b;
        if (!query.mo84420dA() || query.mo84434dO() || query.mo84412cs() || ((aj = cVar.f276254f.mo83890aj()) != null && !aj.isEmpty() && !C92474g.m152087i(query, cVar.f276255g, cVar.f276253e.f232790a.mo79722a()))) {
            return C58836b.f156633a;
        }
        String ae = cVar.f276254f.mo83885ae();
        C58833ax a = cVar.mo91316a(ae);
        if (a.mo56113h() && ((C8476as) a.mo56107c()).f29419d >= 500) {
            return a;
        }
        if (ae.startsWith("en-") && cVar.f276255g.mo79746e(C90082eg.f250040cx)) {
            C58485gu p = C58485gu.m89848p("en-US", "en-GB", "en-IN");
            int i = ((C58724pq) p).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                String str = (String) p.get(i2);
                if (!ae.equals(str)) {
                    C58833ax a2 = cVar.mo91316a(str);
                    if (a2.mo56113h() && ((C8476as) a2.mo56107c()).f29419d >= 500) {
                        return a2;
                    }
                }
            }
        }
        cVar.mo91317b(a.mo56113h() ? ((C8476as) a.mo56107c()).f29419d : -1);
        return C58836b.f156633a;
    }
}
