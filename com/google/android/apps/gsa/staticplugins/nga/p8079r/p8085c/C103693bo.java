package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80168cq;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80169cr;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bo */
/* compiled from: PG */
public final /* synthetic */ class C103693bo implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103693bo f288803a = new C103693bo();

    private /* synthetic */ C103693bo() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C29690f fVar = (C29690f) obj;
        C80168cq cqVar = (C80168cq) C80169cr.f219980e.createBuilder();
        String str = fVar.f80411b;
        cqVar.copyOnWrite();
        C80169cr crVar = (C80169cr) cqVar.instance;
        str.getClass();
        int i = 2;
        crVar.f219982a |= 2;
        crVar.f219984c = str;
        C29689e eVar = C29689e.UNSPECIFIED;
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 3) {
                    i = 3;
                }
            }
            cqVar.copyOnWrite();
            C80169cr crVar2 = (C80169cr) cqVar.instance;
            crVar2.f219985d = i - 1;
            crVar2.f219982a |= 4;
            int i2 = fVar.f80414e;
            cqVar.copyOnWrite();
            C80169cr crVar3 = (C80169cr) cqVar.instance;
            crVar3.f219982a = 1 | crVar3.f219982a;
            crVar3.f219983b = i2;
            return (C80169cr) cqVar.build();
        }
        i = 1;
        cqVar.copyOnWrite();
        C80169cr crVar22 = (C80169cr) cqVar.instance;
        crVar22.f219985d = i - 1;
        crVar22.f219982a |= 4;
        int i22 = fVar.f80414e;
        cqVar.copyOnWrite();
        C80169cr crVar32 = (C80169cr) cqVar.instance;
        crVar32.f219982a = 1 | crVar32.f219982a;
        crVar32.f219983b = i22;
        return (C80169cr) cqVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
