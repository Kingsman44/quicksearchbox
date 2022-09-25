package com.google.android.apps.gsa.staticplugins.settings;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.assistant.settings.shared.ad;
import com.google.android.apps.gsa.assistant.shared.bl;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.c */
/* compiled from: PG */
public final class C117311c implements SharedPreferences.OnSharedPreferenceChangeListener, bl, C86109e, C86091a, ad {

    /* renamed from: a */
    public static final C59071e f325648a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.settings.c");

    /* renamed from: b */
    public final PackageManager f325649b;

    /* renamed from: c */
    public final ComponentName f325650c;

    /* renamed from: d */
    public final C117314f f325651d;

    /* renamed from: e */
    private final C22871g f325652e;

    public C117311c(SharedPreferences sharedPreferences, PackageManager packageManager, ComponentName componentName, C22871g gVar, C117314f fVar) {
        this.f325649b = packageManager;
        this.f325650c = componentName;
        this.f325652e = gVar;
        this.f325651d = fVar;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        mo103255e();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo70819b(C86124t tVar) {
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        mo103255e();
    }

    /* renamed from: d */
    public final void mo103254d(String str) {
        mo103255e();
    }

    /* renamed from: e */
    public final void mo103255e() {
        this.f325652e.mo28212l("[Settings] UpdateDynamicSettingsState", new C117310b(this));
    }

    /* renamed from: jM */
    public final void mo103256jM(boolean z) {
        mo103255e();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("selected_search_language") || str.equals("opa_enabled")) {
            mo103255e();
        }
    }
}
