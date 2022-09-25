package com.google.android.apps.search.fedora.p10106i;

import com.google.android.apps.search.fedora.p10099e.C132776ag;
import com.google.android.apps.search.fedora.p10099e.C132779aj;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.fedora.i.s */
/* compiled from: PG */
public final /* synthetic */ class C132945s implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f362627a;

    /* renamed from: b */
    public final /* synthetic */ List f362628b;

    public /* synthetic */ C132945s(String str, List list) {
        this.f362627a = str;
        this.f362628b = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f362627a;
        List list = this.f362628b;
        C59071e eVar = C132948v.f362631a;
        C132776ag agVar = (C132776ag) ((C132779aj) obj).toBuilder();
        agVar.copyOnWrite();
        C132779aj ajVar = (C132779aj) agVar.instance;
        str.getClass();
        ajVar.f362246a |= 2;
        ajVar.f362248c = str;
        agVar.copyOnWrite();
        ((C132779aj) agVar.instance).f362249d = C62942bv.emptyProtobufList();
        agVar.copyOnWrite();
        C132779aj ajVar2 = (C132779aj) agVar.instance;
        C62971cq cqVar = ajVar2.f362249d;
        if (!cqVar.mo58948c()) {
            ajVar2.f362249d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) ajVar2.f362249d);
        return (C132779aj) agVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
