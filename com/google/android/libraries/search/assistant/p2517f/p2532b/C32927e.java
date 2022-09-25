package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32789ak;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32831bz;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70922g;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70929n;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70931p;

/* renamed from: com.google.android.libraries.search.assistant.f.b.e */
/* compiled from: PG */
abstract class C32927e implements Function {
    /* renamed from: a */
    public final C70929n apply(C32796ar arVar) {
        C32831bz bzVar;
        C70922g gVar = (C70922g) C70929n.f189134c.createBuilder();
        if (arVar.f87975a == 1 && C32789ak.m60768a(1) == 1) {
            String str = (String) arVar.f87976b;
            gVar.copyOnWrite();
            C70929n nVar = (C70929n) gVar.instance;
            str.getClass();
            nVar.f189136a = 1;
            nVar.f189137b = str;
        }
        if (arVar.f87975a == 2 && C32789ak.m60768a(2) == 2) {
            mo38356c(arVar, gVar);
        }
        if (arVar.f87975a == 3 && C32789ak.m60768a(3) == 3) {
            int intValue = ((Integer) arVar.f87976b).intValue();
            gVar.copyOnWrite();
            C70929n nVar2 = (C70929n) gVar.instance;
            nVar2.f189136a = 3;
            nVar2.f189137b = Integer.valueOf(intValue);
        }
        if (arVar.f87975a == 4 && C32789ak.m60768a(4) == 4) {
            mo38358e(arVar, gVar);
        }
        if (arVar.f87975a == 5 && C32789ak.m60768a(5) == 5) {
            Function function = C32935m.f88252a;
            if (arVar.f87975a == 5) {
                bzVar = C32831bz.m60796a(((Integer) arVar.f87976b).intValue());
                if (bzVar == null) {
                    bzVar = C32831bz.UNKNOWN_INVOCATION_TYPE;
                }
            } else {
                bzVar = C32831bz.UNKNOWN_INVOCATION_TYPE;
            }
            C70931p a = ((C32931i) function).apply(bzVar);
            gVar.copyOnWrite();
            C70929n nVar3 = (C70929n) gVar.instance;
            nVar3.f189137b = Integer.valueOf(a.f189143d);
            nVar3.f189136a = 5;
        }
        if (arVar.f87975a == 6 && C32789ak.m60768a(6) == 6) {
            mo38355b(arVar, gVar);
        }
        if (arVar.f87975a == 7 && C32789ak.m60768a(7) == 7) {
            mo38357d(arVar, gVar);
        }
        return (C70929n) gVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public abstract void mo38355b(C32796ar arVar, C70922g gVar);

    /* renamed from: c */
    public abstract void mo38356c(C32796ar arVar, C70922g gVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    /* renamed from: d */
    public abstract void mo38357d(C32796ar arVar, C70922g gVar);

    /* renamed from: e */
    public abstract void mo38358e(C32796ar arVar, C70922g gVar);
}
