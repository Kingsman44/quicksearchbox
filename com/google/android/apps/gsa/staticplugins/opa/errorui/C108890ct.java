package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p6968aa.C89036bg;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ct */
/* compiled from: PG */
public final class C108890ct extends C83907bm implements C89036bg {

    /* renamed from: e */
    public static final /* synthetic */ int f302752e = 0;

    /* renamed from: b */
    public C89037bh f302753b;

    /* renamed from: c */
    public C90929bz f302754c;

    /* renamed from: d */
    public C68214a f302755d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo17963e(C89062r rVar) {
        if (rVar.mo83040a()) {
            this.f302754c.mo85151p(new C108889cs(this, "onConnectivityChanged"));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.no_network_error, (ViewGroup) null);
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108888cr(this)));
        return legacyOpaStandardPage;
    }

    public final void onPause() {
        super.onPause();
        this.f302753b.mo27383i();
    }

    public final void onResume() {
        super.onResume();
        this.f302753b.mo27382h(this);
        ((av) this.f302755d.mo27525b()).e(new C108889cs(this, "onLanguagePackInitialized"));
    }
}
