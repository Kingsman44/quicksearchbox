package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37648h;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37704j;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.C38121w;
import com.google.android.libraries.search.p2904c.C38160x;
import com.google.android.libraries.search.p2904c.C38284z;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2951n.C37900b;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.android.libraries.search.p2904c.p2982x.C38234aq;
import com.google.android.libraries.search.p2904c.p2982x.C38235ar;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.c.x.a.w */
/* compiled from: PG */
public final /* synthetic */ class C38214w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C38166ad f101290a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f101291b;

    public /* synthetic */ C38214w(C38166ad adVar, Runnable runnable) {
        this.f101290a = adVar;
        this.f101291b = runnable;
    }

    public final void run() {
        C38166ad adVar = this.f101290a;
        Runnable runnable = this.f101291b;
        C37321a aVar = (C37321a) adVar.f101129b.mo41050b().mo56107c();
        C37662hi hiVar = adVar.f101130c.f101377b;
        if (hiVar == null) {
            hiVar = C37662hi.f100030g;
        }
        C37360ay ayVar = hiVar.f100035d;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        int c = C37329d.m66335c(ayVar);
        C58833ax d = adVar.f101129b.mo41052d();
        byte[] bArr = new byte[c];
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int a = aVar.mo40879a(bArr, i2, i, c);
                if (a >= 0) {
                    if (a > 0) {
                        try {
                            C38234aq aqVar = (C38234aq) C38235ar.f101329c.createBuilder();
                            C37704j jVar = (C37704j) C37819l.f100340e.createBuilder();
                            C37648h hVar = (C37648h) C37680i.f100071c.createBuilder();
                            C63088z D = C63088z.m96142D(bArr, i, a);
                            hVar.copyOnWrite();
                            C37680i iVar = (C37680i) hVar.instance;
                            iVar.f100073a |= 1;
                            iVar.f100074b = D;
                            C37680i iVar2 = (C37680i) hVar.build();
                            jVar.copyOnWrite();
                            C37819l lVar = (C37819l) jVar.instance;
                            iVar2.getClass();
                            lVar.f100344c = iVar2;
                            lVar.f100343b = 1;
                            C37819l lVar2 = (C37819l) jVar.build();
                            aqVar.copyOnWrite();
                            C38235ar arVar = (C38235ar) aqVar.instance;
                            lVar2.getClass();
                            arVar.f101332b = lVar2;
                            arVar.f101331a = 6;
                            adVar.mo41302h((C38235ar) aqVar.build());
                            i2 += a;
                        } catch (C70761fa e) {
                            C59104x d2 = C38166ad.f101128a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
                            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(53024)).mo56389s("#audio# sendAudioAccessorStreamForHotwordBlocking failed: StatusRuntimeException %s.", e.f188571a.getCode());
                            if (!e.f188571a.getCode().equals(Status.Code.CANCELLED)) {
                                ((C38213v) runnable).f101289a.mo41297c();
                                adVar.mo41299e(e);
                                return;
                            }
                        }
                    }
                    i = 0;
                } else {
                    C38234aq aqVar2 = (C38234aq) C38235ar.f101329c.createBuilder();
                    C37704j jVar2 = (C37704j) C37819l.f100340e.createBuilder();
                    C38121w wVar = (C38121w) C38160x.f101118c.createBuilder();
                    C38284z zVar = C38284z.SUCCESS;
                    wVar.copyOnWrite();
                    C38160x xVar = (C38160x) wVar.instance;
                    xVar.f101121b = zVar.f101427c;
                    xVar.f101120a |= 1;
                    C38160x xVar2 = (C38160x) wVar.build();
                    jVar2.copyOnWrite();
                    C37819l lVar3 = (C37819l) jVar2.instance;
                    xVar2.getClass();
                    lVar3.f100344c = xVar2;
                    lVar3.f100343b = 2;
                    aqVar2.copyOnWrite();
                    C38235ar arVar2 = (C38235ar) aqVar2.instance;
                    C37819l lVar4 = (C37819l) jVar2.build();
                    lVar4.getClass();
                    arVar2.f101332b = lVar4;
                    arVar2.f101331a = 6;
                    adVar.mo41302h((C38235ar) aqVar2.build());
                    adVar.mo41295a(d);
                    return;
                }
            } catch (C37900b | C37901c e2) {
                C59104x d3 = C38166ad.f101128a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e2)).mo56372aa(53025)).mo56386p("#audio# sendAudioAccessorStreamForHotwordBlocking failed: overflow or interrupted.");
                ((C38213v) runnable).f101289a.mo41297c();
                adVar.mo41299e(e2);
                return;
            }
        }
    }
}
