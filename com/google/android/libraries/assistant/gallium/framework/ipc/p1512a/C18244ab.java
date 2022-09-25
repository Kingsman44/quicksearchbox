package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.p1503a.p1504a.C18192c;
import com.google.protos.p5127o.C65697w;
import com.google.protos.p5127o.C65699y;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C18244ab implements C18192c {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f51803a;

    public /* synthetic */ C18244ab(C70862aj ajVar) {
        this.f51803a = ajVar;
    }

    /* renamed from: a */
    public final void mo23653a(Object obj) {
        C70862aj ajVar = this.f51803a;
        C65697w wVar = (C65697w) obj;
        if (wVar.f178497a == 2) {
            C65699y yVar = (C65699y) wVar.f178498b;
            if (yVar.f178503b != 0) {
                ajVar.mo20122b(C18253ak.m35565d(yVar).asException());
                return;
            }
        }
        ajVar.mo20123c(wVar);
        ajVar.mo20121a();
    }
}
