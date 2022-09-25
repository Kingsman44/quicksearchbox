package com.google.android.libraries.gsa.actionusermodel;

import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p4986a.C64653ag;
import com.google.protos.p4985f.p4986a.C64660an;
import com.google.protos.p4985f.p4986a.C64661ao;
import com.google.protos.p4985f.p4986a.C64662ap;
import com.google.protos.p4985f.p4986a.C64663aq;
import com.google.protos.p4985f.p4986a.C64668av;
import com.google.protos.p4985f.p4986a.C64669aw;
import com.google.protos.p4985f.p4986a.C64670ax;
import com.google.protos.p4985f.p4986a.C64671ay;
import com.google.protos.p4985f.p4986a.C64683bj;
import com.google.protos.p4985f.p5001d.C64820b;
import java.util.List;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d */
/* compiled from: PG */
public final /* synthetic */ class C22120d implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ List f60958a;

    /* renamed from: b */
    public final /* synthetic */ int f60959b;

    public /* synthetic */ C22120d(List list, int i) {
        this.f60958a = list;
        this.f60959b = i;
    }

    public final Object apply(int i) {
        List list = this.f60958a;
        int i2 = this.f60959b;
        C64670ax axVar = (C64670ax) C64671ay.f175294f.createBuilder();
        boolean f = ((C22021a) list.get(i)).mo27334f();
        axVar.copyOnWrite();
        C64671ay ayVar = (C64671ay) axVar.instance;
        ayVar.f175296a |= 1;
        ayVar.f175297b = f;
        C64683bj c = ((C22021a) list.get(i)).mo27331c();
        axVar.copyOnWrite();
        C64671ay ayVar2 = (C64671ay) axVar.instance;
        c.getClass();
        ayVar2.f175300e = c;
        ayVar2.f175296a |= 512;
        C64820b d = ((C22021a) list.get(i)).mo27332d();
        axVar.copyOnWrite();
        C64671ay ayVar3 = (C64671ay) axVar.instance;
        ayVar3.f175298c = d.getNumber();
        ayVar3.f175296a |= 4;
        C58485gu b = ((C22021a) list.get(i)).mo27330b();
        int size = b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C64653ag agVar = (C64653ag) b.get(i3);
            C64668av avVar = (C64668av) C64669aw.f175288e.createBuilder();
            avVar.copyOnWrite();
            C64669aw awVar = (C64669aw) avVar.instance;
            agVar.getClass();
            awVar.f175291b = agVar;
            awVar.f175290a |= 1;
            axVar.copyOnWrite();
            C64671ay ayVar4 = (C64671ay) axVar.instance;
            C64669aw awVar2 = (C64669aw) avVar.build();
            awVar2.getClass();
            C62971cq cqVar = ayVar4.f175299d;
            if (!cqVar.mo58948c()) {
                ayVar4.f175299d = C62942bv.mutableCopy(cqVar);
            }
            ayVar4.f175299d.add(awVar2);
        }
        C64662ap apVar = (C64662ap) C64663aq.f175269e.createBuilder();
        C64671ay ayVar5 = (C64671ay) axVar.build();
        apVar.copyOnWrite();
        C64663aq aqVar = (C64663aq) apVar.instance;
        ayVar5.getClass();
        aqVar.f175273c = ayVar5;
        aqVar.f175272b = 1;
        if (i2 == i) {
            apVar.copyOnWrite();
            C64663aq aqVar2 = (C64663aq) apVar.instance;
            aqVar2.f175271a |= 2;
            aqVar2.f175274d = true;
        }
        C64660an anVar = (C64660an) C64661ao.f175264d.createBuilder();
        String e = ((C22021a) list.get(i)).mo27333e();
        anVar.copyOnWrite();
        C64661ao aoVar = (C64661ao) anVar.instance;
        e.getClass();
        aoVar.f175266a |= 1;
        aoVar.f175267b = e;
        C64663aq aqVar3 = (C64663aq) apVar.build();
        anVar.copyOnWrite();
        C64661ao aoVar2 = (C64661ao) anVar.instance;
        aqVar3.getClass();
        aoVar2.f175268c = aqVar3;
        aoVar2.f175266a |= 2;
        return (C64661ao) anVar.build();
    }
}
