package com.google.android.libraries.componentview.p1698e;

import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.componentview.e.k */
/* compiled from: PG */
public final class C20495k implements C68220f {
    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5, C20493i.m38470a("CML Bg Thread"));
        C68225k.m98532d(newFixedThreadPool);
        return newFixedThreadPool;
    }
}
