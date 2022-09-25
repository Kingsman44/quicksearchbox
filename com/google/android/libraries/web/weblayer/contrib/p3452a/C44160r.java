package com.google.android.libraries.web.weblayer.contrib.p3452a;

import java.util.HashSet;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.r */
/* compiled from: PG */
public final /* synthetic */ class C44160r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C44161s f114903a;

    public /* synthetic */ C44160r(C44161s sVar) {
        this.f114903a = sVar;
    }

    public final Object call() {
        C44161s sVar = this.f114903a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(C44161s.m77937g(sVar.mo47110f()));
        hashSet.addAll(C44161s.m77937g(sVar.mo47109e()));
        return (String[]) Collection.EL.stream(hashSet).toArray(C44146d.f114883a);
    }
}
