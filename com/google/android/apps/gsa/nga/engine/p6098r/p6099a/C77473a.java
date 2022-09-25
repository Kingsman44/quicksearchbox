package com.google.android.apps.gsa.nga.engine.p6098r.p6099a;

import androidx.p104d.p105a.C2164c;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.nga.engine.r.a.a */
/* compiled from: PG */
public final /* synthetic */ class C77473a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C77481h f213520a;

    /* renamed from: b */
    public final /* synthetic */ boolean f213521b;

    public /* synthetic */ C77473a(C77481h hVar, boolean z) {
        this.f213520a = hVar;
        this.f213521b = z;
    }

    public final Object call() {
        C77481h hVar = this.f213520a;
        boolean z = this.f213521b;
        hVar.f213529c.set(z);
        if (!z) {
            ArrayList arrayList = hVar.f213530d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2164c cVar = ((C77480g) arrayList.get(i)).f213525a;
                cVar.getClass();
                cVar.mo5437b((Object) null);
            }
            hVar.f213530d.clear();
        }
        return null;
    }
}
