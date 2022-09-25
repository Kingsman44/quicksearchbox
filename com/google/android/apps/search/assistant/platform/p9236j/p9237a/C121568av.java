package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.av */
/* compiled from: PG */
public final /* synthetic */ class C121568av implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121585bl f337324a;

    /* renamed from: b */
    public final /* synthetic */ C33884b f337325b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f337326c;

    public /* synthetic */ C121568av(C121585bl blVar, C33884b bVar, C2164c cVar) {
        this.f337324a = blVar;
        this.f337325b = bVar;
        this.f337326c = cVar;
    }

    public final void run() {
        C121585bl blVar = this.f337324a;
        C33884b bVar = this.f337325b;
        C2164c cVar = this.f337326c;
        C121555ai aiVar = (C121555ai) C121556aj.f337302b.createBuilder();
        C34053bp bpVar = blVar.f337362d;
        aiVar.copyOnWrite();
        bpVar.getClass();
        ((C121556aj) aiVar.instance).f337304a = bpVar;
        C121584bk bkVar = new C121584bk(blVar, bVar, cVar);
        C121660q qVar = blVar.f337361c;
        C70862aj a = C47686k.m84827a(bkVar);
        C70876o.m103763d(qVar.f189039a.mo39510a(C121662s.m201044e(), qVar.f189040b), (C121556aj) aiVar.build(), a, true);
    }
}
