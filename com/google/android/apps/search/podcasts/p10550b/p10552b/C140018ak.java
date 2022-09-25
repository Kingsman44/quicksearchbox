package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.b.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C140018ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C140019al f380549a;

    /* renamed from: b */
    public final /* synthetic */ C97918h f380550b;

    /* renamed from: c */
    public final /* synthetic */ C97918h f380551c;

    public /* synthetic */ C140018ak(C140019al alVar, C97918h hVar, C97918h hVar2) {
        this.f380549a = alVar;
        this.f380550b = hVar;
        this.f380551c = hVar2;
    }

    public final void run() {
        C140019al alVar = this.f380549a;
        C97918h hVar = this.f380550b;
        C97918h hVar2 = this.f380551c;
        Set set = alVar.f380554c.f380562e;
        C97920j jVar = hVar.f273423j;
        if (jVar == null) {
            jVar = C97920j.f273426e;
        }
        set.remove(jVar);
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(alVar.f380554c.mo115396b(hVar2), "Failed to enqueue retry request.", new Object[0]);
        alVar.f380554c.f380559b = false;
    }
}
