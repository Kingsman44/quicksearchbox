package com.google.android.apps.search.googleapp.notifications.p10365d;

import com.google.android.apps.search.xblend.p10707b.C142269a;
import com.google.android.apps.search.xblend.p10708c.C142271a;
import com.google.android.apps.search.xblend.p10708c.C142272b;
import com.google.android.apps.search.xblend.p10708c.C142274d;
import com.google.p4283bv.p4287b.p4342b.C56941e;
import com.google.p4283bv.p4287b.p4342b.C56942f;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4287b.p4342b.C56945i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.d.a */
/* compiled from: PG */
public final class C136770a {
    /* renamed from: a */
    public static final void m222372a(C142269a aVar) {
        C142271a aVar2 = (C142271a) C142272b.f385977e.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C142274d a = C69664n.m101061g(aVar2, "builder");
        C56942f fVar = (C56942f) C56943g.f151982f.createBuilder();
        C69664n.m101060f(fVar, "newBuilder()");
        C56945i a2 = C69664n.m101061g(fVar, "builder");
        a2.mo54439b("https://autopush-searchnotifications-pa.sandbox.googleapis.com/v1/getnotificationsettings");
        a2.mo54440c(C56941e.PLATFORM_BOQ);
        a.mo117100b(a2.mo54438a());
        a.mo117102d();
        a.mo117101c();
        aVar.mo41490e(a.mo117099a());
    }
}
