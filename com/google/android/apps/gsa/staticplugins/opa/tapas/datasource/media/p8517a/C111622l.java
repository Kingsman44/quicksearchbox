package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.l */
/* compiled from: PG */
public final class C111622l extends C111626p {

    /* renamed from: a */
    public static final C59071e f310374a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.l");

    /* renamed from: e */
    private static final ComponentName f310375e = new ComponentName("com.google.android.music", "com.google.android.music.browse.MediaBrowserService");

    /* renamed from: b */
    public final MediaBrowserCompat f310376b;

    /* renamed from: f */
    private final C111623m f310377f;

    public C111622l(Context context, C22871g gVar) {
        super(gVar);
        C19559g.m37304c();
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.service.media.extra.SUGGESTED", true);
        C111623m mVar = new C111623m();
        this.f310377f = mVar;
        this.f310376b = new MediaBrowserCompat(context, f310375e, mVar, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo99194a() {
        C58838bb.m90883r(this.f310376b.mo805i());
        SettableFuture settableFuture = new SettableFuture();
        this.f310376b.mo803g(this.f310376b.mo799c(), new C111616f(this, settableFuture));
        return settableFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo99195b(String str) {
        C58838bb.m90883r(this.f310376b.mo805i());
        SettableFuture settableFuture = new SettableFuture();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.music.EXTRA_SEARCH_RESULT_LIMIT", 5);
        C58976aa aaVar = C58975e.f156826a;
        this.f310376b.mo802f(str, bundle, new C111620j(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo99196c() {
        return this.f310377f.f310378c;
    }

    /* renamed from: d */
    public final void mo99197d() {
        this.f310376b.mo800d();
    }

    /* renamed from: e */
    public final void mo99198e() {
        this.f310376b.mo801e();
    }
}
