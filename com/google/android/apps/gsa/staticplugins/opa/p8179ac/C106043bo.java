package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3814ai.p3815a.p3816a.C49170d;
import com.google.assistant.p3897e.p3917i.p3918a.C51583nb;
import com.google.assistant.p3897e.p3917i.p3918a.C51584nc;
import com.google.assistant.p3897e.p3917i.p3918a.C51585nd;
import com.google.assistant.p3897e.p3917i.p3918a.C51586ne;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bo */
/* compiled from: PG */
public final /* synthetic */ class C106043bo implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51583nb f296063a;

    public /* synthetic */ C106043bo(C51583nb nbVar) {
        this.f296063a = nbVar;
    }

    public final void accept(Object obj) {
        C51583nb nbVar = this.f296063a;
        C49170d dVar = (C49170d) obj;
        C51584nc ncVar = (C51584nc) C51585nd.f134442c.createBuilder();
        String str = dVar.f127145a;
        ncVar.copyOnWrite();
        str.getClass();
        ((C51585nd) ncVar.instance).f134444a = str;
        C62971cq cqVar = dVar.f127146b;
        ncVar.copyOnWrite();
        C51585nd ndVar = (C51585nd) ncVar.instance;
        C62971cq cqVar2 = ndVar.f134445b;
        if (!cqVar2.mo58948c()) {
            ndVar.f134445b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) ndVar.f134445b);
        nbVar.copyOnWrite();
        C51586ne neVar = (C51586ne) nbVar.instance;
        C51585nd ndVar2 = (C51585nd) ncVar.build();
        C51586ne neVar2 = C51586ne.f134446b;
        ndVar2.getClass();
        C62971cq cqVar3 = neVar.f134448a;
        if (!cqVar3.mo58948c()) {
            neVar.f134448a = C62942bv.mutableCopy(cqVar3);
        }
        neVar.f134448a.add(ndVar2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
