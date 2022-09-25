package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134704b;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139764e;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.ag */
/* compiled from: PG */
final class C134813ag implements C47391d {
    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C134704b bVar2 = (C134704b) bVar;
        C69664n.m101061g(bVar2, "event");
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C69664n.m101060f(fVar, "newBuilder()");
        C139764e a = C69664n.m101061g(fVar, "builder");
        a.mo115227c(C139779t.SEARCH);
        a.mo115228d();
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C139767h) a.f379867a.instance).f379875e));
        C69664n.m101060f(unmodifiableMap, "_builder.getCgiParamsMap()");
        new C62884c(unmodifiableMap);
        Map map = bVar2.f366822b;
        C69664n.m101061g(map, "map");
        a.f379867a.mo115229a(map);
        String str = bVar2.f366821a;
        C69664n.m101061g(str, "value");
        C139765f fVar2 = a.f379867a;
        fVar2.copyOnWrite();
        C139767h hVar = (C139767h) fVar2.instance;
        str.getClass();
        hVar.f379871a |= 8;
        hVar.f379876f = str;
        return C47392e.m84229a(new C139760a(a.mo115225a()));
    }
}
