package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.am.d.a.dn */
/* compiled from: PG */
public final class C8794dn {

    /* renamed from: a */
    private final C8786df f30170a;

    public C8794dn(C8786df dfVar) {
        this.f30170a = dfVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C8790dj mo17235a() {
        C62942bv build = this.f30170a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C8790dj) build;
    }

    /* renamed from: b */
    public final void mo17236b(String str, C8788dh dhVar) {
        C69664n.m101061g(str, "key");
        C69664n.m101061g(dhVar, "value");
        C8786df dfVar = this.f30170a;
        str.getClass();
        dhVar.getClass();
        dfVar.copyOnWrite();
        C8790dj djVar = (C8790dj) dfVar.instance;
        C8790dj djVar2 = C8790dj.f30166b;
        C62995dn dnVar = djVar.f30168a;
        if (!dnVar.f170058b) {
            djVar.f30168a = dnVar.mo58980a();
        }
        djVar.f30168a.put(str, dhVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo17237c() {
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C8790dj) this.f30170a.instance).f30168a));
        C69664n.m101060f(unmodifiableMap, "_builder.getServiceNameToPeersMap()");
        new C62884c(unmodifiableMap);
    }
}
