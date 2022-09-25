package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.p1003a;

import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13612a;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13619c;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13620d;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13621e;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13623g;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13625i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.a.c */
/* compiled from: PG */
public final class C13615c implements C13612a {

    /* renamed from: a */
    public static final C58974d f41642a = C58974d.m91136j();

    /* renamed from: b */
    private final C60888db f41643b;

    /* renamed from: c */
    private final C13619c f41644c;

    /* renamed from: d */
    private final C60845bz f41645d = new C13613a();

    /* renamed from: e */
    private final C60845bz f41646e = new C13614b();

    public C13615c(C13619c cVar, C60888db dbVar) {
        this.f41643b = dbVar;
        this.f41644c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo21190a() {
        C60870cx c = mo21192c(4);
        C60845bz bzVar = this.f41645d;
        C60856cj.m92911t(c, C47810es.m84974n(bzVar), this.f41643b);
        return c;
    }

    /* renamed from: b */
    public final C60870cx mo21191b() {
        C60870cx c = mo21192c(3);
        C60845bz bzVar = this.f41646e;
        C60856cj.m92911t(c, C47810es.m84974n(bzVar), this.f41643b);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60870cx mo21192c(int i) {
        C13621e eVar = (C13621e) C13623g.f41649c.createBuilder();
        eVar.copyOnWrite();
        C13623g gVar = (C13623g) eVar.instance;
        gVar.f41652b = i - 1;
        gVar.f41651a |= 1;
        C13623g gVar2 = (C13623g) eVar.build();
        C13619c cVar = this.f41644c;
        C70888j jVar = cVar.f189039a;
        C70338di diVar = C13620d.f41647a;
        if (diVar == null) {
            synchronized (C13620d.class) {
                diVar = C13620d.f41647a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.auto.tng.gmm.grpc.staterequest.proto.GmmStateService", "FetchGmmState");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C13623g.f41649c);
                    d.f187486b = C70850d.m103697c(C13625i.f41653c);
                    C70338di a = d.mo62040a();
                    C13620d.f41647a = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, cVar.f189040b), gVar2);
    }
}
