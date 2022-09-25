package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69677g;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.j */
/* compiled from: PG */
public final class C120064j implements C120058d {

    /* renamed from: a */
    public static final C59071e f334241a = C59071e.m91331h();

    /* renamed from: b */
    private final C120041ac f334242b;

    /* renamed from: c */
    private final C71422aw f334243c;

    public C120064j(C120041ac acVar, C71422aw awVar) {
        C69664n.m101061g(acVar, "stub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f334242b = acVar;
        this.f334243c = awVar;
    }

    /* renamed from: a */
    public final C120059e mo104655a(C120124o oVar, C120124o oVar2, C120077w wVar) {
        C120055aq aqVar;
        C69664n.m101061g(oVar, "sessionVariance");
        C69664n.m101061g(oVar2, "baselinePlatformVariance");
        C69664n.m101061g(wVar, "listener");
        C120046ah ahVar = (C120046ah) C120047ai.f334213b.createBuilder();
        C69664n.m101060f(ahVar, "newBuilder()");
        C69664n.m101061g(ahVar, "builder");
        C120124o oVar3 = C120124o.CLASSIC;
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            aqVar = C120055aq.CLASSIC;
        } else if (ordinal == 1) {
            aqVar = C120055aq.APA;
        } else {
            throw new C69677g();
        }
        C69664n.m101061g(aqVar, "value");
        ahVar.copyOnWrite();
        ((C120047ai) ahVar.instance).f334215a = aqVar.getNumber();
        C62942bv build = ahVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C120047ai aiVar = (C120047ai) build;
        AtomicReference atomicReference = new AtomicReference(oVar2);
        C120041ac acVar = this.f334242b;
        C70334de deVar = new C70334de();
        C69664n.m101061g(aiVar, "request");
        return new C120059e(C71594u.m104517d(C71477ah.m104295b(C71477ah.m104296c(C71486aq.m104308b(C71536cm.m104384b(C70748n.m103449b(acVar.f189039a, C120080z.m199004a(), aiVar, acVar.f189040b, deVar), new C120060f(oVar, wVar, atomicReference, (C69577g) null)), new C120061g(oVar, (C69577g) null)), new C120062h(oVar, (C69577g) null)), new C120063i(oVar, (C69577g) null)), this.f334243c));
    }
}
