package com.google.android.libraries.search.assistant.p2703l;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70716eu;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.assistant.l.q */
/* compiled from: PG */
public final class C34803q {

    /* renamed from: a */
    public static final Status f92333a = Status.f186906d.withDescription("Address of dynamic service is not specified");

    /* renamed from: b */
    public static final Status f92334b = Status.f186916n.withDescription("Dynamic service is not running");

    /* renamed from: c */
    private final C70705ej f92335c;

    public C34803q(C34798l lVar) {
        this.f92335c = new C34802p(lVar);
    }

    /* renamed from: a */
    public final C70298d mo39516a(C70716eu euVar) {
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        for (C70338di b : euVar.f188457b) {
            C70710eo.m103394b(b, this.f92335c, str, euVar, hashMap);
        }
        return new C34799m(C70710eo.m103393a(str, euVar, hashMap));
    }
}
