package com.google.android.libraries.assistant.pcp.p1557g.p1558a;

import com.google.assistant.p3994s.p3995a.C53455on;
import com.google.assistant.p3994s.p3995a.C53459or;
import com.google.assistant.p4000v.C53492a;
import com.google.assistant.p4000v.C53493b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.frameworks.client.data.p4631a.C61331a;
import com.google.p4017at.p4099l.p4100a.C54561b;
import com.google.p4017at.p4099l.p4100a.C54562c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.assistant.pcp.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C18703a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C18707d f52769a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52770b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f52771c;

    public /* synthetic */ C18703a(C18707d dVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f52769a = dVar;
        this.f52770b = cxVar;
        this.f52771c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C18707d dVar = this.f52769a;
        C60870cx cxVar = this.f52770b;
        C60870cx cxVar2 = this.f52771c;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        C53492a aVar = (C53492a) C53493b.f140383b.createBuilder();
        Iterable iterable = (Iterable) ((Optional) C60856cj.m92909r(cxVar2)).orElse(C58485gu.m89845m());
        aVar.copyOnWrite();
        C53493b bVar = (C53493b) aVar.instance;
        C62971cq cqVar = bVar.f140385a;
        if (!cqVar.mo58948c()) {
            bVar.f140385a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f140385a);
        C70334de deVar = new C70334de();
        deVar.mo62033h(C70297cz.m102495c(C61331a.m93818a(310581576), C70334de.f187480b), ((C53493b) aVar.build()).toByteArray());
        C54561b bVar2 = (C54561b) dVar.f52775b.mo62576o(new C70879r(deVar));
        C53455on onVar = (C53455on) optional.orElse(C53455on.f140296d);
        C70888j jVar = bVar2.f189039a;
        C70338di diVar = C54562c.f143252c;
        if (diVar == null) {
            synchronized (C54562c.class) {
                diVar = C54562c.f143252c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.zerostateproxy.v1.ZeroStateProxy", "GenerateProactiveAutoContent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53455on.f140296d);
                    d.f187486b = C70850d.m103697c(C53459or.f140307d);
                    C70338di a = d.mo62040a();
                    C54562c.f143252c = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar2.f189040b), onVar);
    }
}
