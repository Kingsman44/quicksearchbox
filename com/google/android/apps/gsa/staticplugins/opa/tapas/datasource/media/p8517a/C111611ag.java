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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.ag */
/* compiled from: PG */
public final class C111611ag extends C111626p {

    /* renamed from: a */
    public static final C59071e f310358a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.ag");

    /* renamed from: e */
    private static final ComponentName f310359e = new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.mediabrowser.MusicBrowserService");

    /* renamed from: b */
    public final MediaBrowserCompat f310360b;

    /* renamed from: f */
    private final C111623m f310361f;

    public C111611ag(Context context, C22871g gVar) {
        super(gVar);
        C19559g.m37304c();
        C111623m mVar = new C111623m();
        this.f310361f = mVar;
        this.f310360b = new MediaBrowserCompat(context, f310359e, mVar, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo99194a() {
        C58838bb.m90883r(this.f310360b.mo805i());
        SettableFuture settableFuture = new SettableFuture();
        this.f310360b.mo803g(this.f310360b.mo799c(), new C111607ac(this, settableFuture));
        return settableFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo99195b(String str) {
        C58838bb.m90883r(this.f310360b.mo805i());
        SettableFuture settableFuture = new SettableFuture();
        C58976aa aaVar = C58975e.f156826a;
        this.f310360b.mo802f(str, new Bundle(), new C111610af(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo99196c() {
        return this.f310361f.f310378c;
    }

    /* renamed from: d */
    public final void mo99197d() {
        this.f310360b.mo800d();
    }

    /* renamed from: e */
    public final void mo99198e() {
        this.f310360b.mo801e();
    }
}
