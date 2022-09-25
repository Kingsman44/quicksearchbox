package com.google.android.libraries.search.p3055n.p3056a.p3057a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.p3523p.p3524a.C45017b;
import com.google.android.p3523p.p3524a.C45018c;
import com.google.android.p3523p.p3524a.C45020e;
import com.google.android.p3523p.p3524a.C45021f;
import com.google.android.p3523p.p3524a.C45022g;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.p5219a.C66752s;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.n.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C39245d implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39250i f103382a;

    /* renamed from: b */
    public final /* synthetic */ C66999hh f103383b;

    /* renamed from: c */
    public final /* synthetic */ C66752s f103384c;

    public /* synthetic */ C39245d(C39250i iVar, C66999hh hhVar, C66752s sVar) {
        this.f103382a = iVar;
        this.f103383b = hhVar;
        this.f103384c = sVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C39250i iVar = this.f103382a;
        C66999hh hhVar = this.f103383b;
        C66752s sVar = this.f103384c;
        C45021f fVar = (C45021f) C45022g.f117632d.createBuilder();
        fVar.copyOnWrite();
        C45022g gVar = (C45022g) fVar.instance;
        hhVar.getClass();
        gVar.f117635b = hhVar;
        gVar.f117634a |= 1;
        fVar.copyOnWrite();
        C45022g gVar2 = (C45022g) fVar.instance;
        sVar.getClass();
        gVar2.f117636c = sVar;
        gVar2.f117634a |= 4;
        C45022g gVar3 = (C45022g) fVar.build();
        C45017b bVar = (C45017b) iVar.f103389b.get();
        C39248g gVar4 = new C39248g(cVar);
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C45018c.f117628a;
        if (diVar == null) {
            synchronized (C45018c.class) {
                diVar = C45018c.f117628a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("speech.data.device_testing.art.device.ArtSodaEventConsumerService", "GetArtSodaEventConsumerServiceClientInfo");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C45022g.f117632d);
                    d.f187486b = C70850d.m103697c(C45020e.f117630a);
                    diVar = d.mo62040a();
                    C45018c.f117628a = diVar;
                }
            }
        }
        C70876o.m103763d(jVar.mo39510a(diVar, bVar.f189040b), gVar3, gVar4, false);
        return "Waiting for ClientInfo from ART";
    }
}
