package com.google.frameworks.client.data.android.p4635c;

import com.google.common.p4526f.p4527a.C58970a;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;

/* renamed from: com.google.frameworks.client.data.android.c.b */
/* compiled from: PG */
public final /* synthetic */ class C61396b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61398d f166024a;

    public /* synthetic */ C61396b(C61398d dVar) {
        this.f166024a = dVar;
    }

    public final void run() {
        C61398d dVar = this.f166024a;
        try {
            for (String str : dVar.f166033f.mo62030e()) {
                if (!dVar.f166038k.contains(str)) {
                    if (str.endsWith("-bin")) {
                        dVar.f166033f.mo62038n(C70297cz.m102495c(str, C70334de.f187480b));
                    } else {
                        dVar.f166033f.mo62038n(new C70290cs(str, C70334de.f187481c));
                    }
                }
            }
            dVar.f166032e.mo58003c();
        } catch (Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C61398d.f166027a.mo56225c()).mo56382g(th)).mo56372aa(54884)).mo56386p("Could not write to cache");
        }
    }
}
