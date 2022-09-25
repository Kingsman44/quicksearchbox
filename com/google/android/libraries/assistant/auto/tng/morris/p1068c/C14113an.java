package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62940bt;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5535j.p5536a.p5537a.p5538a.C70912a;
import p5535j.p5536a.p5537a.p5538a.C70913b;
import p5535j.p5536a.p5537a.p5538a.C70914c;
import p5535j.p5536a.p5537a.p5538a.C70915d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.an */
/* compiled from: PG */
public final class C14113an {

    /* renamed from: a */
    private static final C59071e f42803a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.c.an");

    /* renamed from: b */
    private final C37215b f42804b;

    /* renamed from: c */
    private final C60888db f42805c;

    /* renamed from: d */
    private final ActivityManager f42806d;

    /* renamed from: e */
    private final C86124t f42807e;

    /* renamed from: f */
    private final AtomicReference f42808f = new AtomicReference();

    public C14113an(Context context, C86124t tVar, C37215b bVar, C60888db dbVar) {
        this.f42804b = bVar;
        this.f42805c = dbVar;
        this.f42806d = (ActivityManager) context.getSystemService("activity");
        this.f42807e = tVar;
    }

    /* renamed from: a */
    public final void mo21423a(C37254c cVar) {
        C60870cx cxVar = (C60870cx) this.f42808f.getAndSet((Object) null);
        if (cxVar != null) {
            cxVar.cancel(false);
            C59104x b = f42803a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.StrtAppFlwLgr");
            ((C59052c) ((C59052c) b).mo56372aa(45817)).mo56387q("MORRIS_STARTUP finished with end_event[%s]", cVar.mo40778b().f98906a);
        } else {
            C59104x d = f42803a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.StrtAppFlwLgr");
            ((C59052c) ((C59052c) d).mo56372aa(45816)).mo56387q("*invalid* MORRIS_STARTUP finished with end_event[%s]", cVar.mo40778b().f98906a);
        }
        this.f42804b.mo19974a(cVar);
    }

    /* renamed from: b */
    public final void mo21424b(C37254c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21426d()) {
            this.f42804b.mo19974a(cVar);
        }
    }

    /* renamed from: c */
    public final void mo21425c(C37254c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = (C60870cx) this.f42808f.get();
        if (cxVar != null) {
            C59104x d = f42803a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.StrtAppFlwLgr");
            ((C59052c) ((C59052c) d).mo56372aa(45820)).mo56386p("Morris start event logged when an AppFlow was already in progress.");
            cxVar.cancel(false);
        }
        if (this.f42807e.mo79746e(C90051dc.f248844az)) {
            C37215b bVar = this.f42804b;
            C62940bt btVar = C70915d.f189107d;
            C70912a aVar = (C70912a) C70915d.f189106c.createBuilder();
            C70913b bVar2 = (C70913b) C70914c.f189102c.createBuilder();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = this.f42806d;
            activityManager.getClass();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            bVar2.copyOnWrite();
            C70914c cVar2 = (C70914c) bVar2.instance;
            cVar2.f189104a |= 1;
            cVar2.f189105b = j;
            aVar.copyOnWrite();
            C70915d dVar = (C70915d) aVar.instance;
            C70914c cVar3 = (C70914c) bVar2.build();
            cVar3.getClass();
            dVar.f189110b = cVar3;
            dVar.f189109a |= 1;
            ((C37253b) cVar).mo40792p(btVar, (C70915d) aVar.build());
            bVar.mo19974a(cVar);
        } else {
            this.f42804b.mo19974a(cVar);
        }
        this.f42808f.set(C60856cj.m92902k(C47810es.m84965e(new C14112am(this)), 30000, TimeUnit.MILLISECONDS, this.f42805c));
    }

    /* renamed from: d */
    public final boolean mo21426d() {
        return this.f42808f.get() != null;
    }
}
