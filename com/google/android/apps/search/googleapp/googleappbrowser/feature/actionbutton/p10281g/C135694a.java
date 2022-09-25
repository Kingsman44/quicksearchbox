package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10281g;

import android.app.Activity;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.g.a */
/* compiled from: PG */
public final class C135694a implements C43541a {

    /* renamed from: a */
    private final Activity f369621a;

    /* renamed from: b */
    private final C139866a f369622b;

    public C135694a(Activity activity, C139866a aVar) {
        this.f369621a = activity;
        this.f369622b = aVar;
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.googleapp_browser_actionbutton_settings;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 90170;
    }

    /* renamed from: c */
    public final CharSequence mo46596c() {
        return this.f369621a.getResources().getString(R.string.gab_actionbutton_settings);
    }

    /* renamed from: d */
    public final void mo46597d() {
        this.f369622b.mo115320a(C139873i.BROWSER_PAGE_LINK, true);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo46598e() {
        return true;
    }
}
