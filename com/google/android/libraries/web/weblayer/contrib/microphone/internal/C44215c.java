package com.google.android.libraries.web.weblayer.contrib.microphone.internal;

import android.webkit.ValueCallback;
import com.google.android.libraries.search.p2904c.C37641gt;
import com.google.android.libraries.search.p2904c.C37643gv;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.microphone.internal.c */
/* compiled from: PG */
public final class C44215c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ValueCallback f114997a;

    public C44215c(ValueCallback valueCallback) {
        this.f114997a = valueCallback;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C44217e.f115002a.mo56226d()).mo56382g(th)).mo56372aa(54182)).mo56386p("Failed to intercept audio.");
        this.f114997a.onReceiveValue(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int a = C37643gv.m66610a(((C37641gt) obj).f100011b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1 || i == 2) {
            this.f114997a.onReceiveValue(true);
        } else {
            this.f114997a.onReceiveValue(false);
        }
    }
}
