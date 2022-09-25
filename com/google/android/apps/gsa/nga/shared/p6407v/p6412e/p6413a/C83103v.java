package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.common.p4522b.C58370cn;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.v */
/* compiled from: PG */
public final class C83103v implements Function {

    /* renamed from: a */
    private final C83060an f226714a;

    public C83103v(C83060an anVar) {
        this.f226714a = anVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C61752n nVar = (C61752n) obj;
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        String str = nVar.f166811b;
        mVar.copyOnWrite();
        C61752n nVar2 = (C61752n) mVar.instance;
        str.getClass();
        nVar2.f166810a |= 4;
        nVar2.f166811b = str;
        mVar.mo58183b((Iterable) Collection.EL.stream(nVar.f166812c).map(this.f226714a).collect(C58370cn.f155946a));
        return (C61752n) mVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
