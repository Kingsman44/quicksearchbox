package com.google.android.apps.gsa.p8867w.p8874d;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C10001p;
import com.google.android.apps.gsa.assistant.settings.shared.ab;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.C73869h;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.h.s.m;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81164dm;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83934u;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83935v;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74545ah;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7311n.C92533a;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.libraries.search.assistant.p2803u.p2804a.p2805a.C36625a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50207on;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.w.d.g */
/* compiled from: PG */
public final class C118782g implements C36625a {

    /* renamed from: a */
    public static final C59071e f331318a = C59071e.m91332i("com.google.android.apps.gsa.w.d.g");

    /* renamed from: b */
    public final ae f331319b;

    /* renamed from: c */
    private final SharedPreferences f331320c;

    /* renamed from: d */
    private final C58833ax f331321d;

    /* renamed from: e */
    private final bg f331322e;

    /* renamed from: f */
    private final C109790aj f331323f;

    /* renamed from: g */
    private final l f331324g;

    /* renamed from: h */
    private final C60888db f331325h;

    /* renamed from: i */
    private final C92486a f331326i;

    /* renamed from: j */
    private final C10001p f331327j;

    /* renamed from: k */
    private final C81006b f331328k;

    /* renamed from: l */
    private final C42876ab f331329l;

    /* renamed from: m */
    private final ab f331330m;

    /* renamed from: n */
    private final C73869h f331331n;

    /* renamed from: o */
    private final C113787bc f331332o;

    /* renamed from: p */
    private final C81164dm f331333p;

    /* renamed from: q */
    private final C92533a f331334q;

    public C118782g(SharedPreferences sharedPreferences, C58833ax axVar, bg bgVar, C109790aj ajVar, l lVar, C60888db dbVar, C92486a aVar, C113787bc bcVar, C10001p pVar, C81006b bVar, C42876ab abVar, ae aeVar, ab abVar2, C73869h hVar, C81164dm dmVar, C92533a aVar2) {
        this.f331320c = sharedPreferences;
        this.f331321d = axVar;
        this.f331322e = bgVar;
        this.f331323f = ajVar;
        this.f331324g = lVar;
        this.f331325h = dbVar;
        this.f331326i = aVar;
        this.f331332o = bcVar;
        this.f331327j = pVar;
        this.f331328k = bVar;
        this.f331329l = abVar;
        this.f331319b = aeVar;
        this.f331330m = abVar2;
        this.f331331n = hVar;
        this.f331333p = dmVar;
        this.f331334q = aVar2;
    }

    /* renamed from: A */
    public final void mo40260A(int i) {
        this.f331334q.mo87307a(i);
        C60870cx cxVar = C60866ct.f164955a;
    }

    /* renamed from: B */
    public final void mo40261B(boolean z) {
        this.f331327j.mo18179e(z);
        C60870cx cxVar = C60866ct.f164955a;
    }

    /* renamed from: a */
    public final C60870cx mo40262a() {
        if (this.f331321d.mo56113h()) {
            return ((C9799ae) this.f331321d.mo56107c()).mo18041a();
        }
        return C60856cj.m92900i(C9855w.DISABLED);
    }

    /* renamed from: b */
    public final C60870cx mo40263b(Bundle bundle, boolean z) {
        C9439b bVar = C9439b.OPA_HOTWORD_ENROLLMENT;
        boolean z2 = false;
        if (bundle != null && bundle.containsKey("intent_extra_use_unicorn_flow") && bundle.getBoolean("intent_extra_use_unicorn_flow") && bundle.containsKey("intent_extra_given_name") && !TextUtils.isEmpty(bundle.getString("intent_extra_given_name")) && bundle.containsKey("intent_extra_standard_gender")) {
            z2 = true;
        }
        C74554t i = C74555u.m120572i();
        i.mo70869c(bVar);
        i.mo70868b(s.a);
        aa c = C74542ab.m120516c();
        c.c(ac.c);
        i.mo70871e(c.a());
        m d = C74545ah.m120530d();
        d.c(z);
        d.b(5);
        if (z2) {
            C83934u uVar = (C83934u) C83935v.f228590f.createBuilder();
            boolean z3 = bundle.getBoolean("intent_extra_use_unicorn_flow");
            uVar.copyOnWrite();
            C83935v vVar = (C83935v) uVar.instance;
            vVar.f228592a = 1 | vVar.f228592a;
            vVar.f228593b = z3;
            String string = bundle.getString("intent_extra_given_name");
            uVar.copyOnWrite();
            C83935v vVar2 = (C83935v) uVar.instance;
            string.getClass();
            vVar2.f228592a |= 2;
            vVar2.f228594c = string;
            int a = C50207on.m85790a(bundle.getInt("intent_extra_standard_gender"));
            uVar.copyOnWrite();
            C83935v vVar3 = (C83935v) uVar.instance;
            int i2 = a - 1;
            if (a != 0) {
                vVar3.f228595d = i2;
                vVar3.f228592a |= 4;
                d.a = (C83935v) uVar.build();
            } else {
                throw null;
            }
        }
        C74543ad d2 = C74544ae.m120523d();
        d2.mo70851c(af.d);
        d2.mo70852d(d.a());
        i.mo70872f(d2.mo70849a());
        return C60856cj.m92900i(i.mo70882h());
    }

    /* renamed from: c */
    public final C60870cx mo40264c() {
        return this.f331333p.mo74930a();
    }

    /* renamed from: d */
    public final C60870cx mo40265d() {
        return this.f331329l.mo46042d();
    }

    /* renamed from: e */
    public final C60870cx mo40266e() {
        boolean z = false;
        int i = this.f331320c.getInt("opa_hotword_training_seen_count", 0);
        if (this.f331326i.mo87242p() && !this.f331326i.mo87249w() && i <= 0) {
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final C60870cx mo40267f() {
        boolean z = false;
        int i = this.f331320c.getInt("opa_hotword_training_seen_count", 0);
        int c = this.f331334q.mo87309c();
        if (this.f331326i.mo87242p() && c == 2 && !this.f331326i.mo87249w() && i <= 0) {
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* renamed from: g */
    public final C60870cx mo40268g() {
        return C60856cj.m92900i(Boolean.valueOf(this.f331328k.mo74781g()));
    }

    /* renamed from: h */
    public final C60870cx mo40269h() {
        return C60856cj.m92900i(Integer.valueOf(this.f331320c.getInt("opa_email_optin_seen_count", 0)));
    }

    /* renamed from: i */
    public final C60870cx mo40270i() {
        return C60856cj.m92900i(Integer.valueOf(this.f331320c.getInt("opa_email_opt_in_status", 0)));
    }

    /* renamed from: j */
    public final C60870cx mo40271j(Account account) {
        return C60856cj.m92900i(Boolean.valueOf(this.f331323f.mo77271a(account, 3)));
    }

    /* renamed from: k */
    public final C60870cx mo40272k(Account account) {
        return C60856cj.m92900i(Boolean.valueOf(this.f331323f.mo77273c(account, 3)));
    }

    /* renamed from: l */
    public final C60870cx mo40273l(Account account) {
        return C60856cj.m92900i(Boolean.valueOf(this.f331322e.c(account.name)));
    }

    /* renamed from: m */
    public final C60870cx mo40274m(e eVar) {
        this.f331331n.mo65345b(eVar);
        return C60866ct.f164955a;
    }

    /* renamed from: n */
    public final C60870cx mo40275n(Account account) {
        this.f331323f.mo98127i(account, 3);
        return C60866ct.f164955a;
    }

    /* renamed from: o */
    public final C60870cx mo40276o(Account account) {
        this.f331323f.mo98130l(account, 3);
        return C60866ct.f164955a;
    }

    /* renamed from: p */
    public final C60870cx mo40277p(Account account) {
        this.f331322e.b(account);
        return C60866ct.f164955a;
    }

    /* renamed from: q */
    public final C60870cx mo40278q(Account account, acv acv) {
        C118781f fVar = new C118781f();
        C118781f fVar2 = new C118781f();
        SettableFuture settableFuture = fVar.f331317a;
        SettableFuture settableFuture2 = fVar2.f331317a;
        this.f331325h.mo29164d(new C118776a(settableFuture, settableFuture2, this.f331324g.i(account, acv, C50144me.f130361d, fVar, fVar2, (String) null, getClass().getSimpleName())), 15000, TimeUnit.MILLISECONDS);
        return C47638k.m84751b(settableFuture, settableFuture2).mo51521b(new C118779d(settableFuture, settableFuture2), this.f331325h);
    }

    /* renamed from: r */
    public final C60870cx mo40279r(Account account, acx acx) {
        return this.f331324g.d(account, acx, 15000, TimeUnit.MILLISECONDS, getClass().getSimpleName());
    }

    /* renamed from: s */
    public final C60870cx mo40280s(Account account, acx acx) {
        C118781f fVar = new C118781f();
        SettableFuture settableFuture = fVar.f331317a;
        this.f331324g.l(account, C49875cf.NEXUS, acx, fVar, getClass().getSimpleName());
        return C47638k.m84751b(settableFuture).mo51520a(new C118780e(settableFuture), this.f331325h);
    }

    /* renamed from: t */
    public final C60870cx mo40281t(C9855w wVar) {
        if (this.f331321d.mo56113h()) {
            return ((C9799ae) this.f331321d.mo56107c()).mo18047g(wVar);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: u */
    public final C60870cx mo40282u(int i) {
        this.f331320c.edit().putInt("opa_email_opt_in_status", i).apply();
        return C60866ct.f164955a;
    }

    /* renamed from: v */
    public final C60870cx mo40283v(boolean z) {
        if (this.f331321d.mo56113h()) {
            return ((C9799ae) this.f331321d.mo56107c()).mo18048h(z);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: w */
    public final C60870cx mo40284w(Account account) {
        com.google.android.apps.gsa.assistant.settings.shared.aa a = this.f331330m.a(this.f331319b.c(), false);
        l lVar = this.f331324g;
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 268435456;
        acv.f128968x = true;
        return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(lVar.j(account, (acv) acu.build(), (C50144me) null, 15000, TimeUnit.MILLISECONDS, getClass().getSimpleName())), new C118777b(this, account, a), this.f331325h), Throwable.class, C118778c.f331313a, this.f331325h);
    }

    /* renamed from: x */
    public final C60870cx mo40285x(C58817ah ahVar, Executor executor) {
        return this.f331329l.mo46039a(ahVar, executor);
    }

    /* renamed from: y */
    public final C60870cx mo40286y() {
        this.f331333p.mo74931b("2019-01-22");
        return C60866ct.f164955a;
    }

    /* renamed from: z */
    public final void mo40287z() {
        this.f331332o.mo100625e();
        C60870cx cxVar = C60866ct.f164955a;
    }
}
