package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2024d.C24423q;
import com.google.android.libraries.lens.ondevice.p2025e.C24434a;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2030g.C24496a;
import com.google.android.libraries.lens.ondevice.p2030g.C24497b;
import com.google.android.libraries.lens.ondevice.p2030g.C24499d;
import com.google.android.libraries.lens.ondevice.p2030g.C24500e;
import com.google.android.libraries.lens.ondevice.p2037n.C24767a;
import com.google.android.libraries.lens.ondevice.p2037n.C24771ad;
import com.google.android.libraries.lens.ondevice.p2037n.C24772ae;
import com.google.android.libraries.lens.ondevice.p2037n.C24791b;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58894dd;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.ondevice.h.m */
/* compiled from: PG */
final class C24517m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24519o f67148a;

    public C24517m(C24519o oVar) {
        this.f67148a = oVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C24519o.f67150a.mo56225c()).mo56382g(th)).mo56372aa(48821)).mo56389s("Cascade execution failed %s", th);
        C24519o oVar = this.f67148a;
        oVar.f67154e.mo29944c(oVar.f67152c.f66855a, oVar.f67160k, C24805p.CASCADE_RUN_ERROR);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24288f fVar = (C24288f) obj;
        this.f67148a.f67159j = fVar.mo29845l();
        C24519o oVar = this.f67148a;
        C60856cj.m92911t(fVar.mo29845l(), C47810es.m84974n(new C24518n(oVar)), C60826bg.f164896a);
        C24519o oVar2 = this.f67148a;
        C60870cx l = fVar.mo29845l();
        LodeResourceHolder lodeResourceHolder = oVar2.f67156g;
        Objects.requireNonNull(lodeResourceHolder);
        l.mo4106b(new C24516l(lodeResourceHolder), C60826bg.f164896a);
        C24519o oVar3 = this.f67148a;
        C58833ax axVar = oVar3.f67157h;
        if (axVar.mo56113h()) {
            C24500e eVar = (C24500e) axVar.mo56107c();
            C62331d dVar = oVar3.f67152c.f66855a;
            C24292d dVar2 = oVar3.f67161l;
            C60826bg bgVar = C60826bg.f164896a;
            C58833ax c = dVar2.mo29859c();
            if (!c.mo56113h() || !((C24434a) c.mo56107c()).mo29875b()) {
                ((C58970a) ((C58970a) C24500e.f67033a.mo56224b()).mo56372aa(48810)).mo56386p("Debug-sink isn't enabled, nothing to dump.");
                return;
            }
            C58833ax a = C24435b.m45508a(c);
            C24771ad adVar = (C24771ad) C24772ae.f67686d.createBuilder();
            C24767a aVar = (C24767a) C24791b.f67740b.createBuilder();
            Iterable iterable = (Iterable) Collection.EL.stream(C24423q.m45484a(dVar).mo29872a()).map(C24496a.f67027a).collect(C58370cn.f155946a);
            aVar.copyOnWrite();
            C24791b bVar = (C24791b) aVar.instance;
            C62971cq cqVar = bVar.f67742a;
            if (!cqVar.mo58948c()) {
                bVar.f67742a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) bVar.f67742a);
            C24791b bVar2 = (C24791b) aVar.build();
            adVar.copyOnWrite();
            C24772ae aeVar = (C24772ae) adVar.instance;
            bVar2.getClass();
            aeVar.f67689b = bVar2;
            aeVar.f67688a |= 1;
            if (dVar == C62331d.TRANSLATE_OCR_CASCADE || dVar == C62331d.PAGE_LAYOUT_CASCADE || dVar == C62331d.SPLIT_OCR_CASCADE || dVar == C62331d.STANDALONE_OCR_CASCADE) {
                C24286d h = fVar.mo29840h();
                if (!a.mo56113h()) {
                    ((C58970a) ((C58970a) C24500e.f67033a.mo56224b()).mo56372aa(48807)).mo56386p("Debug-sink isn't enabled, nothing to dump.");
                } else if (h != null) {
                    C60856cj.m92911t(h.mo29848a(), C47810es.m84974n(new C24497b(adVar, a)), bgVar);
                } else {
                    ((C58970a) ((C58970a) C24500e.f67033a.mo56224b()).mo56372aa(48806)).mo56386p("Engine output is null. Adding just the cascade info in the debug sink.");
                    C24772ae aeVar2 = (C24772ae) adVar.build();
                    ((C24434a) a.mo56107c()).mo29881h();
                    throw new C58894dd("LensOnDeviceEngineResult is missing the final result.");
                }
            } else if (dVar == C62331d.TRANSLATE_FULL_PAGE_LAYOUT_CASCADE || dVar == C62331d.TRANSLATE_TEXT_CASCADE) {
                C24286d e = fVar.mo29836e();
                if (!a.mo56113h()) {
                    ((C58970a) ((C58970a) C24500e.f67033a.mo56224b()).mo56372aa(48809)).mo56386p("Debug-sink isn't enabled, nothing to dump.");
                } else if (e != null) {
                    C60856cj.m92911t(e.mo29848a(), C47810es.m84974n(new C24499d(adVar, a)), bgVar);
                } else {
                    ((C58970a) ((C58970a) C24500e.f67033a.mo56224b()).mo56372aa(48808)).mo56386p("Engine output is null. Adding just the cascade info in the debug sink.");
                    C24772ae aeVar3 = (C24772ae) adVar.build();
                    ((C24434a) a.mo56107c()).mo29881h();
                    throw new C58894dd("LensOnDeviceEngineResult is missing the final result.");
                }
            } else {
                ((C58970a) ((C58970a) C24500e.f67033a.mo56226d()).mo56372aa(48811)).mo56389s("Unsupported cascade type %s.", dVar.name());
            }
        }
    }
}
