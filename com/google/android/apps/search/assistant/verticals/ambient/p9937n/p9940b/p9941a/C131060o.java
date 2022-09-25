package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131081d;
import com.google.assistant.p3886c.p3887a.C50677m;
import com.google.assistant.p3886c.p3887a.C50678n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.o */
/* compiled from: PG */
public final /* synthetic */ class C131060o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131060o f358497a = new C131060o();

    private /* synthetic */ C131060o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131081d dVar = (C131081d) obj;
        C50677m mVar = (C50677m) C50678n.f131835l.createBuilder();
        mVar.mo53420a(dVar.mo110047b());
        long millis = dVar.mo110049d().toMillis();
        mVar.copyOnWrite();
        C50678n nVar = (C50678n) mVar.instance;
        nVar.f131837a |= 4;
        nVar.f131842f = millis;
        long epochMilli = dVar.mo110050e().toEpochMilli();
        mVar.copyOnWrite();
        C50678n nVar2 = (C50678n) mVar.instance;
        nVar2.f131837a |= 8;
        nVar2.f131843g = epochMilli;
        long epochMilli2 = dVar.mo110051f().toEpochMilli();
        mVar.copyOnWrite();
        C50678n nVar3 = (C50678n) mVar.instance;
        nVar3.f131837a |= 16;
        nVar3.f131844h = epochMilli2;
        long a = dVar.mo110046a();
        mVar.copyOnWrite();
        C50678n nVar4 = (C50678n) mVar.instance;
        nVar4.f131837a |= 2;
        nVar4.f131841e = a;
        int size = dVar.mo110047b().size();
        mVar.copyOnWrite();
        C50678n nVar5 = (C50678n) mVar.instance;
        nVar5.f131837a |= 32;
        nVar5.f131845i = size;
        mVar.mo53421b(dVar.mo110048c());
        return mVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
