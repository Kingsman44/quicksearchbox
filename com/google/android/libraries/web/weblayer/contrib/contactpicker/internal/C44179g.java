package com.google.android.libraries.web.weblayer.contrib.contactpicker.internal;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.g */
/* compiled from: PG */
public final class C44179g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ValueCallback f114938a;

    public C44179g(ValueCallback valueCallback) {
        this.f114938a = valueCallback;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C44180h.f114939a.mo56226d()).mo56382g(th)).mo56372aa(54178)).mo56386p("Failed to load user's avatar image.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f114938a.onReceiveValue((Bitmap) obj);
    }
}
