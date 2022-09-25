package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17060e;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17062g;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17075t;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17078w;
import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17082a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17086e;
import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17094m;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Locale;
import org.p5610a.p5611a.p5618b.p5620b.C71997d;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.ac */
/* compiled from: PG */
public final /* synthetic */ class C122337ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122346al f339209a;

    public /* synthetic */ C122337ac(C122346al alVar) {
        this.f339209a = alVar;
    }

    public final C60870cx apply(Object obj) {
        C122346al alVar = this.f339209a;
        C71997d dVar = (C71997d) obj;
        Object a = dVar.mo63200a();
        Object b = dVar.mo63201b();
        Object c = dVar.mo63202c();
        C122348an anVar = alVar.f339222a;
        Locale locale = alVar.f339223b;
        C28716av avVar = alVar.f339224c;
        C58485gu guVar = (C58485gu) a;
        C58485gu guVar2 = (C58485gu) b;
        Optional optional = (Optional) c;
        C17060e eVar = anVar.f339228c;
        C17075t tVar = (C17075t) C17078w.f49713g.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(guVar).map(new C122347am(locale)).collect(C58370cn.f155946a);
        tVar.copyOnWrite();
        C17078w wVar = (C17078w) tVar.instance;
        C62971cq cqVar = wVar.f49716b;
        if (!cqVar.mo58948c()) {
            wVar.f49716b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) wVar.f49716b);
        Iterable iterable2 = (Iterable) Collection.EL.stream(guVar2).map(new C122365q(locale)).collect(C58370cn.f155946a);
        tVar.copyOnWrite();
        C17078w wVar2 = (C17078w) tVar.instance;
        C62971cq cqVar2 = wVar2.f49717c;
        if (!cqVar2.mo58948c()) {
            wVar2.f49717c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll(iterable2, (List) wVar2.f49717c);
        tVar.copyOnWrite();
        C17078w wVar3 = (C17078w) tVar.instance;
        avVar.getClass();
        wVar3.f49718d = avVar;
        wVar3.f49715a |= 1;
        tVar.copyOnWrite();
        C17078w wVar4 = (C17078w) tVar.instance;
        wVar4.f49719e = 2;
        wVar4.f49715a = 2 | wVar4.f49715a;
        C17078w wVar5 = (C17078w) tVar.build();
        C58817ah c2 = C47810es.m84963c(new C122369u(new C122366r(anVar, optional, locale, guVar, guVar2)));
        Objects.requireNonNull(c2);
        C122370v vVar = new C122370v(c2);
        if (eVar == null || wVar5 == null) {
            throw new IllegalStateException("OnDemandDownload.Builder not completely initialized.");
        }
        C17094m mVar = new C17094m(wVar5, vVar, eVar);
        C17086e eVar2 = new C17086e(mVar);
        C17060e eVar3 = mVar.f49752e;
        C70862aj b2 = C70876o.m103761b(eVar3.f189039a.mo39510a(C17062g.m34235b(), eVar3.f189040b), eVar2, true);
        synchronized (mVar.f49753f) {
            mVar.f49754g = Optional.m71637of(b2);
        }
        synchronized (mVar.f49753f) {
            C70868g gVar = (C70868g) mVar.f49754g.orElseThrow(C17082a.f49726a);
            if (!mVar.f49756i) {
                C17075t tVar2 = (C17075t) mVar.f49749b.toBuilder();
                tVar2.copyOnWrite();
                C17078w wVar6 = (C17078w) tVar2.instance;
                wVar6.f49715a |= 4;
                wVar6.f49720f = false;
                gVar.mo20123c((C17078w) tVar2.build());
                gVar.mo20121a();
            } else {
                throw new IllegalStateException("The download was already cancelled.");
            }
        }
        anVar.f339234i = Optional.m71637of(mVar);
        C122360l lVar = anVar.f339233h;
        lVar.mo105605d(lVar.mo105604b(optional), false);
        return C60866ct.f164955a;
    }
}
