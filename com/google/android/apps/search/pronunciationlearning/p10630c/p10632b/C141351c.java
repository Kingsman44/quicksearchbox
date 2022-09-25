package com.google.android.apps.search.pronunciationlearning.p10630c.p10632b;

import com.google.android.apps.search.pronunciationlearning.p10630c.p10634d.C141359a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54528a;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54532b;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54534d;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54535e;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54536f;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54537g;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54538h;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54540j;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54541k;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.pronunciationlearning.c.b.c */
/* compiled from: PG */
public final /* synthetic */ class C141351c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141355g f383734a;

    /* renamed from: b */
    public final /* synthetic */ List f383735b;

    public /* synthetic */ C141351c(C141355g gVar, List list) {
        this.f383734a = gVar;
        this.f383735b = list;
    }

    public final C60870cx apply(Object obj) {
        C141355g gVar = this.f383734a;
        List<String> list = this.f383735b;
        InputStream inputStream = (InputStream) obj;
        C54540j jVar = (C54540j) gVar.f383742c.f383754c.mo17428b();
        C54528a aVar = (C54528a) C54532b.f143180e.createBuilder();
        aVar.copyOnWrite();
        ((C54532b) aVar.instance).f143185d = 1;
        aVar.copyOnWrite();
        ((C54532b) aVar.instance).f143183b = 16000;
        for (String str : list) {
            C54535e eVar = (C54535e) C54536f.f143189b.createBuilder();
            ArrayList<String> arrayList = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (Character.isLetter(charAt) || C141359a.f383753b.contains(Character.valueOf(charAt))) {
                    sb.append(charAt);
                } else if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
            if (sb.length() != 0) {
                arrayList.add(sb.toString());
            }
            for (String str2 : arrayList) {
                C54537g gVar2 = (C54537g) C54538h.f143192b.createBuilder();
                gVar2.copyOnWrite();
                C54538h hVar = (C54538h) gVar2.instance;
                str2.getClass();
                C62971cq cqVar = hVar.f143194a;
                if (!cqVar.mo58948c()) {
                    hVar.f143194a = C62942bv.mutableCopy(cqVar);
                }
                hVar.f143194a.add(str2);
                eVar.copyOnWrite();
                C54536f fVar = (C54536f) eVar.instance;
                C54538h hVar2 = (C54538h) gVar2.build();
                hVar2.getClass();
                C62971cq cqVar2 = fVar.f143191a;
                if (!cqVar2.mo58948c()) {
                    fVar.f143191a = C62942bv.mutableCopy(cqVar2);
                }
                fVar.f143191a.add(hVar2);
            }
            aVar.copyOnWrite();
            C54532b bVar = (C54532b) aVar.instance;
            C54536f fVar2 = (C54536f) eVar.build();
            fVar2.getClass();
            C62971cq cqVar3 = bVar.f143182a;
            if (!cqVar3.mo58948c()) {
                bVar.f143182a = C62942bv.mutableCopy(cqVar3);
            }
            bVar.f143182a.add(fVar2);
        }
        try {
            C63088z F = C63088z.m96144F(inputStream);
            aVar.copyOnWrite();
            F.getClass();
            ((C54532b) aVar.instance).f143184c = F;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C141359a.f383752a.mo56226d()).mo56382g(e)).mo56372aa(41684)).mo56386p("fail to read audio");
        }
        C54532b bVar2 = (C54532b) aVar.build();
        C70888j jVar2 = jVar.f189039a;
        C70338di diVar = C54541k.f143195a;
        if (diVar == null) {
            synchronized (C54541k.class) {
                diVar = C54541k.f143195a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.pronto.v1.ProntoService", "GetPronunciationAnalysis");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54532b.f143180e);
                    d.f187486b = C70850d.m103697c(C54534d.f143186b);
                    diVar = d.mo62040a();
                    C54541k.f143195a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar2.mo39510a(diVar, jVar.f189040b), bVar2);
    }
}
