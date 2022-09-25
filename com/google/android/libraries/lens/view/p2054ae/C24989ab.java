package com.google.android.libraries.lens.view.p2054ae;

import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2070an.C25387ay;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25395ae;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25396af;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59884at;
import com.google.common.p4552o.p4563i.C59885au;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.protobuf.C62940bt;
import org.chromium.net.NetworkException;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.lens.view.ae.ab */
/* compiled from: PG */
public final /* synthetic */ class C24989ab implements C25026y {

    /* renamed from: a */
    public final /* synthetic */ C24991ad f68151a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f68152b;

    /* renamed from: c */
    public final /* synthetic */ int f68153c;

    public /* synthetic */ C24989ab(C24991ad adVar, Throwable th, int i) {
        this.f68151a = adVar;
        this.f68152b = th;
        this.f68153c = i;
    }

    /* renamed from: a */
    public final void mo30208a(C25395ae aeVar) {
        C24991ad adVar = this.f68151a;
        Throwable th = this.f68152b;
        int i = this.f68153c;
        if (adVar.f68155a.f68162g == adVar) {
            ((C58970a) ((C58970a) ((C58970a) C24992ae.f68156a.mo56226d()).mo56382g(th)).mo56372aa(49633)).mo56386p("Stream error occurred");
            C25387ay.m46760a();
            C25396af afVar = aeVar.f69176a;
            if (afVar.f69197s == aeVar) {
                ((C58970a) ((C58970a) C25396af.f69177a.mo56226d()).mo56372aa(49887)).mo56386p("Stop streaming due to LensFe error");
                afVar.mo30443k(th);
                Status d = Status.m102100d(th);
                C25043ao aoVar = afVar.f69187i;
                if (aoVar != null) {
                    ((C19567d) aoVar.f68260l.mo6453a()).mo24822a(1, d.getCode().name());
                }
            }
            C58833ax axVar = adVar.f68155a.f68157b;
            if (axVar.mo56113h()) {
                C25010i iVar = (C25010i) axVar.mo56107c();
                C59884at atVar = (C59884at) C59885au.f161823e.createBuilder();
                if (th instanceof NetworkException) {
                    NetworkException networkException = (NetworkException) th;
                    int errorCode = networkException.getErrorCode();
                    atVar.copyOnWrite();
                    C59885au auVar = (C59885au) atVar.instance;
                    auVar.f161825a |= 1;
                    auVar.f161826b = errorCode;
                    int cronetInternalErrorCode = networkException.getCronetInternalErrorCode();
                    atVar.copyOnWrite();
                    C59885au auVar2 = (C59885au) atVar.instance;
                    auVar2.f161825a |= 2;
                    auVar2.f161827c = cronetInternalErrorCode;
                }
                if (th instanceof C90457d) {
                    int i2 = ((C90457d) th).f252687a;
                    atVar.copyOnWrite();
                    C59885au auVar3 = (C59885au) atVar.instance;
                    auVar3.f161825a |= 1;
                    auVar3.f161826b = i2;
                }
                if (th != null) {
                    int value = Status.m102100d(th).getCode().value();
                    atVar.copyOnWrite();
                    C59885au auVar4 = (C59885au) atVar.instance;
                    auVar4.f161825a |= 4;
                    auVar4.f161828d = value;
                }
                C25005e eVar = iVar.f68200a;
                C37252a d2 = C37194a.f98636o.mo40811d(iVar.f68202c.mo26872d());
                d2.mo40780d(i, "LENS_GRPC_ERROR");
                C62940bt btVar = C59898bg.f161867w;
                C59870af afVar2 = (C59870af) C59898bg.f161866v.createBuilder();
                C59885au auVar5 = (C59885au) atVar.build();
                afVar2.copyOnWrite();
                C59898bg bgVar = (C59898bg) afVar2.instance;
                auVar5.getClass();
                bgVar.f161870b = auVar5;
                bgVar.f161869a |= 1;
                ((C37253b) d2).mo40792p(btVar, (C59898bg) afVar2.build());
                eVar.mo30222a(d2);
                C25005e eVar2 = iVar.f68200a;
                C37252a d3 = C37194a.f98638q.mo40811d(iVar.f68202c.mo26872d());
                d3.mo40780d(i, "LENS_GRPC_ERROR");
                C62940bt btVar2 = C59898bg.f161867w;
                C59870af afVar3 = (C59870af) C59898bg.f161866v.createBuilder();
                C59885au auVar6 = (C59885au) atVar.build();
                afVar3.copyOnWrite();
                C59898bg bgVar2 = (C59898bg) afVar3.instance;
                auVar6.getClass();
                bgVar2.f161870b = auVar6;
                bgVar2.f161869a |= 1;
                ((C37253b) d3).mo40792p(btVar2, (C59898bg) afVar3.build());
                eVar2.mo30222a(d3);
            }
        }
    }
}
