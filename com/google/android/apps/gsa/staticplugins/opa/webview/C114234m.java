package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.net.Uri;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.m */
/* compiled from: PG */
public final /* synthetic */ class C114234m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114235n f316769a;

    /* renamed from: b */
    public final /* synthetic */ Uri f316770b;

    /* renamed from: c */
    public final /* synthetic */ Uri f316771c;

    /* renamed from: d */
    public final /* synthetic */ Query f316772d;

    public /* synthetic */ C114234m(C114235n nVar, Uri uri, Uri uri2, Query query) {
        this.f316769a = nVar;
        this.f316770b = uri;
        this.f316771c = uri2;
        this.f316772d = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114235n nVar = this.f316769a;
        Uri uri = this.f316770b;
        Uri uri2 = this.f316771c;
        Query query = this.f316772d;
        ((C59052c) ((C59052c) ((C59052c) C114235n.f316773a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(28776)).mo56386p("Failed to get AdShield signals and append to url.");
        nVar.mo101271a(uri, uri2, query);
    }
}
