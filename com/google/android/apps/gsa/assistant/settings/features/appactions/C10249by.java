package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10341ba;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10271p;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10311c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae;
import com.google.android.apps.gsa.assistant.settings.shared.e.k;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.by */
/* compiled from: PG */
public final class C10249by {

    /* renamed from: a */
    public static final C59071e f34743a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.appactions.by");

    /* renamed from: b */
    public final C10271p f34744b;

    /* renamed from: c */
    public final C10238bn f34745c;

    /* renamed from: d */
    public final C90021c f34746d;

    /* renamed from: e */
    public final C10325al f34747e;

    /* renamed from: f */
    public final C10311c f34748f;

    /* renamed from: g */
    public final C73812a f34749g;

    /* renamed from: h */
    public final C22871g f34750h;

    /* renamed from: i */
    public final l f34751i;

    /* renamed from: j */
    public final C28310af f34752j;

    /* renamed from: k */
    public final C46439e f34753k;

    /* renamed from: l */
    public final C10372de f34754l;

    /* renamed from: m */
    public Optional f34755m = Optional.empty();

    /* renamed from: n */
    public Optional f34756n = Optional.empty();

    /* renamed from: o */
    public Optional f34757o = Optional.empty();

    /* renamed from: p */
    public k f34758p;

    /* renamed from: q */
    public View f34759q;

    /* renamed from: r */
    public C58495hd f34760r = C58729pv.f156485a;

    /* renamed from: s */
    private final C22871g f34761s;

    public C10249by(C10238bn bnVar, C10271p pVar, C90021c cVar, C10325al alVar, C10311c cVar2, C73812a aVar, C22871g gVar, C22871g gVar2, C28310af afVar, l lVar, C10373df dfVar, C46439e eVar) {
        this.f34745c = bnVar;
        this.f34744b = pVar;
        this.f34746d = cVar;
        this.f34747e = alVar;
        this.f34748f = cVar2;
        this.f34749g = aVar;
        this.f34761s = gVar;
        this.f34750h = gVar2;
        this.f34751i = lVar;
        this.f34752j = afVar;
        this.f34753k = eVar;
        this.f34754l = dfVar.mo18453a(new C10248bx(this), bnVar, new C10239bo(this), new C10240bp(this), new C10241bq(this), C10242br.f34736a);
    }

    /* renamed from: c */
    private final void m25156c(C58485gu guVar, C58495hd hdVar) {
        for (Fragment fragment : this.f34745c.getChildFragmentManager().f634a.mo677i()) {
            if (fragment instanceof C10304cw) {
                ((C10304cw) fragment).mo17754z().mo18409a(guVar, C58485gu.m89845m(), hdVar, Optional.empty());
            }
        }
    }

    /* renamed from: a */
    public final void mo18370a() {
        new C90873ag(this.f34747e.mo18423e(), this.f34761s, "Reload shortcuts of expanded page", new C10244bt(this)).mo85223a(C10245bu.f34739a);
    }

    /* renamed from: b */
    public final void mo18371b(C10341ba baVar) {
        C58485gu j = C58485gu.m89842j(C10383ae.m25354j(baVar.mo18438a()));
        if (this.f34746d.mo79746e(C90019by.f248074h)) {
            m25156c(j, this.f34760r);
        } else {
            m25156c(j, C58729pv.f156485a);
        }
    }
}
