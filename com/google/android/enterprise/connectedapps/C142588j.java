package com.google.android.enterprise.connectedapps;

import android.os.Bundle;

/* renamed from: com.google.android.enterprise.connectedapps.j */
/* compiled from: PG */
public final /* synthetic */ class C142588j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C142543ac f386896a;

    /* renamed from: b */
    public final /* synthetic */ long f386897b;

    /* renamed from: c */
    public final /* synthetic */ int f386898c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f386899d;

    /* renamed from: e */
    public final /* synthetic */ C142553am f386900e;

    /* renamed from: f */
    public final /* synthetic */ Object f386901f;

    public /* synthetic */ C142588j(C142543ac acVar, long j, int i, Bundle bundle, C142553am amVar, Object obj) {
        this.f386896a = acVar;
        this.f386897b = j;
        this.f386898c = i;
        this.f386899d = bundle;
        this.f386900e = amVar;
        this.f386901f = obj;
    }

    public final void run() {
        C142543ac acVar = this.f386896a;
        long j = this.f386897b;
        int i = this.f386898c;
        Bundle bundle = this.f386899d;
        C142553am amVar = this.f386900e;
        Object obj = this.f386901f;
        C142623z zVar = new C142623z(j, i, bundle, amVar);
        acVar.f386816k.add(zVar);
        acVar.mo117154f();
        acVar.mo117151c(obj, zVar);
        acVar.f386818m.add(zVar);
        acVar.f386819n.add(zVar);
        acVar.mo117162n();
        acVar.mo117152d();
    }
}
