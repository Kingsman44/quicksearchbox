package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.i */
/* compiled from: PG */
public final /* synthetic */ class C22985i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22990n f63216a;

    /* renamed from: b */
    public final /* synthetic */ HierarchyState f63217b;

    public /* synthetic */ C22985i(C22990n nVar, HierarchyState hierarchyState) {
        this.f63216a = nVar;
        this.f63217b = hierarchyState;
    }

    public final void run() {
        C22990n nVar = this.f63216a;
        C23088b bVar = this.f63217b.f63364a;
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            C22977at b = C22977at.m43028b((FeatureStateSnapshot) bVar.get(i));
            b.f63195c = false;
            nVar.f63230b.mo28391f(b);
        }
    }
}
