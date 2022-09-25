package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cf */
/* compiled from: PG */
public final class C32664cf {

    /* renamed from: a */
    public final ConcurrentMap f87550a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo38223a(C32810be beVar, C32821bp bpVar) {
        C69664n.m101061g(beVar, "request");
        C69664n.m101061g(bpVar, "result");
        ConcurrentMap concurrentMap = this.f87550a;
        C32796ar arVar = beVar.f87996b;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        concurrentMap.put(arVar, Integer.valueOf(bpVar.getSerializedSize()));
    }
}
