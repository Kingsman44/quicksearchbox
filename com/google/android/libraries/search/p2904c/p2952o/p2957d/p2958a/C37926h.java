package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37918a;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37931d;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37932e;
import com.google.android.libraries.search.p2904c.p2964r.C37957a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60836bq;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.search.c.o.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C37926h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37927i f100524a;

    /* renamed from: b */
    public final /* synthetic */ List f100525b;

    public /* synthetic */ C37926h(C37927i iVar, List list) {
        this.f100524a = iVar;
        this.f100525b = list;
    }

    public final Object call() {
        C37927i iVar = this.f100524a;
        List list = this.f100525b;
        synchronized (iVar.f100527a.f100530c) {
            C58485gu guVar = (C58485gu) Collection.EL.stream(list).filter(C37920b.f100518a).map(C37921c.f100519a).collect(C58370cn.f155946a);
            Stream stream = Collection.EL.stream(guVar);
            C37957a aVar = iVar.f100527a.f100529b;
            Objects.requireNonNull(aVar);
            C37931d dVar = (C37931d) C37932e.f100542b.createBuilder();
            dVar.mo41158a((C58485gu) Collection.EL.stream((C58485gu) stream.filter(new C37923e(aVar)).collect(C58370cn.f155946a)).map(C37924f.f100522a).collect(C58370cn.f155946a));
            dVar.mo41158a((C58485gu) Collection.EL.stream((C58485gu) Collection.EL.stream(guVar).filter(new C37922d(iVar)).collect(C58370cn.f155946a)).map(C37925g.f100523a).collect(C58370cn.f155946a));
            C37932e eVar = (C37932e) dVar.build();
            C37928j jVar = iVar.f100527a;
            if (!jVar.f100533f.equals(eVar)) {
                jVar.f100533f = eVar;
                for (C37918a aVar2 : jVar.f100532e) {
                    if (!jVar.f100534g.containsKey(aVar2)) {
                        jVar.f100534g.put(aVar2, new C60836bq());
                    }
                    C46459k.m82829b(((C60836bq) jVar.f100534g.get(aVar2)).mo57304a(C47810es.m84978r(new C37919a(aVar2, eVar)), jVar.f100528a), "Failed to notify GlobalMicStateListener.", new Object[0]);
                }
            }
        }
        return true;
    }
}
