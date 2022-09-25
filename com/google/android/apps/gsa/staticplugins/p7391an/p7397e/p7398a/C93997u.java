package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.u */
/* compiled from: PG */
public final /* synthetic */ class C93997u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ LogoView f262520a;

    public /* synthetic */ C93997u(LogoView logoView) {
        this.f262520a = logoView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        LogoView logoView = this.f262520a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            logoView.f62997d = (Bitmap) axVar.mo56107c();
            logoView.mo28226f();
            if (logoView.f62998e > 0) {
                logoView.invalidate();
            }
            logoView.mo28225e(6, true);
        }
    }
}
