package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84511b;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4552o.C60494rz;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.q */
/* compiled from: PG */
public final /* synthetic */ class C99925q implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279549a;

    /* renamed from: b */
    public final /* synthetic */ Uri f279550b;

    public /* synthetic */ C99925q(C99908ah ahVar, Uri uri) {
        this.f279549a = ahVar;
        this.f279550b = uri;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99908ah ahVar = this.f279549a;
        Uri uri = this.f279550b;
        Exception exc = (Exception) obj;
        C84510a aVar = ahVar.f279489j;
        C84511b bVar = (C84511b) C84512c.f230001h.createBuilder();
        C60494rz rzVar = C60494rz.SILKY_TAB;
        bVar.copyOnWrite();
        C84512c cVar = (C84512c) bVar.instance;
        cVar.f230004b = rzVar.f163762v;
        cVar.f230003a |= 1;
        aVar.mo78216a(uri, (C84512c) bVar.build());
    }
}
