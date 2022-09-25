package com.google.android.apps.search.googleapp.promomanager.p10375d;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137046o;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54517a;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54520b;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54522d;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54524f;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54525g;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54526h;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54527i;
import com.google.protobuf.C63042fg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63945i;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63947k;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.d.c */
/* compiled from: PG */
public final /* synthetic */ class C137051c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C137054f f372976a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f372977b;

    public /* synthetic */ C137051c(C137054f fVar, C60870cx cxVar) {
        this.f372976a = fVar;
        this.f372977b = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C137054f fVar = this.f372976a;
        C63042fg fgVar = ((C137046o) C60856cj.m92909r(this.f372977b)).f372965b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C54517a aVar = (C54517a) C54520b.f143150d.createBuilder();
        C63945i iVar = (C63945i) C63947k.f172939c.createBuilder();
        iVar.copyOnWrite();
        C63947k kVar = (C63947k) iVar.instance;
        kVar.f172942b = 2;
        kVar.f172941a |= 1;
        aVar.copyOnWrite();
        C54520b bVar = (C54520b) aVar.instance;
        C63947k kVar2 = (C63947k) iVar.build();
        kVar2.getClass();
        bVar.f143153b = kVar2;
        bVar.f143152a |= 1;
        C54526h hVar = (C54526h) C54527i.f143162d.createBuilder();
        hVar.copyOnWrite();
        C54527i iVar2 = (C54527i) hVar.instance;
        fgVar.getClass();
        iVar2.f143165b = fgVar;
        iVar2.f143164a |= 1;
        String str = fVar.f372982c;
        hVar.copyOnWrite();
        C54527i iVar3 = (C54527i) hVar.instance;
        str.getClass();
        iVar3.f143164a = 2 | iVar3.f143164a;
        iVar3.f143166c = str;
        aVar.copyOnWrite();
        C54520b bVar2 = (C54520b) aVar.instance;
        C54527i iVar4 = (C54527i) hVar.build();
        iVar4.getClass();
        bVar2.f143154c = iVar4;
        bVar2.f143152a |= 4;
        C54520b bVar3 = (C54520b) aVar.build();
        fVar.f372985f.mo19974a(C37182a.f98153hN);
        C54524f fVar2 = fVar.f372983d;
        C70888j jVar = fVar2.f189039a;
        C70338di diVar = C54525g.f143161a;
        if (diVar == null) {
            synchronized (C54525g.class) {
                diVar = C54525g.f143161a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.promomanager.v2.PromoManagerService", "GetConfiguration");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54520b.f143150d);
                    d.f187486b = C70850d.m103697c(C54522d.f143156b);
                    diVar = d.mo62040a();
                    C54525g.f143161a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, fVar2.f189040b), bVar3);
    }
}
