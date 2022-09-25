package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130807i;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131072b;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131073c;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131074d;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131075e;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131077g;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131097g;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.assistant.p3886c.p3887a.C50678n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5124m.p5125a.C65603f;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.z */
/* compiled from: PG */
public final class C131071z implements C131072b {

    /* renamed from: a */
    public final C60888db f358512a;

    /* renamed from: b */
    public final C60887da f358513b;

    /* renamed from: c */
    public final C130807i f358514c;

    /* renamed from: d */
    public final C131075e f358515d;

    /* renamed from: e */
    public final C38469m f358516e;

    /* renamed from: f */
    public final C65603f f358517f;

    /* renamed from: g */
    public final C58974d f358518g;

    /* renamed from: h */
    public final C65603f f358519h;

    /* renamed from: i */
    public final C131077g f358520i;

    /* renamed from: j */
    public final C60950i f358521j;

    /* renamed from: k */
    public final C130895ag f358522k;

    /* renamed from: l */
    public final C130987aa f358523l;

    /* renamed from: m */
    public final C131097g f358524m;

    /* renamed from: n */
    private final Boolean f358525n;

    /* renamed from: o */
    private final Long f358526o;

    public C131071z(C60888db dbVar, C60887da daVar, C130807i iVar, C131075e eVar, C130603a aVar, C38469m mVar, C65603f fVar, C65603f fVar2, C131077g gVar, C60950i iVar2, C130895ag agVar, C130987aa aaVar, Boolean bool, Long l, C131097g gVar2) {
        this.f358512a = dbVar;
        this.f358513b = daVar;
        this.f358514c = iVar;
        this.f358515d = eVar;
        this.f358516e = mVar;
        this.f358517f = fVar;
        this.f358518g = aVar.mo109740b(this);
        this.f358519h = fVar2;
        this.f358520i = gVar;
        this.f358521j = iVar2;
        this.f358522k = agVar;
        this.f358523l = aaVar;
        this.f358525n = bool;
        this.f358526o = l;
        this.f358524m = gVar2;
    }

    /* renamed from: a */
    public static double m213567a(C58485gu guVar, int i) {
        if (guVar.size() < i + 1) {
            return C59203do.f157270a;
        }
        return ((C130701b) guVar.get(i)).mo109791a();
    }

    /* renamed from: b */
    public final C131074d mo110031b() {
        return new C131073c(true, this.f358525n, this.f358526o);
    }

    /* renamed from: c */
    public final C60870cx mo110032c() {
        return this.f358516e.mo41431b(C65753ak.SMARTSPACE_HEADPHONE_APP_USAGE_MODEL, (String) null, C63662ac.f172144a, C50678n.f131835l);
    }
}
