package com.google.android.apps.gsa.speech.hotword.p7285c;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7045k.C89794ab;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92422b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import dagger.C68214a;
import java.util.Collection;
import org.json.JSONObject;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.d */
/* compiled from: PG */
public final class C92371d {

    /* renamed from: f */
    private static final C59071e f257555f = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.c.d");

    /* renamed from: a */
    public boolean f257556a;

    /* renamed from: b */
    public boolean f257557b;

    /* renamed from: c */
    public C58833ax f257558c = C58836b.f156633a;

    /* renamed from: d */
    public Collection f257559d = C58733pz.f156496a;

    /* renamed from: e */
    public C92422b f257560e;

    /* renamed from: g */
    private final SharedPreferences f257561g;

    /* renamed from: h */
    private final C68214a f257562h;

    /* renamed from: i */
    private final C86124t f257563i;

    /* renamed from: j */
    private final ConcurrentHashMap f257564j = new ConcurrentHashMap();

    public C92371d(SharedPreferences sharedPreferences, C68214a aVar, C86124t tVar) {
        this.f257561g = sharedPreferences;
        this.f257562h = aVar;
        this.f257563i = tVar;
    }

    /* renamed from: a */
    public final C58833ax mo87020a() {
        return this.f257558c.mo56106b(C92355a.f257489a);
    }

    /* renamed from: b */
    public final String mo87021b() {
        String string = this.f257561g.getString("enrollment_device_locale", (String) null);
        C58976aa aaVar = C58975e.f156826a;
        return string == null ? ((C89994f) this.f257562h.mo27525b()).mo83863Z() : string;
    }

    /* renamed from: c */
    public final String mo87022c() {
        return this.f257561g.getString("unicorn_enrollment_child_display_name", BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public final String mo87023d() {
        return this.f257561g.getString("unicorn_enrollment_child_gender", "other");
    }

    /* renamed from: e */
    public final Collection mo87024e() {
        C58480gp e = C58485gu.m89837e();
        for (l b : this.f257559d) {
            e.mo55395g(b.b());
        }
        return e.mo55394f();
    }

    /* renamed from: f */
    public final synchronized void mo87025f(C92362c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        for (C92360b a : this.f257564j.values()) {
            a.mo64728a(cVar);
        }
    }

    /* renamed from: g */
    public final synchronized void mo87026g(C92362c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        for (C92360b b : this.f257564j.values()) {
            b.mo64729b(cVar);
        }
    }

    /* renamed from: h */
    public final synchronized void mo87027h(String str, C92360b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f257564j.put(str, bVar);
    }

    /* renamed from: i */
    public final void mo87028i() {
        synchronized (this) {
            this.f257564j.clear();
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f257557b = false;
        this.f257559d = C58733pz.f156496a;
    }

    /* renamed from: j */
    public final void mo87029j() {
        this.f257558c = C58836b.f156633a;
        mo87031l(BuildConfig.FLAVOR);
        mo87032m(BuildConfig.FLAVOR);
    }

    /* renamed from: k */
    public final void mo87030k(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f257561g.edit().putString("enrollment_device_locale", str).apply();
    }

    /* renamed from: l */
    public final void mo87031l(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f257561g.edit().putString("unicorn_enrollment_child_display_name", str).apply();
    }

    /* renamed from: m */
    public final void mo87032m(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f257561g.edit().putString("unicorn_enrollment_child_gender", str).apply();
    }

    /* renamed from: n */
    public final synchronized void mo87033n(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        this.f257564j.remove(str);
    }

    /* renamed from: o */
    public final boolean mo87034o() {
        for (l lVar : this.f257559d) {
            if (lVar != null) {
                C89824t tVar = lVar.a;
                if (tVar == null) {
                    return false;
                }
                C89794ab c = tVar.mo83665c();
                if (c != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    if (c.f243038c && c.f243042g && c.f243044i) {
                        return true;
                    }
                }
                int k = tVar.mo83663a().mo83657k();
                C58976aa aaVar2 = C58975e.f156826a;
                if (k == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo87035p(C89824t tVar) {
        JSONObject jSONObject;
        if (tVar == null) {
            return false;
        }
        C89794ab c = tVar.mo83665c();
        C58976aa aaVar = C58975e.f156826a;
        if (c != null && (jSONObject = c.f243043h) != null && jSONObject.optBoolean(this.f257563i.mo79758x(C90082eg.f249897aM), false)) {
            return true;
        }
        C59104x d = f257555f.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MultiDvcEnrollAdapter");
        ((C59052c) ((C59052c) d).mo56372aa(12548)).mo56386p("eurekaInfo is null or device info is null or not capable.");
        return tVar.mo83663a().mo83653h();
    }
}
