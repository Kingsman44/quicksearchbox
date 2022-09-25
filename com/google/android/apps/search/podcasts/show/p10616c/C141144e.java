package com.google.android.apps.search.podcasts.show.p10616c;

import com.google.android.apps.search.podcasts.p10549a.C139960e;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.C140993o;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4017at.p4082j.p4083a.C54400cz;
import com.google.p4017at.p4082j.p4083a.C54402da;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.Map;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.c.e */
/* compiled from: PG */
final class C141144e implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60870cx f383205a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f383206b;

    /* renamed from: c */
    final /* synthetic */ String f383207c;

    /* renamed from: d */
    final /* synthetic */ C141150k f383208d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f383209e;

    /* renamed from: f */
    final /* synthetic */ C69644aa f383210f;

    /* renamed from: g */
    final /* synthetic */ C60870cx f383211g;

    public C141144e(C60870cx cxVar, C60870cx cxVar2, String str, C141150k kVar, C60870cx cxVar3, C69644aa aaVar, C60870cx cxVar4) {
        this.f383205a = cxVar;
        this.f383206b = cxVar2;
        this.f383207c = str;
        this.f383208d = kVar;
        this.f383209e = cxVar3;
        this.f383210f = aaVar;
        this.f383211g = cxVar4;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C140993o oVar;
        Object r = C60856cj.m92909r(this.f383205a);
        C69664n.m101060f(r, "getDone(showMetadataFuture)");
        Map map = (Map) r;
        Object r2 = C60856cj.m92909r(this.f383206b);
        C69664n.m101060f(r2, "getDone(accountNameFuture)");
        String str = (String) r2;
        if (!map.containsKey(this.f383207c)) {
            return C60856cj.m92900i(C46688af.f121976a);
        }
        Object obj = map.get(this.f383207c);
        C69664n.m101058d(obj);
        C54402da daVar = (C54402da) obj;
        C63113l lVar = daVar.f142891b;
        if (lVar != null) {
            return C140989k.m228944b(C140989k.m228944b(this.f383208d.f383225e.mo115364a(C69540x.m100944b(lVar)), C139960e.f380437a), new C141143d(this.f383209e, this.f383208d, this.f383210f, str, this.f383211g));
        }
        C141150k kVar = this.f383208d;
        int b = C54400cz.m87377b(daVar.f142890a);
        if (b != 0 && b == 7) {
            oVar = C140993o.EXPLICIT;
        } else {
            oVar = C140993o.NOT_FOUND;
        }
        return C60856cj.m92900i(kVar.mo116183a(C46688af.m83205b(new C141141b(oVar, new C140952k(C69496am.f185918a, (Integer) null)), 0), C46688af.f121976a));
    }
}
