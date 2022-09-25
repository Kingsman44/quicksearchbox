package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.by */
/* compiled from: PG */
public final /* synthetic */ class C78402by implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C78402by f215851a = new C78402by();

    private /* synthetic */ C78402by() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78394bq bqVar = (C78394bq) obj;
        if (bqVar instanceof C78477es) {
            C78477es esVar = (C78477es) bqVar;
            C78393bp b = esVar.f216119a.mo73344b();
            C78392bo a = b.mo73354a();
            a.mo73353e((C78537at) b.mo73355b().mo76657c());
            C78393bp a2 = a.mo73349a();
            C78379bb c = C78380bc.m125876c();
            c.mo73319c(esVar.f216121c);
            C78390bm a3 = esVar.f216119a.mo73343a();
            a3.mo73340c(a2);
            c.mo73318b(a3.mo73338a());
            return c.mo73317a();
        } else if (bqVar instanceof C78439dh) {
            C78379bb c2 = C78380bc.m125876c();
            c2.mo73318b(((C78439dh) bqVar).f215958a.mo73372a());
            return c2.mo73317a();
        } else if (bqVar instanceof C78381bd) {
            C78381bd bdVar = (C78381bd) bqVar;
            C78379bb c3 = C78380bc.m125876c();
            c3.mo73319c(bdVar.f215765c.mo73321b());
            C78390bm a4 = bdVar.f215765c.mo73320a().mo73343a();
            a4.mo73342e(Optional.empty());
            c3.mo73318b(a4.mo73338a());
            return c3.mo73317a();
        } else if (bqVar instanceof C78450ds) {
            C78450ds dsVar = (C78450ds) bqVar;
            C78379bb c4 = C78380bc.m125876c();
            C78390bm g = C78391bn.m125906g();
            ((C78489o) g).f216154b = 2;
            c4.mo73318b(g.mo73338a());
            return c4.mo73317a();
        } else {
            C78379bb c5 = C78380bc.m125876c();
            c5.mo73318b(bqVar.mo73326e());
            return c5.mo73317a();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
