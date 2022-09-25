package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.Callable;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.q */
/* compiled from: PG */
public final /* synthetic */ class C94919q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C94925w f265523a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f265524b;

    public /* synthetic */ C94919q(C94925w wVar, byte[] bArr) {
        this.f265523a = wVar;
        this.f265524b = bArr;
    }

    public final Object call() {
        C94925w wVar = this.f265523a;
        byte[] bArr = this.f265524b;
        C59104x b = C94925w.f265529a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoProxyHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17604)).mo56386p("sendS3Request");
        if (wVar.f265532d.get()) {
            try {
                C66607ce ceVar = (C66607ce) C62942bv.parseFrom((C62942bv) C66607ce.f181191f, bArr, C62921ba.m95368a());
                synchronized (wVar) {
                    C70862aj ajVar = wVar.f265531c;
                    if (ajVar != null) {
                        ajVar.mo20123c(ceVar);
                    }
                }
                return C118826c.f331422a;
            } catch (C62974ct e) {
                wVar.mo88834e(3);
                throw e;
            }
        } else {
            C59104x c = C94925w.f265529a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoProxyHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17605)).mo56386p("connection not started");
            wVar.mo88834e(6);
            throw new Exception("Connection not started");
        }
    }
}
