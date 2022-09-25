package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37929b;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37930c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.c.o.d.a.g */
/* compiled from: PG */
public final /* synthetic */ class C37925g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C37925g f100523a = new C37925g();

    private /* synthetic */ C37925g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C37927i.f100526b;
        C37929b bVar = (C37929b) C37930c.f100537d.createBuilder();
        bVar.copyOnWrite();
        C37930c cVar = (C37930c) bVar.instance;
        cVar.f100540b = 10;
        cVar.f100539a |= 1;
        int intValue = ((Integer) obj).intValue();
        bVar.copyOnWrite();
        C37930c cVar2 = (C37930c) bVar.instance;
        cVar2.f100539a |= 2;
        cVar2.f100541c = intValue;
        return (C37930c) bVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
