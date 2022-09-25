package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ek */
/* compiled from: PG */
final class C145339ek extends C145381fz {

    /* renamed from: a */
    static final Pair f392848a = new Pair(BuildConfig.FLAVOR, 0L);

    /* renamed from: b */
    public SharedPreferences f392849b;

    /* renamed from: c */
    public C145337ei f392850c;

    /* renamed from: d */
    public final C145336eh f392851d = new C145336eh(this, "first_open_time", 0);

    /* renamed from: e */
    public final C145336eh f392852e = new C145336eh(this, "app_install_time", 0);

    /* renamed from: f */
    public final C145338ej f392853f = new C145338ej(this, "app_instance_id");

    /* renamed from: g */
    public String f392854g;

    /* renamed from: h */
    public boolean f392855h;

    /* renamed from: i */
    public long f392856i;

    /* renamed from: j */
    public final C145336eh f392857j = new C145336eh(this, "session_timeout", 1800000);

    /* renamed from: k */
    public final C145334ef f392858k = new C145334ef(this, "start_new_session", true);

    /* renamed from: l */
    public final C145338ej f392859l = new C145338ej(this, "non_personalized_ads");

    /* renamed from: m */
    public final C145334ef f392860m = new C145334ef(this, "allow_remote_dynamite", false);

    /* renamed from: n */
    public final C145336eh f392861n = new C145336eh(this, "last_pause_time", 0);

    /* renamed from: o */
    public boolean f392862o;

    /* renamed from: p */
    public final C145334ef f392863p = new C145334ef(this, "app_backgrounded", false);

    /* renamed from: q */
    public final C145334ef f392864q = new C145334ef(this, "deep_link_retrieval_complete", false);

    /* renamed from: r */
    public final C145336eh f392865r = new C145336eh(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: s */
    public final C145338ej f392866s = new C145338ej(this, "firebase_feature_rollouts");

    /* renamed from: t */
    public final C145338ej f392867t = new C145338ej(this, "deferred_attribution_cache");

    /* renamed from: u */
    public final C145336eh f392868u = new C145336eh(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: v */
    public final C145335eg f392869v = new C145335eg(this);

    public C145339ek(C145361ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SharedPreferences mo120921a() {
        mo120904g();
        mo121002k();
        C143919bh.m233958a(this.f392849b);
        return this.f392849b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final void mo120922at() {
        SharedPreferences sharedPreferences = this.f393011w.f392931a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f392849b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f392862o = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f392849b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        C145222ab abVar = this.f393011w.f392937g;
        this.f392850c = new C145337ei(this, Math.max(0, ((Long) C145313dl.f392737c.mo120854a((Object) null)).longValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo120834b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C145224ad mo120923c() {
        mo120904g();
        return C145224ad.m235920b(mo120921a().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Boolean mo120924d() {
        mo120904g();
        if (mo120921a().contains("measurement_enabled")) {
            return Boolean.valueOf(mo120921a().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo120925f(Boolean bool) {
        mo120904g();
        SharedPreferences.Editor edit = mo120921a().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo120926h(boolean z) {
        mo120904g();
        this.f393011w.mo120965ar().f392803k.mo120895b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo120921a().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo120927i(long j) {
        C145336eh ehVar = this.f392857j;
        ehVar.mo120915a();
        long j2 = ehVar.f392834a;
        C145336eh ehVar2 = this.f392861n;
        ehVar2.mo120915a();
        return j - j2 > ehVar2.f392834a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo120928j(int i) {
        return C145224ad.m235922g(i, mo120921a().getInt("consent_source", 100));
    }
}
