package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6108e;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c.C77513ad;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80640d;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37403bh;
import com.google.android.libraries.search.p2904c.C37461cj;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37474cw;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.e.c */
/* compiled from: PG */
public final class C77546c implements C75157e {

    /* renamed from: a */
    public static final C58974d f213663a = C58974d.m91136j();

    /* renamed from: b */
    public final C77732a f213664b;

    /* renamed from: c */
    private final C80642f f213665c;

    /* renamed from: d */
    private final C22871g f213666d;

    /* renamed from: e */
    private C37403bh f213667e;

    /* renamed from: f */
    private final C77513ad f213668f;

    public C77546c(C77513ad adVar, C80642f fVar, C77732a aVar, C22871g gVar) {
        this.f213668f = adVar;
        this.f213665c = fVar;
        this.f213664b = aVar;
        this.f213666d = gVar;
    }

    /* renamed from: d */
    private static C37462ck m124374d() {
        C37461cj cjVar = (C37461cj) C37462ck.f99442c.createBuilder();
        C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
        C37474cw cwVar = C37474cw.f99469a;
        coVar.copyOnWrite();
        C37467cp cpVar = (C37467cp) coVar.instance;
        cwVar.getClass();
        cpVar.f99461b = cwVar;
        cpVar.f99460a = 2;
        C37467cp cpVar2 = (C37467cp) coVar.build();
        cjVar.copyOnWrite();
        C37462ck ckVar = (C37462ck) cjVar.instance;
        cpVar2.getClass();
        ckVar.f99445b = cpVar2;
        ckVar.f99444a |= 1;
        return (C37462ck) cjVar.build();
    }

    /* renamed from: e */
    private final synchronized void m124375e(C37462ck ckVar) {
        C37403bh c = this.f213668f.mo72595a().mo40937c(ckVar);
        this.f213667e = c;
        new C90873ag(c.mo40934b(), this.f213666d, "[NGA] AudioRouteManager#logDisconnectStatus", new C77544a(this, ckVar)).mo85223a(C77545b.f213662a);
    }

    /* renamed from: a */
    public final synchronized void mo71137a(C75077bo boVar, C75077bo boVar2) {
        C37403bh bhVar;
        C80640d k = boVar.mo71465k();
        if (!boVar2.mo71465k().equals(k) || (bhVar = this.f213667e) == null || bhVar.mo40934b().isDone()) {
            m124375e((C37462ck) this.f213665c.mo74377c(k).orElse(m124374d()));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final synchronized C37403bh mo72600c() {
        C37403bh bhVar = this.f213667e;
        if (bhVar == null || bhVar.mo40934b().isDone()) {
            m124375e(m124374d());
        }
        return this.f213667e;
    }
}
