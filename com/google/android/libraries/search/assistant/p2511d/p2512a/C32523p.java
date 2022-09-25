package com.google.android.libraries.search.assistant.p2511d.p2512a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.libraries.search.assistant.d.a.p */
/* compiled from: PG */
final class C32523p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C32510c f87122a;

    /* renamed from: b */
    final /* synthetic */ C32525r f87123b;

    public C32523p(C32525r rVar, C32510c cVar) {
        this.f87123b = rVar;
        this.f87122a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f87123b.f87127d.remove(Long.valueOf(this.f87122a.f87091d)) != null) {
            C34822b b = C34830d.m63595b(th);
            C32524q qVar = this.f87123b.f87124a;
            C32511d dVar = (C32511d) C32512e.f87093e.createBuilder();
            long j = this.f87122a.f87091d;
            dVar.copyOnWrite();
            C32512e eVar = (C32512e) dVar.instance;
            eVar.f87095a |= 1;
            eVar.f87098d = j;
            dVar.copyOnWrite();
            C32512e eVar2 = (C32512e) dVar.instance;
            b.getClass();
            eVar2.f87097c = b;
            eVar2.f87096b = 3;
            qVar.mo38125b((C32512e) dVar.build());
            C34834b bVar = b.f92362c;
            if (bVar == null) {
                bVar = C34834b.f92401c;
            }
            if (C34830d.m63596c(C34819a.m63579b(bVar))) {
                this.f87123b.f87124a.mo38126c(th);
            }
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        if (this.f87123b.f87127d.remove(Long.valueOf(this.f87122a.f87091d)) != null) {
            C32524q qVar = this.f87123b.f87124a;
            C32511d dVar = (C32511d) C32512e.f87093e.createBuilder();
            long j = this.f87122a.f87091d;
            dVar.copyOnWrite();
            C32512e eVar = (C32512e) dVar.instance;
            eVar.f87095a |= 1;
            eVar.f87098d = j;
            C62912at atVar = C62912at.f169862a;
            dVar.copyOnWrite();
            C32512e eVar2 = (C32512e) dVar.instance;
            atVar.getClass();
            eVar2.f87097c = atVar;
            eVar2.f87096b = 2;
            dVar.mo58885m(this.f87123b.f87125b.f87085b, obj);
            qVar.mo38125b((C32512e) dVar.build());
        }
    }
}
