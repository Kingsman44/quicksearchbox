package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9359a;

import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.p10879c.C146166b;
import com.google.android.gms.usonia.p10879c.C146168d;
import com.google.android.gms.usonia.p10879c.C146171g;
import com.google.assistant.p3741aa.C48169d;
import com.google.assistant.p3741aa.C48173h;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48141j;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48143l;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48144m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.a.g */
/* compiled from: PG */
public final /* synthetic */ class C124279g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124293u f343101a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f343102b;

    /* renamed from: c */
    public final /* synthetic */ C48169d f343103c;

    public /* synthetic */ C124279g(C124293u uVar, C60870cx cxVar, C48169d dVar) {
        this.f343101a = uVar;
        this.f343102b = cxVar;
        this.f343103c = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124293u uVar = this.f343101a;
        C60870cx cxVar = this.f343102b;
        C48169d dVar = this.f343103c;
        C146166b bVar = (C146166b) C60856cj.m92909r(uVar.f343125d);
        C146168d dVar2 = new C146168d();
        C48143l lVar = (C48143l) ((C48143l) bVar.mo122732c(C48141j.f124577a, (PeerAddress) C60856cj.m92909r(cxVar))).mo62576o(C146171g.m238097c("assistant_client.connect.CrossDeviceService", dVar2, bVar));
        C70888j jVar = lVar.f189039a;
        C70338di diVar = C48144m.f124578a;
        if (diVar == null) {
            synchronized (C48144m.class) {
                diVar = C48144m.f124578a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant_client.connect.CrossDeviceService", "ExecuteInteractionDelta");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C48169d.f124635g);
                    d.f187486b = C70850d.m103697c(C48173h.f124650e);
                    diVar = d.mo62040a();
                    C48144m.f124578a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, lVar.f189040b), dVar);
    }
}
