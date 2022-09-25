package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Map;
import java.util.Set;
import p3186j$.util.Optional;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.cu */
/* compiled from: PG */
public final class C23520cu implements C23570eq {
    /* renamed from: a */
    public final /* synthetic */ C23571er mo28847a(C23553e eVar, Map map) {
        Set set;
        C23574eu euVar = C23574eu.TRANSPORT_CONTROL;
        Optional a = eVar.mo28918a("transportControlSupportedCommands", String.class);
        if (a.isPresent()) {
            Object obj = a.get();
            C69664n.m101060f(obj, "controls.get()");
            set = C69540x.m100846ab((Iterable) obj);
        } else {
            set = C69498ao.f185920a;
        }
        return new C23521cv(euVar, set, (C23580g) C23569ep.m43989a(map, C23542dp.AVAILABLE_TRANSPORT_CONTROLS, C23580g.class, C23521cv.f64273b));
    }
}
