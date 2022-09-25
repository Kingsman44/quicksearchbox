package com.google.android.apps.gsa.search.core.service.p6859i.p6861b;

import com.google.android.apps.gsa.search.core.service.p6845b.C86633b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6859i.C86749a;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.C86752a;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.C86765b;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a.C86761i;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.search.core.service.i.b.b */
/* compiled from: PG */
public final class C86766b implements C86749a {

    /* renamed from: a */
    private static final C59071e f234357a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.i.b.b");

    /* renamed from: b */
    private final C86765b f234358b;

    /* renamed from: c */
    private final ConcurrentMap f234359c = new ConcurrentHashMap();

    /* renamed from: d */
    private final C86751a f234360d;

    /* renamed from: e */
    private volatile boolean f234361e;

    public C86766b(C86765b bVar, C86751a aVar) {
        this.f234358b = bVar;
        this.f234360d = aVar;
    }

    /* renamed from: f */
    private final C86752a m139799f(String str) {
        C86752a aVar = (C86752a) this.f234359c.get(str);
        if (aVar != null) {
            return aVar;
        }
        C86765b bVar = this.f234358b;
        str.getClass();
        C86761i iVar = (C86761i) bVar.f234356a.mo17428b();
        iVar.getClass();
        C86752a aVar2 = new C86752a(str, iVar);
        C86752a aVar3 = (C86752a) this.f234359c.putIfAbsent(str, aVar2);
        return aVar3 != null ? aVar3 : aVar2;
    }

    /* renamed from: a */
    public final synchronized void mo80257a() {
        if (!this.f234361e) {
            C59104x b = f234357a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WorkerManager");
            ((C59052c) ((C59052c) b).mo56372aa(8545)).mo56386p("dispose()");
            this.f234361e = true;
            for (Map.Entry value : this.f234359c.entrySet()) {
                ((C86752a) value.getValue()).mo80257a();
            }
        }
    }

    /* renamed from: b */
    public final C60870cx mo80361b(String str) {
        if (this.f234361e) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92899h(new C86633b("WorkerManager is disposed"));
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return m139799f(str).mo80364b();
    }

    /* renamed from: c */
    public final void mo80362c(C86744b bVar) {
        if (this.f234361e) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        String ia = bVar.mo80349ia();
        C58976aa aaVar2 = C58975e.f156826a;
        m139799f(ia).mo80365c();
    }

    /* renamed from: e */
    public final void mo80363e() {
        if (this.f234361e) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x b = f234357a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WorkerManager");
        ((C59052c) ((C59052c) b).mo56372aa(8548)).mo56386p("Unloading disused workers");
        for (Map.Entry value : this.f234359c.entrySet()) {
            ((C86752a) value.getValue()).mo80366e();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkerManagerImpl");
        fVar.mo85285l(this.f234360d);
        TreeMap treeMap = new TreeMap(this.f234359c);
        fVar.mo85279c("number of workers").mo85276a(C90752i.m148230d(Integer.valueOf(treeMap.size())));
        for (Map.Entry entry : treeMap.entrySet()) {
            fVar.mo85288o((String) entry.getKey(), (C90964a) entry.getValue());
        }
    }
}
