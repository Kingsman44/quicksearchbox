package com.google.android.apps.gsa.staticplugins.p7666ci.p7667a;

import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85491h;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.a.h */
/* compiled from: PG */
public final /* synthetic */ class C97753h implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C97754i f272934a;

    /* renamed from: b */
    public final /* synthetic */ C87696ae f272935b;

    /* renamed from: c */
    public final /* synthetic */ AtomicLong f272936c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f272937d;

    /* renamed from: e */
    public final /* synthetic */ long f272938e;

    public /* synthetic */ C97753h(C97754i iVar, C87696ae aeVar, AtomicLong atomicLong, C58833ax axVar, long j) {
        this.f272934a = iVar;
        this.f272935b = aeVar;
        this.f272936c = atomicLong;
        this.f272937d = axVar;
        this.f272938e = j;
    }

    public final void run() {
        C97754i iVar = this.f272934a;
        C87696ae aeVar = this.f272935b;
        AtomicLong atomicLong = this.f272936c;
        C58833ax axVar = this.f272937d;
        long j = this.f272938e;
        C97759n nVar = iVar.f272941c;
        nVar.f272952c.mo79001f(aeVar, (C85491h) nVar.f272955f.mo27525b());
        atomicLong.decrementAndGet();
        C97759n nVar2 = iVar.f272941c;
        nVar2.f272953d.mo103685c(nVar2.f272954e.mo103707d((C53306j) axVar.mo56107c()), Long.valueOf(iVar.f272941c.f272956g.mo26870b()));
        C59104x b = C97759n.f272950a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
        ((C59052c) ((C59052c) b).mo56372aa(30297)).mo56351D("The delayed {%s} client sync request %s started.", j, ((C53306j) axVar.mo56107c()).name());
    }
}
