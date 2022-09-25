package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.n */
/* compiled from: PG */
public final class C83095n implements Function {

    /* renamed from: a */
    private final C83102u f226704a;

    public C83095n(C83102u uVar) {
        this.f226704a = uVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C82838ch chVar = (C82838ch) obj;
        C82837cg cgVar = (C82837cg) C82838ch.f225874h.createBuilder();
        boolean z = true;
        if ((chVar.f225876a & 1) != 0) {
            int a = C82919fh.m132428a(chVar.f225877b);
            if (a == 0) {
                a = 1;
            }
            cgVar.copyOnWrite();
            C82838ch chVar2 = (C82838ch) cgVar.instance;
            chVar2.f225877b = a - 1;
            chVar2.f225876a |= 1;
        }
        if ((chVar.f225876a & 2) != 0) {
            int a2 = C82919fh.m132428a(chVar.f225878c);
            if (a2 == 0) {
                a2 = 1;
            }
            cgVar.copyOnWrite();
            C82838ch chVar3 = (C82838ch) cgVar.instance;
            chVar3.f225878c = a2 - 1;
            chVar3.f225876a |= 2;
        }
        boolean z2 = (chVar.f225876a & 4) != 0;
        Objects.requireNonNull(chVar);
        C83089h hVar = new C83089h(chVar);
        Objects.requireNonNull(cgVar);
        C83080bg.m132478b(z2, hVar, new C83090i(cgVar));
        boolean z3 = (chVar.f225876a & 8) != 0;
        Objects.requireNonNull(chVar);
        C83091j jVar = new C83091j(chVar);
        Objects.requireNonNull(cgVar);
        C83080bg.m132478b(z3, jVar, new C83092k(cgVar));
        if ((chVar.f225876a & 32) == 0) {
            z = false;
        }
        Objects.requireNonNull(chVar);
        C83093l lVar = new C83093l(chVar);
        Objects.requireNonNull(cgVar);
        C83080bg.m132479c(z, lVar, new C83094m(cgVar), this.f226704a);
        return (C82838ch) cgVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
