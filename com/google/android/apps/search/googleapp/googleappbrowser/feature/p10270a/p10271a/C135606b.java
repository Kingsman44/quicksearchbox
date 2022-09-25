package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a;

import android.content.Context;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.b */
/* compiled from: PG */
public final class C135606b implements C43448h {

    /* renamed from: a */
    private static final C59071e f369388a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.b");

    /* renamed from: b */
    private final C43446f f369389b;

    /* renamed from: c */
    private final Context f369390c;

    /* renamed from: d */
    private final C0260w f369391d;

    public C135606b(C43446f fVar, Context context, Fragment fragment) {
        this.f369389b = fVar;
        this.f369390c = context;
        this.f369391d = (C0260w) fragment;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.googleapp_browser_contextmenu_open_in_new_tab;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 146647;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f369390c.getResources().getString(R.string.googleapp_browser_contextmenu_open_in_new_tab_title);
    }

    /* renamed from: d */
    public final void mo46522d() {
        if (this.f369389b.f113503d.isEmpty()) {
            ((C59052c) ((C59052c) f369388a.mo56226d()).mo56372aa(40595)).mo56386p("Link URL is empty");
        } else {
            C47393f.m84235f(new C135589a(this.f369389b.f113503d), this.f369391d);
        }
    }
}
