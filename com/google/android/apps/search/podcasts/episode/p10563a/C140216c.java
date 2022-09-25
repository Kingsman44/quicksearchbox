package com.google.android.apps.search.podcasts.episode.p10563a;

import com.google.android.apps.search.podcasts.episode.C140237p;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.common.util.concurrent.C60866ct;
import com.google.p4017at.p4082j.p4083a.C54322az;
import com.google.p4017at.p4082j.p4083a.C54402da;
import java.util.Collections;
import java.util.Map;
import p5462h.p5463a.C69498ao;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.episode.a.c */
/* compiled from: PG */
final class C140216c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140237p f380941a;

    /* renamed from: b */
    final /* synthetic */ C140219f f380942b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140216c(C140237p pVar, C140219f fVar) {
        super(1);
        this.f380941a = pVar;
        this.f380942b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Map unmodifiableMap;
        C54322az azVar = (C54322az) obj;
        Object obj2 = C140214a.m227909a(this.f380941a).f186153a;
        C54402da daVar = null;
        if (!(azVar == null || (unmodifiableMap = Collections.unmodifiableMap(azVar.f142698a)) == null)) {
            daVar = (C54402da) unmodifiableMap.get(obj2);
        }
        if (daVar == null) {
            return C60866ct.f164955a;
        }
        if (daVar.f142891b == null) {
            String str = (String) obj2;
            this.f380942b.f380957j.mo115407a(str, str, C69498ao.f185920a);
        }
        C139997j jVar = this.f380942b.f380950c;
        Map unmodifiableMap2 = Collections.unmodifiableMap(azVar.f142698a);
        C69664n.m101060f(unmodifiableMap2, "response.showsByFeedUrlMap");
        return jVar.mo115378c(unmodifiableMap2);
    }
}
