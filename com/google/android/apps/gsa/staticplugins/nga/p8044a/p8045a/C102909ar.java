package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.accounts.Account;
import com.google.android.apps.gsa.n.e.d;
import com.google.android.apps.gsa.n.e.e;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.p5879n.p5880e.C74662f;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.nga.p8049d.p8050a.C103021c;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58882cs;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.aea;
import com.google.common.p4552o.ahi;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.ar */
/* compiled from: PG */
public final class C102909ar implements C86091a, C86051l, C74718bv, C90991b {

    /* renamed from: a */
    public static final C58974d f287367a = C58974d.m91136j();

    /* renamed from: b */
    public final C68214a f287368b;

    /* renamed from: c */
    public final C81252aq f287369c;

    /* renamed from: d */
    public final C68214a f287370d;

    /* renamed from: e */
    public final C22871g f287371e;

    /* renamed from: f */
    public final Object f287372f = new Object();

    /* renamed from: g */
    public C58881cr f287373g;

    /* renamed from: h */
    public C60870cx f287374h;

    /* renamed from: i */
    public final AtomicBoolean f287375i = new AtomicBoolean(false);

    /* renamed from: j */
    public final C103021c f287376j;

    /* renamed from: k */
    private final C68214a f287377k;

    /* renamed from: l */
    private final C118561t f287378l;

    /* renamed from: m */
    private final C68214a f287379m;

    public C102909ar(C68214a aVar, C68214a aVar2, C81252aq aqVar, C103021c cVar, C68214a aVar3, C22871g gVar, C118561t tVar, C68214a aVar4) {
        this.f287368b = aVar;
        this.f287377k = aVar2;
        this.f287369c = aqVar;
        this.f287376j = cVar;
        this.f287370d = aVar3;
        this.f287371e = gVar;
        this.f287378l = tVar;
        this.f287379m = aVar4;
        this.f287373g = mo93525e();
    }

    /* renamed from: a */
    public final void mo17497a(NgaState ngaState) {
        if (mo93530j()) {
            C80905at.m128763g(mo93528h(), C102986o.f287565a);
        }
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        this.f287371e.mo28212l("[NGA] NgaAccountChecker.onDeviceInstallOrBoot", new C102896ae(this));
    }

    /* renamed from: e */
    public final C58881cr mo93525e() {
        C58882cs csVar;
        synchronized (this.f287372f) {
            csVar = new C58882cs(new C102894ac(this), 10, TimeUnit.MINUTES);
        }
        return csVar;
    }

    /* renamed from: f */
    public final aea mo93526f() {
        aea aea;
        if (!mo93530j()) {
            return aea.ACCOUNT_CHECKER_DISABLED;
        }
        synchronized (this.f287372f) {
            aea = (aea) this.f287373g.mo6453a();
            if (aea.equals(aea.UNKNOWN) && this.f287374h == null) {
                C80905at.m128763g(mo93527g(), C102893ab.f287348a);
            }
        }
        return aea;
    }

    /* renamed from: g */
    public final C60870cx mo93527g() {
        return this.f287371e.mo28202b("[NGA] NgaAccountChecker.refreshDasherAccountStatus", new C102892aa(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("Account checker status");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85279c("Dasher account status").mo85276a(C90752i.m148229c(mo93526f().name()));
        e.mo85279c("Has invalid OAuth token").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f287375i.get())));
        DesugarArrays.stream((T[]) ((C86054o) this.f287368b.mo27525b()).mo79685s()).forEach(new C102901aj(this, e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C60870cx mo93528h() {
        return this.f287371e.mo28209i(this.f287371e.mo28209i(C60856cj.m92906o((List) DesugarArrays.stream((T[]) ((C86054o) this.f287368b.mo27525b()).mo79684r()).map(new C102902ak(this, ((C89994f) this.f287377k.mo27525b()).mo83887ag(), new C91032p())).collect(Collectors.toList())), "[NGA] NgaAccountChecker.checkForOAuthTokenValidity", C102903al.f287361a), "[NGA] NgaAccountCHecker.refreshOAuthTokenStatus", new C102991t(this));
    }

    /* renamed from: i */
    public final void mo93529i() {
        if (mo93530j()) {
            C80905at.m128763g(mo93528h(), C102895ad.f287350a);
        }
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        if (mo93530j()) {
            C80905at.m128763g(mo93528h(), C102992u.f287571a);
            C80905at.m128763g(mo93527g(), C102993v.f287572a);
            d createBuilder = e.h.createBuilder();
            C65813cq cqVar = C65813cq.ON_DEMAND;
            createBuilder.copyOnWrite();
            e eVar = createBuilder.instance;
            eVar.f = cqVar.f178923h;
            eVar.a |= 2;
            createBuilder.copyOnWrite();
            e eVar2 = createBuilder.instance;
            eVar2.a |= 1;
            eVar2.e = "agsa";
            createBuilder.b(C65753ak.PRIVACY_SETTINGS);
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328824d = 1;
            agVar.f328821a |= 4;
            C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
            ajVar.mo58885m(C74662f.f208847a, createBuilder.build());
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            C118476ak akVar = (C118476ak) ajVar.build();
            akVar.getClass();
            agVar2.f328827g = akVar;
            agVar2.f328821a |= 32;
            if (!this.f287378l.mo103754e(C118522by.GELLER_REFRESH_TASK, (C118472ag) afVar.build())) {
                ((C58970a) ((C58970a) f287367a.mo56226d()).mo56372aa(21352)).mo56386p("Couldn't schedule Geller refresh task.");
            }
        }
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
        if (mo93530j()) {
            C80905at.m128763g(mo93528h(), C102994w.f287573a);
            C80905at.m128763g(mo93527g(), C102995x.f287574a);
        }
    }

    /* renamed from: j */
    public final boolean mo93530j() {
        return ((C74714bo) this.f287379m.mo27525b()).mo71079a() == ahi.ELIGIBLE;
    }

    /* renamed from: k */
    public final boolean mo93531k() {
        if (!mo93530j()) {
            return false;
        }
        return DesugarArrays.stream((T[]) ((C86054o) this.f287368b.mo27525b()).mo79685s()).map(C102987p.f287566a).allMatch(new C102988q(this));
    }
}
