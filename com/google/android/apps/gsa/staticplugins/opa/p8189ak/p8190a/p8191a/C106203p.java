package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8190a.p8191a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.shared.C73840bc;
import com.google.android.apps.gsa.assistant.shared.C73869h;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.nga.shared.p6345h.C81320p;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89121b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89123d;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89124e;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89125f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.opa.C109739nm;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108934ej;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.p8345bl.C108098d;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.a.a.p */
/* compiled from: PG */
public final class C106203p implements C89124e, C89121b {

    /* renamed from: a */
    public final Context f296377a;

    /* renamed from: b */
    public final C86124t f296378b;

    /* renamed from: c */
    public final C68214a f296379c;

    /* renamed from: d */
    public final boolean f296380d;

    /* renamed from: e */
    public final C87568k f296381e;

    /* renamed from: f */
    public final C86054o f296382f;

    /* renamed from: g */
    public final C109790aj f296383g;

    /* renamed from: h */
    public final C108934ej f296384h;

    /* renamed from: i */
    public final C109739nm f296385i;

    /* renamed from: j */
    public final SharedPreferences f296386j;

    /* renamed from: k */
    public final C113868cw f296387k;

    /* renamed from: l */
    public final C81515c f296388l;

    /* renamed from: m */
    public final C68214a f296389m;

    /* renamed from: n */
    public final C89994f f296390n;

    /* renamed from: o */
    public final C68214a f296391o;

    /* renamed from: p */
    public final C81320p f296392p;

    /* renamed from: q */
    public final C68214a f296393q;

    /* renamed from: r */
    public final C68214a f296394r;

    /* renamed from: s */
    public final C114250c f296395s;

    /* renamed from: t */
    private final C22871g f296396t;

    /* renamed from: u */
    private final C22871g f296397u;

    /* renamed from: v */
    private final C68214a f296398v;

    /* renamed from: w */
    private final C81315k f296399w;

    /* renamed from: x */
    private final C68214a f296400x;

    /* renamed from: y */
    private final C73840bc f296401y;

    public C106203p(Context context, C86124t tVar, C68214a aVar, boolean z, C87568k kVar, C86054o oVar, C109790aj ajVar, C108934ej ejVar, C109739nm nmVar, C22871g gVar, C22871g gVar2, SharedPreferences sharedPreferences, C113868cw cwVar, C114250c cVar, C81515c cVar2, C73840bc bcVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C89994f fVar, C68214a aVar5, C81320p pVar, C81315k kVar2, C68214a aVar6, C68214a aVar7) {
        this.f296377a = context;
        this.f296378b = tVar;
        this.f296379c = aVar;
        this.f296380d = z;
        this.f296381e = kVar;
        this.f296382f = oVar;
        this.f296383g = ajVar;
        this.f296384h = ejVar;
        this.f296385i = nmVar;
        this.f296396t = gVar;
        this.f296397u = gVar2;
        this.f296386j = sharedPreferences;
        this.f296387k = cwVar;
        this.f296395s = cVar;
        this.f296388l = cVar2;
        this.f296401y = bcVar;
        this.f296393q = aVar2;
        this.f296389m = aVar3;
        this.f296398v = aVar4;
        this.f296390n = fVar;
        this.f296391o = aVar5;
        this.f296392p = pVar;
        this.f296399w = kVar2;
        this.f296394r = aVar6;
        this.f296400x = aVar7;
    }

    /* renamed from: c */
    public static Bundle m176958c(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putInt("triggered_by", 146);
        C87565h hVar = new C87565h(bundle);
        hVar.f236560f = 6;
        hVar.f236523a = "and.opa";
        hVar.f236497A = false;
        hVar.f236515S = z;
        hVar.f236516T = z2;
        return hVar.mo81685a();
    }

    /* renamed from: f */
    public static boolean m176959f(Map map, int i, int i2) {
        if (map.isEmpty() || !map.containsKey("yesterday")) {
            return true;
        }
        int intValue = ((Integer) map.get("yesterday")).intValue();
        if (i >= intValue || intValue >= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo83111a(C89125f fVar) {
        C60870cx cxVar;
        if (fVar.equals(C89125f.VOICE_MATCH)) {
            this.f296397u.mo28201a("FinishSetupBarContentProviderImpl.handleClick", new C106198k(this));
        } else if (fVar.equals(C89125f.ASSISTANT_ON_LOCKSCREEN)) {
            this.f296397u.mo28201a("FinishSetupBarContentProviderImpl.handleClickAOL", new C106199l(this));
        } else if (fVar.equals(C89125f.NEST_PROMO)) {
            this.f296397u.mo28210j(this.f296397u.mo28209i(this.f296401y.mo65320a(), "FinishSetupBarContentProviderImpl.fetchNestPromoUri", C106195h.f296369a), "FinishSetupBarContentProviderImpl.handleClick", new C106200m(this));
        } else if (fVar.equals(C89125f.LONG_PRESS_POWER_CONTEXTUAL_EDU) && ((Optional) this.f296394r.mo27525b()).isPresent()) {
            this.f296397u.mo28201a("FinishSetupBarContentProviderImpl.handleClickLongPressPower", new C106201n(this));
        } else if (fVar.equals(C89125f.TELL_MY_FAMILY)) {
            this.f296392p.mo74929r();
        } else if (!this.f296378b.mo79746e(C90037cp.f248447ab) || !((Optional) this.f296394r.mo27525b()).isPresent()) {
            Bundle c = m176958c(true, !this.f296378b.mo79746e(C90053de.f248950Q));
            if (this.f296378b.mo79746e(C90014bt.f247692lu)) {
                cxVar = this.f296396t.mo28201a("FinishSetupBarContentProviderImpl.handleClick: shouldRedirectToOpaOnboardingSequence", new C106189b(this, c));
            } else {
                cxVar = this.f296396t.mo28201a("FinishSetupBarContentProviderImpl.handleClick: shouldRedirect", new C106190c(this, c));
            }
            this.f296397u.mo28209i(cxVar, "FinishSetupBarContentProviderImpl.handleClick", new C106191d(this, c));
        } else {
            this.f296397u.mo28209i(((C108098d) ((Optional) this.f296394r.mo27525b()).get()).mo96434a(), "FinishSetupBarContentProviderImpl.handleClick", new C106202o(this));
        }
    }

    /* renamed from: b */
    public final C60870cx mo83112b(Locale locale, e eVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx b = C80905at.m128758b(this.f296397u, "FinishSetupBarContentProviderImpl.getFinishSetupBarContentCandidates", this.f296392p.mo74918g(), this.f296392p.mo74919h(), new C106192e(this));
        C60870cx b2 = C80905at.m128758b(this.f296397u, "FinishSetupBarContentProviderImpl.getFinishSetupBarContentCandidates", this.f296392p.mo74914c(), this.f296392p.mo74915d(), new C106194g(this));
        if (!this.f296378b.mo79746e(C90053de.f248940G) || ((Optional) this.f296400x.mo27525b()).isEmpty()) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = this.f296397u.mo28209i(((C9799ae) ((Optional) this.f296400x.mo27525b()).get()).mo18041a(), "FinishSetupBarContentProviderImpl.aolIsStandby", C106197j.f296371a);
        }
        C60870cx cxVar3 = cxVar;
        C60870cx b3 = C80905at.m128758b(this.f296397u, "FinishSetupBarContentProviderImpl.getFinishSetupBarContentCandidates", this.f296392p.mo74916e(), this.f296392p.mo74917f(), new C106188a(this));
        long i = (long) this.f296399w.mo74893i();
        long a = this.f296378b.mo79743a(C90053de.f248990w);
        if (this.f296378b.mo79746e(C90053de.f248971d)) {
            if (eVar.equals(e.bv) && i < a) {
                cxVar2 = C60856cj.m92900i(true);
                C60870cx cxVar4 = cxVar2;
                C60870cx a2 = ((C73869h) this.f296398v.mo27525b()).mo65344a((int) this.f296378b.mo79743a(C90037cp.f248483bK));
                return C60856cj.m92893b(b, b2, cxVar3, b3, cxVar4, a2).mo57334a(new C106193f(this, b, b2, cxVar3, b3, cxVar4, a2, locale), C60826bg.f164896a);
            }
        }
        cxVar2 = C60856cj.m92900i(false);
        C60870cx cxVar42 = cxVar2;
        C60870cx a22 = ((C73869h) this.f296398v.mo27525b()).mo65344a((int) this.f296378b.mo79743a(C90037cp.f248483bK));
        return C60856cj.m92893b(b, b2, cxVar3, b3, cxVar42, a22).mo57334a(new C106193f(this, b, b2, cxVar3, b3, cxVar42, a22, locale), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final Optional mo95441d() {
        ((C89859i) this.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_NEST_PROMO);
        return Optional.m71637of(C89123d.m144979c(C89125f.NEST_PROMO, this.f296378b.mo79758x(C90037cp.f248522bx)));
    }

    /* renamed from: e */
    public final boolean mo95442e(Map map) {
        if (!this.f296378b.mo79746e(C90037cp.f248538cM)) {
            return this.f296378b.mo79746e(C90037cp.f248533cH);
        }
        if (this.f296378b.mo79746e(C90037cp.f248533cH)) {
            return m176959f(map, (int) this.f296378b.mo79743a(C90037cp.f248506bh), (int) this.f296378b.mo79743a(C90037cp.f248501bc));
        }
        return false;
    }
}
