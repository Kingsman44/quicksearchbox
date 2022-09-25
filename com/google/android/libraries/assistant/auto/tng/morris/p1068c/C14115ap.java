package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15390r;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.p4552o.C59738dw;
import com.google.common.p4552o.C59739dx;
import com.google.common.p4573p.C60720j;
import com.google.common.p4575r.C60749f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.ap */
/* compiled from: PG */
public final class C14115ap {

    /* renamed from: a */
    private static final C59071e f42810a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.c.ap");

    /* renamed from: b */
    private static final String f42811b = C37182a.f98003eW.f99011a.f98876a.toString();

    /* renamed from: c */
    private static final String f42812c = C37182a.f98060fa.f99011a.f98876a.toString();

    /* renamed from: d */
    private final C37215b f42813d;

    /* renamed from: e */
    private final C60888db f42814e;

    /* renamed from: f */
    private final AtomicReference f42815f = new AtomicReference();

    /* renamed from: g */
    private final AtomicBoolean f42816g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f42817h = new AtomicBoolean(false);

    public C14115ap(C37215b bVar, C60888db dbVar) {
        this.f42813d = bVar;
        this.f42814e = dbVar;
    }

    /* renamed from: a */
    public final void mo21427a(C37252a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = (C60870cx) this.f42815f.getAndSet((Object) null);
        if (cxVar != null) {
            cxVar.cancel(false);
            C59104x b = f42810a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.TeardownAFLgr");
            ((C59052c) ((C59052c) b).mo56372aa(45823)).mo56387q("MORRIS_TEARDOWN finished with end_event[%s]", ((C37253b) aVar).f98999a.f98876a.f98906a);
        } else {
            C59104x d = f42810a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.TeardownAFLgr");
            ((C59052c) ((C59052c) d).mo56372aa(45822)).mo56387q("*invalid* MORRIS_TEARDOWN finished with end_event[%s]", ((C37253b) aVar).f98999a.f98876a.f98906a);
        }
        this.f42813d.mo19974a(aVar);
        this.f42817h.set(false);
        this.f42816g.set(false);
    }

    /* renamed from: b */
    public final void mo21428b(C37252a aVar, Duration duration) {
        C59738dw dwVar = (C59738dw) C59739dx.f160346j.createBuilder();
        long millis = duration.toMillis();
        dwVar.copyOnWrite();
        C59739dx dxVar = (C59739dx) dwVar.instance;
        dxVar.f160348a |= 128;
        dxVar.f160356i = millis;
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C59739dx dxVar2 = (C59739dx) dwVar.build();
        dxVar2.getClass();
        czVar.f160220k = dxVar2;
        czVar.f160210a |= 1024;
        ((C37253b) aVar).mo40792p(btVar, (C59711cz) cyVar.build());
        mo21427a(aVar);
        C58976aa aaVar = C58975e.f156826a;
        duration.toMillis();
    }

    /* renamed from: c */
    public final void mo21429c(Duration duration) {
        C59738dw dwVar = (C59738dw) C59739dx.f160346j.createBuilder();
        if (!C15390r.f46172b.isEmpty() && !C15390r.f46171a.isEmpty()) {
            synchronized (C15390r.f46172b) {
                if (!C15390r.f46172b.isEmpty()) {
                    int a = (int) C60720j.m92656a(C60749f.m92725c(C15390r.f46172b), 2, 1);
                    dwVar.copyOnWrite();
                    C59739dx dxVar = (C59739dx) dwVar.instance;
                    dxVar.f160348a |= 8;
                    dxVar.f160352e = a;
                    int a2 = (int) C60720j.m92656a(C60749f.m92725c(C15390r.f46172b), 100, 90);
                    dwVar.copyOnWrite();
                    C59739dx dxVar2 = (C59739dx) dwVar.instance;
                    dxVar2.f160348a |= 16;
                    dxVar2.f160353f = a2;
                    int size = C15390r.f46172b.size();
                    dwVar.copyOnWrite();
                    C59739dx dxVar3 = (C59739dx) dwVar.instance;
                    dxVar3.f160348a |= 1;
                    dxVar3.f160349b = size;
                    C15390r.f46172b.clear();
                    synchronized (C15390r.f46171a) {
                        if (!C15390r.f46171a.isEmpty()) {
                            int a3 = (int) C60720j.m92656a(C60749f.m92725c(C15390r.f46171a), 2, 1);
                            dwVar.copyOnWrite();
                            C59739dx dxVar4 = (C59739dx) dwVar.instance;
                            dxVar4.f160348a |= 2;
                            dxVar4.f160350c = a3;
                            int a4 = (int) C60720j.m92656a(C60749f.m92725c(C15390r.f46171a), 100, 90);
                            dwVar.copyOnWrite();
                            C59739dx dxVar5 = (C59739dx) dwVar.instance;
                            dxVar5.f160348a |= 4;
                            dxVar5.f160351d = a4;
                            C15390r.f46171a.clear();
                            synchronized (C15390r.f46173c) {
                                if (!C15390r.f46173c.isEmpty()) {
                                    dwVar.copyOnWrite();
                                    C59739dx dxVar6 = (C59739dx) dwVar.instance;
                                    dxVar6.f160348a |= 32;
                                    dxVar6.f160354g = (int) C60720j.m92656a(C60749f.m92725c(C15390r.f46173c), 2, 1);
                                    dwVar.copyOnWrite();
                                    C59739dx dxVar7 = (C59739dx) dwVar.instance;
                                    dxVar7.f160348a |= 64;
                                    dxVar7.f160355h = (int) C60720j.m92656a(C60749f.m92725c(C15390r.f46173c), 100, 90);
                                    C15390r.f46173c.clear();
                                }
                            }
                        }
                    }
                }
            }
        }
        long millis = duration.toMillis();
        dwVar.copyOnWrite();
        C59739dx dxVar8 = (C59739dx) dwVar.instance;
        dxVar8.f160348a |= 128;
        dxVar8.f160356i = millis;
        C37252a c = C37182a.f98061fb.mo40805c(C62722b.OK);
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C59739dx dxVar9 = (C59739dx) dwVar.build();
        dxVar9.getClass();
        czVar.f160220k = dxVar9;
        czVar.f160210a |= 1024;
        ((C37253b) c).mo40792p(btVar, (C59711cz) cyVar.build());
        mo21427a(c);
        C58976aa aaVar = C58975e.f156826a;
        duration.toMillis();
    }

    /* renamed from: d */
    public final void mo21430d(C37252a aVar, Duration duration) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f42815f.get() != null) {
            this.f42813d.mo19974a(aVar);
            C37253b bVar = (C37253b) aVar;
            if (bVar.f98999a.f98876a.toString().equals(f42811b)) {
                this.f42816g.set(true);
            } else if (bVar.f98999a.f98876a.toString().equals(f42812c)) {
                this.f42817h.set(true);
            }
            if (this.f42817h.get() && this.f42816g.get()) {
                mo21429c(duration);
            }
        }
    }

    /* renamed from: e */
    public final void mo21431e(C37252a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = (C60870cx) this.f42815f.get();
        if (cxVar != null) {
            C59104x d = f42810a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.TeardownAFLgr");
            ((C59052c) ((C59052c) d).mo56372aa(45828)).mo56386p("Morris start event logged when an AppFlow was already in progress.");
            cxVar.cancel(false);
        }
        this.f42813d.mo19974a(aVar);
        AtomicReference atomicReference = this.f42815f;
        C14114ao aoVar = new C14114ao(this);
        atomicReference.set(C60856cj.m92902k(C47810es.m84965e(aoVar), 10000, TimeUnit.MILLISECONDS, this.f42814e));
    }
}
