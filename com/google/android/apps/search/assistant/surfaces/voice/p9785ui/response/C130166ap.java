package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129678l;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.ap */
/* compiled from: PG */
public final class C130166ap {
    /* renamed from: a */
    public static final C129676j m212503a() {
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C129678l a = C69664n.m101061g(gVar, "builder");
        a.mo109191c(C129662i.RESPONSE);
        C62940bt btVar = C130279p.f357129d;
        C69664n.m101060f(btVar, "responseLayerData");
        C130278o oVar = (C130278o) C130279p.f357128c.createBuilder();
        C69664n.m101060f(oVar, "newBuilder()");
        C69664n.m101061g(oVar, "builder");
        oVar.copyOnWrite();
        C130279p pVar = (C130279p) oVar.instance;
        pVar.f357131a |= 1;
        pVar.f357132b = true;
        C62942bv build = oVar.build();
        C69664n.m101060f(build, "_builder.build()");
        a.mo109190b(btVar, (C130279p) build);
        return a.mo109189a();
    }
}
