package com.google.android.apps.search.assistant.platform.appintegration.grpc.p9003b;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119604ax;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119622d;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119623e;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119639u;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119641w;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119642x;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17872ab;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17920v;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52272lp;
import com.google.assistant.p3897e.p3921j.C52273lq;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.b.c */
/* compiled from: PG */
public final /* synthetic */ class C119610c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119613f f333357a;

    /* renamed from: b */
    public final /* synthetic */ C17881ak f333358b;

    public /* synthetic */ C119610c(C119613f fVar, C17881ak akVar) {
        this.f333357a = fVar;
        this.f333358b = akVar;
    }

    public final void accept(Object obj) {
        C58485gu guVar;
        C119613f fVar = this.f333357a;
        C17881ak akVar = this.f333358b;
        C70862aj ajVar = (C70862aj) obj;
        C59104x b = C119613f.f333361a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Mosaic.GrpcSession");
        ((C59052c) ((C59052c) b).mo56372aa(34515)).mo56389s("sendData: %s", akVar);
        if ((akVar.f51233a & 1) != 0) {
            C17920v vVar = akVar.f51234b;
            if (vVar == null) {
                vVar = C17920v.f51335j;
            }
            C119604ax axVar = (C119604ax) C119605ay.f333343c.createBuilder();
            if (!vVar.f51338b.isEmpty()) {
                String str = vVar.f51338b;
                C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                dsVar.copyOnWrite();
                C51805du duVar = (C51805du) dsVar.instance;
                duVar.f135926a |= 1;
                duVar.f135927b = "text.QUERY";
                C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar.copyOnWrite();
                C52230ka kaVar = (C52230ka) jzVar.instance;
                kaVar.f137059a |= 1;
                kaVar.f137060b = "assistant.api.client_input.TextInputParam";
                C52272lp lpVar = (C52272lp) C52273lq.f137218c.createBuilder();
                lpVar.copyOnWrite();
                C52273lq lqVar = (C52273lq) lpVar.instance;
                str.getClass();
                lqVar.f137220a |= 1;
                lqVar.f137221b = str;
                C63088z byteString = ((C52273lq) lpVar.build()).toByteString();
                jzVar.copyOnWrite();
                C52230ka kaVar2 = (C52230ka) jzVar.instance;
                byteString.getClass();
                kaVar2.f137059a |= 2;
                kaVar2.f137061c = byteString;
                dsVar.mo53729a("text_input_params", (C52230ka) jzVar.build());
                C51805du duVar2 = (C51805du) dsVar.build();
                axVar.copyOnWrite();
                C119605ay ayVar = (C119605ay) axVar.instance;
                duVar2.getClass();
                ayVar.f333346b = duVar2;
                ayVar.f333345a |= 4;
            }
            if ((akVar.f51233a & 2) != 0) {
                C17880aj ajVar2 = akVar.f51235c;
                if (ajVar2 == null) {
                    ajVar2 = C17880aj.f51221i;
                }
                C17872ab abVar = ajVar2.f51230h;
                if (abVar == null) {
                    abVar = C17872ab.f51209b;
                }
                guVar = (C58485gu) Collection.EL.stream(abVar.f51211a).map(C119611d.f333359a).collect(C58370cn.f155946a);
            } else {
                guVar = C58485gu.m89845m();
            }
            C119622d dVar = (C119622d) C119623e.f333371e.createBuilder();
            C119639u uVar = (C119639u) C119640v.f333408i.createBuilder();
            uVar.copyOnWrite();
            C119640v vVar2 = (C119640v) uVar.instance;
            C62971cq cqVar = vVar2.f333416g;
            if (!cqVar.mo58948c()) {
                vVar2.f333416g = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) guVar, (List) vVar2.f333416g);
            C119641w wVar = (C119641w) C119642x.f333419e.createBuilder();
            wVar.copyOnWrite();
            C119642x xVar = (C119642x) wVar.instance;
            xVar.f333421a |= 1;
            xVar.f333422b = "LegacyToMosaic";
            String str2 = fVar.f333362b;
            wVar.copyOnWrite();
            C119642x xVar2 = (C119642x) wVar.instance;
            str2.getClass();
            xVar2.f333421a |= 4;
            xVar2.f333423c = str2;
            C119642x xVar3 = (C119642x) wVar.build();
            uVar.copyOnWrite();
            C119640v vVar3 = (C119640v) uVar.instance;
            xVar3.getClass();
            vVar3.f333412c = xVar3;
            vVar3.f333410a |= 4;
            C119640v vVar4 = (C119640v) uVar.build();
            dVar.copyOnWrite();
            C119623e eVar = (C119623e) dVar.instance;
            vVar4.getClass();
            eVar.f333376d = vVar4;
            eVar.f333373a |= 1;
            C119605ay ayVar2 = (C119605ay) axVar.build();
            dVar.copyOnWrite();
            C119623e eVar2 = (C119623e) dVar.instance;
            ayVar2.getClass();
            eVar2.f333375c = ayVar2;
            eVar2.f333374b = 2;
            ajVar.mo20123c((C119623e) dVar.build());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
