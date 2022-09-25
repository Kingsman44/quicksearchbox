package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.C143919bh;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.l */
/* compiled from: PG */
public final class C142759l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C142701h f387393a;

    /* renamed from: b */
    final /* synthetic */ C142764q f387394b;

    public C142759l(C142764q qVar, C142701h hVar) {
        this.f387394b = qVar;
        this.f387393a = hVar;
    }

    public final void run() {
        C142701h hVar = this.f387393a;
        hVar.f387210a.mo117460a(hVar);
        for (C142765r a : this.f387394b.f387400c) {
            a.mo117604a();
        }
        C142701h hVar2 = this.f387393a;
        C143919bh.m233965h("deliver should be called from worker thread");
        C143919bh.m233960c(hVar2.f387211b, "Measurement must be submitted");
        List<C142766s> list = hVar2.f387217h;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C142766s sVar : list) {
                Uri b = sVar.mo117476b();
                if (!hashSet.contains(b)) {
                    hashSet.add(b);
                    sVar.mo117477e(hVar2);
                }
            }
        }
    }
}
