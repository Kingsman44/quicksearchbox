package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122191l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.aw */
/* compiled from: PG */
public final class C103923aw implements C118549h {

    /* renamed from: a */
    public static final C58974d f289249a = C58974d.m91136j();

    /* renamed from: b */
    public final C29409fd f289250b;

    /* renamed from: c */
    public final C80617l f289251c;

    /* renamed from: d */
    public final C104032ex f289252d;

    /* renamed from: e */
    public final C103908ah f289253e;

    /* renamed from: f */
    public final C103943bp f289254f;

    /* renamed from: g */
    public final C22871g f289255g;

    /* renamed from: h */
    public final C122191l f289256h;

    /* renamed from: i */
    public final C86054o f289257i;

    public C103923aw(C29409fd fdVar, C80617l lVar, C104032ex exVar, C103908ah ahVar, C103943bp bpVar, C22871g gVar, C122191l lVar2, C86054o oVar) {
        this.f289250b = fdVar;
        this.f289251c = lVar;
        this.f289254f = bpVar;
        this.f289252d = exVar;
        this.f289253e = ahVar;
        this.f289255g = gVar;
        this.f289256h = lVar2;
        this.f289257i = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C29409fd fdVar = this.f289250b;
        C28806cu h = C28807cv.m53759h();
        h.mo34460d(true);
        return this.f289255g.mo28210j(fdVar.mo34718g(h.mo34462f()), "[NGA] iterate the MDD groups to check whether they are stale", new C103916ap(this));
    }
}
