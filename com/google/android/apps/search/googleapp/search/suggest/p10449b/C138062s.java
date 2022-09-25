package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.p395al.p417d.p418a.C8592s;
import com.google.p4184bj.C56033i;
import com.google.p4184bj.C56034j;
import com.google.p4440ca.p4441a.C57922b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.s */
/* compiled from: PG */
public final /* synthetic */ class C138062s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C138062s f375638a = new C138062s();

    private /* synthetic */ C138062s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C57922b bVar = (C57922b) obj;
        C56033i iVar = (C56033i) C56034j.f149219g.createBuilder();
        int i = bVar.f154927c;
        iVar.copyOnWrite();
        C56034j jVar = (C56034j) iVar.instance;
        jVar.f149221a |= 4;
        jVar.f149224d = i;
        iVar.mo54316a(bVar.f154928d);
        if ((bVar.f154925a & 1) != 0) {
            C8592s sVar = bVar.f154926b;
            if (sVar == null) {
                sVar = C8592s.f29730d;
            }
            if ((sVar.f29732a & 1) != 0) {
                long j = sVar.f29733b;
                iVar.copyOnWrite();
                C56034j jVar2 = (C56034j) iVar.instance;
                jVar2.f149221a |= 1;
                jVar2.f149222b = j;
            }
            if ((sVar.f29732a & 2) != 0) {
                long j2 = sVar.f29734c;
                iVar.copyOnWrite();
                C56034j jVar3 = (C56034j) iVar.instance;
                jVar3.f149221a |= 2;
                jVar3.f149223c = j2;
            }
        }
        if ((bVar.f154925a & 4) != 0) {
            int i2 = bVar.f154930f;
            iVar.copyOnWrite();
            C56034j jVar4 = (C56034j) iVar.instance;
            jVar4.f149221a |= 16;
            jVar4.f149226f = i2;
        }
        return (C56034j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
