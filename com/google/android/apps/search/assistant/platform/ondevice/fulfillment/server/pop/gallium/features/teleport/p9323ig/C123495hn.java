package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import p001a.p014d.p015a.p016a.C0042ae;
import p001a.p014d.p015a.p016a.C0043af;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hn */
/* compiled from: PG */
public final /* synthetic */ class C123495hn implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C123495hn f341293a = new C123495hn();

    private /* synthetic */ C123495hn() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C0043af afVar = (C0043af) obj;
        C0043af afVar2 = (C0043af) obj2;
        C0042ae aeVar = (C0042ae) C0043af.f114m.createBuilder();
        C49192d dVar = afVar.f117b;
        if (dVar != null) {
            aeVar.copyOnWrite();
            ((C0043af) aeVar.instance).f117b = dVar;
        } else {
            C49192d dVar2 = afVar2.f117b;
            if (dVar2 != null) {
                aeVar.copyOnWrite();
                ((C0043af) aeVar.instance).f117b = dVar2;
            }
        }
        if ((afVar.f116a & 1) != 0) {
            float f = afVar.f126k;
            aeVar.copyOnWrite();
            C0043af afVar3 = (C0043af) aeVar.instance;
            afVar3.f116a |= 1;
            afVar3.f126k = f;
        } else if ((afVar2.f116a & 1) != 0) {
            float f2 = afVar2.f126k;
            aeVar.copyOnWrite();
            C0043af afVar4 = (C0043af) aeVar.instance;
            afVar4.f116a |= 1;
            afVar4.f126k = f2;
        }
        if ((afVar.f116a & 2) != 0) {
            float f3 = afVar.f127l;
            aeVar.copyOnWrite();
            C0043af afVar5 = (C0043af) aeVar.instance;
            afVar5.f116a |= 2;
            afVar5.f127l = f3;
        } else if ((afVar2.f116a & 2) != 0) {
            float f4 = afVar2.f127l;
            aeVar.copyOnWrite();
            C0043af afVar6 = (C0043af) aeVar.instance;
            afVar6.f116a |= 2;
            afVar6.f127l = f4;
        }
        aeVar.mo19g(C123502hu.m202829a(afVar.f118c, afVar2.f118c));
        aeVar.mo15c(C123502hu.m202829a(afVar.f119d, afVar2.f119d));
        aeVar.mo17e(C123502hu.m202829a(afVar.f120e, afVar2.f120e));
        aeVar.mo13a(C123502hu.m202829a(afVar.f121f, afVar2.f121f));
        aeVar.mo18f(C123502hu.m202829a(afVar.f122g, afVar2.f122g));
        aeVar.mo14b(C123502hu.m202829a(afVar.f123h, afVar2.f123h));
        aeVar.mo16d(C123502hu.m202829a(afVar.f125j, afVar2.f125j));
        aeVar.mo20h(C123502hu.m202829a(afVar.f124i, afVar2.f124i));
        return (C0043af) aeVar.build();
    }
}
