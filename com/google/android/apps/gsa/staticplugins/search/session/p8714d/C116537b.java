package com.google.android.apps.gsa.staticplugins.search.session.p8714d;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.service.C86669cg;
import com.google.android.apps.gsa.search.core.state.C86978dd;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116572aj;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116622cf;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.d.b */
/* compiled from: PG */
public final class C116537b {

    /* renamed from: a */
    public static final C59071e f323156a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.d.b");

    /* renamed from: b */
    public final C68214a f323157b;

    /* renamed from: c */
    public final C68214a f323158c;

    /* renamed from: d */
    public final C116766ho f323159d;

    /* renamed from: e */
    public final C86978dd f323160e;

    /* renamed from: f */
    public final C86669cg f323161f;

    /* renamed from: g */
    public final C116569ag f323162g;

    /* renamed from: h */
    public final C116572aj f323163h;

    /* renamed from: i */
    public long f323164i;

    /* renamed from: j */
    public boolean f323165j;

    /* renamed from: k */
    private final C68214a f323166k;

    /* renamed from: l */
    private final C84516aa f323167l;

    /* renamed from: m */
    private final C89994f f323168m;

    /* renamed from: n */
    private final Context f323169n;

    /* renamed from: o */
    private final C86792g f323170o;

    /* renamed from: p */
    private final C116735gk f323171p;

    /* renamed from: q */
    private final C116622cf f323172q;

    public C116537b(C68214a aVar, C68214a aVar2, C68214a aVar3, C84516aa aaVar, C89994f fVar, Context context, C116766ho hoVar, C86978dd ddVar, C86669cg cgVar, C86792g gVar, C116569ag agVar, C116572aj ajVar, C116735gk gkVar, C116622cf cfVar) {
        this.f323157b = aVar;
        this.f323166k = aVar2;
        this.f323158c = aVar3;
        this.f323167l = aaVar;
        this.f323168m = fVar;
        this.f323169n = context;
        this.f323159d = hoVar;
        this.f323160e = ddVar;
        this.f323161f = cgVar;
        this.f323170o = gVar;
        this.f323162g = agVar;
        this.f323163h = ajVar;
        this.f323171p = gkVar;
        this.f323172q = cfVar;
    }

    /* renamed from: a */
    public final void mo102747a(Query query, aaj aaj) {
        ((C89911f) this.f323166k.mo27525b()).mo83755a((Throwable) null, 172241508, 29).mo83721a();
        Query aI = query.mo84275aL((aaj.f237077a & 64) != 0 ? aaj.f237084h : "and.gsa.eyesfree.general").mo84272aI(this.f323170o.mo80446e().f236951d);
        C58976aa aaVar = C58975e.f156826a;
        if (aI.mo84337bV() && ((aI.mo84450de() || aI.mo84463dq()) && this.f323167l.mo78229c() && !this.f323168m.mo83868aE())) {
            this.f323168m.mo83864aA();
            TtsRequest ttsRequest = new TtsRequest(this.f323169n.getString(R.string.e100_intro_tts), false);
            ttsRequest.f236281e = true;
            aI = aI.mo84442dW(ttsRequest, (Parcelable) null);
        }
        if (aI.mo84374cG()) {
            this.f323172q.f323441b = aI.mo84292ad();
        }
        this.f323171p.mo80462q(aI);
    }
}
