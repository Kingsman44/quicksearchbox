package com.google.frameworks.client.data.android.p4643j;

import p5488io.grpc.C70904s;
import p5488io.grpc.C70906u;

/* renamed from: com.google.frameworks.client.data.android.j.g */
/* compiled from: PG */
final class C61519g extends C70904s {

    /* renamed from: a */
    private final Object f166313a = new Object();

    /* renamed from: b */
    private C61517e f166314b;

    /* renamed from: c */
    private final C61516d f166315c;

    public C61519g(C61516d dVar) {
        this.f166315c = dVar;
    }

    /* renamed from: a */
    public final C70906u mo46274a() {
        synchronized (this.f166313a) {
            if (this.f166314b != null) {
                C61518f fVar = new C61518f();
                return fVar;
            }
            C61517e eVar = new C61517e(this.f166315c);
            this.f166314b = eVar;
            return eVar;
        }
    }
}
