package com.google.android.apps.search.googleapp.search.srp.external;

import android.net.Uri;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.external.f */
/* compiled from: PG */
public final class C137833f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C137835h f374991a;

    public C137833f(C137835h hVar) {
        this.f374991a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) this.f374991a.f374997c.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41043));
        cVar.mo56386p("Failed to resolve URL.");
        C137830c.m224074b(this.f374991a.f374998d);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Uri uri = (Uri) obj;
    }
}
