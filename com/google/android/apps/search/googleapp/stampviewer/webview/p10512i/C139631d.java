package com.google.android.apps.search.googleapp.stampviewer.webview.p10512i;

import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.i.d */
/* compiled from: PG */
public final class C139631d {

    /* renamed from: a */
    public final C56610b f379563a;

    /* renamed from: b */
    public final Fragment f379564b;

    /* renamed from: c */
    public final C28306ab f379565c;

    public C139631d(C28306ab abVar, Fragment fragment, C139392b bVar) {
        this.f379565c = abVar;
        C56610b bVar2 = bVar.f379032b;
        this.f379563a = bVar2 == null ? C56610b.f151140k : bVar2;
        this.f379564b = fragment;
    }

    /* renamed from: a */
    public final String mo115115a() {
        String host = Uri.parse(this.f379563a.f151143b).getHost();
        if (host == null) {
            host = BuildConfig.FLAVOR;
        }
        return host.startsWith("www.") ? host.substring(4) : host;
    }
}
