package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.j.oh */
/* compiled from: PG */
public final class C52345oh {

    /* renamed from: a */
    private final C51803ds f137394a;

    public C52345oh(C51803ds dsVar) {
        this.f137394a = dsVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51805du mo53831a() {
        C62942bv build = this.f137394a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51805du) build;
    }

    /* renamed from: b */
    public final void mo53832b(String str) {
        C51803ds dsVar = this.f137394a;
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        C51805du duVar2 = C51805du.f135924e;
        duVar.f135926a |= 1;
        duVar.f135927b = str;
    }

    /* renamed from: c */
    public final void mo53833c(String str, C52230ka kaVar) {
        C69664n.m101061g(kaVar, "value");
        this.f137394a.mo53729a(str, kaVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo53834d() {
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C51805du) this.f137394a.instance).f135929d));
        C69664n.m101060f(unmodifiableMap, "_builder.getParamsMap()");
        new C62884c(unmodifiableMap);
    }
}
