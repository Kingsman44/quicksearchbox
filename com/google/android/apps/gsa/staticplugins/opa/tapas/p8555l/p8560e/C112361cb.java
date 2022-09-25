package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112462ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48592ah;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48658s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.research.p5181a.C66277a;
import com.google.research.p5181a.C66297ab;
import com.google.research.p5181a.C66298ac;
import com.google.research.p5181a.C66299b;
import com.google.research.p5181a.C66350e;
import com.google.research.p5181a.C66380i;
import com.google.research.p5181a.C66384m;
import com.google.research.p5181a.C66392u;
import com.google.research.p5181a.C66393v;
import com.google.research.p5181a.C66396y;
import com.google.research.p5181a.p5183b.p5184a.C66300a;
import com.google.research.p5181a.p5183b.p5184a.C66302c;
import com.google.research.p5181a.p5183b.p5184a.C66303d;
import com.google.research.p5181a.p5183b.p5184a.C66306g;
import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5183b.p5184a.C66308i;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.cb */
/* compiled from: PG */
public final /* synthetic */ class C112361cb implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C113405ep f311774a;

    /* renamed from: b */
    public final /* synthetic */ Map f311775b;

    /* renamed from: c */
    public final /* synthetic */ C112471ap f311776c;

    /* renamed from: d */
    public final /* synthetic */ C66302c f311777d;

    /* renamed from: e */
    public final /* synthetic */ List f311778e;

    public /* synthetic */ C112361cb(C113405ep epVar, Map map, C112471ap apVar, C66302c cVar, List list) {
        this.f311774a = epVar;
        this.f311775b = map;
        this.f311776c = apVar;
        this.f311777d = cVar;
        this.f311778e = list;
    }

    public final Object get() {
        C113405ep epVar = this.f311774a;
        Map map = this.f311775b;
        C112471ap apVar = this.f311776c;
        C66302c cVar = this.f311777d;
        List list = this.f311778e;
        C121537f fVar = C112365cf.f311784a;
        String p = epVar.mo100033p();
        C66350e eVar = cVar.f180311a;
        eVar.copyOnWrite();
        C66380i iVar = (C66380i) eVar.instance;
        C66380i iVar2 = C66380i.f180482l;
        p.getClass();
        iVar.f180484a |= 64;
        iVar.f180490g = p;
        C66308i iVar3 = new C66308i();
        long c = epVar.mo100018c();
        C66297ab abVar = iVar3.f180317a;
        abVar.copyOnWrite();
        C66298ac acVar = (C66298ac) abVar.instance;
        C66298ac acVar2 = C66298ac.f180295h;
        acVar.f180297a |= 1;
        acVar.f180298b = c;
        String id = Calendar.getInstance().getTimeZone().getID();
        C66297ab abVar2 = iVar3.f180317a;
        abVar2.copyOnWrite();
        C66298ac acVar3 = (C66298ac) abVar2.instance;
        id.getClass();
        acVar3.f180297a |= 8;
        acVar3.f180301e = id;
        cVar.mo59471n(iVar3);
        C66350e eVar2 = cVar.f180311a;
        C66384m mVar = (C66384m) ((C66303d) C112365cf.f311784a.mo105235d("translateLocation", new C112362cc(apVar))).f180312a.build();
        eVar2.copyOnWrite();
        C66380i iVar4 = (C66380i) eVar2.instance;
        mVar.getClass();
        iVar4.f180489f = mVar;
        iVar4.f180484a |= 32;
        List<C66307h> list2 = (List) C112365cf.f311784a.mo105235d("translateShareTargets", new C112363cd(map, list));
        C66306g gVar = new C66306g();
        if (list2 != null) {
            C66392u uVar = gVar.f180315a;
            uVar.copyOnWrite();
            C66393v vVar = C66393v.f180531f;
            ((C66393v) uVar.instance).f180534b = C66393v.emptyProtobufList();
            for (C66307h hVar : list2) {
                C66392u uVar2 = gVar.f180315a;
                C66396y yVar = (C66396y) hVar.f180316a.build();
                uVar2.copyOnWrite();
                C66393v vVar2 = (C66393v) uVar2.instance;
                yVar.getClass();
                C62971cq cqVar = vVar2.f180534b;
                if (!cqVar.mo58948c()) {
                    vVar2.f180534b = C62942bv.mutableCopy(cqVar);
                }
                vVar2.f180534b.add(yVar);
            }
        }
        Optional map2 = apVar.mo99543n(C48634bw.FOREGROUND_APP_SIGNAL).map(C112462ag.f311979a);
        if (map2.isPresent() && !((C48592ah) map2.get()).f125597a.isEmpty()) {
            String str = ((C48592ah) map2.get()).f125597a;
            C66392u uVar3 = gVar.f180315a;
            uVar3.copyOnWrite();
            C66393v vVar3 = (C66393v) uVar3.instance;
            C66393v vVar4 = C66393v.f180531f;
            str.getClass();
            vVar3.f180533a |= 4;
            vVar3.f180536d = str;
        }
        cVar.mo59470m(gVar);
        C121509q l = C112365cf.f311784a.mo105243l("battery");
        try {
            C66300a aVar = new C66300a();
            Optional f = apVar.mo99535f();
            if (f.isPresent()) {
                boolean z = ((C48658s) f.get()).f125755a;
                C66277a aVar2 = aVar.f180309a;
                aVar2.copyOnWrite();
                C66299b bVar = (C66299b) aVar2.instance;
                C66299b bVar2 = C66299b.f180304d;
                bVar.f180306a |= 1;
                bVar.f180307b = z;
                int i = ((C48658s) f.get()).f125756b;
                C66277a aVar3 = aVar.f180309a;
                aVar3.copyOnWrite();
                C66299b bVar3 = (C66299b) aVar3.instance;
                bVar3.f180306a |= 2;
                bVar3.f180308c = i;
            }
            C66350e eVar3 = cVar.f180311a;
            C66299b bVar4 = (C66299b) aVar.f180309a.build();
            eVar3.copyOnWrite();
            C66380i iVar5 = (C66380i) eVar3.instance;
            bVar4.getClass();
            iVar5.f180494k = bVar4;
            iVar5.f180484a |= 2048;
            l.close();
            return cVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
