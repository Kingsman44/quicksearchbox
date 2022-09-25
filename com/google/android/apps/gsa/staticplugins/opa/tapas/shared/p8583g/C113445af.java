package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88343yd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.af */
/* compiled from: PG */
public final /* synthetic */ class C113445af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C88343yd f314132a;

    public /* synthetic */ C113445af(C88343yd ydVar) {
        this.f314132a = ydVar;
    }

    public final void accept(Object obj) {
        C88343yd ydVar = this.f314132a;
        List list = (List) obj;
        ydVar.copyOnWrite();
        C88344ye yeVar = (C88344ye) ydVar.instance;
        C88344ye yeVar2 = C88344ye.f238913h;
        C62971cq cqVar = yeVar.f238921g;
        if (!cqVar.mo58948c()) {
            yeVar.f238921g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) yeVar.f238921g);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
