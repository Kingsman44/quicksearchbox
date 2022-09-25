package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.d.i */
/* compiled from: PG */
public final /* synthetic */ class C46091i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C46092j f120965a;

    /* renamed from: b */
    public final /* synthetic */ C47153d f120966b;

    public /* synthetic */ C46091i(C46092j jVar, C47153d dVar) {
        this.f120965a = jVar;
        this.f120966b = dVar;
    }

    public final Object call() {
        C46092j jVar = this.f120965a;
        File file = new File(jVar.f120968b.mo51050b(this.f120966b), C46092j.m82308c(jVar.f120969c));
        file.mkdirs();
        return file;
    }
}
