package com.google.android.apps.search.googleapp.silkpane;

import android.net.Uri;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.j */
/* compiled from: PG */
public final /* synthetic */ class C139288j implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ SilkPaneBlockedUrlObserver f378846a;

    public /* synthetic */ C139288j(SilkPaneBlockedUrlObserver silkPaneBlockedUrlObserver) {
        this.f378846a = silkPaneBlockedUrlObserver;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        SilkPaneBlockedUrlObserver silkPaneBlockedUrlObserver = this.f378846a;
        silkPaneBlockedUrlObserver.f378798a.mo115250a(Uri.parse(lVar.f113296b), C139823j.f380066m);
    }
}
