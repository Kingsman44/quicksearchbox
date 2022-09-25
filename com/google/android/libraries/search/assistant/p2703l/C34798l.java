package com.google.android.libraries.search.assistant.p2703l;

import com.google.protobuf.C63088z;
import java.util.Map;
import java.util.Random;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70298d;

/* renamed from: com.google.android.libraries.search.assistant.l.l */
/* compiled from: PG */
public final class C34798l {

    /* renamed from: a */
    public final Map f92329a = new ConcurrentHashMap();

    /* renamed from: b */
    private final String f92330b;

    public C34798l(String str) {
        this.f92330b = str;
    }

    /* renamed from: a */
    public final C34794h mo39515a(C70298d dVar) {
        byte[] bArr = new byte[8];
        new Random().nextBytes(bArr);
        C34792f fVar = (C34792f) C34793g.f92320c.createBuilder();
        String str = this.f92330b;
        fVar.copyOnWrite();
        ((C34793g) fVar.instance).f92323b = str;
        C63088z A = C63088z.m96139A(bArr);
        fVar.copyOnWrite();
        ((C34793g) fVar.instance).f92322a = A;
        C34793g gVar = (C34793g) fVar.build();
        this.f92329a.put(gVar.f92322a, new C34797k(dVar));
        return new C34794h(this, gVar);
    }
}
