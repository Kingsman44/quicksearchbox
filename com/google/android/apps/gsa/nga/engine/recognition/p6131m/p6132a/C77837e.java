package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.e */
/* compiled from: PG */
public final /* synthetic */ class C77837e implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C77839g f214412a;

    /* renamed from: b */
    public final /* synthetic */ long f214413b;

    public /* synthetic */ C77837e(C77839g gVar, long j) {
        this.f214412a = gVar;
        this.f214413b = j;
    }

    public final void run() {
        C77839g gVar = this.f214412a;
        long j = this.f214413b;
        ((C58970a) ((C58970a) C77839g.f214415a.mo56224b()).mo56372aa(4493)).mo56388r("Removing network: %s from blacklist after timeout", j);
        gVar.f214416b.remove(Long.valueOf(j));
    }
}
