package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.bc */
/* compiled from: PG */
public final class C126322bc {

    /* renamed from: a */
    private final C70862aj f347990a;

    /* renamed from: b */
    private boolean f347991b = false;

    public C126322bc(C70862aj ajVar) {
        this.f347990a = ajVar;
    }

    /* renamed from: a */
    public final synchronized void mo107531a() {
        if (!this.f347991b) {
            this.f347990a.mo20121a();
            this.f347991b = true;
        }
    }

    /* renamed from: b */
    public final synchronized void mo107532b(Object obj) {
        if (!this.f347991b) {
            this.f347990a.mo20123c(obj);
        }
    }
}
