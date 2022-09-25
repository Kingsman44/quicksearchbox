package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.assistant.p4008y.p4009a.C53551ak;
import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53553am;
import com.google.assistant.p4008y.p4009a.C53554an;
import com.google.assistant.p4008y.p4009a.C53556ap;
import com.google.assistant.p4008y.p4009a.C53568ba;
import com.google.assistant.p4008y.p4009a.C53569bb;
import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.r */
/* compiled from: PG */
public final /* synthetic */ class C106393r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106393r f296749a = new C106393r();

    private /* synthetic */ C106393r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C53592by byVar = (C53592by) C53593bz.f140658j.createBuilder();
        byVar.copyOnWrite();
        C53593bz bzVar = (C53593bz) byVar.instance;
        str.getClass();
        bzVar.f140660a |= 1;
        bzVar.f140661b = str;
        C53568ba baVar = (C53568ba) C53569bb.f140594i.createBuilder();
        baVar.copyOnWrite();
        C53569bb bbVar = (C53569bb) baVar.instance;
        str.getClass();
        bbVar.f140596a |= 1;
        bbVar.f140597b = str;
        baVar.copyOnWrite();
        C53569bb bbVar2 = (C53569bb) baVar.instance;
        bbVar2.f140599d = 5;
        bbVar2.f140596a |= 4;
        C53569bb bbVar3 = (C53569bb) baVar.build();
        byVar.copyOnWrite();
        C53593bz bzVar2 = (C53593bz) byVar.instance;
        bbVar3.getClass();
        bzVar2.f140667h = bbVar3;
        bzVar2.f140660a |= 64;
        if (str.matches("(.*)(%([^%]+)%)(.*)")) {
            C53553am amVar = (C53553am) C53554an.f140545b.createBuilder();
            C53551ak akVar = (C53551ak) C53552al.f140539e.createBuilder();
            C53556ap apVar = C53556ap.PERSONAL_CONTEXT;
            akVar.copyOnWrite();
            C53552al alVar = (C53552al) akVar.instance;
            alVar.f140544d = apVar.f140559j;
            alVar.f140541a |= 1;
            C53552al alVar2 = (C53552al) akVar.build();
            amVar.copyOnWrite();
            C53554an anVar = (C53554an) amVar.instance;
            alVar2.getClass();
            C62971cq cqVar = anVar.f140547a;
            if (!cqVar.mo58948c()) {
                anVar.f140547a = C62942bv.mutableCopy(cqVar);
            }
            anVar.f140547a.add(alVar2);
            C53554an anVar2 = (C53554an) amVar.build();
            byVar.copyOnWrite();
            C53593bz bzVar3 = (C53593bz) byVar.instance;
            anVar2.getClass();
            bzVar3.f140666g = anVar2;
            bzVar3.f140660a |= 32;
        }
        return (C53593bz) byVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
