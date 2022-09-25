package com.google.android.apps.search.weather.p10687f;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p395al.p417d.p418a.C8581h;
import com.google.p395al.p417d.p418a.C8582i;
import com.google.p4017at.p4060h.p4075e.p4076a.C54266b;
import com.google.p4017at.p4060h.p4075e.p4076a.C54272h;
import com.google.p4017at.p4060h.p4075e.p4076a.C54274j;
import com.google.p4017at.p4060h.p4075e.p4076a.C54275k;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58130a;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4813ah.p4814a.p4815a.C63174g;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63178k;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import com.google.protos.p4813ah.p4814a.p4815a.C63180m;
import com.google.protos.p4813ah.p4814a.p4815a.C63181n;
import com.google.protos.p4813ah.p4814a.p4815a.C63183p;
import com.google.protos.p4813ah.p4814a.p4815a.C63185r;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.weather.f.b */
/* compiled from: PG */
public final /* synthetic */ class C142089b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C142090c f385496a;

    /* renamed from: b */
    public final /* synthetic */ String f385497b;

    public /* synthetic */ C142089b(C142090c cVar, String str) {
        this.f385496a = cVar;
        this.f385497b = str;
    }

    public final C60870cx apply(Object obj) {
        C142090c cVar = this.f385496a;
        String str = this.f385497b;
        C54266b bVar = (C54266b) obj;
        C54274j jVar = cVar.f385498a;
        C70899n[] nVarArr = new C70899n[1];
        C70334de deVar = new C70334de();
        C70297cz c = C70297cz.m102495c("X-Client-Data-bin", C70334de.f187480b);
        C58130a aVar = (C58130a) C58131b.f155403h.createBuilder();
        aVar.copyOnWrite();
        C58131b bVar2 = (C58131b) aVar.instance;
        bVar2.mo54675a();
        bVar2.f155409e.mo58916g(4509622);
        deVar.mo62033h(c, ((C58131b) aVar.build()).toByteArray());
        C70297cz c2 = C70297cz.m102495c("X-Language-bin", C70334de.f187480b);
        C8581h hVar = (C8581h) C8582i.f29706c.createBuilder();
        hVar.copyOnWrite();
        C8582i iVar = (C8582i) hVar.instance;
        str.getClass();
        iVar.f29708a |= 1;
        iVar.f29709b = str;
        deVar.mo62033h(c2, ((C8582i) hVar.build()).toByteArray());
        if ((bVar.f142489a & 1) != 0) {
            C67962d dVar = bVar.f142490b;
            if (dVar == null) {
                dVar = C67962d.f184173g;
            }
            C63174g gVar = (C63174g) C63175h.f170573d.createBuilder();
            float f = dVar.f184177c;
            gVar.copyOnWrite();
            C63175h hVar2 = (C63175h) gVar.instance;
            hVar2.f170575a |= 1;
            double d = (double) f;
            Double.isNaN(d);
            hVar2.f170576b = (int) (d * 1.0E7d);
            float f2 = dVar.f184178d;
            gVar.copyOnWrite();
            C63175h hVar3 = (C63175h) gVar.instance;
            hVar3.f170575a |= 2;
            double d2 = (double) f2;
            Double.isNaN(d2);
            hVar3.f170577c = (int) (d2 * 1.0E7d);
            C63175h hVar4 = (C63175h) gVar.build();
            C63180m mVar = (C63180m) C63181n.f170592b.createBuilder();
            C63178k kVar = (C63178k) C63179l.f170583h.createBuilder();
            C63185r rVar = C63185r.CURRENT_LOCATION;
            kVar.copyOnWrite();
            C63179l lVar = (C63179l) kVar.instance;
            lVar.f170586b = rVar.f170696o;
            lVar.f170585a |= 1;
            C63183p pVar = C63183p.DEVICE_LOCATION;
            kVar.copyOnWrite();
            C63179l lVar2 = (C63179l) kVar.instance;
            lVar2.f170587c = pVar.f170679aE;
            lVar2.f170585a |= 2;
            kVar.copyOnWrite();
            C63179l lVar3 = (C63179l) kVar.instance;
            hVar4.getClass();
            lVar3.f170589e = hVar4;
            lVar3.f170585a |= 16;
            C63179l lVar4 = (C63179l) kVar.build();
            mVar.copyOnWrite();
            C63181n nVar = (C63181n) mVar.instance;
            lVar4.getClass();
            C62971cq cqVar = nVar.f170594a;
            if (!cqVar.mo58948c()) {
                nVar.f170594a = C62942bv.mutableCopy(cqVar);
            }
            nVar.f170594a.add(lVar4);
            deVar.mo62033h(C70297cz.m102495c("X-Geo-bin", C70334de.f187480b), ((C63181n) mVar.build()).toByteArray());
        }
        nVarArr[0] = new C70879r(deVar);
        C54274j jVar2 = (C54274j) jVar.mo62576o(nVarArr);
        C70888j jVar3 = jVar2.f189039a;
        C70338di diVar = C54275k.f142520a;
        if (diVar == null) {
            synchronized (C54275k.class) {
                diVar = C54275k.f142520a;
                if (diVar == null) {
                    C70335df d3 = C70338di.m102603d();
                    d3.f187487c = C70337dh.UNARY;
                    d3.f187488d = C70338di.m102602c("google.internal.mothership.weatherapp.v1.WeatherAppService", "GetWeatherApp");
                    d3.f187489e = true;
                    d3.f187485a = C70850d.m103697c(C54266b.f142487i);
                    d3.f187486b = C70850d.m103697c(C54272h.f142512f);
                    C70338di a = d3.mo62040a();
                    C54275k.f142520a = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar3.mo39510a(diVar, jVar2.f189040b), bVar);
    }
}
