package com.google.android.apps.gsa.sidekick.main.remoteservice;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91596c;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91598e;
import com.google.android.apps.gsa.sidekick.shared.training.QuestionKey;
import com.google.android.apps.p489g.p495e.C9284a;
import com.google.android.apps.p489g.p495e.C9285b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7912oo;
import com.google.p375ai.p378b.C7913op;
import com.google.p375ai.p378b.C7918ou;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.sidekick.main.remoteservice.e */
/* compiled from: PG */
public final class C91610e {

    /* renamed from: a */
    public static final C59071e f255511a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.remoteservice.e");

    /* renamed from: b */
    public final Context f255512b;

    /* renamed from: c */
    public final C68214a f255513c;

    /* renamed from: d */
    public final C68214a f255514d;

    /* renamed from: e */
    public final C68214a f255515e;

    /* renamed from: f */
    public final C68214a f255516f;

    /* renamed from: g */
    public final C68214a f255517g;

    /* renamed from: h */
    public final C68214a f255518h;

    /* renamed from: i */
    public final C68214a f255519i;

    /* renamed from: j */
    public final C68214a f255520j;

    /* renamed from: k */
    public final C68214a f255521k;

    /* renamed from: l */
    public final C68214a f255522l;

    /* renamed from: m */
    public final C68214a f255523m;

    /* renamed from: n */
    public final C68214a f255524n;

    /* renamed from: o */
    public final C68214a f255525o;

    /* renamed from: p */
    public final AtomicInteger f255526p = new AtomicInteger(0);

    public C91610e(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13) {
        this.f255512b = context;
        this.f255514d = aVar;
        this.f255515e = aVar2;
        this.f255516f = aVar3;
        this.f255517g = aVar4;
        this.f255518h = aVar5;
        this.f255519i = aVar6;
        this.f255520j = aVar7;
        this.f255521k = aVar8;
        this.f255522l = aVar9;
        this.f255523m = aVar10;
        this.f255524n = aVar11;
        this.f255525o = aVar12;
        this.f255513c = aVar13;
    }

    /* renamed from: a */
    public final C60870cx mo85989a(C7918ou ouVar, C7912oo ooVar, C7718hj hjVar) {
        C91598e eVar = (C91598e) this.f255517g.mo27525b();
        C7913op opVar = (C7913op) ouVar.toBuilder();
        long b = eVar.f255468f.mo26870b();
        opVar.copyOnWrite();
        C7918ou ouVar2 = (C7918ou) opVar.instance;
        ouVar2.f27826a |= 4;
        ouVar2.f27830e = b;
        opVar.copyOnWrite();
        C7918ou ouVar3 = (C7918ou) opVar.instance;
        ooVar.getClass();
        ouVar3.f27829d = ooVar;
        ouVar3.f27826a |= 2;
        C7918ou ouVar4 = (C7918ou) opVar.build();
        QuestionKey questionKey = new QuestionKey(ouVar4);
        C9284a aVar = (C9284a) C9285b.f32227d.createBuilder();
        aVar.copyOnWrite();
        C9285b bVar = (C9285b) aVar.instance;
        ouVar4.getClass();
        bVar.f32230b = ouVar4;
        bVar.f32229a |= 1;
        if (hjVar != null) {
            aVar.copyOnWrite();
            C9285b bVar2 = (C9285b) aVar.instance;
            bVar2.f32231c = hjVar;
            bVar2.f32229a |= 2;
        } else {
            aVar.copyOnWrite();
            C9285b bVar3 = (C9285b) aVar.instance;
            bVar3.f32231c = null;
            bVar3.f32229a &= -3;
        }
        synchronized (eVar.f255469g) {
            eVar.f255474l.put(questionKey, (C9285b) aVar.build());
        }
        return eVar.f255475m.mo85139d(new C91596c(eVar));
    }

    /* renamed from: b */
    public final void mo85990b(C60870cx cxVar, String str) {
        ((C90929bz) this.f255514d.mo27525b()).mo85142g(cxVar, new C90952r("RemoteServiceHelper", str, "failure"));
    }

    /* renamed from: c */
    public final void mo85991c() {
        ((C90929bz) this.f255514d.mo27525b()).mo85139d(new C91609d(this));
    }
}
