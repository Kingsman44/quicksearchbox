package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ai */
/* compiled from: PG */
public final /* synthetic */ class C96523ai implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96525ak f270043a;

    /* renamed from: b */
    public final /* synthetic */ C95355bf f270044b;

    /* renamed from: c */
    public final /* synthetic */ C124721s f270045c;

    /* renamed from: d */
    public final /* synthetic */ C124629av f270046d;

    public /* synthetic */ C96523ai(C96525ak akVar, C95355bf bfVar, C124721s sVar, C124629av avVar) {
        this.f270043a = akVar;
        this.f270044b = bfVar;
        this.f270045c = sVar;
        this.f270046d = avVar;
    }

    public final void run() {
        C96525ak akVar = this.f270043a;
        C95355bf bfVar = this.f270044b;
        C124721s sVar = this.f270045c;
        C124629av avVar = this.f270046d;
        synchronized (akVar) {
            C96596da daVar = akVar.f270053f;
            C96595d dVar = akVar.f270049b;
            C22871g gVar = (C22871g) dVar.f270217a.mo17428b();
            gVar.getClass();
            C22871g gVar2 = (C22871g) dVar.f270218b.mo17428b();
            gVar2.getClass();
            C96579ck ckVar = (C96579ck) dVar.f270219c.mo17428b();
            ckVar.getClass();
            C21370a aVar = (C21370a) dVar.f270220d.mo17428b();
            aVar.getClass();
            bfVar.getClass();
            sVar.getClass();
            avVar.getClass();
            C96568c cVar = new C96568c(gVar, gVar2, ckVar, aVar, bfVar, sVar, avVar);
            SettableFuture settableFuture = akVar.f270052e;
            Objects.requireNonNull(settableFuture);
            C96519ae aeVar = new C96519ae(settableFuture);
            SettableFuture settableFuture2 = akVar.f270052e;
            Objects.requireNonNull(settableFuture2);
            daVar.mo90267b(cVar, aeVar, new C96520af(settableFuture2));
        }
    }
}
