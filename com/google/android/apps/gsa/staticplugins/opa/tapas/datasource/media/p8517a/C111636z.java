package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.z */
/* compiled from: PG */
public final class C111636z extends C111626p {

    /* renamed from: a */
    public static final C59071e f310397a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.z");

    /* renamed from: f */
    private static final ComponentName f310398f = new ComponentName("com.spotify.music", "com.spotify.music.libs.mediabrowserservice.SpotifyMediaBrowserService");

    /* renamed from: b */
    public final Map f310399b = new ConcurrentHashMap();

    /* renamed from: e */
    public final MediaBrowserCompat f310400e;

    /* renamed from: g */
    private final C111623m f310401g;

    public C111636z(Context context, C22871g gVar) {
        super(gVar);
        C19559g.m37304c();
        C111623m mVar = new C111623m();
        this.f310401g = mVar;
        this.f310400e = new MediaBrowserCompat(context, f310398f, mVar, (Bundle) null);
        C90875ai.m148465b(new C111628r(this), mVar.f310378c, gVar, "cache playable media items when connected to media browser").mo85223a(C111629s.f310389a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo99194a() {
        C58838bb.m90883r(this.f310400e.mo805i());
        SettableFuture settableFuture = new SettableFuture();
        this.f310400e.mo803g(this.f310400e.mo799c(), new C111635y(this, settableFuture));
        return settableFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo99195b(String str) {
        C58838bb.m90883r(this.f310400e.mo805i());
        SettableFuture settableFuture = new SettableFuture();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (Map.Entry entry : this.f310399b.entrySet()) {
                if (((String) entry.getKey()).contains(str)) {
                    arrayList.add((MediaBrowserCompat.MediaItem) entry.getValue());
                }
            }
        }
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d((C58485gu) Collection.EL.stream(arrayList).map(new C111627q(this)).limit(3).collect(C58370cn.f155946a))));
        settableFuture.mo57356n(p.mo100091a());
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo99196c() {
        return this.f310401g.f310378c;
    }

    /* renamed from: d */
    public final void mo99197d() {
        this.f310400e.mo800d();
    }

    /* renamed from: e */
    public final void mo99198e() {
        this.f310400e.mo801e();
    }
}
