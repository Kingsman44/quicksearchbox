package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p961c;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.c.b */
/* compiled from: PG */
public final /* synthetic */ class C13434b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13436d f41263a;

    /* renamed from: b */
    public final /* synthetic */ long f41264b;

    public /* synthetic */ C13434b(C13436d dVar, long j) {
        this.f41263a = dVar;
        this.f41264b = j;
    }

    public final void run() {
        C13436d dVar = this.f41263a;
        long j = this.f41264b;
        if (((C13435c) dVar.f41266b.remove(Long.valueOf(j))) != null) {
            ((C59052c) ((C59052c) C13436d.f41265a.mo56226d()).mo56372aa(44807)).mo56388r("Evicted data for tapped message: %d", j);
        }
    }
}
