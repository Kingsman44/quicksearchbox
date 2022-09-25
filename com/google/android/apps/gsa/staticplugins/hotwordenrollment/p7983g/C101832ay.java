package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7144t.p7145a.C90610a;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92399e;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92400f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.p7271d.C92228e;
import com.google.android.apps.gsa.speech.p7271d.C92229f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.p7984a.C101807a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101888e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ay */
/* compiled from: PG */
public final class C101832ay extends C92229f {

    /* renamed from: c */
    public static final C59071e f284023c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ay");

    /* renamed from: d */
    public static final byte[] f284024d = new byte[0];

    /* renamed from: e */
    public final Account f284025e;

    /* renamed from: f */
    public final C101860a f284026f;

    /* renamed from: g */
    public final l f284027g;

    /* renamed from: h */
    public final C89994f f284028h;

    /* renamed from: i */
    public final C68214a f284029i;

    /* renamed from: j */
    public final String f284030j;

    /* renamed from: k */
    public final C74555u f284031k;

    /* renamed from: l */
    public final C58833ax f284032l;

    /* renamed from: m */
    public final C101888e f284033m;

    /* renamed from: n */
    private final C22871g f284034n;

    /* renamed from: o */
    private final C58833ax f284035o;

    /* renamed from: p */
    private final C68214a f284036p;

    /* renamed from: q */
    private final C101824aq f284037q;

    /* renamed from: r */
    private final C90021c f284038r;

    /* renamed from: s */
    private final C101807a f284039s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101832ay(Account account, String str, C58833ax axVar, C74555u uVar, C101860a aVar, l lVar, C90931ca caVar, C90021c cVar, C22871g gVar, C89994f fVar, C58833ax axVar2, C68214a aVar2, C68214a aVar3, C101888e eVar, C101824aq aqVar, C101807a aVar4) {
        super(C92228e.VOICE_SETTINGS, caVar, cVar);
        C90931ca caVar2 = caVar;
        this.f284025e = account;
        this.f284031k = uVar;
        this.f284026f = aVar;
        this.f284038r = cVar;
        this.f284027g = lVar;
        this.f284034n = gVar;
        this.f284028h = fVar;
        this.f284035o = axVar2;
        this.f284036p = aVar2;
        this.f284029i = aVar3;
        this.f284030j = str;
        this.f284032l = axVar;
        this.f284033m = eVar;
        this.f284037q = aqVar;
        this.f284039s = aVar4;
    }

    /* renamed from: a */
    public final void mo86900a() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        String str;
        ((C59052c) ((C59052c) f284023c.mo56224b()).mo56372aa(20688)).mo56389s("getVoiceSettings: account = %s", this.f284025e);
        if (this.f284035o.mo56113h()) {
            cxVar = C60846c.m92878g(((C90610a) this.f284035o.mo56107c()).mo84759a(), Throwable.class, C101826as.f284014a, C60826bg.f164896a);
        } else {
            cxVar = C60856cj.m92900i(f284024d);
        }
        if (this.f284031k.mo70893l()) {
            cxVar2 = ((dn) this.f284036p.mo27525b()).g();
        } else {
            cxVar2 = C60866ct.f164955a;
        }
        if (!this.f284038r.mo79746e(C90082eg.f249889aE) || !this.f284039s.mo92591a()) {
            cxVar3 = C60856cj.m92900i(false);
        } else {
            C101824aq aqVar = this.f284037q;
            Account account = this.f284025e;
            boolean M = this.f284028h.mo83850M();
            if (this.f284031k.mo70891j()) {
                C58976aa aaVar = C58975e.f156826a;
                C92400f fVar = (C92400f) aqVar.f284008d.mo27525b();
                C90584f fVar2 = C90584f.OK_HEY_GOOGLE;
                if (aqVar.f284012h.mo92420a()) {
                    str = aqVar.f284006b.mo92638c();
                } else {
                    str = ((C92371d) aqVar.f284010f.mo27525b()).mo87021b();
                }
                C60870cx b = fVar.mo87044b(fVar2, M, str, C92399e.ALL_UTTERANCES, account, (C66595bu) ((C92371d) aqVar.f284010f.mo27525b()).mo87020a().mo56111f());
                C101819al alVar = new C101819al(aqVar);
                C60870cx h = C60922j.m93045h(b, C47810es.m84966f(alVar), aqVar.f284013i);
                C101820am amVar = new C101820am(aqVar);
                cxVar3 = C60846c.m92878g(h, Exception.class, C47810es.m84963c(amVar), aqVar.f284013i);
            } else {
                C90584f fVar3 = C90584f.OK_HEY_GOOGLE;
                C58976aa aaVar2 = C58975e.f156826a;
                C60870cx a = aqVar.f284007c.mo87041a(fVar3, M, 3, (C89784a) null);
                C101818ak akVar = new C101818ak(aqVar);
                cxVar3 = C60922j.m93045h(a, C47810es.m84966f(akVar), aqVar.f284013i);
            }
        }
        new C90873ag(C47638k.m84751b(cxVar, cxVar2, cxVar3).mo51521b(new C101827at(this, cxVar, cxVar3), C60826bg.f164896a), this.f284034n, "Fetching Settings", new C101828au(this)).mo85223a(new C101829av(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86901b() {
    }
}
