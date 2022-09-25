package com.google.android.libraries.search.assistant.p2783s.p2785b;

import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66596bv;
import com.google.speech.p5208h.C66597bw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.s.b.o */
/* compiled from: PG */
public final class C36396o {
    /* renamed from: a */
    public static final C66597bw m64955a(String str) {
        C66596bv bvVar = (C66596bv) C66597bw.f181154d.createBuilder();
        bvVar.copyOnWrite();
        C66597bw bwVar = (C66597bw) bvVar.instance;
        bwVar.f181156a |= 2;
        bwVar.f181158c = 1;
        bvVar.copyOnWrite();
        C66597bw bwVar2 = (C66597bw) bvVar.instance;
        str.getClass();
        bwVar2.f181156a = 1 | bwVar2.f181156a;
        bwVar2.f181157b = str;
        C62942bv build = bvVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .ap…       }\n        .build()");
        return (C66597bw) build;
    }
}
