package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135766i;
import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135569b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.appactions.serviceengine.api.ExecutionAccessor;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47759cx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60422pq;
import com.google.common.p4552o.C60423pr;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.t */
/* compiled from: PG */
public final class C135845t {

    /* renamed from: a */
    public static final C59071e f369987a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.g.t");

    /* renamed from: b */
    public final Fragment f369988b;

    /* renamed from: c */
    public final C46801dp f369989c;

    /* renamed from: d */
    public final C135812aj f369990d;

    /* renamed from: e */
    public final C135766i f369991e;

    /* renamed from: f */
    public final C135824av f369992f;

    /* renamed from: g */
    public final C135823au f369993g;

    /* renamed from: h */
    public final C46792di.C46793a f369994h = new C46792di.C46793a() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135845t.f369987a.mo56226d()).mo56382g(th)).mo56372aa(40621)).mo56384n();
            if (C135845t.this.f369993g == C135823au.FULFILLMENT_LINK_GOC) {
                C135845t.this.mo112580a();
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Optional optional = (Optional) obj;
            if (C135845t.this.f369993g == C135823au.FULFILLMENT_LINK_GOC) {
                C135845t tVar = C135845t.this;
                Optional map = optional.map(C135840o.f369982a).filter(C135841p.f369983a).map(C135842q.f369984a);
                if (tVar.f369993g == C135823au.FULFILLMENT_LINK_GOC) {
                    Optional map2 = map.map(C135843r.f369985a);
                    C135824av avVar = tVar.f369992f;
                    Objects.requireNonNull(avVar);
                    map2.ifPresent(new C135844s(avVar));
                }
                tVar.mo112581b(map.map(C135832g.f369974a).filter(C135833h.f369975a), map.map(C135834i.f369976a).filter(C135835j.f369977a), false);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }

        /* renamed from: d */
        public final void mo50733d() {
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135845t.f369987a.mo56226d()).mo56382g(th)).mo56372aa(40620)).mo56384n();
        }

        /* renamed from: f */
        public final void mo50735f() {
        }
    };

    /* renamed from: i */
    public final C46792di f369995i = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135845t.f369987a.mo56226d()).mo56382g(th)).mo56372aa(40622)).mo56384n();
            if (C135845t.this.f369993g == C135823au.FULFILLMENT_LINK_WEB_PAGE || C135845t.this.f369993g == C135823au.FULFILLMENT_LINK_WEBX) {
                C135845t.this.mo112580a();
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C58485gu guVar = (C58485gu) obj;
            if (C135845t.this.f369993g == C135823au.FULFILLMENT_LINK_WEB_PAGE || C135845t.this.f369993g == C135823au.FULFILLMENT_LINK_WEBX) {
                C135845t tVar = C135845t.this;
                Optional findFirst = Collection.EL.stream(guVar).findFirst();
                Optional map = findFirst.map(C135831f.f369973a);
                if (map.isPresent()) {
                    tVar.f369992f.f369955e = Optional.m71637of((ExecutionAccessor) map.get());
                }
                tVar.mo112581b(findFirst.flatMap(C135836k.f369978a).filter(C135837l.f369979a), findFirst.flatMap(C135838m.f369980a).filter(C135839n.f369981a), map.isPresent());
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: j */
    private final AccountId f369996j;

    /* renamed from: k */
    private final C43377v f369997k;

    public C135845t(AccountId accountId, Fragment fragment, C135766i iVar, C46801dp dpVar, C135812aj ajVar, C135824av avVar, long j, C43377v vVar) {
        this.f369996j = accountId;
        this.f369988b = fragment;
        this.f369991e = iVar;
        this.f369989c = dpVar;
        this.f369990d = ajVar;
        this.f369992f = avVar;
        this.f369993g = C135823au.m220362a(j);
        this.f369997k = vVar;
    }

    /* renamed from: a */
    public final void mo112580a() {
        this.f369988b.requireView().setVisibility(8);
        C135851x xVar = (C135851x) this.f369988b.getChildFragmentManager().f634a.mo671c("googleappbrowser_instacart_chip_button");
        if (xVar != null) {
            C135808af a = xVar.mo17754z();
            if (a.f369925n.isStarted()) {
                a.f369925n.cancel();
                a.f369924m.cancel();
            }
            a.f369914c.requireView().setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo112581b(Optional optional, Optional optional2, boolean z) {
        Object obj;
        Runnable runnable;
        mo112580a();
        if (optional.isPresent() && optional2.isPresent()) {
            this.f369988b.requireView().setVisibility(0);
            AccountId accountId = this.f369996j;
            C43323b bVar = this.f369997k.mo46468a().f113336i;
            if (bVar == null) {
                bVar = C43323b.f113174a;
            }
            C60422pq pqVar = (C60422pq) C60423pr.f163516c.createBuilder();
            C62940bt r3 = C62942bv.checkIsLite(C135569b.f369276g);
            bVar.mo58887l(r3);
            Object l = bVar.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            boolean z2 = ((C135569b) obj).f369282e;
            pqVar.copyOnWrite();
            C60423pr prVar = (C60423pr) pqVar.instance;
            prVar.f163519a |= 1;
            prVar.f163520b = z2;
            C135851x a = C135808af.m220350a(accountId, (C60423pr) pqVar.build());
            C0154a aVar = new C0154a(this.f369988b.getChildFragmentManager());
            aVar.mo689v(R.id.googleapp_instacart_chip_fragment, a, "googleappbrowser_instacart_chip_button");
            aVar.mo509f();
            C135808af a2 = a.mo17754z();
            ((C59052c) ((C59052c) C135808af.f369912a.mo56224b()).mo56372aa(40624)).mo56386p("showChipWithDelay");
            if (z) {
                runnable = new C135852y(a2);
            } else {
                C135824av avVar = a2.f369918g;
                Objects.requireNonNull(avVar);
                runnable = new C135853z(avVar);
            }
            Chip chip = (Chip) a2.f369914c.requireView();
            Objects.requireNonNull(chip);
            optional.ifPresent(new C135803aa(chip));
            optional2.ifPresent(new C135804ab(a2));
            chip.setOnClickListener(new C47591co(a2.f369919h, "Click action chip", new C135805ac(a2, runnable)));
            a2.f369924m.setDuration(C135808af.f369913b.toMillis());
            a2.f369925n.setStartDelay(a2.f369922k.toMillis());
            a2.f369925n.setDuration(C135808af.f369913b.toMillis());
            a2.f369925n.addListener(new C47759cx(a2.f369919h, a2.f369926o, "Instacart delay show animation listener"));
            a2.f369925n.start();
        }
    }
}
