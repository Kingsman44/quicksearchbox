package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bp;
import com.google.android.apps.gsa.assistant.settings.features.av.bz;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.t;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73894n;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92399e;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92390n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92372e;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92374g;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101862c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101888e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p3562ao.p3570b.p3571a.p3572a.p3573a.C45593d;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.ae */
/* compiled from: PG */
public final class C101510ae implements C101528j {

    /* renamed from: a */
    public static final C59071e f283274a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.ae");

    /* renamed from: b */
    public final C92371d f283275b;

    /* renamed from: c */
    public final l f283276c;

    /* renamed from: d */
    public final C101525g f283277d;

    /* renamed from: e */
    public final C101515aj f283278e;

    /* renamed from: f */
    public final C22871g f283279f;

    /* renamed from: g */
    public final String f283280g;

    /* renamed from: h */
    public final C86054o f283281h;

    /* renamed from: i */
    public final C89994f f283282i;

    /* renamed from: j */
    public final C22871g f283283j;

    /* renamed from: k */
    public final C22871g f283284k;

    /* renamed from: l */
    public final C89859i f283285l;

    /* renamed from: m */
    public final Context f283286m;

    /* renamed from: n */
    private final C74555u f283287n;

    /* renamed from: o */
    private final C101860a f283288o;

    /* renamed from: p */
    private final C101610b f283289p;

    /* renamed from: q */
    private final C90021c f283290q;

    /* renamed from: r */
    private final C101519an f283291r;

    /* renamed from: s */
    private final C90743b f283292s;

    /* renamed from: t */
    private final C68214a f283293t;

    /* renamed from: u */
    private final C101888e f283294u;

    /* renamed from: v */
    private final C101862c f283295v;

    /* renamed from: w */
    private final C101495ac f283296w;

    /* renamed from: x */
    private final C92374g f283297x;

    public C101510ae(String str, C74555u uVar, C92371d dVar, C101860a aVar, C101610b bVar, C101525g gVar, C101515aj ajVar, C101519an anVar, C22871g gVar2, C89994f fVar, C90021c cVar, l lVar, C86054o oVar, C90743b bVar2, C22871g gVar3, C22871g gVar4, C68214a aVar2, C89859i iVar, Context context, C101888e eVar, C101495ac acVar, C101862c cVar2, C92374g gVar5) {
        this.f283287n = uVar;
        this.f283275b = dVar;
        this.f283288o = aVar;
        this.f283289p = bVar;
        this.f283277d = gVar;
        this.f283278e = ajVar;
        this.f283291r = anVar;
        this.f283279f = gVar2;
        this.f283282i = fVar;
        this.f283290q = cVar;
        this.f283276c = lVar;
        this.f283281h = oVar;
        this.f283280g = str;
        this.f283292s = bVar2;
        this.f283283j = gVar3;
        this.f283284k = gVar4;
        this.f283285l = iVar;
        this.f283286m = context;
        this.f283293t = aVar2;
        this.f283294u = eVar;
        this.f283296w = acVar;
        this.f283295v = cVar2;
        this.f283297x = gVar5;
    }

    /* renamed from: j */
    private final C60870cx m167871j(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C92372e a = this.f283297x.mo87037a(str);
        this.f283282i.mo83901au(0, this.f283280g);
        return this.f283283j.mo28201a("send utterances to S3", new C101537s(this, a));
    }

    /* renamed from: a */
    public final C60870cx mo92367a() {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f283289p.mo92420a()) {
            str = this.f283288o.mo92638c();
        } else {
            str = this.f283275b.mo87021b();
        }
        if (C92408n.m151744f(this.f283290q, this.f283292s.mo85090c())) {
            return this.f283279f.mo28202b("check retrain utterances ready on server", new C101542x(this));
        }
        return this.f283279f.mo28205e(this.f283283j.mo28210j(m167871j(str), "check retrain utterances ready on server", new C101543y(this)), "catching send utterances to S3", Throwable.class, C101544z.f283369a);
    }

    /* renamed from: b */
    public final void mo92368b() {
        mo92373g();
    }

    /* renamed from: c */
    public final void mo92369c() {
        String str;
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f283289p.mo92420a()) {
            str = this.f283288o.mo92638c();
        } else {
            str = this.f283275b.mo87021b();
        }
        if (C92408n.m151744f(this.f283290q, this.f283292s.mo85090c())) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = m167871j(str);
        }
        C90875ai.m148465b(new C101533o(this), cxVar, this.f283283j, "send utterances to S3 callback").mo85223a(new C101534p(this));
    }

    /* renamed from: d */
    public final C60870cx mo92370d() {
        String str;
        this.f283285l.mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_UTTERANCE_READY_CHECK);
        if (this.f283289p.mo92420a()) {
            str = this.f283288o.mo92638c();
        } else {
            str = this.f283275b.mo87021b();
        }
        C101519an anVar = this.f283291r;
        Account w = this.f283281h.mo79689w(this.f283280g);
        C90584f q = this.f283282i.mo83828q();
        SettableFuture settableFuture = new SettableFuture();
        C92399e eVar = C92399e.NEW_UTTERANCES;
        long a = ((C90021c) anVar.f283328b.mo27525b()).mo79743a(C90014bt.f247480hu);
        ((C59052c) ((C59052c) C101519an.f283327a.mo56224b()).mo56372aa(20333)).mo56387q("Check enrollment utterances for %d", eVar.ordinal());
        anVar.mo92378a(q, eVar, settableFuture, str, C92408n.m151744f((C90021c) anVar.f283328b.mo27525b(), anVar.f283330d.mo85090c()), w, (C66595bu) anVar.f283329c.mo87020a().mo56111f(), new C101518am(anVar, (int) a, q, eVar, settableFuture, str, w));
        return anVar.f283331e.mo28209i(settableFuture, "check utterances ready result", C101516ak.f283316a);
    }

    /* renamed from: e */
    public final C60870cx mo92371e() {
        C22871g gVar = this.f283279f;
        return gVar.mo28205e(gVar.mo28210j(mo92370d(), "send GCM retraining update", new C101535q(this)), "catching check retrain utterances ready", Throwable.class, C101536r.f283360a);
    }

    /* renamed from: f */
    public final C60870cx mo92372f(boolean z) {
        C89849ae aeVar;
        C89859i iVar = this.f283285l;
        if (z) {
            aeVar = C89849ae.VOICE_MATCH_MULTI_DEVICE_ENABLE_SPEAKER_ID_BIT;
        } else {
            aeVar = C89849ae.VOICE_MATCH_MULTI_DEVICE_DISABLE_SPEAKER_ID_BIT;
        }
        iVar.mo83702b(aeVar);
        t b = C73894n.m108499b();
        t tVar = b;
        tVar.c = C58833ax.m90833j(this.f283281h.mo79689w(this.f283280g));
        C58833ax a = this.f283275b.mo87020a();
        if (a != null) {
            tVar.d = a;
            int a2 = C92390n.m151715a(((C92391o) this.f283275b.f257558c.mo56109e(C92391o.f257641i)).f257649g);
            if (a2 == 0) {
                a2 = 1;
            }
            C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
            for (com.google.android.apps.gsa.assistant.shared.l lVar : this.f283275b.f257559d) {
                C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
                cnVar.copyOnWrite();
                C49891cv cvVar = (C49891cv) cnVar.instance;
                cvVar.f129663a |= 1024;
                cvVar.f129670h = z;
                String d = lVar.d();
                cnVar.copyOnWrite();
                C49891cv cvVar2 = (C49891cv) cnVar.instance;
                d.getClass();
                cvVar2.f129663a |= 1;
                cvVar2.f129665c = d;
                if (z && (a2 == 2 || a2 == 3)) {
                    cnVar.copyOnWrite();
                    C49891cv cvVar3 = (C49891cv) cnVar.instance;
                    cvVar3.f129671i = 4;
                    cvVar3.f129663a |= 2048;
                }
                C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
                C49875cf a3 = lVar.a();
                dfVar.copyOnWrite();
                C49903dg dgVar = (C49903dg) dfVar.instance;
                dgVar.f129716c = a3.f129621v;
                dgVar.f129714a = 2 | dgVar.f129714a;
                String b2 = lVar.b();
                dfVar.copyOnWrite();
                C49903dg dgVar2 = (C49903dg) dfVar.instance;
                b2.getClass();
                dgVar2.f129714a |= 1;
                dgVar2.f129715b = b2;
                dfVar.copyOnWrite();
                C49903dg dgVar3 = (C49903dg) dfVar.instance;
                C49891cv cvVar4 = (C49891cv) cnVar.build();
                cvVar4.getClass();
                dgVar3.f129719f = cvVar4;
                dgVar3.f129714a |= 32;
                daVar.mo53371b(dfVar);
            }
            acw acw = (acw) acx.f128971H.createBuilder();
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            C49898db dbVar = (C49898db) daVar.build();
            dbVar.getClass();
            acx.f128991h = dbVar;
            acx.f128984a |= 32;
            b.c((acx) acw.build());
            tVar.j = C58833ax.m90834k(getClass().getSimpleName());
            if (z) {
                tVar.g = C58833ax.m90834k(this.f283294u.mo92668b());
                if (this.f283296w.mo92325d()) {
                    b.b(this.f283296w.mo92324c());
                }
            }
            return this.f283276c.c(b, 25, TimeUnit.SECONDS);
        }
        throw new NullPointerException("Null impersonatedUser");
    }

    /* renamed from: g */
    public final void mo92373g() {
        C60870cx cxVar;
        if (!this.f283287n.mo70893l() || this.f283287n.mo70888f().mo70865b().isEmpty() || this.f283295v.mo92641c() != C101861b.NEEDS_STRUCTURE_ENROLLMENT) {
            cxVar = mo92372f(true);
        } else {
            this.f283285l.mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENABLE_SPEAKER_ID_BIT);
            aq createBuilder = ar.f.createBuilder();
            C45595b i = dn.i(this.f283287n.mo70883a());
            createBuilder.copyOnWrite();
            ar arVar = createBuilder.instance;
            arVar.b = i.f119929nK;
            arVar.a |= 1;
            C45593d b = this.f283294u.mo92668b();
            createBuilder.copyOnWrite();
            ar arVar2 = createBuilder.instance;
            arVar2.c = b.f119162e;
            arVar2.a |= 2;
            if (this.f283296w.mo92325d()) {
                C58833ax c = this.f283296w.mo92324c();
                if (c.mo56113h()) {
                    String str = (String) c.mo56107c();
                    createBuilder.copyOnWrite();
                    ar arVar3 = createBuilder.instance;
                    str.getClass();
                    arVar3.a |= 8;
                    arVar3.e = str;
                }
            }
            dn dnVar = (dn) this.f283293t.mo27525b();
            String b2 = this.f283287n.mo70888f().mo70865b();
            dnVar.l(b2);
            C58485gu n = C58485gu.m89846n(b2);
            List list = (List) Collection.EL.stream(dnVar.c.f129690a).filter(new bp(b2)).map(bz.a).collect(Collectors.toList());
            acx e = dn.e(new acx[]{dnVar.d(list, true), dnVar.B(n, 4, false)});
            dnVar.H(n, 4, false);
            dnVar.o(list, true);
            cxVar = dnVar.h(e, createBuilder.build());
        }
        new C90873ag(cxVar, this.f283283j, "run cloud enrollment", new C101506aa(this)).mo85223a(new C101507ab(this));
    }

    /* renamed from: h */
    public final void mo92374h() {
        this.f283275b.mo87025f(C92362c.UPDATE_SETTINGS);
    }

    /* renamed from: i */
    public final void mo92375i() {
        this.f283275b.mo87025f(C92362c.ENROLLMENT_UTTERANCES_READY);
    }
}
