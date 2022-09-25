package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79957be;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54875cn;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54876co;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62961ch;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.x */
/* compiled from: PG */
class C112658x implements Function {
    /* renamed from: a */
    public final C54876co apply(C79957be beVar) {
        C54875cn cnVar = (C54875cn) C54876co.f144164d.createBuilder();
        C62960cg cgVar = beVar.f219288a;
        cnVar.copyOnWrite();
        C54876co coVar = (C54876co) cnVar.instance;
        C62960cg cgVar2 = coVar.f144166a;
        if (!cgVar2.mo58948c()) {
            coVar.f144166a = C62942bv.mutableCopy(cgVar2);
        }
        C62947c.addAll((Iterable) cgVar, (List) coVar.f144166a);
        C62960cg cgVar3 = beVar.f219289b;
        cnVar.copyOnWrite();
        C54876co coVar2 = (C54876co) cnVar.instance;
        C62960cg cgVar4 = coVar2.f144167b;
        if (!cgVar4.mo58948c()) {
            coVar2.f144167b = C62942bv.mutableCopy(cgVar4);
        }
        C62947c.addAll((Iterable) cgVar3, (List) coVar2.f144167b);
        C62961ch chVar = beVar.f219290c;
        cnVar.copyOnWrite();
        C54876co coVar3 = (C54876co) cnVar.instance;
        C62961ch chVar2 = coVar3.f144168c;
        if (!chVar2.mo58948c()) {
            coVar3.f144168c = C62942bv.mutableCopy(chVar2);
        }
        C62947c.addAll((Iterable) chVar, (List) coVar3.f144168c);
        return (C54876co) cnVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
