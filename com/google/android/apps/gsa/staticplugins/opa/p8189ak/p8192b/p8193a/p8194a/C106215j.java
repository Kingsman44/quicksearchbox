package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82894ej;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82900ep;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82901eq;
import com.google.android.libraries.gsa.conversation.p1855h.C22707k;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.j */
/* compiled from: PG */
public final class C106215j {

    /* renamed from: a */
    public static final C106213h f296412a = new C106213h();

    /* renamed from: b */
    private static final C106214i f296413b = new C106214i();

    /* renamed from: a */
    public static C82885ea m176979a(C22722z zVar) {
        C22707k kVar = (C22707k) zVar;
        List list = (List) Collection.EL.stream(kVar.f62506c).map(C106211f.f296410a).sorted(Comparator.CC.comparingLong(C106212g.f296411a)).collect(Collectors.toList());
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82894ej ejVar = (C82894ej) C82901eq.f226139e.createBuilder();
        String f = zVar.mo27879f();
        ejVar.copyOnWrite();
        C82901eq eqVar = (C82901eq) ejVar.instance;
        eqVar.f226141a |= 1;
        eqVar.f226142b = f;
        C82900ep a = f296413b.apply(kVar.f62505b);
        ejVar.copyOnWrite();
        C82901eq eqVar2 = (C82901eq) ejVar.instance;
        eqVar2.f226143c = a.f226138e;
        eqVar2.f226141a |= 2;
        ejVar.copyOnWrite();
        C82901eq eqVar3 = (C82901eq) ejVar.instance;
        C62971cq cqVar = eqVar3.f226144d;
        if (!cqVar.mo58948c()) {
            eqVar3.f226144d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) eqVar3.f226144d);
        C82901eq eqVar4 = (C82901eq) ejVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        eqVar4.getClass();
        eaVar.f225980b = eqVar4;
        eaVar.f225979a = 87;
        return (C82885ea) dzVar.build();
    }
}
