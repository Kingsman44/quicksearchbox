package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37929b;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37930c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.c.o.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C37924f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C37924f f100522a = new C37924f();

    private /* synthetic */ C37924f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C37927i.f100526b;
        C37929b bVar = (C37929b) C37930c.f100537d.createBuilder();
        bVar.copyOnWrite();
        C37930c cVar = (C37930c) bVar.instance;
        cVar.f100540b = 1;
        cVar.f100539a = 1 | cVar.f100539a;
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
