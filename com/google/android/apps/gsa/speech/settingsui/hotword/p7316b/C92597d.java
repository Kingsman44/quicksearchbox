package com.google.android.apps.gsa.speech.settingsui.hotword.p7316b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74549c;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.b.d */
/* compiled from: PG */
public final class C92597d {

    /* renamed from: h */
    private static final long f258407h = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a */
    public final C91097g f258408a;

    /* renamed from: b */
    public final Context f258409b;

    /* renamed from: c */
    public final C68214a f258410c;

    /* renamed from: d */
    public final C68214a f258411d;

    /* renamed from: e */
    public final C68214a f258412e;

    /* renamed from: f */
    public final C68214a f258413f;

    /* renamed from: g */
    public final C68214a f258414g;

    /* renamed from: i */
    private final C9439b f258415i;

    /* renamed from: j */
    private final C68214a f258416j;

    /* renamed from: k */
    private final C68214a f258417k;

    /* renamed from: l */
    private final C68214a f258418l;

    /* renamed from: m */
    private final C68214a f258419m;

    /* renamed from: n */
    private final C68214a f258420n;

    /* renamed from: o */
    private final C68214a f258421o;

    public C92597d(C91097g gVar, C9439b bVar, Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11) {
        this.f258408a = gVar;
        this.f258415i = bVar;
        this.f258409b = context;
        this.f258416j = aVar;
        this.f258410c = aVar2;
        this.f258411d = aVar3;
        this.f258412e = aVar4;
        this.f258417k = aVar5;
        this.f258413f = aVar6;
        this.f258418l = aVar7;
        this.f258419m = aVar8;
        this.f258420n = aVar9;
        this.f258414g = aVar10;
        this.f258421o = aVar11;
    }

    /* renamed from: a */
    public final String mo87367a() {
        return ((C86338r) this.f258416j.mo27525b()).getString(C90507o.f253011a, (String) null);
    }

    /* renamed from: b */
    public final String mo87368b() {
        String d = mo87370d();
        if (((C89994f) this.f258417k.mo27525b()).mo83823l() || !((C86124t) this.f258414g.mo27525b()).mo79746e(C90082eg.f249878U)) {
            if (!((C92599f) this.f258421o.mo27525b()).mo87378a()) {
                return this.f258409b.getString(R.string.hotword_pref_summary_opa_non_dsp, new Object[]{d});
            } else if (((C86124t) this.f258414g.mo27525b()).mo79746e(C90082eg.f249943bF)) {
                return this.f258409b.getString(R.string.hotword_pref_summary_opa_v2, new Object[]{d});
            } else {
                return this.f258409b.getString(R.string.hotword_pref_summary_opa, new Object[]{d});
            }
        } else if (((bm) this.f258418l.mo27525b()).u()) {
            return this.f258409b.getString(R.string.hotword_pref_summary_opa_non_speaker_id, new Object[]{d});
        } else {
            return this.f258409b.getString(R.string.hotword_pref_summary_search, new Object[]{d});
        }
    }

    /* renamed from: c */
    public final String mo87369c() {
        if (((C86124t) this.f258414g.mo27525b()).mo79746e(C90082eg.f249878U)) {
            return mo87370d();
        }
        return this.f258409b.getString(R.string.hotword_pref_title_opa);
    }

    /* renamed from: d */
    public final String mo87370d() {
        if (!((C86124t) this.f258414g.mo27525b()).mo79746e(C90082eg.f249878U) || !((C89994f) this.f258417k.mo27525b()).mo83827p().equals(C90584f.OK_HEY_GOOGLE)) {
            return this.f258409b.getString(R.string.hotword_pref_ok_google_prompt);
        }
        return this.f258409b.getString(R.string.hotword_pref_hey_google_prompt);
    }

    /* renamed from: e */
    public final void mo87371e() {
        if (((C89331a) this.f258419m.mo27525b()).mo83275a(4)) {
            ((C89331a) this.f258419m.mo27525b()).mo83276c(4, false);
            C118522by byVar = C118522by.UPLOAD_HOTWORD_SETTINGS;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            long j = f258407h;
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 2;
            agVar.f328823c = j;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328824d = 2;
            agVar2.f328821a |= 4;
            ((C118561t) this.f258420n.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
        }
    }

    /* renamed from: f */
    public final void mo87372f() {
        ((C89331a) this.f258419m.mo27525b()).mo83276c(4, true);
    }

    /* renamed from: g */
    public final void mo87373g() {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_PREFERENCE_CHANGED");
        intent.setPackage("com.google.android.googlequicksearchbox");
        this.f258409b.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
    }

    /* renamed from: h */
    public final void mo87374h() {
        C88483e.m142828c(this.f258409b, new C88489j(C87739bu.REFRESH_SERVICE_STATE).mo82013a());
    }

    /* renamed from: i */
    public final void mo87375i() {
        ac acVar;
        C91097g gVar = this.f258408a;
        C74554t i = C74555u.m120572i();
        i.mo70868b(s.a);
        i.mo70872f(C74544ae.m120523d().mo70849a());
        ((C74549c) i).f208695a = this.f258415i;
        aa c = C74542ab.m120516c();
        if (((C86124t) this.f258414g.mo27525b()).mo79746e(C90082eg.f249889aE)) {
            acVar = ac.d;
        } else {
            acVar = ac.a;
        }
        c.c(acVar);
        i.mo70871e(c.a());
        gVar.mo65090b(i.mo70882h(), C92595b.f258405a);
    }

    /* renamed from: j */
    public final void mo87376j() {
        C84533ar a = ((C84534as) this.f258410c.mo27525b()).mo78241a();
        a.mo78237c("GSAPrefs.hotword_enabled", true);
        a.mo78235a();
    }
}
