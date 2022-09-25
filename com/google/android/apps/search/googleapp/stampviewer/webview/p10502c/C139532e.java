package com.google.android.apps.search.googleapp.stampviewer.webview.p10502c;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.c.e */
/* compiled from: PG */
public final class C139532e extends C139535h {

    /* renamed from: a */
    public final C139529b f379364a;

    /* renamed from: b */
    public final C139392b f379365b;

    /* renamed from: c */
    public final AccountId f379366c;

    /* renamed from: d */
    public final C139795f f379367d;

    /* renamed from: e */
    public final C28306ab f379368e;

    public C139532e(C139529b bVar, AccountId accountId, C139392b bVar2, C139795f fVar, C28306ab abVar) {
        this.f379364a = bVar;
        this.f379366c = accountId;
        this.f379367d = fVar;
        this.f379365b = bVar2;
        this.f379368e = abVar;
    }

    /* renamed from: a */
    public final String mo115037a() {
        C56610b bVar = this.f379365b.f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        String host = Uri.parse(bVar.f151143b).getHost();
        if (host == null) {
            host = BuildConfig.FLAVOR;
        }
        return host.startsWith("www.") ? host.substring(4) : host;
    }
}
