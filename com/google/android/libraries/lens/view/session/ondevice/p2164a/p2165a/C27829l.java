package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.android.libraries.lens.ondevice.p2037n.C24777aj;
import com.google.android.libraries.lens.ondevice.p2037n.C24778ak;
import com.google.common.base.C58833ax;
import com.google.lens.p4709l.p4710a.C62620h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C27829l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C27830m f75892a;

    public /* synthetic */ C27829l(C27830m mVar) {
        this.f75892a = mVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C27830m mVar = this.f75892a;
        String str = (String) obj;
        C24777aj ajVar = (C24777aj) C24778ak.f67705g.createBuilder();
        String str2 = mVar.f75896d;
        ajVar.copyOnWrite();
        C24778ak akVar = (C24778ak) ajVar.instance;
        str2.getClass();
        akVar.f67707a |= 2;
        akVar.f67709c = str2;
        ajVar.copyOnWrite();
        C24778ak akVar2 = (C24778ak) ajVar.instance;
        str.getClass();
        akVar2.f67707a |= 1;
        akVar2.f67708b = str;
        C62971cq cqVar = ((C62620h) Collections.unmodifiableMap(mVar.f75894b.f169073c).get(str)).f169068a;
        ajVar.copyOnWrite();
        C24778ak akVar3 = (C24778ak) ajVar.instance;
        C62971cq cqVar2 = akVar3.f67711e;
        if (!cqVar2.mo58948c()) {
            akVar3.f67711e = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) akVar3.f67711e);
        if (!mVar.f75895c.isEmpty()) {
            String str3 = mVar.f75895c;
            ajVar.copyOnWrite();
            C24778ak akVar4 = (C24778ak) ajVar.instance;
            akVar4.f67707a |= 8;
            akVar4.f67712f = str3;
        } else {
            C58833ax axVar = mVar.f75898f;
            if (axVar.mo56113h()) {
                int intValue = ((Integer) axVar.mo56107c()).intValue();
                ajVar.copyOnWrite();
                C24778ak akVar5 = (C24778ak) ajVar.instance;
                akVar5.f67707a |= 4;
                akVar5.f67710d = intValue;
            }
        }
        return (C24778ak) ajVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
