package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import android.databinding.C0118a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.ac */
/* compiled from: PG */
public final /* synthetic */ class C128408ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C128414ai f353150a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f353151b;

    /* renamed from: c */
    public final /* synthetic */ C37254c f353152c;

    public /* synthetic */ C128408ac(C128414ai aiVar, Throwable th, C37254c cVar) {
        this.f353150a = aiVar;
        this.f353151b = th;
        this.f353152c = cVar;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.google.android.libraries.search.b.i.a, com.google.android.libraries.search.b.i.c] */
    public final void run() {
        C128414ai aiVar = this.f353150a;
        Throwable th = this.f353151b;
        ? r8 = this.f353152c;
        C0118a.m116x(C128414ai.f353157a.mo56226d(), "Disconnecting with error.", 38828, th, C38505d.f101864b, 196211705);
        aiVar.f353160d.mo108414c(th);
        aiVar.f353158b.mo108424b(r8);
        aiVar.f353164h = true;
        aiVar.mo108411l();
    }
}
