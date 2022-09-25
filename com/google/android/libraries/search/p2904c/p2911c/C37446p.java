package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37422c;
import com.google.android.libraries.search.p2904c.C37566eg;
import com.google.android.libraries.search.p2904c.C37567eh;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.C37593fe;
import com.google.android.libraries.search.p2904c.C37595fg;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37424a;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37430g;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.search.c.c.p */
/* compiled from: PG */
public final class C37446p implements C37335b, C37422c, C37424a {

    /* renamed from: a */
    public static final C59071e f99406a = C59071e.m91332i("com.google.android.libraries.search.c.c.p");

    /* renamed from: b */
    public final Executor f99407b;

    /* renamed from: c */
    public final int f99408c;

    /* renamed from: d */
    public final int f99409d;

    /* renamed from: e */
    public final C58425eo f99410e;

    /* renamed from: f */
    public int f99411f;

    /* renamed from: g */
    public boolean f99412g;

    /* renamed from: h */
    public final C37445o f99413h;

    /* renamed from: i */
    public final List f99414i;

    /* renamed from: j */
    private final C38281b f99415j;

    /* renamed from: k */
    private final Set f99416k = new HashSet();

    /* renamed from: l */
    private final AtomicReference f99417l;

    public C37446p(int i, int i2, C58833ax axVar, C38281b bVar, Executor executor) {
        boolean z = false;
        this.f99411f = 0;
        this.f99412g = false;
        this.f99417l = new AtomicReference((Object) null);
        this.f99414i = new ArrayList();
        this.f99408c = i;
        this.f99409d = i2;
        this.f99415j = bVar;
        C58838bb.m90868c(i > 0);
        C58838bb.m90868c(i2 > 0 ? true : z);
        this.f99407b = new C60904dr(executor);
        this.f99410e = new C58425eo(i);
        this.f99413h = new C37445o(i2, axVar);
    }

    /* renamed from: b */
    public final void mo40890b(int i, byte[] bArr) {
        this.f99407b.execute(C47810es.m84977q(new C37439i(this, bArr, i)));
    }

    /* renamed from: c */
    public final C60870cx mo40947c() {
        C37438h hVar = new C37438h(this);
        return C60856cj.m92904m(C47810es.m84978r(hVar), this.f99407b);
    }

    /* renamed from: e */
    public final void mo40949e(C37430g gVar) {
        C59104x b = f99406a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
        ((C59052c) ((C59052c) b).mo56372aa(52679)).mo56354G("#audio# add processor (%s) to buffer (%s)", C37331f.m66337a(gVar), C37331f.m66337a(this));
        this.f99407b.execute(C47810es.m84977q(new C37434d(this, gVar)));
    }

    /* renamed from: f */
    public final void mo40970f(C37589fa faVar) {
        C38281b bVar = this.f99415j;
        C37593fe feVar = (C37593fe) C37595fg.f99904g.createBuilder();
        C37566eg egVar = (C37566eg) C37567eh.f99829f.createBuilder();
        egVar.copyOnWrite();
        C37567eh ehVar = (C37567eh) egVar.instance;
        ehVar.f99832b = faVar.f99887l;
        ehVar.f99831a |= 1;
        String a = C37331f.m66337a(this);
        egVar.copyOnWrite();
        C37567eh ehVar2 = (C37567eh) egVar.instance;
        ehVar2.f99831a |= 2;
        ehVar2.f99833c = a;
        int i = this.f99411f;
        int i2 = this.f99409d;
        int i3 = this.f99413h.f99403b;
        egVar.copyOnWrite();
        C37567eh ehVar3 = (C37567eh) egVar.instance;
        ehVar3.f99831a |= 4;
        ehVar3.f99834d = (i * i2) + i3;
        C37567eh ehVar4 = (C37567eh) egVar.build();
        feVar.copyOnWrite();
        C37595fg fgVar = (C37595fg) feVar.instance;
        ehVar4.getClass();
        fgVar.f99908c = ehVar4;
        fgVar.f99907b = 3;
        bVar.mo41352f((C37595fg) feVar.build());
    }

    /* renamed from: g */
    public final void mo40971g(C37362b bVar) {
        C37448r rVar = new C37448r(bVar, new C60904dr(bVar.mo39011k()));
        Iterator it = this.f99410e.iterator();
        while (it.hasNext()) {
            rVar.f99421b.execute(C47810es.m84977q(new C37436f(rVar, (C37819l) it.next())));
        }
        C37819l lVar = (C37819l) this.f99417l.get();
        if (lVar != null) {
            rVar.f99421b.execute(C47810es.m84977q(new C37437g(rVar, lVar)));
        }
        this.f99416k.add(rVar);
    }

    /* renamed from: i */
    public final void mo40891i() {
        this.f99407b.execute(C47810es.m84977q(new C37435e(this)));
    }

    /* renamed from: j */
    public final C60870cx mo40946j(C37362b bVar) {
        mo40970f(C37589fa.OUTCOME_AUDIO_BYTES_RECEIVER_REGISTERED);
        C59104x b = f99406a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
        ((C59052c) ((C59052c) b).mo56372aa(52675)).mo56389s("#audio# registerAudioBytesReceiver, buffer(%s)", C37331f.m66337a(this));
        C37442l lVar = new C37442l(this, bVar);
        return C60856cj.m92904m(C47810es.m84978r(lVar), this.f99407b);
    }

    /* renamed from: d */
    public final void mo40969d(C37819l lVar) {
        if (lVar.f100343b == 2) {
            AtomicReference atomicReference = this.f99417l;
            while (!atomicReference.compareAndSet((Object) null, lVar)) {
                if (atomicReference.get() != null) {
                    C59104x d = f99406a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
                    ((C59052c) ((C59052c) d).mo56372aa(52680)).mo56389s("#audio# buffer's(%s) end of data has been already recorded, don't notify", C37331f.m66337a(this));
                    return;
                }
            }
        } else {
            this.f99410e.add(lVar);
            this.f99411f++;
        }
        for (C37443m mVar : this.f99416k) {
            mVar.mo40968b().execute(C47810es.m84977q(new C37440j(mVar, lVar)));
        }
    }
}
