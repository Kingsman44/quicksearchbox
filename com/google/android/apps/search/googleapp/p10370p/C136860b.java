package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.libraries.search.p2871b.p2891f.C37237b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60922j;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import com.google.protos.p5145v.C65897a;
import com.google.protos.p5145v.C65898b;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71185b;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71188e;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.apps.search.googleapp.p.b */
/* compiled from: PG */
public final class C136860b implements C37237b {

    /* renamed from: b */
    private static final C59071e f372509b = C59071e.m91332i("com.google.android.apps.search.googleapp.p.b");

    /* renamed from: a */
    final C136885u f372510a;

    public C136860b(C136885u uVar) {
        this.f372510a = uVar;
    }

    /* renamed from: a */
    public final void mo40741a(C71189f fVar) {
        int a;
        C136885u uVar = this.f372510a;
        int i = fVar.f189939d;
        if (uVar.f372560b && (a = C71185b.m103904a(fVar.f189937b)) != 0 && a == 2) {
            C65897a aVar = (C65897a) C65898b.f179218e.createBuilder();
            aVar.copyOnWrite();
            C65898b bVar = (C65898b) aVar.instance;
            bVar.f179220a |= 4;
            bVar.f179223d = i;
            if ((fVar.f189936a & 64) != 0) {
                C71188e eVar = fVar.f189944i;
                if (eVar == null) {
                    eVar = C71188e.f189929d;
                }
                int i2 = eVar.f189932b;
                aVar.copyOnWrite();
                C65898b bVar2 = (C65898b) aVar.instance;
                bVar2.f179220a |= 1;
                bVar2.f179221b = i2;
                C66419b a2 = C66419b.m97202a(eVar.f189933c);
                if (a2 == null) {
                    a2 = C66419b.UNKNOWN;
                }
                aVar.copyOnWrite();
                C65898b bVar3 = (C65898b) aVar.instance;
                bVar3.f179222c = a2.f180604g;
                bVar3.f179220a |= 2;
            } else {
                int i3 = fVar.f189940e;
                aVar.copyOnWrite();
                C65898b bVar4 = (C65898b) aVar.instance;
                bVar4.f179220a |= 1;
                bVar4.f179221b = i3;
            }
            C65898b bVar5 = (C65898b) aVar.build();
            if (uVar.mo113423a().mo54919w(bVar5)) {
                C46459k.m82829b(C60922j.m93045h(uVar.f372562d.mo50251a(), C47810es.m84966f(new C136884t(uVar, bVar5)), uVar.f372561c), "Failed to markUsage for flowType = %s", Integer.valueOf(i));
            }
        }
    }

    /* renamed from: b */
    public final void mo40742b() {
        ((C59052c) ((C59052c) f372509b.mo56224b()).mo56372aa(40683)).mo56386p("#onAppFlowEventLogged");
    }
}
