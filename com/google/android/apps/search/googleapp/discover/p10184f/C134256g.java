package com.google.android.apps.search.googleapp.discover.p10184f;

import com.google.android.apps.search.googleapp.discover.p10214s.C134585c;
import com.google.android.apps.search.googleapp.discover.p10214s.C134586d;
import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.f.g */
/* compiled from: PG */
final class C134256g implements C58817ah {

    /* renamed from: a */
    public static final C134256g f365737a = new C134256g();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134262m mVar = (C134262m) obj;
        C69664n.m101061g(mVar, "input");
        C62934bn builder = mVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134260k a = C69664n.m101061g((C134261l) builder, "builder");
        C134587e eVar = ((C134262m) a.f365744a.instance).f365748b;
        if (eVar == null) {
            eVar = C134587e.f366522e;
        }
        C69664n.m101060f(eVar, "_builder.getBackgroundRefreshSchedule()");
        C62934bn builder2 = eVar.toBuilder();
        C69664n.m101060f(builder2, "this.toBuilder()");
        C134585c a2 = C69664n.m101061g((C134586d) builder2, "builder");
        C134586d dVar = a2.f366521a;
        int i = ((C134587e) dVar.instance).f366527d;
        dVar.copyOnWrite();
        C134587e eVar2 = (C134587e) dVar.instance;
        eVar2.f366524a |= 2;
        eVar2.f366527d = i + 1;
        a.mo111666b(a2.mo111829a());
        return a.mo111665a();
    }
}
