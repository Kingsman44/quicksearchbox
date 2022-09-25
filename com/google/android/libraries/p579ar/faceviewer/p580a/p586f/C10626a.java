package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import android.util.Base64;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.youtube.p5162a.p5163a.C65999p;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.a */
/* compiled from: PG */
final class C10626a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C65999p f35502a;

    /* renamed from: b */
    final /* synthetic */ C10627b f35503b;

    public C10626a(C10627b bVar, C65999p pVar) {
        this.f35503b = bVar;
        this.f35502a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C10627b.f35504a.mo56225c()).mo56382g(th)).mo56372aa(42293)).mo56386p("Error sending message to web.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f35503b.f35505b.mo18673i(Base64.encodeToString(this.f35502a.toByteArray(), 2));
    }
}
