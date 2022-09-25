package com.google.android.libraries.surveys.internal.p3325d.p3326a;

import android.util.Log;
import com.google.android.libraries.surveys.internal.p3325d.C43051c;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4281bu.p4282a.C56516b;
import com.google.p4281bu.p4282a.C56570d;
import com.google.p4281bu.p4282a.C56577dg;
import com.google.p4281bu.p4282a.C56578dh;
import com.google.p4651h.p4652a.C61647d;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5520a.C70136d;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.surveys.internal.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C43038a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C43043f f112573a;

    /* renamed from: b */
    public final /* synthetic */ C56516b f112574b;

    /* renamed from: c */
    public final /* synthetic */ C43060i f112575c;

    public /* synthetic */ C43038a(C43043f fVar, C56516b bVar, C43060i iVar) {
        this.f112573a = fVar;
        this.f112574b = bVar;
        this.f112575c = iVar;
    }

    public final void run() {
        C60870cx cxVar;
        C43043f fVar = this.f112573a;
        C56516b bVar = this.f112574b;
        C43060i iVar = this.f112575c;
        C61647d f = fVar.mo46074f();
        C70888j a = fVar.mo46063a(f);
        if (a == null) {
            Log.e("NetworkCallerGrpc", "Could not get channel for recordEvent.");
            return;
        }
        if (f != null) {
            C56577dg dgVar = (C56577dg) C56578dh.m88214a(a).mo62574m(new C70136d(f, C70136d.f186958b));
            C70888j jVar = dgVar.f189039a;
            C70338di diVar = C56578dh.f151063c;
            if (diVar == null) {
                synchronized (C56578dh.class) {
                    diVar = C56578dh.f151063c;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("scone.v1.SurveyService", "RecordEvent");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C56516b.f150930c);
                        d.f187486b = C70850d.m103697c(C56570d.f151046a);
                        C70338di a2 = d.mo62040a();
                        C56578dh.f151063c = a2;
                        diVar = a2;
                    }
                }
            }
            cxVar = C70876o.m103760a(jVar.mo39510a(diVar, dgVar.f189040b), bVar);
        } else {
            C56577dg a3 = C56578dh.m88214a(a);
            C70888j jVar2 = a3.f189039a;
            C70338di diVar2 = C56578dh.f151064d;
            if (diVar2 == null) {
                synchronized (C56578dh.class) {
                    diVar2 = C56578dh.f151064d;
                    if (diVar2 == null) {
                        C70335df d2 = C70338di.m102603d();
                        d2.f187487c = C70337dh.UNARY;
                        d2.f187488d = C70338di.m102602c("scone.v1.SurveyService", "RecordEventAnonymous");
                        d2.f187489e = true;
                        d2.f187485a = C70850d.m103697c(C56516b.f150930c);
                        d2.f187486b = C70850d.m103697c(C56570d.f151046a);
                        C70338di a4 = d2.mo62040a();
                        C56578dh.f151064d = a4;
                        diVar2 = a4;
                    }
                }
            }
            cxVar = C70876o.m103760a(jVar2.mo39510a(diVar2, a3.f189040b), bVar);
        }
        C60856cj.m92911t(cxVar, new C43041d(fVar, bVar, iVar), C43051c.m75956a());
    }
}
