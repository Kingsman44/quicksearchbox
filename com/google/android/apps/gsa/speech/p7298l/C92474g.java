package com.google.android.apps.gsa.speech.p7298l;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.C73850cd;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8914d.C118986a;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.p6783a.C85708d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7066m.C89965ad;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.libraries.p590as.p591a.C10770d;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60856cj;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5202d.p5203a.C66489b;
import com.google.speech.recognizer.p5233a.C67451at;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.speech.l.g */
/* compiled from: PG */
public final class C92474g {

    /* renamed from: a */
    public final String f258039a = "screen-search";

    /* renamed from: b */
    public final String f258040b = "unified-ime";

    /* renamed from: c */
    public final C69464a f258041c;

    /* renamed from: d */
    public final C68214a f258042d;

    /* renamed from: e */
    public final C118986a f258043e;

    /* renamed from: f */
    public final C92214y f258044f;

    /* renamed from: g */
    private final C68214a f258045g;

    /* renamed from: h */
    private final C68214a f258046h;

    /* renamed from: i */
    private final C68214a f258047i;

    /* renamed from: j */
    private final C68214a f258048j;

    /* renamed from: k */
    private final C73850cd f258049k;

    /* renamed from: l */
    private final bm f258050l;

    /* renamed from: m */
    private final C68214a f258051m;

    /* renamed from: n */
    private final C68214a f258052n;

    /* renamed from: o */
    private final C68214a f258053o;

    public C92474g(C69464a aVar, C68214a aVar2, C92214y yVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C73850cd cdVar, bm bmVar, C118986a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10) {
        this.f258041c = aVar;
        this.f258045g = aVar2;
        this.f258044f = yVar;
        this.f258046h = aVar3;
        this.f258047i = aVar5;
        this.f258048j = aVar4;
        this.f258042d = aVar6;
        this.f258049k = cdVar;
        this.f258050l = bmVar;
        this.f258043e = aVar7;
        this.f258051m = aVar8;
        this.f258052n = aVar9;
        this.f258053o = aVar10;
    }

    /* renamed from: a */
    public static C90536a m152086a(Query query) {
        if (query.mo84326bK()) {
            return C90536a.CLOCKWORK;
        }
        if (query.mo84319bD()) {
            return C90536a.ANDROID_TV_SEARCH;
        }
        return C90536a.VOICE_ACTIONS;
    }

    /* renamed from: i */
    public static boolean m152087i(Query query, C86124t tVar, SharedPreferences sharedPreferences) {
        if (!tVar.mo79746e(C90110fh.f250664bI) || !query.mo84395cb(tVar.mo79745c(C90110fh.f250706l), tVar.mo79745c(C90110fh.f250639ak))) {
            return false;
        }
        if (!tVar.mo79746e(C90110fh.f250656bA) || !sharedPreferences.getBoolean("language_switcher_auto_option_selected", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final void m152088j(C92472e eVar, C66422b bVar, C66489b bVar2, C92252n nVar) {
        if (bVar != null) {
            eVar.f257994q = bVar;
        }
        if (bVar2 != null) {
            eVar.f257995r = bVar2;
        }
        eVar.f257985h = nVar == C92252n.VOICE_ACTIONS ? null : C92249k.CONTACT_DIALING;
    }

    /* renamed from: k */
    public static final void m152089k(C92472e eVar, boolean z) {
        boolean z2 = z;
        eVar.f258000w = z2;
        eVar.f258001x = z2;
        eVar.mo87218a();
    }

    /* renamed from: l */
    private final SharedPreferences m152090l() {
        return ((C86127w) this.f258048j.mo27525b()).f232790a.mo79722a();
    }

    /* renamed from: m */
    private final String m152091m() {
        String string = m152090l().getString("spoken-language-bcp-47", (String) null);
        if (string != null) {
            return string;
        }
        return C92654a.m152607d(Locale.getDefault().toString(), ((C92541i) this.f258042d.mo27525b()).mo87316a());
    }

    /* renamed from: n */
    private final List m152092n(Query query) {
        if (query.mo84403cj()) {
            if (!((C91123v) this.f258052n.mo27525b()).mo85390b() || !((C86124t) this.f258046h.mo27525b()).mo79746e(C90086ek.f250303ab)) {
                return Collections.emptyList();
            }
            C85710c cVar = (C85710c) this.f258051m.mo27525b();
            ArrayList arrayList = new ArrayList();
            String a = cVar.mo79343a();
            if (!TextUtils.isEmpty(a)) {
                arrayList.add(a);
            }
            boolean e = cVar.mo79347e();
            String str = BuildConfig.FLAVOR;
            if (e) {
                try {
                    str = ((C85708d) C60856cj.m92910s(((C42876ab) cVar.f231770d.mo27525b()).mo46042d())).f231763c;
                } catch (RuntimeException e2) {
                    C59104x c = C85710c.f231767a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "AssistantLocaleSettings");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(7574)).mo56386p("Error fetching profile user secondary locale string.");
                }
            } else {
                str = ((C86338r) cVar.f231769c.mo27525b()).getString("aae_settings_secondary_language", str);
            }
            C58976aa aaVar = C58975e.f156826a;
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(a, str)) {
                arrayList.add(str);
            }
            return arrayList;
        } else if (query.mo84396cc()) {
            return Collections.emptyList();
        } else {
            return mo87222e();
        }
    }

    /* renamed from: o */
    private final boolean m152093o() {
        return ((C86124t) this.f258046h.mo27525b()).mo79746e(C90114fl.f250728b) && this.f258050l.u();
    }

    /* renamed from: b */
    public final C92460b mo87219b(Query query) {
        C90021c cVar = (C90021c) this.f258046h.mo27525b();
        SharedPreferences l = m152090l();
        a audio = this.f258044f.getAudio(query.f252781t);
        C118843f fVar = (C118843f) this.f258045g.mo27525b();
        C92456a l2 = C92460b.m151978l();
        Bundle bundle = query.f252786y;
        String g = bundle != null ? C58837ba.m90858g(bundle.getString("android.speech.extra.AUDIO_ENCODING_REQUESTED")) : BuildConfig.FLAVOR;
        boolean z = true;
        boolean z2 = l.getBoolean("bluetoothHeadset", false) || query.mo84450de();
        boolean z3 = cVar.mo79746e(C90082eg.f250030cn) && !z2 && (g.isEmpty() || C10770d.OGGOPUS.f35759e.equals(g));
        boolean z4 = !z3 && cVar.mo79746e(C90120fr.f250805aR) && !z2 && (g.isEmpty() || C10770d.AMRWB.f35759e.equals(g));
        if (!query.mo84432dM() || audio == null) {
            Uri uri = query.f252787z;
            if (uri != null) {
                ((C92462c) l2).f257908b = uri;
                int i = query.f252743A;
                if (i != 0) {
                    l2.mo87175s(i);
                }
            } else if (z3) {
                l2.mo87162f(C67451at.OGG_OPUS);
                l2.mo87175s(16000);
            } else if (z4) {
                l2.mo87162f(C67451at.AMR_WB);
                l2.mo87175s(16000);
            }
        } else {
            ((C92462c) l2).f257909c = audio.c;
            l2.mo87175s(audio.a);
            l2.mo87162f(C10771e.m25766c(audio.a).f35762h);
        }
        l2.mo87159c(C92207r.m151409a(query, cVar));
        if (query.mo84363bw("android.speech.extra.BEEP_SUPPRESSED") || fVar.mo71744e() == 0) {
            z = false;
        }
        l2.mo87164h(z);
        if (query.mo84336bU()) {
            l2.mo87174r(false);
        }
        l2.mo87171o(query.f252749G);
        return l2.mo87157a();
    }

    /* renamed from: c */
    public final C92473f mo87220c(boolean z) {
        Query u = Query.f252741b.mo84493u();
        C92456a l = C92460b.m151978l();
        l.mo87164h(z);
        l.mo87173q(false);
        l.mo87175s(16000);
        l.mo87176t(true);
        l.mo87180x(true);
        l.mo87171o(u.f252749G);
        C92460b a = l.mo87157a();
        C92472e eVar = (C92472e) this.f258041c.mo17428b();
        eVar.f257979b = a;
        eVar.f257986i = C92252n.DICTATION;
        eVar.f257978a = C90536a.VOICE_ACCESS;
        eVar.f257989l = true;
        eVar.f257984g = false;
        eVar.f257990m = mo87225h();
        eVar.f257993p = C66422b.f180605k;
        eVar.f257981d = m152091m();
        eVar.f257991n = false;
        eVar.f257999v = Long.valueOf(u.f252749G);
        return eVar.mo87218a();
    }

    /* renamed from: d */
    public final String mo87221d(Query query) {
        if (query.mo84403cj()) {
            if (TextUtils.isEmpty(query.f252754L)) {
                return this.f258050l.b();
            }
            String str = query.f252754L;
            str.getClass();
            return str;
        } else if (query.mo84396cc()) {
            return Locale.getDefault().toLanguageTag();
        } else {
            return m152091m();
        }
    }

    /* renamed from: e */
    public final List mo87222e() {
        Set<String> stringSet = m152090l().getStringSet("additional-spoken-language-bcp-47", (Set) null);
        if (stringSet == null) {
            return new ArrayList();
        }
        return new ArrayList(stringSet);
    }

    /* renamed from: f */
    public final void mo87223f(C92472e eVar, Query query, C90536a aVar, boolean z, boolean z2) {
        Bundle bundle = query.f252786y;
        String str = null;
        if (query.mo84447db() && bundle != null) {
            str = C58837ba.m90858g(bundle.getString("android.speech.extra.CALLING_PACKAGE"));
        }
        eVar.f257992o = z2;
        eVar.f257978a = aVar;
        eVar.f257990m = (query.mo84447db() && query.mo84363bw("android.speech.extra.PROFANITY_FILTER")) || mo87225h();
        eVar.f257962A = query;
        eVar.f257999v = Long.valueOf(query.f252749G);
        eVar.f257980c = z;
        eVar.f257983f = str;
        if (((C86054o) this.f258047i.mo27525b()).mo79668a() != null) {
            C73850cd cdVar = this.f258049k;
            Account a = ((C86054o) this.f258047i.mo27525b()).mo79668a();
            a.getClass();
            if (cdVar.g(a)) {
                eVar.f257966E = true;
            }
        }
    }

    /* renamed from: g */
    public final void mo87224g(C92472e eVar, C92460b bVar, Query query, C89061q qVar, C92252n nVar, C90536a aVar) {
        String str;
        Bundle bundle = query.f252786y;
        String str2 = null;
        if (bundle != null && bundle.containsKey("application-id-override")) {
            str2 = bundle.getString("application-id-override", (String) null);
        }
        if (true == query.mo84446da()) {
            str2 = "speaker-id-enrollment";
        }
        if (((C91123v) this.f258052n.mo27525b()).mo85390b() && ((C86124t) this.f258046h.mo27525b()).mo79746e(C90086ek.f250312ak)) {
            eVar.f257981d = ((C85710c) this.f258051m.mo27525b()).mo79343a();
        } else if (!query.mo84434dO() && m152093o()) {
            Account a = ((C86054o) this.f258047i.mo27525b()).mo79668a();
            if (a != null) {
                C58485gu b = ((ae) this.f258053o.mo27525b()).b(a.name);
                if (!b.isEmpty()) {
                    eVar.f257981d = ((Locale) b.get(0)).toLanguageTag();
                } else {
                    eVar.f257981d = mo87221d(query);
                }
            }
        } else if (!((C86124t) this.f258046h.mo27525b()).mo79746e(C90110fh.f250695by) || !query.mo84448dc() || query.mo84358bq() == null) {
            eVar.f257981d = mo87221d(query);
        } else {
            eVar.f257981d = query.mo84358bq();
        }
        if (!m152087i(query, (C86124t) this.f258046h.mo27525b(), m152090l()) || mo87222e().isEmpty()) {
            if (query.mo84434dO() || !m152093o()) {
                eVar.f257982e = m152092n(query);
            } else {
                Account a2 = ((C86054o) this.f258047i.mo27525b()).mo79668a();
                if (a2 != null) {
                    C58485gu b2 = ((ae) this.f258053o.mo27525b()).b(a2.name);
                    if (!b2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 1; i < b2.size(); i++) {
                            arrayList.add(((Locale) b2.get(i)).toLanguageTag());
                        }
                        eVar.f257982e = arrayList;
                    } else {
                        eVar.f257982e = m152092n(query);
                    }
                }
            }
        }
        eVar.f257996s = str2;
        eVar.f257979b = bVar;
        eVar.f257986i = nVar;
        eVar.f257993p = (C66422b) ((C66421a) C66422b.f180605k.createBuilder()).build();
        if (qVar != null) {
            eVar.f258003z = qVar;
        }
        amo amo = query.f252760R;
        if (amo != null) {
            eVar.f257998u = amo;
        }
        if (aVar == C90536a.VOICE_ACTIONS) {
            boolean dO = query.mo84434dO();
            if (query.mo84370cC()) {
                str = "assistant-sound-search";
            } else if (query.mo84446da()) {
                str = "audio-logging";
            } else if (((C86124t) this.f258046h.mo27525b()).mo79746e(C90014bt.f247088aZ) && query.mo84327bL()) {
                m152089k(eVar, false);
                str = "assistant-storybooks";
            } else if (dO) {
                if (((C91123v) this.f258052n.mo27525b()).mo85390b() && ((C86124t) this.f258046h.mo27525b()).mo79746e(C90086ek.f250520r)) {
                    m152089k(eVar, false);
                }
                str = "assistant-legacy-nexus";
            } else {
                str = ((C86124t) this.f258046h.mo27525b()).mo79758x(C90120fr.f250806aS);
            }
            if (query.mo84446da() || (!TextUtils.isEmpty(str) && (mo87222e().isEmpty() || dO))) {
                eVar.f257997t = str;
            }
        } else if (aVar == C90536a.CLOCKWORK && query.mo84399cf() && query.mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            eVar.f257997t = ((C86124t) this.f258046h.mo27525b()).mo79758x(C89965ad.f246494a);
            eVar.f258001x = query.mo84386cS();
        }
        if (!query.mo84412cs() && (query.f252762T > 1 || query.mo84319bD())) {
            eVar.f258002y = "home";
        }
        eVar.f257965D = k.b((C90021c) this.f258046h.mo27525b(), query);
        eVar.f257968G = (int) ((C86124t) this.f258046h.mo27525b()).mo79743a(C90082eg.f250018cb);
    }

    /* renamed from: h */
    public final boolean mo87225h() {
        if (((C86124t) this.f258046h.mo27525b()).mo79746e(C90110fh.f250679bi)) {
            return ((C86124t) this.f258046h.mo27525b()).mo79746e(C90082eg.f250078o);
        }
        return m152090l().getBoolean("profanityFilter", true);
    }
}
