package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108818ab;
import com.google.android.apps.gsa.staticplugins.opa.util.C113759ab;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60948g;
import dagger.C68214a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.aw */
/* compiled from: PG */
public final class C110473aw extends C84036z {

    /* renamed from: a */
    public static final C59071e f307972a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.aw");

    /* renamed from: b */
    public static final Duration f307973b = Duration.ofSeconds(1);

    /* renamed from: c */
    public static final Instant f307974c = Instant.ofEpochMilli(1000);

    /* renamed from: d */
    public final C22871g f307975d;

    /* renamed from: e */
    public final C68214a f307976e;

    /* renamed from: f */
    public final C68214a f307977f;

    /* renamed from: g */
    public final cb f307978g;

    /* renamed from: h */
    public final bm f307979h;

    /* renamed from: i */
    public final C68214a f307980i;

    /* renamed from: j */
    public final C86106b f307981j;

    /* renamed from: k */
    public final l f307982k;

    /* renamed from: l */
    public final C110501y f307983l;

    /* renamed from: m */
    private final C90929bz f307984m;

    /* renamed from: n */
    private final C113759ab f307985n;

    public C110473aw(C90929bz bzVar, C22871g gVar, C113759ab abVar, C68214a aVar, C68214a aVar2, cb cbVar, l lVar, C86106b bVar, bm bmVar, C68214a aVar3) {
        this.f307984m = bzVar;
        this.f307975d = gVar;
        this.f307985n = abVar;
        this.f307976e = aVar;
        this.f307977f = aVar2;
        this.f307978g = cbVar;
        this.f307982k = lVar;
        this.f307981j = bVar;
        this.f307979h = bmVar;
        this.f307980i = aVar3;
        C110439a aVar4 = new C110439a();
        aVar4.mo98677c(false);
        aVar4.mo98678d(false);
        aVar4.f307888c = BuildConfig.FLAVOR;
        aVar4.mo98675a(0);
        aVar4.mo98676b(false);
        this.f307983l = aVar4;
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        ((C59052c) ((C59052c) f307972a.mo56224b()).mo56372aa(26413)).mo56386p("getSequences: Sync flags, fetch account data, then get content sequence");
        C60948g gVar = C60948g.f165068a;
        long epochMilli = Instant.now().toEpochMilli();
        return C58485gu.m89846n(new C108818ab(this.f307984m, this.f307975d.mo28209i(this.f307975d.mo28210j(this.f307985n.mo100603a(), "Sync flags then fetch minor capabilities and people setting ui", new C110469as(this)), "Controls the minimum showing time of the loading screen", new C110470at(epochMilli)), C110471au.f307970a, new C110472av(this)));
    }
}
