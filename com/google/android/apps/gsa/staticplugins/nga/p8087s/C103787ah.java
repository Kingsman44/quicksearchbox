package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.provider.Settings;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9804aj;
import com.google.android.apps.gsa.assistant.settings.shared.ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103382f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.ah */
/* compiled from: PG */
public final class C103787ah implements SharedPreferences.OnSharedPreferenceChangeListener, C103382f, ad, C86051l, C9804aj {

    /* renamed from: a */
    public static final C58974d f288983a = C58974d.m91136j();

    /* renamed from: b */
    public final C103807o f288984b;

    /* renamed from: c */
    public final C42876ab f288985c;

    /* renamed from: d */
    public final C42876ab f288986d;

    /* renamed from: e */
    public final C22871g f288987e;

    /* renamed from: f */
    public final C103806n f288988f;

    /* renamed from: g */
    public final C68214a f288989g;

    /* renamed from: h */
    public final C68214a f288990h;

    /* renamed from: i */
    public final C68214a f288991i;

    /* renamed from: j */
    public final C68214a f288992j;

    /* renamed from: k */
    public final Context f288993k;

    /* renamed from: l */
    private final C68214a f288994l;

    /* renamed from: m */
    private final C22871g f288995m;

    /* renamed from: n */
    private final AtomicBoolean f288996n = new AtomicBoolean(false);

    /* renamed from: o */
    private final C68214a f288997o;

    /* renamed from: p */
    private final BroadcastReceiver f288998p = new C103784ae(this);

    /* renamed from: q */
    private final ContentObserver f288999q = new C103785af(this);

    public C103787ah(Context context, C103807o oVar, C42876ab abVar, C42876ab abVar2, C68214a aVar, C90821bm bmVar, C22871g gVar, C103806n nVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f288993k = context;
        this.f288984b = oVar;
        this.f288985c = abVar;
        this.f288986d = abVar2;
        this.f288994l = aVar;
        this.f288995m = bmVar.mo85163a(C103786ag.class);
        this.f288987e = gVar;
        this.f288988f = nVar;
        this.f288989g = aVar3;
        this.f288991i = aVar2;
        this.f288992j = aVar4;
        this.f288990h = aVar5;
        this.f288997o = aVar6;
    }

    /* renamed from: b */
    public final void mo18053b() {
        mo93850g();
    }

    /* renamed from: c */
    public final void mo93774c() {
        this.f288996n.set(true);
        this.f288984b.mo93861a().registerOnSharedPreferenceChangeListener(this);
        this.f288984b.mo93862b().registerOnSharedPreferenceChangeListener(this);
        ((C86054o) this.f288994l.mo27525b()).mo79675i(this);
        this.f288993k.registerReceiver(this.f288998p, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        this.f288993k.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("assist_structure_enabled"), false, this.f288999q);
        C103809q c = C103810r.m171792c();
        c.mo93836b().mo55489i(EnumSet.allOf(C103803k.class));
        C58490gz gzVar = new C58490gz(4);
        for (String h : ((C86054o) this.f288994l.mo27525b()).mo79685s()) {
            gzVar.mo55429h(h, C58528ij.m90008H(C103802j.values()));
        }
        mo93850g();
        ((C103764a) c).f288938a = gzVar.mo55427f(false);
        mo93849f(c.mo93835a());
    }

    /* renamed from: d */
    public final void mo93848d(String str) {
        if (this.f288996n.get()) {
            String substring = str.substring(45);
            C103809q c = C103810r.m171792c();
            ((C103764a) c).f288938a = C58495hd.m89900n(substring, C58528ij.m90012L(C103802j.ASSISTANT_LANGUAGE, C103802j.TEXT_DEPENDENT_MODEL, C103802j.VOICE_EVERYWHERE));
            mo93849f(c.mo93835a());
        }
    }

    /* renamed from: e */
    public final void mo93775e() {
        this.f288996n.set(false);
        this.f288984b.mo93861a().unregisterOnSharedPreferenceChangeListener(this);
        this.f288984b.mo93862b().unregisterOnSharedPreferenceChangeListener(this);
        ((C86054o) this.f288994l.mo27525b()).mo79681o(this);
        this.f288993k.unregisterReceiver(this.f288998p);
        this.f288993k.getContentResolver().unregisterContentObserver(this.f288999q);
    }

    /* renamed from: f */
    public final void mo93849f(C103810r rVar) {
        if (!rVar.mo93853b().isEmpty() || !rVar.mo93852a().isEmpty()) {
            C90875ai.m148465b(new C103780aa(), this.f288995m.mo28202b("[NGA] Sync preferences to PDS", new C103818z(this, rVar)), this.f288987e, "[NGA] Sync preferences to PDS").mo85223a(new C103781ab(rVar));
        }
    }

    /* renamed from: g */
    public final void mo93850g() {
        C90875ai.m148465b(C103816x.f289062a, this.f288987e.mo28210j(C60922j.m93045h((C60870cx) ((C58833ax) this.f288997o.mo27525b()).mo56106b(C103811s.f289056a).mo56109e(C60856cj.m92900i(C9857y.f33883f)), new C103814v(this), C60826bg.f164896a), "[NGA] Notify datastore change", new C103815w(this)), this.f288987e, "[NGA] Sync UDC bits to PDS").mo85223a(C103817y.f289063a);
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        mo93850g();
        if (account != null) {
            C103809q c = C103810r.m171792c();
            ((C103764a) c).f288938a = C58495hd.m89900n(account.name, C58528ij.m90008H(C103802j.values()));
            mo93849f(c.mo93835a());
        }
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
        C58490gz gzVar = new C58490gz(4);
        for (Account account : accountArr) {
            gzVar.mo55429h(account.name, C58528ij.m90008H(C103802j.values()));
        }
        mo93850g();
        C103809q c = C103810r.m171792c();
        ((C103764a) c).f288938a = gzVar.mo55427f(false);
        mo93849f(c.mo93835a());
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C103809q c = C103810r.m171792c();
        C58526ih b = c.mo93836b();
        for (C103803k kVar : C103803k.values()) {
            if (C58832aw.m90831a(str, kVar.f289043k)) {
                b.mo55373c(kVar);
            }
        }
        C58490gz gzVar = new C58490gz(4);
        if (str.startsWith("speaker_model_") || str.startsWith("voiceEverywhereEnabled")) {
            for (String h : ((C86054o) this.f288994l.mo27525b()).mo79685s()) {
                gzVar.mo55429h(h, C58528ij.m90011K(C103802j.TEXT_DEPENDENT_MODEL, C103802j.VOICE_EVERYWHERE));
            }
        }
        if (str.startsWith("opa_preferred_languages:")) {
            gzVar.mo55429h(str.substring(24), new C58759qy(C103802j.ASSISTANT_LANGUAGE));
        }
        if (str.startsWith(C90507o.f253020j)) {
            gzVar.mo55429h(str.substring(21), new C58759qy(C103802j.SCREEN_CONTEXT_OPT_IN_ASSISTANT));
        }
        ((C103764a) c).f288938a = gzVar.mo55427f(false);
        mo93849f(c.mo93835a());
        for (C103789aj ajVar : C103789aj.values()) {
            if (str.startsWith(ajVar.f289005e)) {
                this.f288995m.mo28212l("[NGA] Sync UDC bits to PDS", new C103782ac(this));
                return;
            }
        }
    }
}
