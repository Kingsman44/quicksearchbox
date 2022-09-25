package com.google.android.apps.gsa.staticplugins.p7686co.p7693g;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.gcoreclient.p1780n.p1781a.C21585a;
import com.google.android.libraries.gcoreclient.p1780n.p1781a.C21586b;
import com.google.android.libraries.gcoreclient.p1809y.p1810a.C21742c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.dynamiclinks.C61175a;
import com.google.firebase.dynamiclinks.C61176b;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.g.a */
/* compiled from: PG */
public final /* synthetic */ class C98313a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f274443a;

    public /* synthetic */ C98313a(String str) {
        this.f274443a = str;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f274443a;
        Void voidR = (Void) obj;
        C61175a a = C21586b.m40709a().f59963a.mo57737a();
        Bundle bundle = new Bundle();
        bundle.putString("ibi", "com.google.GoogleMobile");
        C61176b bVar = new C61176b(bundle);
        a.mo57736b(Uri.parse(str));
        if ("search.app.goo.gl".matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || "search.app.goo.gl".matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
            a.f165515a.putString("domain", "search.app.goo.gl");
            a.f165515a.putString("domainUriPrefix", "https://search.app.goo.gl");
            a.f165516b.putAll(bVar.f165518a);
            C21742c cVar = new C21742c(a.mo57735a(), C21585a.f59962a);
            SettableFuture settableFuture = new SettableFuture();
            cVar.mo27082c(new C98314b(settableFuture));
            cVar.mo27080a(new C98315c(settableFuture));
            return settableFuture;
        }
        throw new IllegalArgumentException("Use setDomainUriPrefix() instead, setDynamicLinkDomain() is only applicable for *.page.link and *.app.goo.gl domains.");
    }
}
