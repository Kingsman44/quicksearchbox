package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37615g;
import com.google.android.libraries.search.p2904c.C37648h;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37704j;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.C38121w;
import com.google.android.libraries.search.p2904c.C38160x;
import com.google.android.libraries.search.p2904c.C38284z;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.android.libraries.search.p2904c.p2982x.C38239av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.x.a.am */
/* compiled from: PG */
final class C38175am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C38181as f101166a;

    /* renamed from: b */
    final /* synthetic */ C37400be f101167b;

    /* renamed from: c */
    final /* synthetic */ C37360ay f101168c;

    public C38175am(C38181as asVar, C37400be beVar, C37360ay ayVar) {
        this.f101166a = asVar;
        this.f101167b = beVar;
        this.f101168c = ayVar;
    }

    public final void run() {
        Object obj;
        C38181as asVar = this.f101166a;
        Object c = this.f101167b.mo40930b().mo56107c();
        C69664n.m101060f(c, "startListeningResult.audioAccessor.get()");
        C37321a aVar = (C37321a) c;
        C37360ay ayVar = this.f101168c;
        C58976aa aaVar = C58975e.f156826a;
        int c2 = C37329d.m66335c(ayVar);
        byte[] bArr = new byte[c2];
        int i = 0;
        while (true) {
            try {
                obj = Integer.valueOf(aVar.mo40879a(bArr, i, 0, c2));
            } catch (Throwable th) {
                obj = C69714l.m101133a(th);
            }
            Throwable a = C69702k.m101124a(obj);
            if (a == null) {
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    C38236as asVar2 = (C38236as) C38237at.f101333c.createBuilder();
                    C69664n.m101060f(asVar2, "newBuilder()");
                    C38239av a2 = C69664n.m101061g(asVar2, "builder");
                    C37704j jVar = (C37704j) C37819l.f100340e.createBuilder();
                    C69664n.m101060f(jVar, "newBuilder()");
                    C37615g a3 = C69664n.m101061g(jVar, "builder");
                    C38121w wVar = (C38121w) C38160x.f101118c.createBuilder();
                    C69664n.m101060f(wVar, "newBuilder()");
                    C69664n.m101061g(wVar, "builder");
                    C38284z zVar = C38284z.SUCCESS;
                    C69664n.m101061g(zVar, "value");
                    wVar.copyOnWrite();
                    C38160x xVar = (C38160x) wVar.instance;
                    xVar.f101121b = zVar.f101427c;
                    xVar.f101120a |= 1;
                    C62942bv build = wVar.build();
                    C69664n.m101060f(build, "_builder.build()");
                    C38160x xVar2 = (C38160x) build;
                    C69664n.m101061g(xVar2, "value");
                    C37704j jVar2 = a3.f99957a;
                    jVar2.copyOnWrite();
                    C37819l lVar = (C37819l) jVar2.instance;
                    xVar2.getClass();
                    lVar.f100344c = xVar2;
                    lVar.f100343b = 2;
                    a2.mo41343b(a3.mo41030a());
                    asVar.mo41307d(a2.mo41342a());
                    return;
                } else if (intValue > 0) {
                    i += intValue;
                    C38236as asVar3 = (C38236as) C38237at.f101333c.createBuilder();
                    C69664n.m101060f(asVar3, "newBuilder()");
                    C38239av a4 = C69664n.m101061g(asVar3, "builder");
                    C37704j jVar3 = (C37704j) C37819l.f100340e.createBuilder();
                    C69664n.m101060f(jVar3, "newBuilder()");
                    C37615g a5 = C69664n.m101061g(jVar3, "builder");
                    C37648h hVar = (C37648h) C37680i.f100071c.createBuilder();
                    C69664n.m101060f(hVar, "newBuilder()");
                    C69664n.m101061g(hVar, "builder");
                    C63088z D = C63088z.m96142D(bArr, 0, intValue);
                    hVar.copyOnWrite();
                    C37680i iVar = (C37680i) hVar.instance;
                    iVar.f100073a |= 1;
                    iVar.f100074b = D;
                    C62942bv build2 = hVar.build();
                    C69664n.m101060f(build2, "_builder.build()");
                    C37680i iVar2 = (C37680i) build2;
                    C69664n.m101061g(iVar2, "value");
                    C37704j jVar4 = a5.f99957a;
                    jVar4.copyOnWrite();
                    C37819l lVar2 = (C37819l) jVar4.instance;
                    iVar2.getClass();
                    lVar2.f100344c = iVar2;
                    lVar2.f100343b = 1;
                    a4.mo41343b(a5.mo41030a());
                    if (C69702k.m101124a(asVar.mo41307d(a4.mo41342a())) != null) {
                        C59052c cVar = (C59052c) C38181as.f101186a.mo56226d();
                        cVar.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSenderV2");
                        cVar.mo56379ah(new C59094n(53043));
                        cVar.mo56386p("#audio# Stopping sending bytes to the remote client");
                        return;
                    }
                }
            } else {
                C59052c cVar2 = (C59052c) C38181as.f101186a.mo56226d();
                cVar2.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSenderV2");
                C59052c cVar3 = (C59052c) cVar2.mo56382g(a);
                cVar3.mo56379ah(new C59094n(53042));
                cVar3.mo56386p("#audio# Cannot read next audio data on behalf of the remote client, shutting down");
                asVar.mo41310g(a);
                return;
            }
        }
    }
}
