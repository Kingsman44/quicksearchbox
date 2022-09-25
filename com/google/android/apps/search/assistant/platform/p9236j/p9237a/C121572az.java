package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.az */
/* compiled from: PG */
public final /* synthetic */ class C121572az implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121585bl f337331a;

    /* renamed from: b */
    public final /* synthetic */ C33883a f337332b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f337333c;

    public /* synthetic */ C121572az(C121585bl blVar, C33883a aVar, C2164c cVar) {
        this.f337331a = blVar;
        this.f337332b = aVar;
        this.f337333c = cVar;
    }

    public final void run() {
        C121585bl blVar = this.f337331a;
        C33883a aVar = this.f337332b;
        C2164c cVar = this.f337333c;
        C121551ae aeVar = (C121551ae) C121552af.f337295b.createBuilder();
        C34053bp bpVar = blVar.f337362d;
        aeVar.copyOnWrite();
        bpVar.getClass();
        ((C121552af) aeVar.instance).f337297a = bpVar;
        C121581bh bhVar = new C121581bh(blVar, aVar, cVar);
        C121660q qVar = blVar.f337361c;
        C70862aj a = C47686k.m84827a(bhVar);
        C70876o.m103763d(qVar.f189039a.mo39510a(C121662s.m201043d(), qVar.f189040b), (C121552af) aeVar.build(), a, true);
    }
}
