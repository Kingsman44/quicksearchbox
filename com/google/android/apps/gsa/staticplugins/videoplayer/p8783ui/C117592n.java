package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117552f;
import com.google.android.apps.p489g.p494d.C9209cr;
import com.google.android.apps.p489g.p494d.C9210cs;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.search.video.thirdparty.C41598ab;
import com.google.android.libraries.search.video.thirdparty.C41599ac;
import com.google.android.libraries.search.video.thirdparty.C41611m;
import com.google.android.libraries.search.video.thirdparty.C41617s;
import com.google.android.libraries.search.video.thirdparty.C41624y;
import com.google.common.p4522b.C58557jl;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57178i;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57181l;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.n */
/* compiled from: PG */
public final /* synthetic */ class C117592n implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117598t f326416a;

    public /* synthetic */ C117592n(C117598t tVar) {
        this.f326416a = tVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        Optional optional;
        C117598t tVar = this.f326416a;
        C117552f fVar = (C117552f) obj;
        if (fVar.isInitialized()) {
            boolean z = true;
            if ((fVar.f326296a & 1) != 0 && tVar.f326428d == null) {
                C117598t.m195460r(fVar.f326301f, tVar.f326437m);
                C117598t.m195460r(fVar.f326302g, tVar.f326438n);
                C117598t.m195460r(fVar.f326303h, tVar.f326439o);
                tVar.mo103400q(tVar.f326430f.getResources().getConfiguration());
                C41598ab f = C41599ac.m72859f();
                f.mo44154b(true);
                f.mo44156d(true);
                C9212cu cuVar = fVar.f326299d;
                if (cuVar == null) {
                    cuVar = C9212cu.f31820l;
                }
                C9210cs csVar = (C9210cs) C58557jl.m90130k(cuVar.f31830i, (Object) null);
                if (csVar == null || csVar.f31817b.isEmpty()) {
                    optional = Optional.empty();
                } else {
                    C57178i iVar = (C57178i) C57181l.f152659e.createBuilder();
                    if ((csVar.f31816a & 1) != 0) {
                        String str = csVar.f31817b;
                        iVar.copyOnWrite();
                        C57181l lVar = (C57181l) iVar.instance;
                        str.getClass();
                        lVar.f152661a |= 1;
                        lVar.f152662b = str;
                    }
                    if ((csVar.f31816a & 2) != 0) {
                        C9209cr crVar = C9209cr.NONE;
                        C9209cr a = C9209cr.m23690a(csVar.f31818c);
                        if (a == null) {
                            a = C9209cr.NONE;
                        }
                        int ordinal = a.ordinal();
                        if (ordinal == 1) {
                            iVar.copyOnWrite();
                            C57181l lVar2 = (C57181l) iVar.instance;
                            lVar2.f152663c = 1;
                            lVar2.f152661a |= 2;
                        } else if (ordinal == 2) {
                            iVar.copyOnWrite();
                            C57181l lVar3 = (C57181l) iVar.instance;
                            lVar3.f152663c = 2;
                            lVar3.f152661a |= 2;
                        }
                    }
                    optional = Optional.m71637of((C57181l) iVar.build());
                }
                f.mo44155c(optional.isPresent());
                tVar.f326429e = C41624y.m72991a(tVar.f326426b, f.mo44153a());
                if ((fVar.f326296a & 8) != 0) {
                    tVar.f326429e.mo44184d(fVar.f326300e);
                }
                tVar.f326429e.mo44187h(new C117586h(tVar));
                C41617s sVar = tVar.f326429e;
                if (tVar.f326430f.getResources().getConfiguration().orientation != 2) {
                    z = false;
                }
                sVar.mo44186f(z);
                tVar.f326428d = ((C41611m) tVar.f326427c.mo27525b()).mo44179a(tVar.f326440p, tVar.f326429e);
                tVar.mo103398m(fVar);
                tVar.f326428d.mo44168B(tVar);
                tVar.f326428d.mo44169C(tVar.f326426b, cuVar.f31823b, Optional.m71637of(cuVar.f31826e), optional);
                tVar.f326429e.mo44182b(tVar.f326436l);
                tVar.f326429e.mo44181a(tVar.f326428d);
                tVar.f326428d.mo44174H(Duration.ofMillis(fVar.f326298c));
                tVar.f326428d.mo44171E();
            }
        }
    }
}
