package com.google.android.apps.gsa.staticplugins.nga.p8063g;

import android.accounts.Account;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.nga.api.C74719bw;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103806n;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65806cj;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.g.k */
/* compiled from: PG */
public final class C103206k implements C21851cg {

    /* renamed from: a */
    public static final C58974d f287963a = C58974d.m91136j();

    /* renamed from: b */
    public final C103806n f287964b;

    /* renamed from: c */
    public final C74719bw f287965c;

    /* renamed from: d */
    public final i f287966d;

    /* renamed from: e */
    public final C42876ab f287967e;

    /* renamed from: f */
    public final C22871g f287968f;

    /* renamed from: g */
    private final C103335ap f287969g;

    public C103206k(C103335ap apVar, C103806n nVar, C74719bw bwVar, i iVar, C22871g gVar, C42876ab abVar) {
        this.f287969g = apVar;
        this.f287964b = nVar;
        this.f287965c = bwVar;
        this.f287966d = iVar;
        this.f287968f = gVar;
        this.f287967e = abVar;
    }

    /* renamed from: a */
    public static Optional m171099a(C58485gu guVar, C65806cj cjVar) {
        return Collection.EL.stream(guVar).filter(C103199d.f287955a).filter(new C103200e(cjVar)).findFirst().map(C103201f.f287957a);
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar == C65753ak.PRIVACY_SETTINGS) {
            this.f287968f.mo28212l("[NGA] GellerCorpusSyncListener.updatePrivacySettings", new C103205j(this, account));
        }
        this.f287969g.mo93759r(akVar.f178757bE);
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
