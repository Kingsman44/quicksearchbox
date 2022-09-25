package com.google.apps.tiktok.p3648i.p3652c;

import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.i.c.i */
/* compiled from: PG */
public final /* synthetic */ class C47175i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47176j f122830a;

    /* renamed from: b */
    public final /* synthetic */ C47174h f122831b;

    public /* synthetic */ C47175i(C47176j jVar, C47174h hVar) {
        this.f122830a = jVar;
        this.f122831b = hVar;
    }

    public final Object call() {
        C47176j jVar = this.f122830a;
        C47174h hVar = this.f122831b;
        C47151b bVar = jVar.f122834c;
        C47153d a = hVar.mo51085a();
        return new File(bVar.mo51051c(a.mo51045b(), a.mo51044a()), hVar.mo51088d());
    }
}
