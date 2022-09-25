package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import java.io.File;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.j */
/* compiled from: PG */
public final /* synthetic */ class C17560j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17565o f50616a;

    /* renamed from: b */
    public final /* synthetic */ C17564n f50617b;

    public /* synthetic */ C17560j(C17565o oVar, C17564n nVar) {
        this.f50616a = oVar;
        this.f50617b = nVar;
    }

    public final void run() {
        C17565o oVar = this.f50616a;
        C17564n nVar = this.f50617b;
        nVar.f50625a.stop();
        nVar.mo23394a(oVar.f50630d);
        ((C2164c) oVar.f50634h.get()).mo5437b(C17586a.m34876c(4));
        if (((Optional) oVar.f50631e.mo6453a()).isPresent()) {
            ((File) ((Optional) oVar.f50631e.mo6453a()).get()).delete();
        }
    }
}
