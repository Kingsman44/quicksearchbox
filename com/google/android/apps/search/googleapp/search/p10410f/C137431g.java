package com.google.android.apps.search.googleapp.search.p10410f;

import p3186j$.time.ZoneOffset;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.search.f.g */
/* compiled from: PG */
final class C137431g extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C137431g f373800a = new C137431g();

    public C137431g() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C137448x xVar = (C137448x) obj;
        C69664n.m101061g(xVar, "it");
        String localTime = xVar.f373846a.atZone(ZoneOffset.UTC).toLocalTime().toString();
        C69664n.m101060f(localTime, "it.timestamp.atZone(Zone….toLocalTime().toString()");
        return localTime;
    }
}
