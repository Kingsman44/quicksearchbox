package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b;

import android.app.Activity;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.t;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73894n;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83828ai;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83831al;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83832am;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83833an;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83837ar;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83840au;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83843c;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101636a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49951fa;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.C49962fl;
import com.google.assistant.p3861at.C49963fm;
import com.google.assistant.p3861at.C49984gg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.acz;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4018a.p4019a.p4020a.C53778bi;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.b.d */
/* compiled from: PG */
public final class C101887d implements C101884a {

    /* renamed from: a */
    public static final C59071e f284184a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.b.d");

    /* renamed from: b */
    public final C89994f f284185b;

    /* renamed from: c */
    private final l f284186c;

    /* renamed from: d */
    private final C86054o f284187d;

    /* renamed from: e */
    private final C22871g f284188e;

    /* renamed from: f */
    private final C58833ax f284189f;

    /* renamed from: g */
    private final C101888e f284190g;

    /* renamed from: h */
    private final C74555u f284191h;

    /* renamed from: i */
    private final C101860a f284192i;

    /* renamed from: j */
    private final C68214a f284193j;

    /* renamed from: k */
    private final C68214a f284194k;

    /* renamed from: l */
    private final C101495ac f284195l;

    public C101887d(l lVar, C86054o oVar, C22871g gVar, C89994f fVar, C58833ax axVar, C101495ac acVar, C101888e eVar, C74555u uVar, C101860a aVar, C68214a aVar2, C68214a aVar3) {
        this.f284186c = lVar;
        this.f284187d = oVar;
        this.f284188e = gVar;
        this.f284185b = fVar;
        this.f284189f = axVar;
        this.f284195l = acVar;
        this.f284190g = eVar;
        this.f284191h = uVar;
        this.f284192i = aVar;
        this.f284193j = aVar2;
        this.f284194k = aVar3;
    }

    /* renamed from: c */
    private final boolean m168565c() {
        return this.f284191h.mo70892k() && !this.f284191h.mo70887e().mo70856e() && !((bm) this.f284193j.mo27525b()).s();
    }

    /* renamed from: a */
    public final C60870cx mo92665a(String str, C66595bu buVar) {
        acx acx;
        if (this.f284192i.f284140g.get()) {
            ((C59052c) ((C59052c) f284184a.mo56224b()).mo56372aa(20717)).mo56386p("Consent screen skipped. Skip recording consent.");
            return C60856cj.m92900i(acz.f129010n);
        } else if (m168565c()) {
            ((C59052c) ((C59052c) f284184a.mo56224b()).mo56372aa(20716)).mo56386p("Non-OPA phone enrollment. Skip recording consent.");
            return C60856cj.m92900i(acz.f129010n);
        } else {
            int i = 1;
            if (!this.f284191h.mo70893l() || this.f284191h.mo70888f().mo70866c() != 2 || ((C101636a) this.f284194k.mo27525b()).mo92453a(1) == 2) {
                ((C59052c) ((C59052c) f284184a.mo56224b()).mo56372aa(20714)).mo56355H("#recordConsent account: %s, impersonation: %s", str, buVar != null);
                t b = C73894n.m108499b();
                t tVar = b;
                tVar.c = C58833ax.m90833j(this.f284187d.mo79689w(str));
                C101888e eVar = this.f284190g;
                if (eVar.mo92669c()) {
                    acw acw = (acw) acx.f128971H.createBuilder();
                    C49962fl flVar = (C49962fl) C49963fm.f129890e.createBuilder();
                    int a = C49984gg.m85775a(eVar.mo92667a().f129934f);
                    if (a != 0) {
                        i = a;
                    }
                    flVar.copyOnWrite();
                    C49963fm fmVar = (C49963fm) flVar.instance;
                    fmVar.f129895d = i - 1;
                    fmVar.f129892a |= 8;
                    acw.copyOnWrite();
                    acx acx2 = (acx) acw.instance;
                    C49963fm fmVar2 = (C49963fm) flVar.build();
                    fmVar2.getClass();
                    acx2.f128978F = fmVar2;
                    acx2.f128985b |= 524288;
                    acx = (acx) acw.build();
                } else {
                    acw acw2 = (acw) acx.f128971H.createBuilder();
                    C49951fa faVar = (C49951fa) C49952fb.f129857j.createBuilder();
                    faVar.copyOnWrite();
                    C49952fb fbVar = (C49952fb) faVar.instance;
                    fbVar.f129859a |= 32;
                    fbVar.f129864f = true;
                    acw2.copyOnWrite();
                    acx acx3 = (acx) acw2.instance;
                    C49952fb fbVar2 = (C49952fb) faVar.build();
                    fbVar2.getClass();
                    acx3.f128999p = fbVar2;
                    acx3.f128984a |= 65536;
                    acx = (acx) acw2.build();
                }
                b.c(acx);
                tVar.d = C58833ax.m90833j(buVar);
                tVar.j = C58833ax.m90834k(getClass().getSimpleName());
                C60870cx c = this.f284186c.c(b, 25, TimeUnit.SECONDS);
                C22871g gVar = this.f284188e;
                return gVar.mo28205e(gVar.mo28209i(c, "Record consent success", new C101885b(this, buVar)), "catching record consent success", Throwable.class, C101886c.f284183a);
            }
            ((C59052c) ((C59052c) f284184a.mo56224b()).mo56372aa(20715)).mo56386p("SLA device OOBE enrollment w/ SLA consented, but future bit off. Skip recording consent.");
            return C60856cj.m92900i(acz.f129010n);
        }
    }

    /* renamed from: b */
    public final void mo92666b(Activity activity, String str) {
        C83833an anVar = (C83833an) C83840au.f228470g.createBuilder();
        C83837ar arVar = C83837ar.f228465a;
        anVar.copyOnWrite();
        C83840au auVar = (C83840au) anVar.instance;
        arVar.getClass();
        auVar.f228474c = arVar;
        int i = 3;
        auVar.f228473b = 3;
        anVar.copyOnWrite();
        C83840au auVar2 = (C83840au) anVar.instance;
        auVar2.f228475d = 3;
        auVar2.f228472a |= 4;
        anVar.copyOnWrite();
        C83840au auVar3 = (C83840au) anVar.instance;
        auVar3.f228472a |= 8;
        auVar3.f228476e = true;
        if (!m168565c()) {
            C101888e eVar = this.f284190g;
            if (eVar.mo92669c() && (i = C53778bi.m86899a(eVar.mo92667a().f129933e)) == 0) {
                i = 1;
            }
            anVar.copyOnWrite();
            C83840au auVar4 = (C83840au) anVar.instance;
            auVar4.f228477f = i - 1;
            auVar4.f228472a |= 16;
        }
        C83843c cVar = (C83843c) C83841av.f228478e.createBuilder();
        cVar.copyOnWrite();
        C83841av avVar = (C83841av) cVar.instance;
        C83840au auVar5 = (C83840au) anVar.build();
        auVar5.getClass();
        avVar.f228483d = auVar5;
        avVar.f228482c = 4;
        if (this.f284195l.mo92326e() || this.f284195l.mo92325d()) {
            C83828ai aiVar = (C83828ai) C83832am.f228459d.createBuilder();
            C83831al alVar = (C83831al) this.f284195l.mo92323b(str).mo56107c();
            aiVar.copyOnWrite();
            C83832am amVar = (C83832am) aiVar.instance;
            alVar.getClass();
            amVar.f228462b = alVar;
            amVar.f228461a |= 1;
            C83831al alVar2 = (C83831al) this.f284195l.mo92322a(str).mo56107c();
            aiVar.copyOnWrite();
            C83832am amVar2 = (C83832am) aiVar.instance;
            alVar2.getClass();
            amVar2.f228463c = alVar2;
            amVar2.f228461a |= 2;
            cVar.copyOnWrite();
            C83841av avVar2 = (C83841av) cVar.instance;
            C83832am amVar3 = (C83832am) aiVar.build();
            amVar3.getClass();
            avVar2.f228481b = amVar3;
            avVar2.f228480a = 2;
            ((C59052c) ((C59052c) f284184a.mo56224b()).mo56372aa(20718)).mo56386p("Recording parent/child Voice Match consent.");
        } else if (str != null) {
            C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
            aeVar.copyOnWrite();
            C83825af afVar = (C83825af) aeVar.instance;
            afVar.f228449a |= 1;
            afVar.f228450b = str;
            C83825af afVar2 = (C83825af) aeVar.build();
            cVar.copyOnWrite();
            C83841av avVar3 = (C83841av) cVar.instance;
            afVar2.getClass();
            avVar3.f228481b = afVar2;
            avVar3.f228480a = 1;
            ((C59052c) ((C59052c) f284184a.mo56224b()).mo56372aa(20720)).mo56386p("Recording Voice Match consent.");
        } else {
            ((C59052c) ((C59052c) f284184a.mo56225c()).mo56372aa(20719)).mo56386p("Attempting to log local Voice Match audit record without correct user parameters");
            return;
        }
        if (this.f284189f.mo56113h()) {
            ((C83819a) this.f284189f.mo56107c()).mo77204a(activity, (C83841av) cVar.build());
        }
    }
}
