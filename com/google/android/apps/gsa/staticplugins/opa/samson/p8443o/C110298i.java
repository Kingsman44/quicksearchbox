package com.google.android.apps.gsa.staticplugins.opa.samson.p8443o;

import android.accounts.Account;
import android.content.SharedPreferences;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110417d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.o.i */
/* compiled from: PG */
public final class C110298i implements SharedPreferences.OnSharedPreferenceChangeListener, C73798aa {

    /* renamed from: a */
    public static final C59071e f307409a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.o.i");

    /* renamed from: b */
    public final C110305p f307410b;

    /* renamed from: c */
    final C2333ah f307411c = new C110297h(this);

    /* renamed from: d */
    public final C2332ag f307412d = new C2332ag();

    /* renamed from: e */
    public final C68214a f307413e;

    /* renamed from: f */
    public volatile String f307414f;

    /* renamed from: g */
    private final C110308s f307415g;

    /* renamed from: h */
    private final C68214a f307416h;

    /* renamed from: i */
    private final C22871g f307417i;

    /* renamed from: j */
    private final C22871g f307418j;

    /* renamed from: k */
    private final C110417d f307419k;

    /* renamed from: l */
    private volatile String f307420l;

    public C110298i(C110308s sVar, C68214a aVar, C22871g gVar, C22871g gVar2, C110305p pVar, C68214a aVar2, C110417d dVar) {
        this.f307415g = sVar;
        this.f307416h = aVar;
        this.f307417i = gVar;
        this.f307418j = gVar2;
        this.f307410b = pVar;
        this.f307413e = aVar2;
        this.f307419k = dVar;
        gVar2.mo28212l("setting initial value", new C110293d(this));
    }

    /* renamed from: a */
    public final int mo65277a() {
        if (mo65282f()) {
            return 2;
        }
        z zVar = (z) this.f307412d.mo3842a();
        return (zVar == null || zVar == z.a) ? 0 : 1;
    }

    /* renamed from: b */
    public final LiveData mo65278b() {
        return this.f307412d;
    }

    /* renamed from: c */
    public final String mo65279c() {
        return this.f307414f;
    }

    /* renamed from: d */
    public final String mo65280d() {
        return this.f307420l;
    }

    /* renamed from: e */
    public final void mo65281e() {
        this.f307418j.mo28211k(this.f307417i.mo28209i(this.f307418j.mo28207g("cif", new C110294e(this)), "fdr", new C110295f(this)), "pdif", new C110296g(this));
        ((C86338r) this.f307413e.mo27525b()).registerOnSharedPreferenceChangeListener(this);
    }

    /* renamed from: f */
    public final boolean mo65282f() {
        return this.f307412d.mo3842a() == z.d;
    }

    /* renamed from: g */
    public final void mo98546g(C110299j jVar) {
        C59104x b = f307409a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CDIImpl");
        ((C59052c) ((C59052c) b).mo56372aa(25975)).mo56386p("onRowFetched");
        this.f307418j.mo28212l("observer.ou", new C110292c(this, jVar));
    }

    /* renamed from: h */
    public final void mo98547h() {
        this.f307418j.mo28212l("observer.odi", new C110291b(this));
    }

    /* renamed from: i */
    public final void mo98548i(C110299j jVar) {
        if (jVar == null) {
            C59104x b = f307409a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CDIImpl");
            ((C59052c) ((C59052c) b).mo56372aa(25982)).mo56386p("onStateChanged but null, is disconnect");
            mo98547h();
            return;
        }
        this.f307414f = jVar.mo98542c();
        this.f307420l = this.f307414f;
        if (this.f307414f == null) {
            this.f307412d.mo5708l(z.c);
            C59104x b2 = f307409a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "CDIImpl");
            ((C59052c) ((C59052c) b2).mo56372aa(25981)).mo56386p("onStateChanged id null, wait..");
            return;
        }
        String str = this.f307414f;
        Account a = ((C86054o) this.f307416h.mo27525b()).mo79668a();
        if (a == null || !this.f307415g.mo98555c(a, str)) {
            this.f307412d.mo5708l(z.e);
            C59104x b3 = f307409a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "CDIImpl");
            ((C59052c) ((C59052c) b3).mo56372aa(25980)).mo56386p("onStateChanged but cs u");
        } else if (jVar.mo98540a() == 1) {
            this.f307412d.mo5708l(z.d);
            C59104x b4 = f307409a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "CDIImpl");
            ((C59052c) ((C59052c) b4).mo56372aa(25979)).mo56386p("onStateChanged cs t");
        } else if (jVar.mo98540a() == 0) {
            this.f307412d.mo5708l(z.f);
            C59104x b5 = f307409a.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "CDIImpl");
            ((C59052c) ((C59052c) b5).mo56372aa(25978)).mo56386p("onStateChanged cs e");
        } else {
            this.f307412d.mo5708l(z.c);
            C59104x b6 = f307409a.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "CDIImpl");
            ((C59052c) ((C59052c) b6).mo56372aa(25977)).mo56386p("onStateChanged cs wait...");
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String a = this.f307419k.mo98653a();
        if (a != null && str != null && str.startsWith(a)) {
            C59104x b = f307409a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CDIImpl");
            ((C59052c) ((C59052c) b).mo56372aa(25976)).mo56386p("on pref changed");
            C110299j jVar = (C110299j) this.f307410b.f307435h.mo3842a();
            if (jVar != null && jVar.mo98541b() == 1) {
                mo98548i(jVar);
            }
        }
    }
}
