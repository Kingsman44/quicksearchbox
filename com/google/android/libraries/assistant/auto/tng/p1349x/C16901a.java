package com.google.android.libraries.assistant.auto.tng.p1349x;

import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.x.a */
/* compiled from: PG */
public final /* synthetic */ class C16901a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C16905d f49409a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f49410b;

    public /* synthetic */ C16901a(C16905d dVar, C63088z zVar) {
        this.f49409a = dVar;
        this.f49410b = zVar;
    }

    public final void run() {
        C16905d dVar = this.f49409a;
        C63088z zVar = this.f49410b;
        C63088z zVar2 = dVar.f49414b;
        if (zVar2 == null) {
            dVar.f49414b = zVar;
        } else {
            dVar.f49414b = zVar2.mo59177x(zVar);
        }
    }
}
