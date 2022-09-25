package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.state.iq */
/* compiled from: PG */
final class C87149iq implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C22869e f235475a;

    public C87149iq(C22869e eVar) {
        this.f235475a = eVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        ((C59052c) ((C59052c) ((C59052c) C87151is.f235477a.mo56226d()).mo56382g(th)).mo56372aa(9061)).mo56386p("previous VoiceSearch completed with exception");
        this.f235475a.run();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f235475a.run();
    }
}
