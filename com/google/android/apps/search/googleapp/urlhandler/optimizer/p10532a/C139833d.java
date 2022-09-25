package com.google.android.apps.search.googleapp.urlhandler.optimizer.p10532a;

import android.net.Uri;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.optimizer.a.d */
/* compiled from: PG */
public final /* synthetic */ class C139833d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C139835f f380093a;

    /* renamed from: b */
    public final /* synthetic */ Uri f380094b;

    public /* synthetic */ C139833d(C139835f fVar, Uri uri) {
        this.f380093a = fVar;
        this.f380094b = uri;
    }

    public final C60870cx apply(Object obj) {
        C139835f fVar = this.f380093a;
        Uri uri = this.f380094b;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        return C47633f.m84733g(fVar.f380096a.mo111384b()).mo51516i(C139830a.f380090a, fVar.f380097b).mo51516i(new C139832c(uri), fVar.f380097b);
    }
}
