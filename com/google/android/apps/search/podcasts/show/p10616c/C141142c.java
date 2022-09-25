package com.google.android.apps.search.podcasts.show.p10616c;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C139995h;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140025c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54322az;
import com.google.p4017at.p4082j.p4083a.C54402da;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.Collections;
import p5462h.p5463a.C69498ao;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.show.c.c */
/* compiled from: PG */
final class C141142c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C141150k f383198a;

    /* renamed from: b */
    final /* synthetic */ String f383199b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141142c(C141150k kVar, String str) {
        super(1);
        this.f383198a = kVar;
        this.f383199b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C54322az azVar = (C54322az) obj;
        this.f383198a.f383231k.set(true);
        C69664n.m101058d(azVar);
        Object obj2 = Collections.unmodifiableMap(azVar.f142698a).get(this.f383199b);
        C69664n.m101058d(obj2);
        C54402da daVar = (C54402da) obj2;
        C141150k kVar = this.f383198a;
        String str = this.f383199b;
        C63113l lVar = daVar.f142891b;
        if (lVar != null) {
            C140025c cVar = kVar.f383228h;
            String str2 = lVar.f170373g;
            C69664n.m101060f(str2, "showResult.show.feedUrl");
            C63113l lVar2 = daVar.f142891b;
            if (lVar2 == null) {
                lVar2 = C63113l.f170365p;
            }
            String str3 = lVar2.f170375i;
            C69664n.m101060f(str3, "showResult.show.clusterId");
            cVar.mo115407a(str2, str3, Collections.unmodifiableMap(daVar.f142892c).keySet());
        } else {
            kVar.f383228h.mo115407a(str, str, C69498ao.f185920a);
        }
        C139997j jVar = this.f383198a.f383222b;
        String str4 = this.f383199b;
        C69664n.m101061g(str4, "feedUrl");
        C69664n.m101061g(daVar, "showResult");
        C60870cx b = jVar.f380513c.mo45938b(new C139995h(jVar, str4, daVar));
        C69664n.m101060f(b, "fun putShowResult(feedUr…wResult)), now)\n    }\n  }");
        return b;
    }
}
