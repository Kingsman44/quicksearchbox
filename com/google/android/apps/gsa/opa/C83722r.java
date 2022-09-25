package com.google.android.apps.gsa.opa;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.aa;
import com.google.android.apps.gsa.assistant.settings.shared.ab;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.opa.r */
/* compiled from: PG */
public final class C83722r implements C118549h, C86091a {

    /* renamed from: a */
    public final C68214a f228172a;

    /* renamed from: b */
    public final C68214a f228173b;

    /* renamed from: c */
    public final C68214a f228174c;

    /* renamed from: d */
    public final C68214a f228175d;

    /* renamed from: e */
    public final ae f228176e;

    /* renamed from: f */
    public final C68214a f228177f;

    /* renamed from: g */
    public final aa f228178g;

    /* renamed from: h */
    public final C58881cr f228179h;

    /* renamed from: i */
    public final C58881cr f228180i;

    /* renamed from: j */
    public final C58881cr f228181j;

    /* renamed from: k */
    public final C58881cr f228182k;

    /* renamed from: l */
    public final C58881cr f228183l;

    /* renamed from: m */
    public C83816y f228184m;

    /* renamed from: n */
    private final C68214a f228185n;

    /* renamed from: o */
    private final C22871g f228186o;

    /* renamed from: p */
    private final C22871g f228187p;

    /* renamed from: q */
    private final Random f228188q = new Random();

    /* renamed from: r */
    private final C58881cr f228189r;

    public C83722r(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, ae aeVar, C68214a aVar6, ab abVar, C22871g gVar, C22871g gVar2, C68214a aVar7) {
        this.f228172a = aVar;
        this.f228173b = aVar2;
        this.f228174c = aVar3;
        this.f228185n = aVar4;
        this.f228175d = aVar5;
        this.f228176e = aeVar;
        this.f228177f = aVar6;
        this.f228178g = abVar.a(aeVar.c(), false);
        this.f228186o = gVar;
        this.f228187p = gVar2;
        this.f228184m = (C83816y) C83817z.f228433c.createBuilder();
        this.f228179h = C58886cw.m90973a(new C83716l(aVar7));
        this.f228189r = C58886cw.m90973a(new C83717m(aVar7));
        this.f228180i = C58886cw.m90973a(new C83718n(aVar7));
        this.f228181j = C58886cw.m90973a(new C83719o(aVar7));
        this.f228182k = C58886cw.m90973a(new C83720p(aVar7));
        this.f228183l = C58886cw.m90973a(new C83721q(aVar7));
    }

    /* renamed from: h */
    private static C83813v m133295h(List list) {
        String str = !list.isEmpty() ? (String) list.get(0) : BuildConfig.FLAVOR;
        String str2 = list.size() > 1 ? (String) list.get(1) : BuildConfig.FLAVOR;
        C83812u uVar = (C83812u) C83813v.f228423e.createBuilder();
        uVar.copyOnWrite();
        ((C83813v) uVar.instance).f228425a = BuildConfig.FLAVOR;
        uVar.copyOnWrite();
        str.getClass();
        ((C83813v) uVar.instance).f228426b = str;
        uVar.copyOnWrite();
        str2.getClass();
        ((C83813v) uVar.instance).f228427c = str2;
        uVar.copyOnWrite();
        ((C83813v) uVar.instance).f228428d = BuildConfig.FLAVOR;
        return (C83813v) uVar.build();
    }

    /* renamed from: i */
    private final C83813v m133296i(Account account) {
        String d = this.f228178g.d();
        String string = ((SharedPreferences) this.f228174c.mo27525b()).getString("language_settings_primary_assistant_language:".concat(String.valueOf(account.name)), BuildConfig.FLAVOR);
        C58485gu b = this.f228176e.b(account.name);
        String languageTag = b.size() > 1 ? ((Locale) b.get(1)).toLanguageTag() : BuildConfig.FLAVOR;
        C83812u uVar = (C83812u) C83813v.f228423e.createBuilder();
        uVar.copyOnWrite();
        d.getClass();
        ((C83813v) uVar.instance).f228425a = d;
        uVar.copyOnWrite();
        string.getClass();
        ((C83813v) uVar.instance).f228426b = string;
        uVar.copyOnWrite();
        languageTag.getClass();
        ((C83813v) uVar.instance).f228427c = languageTag;
        uVar.copyOnWrite();
        ((C83813v) uVar.instance).f228428d = BuildConfig.FLAVOR;
        return (C83813v) uVar.build();
    }

    /* renamed from: j */
    private final C60870cx m133297j(Account account) {
        C58976aa aaVar = C58975e.f156826a;
        String str = account.name;
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 268435456;
        acv.f128968x = true;
        return ((l) this.f228185n.mo27525b()).j(account, (acv) acu.build(), (C50144me) null, 5, TimeUnit.SECONDS, getClass().getSimpleName());
    }

    /* renamed from: k */
    private final C60870cx m133298k() {
        if (!((C90021c) this.f228172a.mo27525b()).mo79746e(C90014bt.f247174cF) || !((C90021c) this.f228172a.mo27525b()).mo79746e(C90014bt.f247177cI)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C118831d) this.f228189r.mo6453a()).mo104025g(0);
            return C118826c.f331423b;
        }
        C58480gp e = C58485gu.m89837e();
        int nextInt = this.f228188q.nextInt((int) ((C90021c) this.f228172a.mo27525b()).mo79743a(C90014bt.f247049N));
        for (Account account : ((C86054o) this.f228173b.mo27525b()).mo79684r()) {
            C83723s sVar = (C83723s) C83811t.f228414h.createBuilder();
            boolean l = m133299l(account);
            sVar.copyOnWrite();
            ((C83811t) sVar.instance).f228418c = l;
            if (!m133299l(account)) {
                e.mo55395g(this.f228186o.mo28210j(m133297j(account), "transitionTaskForAccount", new C83678g(this, account, sVar)));
            } else if (!((C90021c) this.f228172a.mo27525b()).mo79746e(C90014bt.f247154bm) && nextInt == 0) {
                e.mo55395g(this.f228187p.mo28209i(m133297j(account), "syncAssistantLanguageToLocal", new C83708i(this, sVar, account)));
            }
        }
        return C60856cj.m92892a(e.mo55394f()).mo57334a(new C83712j(this), C60826bg.f164896a);
    }

    /* renamed from: l */
    private final boolean m133299l(Account account) {
        return ((SharedPreferences) this.f228174c.mo27525b()).getBoolean("decouple_assistant_language_transition_task:".concat(String.valueOf(account.name)), false);
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        C83816y yVar = this.f228184m;
        yVar.copyOnWrite();
        C83817z zVar = C83817z.f228433c;
        ((C83817z) yVar.instance).f228436b = "perform";
        return m133298k();
    }

    /* renamed from: b */
    public final C60870cx mo77037b(Account account, C49952fb fbVar, String str, boolean z, C83723s sVar) {
        C83813v h = m133295h(fbVar.f129862d);
        C83815x xVar = ((C83811t) sVar.build()).f228417b;
        if (xVar == null) {
            xVar = C83815x.f228429c;
        }
        C83814w wVar = (C83814w) xVar.toBuilder();
        wVar.copyOnWrite();
        h.getClass();
        ((C83815x) wVar.instance).f228432b = h;
        sVar.copyOnWrite();
        C83815x xVar2 = (C83815x) wVar.build();
        xVar2.getClass();
        ((C83811t) sVar.instance).f228417b = xVar2;
        C58976aa aaVar = C58975e.f156826a;
        String str2 = account.name;
        C22871g gVar = this.f228187p;
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        fbVar.getClass();
        acx.f128999p = fbVar;
        acx.f128984a |= 65536;
        return gVar.mo28209i(((l) this.f228185n.mo27525b()).d(account, (acx) acw.build(), 5, TimeUnit.SECONDS, getClass().getSimpleName()), "markAccountFinishedTransitionTask", new C83694h(this, account, str, fbVar, z, sVar));
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        C58976aa aaVar = C58975e.f156826a;
        if (z || z2) {
            String str = true != z ? "onBoot" : "onInstall";
            C83816y yVar = this.f228184m;
            yVar.copyOnWrite();
            C83817z zVar = C83817z.f228433c;
            ((C83817z) yVar.instance).f228436b = str;
            m133298k();
        }
    }

    /* renamed from: d */
    public final void mo77038d(Account account, String str, List list, boolean z, C83723s sVar) {
        ((SharedPreferences) this.f228174c.mo27525b()).edit().putBoolean("decouple_assistant_language_transition_task:".concat(String.valueOf(account.name)), true).apply();
        mo77041g(account, str, list, sVar);
        if (z) {
            String F = ((C86054o) this.f228173b.mo27525b()).mo79659F();
            if (F == null || !F.equals(account.name)) {
                ((SharedPreferences) this.f228174c.mo27525b()).edit().putBoolean("decouple_assistant_languages_changed_prefix:".concat(String.valueOf(account.name)), true).apply();
            } else {
                ((SharedPreferences) this.f228174c.mo27525b()).edit().putInt("assistant_language_reconfiguring_notification_state", 2).apply();
            }
        }
    }

    /* renamed from: e */
    public final void mo77039e(C83723s sVar, Account account, act act) {
        C49946ew ewVar = act.f128911r;
        if (ewVar == null) {
            ewVar = C49946ew.f129824q;
        }
        C83813v h = m133295h(ewVar.f129830e);
        C83813v i = m133296i(account);
        C83814w wVar = (C83814w) C83815x.f228429c.createBuilder();
        wVar.copyOnWrite();
        h.getClass();
        ((C83815x) wVar.instance).f228432b = h;
        wVar.copyOnWrite();
        i.getClass();
        ((C83815x) wVar.instance).f228431a = i;
        C83815x xVar = (C83815x) wVar.build();
        sVar.copyOnWrite();
        C83811t tVar = C83811t.f228414h;
        xVar.getClass();
        ((C83811t) sVar.instance).f228416a = xVar;
        boolean z = ewVar.f129837l;
        sVar.copyOnWrite();
        ((C83811t) sVar.instance).f228419d = z;
        C62971cq cqVar = ewVar.f129830e;
        if (!cqVar.isEmpty()) {
            boolean h2 = aa.h((String) cqVar.get(0), (C90021c) this.f228172a.mo27525b());
            sVar.copyOnWrite();
            ((C83811t) sVar.instance).f228421f = h2;
            boolean g = this.f228178g.g((String) cqVar.get(0));
            sVar.copyOnWrite();
            ((C83811t) sVar.instance).f228422g = g;
        }
    }

    /* renamed from: f */
    public final synchronized void mo77040f(C83723s sVar) {
        C83816y yVar = this.f228184m;
        yVar.copyOnWrite();
        C83817z zVar = (C83817z) yVar.instance;
        C83811t tVar = (C83811t) sVar.build();
        C83817z zVar2 = C83817z.f228433c;
        tVar.getClass();
        C62971cq cqVar = zVar.f228435a;
        if (!cqVar.mo58948c()) {
            zVar.f228435a = C62942bv.mutableCopy(cqVar);
        }
        zVar.f228435a.add(tVar);
    }

    /* renamed from: g */
    public final void mo77041g(Account account, String str, List list, C83723s sVar) {
        ae aeVar = this.f228176e;
        String str2 = account.name;
        Locale u = C90772bp.m148313u(str);
        u.getClass();
        aeVar.f(str2, u);
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Locale u2 = C90772bp.m148313u(str3);
            u2.getClass();
            e.mo55395g(u2);
            z |= str3.equals(str);
        }
        if (!z) {
            Locale u3 = C90772bp.m148313u(str);
            u3.getClass();
            e.mo55395g(u3);
        }
        this.f228176e.e(account.name, e.mo55394f());
        C83813v i = m133296i(account);
        C83815x xVar = ((C83811t) sVar.build()).f228417b;
        if (xVar == null) {
            xVar = C83815x.f228429c;
        }
        C83814w wVar = (C83814w) xVar.toBuilder();
        wVar.copyOnWrite();
        i.getClass();
        ((C83815x) wVar.instance).f228431a = i;
        sVar.copyOnWrite();
        C83815x xVar2 = (C83815x) wVar.build();
        xVar2.getClass();
        ((C83811t) sVar.instance).f228417b = xVar2;
    }
}
