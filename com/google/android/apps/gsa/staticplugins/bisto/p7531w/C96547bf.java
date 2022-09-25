package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89682u;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bf */
/* compiled from: PG */
public final class C96547bf extends C96558bq {

    /* renamed from: a */
    public static final C59071e f270092a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.bf");

    /* renamed from: b */
    public static final int f270093b = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: c */
    public static final long f270094c = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: d */
    public final C95352bc f270095d = new C96542ba(this);

    /* renamed from: e */
    public final C96618u f270096e;

    /* renamed from: f */
    public final C96546be f270097f;

    /* renamed from: g */
    public final C89682u f270098g;

    /* renamed from: h */
    public final C95848i f270099h;

    /* renamed from: i */
    public final C22871g f270100i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96547bf(C22871g gVar, C96525ak akVar, C68214a aVar, C96618u uVar, C96534at atVar, C96533as asVar, C95355bf bfVar, C89682u uVar2, C95848i iVar, C22871g gVar2) {
        super(gVar, akVar, aVar, atVar, asVar, uVar, bfVar);
        this.f270096e = uVar;
        this.f270097f = new C96546be(this, m159963m(this.f270134l));
        this.f270098g = uVar2;
        this.f270099h = iVar;
        this.f270100i = gVar2;
    }

    /* renamed from: m */
    public static boolean m159963m(C124548d dVar) {
        return !"00000006".equals(dVar.mo106481V()) && dVar.mo106500an() != 2;
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.NON_FORCE_APPLY_SENT;
    }

    /* renamed from: e */
    public final void mo90228e(C124629av avVar, C124548d dVar) {
        super.mo90228e(avVar, dVar);
        this.f270100i.mo28207g("handleApplyError", new C96537aw(this));
        int a = C124640bf.m204304a(avVar.f343818e);
        if ((a == 0 || a != 2) && m159963m(dVar) && !mo90246v()) {
            this.f270096e.mo90277b();
        }
        this.f270097f.mo90235b();
    }

    /* renamed from: h */
    public final void mo90231h(Set set, C124548d dVar) {
        super.mo90231h(set, dVar);
        if (!this.f270137o.mo90223d() || !set.contains(6)) {
            return;
        }
        if (C124715m.NOT_CONNECTED.equals(dVar.mo106512j())) {
            this.f270097f.mo90236c();
        } else {
            this.f270097f.mo90235b();
        }
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateApplySent";
    }

    /* renamed from: l */
    public final void mo90238l() {
        this.f270100i.mo28207g("handleApplyError", new C96536av(this));
    }
}
