package com.google.android.libraries.web.contrib.p3388h;

import android.view.View;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.web.contrib.h.n */
/* compiled from: PG */
final class C43622n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C43624p f113861a;

    /* renamed from: b */
    final /* synthetic */ C2164c f113862b;

    public C43622n(C43624p pVar, C2164c cVar) {
        this.f113861a = pVar;
        this.f113862b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C43626r.f113870a.mo56226d()).mo56382g(th)).mo56372aa(54109)).mo56386p("Failed use PixelCopy#request. The window may not have a backing surface");
        View view = this.f113861a.f113864a;
        if (view != null) {
            this.f113862b.mo5437b(C43626r.m76983a(view));
        } else {
            this.f113862b.mo5439d(th);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
    }
}
