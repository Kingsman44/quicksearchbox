package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import com.google.apps.tiktok.concurrent.C46466r;
import com.google.protobuf.C62961ch;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5477g.C69678a;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.p */
/* compiled from: PG */
final class C136175p implements C46466r {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50468a(Object obj, Object obj2) {
        float f;
        C136166g gVar = (C136166g) obj;
        C136160a aVar = (C136160a) obj2;
        C69664n.m101060f(gVar, "weather");
        C69664n.m101060f(aVar, "unit");
        C136160a aVar2 = C136160a.FAHRENHEIT;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            f = gVar.f370839e;
        } else if (ordinal == 1) {
            f = gVar.f370838d;
        } else {
            throw new C69677g();
        }
        String str = C69678a.m101088a(f) + "° " + aVar.f370829c;
        C62961ch chVar = gVar.f370836b;
        C69664n.m101060f(chVar, "weather.conditionsList");
        return new C136174o(str, chVar);
    }
}
