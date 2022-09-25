package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124544b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.i */
/* compiled from: PG */
public final /* synthetic */ class C89585i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124709g f242638a;

    /* renamed from: b */
    public final /* synthetic */ Set f242639b;

    /* renamed from: c */
    public final /* synthetic */ String f242640c;

    /* renamed from: d */
    public final /* synthetic */ Set f242641d;

    /* renamed from: e */
    public final /* synthetic */ long f242642e;

    public /* synthetic */ C89585i(C124709g gVar, Set set, String str, Set set2, long j) {
        this.f242638a = gVar;
        this.f242639b = set;
        this.f242640c = str;
        this.f242641d = set2;
        this.f242642e = j;
    }

    public final void run() {
        C124709g gVar = this.f242638a;
        Set<C89495cg> set = this.f242639b;
        String str = this.f242640c;
        Set set2 = this.f242641d;
        long j = this.f242642e;
        C124544b bVar = new C124544b(gVar);
        for (C89495cg fW : set) {
            fW.mo17874fW(str, set2, j, bVar);
        }
    }
}
