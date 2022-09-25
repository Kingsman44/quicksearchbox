package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.youtube.p5162a.p5163a.C65977ag;
import com.google.protos.youtube.p5162a.p5163a.C65978ah;
import com.google.protos.youtube.p5162a.p5163a.C65979ai;
import com.google.protos.youtube.p5162a.p5163a.C65980aj;
import com.google.protos.youtube.p5162a.p5163a.C65990g;
import com.google.protos.youtube.p5162a.p5163a.C65991h;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.c */
/* compiled from: PG */
public final /* synthetic */ class C10628c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f35508a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f35509b;

    public /* synthetic */ C10628c(C60870cx cxVar, C60870cx cxVar2) {
        this.f35508a = cxVar;
        this.f35509b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f35508a;
        C60870cx cxVar2 = this.f35509b;
        C65980aj ajVar = (C65980aj) C60856cj.m92909r(cxVar);
        if (((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            return ajVar;
        }
        C65979ai aiVar = (C65979ai) ajVar.toBuilder();
        C65991h hVar = ajVar.f179456b;
        if (hVar == null) {
            hVar = C65991h.f179478e;
        }
        C65990g gVar = (C65990g) hVar.toBuilder();
        C65991h hVar2 = ajVar.f179456b;
        if (hVar2 == null) {
            hVar2 = C65991h.f179478e;
        }
        C65978ah ahVar = hVar2.f179483d;
        if (ahVar == null) {
            ahVar = C65978ah.f179448d;
        }
        C65977ag agVar = (C65977ag) ahVar.toBuilder();
        agVar.copyOnWrite();
        C65978ah ahVar2 = (C65978ah) agVar.instance;
        ahVar2.f179450a |= 2;
        ahVar2.f179452c = true;
        gVar.copyOnWrite();
        C65991h hVar3 = (C65991h) gVar.instance;
        C65978ah ahVar3 = (C65978ah) agVar.build();
        ahVar3.getClass();
        hVar3.f179483d = ahVar3;
        hVar3.f179480a |= 4;
        aiVar.copyOnWrite();
        C65980aj ajVar2 = (C65980aj) aiVar.instance;
        C65991h hVar4 = (C65991h) gVar.build();
        hVar4.getClass();
        ajVar2.f179456b = hVar4;
        ajVar2.f179455a |= 1;
        return (C65980aj) aiVar.build();
    }
}
