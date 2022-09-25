package com.google.android.libraries.assistant.pcp.p1557g.p1563d;

import com.google.assistant.p3803ag.p3809c.C49120he;
import com.google.assistant.p3803ag.p3809c.C49122hg;
import com.google.assistant.p3803ag.p3810d.C49161b;
import com.google.assistant.p3803ag.p3810d.C49162c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.pcp.g.d.e */
/* compiled from: PG */
public final /* synthetic */ class C18761e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C49161b f52871a;

    public /* synthetic */ C18761e(C49161b bVar) {
        this.f52871a = bVar;
    }

    public final C60870cx apply(Object obj) {
        C49161b bVar = this.f52871a;
        C49120he heVar = (C49120he) obj;
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C49162c.f127129a;
        if (diVar == null) {
            synchronized (C49162c.class) {
                diVar = C49162c.f127129a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.proactive.v1.ProactiveBackend", "Sync");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C49120he.f127037e);
                    d.f187486b = C70850d.m103697c(C49122hg.f127044d);
                    diVar = d.mo62040a();
                    C49162c.f127129a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), heVar);
    }
}
